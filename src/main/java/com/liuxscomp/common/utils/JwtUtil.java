package com.liuxscomp.common.utils;

import com.liuxscomp.common.constant.Globaldefine;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtil {
    /**
     * 由字符串生成加密key
     * @return
     */
    public static SecretKey generalKey(){

        String stringKey = Globaldefine.jwt.JWT_SECRET;
        byte[] encodedKey = Base64.decodeBase64(stringKey);
        SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
        return key;
    }

    /**
     * 创建jwt
     * @param id
     * @param subject
     * @param ttlMillis
     * @return
     * @throws Exception
     */
    public static String createJWT(String id, String subject, long ttlMillis) throws Exception {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        SecretKey key = generalKey();
        Map<String,Object> map = new HashMap<>();
        String refreshJWT = createRefreshJWT(id,subject,Globaldefine.jwt.JWT_REFRESH_TTL);
        map.put("rt",refreshJWT);
        JwtBuilder builder = Jwts.builder()
                .setHeaderParam("typ","JWT")
                .setClaims(map)
                .setId(id)
                .setIssuedAt(now)
                .setSubject(subject)
                .signWith(signatureAlgorithm, key);
        if (ttlMillis >= 0) {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }
        return builder.compact();
    }

    /**
     * 创建刷新token
     * @param id tokenid
     * @param ttlMillis 有效时间
     * @return
     * @throws Exception
     */
    public static String createRefreshJWT(String id,String subject,long ttlMillis) throws Exception {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        SecretKey key = generalKey();
        Map<String,Object> map = new HashMap<>();
        JwtBuilder builder = Jwts.builder()
                .setHeaderParam("typ","JWT")
                .setId(id)
                .setIssuedAt(now)
                .setSubject(subject)
                .signWith(signatureAlgorithm, key);
        if (ttlMillis >= 0) {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }
        return builder.compact();
    }

    /**
     * 解密jwt
     * @param jwt
     * @return
     * @throws Exception
     */
    public static Claims parseJWT(String jwt) throws Exception{
        SecretKey key = generalKey();
        Claims claims = Jwts.parser()
                .setSigningKey(key)
                .parseClaimsJws(jwt).getBody();
        return claims;
    }

    /**
     * 获取用户ID
     * @return
     * @throws Exception
     */
    public static Long getUserId(String token) throws Exception{
        SecretKey key = generalKey();
        Claims claims = Jwts.parser()
                .setSigningKey(key)
                .parseClaimsJws(token).getBody();
        String userInfo = claims.getSubject();
        Map<String,String> usreMap = JsonUtil.getObjectFromJson(userInfo,Map.class);
        String userId = usreMap.get("userId");
        return Long.valueOf(userId);
    }

    /**
     * 获取用户信息
     * @param token
     * @return
     * @throws Exception
     */
    public static Map getUserInfo(String token) throws Exception{
        SecretKey key = generalKey();
        Claims claims = Jwts.parser()
                .setSigningKey(key)
                .parseClaimsJws(token).getBody();
        String userInfo = claims.getSubject();
        Map<String,String> userMap = JsonUtil.getObjectFromJson(userInfo,Map.class);
        return userMap;
    }

}

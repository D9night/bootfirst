package com.liuxscomp.service;

import com.liuxscomp.bo.UserOrganizationPlatformBo;

import java.util.List;

public interface UserOrganizationPlatformService {

    /**
     * 根据platformId、organizationId、isDisable查找账号
     *
     * @return
     */
    List<UserOrganizationPlatformBo> findUser(Long platformId, Long organizationId, Boolean isDisable);

    /**
     * 新增
     */
    void save(UserOrganizationPlatformBo userOrganizationPlatformBo);

    /**
     * 限制登录/启用某平台上的某账号
     *
     * @param userId
     * @param platformId
     * @param isDisable  true-限制登录  false-启用
     */
    void setDisableUserInPlatform(Long userId, Long platformId, boolean isDisable);

    /**
     * 解绑某机构的某账号在某平台的登录功能
     *
     * @param userId         用户id
     * @param organizationId 机构id
     * @param platformId     平台id
     */
    void setDisableUser(long userId, Long organizationId, Long platformId);

    /**
     * 设置该机构是否能够访问某平台
     *
     * @param organizationId
     * @param platformId
     * @param isDisable      0-启用 1-禁用
     */
    void setOrganizationDisable(long organizationId, Long platformId, int isDisable);

    /**
     * 根据平台id获取列表
     * @param platformId 平台id
     * @param ids 用户id集合
     * @param pager 分页参数
     * @return
     */
    //Pager findByPlatFormId(long platformId,List<Long> ids,Pager pager);

    /**
     * 根据平台id，用户id，原组织id更新组织id
     * @param platformId 平台id
     * @param oldOrganizationId 原组织id
     * @param newOrganizationId 新组织id
     * @param userId 用户id
     */
    void updateOrganizationId(long platformId,long oldOrganizationId,long newOrganizationId,long userId);

    /**
     * 根据平台id，用户id，组织id和是否禁用查询记录
     * @param platformId
     * @param organizationId
     * @param userId
     * @param isDisable
     * @return
     */
    UserOrganizationPlatformBo findByPlatformIdAndUserIdAndOrganizationIdAndIsDIsable(long platformId,long organizationId,long userId,boolean isDisable);

    List<UserOrganizationPlatformBo> findAvailableByPlatformIdAndUserId(Long platformId, Long userId);

    List<UserOrganizationPlatformBo> findAvailableByUserId(Long userId);

    //Pager findAvailableUserByPlatformIdAndOrganizationId(Long platformId, Long organizationId,Pager pager);
}

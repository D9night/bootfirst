package com.liuxscomp.service.impl;

import com.liuxscomp.bo.UserOrganizationPlatformBo;
import com.liuxscomp.service.UserOrganizationPlatformService;

import java.util.List;

public class UserOrganizationPlatformServiceImpl implements UserOrganizationPlatformService {
    /**
     * 根据platformId、organizationId、isDisable查找账号
     *
     * @param platformId
     * @param organizationId
     * @param isDisable
     * @return
     */
    @Override
    public List<UserOrganizationPlatformBo> findUser(Long platformId, Long organizationId, Boolean isDisable) {
        return null;
    }

    /**
     * 新增
     *
     * @param userOrganizationPlatformBo
     */
    @Override
    public void save(UserOrganizationPlatformBo userOrganizationPlatformBo) {

    }

    /**
     * 限制登录/启用某平台上的某账号
     *
     * @param userId
     * @param platformId
     * @param isDisable  true-限制登录  false-启用
     */
    @Override
    public void setDisableUserInPlatform(Long userId, Long platformId, boolean isDisable) {

    }

    /**
     * 解绑某机构的某账号在某平台的登录功能
     *
     * @param userId         用户id
     * @param organizationId 机构id
     * @param platformId     平台id
     */
    @Override
    public void setDisableUser(long userId, Long organizationId, Long platformId) {

    }

    /**
     * 设置该机构是否能够访问某平台
     *
     * @param organizationId
     * @param platformId
     * @param isDisable      0-启用 1-禁用
     */
    @Override
    public void setOrganizationDisable(long organizationId, Long platformId, int isDisable) {

    }

    /**
     * 根据平台id，用户id，原组织id更新组织id
     *
     * @param platformId        平台id
     * @param oldOrganizationId 原组织id
     * @param newOrganizationId 新组织id
     * @param userId            用户id
     */
    @Override
    public void updateOrganizationId(long platformId, long oldOrganizationId, long newOrganizationId, long userId) {

    }

    /**
     * 根据平台id，用户id，组织id和是否禁用查询记录
     *
     * @param platformId
     * @param organizationId
     * @param userId
     * @param isDisable
     * @return
     */
    @Override
    public UserOrganizationPlatformBo findByPlatformIdAndUserIdAndOrganizationIdAndIsDIsable(long platformId, long organizationId, long userId, boolean isDisable) {
        return null;
    }

    @Override
    public List<UserOrganizationPlatformBo> findAvailableByPlatformIdAndUserId(Long platformId, Long userId) {
        return null;
    }

    @Override
    public List<UserOrganizationPlatformBo> findAvailableByUserId(Long userId) {
        return null;
    }
}

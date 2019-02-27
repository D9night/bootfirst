package com.liuxscomp.bo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class UserOrganizationPlatformBo implements Serializable {
    private Long userId;
    private Long organizationId;
    private Long platformId;
    // /true-启用  false-禁用
    private Boolean isDisable;

    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
}

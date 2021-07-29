package com.lzw.bean.result;

/**
 * @author: lzw
 * @date: 21/7/29 - 07 - 29 - 21:53
 * @description: com.lzw.bean.result
 * @version: 1.0
 */
public class Permission {
    private String permissionId;

    @Override
    public String toString() {
        return "Permission{" +
                "permissionId='" + permissionId + '\'' +
                '}';
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public Permission() {
    }

    public Permission(String permissionId) {
        this.permissionId = permissionId;
    }
}

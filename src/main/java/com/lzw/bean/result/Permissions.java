package com.lzw.bean.result;

import java.util.List;

/**
 * @author: lzw
 * @date: 21/7/29 - 07 - 29 - 21:55
 * @description: com.lzw.bean.result
 * @version: 1.0
 */
public class Permissions {
    private List<Permission> permissions;

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Permissions{" +
                "permissions=" + permissions +
                '}';
    }
}

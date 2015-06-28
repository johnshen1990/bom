package com.xishi.bom.entity.sys;

/**
 * Created by john on 15/6/1.
 */
public class Permission {
    //主键
    private Long id;
    //权限标识
    private String permissionToken;
    //资源路径
    private String permissionUrl;
    //权限描述
    private String permissionDesc;
    private Boolean available = Boolean.FALSE; //是否可用,如果不可用将不会添加给用户

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermissionToken() {
        return permissionToken;
    }

    public void setPermissionToken(String permissionToken) {
        this.permissionToken = permissionToken;
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }

    public String getPermissionDesc() {
        return permissionDesc;
    }

    public void setPermissionDesc(String permissionDesc) {
        this.permissionDesc = permissionDesc;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}

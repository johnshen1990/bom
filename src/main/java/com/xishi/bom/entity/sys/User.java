package com.xishi.bom.entity.sys;

/**
 * Created by john on 15/5/26.
 */
public class User {
    private Long id;
    private String username;
    private String password;
    private String salt;
    private Boolean locked = Boolean.FALSE;

    public String getCredentialsSalt(){
        return username + salt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }
}

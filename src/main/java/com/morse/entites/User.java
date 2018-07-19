package com.morse.entites;

import java.io.Serializable;

import java.util.Date;

/**
 * (WP_USERS)
 *
 * @author cheng
 * @version 1.0.0 2016-11-29
 */
public class User implements Serializable {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 4466639410342392443L;

    private String id;

    private String userLogin;

    private String userPass;

    private String userNicename;

    private String userEmail;

    private String userUrl;

    private Date userRegistered;

    private String userActivationKey;

    private Integer userStatus;

    private String displayName;


    /**
     * 获取
     *
     * @return
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getUserLogin() {
        return this.userLogin;
    }

    /**
     * 设置
     *
     * @param userLogin
     */
    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getUserPass() {
        return this.userPass;
    }

    /**
     * 设置
     *
     * @param userPass
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getUserNicename() {
        return this.userNicename;
    }

    /**
     * 设置
     *
     * @param userNicename
     */
    public void setUserNicename(String userNicename) {
        this.userNicename = userNicename;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getUserEmail() {
        return this.userEmail;
    }

    /**
     * 设置
     *
     * @param userEmail
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getUserUrl() {
        return this.userUrl;
    }

    /**
     * 设置
     *
     * @param userUrl
     */
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    /**
     * 获取
     *
     * @return
     */
    public Date getUserRegistered() {
        return this.userRegistered;
    }

    /**
     * 设置
     *
     * @param userRegistered
     */
    public void setUserRegistered(Date userRegistered) {
        this.userRegistered = userRegistered;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getUserActivationKey() {
        return this.userActivationKey;
    }

    /**
     * 设置
     *
     * @param userActivationKey
     */
    public void setUserActivationKey(String userActivationKey) {
        this.userActivationKey = userActivationKey;
    }

    /**
     * 获取
     *
     * @return
     */
    public Integer getUserStatus() {
        return this.userStatus;
    }

    /**
     * 设置
     *
     * @param userStatus
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * 设置
     *
     * @param displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userLogin='" + userLogin + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userNicename='" + userNicename + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userUrl='" + userUrl + '\'' +
                ", userRegistered=" + userRegistered +
                ", userActivationKey='" + userActivationKey + '\'' +
                ", userStatus=" + userStatus +
                ", displayName='" + displayName + '\'' +
                '}';
    }
}
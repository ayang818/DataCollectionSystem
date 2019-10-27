package com.ayang818.honor.datacollection.model;

import java.util.Date;

public class Admin {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.id
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.username
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.password
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.token
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.gmt_create
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.gmt_modified
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.type
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    private Byte type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.id
     *
     * @return the value of admin_info.id
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.id
     *
     * @param id the value for admin_info.id
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.username
     *
     * @return the value of admin_info.username
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.username
     *
     * @param username the value for admin_info.username
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.password
     *
     * @return the value of admin_info.password
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.password
     *
     * @param password the value for admin_info.password
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.token
     *
     * @return the value of admin_info.token
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.token
     *
     * @param token the value for admin_info.token
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.gmt_create
     *
     * @return the value of admin_info.gmt_create
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.gmt_create
     *
     * @param gmtCreate the value for admin_info.gmt_create
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.gmt_modified
     *
     * @return the value of admin_info.gmt_modified
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.gmt_modified
     *
     * @param gmtModified the value for admin_info.gmt_modified
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.type
     *
     * @return the value of admin_info.type
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.type
     *
     * @param type the value for admin_info.type
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    public void setType(Byte type) {
        this.type = type;
    }
}
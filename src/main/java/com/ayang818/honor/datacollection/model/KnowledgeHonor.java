package com.ayang818.honor.datacollection.model;

import java.util.Date;

public class KnowledgeHonor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_honor.id
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_honor.student_name
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    private String studentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_honor.school_number
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    private Integer schoolNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_honor.pass
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    private Byte pass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_honor.teacher_id
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    private Long teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_honor.teacher_name
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    private String teacherName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_honor.honor_type
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    private String honorType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_honor.honor_name
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    private String honorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_honor.register_number
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    private String registerNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_honor.authorization_status
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    private String authorizationStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_honor.prove
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    private String prove;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_honor.gmt_create
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_honor.gmt_modified
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_honor.id
     *
     * @return the value of knowledge_honor.id
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_honor.id
     *
     * @param id the value for knowledge_honor.id
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_honor.student_name
     *
     * @return the value of knowledge_honor.student_name
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_honor.student_name
     *
     * @param studentName the value for knowledge_honor.student_name
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_honor.school_number
     *
     * @return the value of knowledge_honor.school_number
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public Integer getSchoolNumber() {
        return schoolNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_honor.school_number
     *
     * @param schoolNumber the value for knowledge_honor.school_number
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public void setSchoolNumber(Integer schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_honor.pass
     *
     * @return the value of knowledge_honor.pass
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public Byte getPass() {
        return pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_honor.pass
     *
     * @param pass the value for knowledge_honor.pass
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public void setPass(Byte pass) {
        this.pass = pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_honor.teacher_id
     *
     * @return the value of knowledge_honor.teacher_id
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_honor.teacher_id
     *
     * @param teacherId the value for knowledge_honor.teacher_id
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_honor.teacher_name
     *
     * @return the value of knowledge_honor.teacher_name
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_honor.teacher_name
     *
     * @param teacherName the value for knowledge_honor.teacher_name
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_honor.honor_type
     *
     * @return the value of knowledge_honor.honor_type
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public String getHonorType() {
        return honorType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_honor.honor_type
     *
     * @param honorType the value for knowledge_honor.honor_type
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public void setHonorType(String honorType) {
        this.honorType = honorType == null ? null : honorType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_honor.honor_name
     *
     * @return the value of knowledge_honor.honor_name
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public String getHonorName() {
        return honorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_honor.honor_name
     *
     * @param honorName the value for knowledge_honor.honor_name
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public void setHonorName(String honorName) {
        this.honorName = honorName == null ? null : honorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_honor.register_number
     *
     * @return the value of knowledge_honor.register_number
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public String getRegisterNumber() {
        return registerNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_honor.register_number
     *
     * @param registerNumber the value for knowledge_honor.register_number
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber == null ? null : registerNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_honor.authorization_status
     *
     * @return the value of knowledge_honor.authorization_status
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public String getAuthorizationStatus() {
        return authorizationStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_honor.authorization_status
     *
     * @param authorizationStatus the value for knowledge_honor.authorization_status
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public void setAuthorizationStatus(String authorizationStatus) {
        this.authorizationStatus = authorizationStatus == null ? null : authorizationStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_honor.prove
     *
     * @return the value of knowledge_honor.prove
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public String getProve() {
        return prove;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_honor.prove
     *
     * @param prove the value for knowledge_honor.prove
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public void setProve(String prove) {
        this.prove = prove == null ? null : prove.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_honor.gmt_create
     *
     * @return the value of knowledge_honor.gmt_create
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_honor.gmt_create
     *
     * @param gmtCreate the value for knowledge_honor.gmt_create
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_honor.gmt_modified
     *
     * @return the value of knowledge_honor.gmt_modified
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_honor.gmt_modified
     *
     * @param gmtModified the value for knowledge_honor.gmt_modified
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
package com.ayang818.honor.datacollection.model;

import java.util.Date;

public class AbilityHonor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ability_honor.id
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ability_honor.student_name
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    private String studentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ability_honor.school_number
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    private Integer schoolNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ability_honor.pass
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    private Byte pass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ability_honor.teacher_id
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    private Long teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ability_honor.teacher_name
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    private Integer teacherName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ability_honor.ability_type
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    private Long abilityType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ability_honor.gmt_create
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ability_honor.gmt_modified
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ability_honor.prove
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    private String prove;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ability_honor.id
     *
     * @return the value of ability_honor.id
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ability_honor.id
     *
     * @param id the value for ability_honor.id
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ability_honor.student_name
     *
     * @return the value of ability_honor.student_name
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ability_honor.student_name
     *
     * @param studentName the value for ability_honor.student_name
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ability_honor.school_number
     *
     * @return the value of ability_honor.school_number
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public Integer getSchoolNumber() {
        return schoolNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ability_honor.school_number
     *
     * @param schoolNumber the value for ability_honor.school_number
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public void setSchoolNumber(Integer schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ability_honor.pass
     *
     * @return the value of ability_honor.pass
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public Byte getPass() {
        return pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ability_honor.pass
     *
     * @param pass the value for ability_honor.pass
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public void setPass(Byte pass) {
        this.pass = pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ability_honor.teacher_id
     *
     * @return the value of ability_honor.teacher_id
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ability_honor.teacher_id
     *
     * @param teacherId the value for ability_honor.teacher_id
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ability_honor.teacher_name
     *
     * @return the value of ability_honor.teacher_name
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public Integer getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ability_honor.teacher_name
     *
     * @param teacherName the value for ability_honor.teacher_name
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public void setTeacherName(Integer teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ability_honor.ability_type
     *
     * @return the value of ability_honor.ability_type
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public Long getAbilityType() {
        return abilityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ability_honor.ability_type
     *
     * @param abilityType the value for ability_honor.ability_type
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public void setAbilityType(Long abilityType) {
        this.abilityType = abilityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ability_honor.gmt_create
     *
     * @return the value of ability_honor.gmt_create
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ability_honor.gmt_create
     *
     * @param gmtCreate the value for ability_honor.gmt_create
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ability_honor.gmt_modified
     *
     * @return the value of ability_honor.gmt_modified
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ability_honor.gmt_modified
     *
     * @param gmtModified the value for ability_honor.gmt_modified
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ability_honor.prove
     *
     * @return the value of ability_honor.prove
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public String getProve() {
        return prove;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ability_honor.prove
     *
     * @param prove the value for ability_honor.prove
     *
     * @mbg.generated Sun Oct 27 13:22:14 GMT+08:00 2019
     */
    public void setProve(String prove) {
        this.prove = prove == null ? null : prove.trim();
    }
}
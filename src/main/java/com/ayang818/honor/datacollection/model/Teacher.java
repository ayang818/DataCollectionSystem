package com.ayang818.honor.datacollection.model;

public class Teacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.id
     *
     * @mbg.generated Thu Oct 24 18:23:45 GMT+08:00 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.name
     *
     * @mbg.generated Thu Oct 24 18:23:45 GMT+08:00 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.student_num
     *
     * @mbg.generated Thu Oct 24 18:23:45 GMT+08:00 2019
     */
    private Integer studentNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.id
     *
     * @return the value of teacher_info.id
     *
     * @mbg.generated Thu Oct 24 18:23:45 GMT+08:00 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.id
     *
     * @param id the value for teacher_info.id
     *
     * @mbg.generated Thu Oct 24 18:23:45 GMT+08:00 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.name
     *
     * @return the value of teacher_info.name
     *
     * @mbg.generated Thu Oct 24 18:23:45 GMT+08:00 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.name
     *
     * @param name the value for teacher_info.name
     *
     * @mbg.generated Thu Oct 24 18:23:45 GMT+08:00 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.student_num
     *
     * @return the value of teacher_info.student_num
     *
     * @mbg.generated Thu Oct 24 18:23:45 GMT+08:00 2019
     */
    public Integer getStudentNum() {
        return studentNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.student_num
     *
     * @param studentNum the value for teacher_info.student_num
     *
     * @mbg.generated Thu Oct 24 18:23:45 GMT+08:00 2019
     */
    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }
}
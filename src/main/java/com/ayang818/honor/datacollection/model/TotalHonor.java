package com.ayang818.honor.datacollection.model;

public class TotalHonor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statistics_honor.id
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statistics_honor.student_name
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    private String studentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statistics_honor.school_number
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    private Integer schoolNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statistics_honor.type
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statistics_honor.honor_name
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    private String honorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statistics_honor.pass
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    private Byte pass;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statistics_honor.id
     *
     * @return the value of statistics_honor.id
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statistics_honor.id
     *
     * @param id the value for statistics_honor.id
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statistics_honor.student_name
     *
     * @return the value of statistics_honor.student_name
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statistics_honor.student_name
     *
     * @param studentName the value for statistics_honor.student_name
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statistics_honor.school_number
     *
     * @return the value of statistics_honor.school_number
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    public Integer getSchoolNumber() {
        return schoolNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statistics_honor.school_number
     *
     * @param schoolNumber the value for statistics_honor.school_number
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    public void setSchoolNumber(Integer schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statistics_honor.type
     *
     * @return the value of statistics_honor.type
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statistics_honor.type
     *
     * @param type the value for statistics_honor.type
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statistics_honor.honor_name
     *
     * @return the value of statistics_honor.honor_name
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    public String getHonorName() {
        return honorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statistics_honor.honor_name
     *
     * @param honorName the value for statistics_honor.honor_name
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    public void setHonorName(String honorName) {
        this.honorName = honorName == null ? null : honorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statistics_honor.pass
     *
     * @return the value of statistics_honor.pass
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    public Byte getPass() {
        return pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statistics_honor.pass
     *
     * @param pass the value for statistics_honor.pass
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    public void setPass(Byte pass) {
        this.pass = pass;
    }
}
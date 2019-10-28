package com.ayang818.honor.datacollection.model;

public class Student {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.id
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_name
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    private String studentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.school_number
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    private Integer schoolNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.sex
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    private Byte sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.phone_number
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    private Integer phoneNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.major
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    private String major;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.class_number
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    private Integer classNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.preview_major
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    private String previewMajor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.first_teacher
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    private String firstTeacher;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.second_teacher
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    private String secondTeacher;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.id
     *
     * @return the value of student_info.id
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.id
     *
     * @param id the value for student_info.id
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_name
     *
     * @return the value of student_info.student_name
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_name
     *
     * @param studentName the value for student_info.student_name
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.school_number
     *
     * @return the value of student_info.school_number
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public Integer getSchoolNumber() {
        return schoolNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.school_number
     *
     * @param schoolNumber the value for student_info.school_number
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public void setSchoolNumber(Integer schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.sex
     *
     * @return the value of student_info.sex
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.sex
     *
     * @param sex the value for student_info.sex
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.phone_number
     *
     * @return the value of student_info.phone_number
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.phone_number
     *
     * @param phoneNumber the value for student_info.phone_number
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.major
     *
     * @return the value of student_info.major
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public String getMajor() {
        return major;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.major
     *
     * @param major the value for student_info.major
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.class_number
     *
     * @return the value of student_info.class_number
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public Integer getClassNumber() {
        return classNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.class_number
     *
     * @param classNumber the value for student_info.class_number
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.preview_major
     *
     * @return the value of student_info.preview_major
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public String getPreviewMajor() {
        return previewMajor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.preview_major
     *
     * @param previewMajor the value for student_info.preview_major
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public void setPreviewMajor(String previewMajor) {
        this.previewMajor = previewMajor == null ? null : previewMajor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.first_teacher
     *
     * @return the value of student_info.first_teacher
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public String getFirstTeacher() {
        return firstTeacher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.first_teacher
     *
     * @param firstTeacher the value for student_info.first_teacher
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public void setFirstTeacher(String firstTeacher) {
        this.firstTeacher = firstTeacher == null ? null : firstTeacher.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.second_teacher
     *
     * @return the value of student_info.second_teacher
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public String getSecondTeacher() {
        return secondTeacher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.second_teacher
     *
     * @param secondTeacher the value for student_info.second_teacher
     *
     * @mbg.generated Mon Oct 28 23:48:18 CST 2019
     */
    public void setSecondTeacher(String secondTeacher) {
        this.secondTeacher = secondTeacher == null ? null : secondTeacher.trim();
    }
}
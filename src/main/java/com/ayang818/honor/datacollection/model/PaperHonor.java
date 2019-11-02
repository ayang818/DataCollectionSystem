package com.ayang818.honor.datacollection.model;

import java.util.Date;

public class PaperHonor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_honor.id
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_honor.student_name
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    private String studentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_honor.school_number
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    private Integer schoolNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_honor.paper_title
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    private String paperTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_honor.paper_level
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    private String paperLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_honor.publish_year
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    private Integer publishYear;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_honor.publication_name
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    private String publicationName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_honor.author_name
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    private String authorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_honor.author_order
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    private Integer authorOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_honor.prove
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    private String prove;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_honor.teacher_name
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    private String teacherName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_honor.teacher_id
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    private Long teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_honor.pass
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    private Byte pass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_honor.gmt_create
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_honor.gmt_modified
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_honor.id
     *
     * @return the value of paper_honor.id
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_honor.id
     *
     * @param id the value for paper_honor.id
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_honor.student_name
     *
     * @return the value of paper_honor.student_name
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_honor.student_name
     *
     * @param studentName the value for paper_honor.student_name
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_honor.school_number
     *
     * @return the value of paper_honor.school_number
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public Integer getSchoolNumber() {
        return schoolNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_honor.school_number
     *
     * @param schoolNumber the value for paper_honor.school_number
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public void setSchoolNumber(Integer schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_honor.paper_title
     *
     * @return the value of paper_honor.paper_title
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public String getPaperTitle() {
        return paperTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_honor.paper_title
     *
     * @param paperTitle the value for paper_honor.paper_title
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle == null ? null : paperTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_honor.paper_level
     *
     * @return the value of paper_honor.paper_level
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public String getPaperLevel() {
        return paperLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_honor.paper_level
     *
     * @param paperLevel the value for paper_honor.paper_level
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public void setPaperLevel(String paperLevel) {
        this.paperLevel = paperLevel == null ? null : paperLevel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_honor.publish_year
     *
     * @return the value of paper_honor.publish_year
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public Integer getPublishYear() {
        return publishYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_honor.publish_year
     *
     * @param publishYear the value for paper_honor.publish_year
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_honor.publication_name
     *
     * @return the value of paper_honor.publication_name
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public String getPublicationName() {
        return publicationName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_honor.publication_name
     *
     * @param publicationName the value for paper_honor.publication_name
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName == null ? null : publicationName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_honor.author_name
     *
     * @return the value of paper_honor.author_name
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_honor.author_name
     *
     * @param authorName the value for paper_honor.author_name
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_honor.author_order
     *
     * @return the value of paper_honor.author_order
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public Integer getAuthorOrder() {
        return authorOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_honor.author_order
     *
     * @param authorOrder the value for paper_honor.author_order
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public void setAuthorOrder(Integer authorOrder) {
        this.authorOrder = authorOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_honor.prove
     *
     * @return the value of paper_honor.prove
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public String getProve() {
        return prove;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_honor.prove
     *
     * @param prove the value for paper_honor.prove
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public void setProve(String prove) {
        this.prove = prove == null ? null : prove.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_honor.teacher_name
     *
     * @return the value of paper_honor.teacher_name
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_honor.teacher_name
     *
     * @param teacherName the value for paper_honor.teacher_name
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_honor.teacher_id
     *
     * @return the value of paper_honor.teacher_id
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_honor.teacher_id
     *
     * @param teacherId the value for paper_honor.teacher_id
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_honor.pass
     *
     * @return the value of paper_honor.pass
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public Byte getPass() {
        return pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_honor.pass
     *
     * @param pass the value for paper_honor.pass
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public void setPass(Byte pass) {
        this.pass = pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_honor.gmt_create
     *
     * @return the value of paper_honor.gmt_create
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_honor.gmt_create
     *
     * @param gmtCreate the value for paper_honor.gmt_create
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_honor.gmt_modified
     *
     * @return the value of paper_honor.gmt_modified
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_honor.gmt_modified
     *
     * @param gmtModified the value for paper_honor.gmt_modified
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
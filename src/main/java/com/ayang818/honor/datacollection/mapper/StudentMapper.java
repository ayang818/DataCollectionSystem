package com.ayang818.honor.datacollection.mapper;

import com.ayang818.honor.datacollection.model.Student;
import com.ayang818.honor.datacollection.model.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated Thu Oct 24 15:56:42 GMT+08:00 2019
     */
    long countByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated Thu Oct 24 15:56:42 GMT+08:00 2019
     */
    int deleteByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated Thu Oct 24 15:56:42 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated Thu Oct 24 15:56:42 GMT+08:00 2019
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated Thu Oct 24 15:56:42 GMT+08:00 2019
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated Thu Oct 24 15:56:42 GMT+08:00 2019
     */
    List<Student> selectByExampleWithRowbounds(StudentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated Thu Oct 24 15:56:42 GMT+08:00 2019
     */
    List<Student> selectByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated Thu Oct 24 15:56:42 GMT+08:00 2019
     */
    Student selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated Thu Oct 24 15:56:42 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated Thu Oct 24 15:56:42 GMT+08:00 2019
     */
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated Thu Oct 24 15:56:42 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated Thu Oct 24 15:56:42 GMT+08:00 2019
     */
    int updateByPrimaryKey(Student record);
}
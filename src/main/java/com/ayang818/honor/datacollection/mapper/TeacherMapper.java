package com.ayang818.honor.datacollection.mapper;

import com.ayang818.honor.datacollection.model.Teacher;
import com.ayang818.honor.datacollection.model.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TeacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    long countByExample(TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    int deleteByExample(TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    int insert(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    int insertSelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    List<Teacher> selectByExampleWithRowbounds(TeacherExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    List<Teacher> selectByExample(TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    Teacher selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbg.generated Sat Nov 02 20:28:40 GMT+08:00 2019
     */
    int updateByPrimaryKey(Teacher record);
}
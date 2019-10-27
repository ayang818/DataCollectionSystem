package com.ayang818.honor.datacollection.mapper;

import com.ayang818.honor.datacollection.model.AbilityHonor;
import com.ayang818.honor.datacollection.model.AbilityHonorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AbilityHonorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability_honor
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    long countByExample(AbilityHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability_honor
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    int deleteByExample(AbilityHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability_honor
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability_honor
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    int insert(AbilityHonor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability_honor
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    int insertSelective(AbilityHonor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability_honor
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    List<AbilityHonor> selectByExampleWithRowbounds(AbilityHonorExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability_honor
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    List<AbilityHonor> selectByExample(AbilityHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability_honor
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    AbilityHonor selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability_honor
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") AbilityHonor record, @Param("example") AbilityHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability_honor
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    int updateByExample(@Param("record") AbilityHonor record, @Param("example") AbilityHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability_honor
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(AbilityHonor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability_honor
     *
     * @mbg.generated Sun Oct 27 15:50:41 GMT+08:00 2019
     */
    int updateByPrimaryKey(AbilityHonor record);
}
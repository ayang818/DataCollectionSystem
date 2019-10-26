package com.ayang818.honor.datacollection.mapper;

import com.ayang818.honor.datacollection.model.CompetitionHonor;
import com.ayang818.honor.datacollection.model.CompetitionHonorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CompetitionHonorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    long countByExample(CompetitionHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    int deleteByExample(CompetitionHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    int insert(CompetitionHonor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    int insertSelective(CompetitionHonor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    List<CompetitionHonor> selectByExampleWithRowbounds(CompetitionHonorExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    List<CompetitionHonor> selectByExample(CompetitionHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    CompetitionHonor selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") CompetitionHonor record, @Param("example") CompetitionHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    int updateByExample(@Param("record") CompetitionHonor record, @Param("example") CompetitionHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(CompetitionHonor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Sat Oct 26 21:23:14 GMT+08:00 2019
     */
    int updateByPrimaryKey(CompetitionHonor record);
}
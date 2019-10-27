package com.ayang818.honor.datacollection.mapper;

import com.ayang818.honor.datacollection.model.PaperHonor;
import com.ayang818.honor.datacollection.model.PaperHonorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PaperHonorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_honor
     *
     * @mbg.generated Sun Oct 27 18:28:02 GMT+08:00 2019
     */
    long countByExample(PaperHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_honor
     *
     * @mbg.generated Sun Oct 27 18:28:02 GMT+08:00 2019
     */
    int deleteByExample(PaperHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_honor
     *
     * @mbg.generated Sun Oct 27 18:28:02 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_honor
     *
     * @mbg.generated Sun Oct 27 18:28:02 GMT+08:00 2019
     */
    int insert(PaperHonor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_honor
     *
     * @mbg.generated Sun Oct 27 18:28:02 GMT+08:00 2019
     */
    int insertSelective(PaperHonor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_honor
     *
     * @mbg.generated Sun Oct 27 18:28:02 GMT+08:00 2019
     */
    List<PaperHonor> selectByExampleWithRowbounds(PaperHonorExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_honor
     *
     * @mbg.generated Sun Oct 27 18:28:02 GMT+08:00 2019
     */
    List<PaperHonor> selectByExample(PaperHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_honor
     *
     * @mbg.generated Sun Oct 27 18:28:02 GMT+08:00 2019
     */
    PaperHonor selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_honor
     *
     * @mbg.generated Sun Oct 27 18:28:02 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") PaperHonor record, @Param("example") PaperHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_honor
     *
     * @mbg.generated Sun Oct 27 18:28:02 GMT+08:00 2019
     */
    int updateByExample(@Param("record") PaperHonor record, @Param("example") PaperHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_honor
     *
     * @mbg.generated Sun Oct 27 18:28:02 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(PaperHonor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_honor
     *
     * @mbg.generated Sun Oct 27 18:28:02 GMT+08:00 2019
     */
    int updateByPrimaryKey(PaperHonor record);
}
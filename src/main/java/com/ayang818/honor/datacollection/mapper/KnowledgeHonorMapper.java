package com.ayang818.honor.datacollection.mapper;

import com.ayang818.honor.datacollection.model.KnowledgeHonor;
import com.ayang818.honor.datacollection.model.KnowledgeHonorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface KnowledgeHonorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_honor
     *
     * @mbg.generated Fri Oct 25 15:18:00 GMT+08:00 2019
     */
    long countByExample(KnowledgeHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_honor
     *
     * @mbg.generated Fri Oct 25 15:18:00 GMT+08:00 2019
     */
    int deleteByExample(KnowledgeHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_honor
     *
     * @mbg.generated Fri Oct 25 15:18:00 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_honor
     *
     * @mbg.generated Fri Oct 25 15:18:00 GMT+08:00 2019
     */
    int insert(KnowledgeHonor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_honor
     *
     * @mbg.generated Fri Oct 25 15:18:00 GMT+08:00 2019
     */
    int insertSelective(KnowledgeHonor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_honor
     *
     * @mbg.generated Fri Oct 25 15:18:00 GMT+08:00 2019
     */
    List<KnowledgeHonor> selectByExampleWithRowbounds(KnowledgeHonorExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_honor
     *
     * @mbg.generated Fri Oct 25 15:18:00 GMT+08:00 2019
     */
    List<KnowledgeHonor> selectByExample(KnowledgeHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_honor
     *
     * @mbg.generated Fri Oct 25 15:18:00 GMT+08:00 2019
     */
    KnowledgeHonor selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_honor
     *
     * @mbg.generated Fri Oct 25 15:18:00 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") KnowledgeHonor record, @Param("example") KnowledgeHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_honor
     *
     * @mbg.generated Fri Oct 25 15:18:00 GMT+08:00 2019
     */
    int updateByExample(@Param("record") KnowledgeHonor record, @Param("example") KnowledgeHonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_honor
     *
     * @mbg.generated Fri Oct 25 15:18:00 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(KnowledgeHonor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge_honor
     *
     * @mbg.generated Fri Oct 25 15:18:00 GMT+08:00 2019
     */
    int updateByPrimaryKey(KnowledgeHonor record);
}
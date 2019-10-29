package com.ayang818.honor.datacollection.mapper;

import com.ayang818.honor.datacollection.model.ClosureTable;
import com.ayang818.honor.datacollection.model.ClosureTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ClosureTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closure_table
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    long countByExample(ClosureTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closure_table
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    int deleteByExample(ClosureTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closure_table
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    int insert(ClosureTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closure_table
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    int insertSelective(ClosureTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closure_table
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    List<ClosureTable> selectByExampleWithRowbounds(ClosureTableExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closure_table
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    List<ClosureTable> selectByExample(ClosureTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closure_table
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") ClosureTable record, @Param("example") ClosureTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closure_table
     *
     * @mbg.generated Tue Oct 29 18:14:23 GMT+08:00 2019
     */
    int updateByExample(@Param("record") ClosureTable record, @Param("example") ClosureTableExample example);
}
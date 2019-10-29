package com.ayang818.honor.datacollection.mapper;

import com.ayang818.honor.datacollection.model.ClosureTable;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClosureTableExtMapper {

    @Select("select descendant from closure_table where ancestor=#{parentId} and distance=1")
    List<ClosureTable> queryDescendant(@Param("parentId") Long parentId);
}

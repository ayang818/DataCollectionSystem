package com.ayang818.honor.datacollection.mapper;

import com.ayang818.honor.datacollection.dto.honor.CompetitionSearchDTO;
import com.ayang818.honor.datacollection.model.CompetitionHonor;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CompetitionHonorExtMapper {
    void insertAndGetId(CompetitionHonor competitionHonor);

    void insertList(List<CompetitionHonor> tempList);

    List<CompetitionHonor> selectByKeyWord(CompetitionSearchDTO competitionSearchDTO);

    Long countByKeyword(String keyword);
}

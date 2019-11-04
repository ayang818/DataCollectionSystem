package com.ayang818.honor.datacollection.mapper;

import com.ayang818.honor.datacollection.model.CompetitionHonor;

import java.util.List;

public interface CompetitionHonorExtMapper {
    void insertAndGetId(CompetitionHonor competitionHonor);

    void insertList(List<CompetitionHonor> tempList);

}

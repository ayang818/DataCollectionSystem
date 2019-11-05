package com.ayang818.honor.datacollection.dto.honor;

import lombok.Data;

@Data
public class CompetitionSearchDTO {
    private String keyword;
    private Integer limit;
    private Integer offset;
}

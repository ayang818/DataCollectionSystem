package com.ayang818.honor.datacollection.dto.honor;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName PaperHonorReceiveDTO
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/27 16:22
 **/
@Data
public class PaperHonorReceiveDTO {
    private String paperTitle;
    private String paperLevel;
    private Date publishYear;
    private String authorName;
    private Integer authorOrder;
    private String teacherName;
    private String publicationName;
}

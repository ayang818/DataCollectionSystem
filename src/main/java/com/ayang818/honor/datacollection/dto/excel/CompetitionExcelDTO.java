package com.ayang818.honor.datacollection.dto.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @ClassName CompetitionExcelDTO
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/29 21:05
 **/
@Data
public class CompetitionExcelDTO {
    @ExcelProperty(value = "序号")
    private String number;

    @ExcelProperty(value = "竞赛类别")
    private String competitionType;

    @ExcelProperty("竞赛级别")
    private String competitionLevel;

    @ExcelProperty("竞赛年份")
    private String competitionYear;

    @ExcelProperty("竞赛全称")
    private String competitionTotalName;

    @ExcelProperty("组号")
    private String teamNumber;

    @ExcelProperty("姓名")
    private String studentName;

    @ExcelProperty("年级")
    private String grade;

    @ExcelProperty("学号")
    private String schoolNumber;

    @ExcelProperty("专业")
    private String major;

    @ExcelProperty("学院")
    private String college;

    @ExcelProperty("指导教师")
    private String guidanceTeacher;

    @ExcelProperty("获奖等级")
    private String honorLevel;

    @ExcelProperty("备注")
    private String message;

}

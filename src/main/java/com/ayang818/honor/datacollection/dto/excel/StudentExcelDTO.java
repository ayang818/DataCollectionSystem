package com.ayang818.honor.datacollection.dto.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @ClassName StudentExcelDTO
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 15:53
 **/
@Data
public class StudentExcelDTO {
    @ExcelProperty("姓名")
    private String name;

    @ExcelProperty("学号")
    private Integer schoolNumber;

    @ExcelProperty("性别")
    private String sex;

    @ExcelProperty("专业名称")
    private Integer phoneNumber;

    @ExcelProperty("专业名称")
    private String major;

    @ExcelProperty("行政班")
    private Integer classNumber;

    @ExcelProperty("预选专业")
    private String previewMajor;

    @ExcelProperty("导师1")
    private String firstTeacher;

    @ExcelProperty("导师2")
    private String secondTeacher;
}

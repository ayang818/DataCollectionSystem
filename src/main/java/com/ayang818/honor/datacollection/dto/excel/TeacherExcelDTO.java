package com.ayang818.honor.datacollection.dto.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @ClassName TeacherExcelDTO
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 16:46
 **/
@Data
public class TeacherExcelDTO {
    @ExcelProperty(value = "导师姓名", index = 0)
    private String name;

    @ExcelProperty(value = "学生数量", index = 1)
    private Integer studentNum;
}

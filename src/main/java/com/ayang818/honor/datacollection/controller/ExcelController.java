package com.ayang818.honor.datacollection.controller;

import com.ayang818.honor.datacollection.exception.CustomizeResponseCode;
import com.ayang818.honor.datacollection.service.ImportExcelService;
import com.ayang818.honor.datacollection.util.JSONUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @ClassName excelController
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 13:07
 **/
@RestController
public class ExcelController {

    @Autowired
    private ImportExcelService importExcelService;

    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelController.class);

    @ResponseBody
    @RequestMapping(value = "/api/excel/student", method = RequestMethod.POST)
    public String importStudentExcel(@RequestParam(value = "file") MultipartFile excelFile) throws IOException {
        importExcelService.readStudentExcelFile(excelFile);
        return JSONUtil.parseEnumToJson(CustomizeResponseCode.isSuccess);
    }

    @ResponseBody
    @RequestMapping(value = "/api/excel/teacher", method = RequestMethod.POST)
    public String importTeacherExcel(@RequestParam("file") MultipartFile excelFile) throws IOException {
        importExcelService.readTeacherExcelFile(excelFile);
        return JSONUtil.parseEnumToJson(CustomizeResponseCode.isSuccess);
    }
}

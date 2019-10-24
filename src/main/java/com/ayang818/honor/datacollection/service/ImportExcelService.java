package com.ayang818.honor.datacollection.service;

import com.alibaba.excel.EasyExcel;
import com.ayang818.honor.datacollection.controller.ExcelController;
import com.ayang818.honor.datacollection.dto.excel.StudentExcelDTO;
import com.ayang818.honor.datacollection.dto.excel.TeacherExcelDTO;
import com.ayang818.honor.datacollection.model.Teacher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * @ClassName ImportExcelService
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 13:29
 **/
@Service
public class ImportExcelService {

    @Value("${data.excel.path}")
    private String excelFolderPath;

    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelController.class);


    public void readStudentExcelFile(MultipartFile excelFile) throws IOException {
        InputStream input = excelFile.getInputStream();
        EasyExcel.read(input, StudentExcelDTO.class, new ExcelDataListener()).sheet().doRead();
    }

    public void readTeacherExcelFile(MultipartFile excelFile) throws IOException {
        InputStream input = excelFile.getInputStream();
        EasyExcel.read(input, TeacherExcelDTO.class, new ExcelDataListener()).sheet().doRead();
    }
}

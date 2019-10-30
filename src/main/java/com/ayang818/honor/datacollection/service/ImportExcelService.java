package com.ayang818.honor.datacollection.service;

import com.alibaba.excel.EasyExcel;
import com.ayang818.honor.datacollection.controller.ExcelController;
import com.ayang818.honor.datacollection.dto.excel.CompetitionExcelDTO;
import com.ayang818.honor.datacollection.dto.excel.StudentExcelDTO;
import com.ayang818.honor.datacollection.dto.excel.TeacherExcelDTO;
import com.ayang818.honor.datacollection.util.excelListener.CompetitionExcelDataListener;
import com.ayang818.honor.datacollection.util.excelListener.StudentExcelDataListener;
import com.ayang818.honor.datacollection.util.excelListener.TeacherExcelDataListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName ImportExcelService
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 13:29
 **/
@Service
public class ImportExcelService {

    @Autowired
    private StudentExcelDataListener studentExcelDataListener;

    @Autowired
    private TeacherExcelDataListener teacherExcelDataListener;

    @Autowired
    private CompetitionExcelDataListener competitionExcelDataListener;

    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelController.class);

    public void readStudentExcelFile(MultipartFile excelFile) throws IOException {
        InputStream input = excelFile.getInputStream();
        EasyExcel.read(input, StudentExcelDTO.class, studentExcelDataListener).sheet().doRead();
    }

    public void readTeacherExcelFile(MultipartFile excelFile) throws IOException {
        InputStream input = excelFile.getInputStream();
        EasyExcel.read(input, TeacherExcelDTO.class, teacherExcelDataListener).sheet().doRead();
    }

    public void readCompetitionExcelFile(MultipartFile excelFile) throws IOException {
        InputStream input = excelFile.getInputStream();
        EasyExcel.read(input, CompetitionExcelDTO.class, competitionExcelDataListener).sheet().doRead();
    }
}

package com.ayang818.honor.datacollection.util;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.ayang818.honor.datacollection.dto.excel.StudentExcelDTO;
import com.ayang818.honor.datacollection.dto.excel.TeacherExcelDTO;
import com.ayang818.honor.datacollection.model.Student;
import com.ayang818.honor.datacollection.service.StudentService;
import com.ayang818.honor.datacollection.service.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StudentExcelDataListener
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 18:50
 **/
@Component
public class StudentExcelDataListener extends AnalysisEventListener<StudentExcelDTO> {

    @Autowired
    private StudentService studentService;

    private static final Logger LOGGER = LoggerFactory.getLogger(TeacherExcelDataListener.class);
    /**
     * 每隔300条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 300;

    List<StudentExcelDTO> list = new ArrayList<>();

    @Override
    public void invoke(StudentExcelDTO data, AnalysisContext context) {
        LOGGER.info("解析到一条数据:{}", JSON.toJSONString(data));
        list.add(data);
        if (list.size() >= BATCH_COUNT) {
            saveData();
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        saveData();
        LOGGER.info("所有数据解析完成！");
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        LOGGER.info("{}条数据，开始存储数据库！", list.size());
        studentService.insertAll(list);
        LOGGER.info("存储数据库成功！");
    }
}

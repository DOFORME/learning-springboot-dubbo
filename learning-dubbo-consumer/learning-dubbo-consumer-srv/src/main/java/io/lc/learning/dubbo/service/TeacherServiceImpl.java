package io.lc.learning.dubbo.service;

import io.lc.learning.dubbo.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author lph
 */
@Slf4j
@Service
public class TeacherServiceImpl implements TeacherService {

    @Reference
    private StudentService studentService;

    @Override
    public void getStudents() {
        log.info("teacher service getStudents()");
        Student student = studentService.getById(1);
        log.info("get student id : {}", student.getId());
    }
}

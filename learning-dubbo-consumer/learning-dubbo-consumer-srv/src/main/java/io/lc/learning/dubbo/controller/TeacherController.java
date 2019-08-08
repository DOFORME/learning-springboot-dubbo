package io.lc.learning.dubbo.controller;

import io.lc.learning.dubbo.service.TeacherService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lph
 */
@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("teacher")
public class TeacherController {

    private TeacherService teacherService;

    @RequestMapping("test")
    public void test() {
        teacherService.getStudents();
    }
}

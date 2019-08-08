package io.lc.learning.dubbo.service;

import io.lc.learning.dubbo.domain.Student;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author lph
 */
@Service
@Component
public class StudentServiceImpl implements StudentService {

    @Override
    public Student getById(int id) {
        if (id == 1) {
            return new Student().setId(1).setAge(10).setName("test");
        }
        return null;
    }
}

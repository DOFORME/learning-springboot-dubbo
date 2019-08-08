package io.lc.learning.dubbo.service;

import io.lc.learning.dubbo.domain.Student;

/**
 * @author lph
 */
public interface StudentService {

    Student getById(int id);
}

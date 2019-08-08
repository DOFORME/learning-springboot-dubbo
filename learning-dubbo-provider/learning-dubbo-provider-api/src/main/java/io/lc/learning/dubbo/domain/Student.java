package io.lc.learning.dubbo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author lph
 */
@Getter
@Setter
@Accessors(chain = true)
public class Student implements Serializable {



    private Integer id;

    private String name;

    private Integer age;
}

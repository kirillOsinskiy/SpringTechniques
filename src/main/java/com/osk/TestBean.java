package com.osk;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

//@Component
@Getter
@Setter
public class TestBean {

    private String name;

    public TestBean(String name) {
        this.name = name;
    }
}

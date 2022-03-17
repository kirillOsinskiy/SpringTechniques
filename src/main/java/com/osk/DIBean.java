package com.osk;

import lombok.Getter;
import org.springframework.stereotype.Component;

//@Component
@Getter
public class DIBean {

    private final TestBean testBean;

    public DIBean(TestBean testBean) {
        this.testBean = testBean;
    }
}

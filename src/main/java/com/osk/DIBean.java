package com.osk;

import lombok.Getter;

@Getter
public class DIBean {

    private final TestBean testBean;

    public DIBean(TestBean testBean) {
        this.testBean = testBean;
    }
}

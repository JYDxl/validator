package com.github.houbb.validator.test.model;

import com.github.houbb.validator.core.annotation.constraint.Aviator;

/**
 * JSR 用户信息
 *
 * @author binbin.hou
 * @since 0.1.1
 */
public class AviatorUser {
    @Aviator("let num = long(obj.code); return num >=4 && num <=6;")
    private String code;

    @Aviator("string.length(obj.email) > 10")
    private String email;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "JsrRegisterUser{" +
                "code='" + code + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}

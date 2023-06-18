/*
 * Copyright (c)  2019. houbinbin Inc.
 * valid All rights reserved.
 */

package com.github.houbb.validator.core.annotation.constraint;

import com.github.houbb.validator.api.annotation.constraint.Constraint;
import com.github.houbb.validator.core.api.constraint.annotation.AtChinaPhoneConstraint;

import java.lang.annotation.*;

/**
 * <p> 中国手机格式校验 </p>
 *
 *
 * @author houbinbin
 * @since 0.6.0
 */
@Inherited
@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(AtChinaPhoneConstraint.class)
public @interface ChinaPhone {

    /**
     * 提示消息
     * @return 错误提示
     * @since 0.6.0
     */
    String message() default "";

    /**
     * 分组信息
     * @return 分组类
     * @since 0.6.0
     */
    Class[] group() default {};

}

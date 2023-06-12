/*
 * Copyright (c)  2019. houbinbin Inc.
 * valid All rights reserved.
 */

package com.github.houbb.validator.core.annotation.constraint;

import com.github.houbb.validator.api.annotation.constraint.Constraint;
import com.github.houbb.validator.core.api.constraint.annotation.AtSpelConstraint;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(AtSpelConstraint.class)
public @interface Spel {
    String value();

    String message() default "";

    Class[] group() default {};
}

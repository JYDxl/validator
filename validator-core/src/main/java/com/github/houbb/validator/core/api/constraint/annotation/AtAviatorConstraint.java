package com.github.houbb.validator.core.api.constraint.annotation;

import com.github.houbb.heaven.annotation.NotThreadSafe;
import com.github.houbb.validator.api.api.constraint.IConstraint;
import com.github.houbb.validator.core.annotation.constraint.Aviator;
import com.github.houbb.validator.core.api.constraint.AviatorConstraint;

@NotThreadSafe
public class AtAviatorConstraint extends AbstractAnnotationConstraint<Aviator> {
    @Override
    protected IConstraint buildConstraint(Aviator annotation) {
        return new AviatorConstraint(annotation.value());
    }
}

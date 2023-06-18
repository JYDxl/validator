package com.github.houbb.validator.core.api.constraint.annotation;

import com.github.houbb.heaven.annotation.NotThreadSafe;
import com.github.houbb.validator.api.api.constraint.IConstraint;
import com.github.houbb.validator.core.annotation.constraint.Spel;
import com.github.houbb.validator.core.api.constraint.SpelConstraint;

@NotThreadSafe
public class AtSpelConstraint extends AbstractAnnotationConstraint<Spel> {
    @Override
    protected IConstraint buildConstraint(Spel annotation) {
        return new SpelConstraint(annotation.value());
    }
}

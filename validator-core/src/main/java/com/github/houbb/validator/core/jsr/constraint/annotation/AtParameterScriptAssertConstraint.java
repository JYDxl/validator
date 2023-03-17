package com.github.houbb.validator.core.jsr.constraint.annotation;

import com.github.houbb.heaven.annotation.ThreadSafe;
import com.github.houbb.validator.api.api.constraint.IConstraint;
import com.github.houbb.validator.core.api.constraint.annotation.AbstractAnnotationConstraint;
import org.hibernate.validator.constraints.ParameterScriptAssert;

/**
 * ParameterScriptAssert 信息
 * @author binbin.hou
 * @since 0.2.0
 */
@ThreadSafe
public class AtParameterScriptAssertConstraint extends AbstractAnnotationConstraint<ParameterScriptAssert> {

    @Override
    protected IConstraint buildConstraint(ParameterScriptAssert annotation) {
        throw new UnsupportedOperationException();
    }

}

package com.github.houbb.validator.core.api.constraint;

import com.github.houbb.heaven.annotation.ThreadSafe;
import com.github.houbb.validator.api.api.constraint.IConstraintContext;
import static com.google.common.collect.ImmutableMap.of;
import static com.googlecode.aviator.AviatorEvaluator.getInstance;

//TODO 测试
@ThreadSafe
public class AviatorConstraint extends AbstractConstraint<Object> {
    private final String expression;

    public AviatorConstraint(String expression) {
        this.expression = expression;
    }

    @Override
    protected boolean pass(IConstraintContext context, Object value) {
        if (value == null) {
            return true;
        }
        return (boolean) getInstance().compile(expression).execute(of("arg", value));
    }
}

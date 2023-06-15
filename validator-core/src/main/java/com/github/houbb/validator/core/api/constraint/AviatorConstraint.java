package com.github.houbb.validator.core.api.constraint;

import com.github.houbb.heaven.annotation.ThreadSafe;
import com.github.houbb.validator.api.api.constraint.IConstraintContext;
import com.googlecode.aviator.Expression;
import static com.googlecode.aviator.AviatorEvaluator.getInstance;

@ThreadSafe
public class AviatorConstraint extends AbstractConstraint<Object> {
    private final String expressionStr;

    public AviatorConstraint(String expressionStr) {
        this.expressionStr = expressionStr;
    }

    @Override
    protected boolean pass(IConstraintContext context, Object value) {
        if (value == null) {
            return true;
        }
        Expression expression = getInstance().compile(expressionStr);
        return (boolean) expression.execute(expression.newEnv("obj", context.obj()));
    }
}

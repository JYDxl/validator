package com.github.houbb.validator.core.api.constraint;

import cn.hutool.extra.spring.SpringUtil;
import com.github.houbb.heaven.annotation.ThreadSafe;
import com.github.houbb.validator.api.api.constraint.IConstraintContext;
import com.github.houbb.validator.core.bs.ValidBs;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

//TODO 测试
@ThreadSafe
public class SpelConstraint extends AbstractConstraint<Object> {
    private static final ThreadLocal<StandardEvaluationContext> evaluationContext = ThreadLocal.withInitial(SpelConstraint::initStandardEvaluationContext);
    private final String expressionString;
    private final SpelExpressionParser expressionParser = new SpelExpressionParser();

    public SpelConstraint(String expressionString) {
        this.expressionString = expressionString;
    }

    private static StandardEvaluationContext initStandardEvaluationContext() {
        StandardEvaluationContext evaluationContext = new StandardEvaluationContext();
        evaluationContext.setBeanResolver(new BeanFactoryResolver(SpringUtil.getBeanFactory()));
        return evaluationContext;
    }

    @Override
    protected boolean pass(IConstraintContext context, Object value) {
        Expression parseExpression = expressionParser.parseExpression(expressionString);
        return Boolean.TRUE.equals(parseExpression.getValue(evaluationContext.get(), ValidBs.getValue(), Boolean.class));
    }
}

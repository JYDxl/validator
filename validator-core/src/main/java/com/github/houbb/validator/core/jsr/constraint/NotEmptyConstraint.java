package com.github.houbb.validator.core.jsr.constraint;

import cn.hutool.core.util.ArrayUtil;
import com.github.houbb.heaven.annotation.ThreadSafe;
import com.github.houbb.heaven.util.lang.StringUtil;
import com.github.houbb.validator.api.api.constraint.IConstraint;
import com.github.houbb.validator.api.api.constraint.IConstraintContext;
import com.github.houbb.validator.core.api.constraint.AbstractConstraint;
import java.util.Collection;
import java.util.Map;

/**
 * 为字符串不能为空格
 *
 * @author binbin.hou
 * @since 0.2.0
 */
@ThreadSafe
public class NotEmptyConstraint extends AbstractConstraint<Object> {

    /**
     * 唯一实例
     * @since 0.2.0
     */
    private static final IConstraint INSTANCE = new NotEmptyConstraint();

    /**
     * 获取单例示例
     * @return 示例
     * @since 0.2.0
     */
    public static IConstraint getInstance() {
        return INSTANCE;
    }

    @Override
    protected boolean pass(IConstraintContext context, Object value) {
      if (value == null) {
        return false;
      }
      if (value instanceof String) {
        return StringUtil.isNotEmpty((String) value);
      }
      if (value instanceof Collection) {
        return ((Collection) value).size() > 0;
      }
      if (value instanceof Map) {
        return ((Map) value).size() > 0;
      }
      if (ArrayUtil.isArray(value)) {
        return ArrayUtil.isNotEmpty(value);
      }
      return false;
    }

    @Override
    protected String expectValue(final IConstraintContext context) {
        return "not empty";
    }

}

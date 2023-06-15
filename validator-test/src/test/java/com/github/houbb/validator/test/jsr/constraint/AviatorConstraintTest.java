package com.github.houbb.validator.test.jsr.constraint;

import com.github.houbb.validator.api.api.result.IResult;
import com.github.houbb.validator.core.util.ValidHelper;
import com.github.houbb.validator.test.model.AviatorUser;
import org.junit.Test;

/**
 * @author binbin.hou
 * @since 0.0.3
 */
public class AviatorConstraintTest {
    @Test
    public void test() {
        AviatorUser user = new AviatorUser();
        user.setCode("5");
        user.setEmail("abc");
        IResult result = ValidHelper.failFast(user);
        System.out.println(result);
    }
}

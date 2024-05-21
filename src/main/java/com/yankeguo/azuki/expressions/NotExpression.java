package com.yankeguo.azuki.expressions;

import java.util.Map;

import com.yankeguo.azuki.AzukiException;
import com.yankeguo.azuki.WrapperExpression;

/**
 * 'not' expression
 *
 * @author Guo Y.K.
 */
public class NotExpression extends WrapperExpression {

    public NotExpression(Object object) throws AzukiException {
        super(object);
    }

    @Override
    public boolean validate(Map<String, String> map) {
        return getExpression() == null || !getExpression().validate(map);
    }

}

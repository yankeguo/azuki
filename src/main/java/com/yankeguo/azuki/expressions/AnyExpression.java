package com.yankeguo.azuki.expressions;

import java.util.Map;

import com.yankeguo.azuki.AzukiException;
import com.yankeguo.azuki.CombinationExpression;
import com.yankeguo.azuki.Expression;

/**
 * 'any' expression
 *
 * @author Guo Y.K.
 */
public class AnyExpression extends CombinationExpression {

    public AnyExpression(Object object) throws AzukiException {
        super(object);
    }

    @Override
    public boolean validate(Map<String, String> map) {
        for (Expression expression : getExpressions()) {
            if (expression.validate(map)) return true;
        }
        return false;
    }

}

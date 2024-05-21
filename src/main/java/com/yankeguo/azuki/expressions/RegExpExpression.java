package com.yankeguo.azuki.expressions;

import java.util.Map;

import com.yankeguo.azuki.AzukiException;
import com.yankeguo.azuki.EvaluationExpression;

/**
 * 'regexp' expression
 *
 * @author Guo Y.K.
 */
public class RegExpExpression extends EvaluationExpression {

    public RegExpExpression(Object object) throws AzukiException {
        super(object);
    }

    @Override
    public boolean validate(Map<String, String> map) {
        for (Map.Entry<String, String> entry : getValues().entrySet()) {
            String value = map.get(entry.getKey());
            if (value == null || !value.matches(entry.getValue())) {
                return false;
            }
        }
        return true;
    }

}

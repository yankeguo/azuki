package com.yankeguo.azuki.expressions;

import java.util.Map;

import com.yankeguo.azuki.AzukiException;
import com.yankeguo.azuki.EvaluationExpression;

/**
 * 'endsWith' expression
 *
 * @author Guo Y.K.
 */
public class EndsWithExpression extends EvaluationExpression {

    public EndsWithExpression(Object object) throws AzukiException {
        super(object);
    }

    @Override
    public boolean validate(Map<String, String> map) {
        for (Map.Entry<String, String> entry : getValues().entrySet()) {
            String value = map.get(entry.getKey());
            if (value == null || !value.endsWith(entry.getValue())) {
                return false;
            }
        }
        return true;
    }

}

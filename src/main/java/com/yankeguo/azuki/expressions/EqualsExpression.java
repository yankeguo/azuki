package com.yankeguo.azuki.expressions;

import java.util.Map;

import com.yankeguo.azuki.AzukiException;
import com.yankeguo.azuki.EvaluationExpression;

/**
 * 'equals' expression
 *
 * @author Guo Y.K.
 */
public class EqualsExpression extends EvaluationExpression {

    public EqualsExpression(Object object) throws AzukiException {
        super(object);
    }

    public boolean validate(Map<String, String> map) {
        for (Map.Entry<String, String> entry : getValues().entrySet()) {
            String value = map.get(entry.getKey());
            if (value == null || !value.equals(entry.getValue())) {
                return false;
            }
        }
        return true;
    }

}

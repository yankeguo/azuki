package com.yankeguo.azuki.expressions;

import java.util.Map;

import com.yankeguo.azuki.AzukiException;
import com.yankeguo.azuki.EvaluationExpression;

/**
 * 'equalsIgnoreCase' expression
 *
 * @author Guo Y.K.
 */
public class EqualsIgnoreCaseExpression extends EvaluationExpression {

    public EqualsIgnoreCaseExpression(Object object) throws AzukiException {
        super(object);
    }

    @Override
    public boolean validate(Map<String, String> map) {
        for (Map.Entry<String, String> entry : getValues().entrySet()) {
            String value = map.get(entry.getKey());
            if (value == null || !value.equalsIgnoreCase(entry.getValue())) {
                return false;
            }
        }
        return true;
    }

}

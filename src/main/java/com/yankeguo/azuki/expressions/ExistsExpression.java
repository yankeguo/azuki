package com.yankeguo.azuki.expressions;

import java.util.Map;

import com.yankeguo.azuki.AzukiException;
import com.yankeguo.azuki.EvaluationExpression;

/**
 * 'exists' evaluation
 *
 * @author Guo Y.K.
 */
public class ExistsExpression extends EvaluationExpression {

    public ExistsExpression(Object object) throws AzukiException {
        super(object);
    }

    @Override
    public boolean validate(Map<String, String> map) {
        for (Map.Entry<String, String> entry : getValues().entrySet()) {
            String value = map.get(entry.getKey());
            String boolValue = entry.getValue();
            if (boolValue == null
                    || boolValue.toLowerCase().startsWith("f")
                    || boolValue.toLowerCase().startsWith("n")) {
                if (value != null && !value.isEmpty()) {
                    return false;
                }
            } else {
                if (value == null
                        || value.isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

}

package com.yankeguo.azuki;

import java.util.Map;

/**
 * This is base class for expression types
 *
 * @author Guo Y.K.
 */
public interface Expression {

    /**
     * Evaluate expression on target map
     *
     * @param map target map
     * @return validation passed or not
     */
    boolean validate(Map<String, String> map);

}

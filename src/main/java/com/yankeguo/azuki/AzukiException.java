package com.yankeguo.azuki;

/**
 * This is wrapper exception for all Azuki exceptions
 *
 * @author Guo Y.K.
 */
public class AzukiException extends Exception {

    public AzukiException(String s) {
        super(s);
    }

    public AzukiException(Throwable e) {
        super(e);
    }
}

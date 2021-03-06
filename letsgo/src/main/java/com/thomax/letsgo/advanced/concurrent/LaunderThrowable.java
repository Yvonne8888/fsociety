package com.thomax.letsgo.advanced.concurrent;

/**
 * 公共异常处理
 */
public class LaunderThrowable {

    public static RuntimeException handle(Throwable t) {
        if (t instanceof RuntimeException) {
            return (RuntimeException) t;
        } else if (t instanceof Error) {
            throw (Error) t;
        } else {
            throw new IllegalStateException("not unchecked", t);
        }
    }

}

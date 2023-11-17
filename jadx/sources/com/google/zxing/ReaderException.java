package com.google.zxing;

public abstract class ReaderException extends Exception {

    /* renamed from: d */
    protected static final boolean f18135d;

    /* renamed from: e */
    protected static final StackTraceElement[] f18136e = new StackTraceElement[0];

    static {
        boolean z;
        if (System.getProperty("surefire.test.class.path") != null) {
            z = true;
        } else {
            z = false;
        }
        f18135d = z;
    }

    ReaderException() {
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    ReaderException(Throwable th) {
        super(th);
    }
}

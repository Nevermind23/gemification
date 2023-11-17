package com.google.zxing;

public final class FormatException extends ReaderException {

    /* renamed from: f */
    private static final FormatException f18133f;

    static {
        FormatException formatException = new FormatException();
        f18133f = formatException;
        formatException.setStackTrace(ReaderException.f18136e);
    }

    private FormatException() {
    }

    /* renamed from: a */
    public static FormatException m23153a() {
        return ReaderException.f18135d ? new FormatException() : f18133f;
    }

    /* renamed from: b */
    public static FormatException m23154b(Throwable th) {
        return ReaderException.f18135d ? new FormatException(th) : f18133f;
    }

    private FormatException(Throwable th) {
        super(th);
    }
}

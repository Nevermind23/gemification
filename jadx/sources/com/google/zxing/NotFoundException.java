package com.google.zxing;

public final class NotFoundException extends ReaderException {

    /* renamed from: f */
    private static final NotFoundException f18134f;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f18134f = notFoundException;
        notFoundException.setStackTrace(ReaderException.f18136e);
    }

    private NotFoundException() {
    }

    /* renamed from: a */
    public static NotFoundException m23155a() {
        return f18134f;
    }
}

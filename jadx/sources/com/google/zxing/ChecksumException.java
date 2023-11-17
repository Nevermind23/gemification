package com.google.zxing;

public final class ChecksumException extends ReaderException {

    /* renamed from: f */
    private static final ChecksumException f18132f;

    static {
        ChecksumException checksumException = new ChecksumException();
        f18132f = checksumException;
        checksumException.setStackTrace(ReaderException.f18136e);
    }

    private ChecksumException() {
    }

    /* renamed from: a */
    public static ChecksumException m23152a() {
        return ReaderException.f18135d ? new ChecksumException() : f18132f;
    }
}

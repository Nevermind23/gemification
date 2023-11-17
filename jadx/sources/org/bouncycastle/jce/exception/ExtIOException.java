package org.bouncycastle.jce.exception;

import java.io.IOException;

public class ExtIOException extends IOException {

    /* renamed from: d */
    private Throwable f98728d;

    public Throwable getCause() {
        return this.f98728d;
    }
}

package org.bouncycastle.crypto.p977io;

import java.io.IOException;

/* renamed from: org.bouncycastle.crypto.io.CipherIOException */
public class CipherIOException extends IOException {
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    private final Throwable f98717d;

    public Throwable getCause() {
        return this.f98717d;
    }
}

package org.bouncycastle.cert;

import java.io.IOException;

public class CertIOException extends IOException {

    /* renamed from: d */
    private Throwable f98703d;

    public Throwable getCause() {
        return this.f98703d;
    }
}

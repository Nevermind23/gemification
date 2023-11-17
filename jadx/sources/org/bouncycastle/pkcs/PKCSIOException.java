package org.bouncycastle.pkcs;

import java.io.IOException;

public class PKCSIOException extends IOException {

    /* renamed from: d */
    private Throwable f98736d;

    public Throwable getCause() {
        return this.f98736d;
    }
}

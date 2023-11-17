package org.bouncycastle.crypto.tls;

import java.io.IOException;

public class TlsFatalAlert extends IOException {
    private static final long serialVersionUID = 3584313123679111168L;

    /* renamed from: d */
    protected Throwable f98718d;

    public Throwable getCause() {
        return this.f98718d;
    }
}

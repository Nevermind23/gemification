package org.bouncycastle.jcajce.provider.util;

import javax.crypto.BadPaddingException;

public class BadBlockException extends BadPaddingException {

    /* renamed from: d */
    private final Throwable f98724d;

    public Throwable getCause() {
        return this.f98724d;
    }
}

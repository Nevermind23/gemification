package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.spec.InvalidKeySpecException;

public class ExtendedInvalidKeySpecException extends InvalidKeySpecException {

    /* renamed from: d */
    private Throwable f98723d;

    public Throwable getCause() {
        return this.f98723d;
    }
}

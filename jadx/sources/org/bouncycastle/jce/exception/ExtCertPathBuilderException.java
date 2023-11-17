package org.bouncycastle.jce.exception;

import java.security.cert.CertPathBuilderException;

public class ExtCertPathBuilderException extends CertPathBuilderException {

    /* renamed from: d */
    private Throwable f98725d;

    public Throwable getCause() {
        return this.f98725d;
    }
}

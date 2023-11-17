package org.bouncycastle.jce.exception;

import java.security.cert.CertPathValidatorException;

public class ExtCertPathValidatorException extends CertPathValidatorException {

    /* renamed from: d */
    private Throwable f98726d;

    public Throwable getCause() {
        return this.f98726d;
    }
}

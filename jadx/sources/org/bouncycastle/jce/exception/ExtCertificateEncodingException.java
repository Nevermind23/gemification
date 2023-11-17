package org.bouncycastle.jce.exception;

import java.security.cert.CertificateEncodingException;

public class ExtCertificateEncodingException extends CertificateEncodingException {

    /* renamed from: d */
    private Throwable f98727d;

    public Throwable getCause() {
        return this.f98727d;
    }
}

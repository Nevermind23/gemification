package org.bouncycastle.dvcs;

public class DVCSException extends Exception {
    private static final long serialVersionUID = 389345256020131488L;

    /* renamed from: d */
    private Throwable f98719d;

    public Throwable getCause() {
        return this.f98719d;
    }
}

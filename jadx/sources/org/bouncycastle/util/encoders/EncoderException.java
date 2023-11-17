package org.bouncycastle.util.encoders;

public class EncoderException extends IllegalStateException {

    /* renamed from: d */
    private Throwable f98742d;

    EncoderException(String str, Throwable th) {
        super(str);
        this.f98742d = th;
    }

    public Throwable getCause() {
        return this.f98742d;
    }
}

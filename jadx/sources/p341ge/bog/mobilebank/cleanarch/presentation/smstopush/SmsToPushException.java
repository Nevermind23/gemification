package p341ge.bog.mobilebank.cleanarch.presentation.smstopush;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.smstopush.SmsToPushException */
public final class SmsToPushException extends RuntimeException {

    /* renamed from: d */
    private final String f59401d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmsToPushException(String str) {
        super(str);
        C41536l.m120489i(str, "message");
        this.f59401d = str;
    }

    public String getMessage() {
        return this.f59401d;
    }
}

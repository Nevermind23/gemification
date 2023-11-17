package p341ge.bog.mobilebank.p2p.domain.customexceptions;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.p2p.domain.customexceptions.PhoneNumberException */
public final class PhoneNumberException extends Exception {

    /* renamed from: d */
    private final String f81712d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneNumberException(String str) {
        super(str);
        C41536l.m120489i(str, "errorText");
        this.f81712d = str;
    }

    /* renamed from: a */
    public final String mo79418a() {
        return this.f81712d;
    }
}

package p341ge.bog.mobilebank.p2p.domain.customexceptions;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.p2p.domain.customexceptions.AmountException */
public final class AmountException extends Exception {

    /* renamed from: d */
    private final String f81709d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AmountException(String str) {
        super(str);
        C41536l.m120489i(str, "errorText");
        this.f81709d = str;
    }

    /* renamed from: a */
    public final String mo79415a() {
        return this.f81709d;
    }
}

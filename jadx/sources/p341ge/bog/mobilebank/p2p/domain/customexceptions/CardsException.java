package p341ge.bog.mobilebank.p2p.domain.customexceptions;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.p2p.domain.customexceptions.CardsException */
public final class CardsException extends Exception {

    /* renamed from: d */
    private final String f81710d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardsException(String str) {
        super(str);
        C41536l.m120489i(str, "errorText");
        this.f81710d = str;
    }

    /* renamed from: a */
    public final String mo79416a() {
        return this.f81710d;
    }
}

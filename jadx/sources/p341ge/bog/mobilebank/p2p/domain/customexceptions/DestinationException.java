package p341ge.bog.mobilebank.p2p.domain.customexceptions;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.p2p.domain.customexceptions.DestinationException */
public final class DestinationException extends Exception {

    /* renamed from: d */
    private final String f81711d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DestinationException(String str) {
        super(str);
        C41536l.m120489i(str, "errorText");
        this.f81711d = str;
    }

    /* renamed from: a */
    public final String mo79417a() {
        return this.f81711d;
    }
}

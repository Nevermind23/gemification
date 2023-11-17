package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class RefreshTokenQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ RefreshTokenQuery this$0;

    public RefreshTokenQuery$variables$1$marshaller$$inlined$invoke$1(RefreshTokenQuery refreshTokenQuery) {
        this.this$0 = refreshTokenQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
        gVar.mo23291a("refreshToken", this.this$0.getRefreshToken());
    }
}

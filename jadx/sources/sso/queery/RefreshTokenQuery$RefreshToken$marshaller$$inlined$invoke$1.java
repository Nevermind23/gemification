package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.RefreshTokenQuery;

public final class RefreshTokenQuery$RefreshToken$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ RefreshTokenQuery.RefreshToken this$0;

    public RefreshTokenQuery$RefreshToken$marshaller$$inlined$invoke$1(RefreshTokenQuery.RefreshToken refreshToken) {
        this.this$0 = refreshToken;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(RefreshTokenQuery.RefreshToken.RESPONSE_FIELDS[0], this.this$0.get__typename());
        this.this$0.getFragments().marshaller().marshal(pVar);
    }
}

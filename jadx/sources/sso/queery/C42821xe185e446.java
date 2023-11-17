package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.RefreshTokenQuery;

/* renamed from: sso.queery.RefreshTokenQuery$RefreshToken$Fragments$marshaller$$inlined$invoke$1 */
public final class C42821xe185e446 implements C8122n {
    final /* synthetic */ RefreshTokenQuery.RefreshToken.Fragments this$0;

    public C42821xe185e446(RefreshTokenQuery.RefreshToken.Fragments fragments) {
        this.this$0 = fragments;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23317b(this.this$0.getToken().marshaller());
    }
}

package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.BiometricLoginQuery;

public final class BiometricLoginQuery$Login$Fragments$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ BiometricLoginQuery.Login.Fragments this$0;

    public BiometricLoginQuery$Login$Fragments$marshaller$$inlined$invoke$1(BiometricLoginQuery.Login.Fragments fragments) {
        this.this$0 = fragments;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23317b(this.this$0.getLoginInfo().marshaller());
    }
}

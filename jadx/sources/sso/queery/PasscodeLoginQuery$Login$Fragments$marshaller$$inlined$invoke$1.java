package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.PasscodeLoginQuery;

public final class PasscodeLoginQuery$Login$Fragments$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ PasscodeLoginQuery.Login.Fragments this$0;

    public PasscodeLoginQuery$Login$Fragments$marshaller$$inlined$invoke$1(PasscodeLoginQuery.Login.Fragments fragments) {
        this.this$0 = fragments;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23317b(this.this$0.getLoginInfo().marshaller());
    }
}

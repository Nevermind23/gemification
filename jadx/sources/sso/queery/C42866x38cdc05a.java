package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.SetupSecurityParametersQuery;

/* renamed from: sso.queery.SetupSecurityParametersQuery$SetupSecurityParameters$Fragments$marshaller$$inlined$invoke$1 */
public final class C42866x38cdc05a implements C8122n {
    final /* synthetic */ SetupSecurityParametersQuery.SetupSecurityParameters.Fragments this$0;

    public C42866x38cdc05a(SetupSecurityParametersQuery.SetupSecurityParameters.Fragments fragments) {
        this.this$0 = fragments;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23317b(this.this$0.getSecurityParametersInfo().marshaller());
    }
}

package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.ChooseRelatedCompanyQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42621xa5413d1e implements C8106f {
    final /* synthetic */ ChooseRelatedCompanyQuery this$0;

    public C42621xa5413d1e(ChooseRelatedCompanyQuery chooseRelatedCompanyQuery) {
        this.this$0 = chooseRelatedCompanyQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("relatedCompanyKey", this.this$0.getRelatedCompanyKey());
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
    }
}

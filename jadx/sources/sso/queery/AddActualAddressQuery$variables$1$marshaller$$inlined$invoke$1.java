package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class AddActualAddressQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ AddActualAddressQuery this$0;

    public AddActualAddressQuery$variables$1$marshaller$$inlined$invoke$1(AddActualAddressQuery addActualAddressQuery) {
        this.this$0 = addActualAddressQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
        gVar.mo23291a("country", this.this$0.getCountry());
        gVar.mo23291a("region", this.this$0.getRegion());
        gVar.mo23291a("addressLine", this.this$0.getAddressLine());
        gVar.mo23291a("copyToHome", this.this$0.getCopyToHome());
    }
}

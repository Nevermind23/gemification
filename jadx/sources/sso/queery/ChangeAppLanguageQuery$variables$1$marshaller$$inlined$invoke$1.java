package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class ChangeAppLanguageQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ ChangeAppLanguageQuery this$0;

    public ChangeAppLanguageQuery$variables$1$marshaller$$inlined$invoke$1(ChangeAppLanguageQuery changeAppLanguageQuery) {
        this.this$0 = changeAppLanguageQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("lang", this.this$0.getLang().getRawValue());
    }
}

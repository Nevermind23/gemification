package sso.queery;

import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8108g;
import sso.type.InputScaAuthElement;
import ue1.C43075l;

final class PerformScaQuery$variables$1$marshaller$1$1 extends C41537m implements C43075l {
    final /* synthetic */ PerformScaQuery this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PerformScaQuery$variables$1$marshaller$1$1(PerformScaQuery performScaQuery) {
        super(1);
        this.this$0 = performScaQuery;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8108g.C8111b) obj);
        return C41238w.f97225a;
    }

    public final void invoke(C8108g.C8111b bVar) {
        C41536l.m120489i(bVar, "listItemWriter");
        for (InputScaAuthElement inputScaAuthElement : this.this$0.getAuthElements()) {
            bVar.mo23299b(inputScaAuthElement != null ? inputScaAuthElement.marshaller() : null);
        }
    }
}

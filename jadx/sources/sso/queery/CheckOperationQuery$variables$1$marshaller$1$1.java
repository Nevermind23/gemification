package sso.queery;

import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8108g;
import sso.type.InputOperationProperty;
import ue1.C43075l;

final class CheckOperationQuery$variables$1$marshaller$1$1 extends C41537m implements C43075l {
    final /* synthetic */ CheckOperationQuery this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CheckOperationQuery$variables$1$marshaller$1$1(CheckOperationQuery checkOperationQuery) {
        super(1);
        this.this$0 = checkOperationQuery;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8108g.C8111b) obj);
        return C41238w.f97225a;
    }

    public final void invoke(C8108g.C8111b bVar) {
        C41536l.m120489i(bVar, "listItemWriter");
        for (InputOperationProperty inputOperationProperty : this.this$0.getOperationProperties()) {
            bVar.mo23299b(inputOperationProperty != null ? inputOperationProperty.marshaller() : null);
        }
    }
}

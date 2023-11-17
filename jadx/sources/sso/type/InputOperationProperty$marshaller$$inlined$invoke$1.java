package sso.type;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class InputOperationProperty$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ InputOperationProperty this$0;

    public InputOperationProperty$marshaller$$inlined$invoke$1(InputOperationProperty inputOperationProperty) {
        this.this$0 = inputOperationProperty;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        if (this.this$0.getPropertyKey().f22756b) {
            gVar.mo23291a("propertyKey", (String) this.this$0.getPropertyKey().f22755a);
        }
        if (this.this$0.getPropertyValue().f22756b) {
            gVar.mo23291a("propertyValue", (String) this.this$0.getPropertyValue().f22755a);
        }
    }
}

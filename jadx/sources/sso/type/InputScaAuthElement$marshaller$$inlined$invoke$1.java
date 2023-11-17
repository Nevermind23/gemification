package sso.type;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class InputScaAuthElement$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ InputScaAuthElement this$0;

    public InputScaAuthElement$marshaller$$inlined$invoke$1(InputScaAuthElement inputScaAuthElement) {
        this.this$0 = inputScaAuthElement;
    }

    public void marshal(C8108g gVar) {
        String str;
        C41536l.m120490j(gVar, "writer");
        if (this.this$0.getAdditionalData().f22756b) {
            gVar.mo23291a("additionalData", (String) this.this$0.getAdditionalData().f22755a);
        }
        if (this.this$0.getType().f22756b) {
            AuthElementType authElementType = (AuthElementType) this.this$0.getType().f22755a;
            if (authElementType != null) {
                str = authElementType.getRawValue();
            } else {
                str = null;
            }
            gVar.mo23291a("type", str);
        }
        if (this.this$0.getValue().f22756b) {
            gVar.mo23291a(C11755a.C11756a.f34100b, (String) this.this$0.getValue().f22755a);
        }
    }
}

package dd1;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import qa1.C27698a;
import qa1.C27700a1;

/* renamed from: dd1.v */
public final class C40614v {

    /* renamed from: a */
    private final C27700a1 f96237a;

    /* renamed from: b */
    private final C27698a f96238b;

    public C40614v(C27700a1 a1Var, C27698a aVar) {
        C41536l.m120489i(a1Var, "storage");
        C41536l.m120489i(aVar, "deviceManagementRepository");
        this.f96237a = a1Var;
        this.f96238b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m117413c(C40614v vVar, Boolean bool) {
        String str;
        C41536l.m120489i(vVar, "this$0");
        C27700a1 a1Var = vVar.f96237a;
        C41536l.m120488h(bool, "it");
        if (bool.booleanValue()) {
            str = "Y";
        } else {
            str = "N";
        }
        a1Var.mo67254n(str);
    }

    /* renamed from: b */
    public final C40734b mo94622b() {
        boolean z;
        String f = this.f96237a.mo67245f();
        String g = this.f96237a.mo67246g();
        if (f == null || C40439w.m117118v(f)) {
            z = true;
        } else {
            z = false;
        }
        if (z || g != null) {
            C40734b i = C40734b.m117918i();
            C41536l.m120488h(i, "{\n            Completable.complete()\n        }");
            return i;
        }
        C40734b y = this.f96238b.mo67237a(f).mo95084m(new C40608u(this)).mo95092y();
        C41536l.m120488h(y, "{\n            deviceMana…ignoreElement()\n        }");
        return y;
    }
}

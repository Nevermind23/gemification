package p569qc;

import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1620q0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p345ad.C9786e;
import p345ad.C9793g;
import p345ad.C9796h;
import p499lc.C16543b;
import p611tc.C17923j;
import p624uc.C18093s;
import p637vc.C18294k;
import p664xc.C18693i;

/* renamed from: qc.b */
public final class C17485b extends C1620q0.C1625c {

    /* renamed from: d */
    private final C9786e f48922d;

    /* renamed from: e */
    private final C9793g f48923e;

    /* renamed from: f */
    private final C9796h f48924f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17485b(C9786e eVar, C9793g gVar, C9796h hVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i & 2) != 0 ? null : gVar, (i & 4) != 0 ? new C9796h() : hVar);
    }

    /* renamed from: b */
    public C1613n0 mo4804b(Class cls) {
        C41536l.m120489i(cls, "modelClass");
        if (cls == C18693i.class) {
            return new C18693i(this.f48922d);
        }
        if (cls == C17923j.class) {
            return new C17923j(this.f48922d);
        }
        if (cls == C18093s.class) {
            return new C18093s(this.f48922d);
        }
        if (cls == C18294k.class) {
            C9793g gVar = this.f48923e;
            C41536l.m120486f(gVar);
            return new C18294k(gVar);
        } else if (cls == C16543b.class) {
            return new C16543b(this.f48924f);
        } else {
            return super.mo4804b(cls);
        }
    }

    public C17485b(C9786e eVar, C9793g gVar, C9796h hVar) {
        C41536l.m120489i(eVar, "api");
        C41536l.m120489i(hVar, "notificationSocket");
        this.f48922d = eVar;
        this.f48923e = gVar;
        this.f48924f = hVar;
    }
}

package p163m0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;

/* renamed from: m0.d */
public final class C7052d extends C7047a {
    public C7052d() {
        this((C7047a) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public Object mo21270a(C7047a.C7049b bVar) {
        C41536l.m120489i(bVar, "key");
        return mo21271b().get(bVar);
    }

    /* renamed from: c */
    public final void mo21274c(C7047a.C7049b bVar, Object obj) {
        C41536l.m120489i(bVar, "key");
        mo21271b().put(bVar, obj);
    }

    public C7052d(C7047a aVar) {
        C41536l.m120489i(aVar, "initialExtras");
        mo21271b().putAll(aVar.mo21271b());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7052d(C7047a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C7047a.C7048a.f20987b : aVar);
    }
}

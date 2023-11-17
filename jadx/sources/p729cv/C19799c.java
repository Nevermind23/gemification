package p729cv;

import ed1.C40749p;
import j70.C25349i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import md0.C26186e;
import p853ow.C27092a;
import q70.C27686b;
import ue1.C43075l;

/* renamed from: cv.c */
public final class C19799c {

    /* renamed from: a */
    private final C25349i f54172a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C27092a f54173b;

    /* renamed from: cv.c$a */
    static final class C19800a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19799c f54174d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19800a(C19799c cVar) {
            super(1);
            this.f54174d = cVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            C27092a b = this.f54174d.f54173b;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b.mo66372b((C27686b) it.next()));
            }
            return arrayList;
        }
    }

    public C19799c(C25349i iVar, C27092a aVar) {
        C41536l.m120489i(iVar, "getProductTypes");
        C41536l.m120489i(aVar, "productsDomainMapper");
        this.f54172a = iVar;
        this.f54173b = aVar;
    }

    /* renamed from: e */
    public static /* synthetic */ C40749p m65565e(C19799c cVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return cVar.mo48088d(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final List m65566f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: c */
    public final C40749p mo48087c() {
        return m65565e(this, false, 1, (Object) null);
    }

    /* renamed from: d */
    public final C40749p mo48088d(boolean z) {
        C40749p k0 = C26186e.m81987e(this.f54172a.mo63915a(z)).mo95026k0(new C19798b(new C19800a(this)));
        C41536l.m120488h(k0, "@JvmOverloads\n    operat…sDomainMapper::convert) }");
        return k0;
    }
}

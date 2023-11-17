package j20;

import i20.C25101a;
import i20.C25102b;
import i20.C25103c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p739dv.C20102a;
import p739dv.C20103b;
import p739dv.C20104c;

/* renamed from: j20.a */
public final class C25307a {

    /* renamed from: j20.a$a */
    public static final class C25308a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Long.valueOf(((C20104c) obj).mo48521g()), Long.valueOf(((C20104c) obj2).mo48521g()));
        }
    }

    /* renamed from: d */
    public static /* synthetic */ C25101a m80458d(C25307a aVar, C20103b bVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return aVar.mo63869a(bVar, z);
    }

    /* renamed from: a */
    public final C25101a mo63869a(C20103b bVar, boolean z) {
        C41536l.m120489i(bVar, "assetLiabilityDetail");
        return new C25101a(bVar.mo48510c(), bVar.mo48508a(), bVar.mo48509b(), z, false, 16, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final C25102b mo63870b(C20104c cVar) {
        C41536l.m120489i(cVar, "assetLiabilityPoint");
        return new C25102b(cVar.mo48520f(), cVar.mo48516c(), cVar.mo48521g(), cVar.mo48514a(), cVar.mo48518e(), cVar.mo48524i(), cVar.mo48517d(), cVar.mo48522h(), cVar.mo48515b());
    }

    /* renamed from: c */
    public final C25103c mo63871c(C20102a aVar, boolean z, boolean z2) {
        C41536l.m120489i(aVar, "assetLiability");
        List<C20104c> t0 = C41358y.m120030t0(aVar.mo48504d(), new C25308a());
        ArrayList arrayList = new ArrayList(C41343r.m119925u(t0, 10));
        for (C20104c b : t0) {
            arrayList.add(mo63870b(b));
        }
        List<C20103b> a = aVar.mo48501a();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(a, 10));
        for (C20103b d : a) {
            arrayList2.add(m80458d(this, d, false, 2, (Object) null));
        }
        List<C20103b> c = aVar.mo48503c();
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(c, 10));
        for (C20103b a2 : c) {
            arrayList3.add(mo63869a(a2, z));
        }
        List<C20103b> b2 = aVar.mo48502b();
        ArrayList arrayList4 = new ArrayList(C41343r.m119925u(b2, 10));
        for (C20103b d2 : b2) {
            arrayList4.add(m80458d(this, d2, false, 2, (Object) null));
        }
        return new C25103c(arrayList, arrayList2, arrayList3, arrayList4, z2, false, 32, (DefaultConstructorMarker) null);
    }
}

package p735dr;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel;
import p970zw.C30412a;

/* renamed from: dr.b */
public final class C20050b {
    /* renamed from: a */
    public final ServiceCenterUiModel mo48461a(C30412a aVar) {
        ArrayList arrayList;
        C41536l.m120489i(aVar, "center");
        long c = aVar.mo70761c();
        long e = aVar.mo70763e();
        String d = aVar.mo70762d();
        String g = aVar.mo70766g();
        String h = aVar.mo70767h();
        String f = aVar.mo70765f();
        String b = aVar.mo70760b();
        String a = aVar.mo70759a();
        List<C30412a> i = aVar.mo70769i();
        if (i != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(i, 10));
            for (C30412a a2 : i) {
                arrayList2.add(mo48461a(a2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new ServiceCenterUiModel(c, e, d, g, h, f, b, a, arrayList);
    }
}

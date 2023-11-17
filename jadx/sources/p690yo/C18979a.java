package p690yo;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.ServiceCenterUiModel;
import p455ho.C15558k;

/* renamed from: yo.a */
public final class C18979a {
    /* renamed from: a */
    public final ServiceCenterUiModel mo47027a(C15558k kVar) {
        ArrayList arrayList;
        C41536l.m120489i(kVar, "serviceCenter");
        long c = kVar.mo42776c();
        long e = kVar.mo42778e();
        String d = kVar.mo42777d();
        String g = kVar.mo42781g();
        String h = kVar.mo42782h();
        String f = kVar.mo42780f();
        String b = kVar.mo42775b();
        String a = kVar.mo42774a();
        List<C15558k> i = kVar.mo42784i();
        if (i != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(i, 10));
            for (C15558k a2 : i) {
                arrayList2.add(mo47027a(a2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new ServiceCenterUiModel(c, e, d, g, h, f, b, a, arrayList);
    }
}

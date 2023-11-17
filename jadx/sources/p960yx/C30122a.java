package p960yx;

import com.salesforce.marketingcloud.C11398b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import sm0.C28252d;

/* renamed from: yx.a */
public final class C30122a {
    /* renamed from: a */
    public final JuniorRequestDataUiModel mo70408a(C28252d dVar) {
        C41536l.m120489i(dVar, "juniorRequestData");
        Long valueOf = Long.valueOf(dVar.mo67805g());
        String f = dVar.mo67804f();
        Long b = dVar.mo67799b();
        String c = dVar.mo67800c();
        if (c == null) {
            c = "";
        }
        String d = dVar.mo67801d();
        if (d == null) {
            d = "";
        }
        Long a = dVar.mo67798a();
        String e = dVar.mo67802e();
        if (e == null) {
            e = "";
        }
        Long h = dVar.mo67806h();
        String i = dVar.mo67808i();
        if (i == null) {
            i = "";
        }
        return new JuniorRequestDataUiModel(valueOf, f, b, c, d, a, e, h, i, dVar.mo67809j(), (Long) null, C11398b.f33141t, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final List mo70409b(List list) {
        C41536l.m120489i(list, "juniorRequestData");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo70408a((C28252d) it.next()));
        }
        return arrayList;
    }
}

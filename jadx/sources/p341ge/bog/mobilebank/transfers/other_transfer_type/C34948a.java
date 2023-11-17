package p341ge.bog.mobilebank.transfers.other_transfer_type;

import g91.C32289b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.transfers.other_transfer_type.C34966e;
import p891su.C28261a;

/* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.a */
public final class C34948a {
    /* renamed from: a */
    public final C34966e.C34967a mo85472a(C28261a aVar) {
        C41536l.m120489i(aVar, "contact");
        long m = aVar.mo67857m();
        String b = C32289b0.m95090b(aVar.mo67860p(), true);
        String i = aVar.mo67853i();
        if (i == null) {
            i = "";
        }
        return new C34966e.C34967a(m, b, i, aVar.mo67858n(), aVar.mo67866u(), aVar.mo67850g(), aVar.mo67861q());
    }

    /* renamed from: b */
    public final List mo85473b(List list) {
        C41536l.m120489i(list, "contacts");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo85472a((C28261a) it.next()));
        }
        return arrayList;
    }
}

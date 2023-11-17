package p470ip;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p455ho.C15559l;
import p456hp.C15584a;

/* renamed from: ip.a */
public final class C15732a {
    /* renamed from: a */
    public final C15584a mo43111a(C15559l lVar) {
        C41536l.m120489i(lVar, "entity");
        return new C15584a(lVar.mo42786a(), lVar.mo42787b(), lVar.mo42788c(), lVar.mo42789d(), lVar.mo42790e(), lVar.mo42792f(), lVar.mo42793g(), lVar.mo42794h(), lVar.mo42796i(), lVar.mo42797j(), lVar.mo42798k(), lVar.mo42799l());
    }

    /* renamed from: b */
    public final List mo43112b(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo43111a((C15559l) it.next()));
        }
        return arrayList;
    }
}

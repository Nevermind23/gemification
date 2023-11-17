package t00;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p831mu.C26300b;
import u00.C28535c;

/* renamed from: t00.c */
public final class C28295c {
    /* renamed from: a */
    public final List mo67924a(List list) {
        C41536l.m120489i(list, "summaries");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo67925b((C26300b) it.next()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C28535c mo67925b(C26300b bVar) {
        C41536l.m120489i(bVar, "summary");
        return new C28535c(bVar.mo65453e(), bVar.mo65449a(), bVar.mo65450b(), bVar.mo65451c(), bVar.mo65452d());
    }
}

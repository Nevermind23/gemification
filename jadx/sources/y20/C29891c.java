package y20;

import a30.C19151a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import w20.C29192a;

/* renamed from: y20.c */
public abstract class C29891c {
    /* renamed from: a */
    public static final List m90715a(C29890b bVar) {
        C41536l.m120489i(bVar, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar.mo70176e());
        if (bVar.mo70175d().size() > 2) {
            arrayList.add(new C29192a.C29196d(bVar.mo70175d()));
        } else {
            List<C19151a> d = bVar.mo70175d();
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(d, 10));
            for (C19151a cVar : d) {
                arrayList2.add(new C29192a.C29195c(cVar));
            }
            arrayList.addAll(arrayList2);
        }
        arrayList.add(bVar.mo70174c());
        arrayList.addAll(bVar.mo70178f());
        arrayList.add(bVar.mo70172a());
        return arrayList;
    }
}

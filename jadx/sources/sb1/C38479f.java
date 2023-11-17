package sb1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.sso_client.models.C35965u;
import sb1.C38466d;
import ue1.C43075l;

/* renamed from: sb1.f */
public abstract class C38479f {
    /* renamed from: a */
    public static final List m112930a(List list) {
        C41536l.m120489i(list, "turnoverTypes");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m112931b((C35965u) it.next()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final C38466d.C38468b m112931b(C35965u uVar) {
        C41536l.m120489i(uVar, "turnoverTypes");
        return new C38466d.C38468b(uVar, (C43075l) null, 2, (DefaultConstructorMarker) null);
    }
}

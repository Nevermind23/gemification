package yi0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import xh0.C29797m;

/* renamed from: yi0.f */
public final class C30072f {
    /* renamed from: a */
    public final List mo70348a(List list) {
        C41536l.m120489i(list, "templates");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringSource.Dictionary(((C29797m) it.next()).mo70034a(), (Boolean) null, (List) null, 6, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }
}

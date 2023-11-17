package ey0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import ox0.C37829b;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33704e;
import s31.C38421a;
import s31.C38425e;
import ux0.C39165p;
import wx0.C39728j;

/* renamed from: ey0.e */
public final class C31884e extends C39165p {
    /* renamed from: p */
    private final List m94217p(C38421a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo92821i(C39728j.C39729a.BOTTOM, C37829b.m111228o(aVar)));
        arrayList.add(mo92819e(C37829b.m111228o(aVar)));
        arrayList.add(mo92821i(C39728j.C39729a.TOP, C37829b.m111228o(aVar)));
        return arrayList;
    }

    /* renamed from: b */
    public List mo47566b(C38421a aVar) {
        C41536l.m120489i(aVar, "config");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(mo92822k(aVar));
        arrayList.addAll(mo72312o(aVar));
        arrayList.addAll(m94217p(aVar));
        return mo92817a(C41358y.m120004T(arrayList), aVar);
    }

    /* renamed from: o */
    public List mo72312o(C38421a aVar) {
        List list;
        boolean z;
        boolean z2;
        C41536l.m120489i(aVar, "config");
        ArrayList arrayList = new ArrayList();
        if (C37829b.m111228o(aVar)) {
            List<C38425e> i = C37829b.m111222i(aVar);
            if (i != null) {
                for (C38425e eVar : i) {
                    if (C41536l.m120484d(eVar.mo91988e(), "X")) {
                        list = C41339p.m119900e(mo92820h(eVar));
                    } else {
                        C33702d c = mo92818c(aVar, eVar, true);
                        if (c instanceof C33704e) {
                            list = (List) c;
                        } else {
                            list = C41339p.m119900e(c);
                        }
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                if (next == null || (next instanceof C33699b)) {
                                    z2 = true;
                                    continue;
                                } else {
                                    z2 = false;
                                    continue;
                                }
                                if (!z2) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        z = true;
                        if (z) {
                            C41536l.m120487g(list, "null cannot be cast to non-null type kotlin.collections.List<R of ge.bog.mobilebank.payments.presentation.ExtensionsKt.requireIsInstance>");
                        } else {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                    boolean unused = C41352v.m119965z(arrayList, list);
                }
            }
            if (arrayList.size() > 0) {
                C37829b.m111214a(arrayList, false, true, 0);
                C37829b.m111215b(arrayList, true, true, (Integer) null, 4, (Object) null);
            }
        }
        return arrayList;
    }
}

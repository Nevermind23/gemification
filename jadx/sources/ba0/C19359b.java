package ba0;

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

/* renamed from: ba0.b */
public final class C19359b extends C39165p {
    /* renamed from: b */
    public List mo47566b(C38421a aVar) {
        C41536l.m120489i(aVar, "config");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(mo92822k(aVar));
        arrayList.addAll(mo47567o(aVar));
        return mo92817a(C41358y.m120004T(arrayList), aVar);
    }

    /* renamed from: o */
    public List mo47567o(C38421a aVar) {
        List list;
        boolean z;
        C41536l.m120489i(aVar, "config");
        ArrayList arrayList = new ArrayList();
        if (C37829b.m111228o(aVar)) {
            List i = C37829b.m111222i(aVar);
            if (i == null) {
                i = C41341q.m119907j();
            }
            List B0 = C41358y.m119991B0(i);
            Iterator it = B0.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (C41536l.m120484d(((C38425e) it.next()).mo91984a(), "amount")) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                i2 = B0.size();
            }
            Iterator it2 = C41358y.m120032v0(B0, i2).iterator();
            while (true) {
                boolean z2 = true;
                if (it2.hasNext()) {
                    C38425e eVar = (C38425e) it2.next();
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
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next = it3.next();
                                    if (next == null || (next instanceof C33699b)) {
                                        z = true;
                                        continue;
                                    } else {
                                        z = false;
                                        continue;
                                    }
                                    if (!z) {
                                        z2 = false;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (!z2) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                    boolean unused = C41352v.m119965z(arrayList, list);
                } else if (arrayList.size() > 0) {
                    C37829b.m111214a(arrayList, false, true, 0);
                    C37829b.m111215b(arrayList, true, true, (Integer) null, 4, (Object) null);
                }
            }
        }
        return arrayList;
    }
}

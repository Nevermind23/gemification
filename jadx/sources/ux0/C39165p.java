package ux0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ox0.C37829b;
import ox0.C37833c;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33704e;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import s31.C38421a;
import s31.C38422b;
import s31.C38425e;
import wx0.C39728j;

/* renamed from: ux0.p */
public abstract class C39165p {
    /* renamed from: d */
    private static final C33699b m114266d(C39165p pVar, C38421a aVar, C38425e eVar, C38422b bVar, boolean z) {
        C33702d.C33703a j = pVar.m114269j(aVar, eVar, bVar);
        if (j != null) {
            return new C33699b(eVar, bVar, z, j);
        }
        return null;
    }

    /* renamed from: f */
    private final C33699b m114267f(boolean z) {
        return new C33699b((C38425e) null, (C38422b) null, z, C33702d.C33703a.CHIPS, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    private final C33699b m114268g() {
        return new C33699b((C38425e) null, (C38422b) null, false, C33702d.C33703a.CONTACTS, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: j */
    private final C33702d.C33703a m114269j(C38421a aVar, C38425e eVar, C38422b bVar) {
        if (C37829b.m111230q(aVar.mo91950d()) && C37829b.m111232s(eVar, aVar, false, 2, (Object) null)) {
            return C33702d.C33703a.INPUT_MOBILE;
        }
        String l = bVar.mo91969l();
        if (l == null) {
            return null;
        }
        int hashCode = l.hashCode();
        if (hashCode != -1413853096) {
            if (hashCode != -906021636) {
                if (hashCode == 3556653 && l.equals("text")) {
                    return C33702d.C33703a.INPUT_TEXT;
                }
                return null;
            } else if (!l.equals("select")) {
                return null;
            } else {
                return C33702d.C33703a.SELECT;
            }
        } else if (!l.equals("amount")) {
            return null;
        } else {
            return C33702d.C33703a.AMOUNT;
        }
    }

    /* renamed from: l */
    private final C33699b m114270l(boolean z) {
        C33702d.C33703a aVar = C33702d.C33703a.PACKAGES_SELECT;
        C38422b bVar = new C38422b((String) null, (Boolean) null, (String) null, (Integer) null, true, (Boolean) null, (Boolean) null, C37833c.f90838a.mo91117C().mo84399b(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, false, 130927, (DefaultConstructorMarker) null);
        Boolean bool = Boolean.TRUE;
        return new C33699b(new C38425e("amount", (String) null, (String) null, (String) null, bool, bool, Boolean.FALSE, C41341q.m119907j()), bVar, z, aVar);
    }

    /* renamed from: m */
    private final C33699b m114271m() {
        return new C33699b((C38425e) null, (C38422b) null, false, C33702d.C33703a.TEMPLATE_LIST, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: n */
    private final C33699b m114272n(String str) {
        return new C33699b((C38425e) null, new C38422b((String) null, (Boolean) null, str, (Integer) null, false, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, false, 262139, (DefaultConstructorMarker) null), false, C33702d.C33703a.TITLE, 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List mo92817a(List list, C38421a aVar) {
        String str;
        C41536l.m120489i(list, "elements");
        C41536l.m120489i(aVar, "config");
        if (C37829b.m111227n(aVar)) {
            list = C41358y.m119991B0(list);
            Iterator it = list.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                C38425e i3 = ((C33699b) it.next()).mo80321i();
                if (i3 != null) {
                    str = i3.mo91988e();
                } else {
                    str = null;
                }
                if (C41536l.m120484d(str, "C")) {
                    break;
                }
                i2++;
            }
            list.remove(i2);
            int size = list.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (C37829b.m111234u(((C33699b) list.get(i)).mo80314b())) {
                    list.add(i + 1, m114270l(C37829b.m111228o(aVar)));
                    list.add(i, m114267f(C37829b.m111228o(aVar)));
                    break;
                } else {
                    i++;
                }
            }
        }
        return list;
    }

    /* renamed from: b */
    public abstract List mo47566b(C38421a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C33702d mo92818c(C38421a aVar, C38425e eVar, boolean z) {
        boolean z2;
        C41536l.m120489i(aVar, "config");
        C41536l.m120489i(eVar, "param");
        List<C38422b> b = eVar.mo91985b();
        if (b == null || b.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(!z2)) {
            throw new IllegalArgumentException("Invalid parameter fields".toString());
        } else if (b.size() == 1) {
            return m114266d(this, aVar, eVar, (C38422b) C41358y.m120007W(b), z);
        } else {
            ArrayList arrayList = new ArrayList();
            for (C38422b d : b) {
                C33699b d2 = m114266d(this, aVar, eVar, d, z);
                if (d2 != null) {
                    arrayList.add(d2);
                }
            }
            return new C33704e(arrayList);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C33699b mo92819e(boolean z) {
        return new C33699b((C38425e) null, (C38422b) null, z, C33702d.C33703a.CARD_CHOOSER, 3, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C33699b mo92820h(C38425e eVar) {
        C41536l.m120489i(eVar, "param");
        return new C33699b(eVar, (C38422b) null, true, C33702d.C33703a.DEBT_INFO, 2, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C33699b mo92821i(C39728j.C39729a aVar, boolean z) {
        C41536l.m120489i(aVar, "style");
        return new C33699b((C38425e) null, new C38422b((String) null, (Boolean) null, aVar.mo93460b(), (Integer) null, false, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, false, 262139, (DefaultConstructorMarker) null), z, C33702d.C33703a.DIVIDER, 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final List mo92822k(C38421a aVar) {
        String str;
        List list;
        boolean z;
        boolean z2;
        C41536l.m120489i(aVar, "config");
        ArrayList arrayList = new ArrayList();
        if (C37829b.m111230q(aVar.mo91950d())) {
            str = C34646b.m101752f(C37833c.f90838a.mo91116B(), (Context) null, 1, (Object) null);
        } else {
            str = C34646b.m101752f(C37833c.f90838a.mo91162x(), (Context) null, 1, (Object) null);
        }
        arrayList.add(m114272n(str));
        List<C38425e> k = C37829b.m111224k(aVar, false, 1, (Object) null);
        if (k != null) {
            for (C38425e c : k) {
                C33702d c2 = mo92818c(aVar, c, false);
                if (c2 instanceof C33704e) {
                    list = (List) c2;
                } else {
                    list = C41339p.m119900e(c2);
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
                    boolean unused = C41352v.m119965z(arrayList, list);
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        }
        arrayList.add(m114271m());
        arrayList.add(mo92821i(C39728j.C39729a.TOP, false));
        if (C37829b.m111230q(aVar.mo91950d())) {
            arrayList.add(m114268g());
        }
        return arrayList;
    }
}

package ox0;

import com.google.gson.Gson;
import dy0.C31622e;
import g91.C32303f;
import g91.C32343x;
import g91.C32359z0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lx0.C37177b;
import lx0.C37179d;
import p316xa.C8982a;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.payments.domain.model.KeyValue;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33697a;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import s31.C38421a;
import s31.C38422b;
import s31.C38424d;
import s31.C38425e;
import u61.C39034b;
import ue1.C43075l;
import wx0.C39711c;
import wx0.C39728j;
import yx0.C40087b;

/* renamed from: ox0.b */
public abstract class C37829b {

    /* renamed from: ox0.b$a */
    static final class C37830a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C37830a f90811d = new C37830a();

        C37830a() {
            super(1);
        }

        /* renamed from: a */
        public final Comparable invoke(C39034b bVar) {
            C41536l.m120489i(bVar, "it");
            return bVar.mo92709b();
        }
    }

    /* renamed from: ox0.b$b */
    static final class C37831b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C37831b f90812d = new C37831b();

        C37831b() {
            super(1);
        }

        /* renamed from: a */
        public final Comparable invoke(C39034b bVar) {
            C41536l.m120489i(bVar, "it");
            return bVar.mo92708a();
        }
    }

    /* renamed from: ox0.b$c */
    public static final class C37832c extends C8982a<List<? extends KeyValue>> {
        C37832c() {
        }
    }

    /* renamed from: a */
    public static final void m111214a(List list, boolean z, boolean z2, Integer num) {
        int i;
        String str;
        List list2 = list;
        C41536l.m120489i(list2, "<this>");
        if (num != null) {
            i = num.intValue();
        } else {
            i = list.size();
        }
        if (z) {
            str = C39728j.C39729a.TOP.mo93460b();
        } else {
            str = C39728j.C39729a.BOTTOM.mo93460b();
        }
        list2.add(i, new C33699b((C38425e) null, new C38422b((String) null, (Boolean) null, str, (Integer) null, false, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, false, 262139, (DefaultConstructorMarker) null), z2, C33702d.C33703a.DIVIDER, 1, (DefaultConstructorMarker) null));
    }

    /* renamed from: b */
    public static /* synthetic */ void m111215b(List list, boolean z, boolean z2, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        m111214a(list, z, z2, num);
    }

    /* renamed from: c */
    public static final void m111216c(List list, String str, C38422b bVar) {
        C41536l.m120489i(list, "<this>");
        C41536l.m120489i(bVar, "input");
        if (bVar.mo91968k()) {
            list.add(new KeyValue(bVar.mo91959d(), str));
        }
    }

    /* renamed from: d */
    public static final String m111217d(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            BigDecimal bigDecimal = new BigDecimal(str);
            BigDecimal valueOf = BigDecimal.valueOf((long) 100);
            C41536l.m120488h(valueOf, "valueOf(this.toLong())");
            String bigDecimal2 = bigDecimal.multiply(valueOf).toString();
            C41536l.m120488h(bigDecimal2, "toBigDecimal()\n         …              .toString()");
            if (C40440x.m117139M(bigDecimal2, ".", false, 2, (Object) null)) {
                bigDecimal2 = bigDecimal2.substring(0, C40440x.m117156X(bigDecimal2, ".", 0, false, 6, (Object) null));
                C41536l.m120488h(bigDecimal2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            return bigDecimal2;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: e */
    public static final String m111218e(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "";
        if (!z) {
            try {
                BigDecimal bigDecimal = new BigDecimal(str);
                BigDecimal valueOf = BigDecimal.valueOf((long) 100);
                C41536l.m120488h(valueOf, "valueOf(this.toLong())");
                str2 = bigDecimal.divide(valueOf).toString();
            } catch (Exception unused) {
            }
            C41536l.m120488h(str2, "{\n        try {\n        …       \"\"\n        }\n    }");
        }
        return str2;
    }

    /* renamed from: f */
    public static final String m111219f(C37177b bVar) {
        C41536l.m120489i(bVar, "<this>");
        String b = bVar.mo90175b();
        if (b != null) {
            String F = C32343x.m95388F(b, new Object[0]);
            String N = C32359z0.m95543N(bVar.mo90174a().toString());
            String i = C32303f.m95198i("GEL", true);
            String B = C40439w.m117103B(F, "%AMOUNT%", N + i, false, 4, (Object) null);
            if (B == null) {
                return "";
            }
            return B;
        }
        return "";
    }

    /* renamed from: g */
    public static final String m111220g(C38421a aVar, List list) {
        Object obj;
        boolean z;
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(list, "paymentParams");
        StringBuilder sb = new StringBuilder("");
        List<C38425e> j = m111223j(aVar, false);
        if (j != null) {
            for (C38425e eVar : j) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C41536l.m120484d(eVar.mo91984a(), ((KeyValue) obj).mo80134a())) {
                        break;
                    }
                }
                KeyValue keyValue = (KeyValue) obj;
                if (keyValue != null) {
                    String a = keyValue.mo80134a();
                    boolean z2 = true;
                    if (a == null || a.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        String b = keyValue.mo80135b();
                        if (!(b == null || b.length() == 0)) {
                            z2 = false;
                        }
                        if (!z2) {
                            sb.append(keyValue.mo80135b());
                            sb.append(",");
                        }
                    }
                }
            }
        }
        while (C40440x.m117143O(sb, ",", false, 2, (Object) null)) {
            sb.deleteCharAt(C40440x.m117149R(sb));
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "builder.toString()");
        return sb2;
    }

    /* renamed from: h */
    public static final BigDecimal m111221h(C37179d dVar, C38422b bVar) {
        Object obj;
        String b;
        C41536l.m120489i(dVar, "<this>");
        C41536l.m120489i(bVar, "input");
        try {
            Iterator it = dVar.mo90180a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((KeyValue) obj).mo80134a(), bVar.mo91959d())) {
                    break;
                }
            }
            KeyValue keyValue = (KeyValue) obj;
            if (keyValue == null || (b = keyValue.mo80135b()) == null) {
                return null;
            }
            return new BigDecimal(b);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static final List m111222i(C38421a aVar) {
        C41536l.m120489i(aVar, "<this>");
        List a = aVar.mo91950d().mo91979a();
        if (a == null) {
            return null;
        }
        Iterator it = a.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (m111233t(((C38425e) it.next()).mo91984a())) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            return a.subList(i, a.size());
        }
        return null;
    }

    /* renamed from: j */
    public static final List m111223j(C38421a aVar, boolean z) {
        int i;
        C41536l.m120489i(aVar, "<this>");
        List a = aVar.mo91950d().mo91979a();
        if (a == null) {
            return null;
        }
        Iterator it = a.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (m111233t(((C38425e) it.next()).mo91984a())) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            if (z) {
                i2 = a.size();
            } else {
                Iterator it2 = a.iterator();
                int i3 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (C41536l.m120484d(((C38425e) it2.next()).mo91984a(), "amount")) {
                        i = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i < 0) {
                    i2 = a.size();
                } else {
                    i2 = i;
                }
            }
        }
        return a.subList(0, i2);
    }

    /* renamed from: k */
    public static /* synthetic */ List m111224k(C38421a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m111223j(aVar, z);
    }

    /* renamed from: l */
    public static final String m111225l(C37179d dVar, C38422b bVar) {
        Object obj;
        String b;
        C41536l.m120489i(dVar, "<this>");
        C41536l.m120489i(bVar, "input");
        Iterator it = dVar.mo90180a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((KeyValue) obj).mo80134a(), bVar.mo91959d())) {
                break;
            }
        }
        KeyValue keyValue = (KeyValue) obj;
        if (keyValue == null || (b = keyValue.mo80135b()) == null) {
            return "";
        }
        return b;
    }

    /* renamed from: m */
    public static final List m111226m(C31622e eVar) {
        boolean z;
        boolean z2;
        C41536l.m120489i(eVar, "<this>");
        ArrayList arrayList = new ArrayList();
        List e = eVar.mo72051e();
        if (e != null) {
            for (C39034b bVar : C41358y.m120030t0(e, C41506d.m120404c(C37830a.f90811d, C37831b.f90812d))) {
                String b = bVar.mo92709b();
                String w = m111236w(bVar);
                if (b == null || b.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (w == null || w.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        arrayList.add(new KeyValue(b, w));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: s31.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: s31.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: s31.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: s31.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: s31.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m111227n(s31.C38421a r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            s31.d r4 = r4.mo91950d()
            java.util.List r4 = r4.mo91979a()
            r0 = 0
            if (r4 == 0) goto L_0x0030
            java.util.Iterator r4 = r4.iterator()
        L_0x0014:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x002e
            java.lang.Object r1 = r4.next()
            r2 = r1
            s31.e r2 = (s31.C38425e) r2
            java.lang.String r2 = r2.mo91988e()
            java.lang.String r3 = "C"
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)
            if (r2 == 0) goto L_0x0014
            r0 = r1
        L_0x002e:
            s31.e r0 = (s31.C38425e) r0
        L_0x0030:
            if (r0 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0034:
            r4 = 0
        L_0x0035:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ox0.C37829b.m111227n(s31.a):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: s31.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: s31.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: s31.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: s31.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: s31.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m111228o(s31.C38421a r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            s31.d r3 = r3.mo91950d()
            java.util.List r3 = r3.mo91979a()
            r0 = 0
            if (r3 == 0) goto L_0x002e
            java.util.Iterator r3 = r3.iterator()
        L_0x0014:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r3.next()
            r2 = r1
            s31.e r2 = (s31.C38425e) r2
            java.lang.String r2 = r2.mo91984a()
            boolean r2 = m111233t(r2)
            if (r2 == 0) goto L_0x0014
            r0 = r1
        L_0x002c:
            s31.e r0 = (s31.C38425e) r0
        L_0x002e:
            if (r0 == 0) goto L_0x0032
            r3 = 1
            goto L_0x0033
        L_0x0032:
            r3 = 0
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ox0.C37829b.m111228o(s31.a):boolean");
    }

    /* renamed from: p */
    public static final boolean m111229p(C38424d dVar) {
        C41536l.m120489i(dVar, "<this>");
        return C41536l.m120484d(dVar.mo91980b(), "allMobile");
    }

    /* renamed from: q */
    public static final boolean m111230q(C38424d dVar) {
        C41536l.m120489i(dVar, "<this>");
        if (C41536l.m120484d(dVar.mo91980b(), PaymentServiceConfig.TYPE_MOBILE) || m111229p(dVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static final boolean m111231r(C38425e eVar, C38421a aVar, boolean z) {
        int i;
        C41536l.m120489i(eVar, "<this>");
        C41536l.m120489i(aVar, "config");
        if (z && m111233t(eVar.mo91984a())) {
            return false;
        }
        List a = aVar.mo91950d().mo91979a();
        int i2 = -1;
        if (a != null) {
            Iterator it = a.iterator();
            i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (m111233t(((C38425e) it.next()).mo91984a())) {
                    break;
                } else {
                    i++;
                }
            }
        }
        i = -1;
        List a2 = aVar.mo91950d().mo91979a();
        if (a2 == null) {
            return false;
        }
        Iterator it2 = a2.iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (C41536l.m120484d(((C38425e) it2.next()).mo91984a(), eVar.mo91984a())) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        if (i2 < 0 || i2 >= i) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public static /* synthetic */ boolean m111232s(C38425e eVar, C38421a aVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m111231r(eVar, aVar, z);
    }

    /* renamed from: t */
    public static final boolean m111233t(String str) {
        C41536l.m120489i(str, "<this>");
        return C41536l.m120484d(str, "debtButton");
    }

    /* renamed from: u */
    public static final boolean m111234u(C33702d.C33703a aVar) {
        C41536l.m120489i(aVar, "<this>");
        if (aVar == C33702d.C33703a.AMOUNT) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static final List m111235v(C33697a.C33698a aVar) {
        String a;
        String str;
        List e;
        C41536l.m120489i(aVar, "<this>");
        C38425e i = ((C33699b) aVar.mo80307a()).mo80321i();
        String str2 = null;
        if (i == null || (a = i.mo91984a()) == null) {
            return null;
        }
        if (C41536l.m120484d(((C33699b) aVar.mo80307a()).mo80321i().mo91988e(), "X")) {
            Object m = new Gson().mo18171m(aVar.mo80309c().mo93122g(), new C37832c().getType());
            C41536l.m120488h(m, "{\n                Gson()…          )\n            }");
            e = (List) m;
        } else if (((C33699b) aVar.mo80307a()).mo80314b() != C33702d.C33703a.PACKAGES_SELECT || !(aVar.mo80309c() instanceof C40087b)) {
            if (aVar.mo80309c() instanceof C39711c) {
                str = m111217d(aVar.mo80309c().mo93122g());
            } else {
                str = aVar.mo80309c().mo93122g();
            }
            e = C41339p.m119900e(new KeyValue(a, str));
        } else {
            String f = aVar.mo80309c().mo93121f();
            if (f != null) {
                str2 = m111217d(f);
            }
            e = C41339p.m119900e(new KeyValue(a, str2));
        }
        return e;
    }

    /* renamed from: w */
    public static final String m111236w(C39034b bVar) {
        C41536l.m120489i(bVar, "<this>");
        if (C41536l.m120484d(bVar.mo92709b(), "amount")) {
            return m111218e(bVar.mo92710c());
        }
        return bVar.mo92710c();
    }
}

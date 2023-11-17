package uf1;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import dg1.C40672b;
import dg1.C40681e;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import of1.C41880d0;
import of1.C41896h;
import of1.C41907m;
import of1.C41909n;
import of1.C41928u;
import of1.C41931v;
import pf1.C42197d;
import xf1.C43286k;

/* renamed from: uf1.e */
public abstract class C43092e {

    /* renamed from: a */
    private static final C40681e f100522a;

    /* renamed from: b */
    private static final C40681e f100523b;

    static {
        C40681e.C40682a aVar = C40681e.f96327g;
        f100522a = aVar.mo94822c("\"\\");
        f100523b = aVar.mo94822c("\t ,=");
    }

    /* renamed from: a */
    public static final List m123639a(C41928u uVar, String str) {
        C41536l.m120489i(uVar, "<this>");
        C41536l.m120489i(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = uVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (C40439w.m117115s(str, uVar.mo96926c(i), true)) {
                try {
                    m123641c(new C40672b().mo94728d0(uVar.mo96932n(i)), arrayList);
                } catch (EOFException e) {
                    C43286k.f101052a.mo101988g().mo101984j("Unable to parse challenge", 5, e);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m123640b(C41880d0 d0Var) {
        C41536l.m120489i(d0Var, "<this>");
        if (C41536l.m120484d(d0Var.mo96742e0().mo96678g(), "HEAD")) {
            return false;
        }
        int q = d0Var.mo96747q();
        if (((q >= 100 && q < 200) || q == 204 || q == 304) && C42197d.m122556v(d0Var) == -1 && !C40439w.m117115s("chunked", C41880d0.m121379v(d0Var, "Transfer-Encoding", (String) null, 2, (Object) null), true)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static final void m123641c(C40672b bVar, List list) {
        String e;
        int K;
        String str;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    m123645g(bVar);
                    str2 = m123643e(bVar);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean g = m123645g(bVar);
                e = m123643e(bVar);
                if (e != null) {
                    K = C42197d.m122517K(bVar, (byte) 61);
                    boolean g2 = m123645g(bVar);
                    if (g || (!g2 && !bVar.mo94714Q0())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int K2 = K + C42197d.m122517K(bVar, (byte) 61);
                        while (true) {
                            if (e == null) {
                                e = m123643e(bVar);
                                if (m123645g(bVar)) {
                                    continue;
                                    break;
                                }
                                K2 = C42197d.m122517K(bVar, (byte) 61);
                            }
                            if (K2 == 0) {
                                continue;
                                break;
                            } else if (K2 <= 1 && !m123645g(bVar)) {
                                if (m123646h(bVar, (byte) 34)) {
                                    str = m123642d(bVar);
                                } else {
                                    str = m123643e(bVar);
                                }
                                if (str == null || ((String) linkedHashMap.put(e, str)) != null) {
                                    return;
                                }
                                if (m123645g(bVar) || bVar.mo94714Q0()) {
                                    e = null;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new C41896h(str2, linkedHashMap));
                        str2 = e;
                    }
                } else if (bVar.mo94714Q0()) {
                    list.add(new C41896h(str2, C41344r0.m119928j()));
                    return;
                } else {
                    return;
                }
            }
            Map singletonMap = Collections.singletonMap((Object) null, C41536l.m120497q(e, C40439w.m117120x("=", K)));
            C41536l.m120488h(singletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            list.add(new C41896h(str2, singletonMap));
        }
    }

    /* renamed from: d */
    private static final String m123642d(C40672b bVar) {
        boolean z;
        if (bVar.readByte() == 34) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C40672b bVar2 = new C40672b();
            while (true) {
                long E = bVar.mo94697E(f100522a);
                if (E == -1) {
                    return null;
                }
                if (bVar.mo94764t(E) == 34) {
                    bVar2.mo21301x1(bVar, E);
                    bVar.readByte();
                    return bVar2.mo94746o1();
                } else if (bVar.mo94709M0() == E + 1) {
                    return null;
                } else {
                    bVar2.mo21301x1(bVar, E);
                    bVar.readByte();
                    bVar2.mo21301x1(bVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: e */
    private static final String m123643e(C40672b bVar) {
        long E = bVar.mo94697E(f100523b);
        if (E == -1) {
            E = bVar.mo94709M0();
        }
        if (E != 0) {
            return bVar.mo94701G0(E);
        }
        return null;
    }

    /* renamed from: f */
    public static final void m123644f(C41909n nVar, C41931v vVar, C41928u uVar) {
        C41536l.m120489i(nVar, "<this>");
        C41536l.m120489i(vVar, C11769i.C11770a.f34149l);
        C41536l.m120489i(uVar, "headers");
        if (nVar != C41909n.f98520b) {
            List e = C41907m.f98505j.mo96868e(vVar, uVar);
            if (!e.isEmpty()) {
                nVar.mo96870b(vVar, e);
            }
        }
    }

    /* renamed from: g */
    private static final boolean m123645g(C40672b bVar) {
        boolean z = false;
        while (!bVar.mo94714Q0()) {
            byte t = bVar.mo94764t(0);
            boolean z2 = true;
            if (t != 44) {
                if (!(t == 32 || t == 9)) {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
                bVar.readByte();
            } else {
                bVar.readByte();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    private static final boolean m123646h(C40672b bVar, byte b) {
        return !bVar.mo94714Q0() && bVar.mo94764t(0) == b;
    }
}

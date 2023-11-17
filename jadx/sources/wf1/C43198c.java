package wf1;

import com.salesforce.marketingcloud.C11398b;
import dg1.C40672b;
import dg1.C40679d;
import dg1.C40681e;
import dg1.C40691m;
import dg1.C40707z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf1.C42197d;

/* renamed from: wf1.c */
public final class C43198c {

    /* renamed from: a */
    public static final C43198c f100779a;

    /* renamed from: b */
    private static final C43196b[] f100780b;

    /* renamed from: c */
    private static final Map f100781c;

    static {
        C43198c cVar = new C43198c();
        f100779a = cVar;
        C40681e eVar = C43196b.f100772g;
        C40681e eVar2 = C43196b.f100773h;
        C40681e eVar3 = C43196b.f100774i;
        C40681e eVar4 = C43196b.f100771f;
        f100780b = new C43196b[]{new C43196b(C43196b.f100775j, ""), new C43196b(eVar, "GET"), new C43196b(eVar, "POST"), new C43196b(eVar2, (String) C11110u2.f31950c), new C43196b(eVar2, "/index.html"), new C43196b(eVar3, "http"), new C43196b(eVar3, "https"), new C43196b(eVar4, "200"), new C43196b(eVar4, "204"), new C43196b(eVar4, "206"), new C43196b(eVar4, "304"), new C43196b(eVar4, "400"), new C43196b(eVar4, "404"), new C43196b(eVar4, "500"), new C43196b("accept-charset", ""), new C43196b("accept-encoding", "gzip, deflate"), new C43196b("accept-language", ""), new C43196b("accept-ranges", ""), new C43196b("accept", ""), new C43196b("access-control-allow-origin", ""), new C43196b("age", ""), new C43196b("allow", ""), new C43196b("authorization", ""), new C43196b("cache-control", ""), new C43196b("content-disposition", ""), new C43196b("content-encoding", ""), new C43196b("content-language", ""), new C43196b("content-length", ""), new C43196b("content-location", ""), new C43196b("content-range", ""), new C43196b("content-type", ""), new C43196b("cookie", ""), new C43196b("date", ""), new C43196b("etag", ""), new C43196b("expect", ""), new C43196b("expires", ""), new C43196b("from", ""), new C43196b("host", ""), new C43196b("if-match", ""), new C43196b("if-modified-since", ""), new C43196b("if-none-match", ""), new C43196b("if-range", ""), new C43196b("if-unmodified-since", ""), new C43196b("last-modified", ""), new C43196b("link", ""), new C43196b("location", ""), new C43196b("max-forwards", ""), new C43196b("proxy-authenticate", ""), new C43196b("proxy-authorization", ""), new C43196b("range", ""), new C43196b("referer", ""), new C43196b("refresh", ""), new C43196b("retry-after", ""), new C43196b("server", ""), new C43196b("set-cookie", ""), new C43196b("strict-transport-security", ""), new C43196b("transfer-encoding", ""), new C43196b("user-agent", ""), new C43196b("vary", ""), new C43196b("via", ""), new C43196b("www-authenticate", "")};
        f100781c = cVar.m123899d();
    }

    private C43198c() {
    }

    /* renamed from: d */
    private final Map m123899d() {
        C43196b[] bVarArr = f100780b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bVarArr.length);
        int length = bVarArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            C43196b[] bVarArr2 = f100780b;
            if (!linkedHashMap.containsKey(bVarArr2[i].f100776a)) {
                linkedHashMap.put(bVarArr2[i].f100776a, Integer.valueOf(i));
            }
            i = i2;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C41536l.m120488h(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    /* renamed from: a */
    public final C40681e mo101752a(C40681e eVar) {
        boolean z;
        C41536l.m120489i(eVar, "name");
        int B = eVar.mo94793B();
        int i = 0;
        while (i < B) {
            int i2 = i + 1;
            byte f = eVar.mo94804f(i);
            if (65 > f || f > 90) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                i = i2;
            } else {
                throw new IOException(C41536l.m120497q("PROTOCOL_ERROR response malformed: mixed case name: ", eVar.mo94797F()));
            }
        }
        return eVar;
    }

    /* renamed from: b */
    public final Map mo101753b() {
        return f100781c;
    }

    /* renamed from: c */
    public final C43196b[] mo101754c() {
        return f100780b;
    }

    /* renamed from: wf1.c$a */
    public static final class C43199a {

        /* renamed from: a */
        private final int f100782a;

        /* renamed from: b */
        private int f100783b;

        /* renamed from: c */
        private final List f100784c;

        /* renamed from: d */
        private final C40679d f100785d;

        /* renamed from: e */
        public C43196b[] f100786e;

        /* renamed from: f */
        private int f100787f;

        /* renamed from: g */
        public int f100788g;

        /* renamed from: h */
        public int f100789h;

        public C43199a(C40707z zVar, int i, int i2) {
            C41536l.m120489i(zVar, "source");
            this.f100782a = i;
            this.f100783b = i2;
            this.f100784c = new ArrayList();
            this.f100785d = C40691m.m117770b(zVar);
            C43196b[] bVarArr = new C43196b[8];
            this.f100786e = bVarArr;
            this.f100787f = bVarArr.length - 1;
        }

        /* renamed from: a */
        private final void m123903a() {
            int i = this.f100783b;
            int i2 = this.f100789h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m123904b();
            } else {
                m123906d(i2 - i);
            }
        }

        /* renamed from: b */
        private final void m123904b() {
            C41331l.m119768l(this.f100786e, (Object) null, 0, 0, 6, (Object) null);
            this.f100787f = this.f100786e.length - 1;
            this.f100788g = 0;
            this.f100789h = 0;
        }

        /* renamed from: c */
        private final int m123905c(int i) {
            return this.f100787f + 1 + i;
        }

        /* renamed from: d */
        private final int m123906d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f100786e.length;
                while (true) {
                    length--;
                    i2 = this.f100787f;
                    if (length < i2 || i <= 0) {
                        C43196b[] bVarArr = this.f100786e;
                        System.arraycopy(bVarArr, i2 + 1, bVarArr, i2 + 1 + i3, this.f100788g);
                        this.f100787f += i3;
                    } else {
                        C43196b bVar = this.f100786e[length];
                        C41536l.m120486f(bVar);
                        int i4 = bVar.f100778c;
                        i -= i4;
                        this.f100789h -= i4;
                        this.f100788g--;
                        i3++;
                    }
                }
                C43196b[] bVarArr2 = this.f100786e;
                System.arraycopy(bVarArr2, i2 + 1, bVarArr2, i2 + 1 + i3, this.f100788g);
                this.f100787f += i3;
            }
            return i3;
        }

        /* renamed from: f */
        private final C40681e m123907f(int i) {
            if (m123909h(i)) {
                return C43198c.f100779a.mo101754c()[i].f100776a;
            }
            int c = m123905c(i - C43198c.f100779a.mo101754c().length);
            if (c >= 0) {
                C43196b[] bVarArr = this.f100786e;
                if (c < bVarArr.length) {
                    C43196b bVar = bVarArr[c];
                    C41536l.m120486f(bVar);
                    return bVar.f100776a;
                }
            }
            throw new IOException(C41536l.m120497q("Header index too large ", Integer.valueOf(i + 1)));
        }

        /* renamed from: g */
        private final void m123908g(int i, C43196b bVar) {
            this.f100784c.add(bVar);
            int i2 = bVar.f100778c;
            if (i != -1) {
                C43196b bVar2 = this.f100786e[m123905c(i)];
                C41536l.m120486f(bVar2);
                i2 -= bVar2.f100778c;
            }
            int i3 = this.f100783b;
            if (i2 > i3) {
                m123904b();
                return;
            }
            int d = m123906d((this.f100789h + i2) - i3);
            if (i == -1) {
                int i4 = this.f100788g + 1;
                C43196b[] bVarArr = this.f100786e;
                if (i4 > bVarArr.length) {
                    C43196b[] bVarArr2 = new C43196b[(bVarArr.length * 2)];
                    System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                    this.f100787f = this.f100786e.length - 1;
                    this.f100786e = bVarArr2;
                }
                int i5 = this.f100787f;
                this.f100787f = i5 - 1;
                this.f100786e[i5] = bVar;
                this.f100788g++;
            } else {
                this.f100786e[i + m123905c(i) + d] = bVar;
            }
            this.f100789h += i2;
        }

        /* renamed from: h */
        private final boolean m123909h(int i) {
            return i >= 0 && i <= C43198c.f100779a.mo101754c().length - 1;
        }

        /* renamed from: i */
        private final int m123910i() {
            return C42197d.m122538d(this.f100785d.readByte(), C11051p3.f31759c);
        }

        /* renamed from: l */
        private final void m123911l(int i) {
            if (m123909h(i)) {
                this.f100784c.add(C43198c.f100779a.mo101754c()[i]);
                return;
            }
            int c = m123905c(i - C43198c.f100779a.mo101754c().length);
            if (c >= 0) {
                C43196b[] bVarArr = this.f100786e;
                if (c < bVarArr.length) {
                    List list = this.f100784c;
                    C43196b bVar = bVarArr[c];
                    C41536l.m120486f(bVar);
                    list.add(bVar);
                    return;
                }
            }
            throw new IOException(C41536l.m120497q("Header index too large ", Integer.valueOf(i + 1)));
        }

        /* renamed from: n */
        private final void m123912n(int i) {
            m123908g(-1, new C43196b(m123907f(i), mo101756j()));
        }

        /* renamed from: o */
        private final void m123913o() {
            m123908g(-1, new C43196b(C43198c.f100779a.mo101752a(mo101756j()), mo101756j()));
        }

        /* renamed from: p */
        private final void m123914p(int i) {
            this.f100784c.add(new C43196b(m123907f(i), mo101756j()));
        }

        /* renamed from: q */
        private final void m123915q() {
            this.f100784c.add(new C43196b(C43198c.f100779a.mo101752a(mo101756j()), mo101756j()));
        }

        /* renamed from: e */
        public final List mo101755e() {
            List z0 = C41358y.m120036z0(this.f100784c);
            this.f100784c.clear();
            return z0;
        }

        /* renamed from: j */
        public final C40681e mo101756j() {
            boolean z;
            int i = m123910i();
            if ((i & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            long m = (long) mo101758m(i, C11051p3.f31760d);
            if (!z) {
                return this.f100785d.mo94705J0(m);
            }
            C40672b bVar = new C40672b();
            C43234j.f100962a.mo101907b(this.f100785d, m, bVar);
            return bVar.mo94743n0();
        }

        /* renamed from: k */
        public final void mo101757k() {
            while (!this.f100785d.mo94714Q0()) {
                int d = C42197d.m122538d(this.f100785d.readByte(), C11051p3.f31759c);
                if (d == 128) {
                    throw new IOException("index == 0");
                } else if ((d & 128) == 128) {
                    m123911l(mo101758m(d, C11051p3.f31760d) - 1);
                } else if (d == 64) {
                    m123913o();
                } else if ((d & 64) == 64) {
                    m123912n(mo101758m(d, 63) - 1);
                } else if ((d & 32) == 32) {
                    int m = mo101758m(d, 31);
                    this.f100783b = m;
                    if (m < 0 || m > this.f100782a) {
                        throw new IOException(C41536l.m120497q("Invalid dynamic table size update ", Integer.valueOf(this.f100783b)));
                    }
                    m123903a();
                } else if (d == 16 || d == 0) {
                    m123915q();
                } else {
                    m123914p(mo101758m(d, 15) - 1);
                }
            }
        }

        /* renamed from: m */
        public final int mo101758m(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = m123910i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & C11051p3.f31760d) << i4;
                i4 += 7;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C43199a(C40707z zVar, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(zVar, i, (i3 & 4) != 0 ? i : i2);
        }
    }

    /* renamed from: wf1.c$b */
    public static final class C43200b {

        /* renamed from: a */
        public int f100790a;

        /* renamed from: b */
        private final boolean f100791b;

        /* renamed from: c */
        private final C40672b f100792c;

        /* renamed from: d */
        private int f100793d;

        /* renamed from: e */
        private boolean f100794e;

        /* renamed from: f */
        public int f100795f;

        /* renamed from: g */
        public C43196b[] f100796g;

        /* renamed from: h */
        private int f100797h;

        /* renamed from: i */
        public int f100798i;

        /* renamed from: j */
        public int f100799j;

        public C43200b(int i, boolean z, C40672b bVar) {
            C41536l.m120489i(bVar, "out");
            this.f100790a = i;
            this.f100791b = z;
            this.f100792c = bVar;
            this.f100793d = Integer.MAX_VALUE;
            this.f100795f = i;
            C43196b[] bVarArr = new C43196b[8];
            this.f100796g = bVarArr;
            this.f100797h = bVarArr.length - 1;
        }

        /* renamed from: a */
        private final void m123920a() {
            int i = this.f100795f;
            int i2 = this.f100799j;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m123921b();
            } else {
                m123922c(i2 - i);
            }
        }

        /* renamed from: b */
        private final void m123921b() {
            C41331l.m119768l(this.f100796g, (Object) null, 0, 0, 6, (Object) null);
            this.f100797h = this.f100796g.length - 1;
            this.f100798i = 0;
            this.f100799j = 0;
        }

        /* renamed from: c */
        private final int m123922c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f100796g.length;
                while (true) {
                    length--;
                    i2 = this.f100797h;
                    if (length < i2 || i <= 0) {
                        C43196b[] bVarArr = this.f100796g;
                        System.arraycopy(bVarArr, i2 + 1, bVarArr, i2 + 1 + i3, this.f100798i);
                        C43196b[] bVarArr2 = this.f100796g;
                        int i4 = this.f100797h;
                        Arrays.fill(bVarArr2, i4 + 1, i4 + 1 + i3, (Object) null);
                        this.f100797h += i3;
                    } else {
                        C43196b bVar = this.f100796g[length];
                        C41536l.m120486f(bVar);
                        i -= bVar.f100778c;
                        int i5 = this.f100799j;
                        C43196b bVar2 = this.f100796g[length];
                        C41536l.m120486f(bVar2);
                        this.f100799j = i5 - bVar2.f100778c;
                        this.f100798i--;
                        i3++;
                    }
                }
                C43196b[] bVarArr3 = this.f100796g;
                System.arraycopy(bVarArr3, i2 + 1, bVarArr3, i2 + 1 + i3, this.f100798i);
                C43196b[] bVarArr22 = this.f100796g;
                int i42 = this.f100797h;
                Arrays.fill(bVarArr22, i42 + 1, i42 + 1 + i3, (Object) null);
                this.f100797h += i3;
            }
            return i3;
        }

        /* renamed from: d */
        private final void m123923d(C43196b bVar) {
            int i = bVar.f100778c;
            int i2 = this.f100795f;
            if (i > i2) {
                m123921b();
                return;
            }
            m123922c((this.f100799j + i) - i2);
            int i3 = this.f100798i + 1;
            C43196b[] bVarArr = this.f100796g;
            if (i3 > bVarArr.length) {
                C43196b[] bVarArr2 = new C43196b[(bVarArr.length * 2)];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.f100797h = this.f100796g.length - 1;
                this.f100796g = bVarArr2;
            }
            int i4 = this.f100797h;
            this.f100797h = i4 - 1;
            this.f100796g[i4] = bVar;
            this.f100798i++;
            this.f100799j += i;
        }

        /* renamed from: e */
        public final void mo101759e(int i) {
            this.f100790a = i;
            int min = Math.min(i, 16384);
            int i2 = this.f100795f;
            if (i2 != min) {
                if (min < i2) {
                    this.f100793d = Math.min(this.f100793d, min);
                }
                this.f100794e = true;
                this.f100795f = min;
                m123920a();
            }
        }

        /* renamed from: f */
        public final void mo101760f(C40681e eVar) {
            C41536l.m120489i(eVar, "data");
            if (this.f100791b) {
                C43234j jVar = C43234j.f100962a;
                if (jVar.mo101909d(eVar) < eVar.mo94793B()) {
                    C40672b bVar = new C40672b();
                    jVar.mo101908c(eVar, bVar);
                    C40681e n0 = bVar.mo94743n0();
                    mo101762h(n0.mo94793B(), C11051p3.f31760d, 128);
                    this.f100792c.mo94717T(n0);
                    return;
                }
            }
            mo101762h(eVar.mo94793B(), C11051p3.f31760d, 0);
            this.f100792c.mo94717T(eVar);
        }

        /* renamed from: g */
        public final void mo101761g(List list) {
            int i;
            int i2;
            boolean z;
            C41536l.m120489i(list, "headerBlock");
            if (this.f100794e) {
                int i3 = this.f100793d;
                if (i3 < this.f100795f) {
                    mo101762h(i3, 31, 32);
                }
                this.f100794e = false;
                this.f100793d = Integer.MAX_VALUE;
                mo101762h(this.f100795f, 31, 32);
            }
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                C43196b bVar = (C43196b) list.get(i4);
                C40681e D = bVar.f100776a.mo94795D();
                C40681e eVar = bVar.f100777b;
                C43198c cVar = C43198c.f100779a;
                Integer num = (Integer) cVar.mo101753b().get(D);
                if (num != null) {
                    i = num.intValue() + 1;
                    if (2 > i || i >= 8) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        if (C41536l.m120484d(cVar.mo101754c()[i - 1].f100777b, eVar)) {
                            i2 = i;
                        } else if (C41536l.m120484d(cVar.mo101754c()[i].f100777b, eVar)) {
                            int i6 = i;
                            i++;
                            i2 = i6;
                        }
                    }
                    i2 = i;
                    i = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i == -1) {
                    int i7 = this.f100797h + 1;
                    int length = this.f100796g.length;
                    while (true) {
                        if (i7 >= length) {
                            break;
                        }
                        int i8 = i7 + 1;
                        C43196b bVar2 = this.f100796g[i7];
                        C41536l.m120486f(bVar2);
                        if (C41536l.m120484d(bVar2.f100776a, D)) {
                            C43196b bVar3 = this.f100796g[i7];
                            C41536l.m120486f(bVar3);
                            if (C41536l.m120484d(bVar3.f100777b, eVar)) {
                                i = C43198c.f100779a.mo101754c().length + (i7 - this.f100797h);
                                break;
                            } else if (i2 == -1) {
                                i2 = C43198c.f100779a.mo101754c().length + (i7 - this.f100797h);
                            }
                        }
                        i7 = i8;
                    }
                }
                if (i != -1) {
                    mo101762h(i, C11051p3.f31760d, 128);
                } else if (i2 == -1) {
                    this.f100792c.mo94715R0(64);
                    mo101760f(D);
                    mo101760f(eVar);
                    m123923d(bVar);
                } else if (!D.mo94794C(C43196b.f100770e) || C41536l.m120484d(C43196b.f100775j, D)) {
                    mo101762h(i2, 63, 64);
                    mo101760f(eVar);
                    m123923d(bVar);
                } else {
                    mo101762h(i2, 15, 0);
                    mo101760f(eVar);
                }
                i4 = i5;
            }
        }

        /* renamed from: h */
        public final void mo101762h(int i, int i2, int i3) {
            if (i < i2) {
                this.f100792c.mo94715R0(i | i3);
                return;
            }
            this.f100792c.mo94715R0(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f100792c.mo94715R0(128 | (i4 & C11051p3.f31760d));
                i4 >>>= 7;
            }
            this.f100792c.mo94715R0(i4);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C43200b(int i, boolean z, C40672b bVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? C11398b.f33143v : i, (i2 & 2) != 0 ? true : z, bVar);
        }
    }
}

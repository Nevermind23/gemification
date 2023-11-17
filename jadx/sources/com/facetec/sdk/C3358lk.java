package com.facetec.sdk;

import com.salesforce.marketingcloud.C11398b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facetec.sdk.lk */
final class C3358lk {

    /* renamed from: b */
    static final Map<C3435mq, Integer> f11018b;

    /* renamed from: d */
    static final C3362lm[] f11019d;

    /* renamed from: com.facetec.sdk.lk$c */
    static final class C3359c {

        /* renamed from: a */
        int f11020a;

        /* renamed from: b */
        int f11021b;

        /* renamed from: c */
        boolean f11022c;

        /* renamed from: d */
        int f11023d;

        /* renamed from: e */
        final C3431mm f11024e;

        /* renamed from: f */
        int f11025f;

        /* renamed from: g */
        private final boolean f11026g;

        /* renamed from: h */
        C3362lm[] f11027h;

        /* renamed from: i */
        private int f11028i;

        /* renamed from: j */
        int f11029j;

        C3359c(C3431mm mmVar) {
            this(mmVar, (byte) 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo9711a(C3435mq mqVar) {
            if (this.f11026g) {
                C3389ls.m13520c();
                if (C3389ls.m13519b(mqVar) < mqVar.mo9906g()) {
                    C3431mm mmVar = new C3431mm();
                    C3389ls.m13520c();
                    C3389ls.m13518a(mqVar, mmVar);
                    C3435mq n = mmVar.mo9885n();
                    mo9714c(n.mo9906g(), C11051p3.f31760d, 128);
                    this.f11024e.mo9847c(n);
                    return;
                }
            }
            mo9714c(mqVar.mo9906g(), C11051p3.f31760d, 0);
            this.f11024e.mo9847c(mqVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo9712b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f11027h.length;
                while (true) {
                    length--;
                    i2 = this.f11029j;
                    if (length < i2 || i <= 0) {
                        C3362lm[] lmVarArr = this.f11027h;
                        System.arraycopy(lmVarArr, i2 + 1, lmVarArr, i2 + 1 + i3, this.f11028i);
                        C3362lm[] lmVarArr2 = this.f11027h;
                        int i4 = this.f11029j;
                        Arrays.fill(lmVarArr2, i4 + 1, i4 + 1 + i3, (Object) null);
                        this.f11029j += i3;
                    } else {
                        int i5 = this.f11027h[length].f11059j;
                        i -= i5;
                        this.f11025f -= i5;
                        this.f11028i--;
                        i3++;
                    }
                }
                C3362lm[] lmVarArr3 = this.f11027h;
                System.arraycopy(lmVarArr3, i2 + 1, lmVarArr3, i2 + 1 + i3, this.f11028i);
                C3362lm[] lmVarArr22 = this.f11027h;
                int i42 = this.f11029j;
                Arrays.fill(lmVarArr22, i42 + 1, i42 + 1 + i3, (Object) null);
                this.f11029j += i3;
            }
            return i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo9713c() {
            Arrays.fill(this.f11027h, (Object) null);
            this.f11029j = this.f11027h.length - 1;
            this.f11028i = 0;
            this.f11025f = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo9715d(C3362lm lmVar) {
            int i = lmVar.f11059j;
            int i2 = this.f11020a;
            if (i > i2) {
                mo9713c();
                return;
            }
            mo9712b((this.f11025f + i) - i2);
            int i3 = this.f11028i + 1;
            C3362lm[] lmVarArr = this.f11027h;
            if (i3 > lmVarArr.length) {
                C3362lm[] lmVarArr2 = new C3362lm[(lmVarArr.length << 1)];
                System.arraycopy(lmVarArr, 0, lmVarArr2, lmVarArr.length, lmVarArr.length);
                this.f11029j = this.f11027h.length - 1;
                this.f11027h = lmVarArr2;
            }
            int i4 = this.f11029j;
            this.f11029j = i4 - 1;
            this.f11027h[i4] = lmVar;
            this.f11028i++;
            this.f11025f += i;
        }

        private C3359c(C3431mm mmVar, byte b) {
            this.f11023d = Integer.MAX_VALUE;
            C3362lm[] lmVarArr = new C3362lm[8];
            this.f11027h = lmVarArr;
            this.f11029j = lmVarArr.length - 1;
            this.f11028i = 0;
            this.f11025f = 0;
            this.f11021b = C11398b.f33143v;
            this.f11020a = C11398b.f33143v;
            this.f11026g = true;
            this.f11024e = mmVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo9714c(int i, int i2, int i3) {
            if (i < i2) {
                this.f11024e.mo9870g(i | i3);
                return;
            }
            this.f11024e.mo9870g(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f11024e.mo9870g(128 | (i4 & C11051p3.f31760d));
                i4 >>>= 7;
            }
            this.f11024e.mo9870g(i4);
        }
    }

    /* renamed from: com.facetec.sdk.lk$d */
    static final class C3360d {

        /* renamed from: a */
        private final C3432mn f11030a;

        /* renamed from: b */
        private int f11031b;

        /* renamed from: c */
        private final List<C3362lm> f11032c;

        /* renamed from: d */
        private C3362lm[] f11033d;

        /* renamed from: e */
        private final int f11034e;

        /* renamed from: f */
        private int f11035f;

        /* renamed from: i */
        private int f11036i;

        /* renamed from: j */
        private int f11037j;

        C3360d(C3465nf nfVar, byte b) {
            this(nfVar);
        }

        /* renamed from: a */
        private static boolean m13409a(int i) {
            return i >= 0 && i <= C3358lk.f11019d.length - 1;
        }

        /* renamed from: b */
        private int m13410b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f11033d.length;
                while (true) {
                    length--;
                    i2 = this.f11037j;
                    if (length < i2 || i <= 0) {
                        C3362lm[] lmVarArr = this.f11033d;
                        System.arraycopy(lmVarArr, i2 + 1, lmVarArr, i2 + 1 + i3, this.f11036i);
                        this.f11037j += i3;
                    } else {
                        int i4 = this.f11033d[length].f11059j;
                        i -= i4;
                        this.f11035f -= i4;
                        this.f11036i--;
                        i3++;
                    }
                }
                C3362lm[] lmVarArr2 = this.f11033d;
                System.arraycopy(lmVarArr2, i2 + 1, lmVarArr2, i2 + 1 + i3, this.f11036i);
                this.f11037j += i3;
            }
            return i3;
        }

        /* renamed from: c */
        private void m13413c() {
            Arrays.fill(this.f11033d, (Object) null);
            this.f11037j = this.f11033d.length - 1;
            this.f11036i = 0;
            this.f11035f = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo9716d() {
            while (!this.f11030a.mo9864e()) {
                byte f = this.f11030a.mo9866f() & 255;
                if (f == 128) {
                    throw new IOException("index == 0");
                } else if ((f & 128) == 128) {
                    int d = m13414d(f, C11051p3.f31760d) - 1;
                    if (m13409a(d)) {
                        this.f11032c.add(C3358lk.f11019d[d]);
                    } else {
                        int c = m13412c(d - C3358lk.f11019d.length);
                        if (c >= 0) {
                            C3362lm[] lmVarArr = this.f11033d;
                            if (c < lmVarArr.length) {
                                this.f11032c.add(lmVarArr[c]);
                            }
                        }
                        StringBuilder sb = new StringBuilder("Header index too large ");
                        sb.append(d + 1);
                        throw new IOException(sb.toString());
                    }
                } else if (f == 64) {
                    m13416e(new C3362lm(C3358lk.m13402e(m13411b()), m13411b()));
                } else if ((f & 64) == 64) {
                    m13416e(new C3362lm(m13415e(m13414d(f, 63) - 1), m13411b()));
                } else if ((f & 32) == 32) {
                    int d2 = m13414d(f, 31);
                    this.f11031b = d2;
                    if (d2 < 0 || d2 > this.f11034e) {
                        StringBuilder sb2 = new StringBuilder("Invalid dynamic table size update ");
                        sb2.append(this.f11031b);
                        throw new IOException(sb2.toString());
                    }
                    int i = this.f11035f;
                    if (d2 < i) {
                        if (d2 == 0) {
                            m13413c();
                        } else {
                            m13410b(i - d2);
                        }
                    }
                } else if (f == 16 || f == 0) {
                    this.f11032c.add(new C3362lm(C3358lk.m13402e(m13411b()), m13411b()));
                } else {
                    this.f11032c.add(new C3362lm(m13415e(m13414d(f, 15) - 1), m13411b()));
                }
            }
        }

        /* renamed from: e */
        public final List<C3362lm> mo9717e() {
            ArrayList arrayList = new ArrayList(this.f11032c);
            this.f11032c.clear();
            return arrayList;
        }

        private C3360d(C3465nf nfVar) {
            this.f11032c = new ArrayList();
            C3362lm[] lmVarArr = new C3362lm[8];
            this.f11033d = lmVarArr;
            this.f11037j = lmVarArr.length - 1;
            this.f11036i = 0;
            this.f11035f = 0;
            this.f11034e = C11398b.f33143v;
            this.f11031b = C11398b.f33143v;
            this.f11030a = C3442mx.m13804a(nfVar);
        }

        /* renamed from: a */
        private int m13408a() {
            return this.f11030a.mo9866f() & 255;
        }

        /* renamed from: e */
        private C3435mq m13415e(int i) {
            if (m13409a(i)) {
                return C3358lk.f11019d[i].f11057f;
            }
            int c = m13412c(i - C3358lk.f11019d.length);
            if (c >= 0) {
                C3362lm[] lmVarArr = this.f11033d;
                if (c < lmVarArr.length) {
                    return lmVarArr[c].f11057f;
                }
            }
            StringBuilder sb = new StringBuilder("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        /* renamed from: c */
        private int m13412c(int i) {
            return this.f11037j + 1 + i;
        }

        /* renamed from: b */
        private C3435mq m13411b() {
            int a = m13408a();
            boolean z = (a & 128) == 128;
            int d = m13414d(a, C11051p3.f31760d);
            if (z) {
                return C3435mq.m13744d(C3389ls.m13520c().mo9761e(this.f11030a.mo9877i((long) d)));
            }
            return this.f11030a.mo9837a((long) d);
        }

        /* renamed from: e */
        private void m13416e(C3362lm lmVar) {
            this.f11032c.add(lmVar);
            int i = lmVar.f11059j;
            int i2 = this.f11031b;
            if (i > i2) {
                m13413c();
                return;
            }
            m13410b((this.f11035f + i) - i2);
            int i3 = this.f11036i + 1;
            C3362lm[] lmVarArr = this.f11033d;
            if (i3 > lmVarArr.length) {
                C3362lm[] lmVarArr2 = new C3362lm[(lmVarArr.length << 1)];
                System.arraycopy(lmVarArr, 0, lmVarArr2, lmVarArr.length, lmVarArr.length);
                this.f11037j = this.f11033d.length - 1;
                this.f11033d = lmVarArr2;
            }
            int i4 = this.f11037j;
            this.f11037j = i4 - 1;
            this.f11033d[i4] = lmVar;
            this.f11036i++;
            this.f11035f += i;
        }

        /* renamed from: d */
        private int m13414d(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int a = m13408a();
                if ((a & 128) == 0) {
                    return i2 + (a << i4);
                }
                i2 += (a & C11051p3.f31760d) << i4;
                i4 += 7;
            }
        }
    }

    static {
        C3362lm lmVar = new C3362lm(C3362lm.f11056g, "");
        int i = 0;
        C3435mq mqVar = C3362lm.f11054d;
        C3435mq mqVar2 = C3362lm.f11053c;
        C3435mq mqVar3 = C3362lm.f11052b;
        C3435mq mqVar4 = C3362lm.f11055e;
        C3362lm[] lmVarArr = {lmVar, new C3362lm(mqVar, "GET"), new C3362lm(mqVar, "POST"), new C3362lm(mqVar2, (String) C11110u2.f31950c), new C3362lm(mqVar2, "/index.html"), new C3362lm(mqVar3, "http"), new C3362lm(mqVar3, "https"), new C3362lm(mqVar4, "200"), new C3362lm(mqVar4, "204"), new C3362lm(mqVar4, "206"), new C3362lm(mqVar4, "304"), new C3362lm(mqVar4, "400"), new C3362lm(mqVar4, "404"), new C3362lm(mqVar4, "500"), new C3362lm("accept-charset", ""), new C3362lm("accept-encoding", "gzip, deflate"), new C3362lm("accept-language", ""), new C3362lm("accept-ranges", ""), new C3362lm("accept", ""), new C3362lm("access-control-allow-origin", ""), new C3362lm("age", ""), new C3362lm("allow", ""), new C3362lm("authorization", ""), new C3362lm("cache-control", ""), new C3362lm("content-disposition", ""), new C3362lm("content-encoding", ""), new C3362lm("content-language", ""), new C3362lm("content-length", ""), new C3362lm("content-location", ""), new C3362lm("content-range", ""), new C3362lm("content-type", ""), new C3362lm("cookie", ""), new C3362lm("date", ""), new C3362lm("etag", ""), new C3362lm("expect", ""), new C3362lm("expires", ""), new C3362lm("from", ""), new C3362lm("host", ""), new C3362lm("if-match", ""), new C3362lm("if-modified-since", ""), new C3362lm("if-none-match", ""), new C3362lm("if-range", ""), new C3362lm("if-unmodified-since", ""), new C3362lm("last-modified", ""), new C3362lm("link", ""), new C3362lm("location", ""), new C3362lm("max-forwards", ""), new C3362lm("proxy-authenticate", ""), new C3362lm("proxy-authorization", ""), new C3362lm("range", ""), new C3362lm("referer", ""), new C3362lm("refresh", ""), new C3362lm("retry-after", ""), new C3362lm("server", ""), new C3362lm("set-cookie", ""), new C3362lm("strict-transport-security", ""), new C3362lm("transfer-encoding", ""), new C3362lm("user-agent", ""), new C3362lm("vary", ""), new C3362lm("via", ""), new C3362lm("www-authenticate", "")};
        f11019d = lmVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(lmVarArr.length);
        while (true) {
            C3362lm[] lmVarArr2 = f11019d;
            if (i < lmVarArr2.length) {
                if (!linkedHashMap.containsKey(lmVarArr2[i].f11057f)) {
                    linkedHashMap.put(lmVarArr2[i].f11057f, Integer.valueOf(i));
                }
                i++;
            } else {
                f11018b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    /* renamed from: e */
    static C3435mq m13402e(C3435mq mqVar) {
        int g = mqVar.mo9906g();
        int i = 0;
        while (i < g) {
            byte e = mqVar.mo9902e(i);
            if (e < 65 || e > 90) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(mqVar.mo9903e());
                throw new IOException(sb.toString());
            }
        }
        return mqVar;
    }
}

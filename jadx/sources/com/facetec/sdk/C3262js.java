package com.facetec.sdk;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facetec.sdk.js */
public final class C3262js extends C3297kd {

    /* renamed from: a */
    private static final C3276jy f10656a = C3276jy.m13147b("application/x-www-form-urlencoded");

    /* renamed from: c */
    private final List<String> f10657c;

    /* renamed from: d */
    private final List<String> f10658d;

    /* renamed from: com.facetec.sdk.js$a */
    public static final class C3263a {

        /* renamed from: a */
        private final Charset f10659a;

        /* renamed from: b */
        private final List<String> f10660b;

        /* renamed from: c */
        private final List<String> f10661c;

        public C3263a() {
            this((byte) 0);
        }

        /* renamed from: b */
        public final C3263a mo9503b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f10661c.add(C3274jx.m13119e(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", this.f10659a));
                this.f10660b.add(C3274jx.m13119e(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", this.f10659a));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        /* renamed from: c */
        public final C3262js mo9504c() {
            return new C3262js(this.f10661c, this.f10660b);
        }

        private C3263a(byte b) {
            this.f10661c = new ArrayList();
            this.f10660b = new ArrayList();
            this.f10659a = null;
        }
    }

    C3262js(List<String> list, List<String> list2) {
        this.f10658d = C3303ki.m13264d(list);
        this.f10657c = C3303ki.m13264d(list2);
    }

    /* renamed from: c */
    private long m13063c(C3434mp mpVar, boolean z) {
        C3431mm mmVar;
        if (z) {
            mmVar = new C3431mm();
        } else {
            mmVar = mpVar.mo9851d();
        }
        int size = this.f10658d.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                mmVar.mo9870g(38);
            }
            mmVar.mo9860e(this.f10658d.get(i));
            mmVar.mo9870g(61);
            mmVar.mo9860e(this.f10657c.get(i));
        }
        if (!z) {
            return 0;
        }
        long a = mmVar.mo9835a();
        mmVar.mo9888q();
        return a;
    }

    /* renamed from: b */
    public final C3276jy mo9500b() {
        return f10656a;
    }

    /* renamed from: d */
    public final long mo9501d() {
        return m13063c((C3434mp) null, true);
    }

    /* renamed from: e */
    public final void mo9502e(C3434mp mpVar) {
        m13063c(mpVar, false);
    }
}

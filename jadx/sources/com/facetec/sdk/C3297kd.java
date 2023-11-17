package com.facetec.sdk;

import java.nio.charset.Charset;

/* renamed from: com.facetec.sdk.kd */
public abstract class C3297kd {
    /* renamed from: c */
    public static C3297kd m13213c(C3276jy jyVar, String str) {
        Charset charset = C3303ki.f10843e;
        if (jyVar != null) {
            Charset d = jyVar.mo9562d();
            if (d == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(jyVar);
                sb.append("; charset=utf-8");
                jyVar = C3276jy.m13148c(sb.toString());
            } else {
                charset = d;
            }
        }
        return m13214e(jyVar, str.getBytes(charset));
    }

    /* renamed from: e */
    public static C3297kd m13214e(C3276jy jyVar, byte[] bArr) {
        return m13215e(jyVar, bArr, bArr.length);
    }

    /* renamed from: b */
    public abstract C3276jy mo9500b();

    /* renamed from: d */
    public long mo9501d() {
        return -1;
    }

    /* renamed from: e */
    public abstract void mo9502e(C3434mp mpVar);

    /* renamed from: e */
    private static C3297kd m13215e(final C3276jy jyVar, final byte[] bArr, final int i) {
        if (bArr != null) {
            C3303ki.m13265d((long) bArr.length, (long) i);
            return new C3297kd() {

                /* renamed from: d */
                private /* synthetic */ int f10824d = 0;

                /* renamed from: b */
                public final C3276jy mo9500b() {
                    return C3276jy.this;
                }

                /* renamed from: d */
                public final long mo9501d() {
                    return (long) i;
                }

                /* renamed from: e */
                public final void mo9502e(C3434mp mpVar) {
                    mpVar.mo9854d(bArr, this.f10824d, i);
                }
            };
        }
        throw new NullPointerException("content == null");
    }
}

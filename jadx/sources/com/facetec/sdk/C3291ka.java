package com.facetec.sdk;

import java.io.Closeable;
import java.nio.charset.Charset;

/* renamed from: com.facetec.sdk.ka */
public abstract class C3291ka implements Closeable {
    /* renamed from: b */
    public abstract C3276jy mo9583b();

    /* renamed from: c */
    public abstract C3432mn mo9584c();

    public void close() {
        C3303ki.m13255b((Closeable) mo9584c());
    }

    /* renamed from: d */
    public abstract long mo9586d();

    /* renamed from: e */
    public final String mo9587e() {
        Charset charset;
        C3432mn c = mo9584c();
        try {
            C3276jy b = mo9583b();
            if (b != null) {
                charset = b.mo9561a(C3303ki.f10843e);
            } else {
                charset = C3303ki.f10843e;
            }
            return c.mo9842b(C3303ki.m13263d(c, charset));
        } finally {
            C3303ki.m13255b((Closeable) c);
        }
    }
}

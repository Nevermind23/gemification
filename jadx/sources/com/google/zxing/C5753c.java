package com.google.zxing;

import p200ob.C7507a;
import p200ob.C7508b;

/* renamed from: com.google.zxing.c */
public final class C5753c {

    /* renamed from: a */
    private final C5752b f18156a;

    /* renamed from: b */
    private C7508b f18157b;

    public C5753c(C5752b bVar) {
        if (bVar != null) {
            this.f18156a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C7508b mo18870a() {
        if (this.f18157b == null) {
            this.f18157b = this.f18156a.mo18865b();
        }
        return this.f18157b;
    }

    /* renamed from: b */
    public C7507a mo18871b(int i, C7507a aVar) {
        return this.f18156a.mo18866c(i, aVar);
    }

    /* renamed from: c */
    public int mo18872c() {
        return this.f18156a.mo18867d();
    }

    /* renamed from: d */
    public int mo18873d() {
        return this.f18156a.mo18869f();
    }

    /* renamed from: e */
    public boolean mo18874e() {
        return this.f18156a.mo18868e().mo18881f();
    }

    /* renamed from: f */
    public C5753c mo18875f() {
        return new C5753c(this.f18156a.mo18864a(this.f18156a.mo18868e().mo18882g()));
    }

    public String toString() {
        try {
            return mo18870a().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}

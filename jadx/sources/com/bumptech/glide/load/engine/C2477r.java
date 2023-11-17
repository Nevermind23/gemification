package com.bumptech.glide.load.engine;

import androidx.core.util.C1005e;
import p089g4.C6223k;
import p102h4.C6427a;
import p102h4.C6436c;
import p192o3.C7430c;

/* renamed from: com.bumptech.glide.load.engine.r */
final class C2477r implements C7430c, C6427a.C6433f {

    /* renamed from: h */
    private static final C1005e f7864h = C6427a.m25514d(20, new C2478a());

    /* renamed from: d */
    private final C6436c f7865d = C6436c.m25531a();

    /* renamed from: e */
    private C7430c f7866e;

    /* renamed from: f */
    private boolean f7867f;

    /* renamed from: g */
    private boolean f7868g;

    /* renamed from: com.bumptech.glide.load.engine.r$a */
    class C2478a implements C6427a.C6431d {
        C2478a() {
        }

        /* renamed from: a */
        public C2477r create() {
            return new C2477r();
        }
    }

    C2477r() {
    }

    /* renamed from: b */
    private void m9576b(C7430c cVar) {
        this.f7868g = false;
        this.f7867f = true;
        this.f7866e = cVar;
    }

    /* renamed from: e */
    static C2477r m9577e(C7430c cVar) {
        C2477r rVar = (C2477r) C6223k.m24730d((C2477r) f7864h.mo3440b());
        rVar.m9576b(cVar);
        return rVar;
    }

    /* renamed from: f */
    private void m9578f() {
        this.f7866e = null;
        f7864h.mo3439a(this);
    }

    /* renamed from: a */
    public int mo7941a() {
        return this.f7866e.mo7941a();
    }

    /* renamed from: c */
    public C6436c mo7881c() {
        return this.f7865d;
    }

    /* renamed from: d */
    public Class mo7944d() {
        return this.f7866e.mo7944d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void mo7955g() {
        this.f7865d.mo20310c();
        if (this.f7867f) {
            this.f7867f = false;
            if (this.f7868g) {
                recycle();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public Object get() {
        return this.f7866e.get();
    }

    public synchronized void recycle() {
        this.f7865d.mo20310c();
        this.f7868g = true;
        if (!this.f7867f) {
            this.f7866e.recycle();
            m9578f();
        }
    }
}

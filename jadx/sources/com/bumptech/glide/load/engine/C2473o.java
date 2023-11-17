package com.bumptech.glide.load.engine;

import p089g4.C6223k;
import p166m3.C7083e;
import p192o3.C7430c;

/* renamed from: com.bumptech.glide.load.engine.o */
class C2473o implements C7430c {

    /* renamed from: d */
    private final boolean f7851d;

    /* renamed from: e */
    private final boolean f7852e;

    /* renamed from: f */
    private final C7430c f7853f;

    /* renamed from: g */
    private final C2474a f7854g;

    /* renamed from: h */
    private final C7083e f7855h;

    /* renamed from: i */
    private int f7856i;

    /* renamed from: j */
    private boolean f7857j;

    /* renamed from: com.bumptech.glide.load.engine.o$a */
    interface C2474a {
        /* renamed from: c */
        void mo7904c(C7083e eVar, C2473o oVar);
    }

    C2473o(C7430c cVar, boolean z, boolean z2, C7083e eVar, C2474a aVar) {
        this.f7853f = (C7430c) C6223k.m24730d(cVar);
        this.f7851d = z;
        this.f7852e = z2;
        this.f7855h = eVar;
        this.f7854g = (C2474a) C6223k.m24730d(aVar);
    }

    /* renamed from: a */
    public int mo7941a() {
        return this.f7853f.mo7941a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo7942b() {
        if (!this.f7857j) {
            this.f7856i++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C7430c mo7943c() {
        return this.f7853f;
    }

    /* renamed from: d */
    public Class mo7944d() {
        return this.f7853f.mo7944d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo7945e() {
        return this.f7851d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo7946f() {
        boolean z;
        synchronized (this) {
            int i = this.f7856i;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f7856i = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f7854g.mo7904c(this.f7855h, this);
        }
    }

    public Object get() {
        return this.f7853f.get();
    }

    public synchronized void recycle() {
        if (this.f7856i > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f7857j) {
            this.f7857j = true;
            if (this.f7852e) {
                this.f7853f.recycle();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f7851d + ", listener=" + this.f7854g + ", key=" + this.f7855h + ", acquired=" + this.f7856i + ", isRecycled=" + this.f7857j + ", resource=" + this.f7853f + '}';
    }
}

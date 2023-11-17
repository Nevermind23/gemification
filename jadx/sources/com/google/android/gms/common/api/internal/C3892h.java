package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3847a;
import p156l6.C6948j;
import p156l6.C6951k0;
import p182n6.C7264i;
import p337z7.C9227g;

/* renamed from: com.google.android.gms.common.api.internal.h */
public abstract class C3892h {

    /* renamed from: a */
    private final Feature[] f12426a;

    /* renamed from: b */
    private final boolean f12427b;

    /* renamed from: c */
    private final int f12428c;

    /* renamed from: com.google.android.gms.common.api.internal.h$a */
    public static class C3893a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C6948j f12429a;

        /* renamed from: b */
        private boolean f12430b = true;

        /* renamed from: c */
        private Feature[] f12431c;

        /* renamed from: d */
        private int f12432d = 0;

        /* synthetic */ C3893a(C6951k0 k0Var) {
        }

        /* renamed from: a */
        public C3892h mo12077a() {
            C7264i.m27893b(this.f12429a != null, "execute parameter required");
            return new C3938y0(this, this.f12431c, this.f12430b, this.f12432d);
        }

        /* renamed from: b */
        public C3893a mo12078b(C6948j jVar) {
            this.f12429a = jVar;
            return this;
        }

        /* renamed from: c */
        public C3893a mo12079c(boolean z) {
            this.f12430b = z;
            return this;
        }

        /* renamed from: d */
        public C3893a mo12080d(Feature... featureArr) {
            this.f12431c = featureArr;
            return this;
        }

        /* renamed from: e */
        public C3893a mo12081e(int i) {
            this.f12432d = i;
            return this;
        }
    }

    protected C3892h(Feature[] featureArr, boolean z, int i) {
        this.f12426a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.f12427b = z2;
        this.f12428c = i;
    }

    /* renamed from: a */
    public static C3893a m14753a() {
        return new C3893a((C6951k0) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo12073b(C3847a.C3849b bVar, C9227g gVar);

    /* renamed from: c */
    public boolean mo12074c() {
        return this.f12427b;
    }

    /* renamed from: d */
    public final int mo12075d() {
        return this.f12428c;
    }

    /* renamed from: e */
    public final Feature[] mo12076e() {
        return this.f12426a;
    }
}

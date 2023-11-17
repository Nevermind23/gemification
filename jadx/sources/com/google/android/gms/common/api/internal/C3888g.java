package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C3877d;
import p156l6.C6936d0;
import p156l6.C6939e0;
import p156l6.C6941f0;
import p156l6.C6948j;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.common.api.internal.g */
public class C3888g {

    /* renamed from: a */
    public final C3885f f12391a;

    /* renamed from: b */
    public final C3896i f12392b;

    /* renamed from: c */
    public final Runnable f12393c;

    /* renamed from: com.google.android.gms.common.api.internal.g$a */
    public static class C3889a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C6948j f12394a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C6948j f12395b;

        /* renamed from: c */
        private Runnable f12396c = C6936d0.f20813d;

        /* renamed from: d */
        private C3877d f12397d;

        /* renamed from: e */
        private Feature[] f12398e;

        /* renamed from: f */
        private boolean f12399f = true;

        /* renamed from: g */
        private int f12400g;

        /* synthetic */ C3889a(C6939e0 e0Var) {
        }

        /* renamed from: a */
        public C3888g mo12063a() {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (this.f12394a != null) {
                z = true;
            } else {
                z = false;
            }
            C7264i.m27893b(z, "Must set register function");
            if (this.f12395b != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C7264i.m27893b(z2, "Must set unregister function");
            if (this.f12397d == null) {
                z3 = false;
            }
            C7264i.m27893b(z3, "Must set holder");
            return new C3888g(new C3934w0(this, this.f12397d, this.f12398e, this.f12399f, this.f12400g), new C3936x0(this, (C3877d.C3878a) C7264i.m27903l(this.f12397d.mo12042b(), "Key must not be null")), this.f12396c, (C6941f0) null);
        }

        /* renamed from: b */
        public C3889a mo12064b(C6948j jVar) {
            this.f12394a = jVar;
            return this;
        }

        /* renamed from: c */
        public C3889a mo12065c(int i) {
            this.f12400g = i;
            return this;
        }

        /* renamed from: d */
        public C3889a mo12066d(C6948j jVar) {
            this.f12395b = jVar;
            return this;
        }

        /* renamed from: e */
        public C3889a mo12067e(C3877d dVar) {
            this.f12397d = dVar;
            return this;
        }
    }

    /* synthetic */ C3888g(C3885f fVar, C3896i iVar, Runnable runnable, C6941f0 f0Var) {
        this.f12391a = fVar;
        this.f12392b = iVar;
        this.f12393c = runnable;
    }

    /* renamed from: a */
    public static C3889a m14719a() {
        return new C3889a((C6939e0) null);
    }
}

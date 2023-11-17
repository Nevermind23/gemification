package com.google.firebase.remoteconfig.internal;

import p251sa.C8283h;
import p251sa.C8284i;

/* renamed from: com.google.firebase.remoteconfig.internal.u */
public class C5469u implements C8283h {

    /* renamed from: a */
    private final long f17486a;

    /* renamed from: b */
    private final int f17487b;

    /* renamed from: c */
    private final C8284i f17488c;

    /* renamed from: com.google.firebase.remoteconfig.internal.u$b */
    public static class C5471b {

        /* renamed from: a */
        private long f17489a;

        /* renamed from: b */
        private int f17490b;

        /* renamed from: c */
        private C8284i f17491c;

        private C5471b() {
        }

        /* renamed from: a */
        public C5469u mo18152a() {
            return new C5469u(this.f17489a, this.f17490b, this.f17491c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C5471b mo18153b(C8284i iVar) {
            this.f17491c = iVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C5471b mo18154c(int i) {
            this.f17490b = i;
            return this;
        }

        /* renamed from: d */
        public C5471b mo18155d(long j) {
            this.f17489a = j;
            return this;
        }
    }

    /* renamed from: b */
    static C5471b m21788b() {
        return new C5471b();
    }

    /* renamed from: a */
    public int mo18151a() {
        return this.f17487b;
    }

    private C5469u(long j, int i, C8284i iVar) {
        this.f17486a = j;
        this.f17487b = i;
        this.f17488c = iVar;
    }
}

package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r7 */
final class C4383r7 extends C4417t7 {

    /* renamed from: g */
    final transient int f13631g;

    /* renamed from: h */
    final transient int f13632h;

    /* renamed from: i */
    final /* synthetic */ C4417t7 f13633i;

    C4383r7(C4417t7 t7Var, int i, int i2) {
        this.f13633i = t7Var;
        this.f13631g = i;
        this.f13632h = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo13420c() {
        return this.f13633i.mo13423g() + this.f13631g + this.f13632h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo13423g() {
        return this.f13633i.mo13423g() + this.f13631g;
    }

    public final Object get(int i) {
        C4111b7.m15556a(i, this.f13632h, "index");
        return this.f13633i.get(i + this.f13631g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo13424i() {
        return this.f13633i.mo13424i();
    }

    /* renamed from: k */
    public final C4417t7 mo13519k(int i, int i2) {
        C4111b7.m15558c(i, i2, this.f13632h);
        C4417t7 t7Var = this.f13633i;
        int i3 = this.f13631g;
        return t7Var.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f13632h;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}

package p157l7;

import java.util.List;

/* renamed from: l7.q */
final class C7004q extends C7005r {

    /* renamed from: f */
    final transient int f20878f;

    /* renamed from: g */
    final transient int f20879g;

    /* renamed from: h */
    final /* synthetic */ C7005r f20880h;

    C7004q(C7005r rVar, int i, int i2) {
        this.f20880h = rVar;
        this.f20878f = i;
        this.f20879g = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo21182c() {
        return this.f20880h.mo21184g() + this.f20878f + this.f20879g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo21184g() {
        return this.f20880h.mo21184g() + this.f20878f;
    }

    public final Object get(int i) {
        C6995k.m27122a(i, this.f20879g, "index");
        return this.f20880h.get(i + this.f20878f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo21185i() {
        return this.f20880h.mo21185i();
    }

    /* renamed from: k */
    public final C7005r mo21192k(int i, int i2) {
        C6995k.m27124c(i, i2, this.f20879g);
        C7005r rVar = this.f20880h;
        int i3 = this.f20878f;
        return rVar.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f20879g;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}

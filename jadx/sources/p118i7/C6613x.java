package p118i7;

import java.util.List;

/* renamed from: i7.x */
final class C6613x extends C6614y {

    /* renamed from: f */
    final transient int f20107f;

    /* renamed from: g */
    final transient int f20108g;

    /* renamed from: h */
    final /* synthetic */ C6614y f20109h;

    C6613x(C6614y yVar, int i, int i2) {
        this.f20109h = yVar;
        this.f20107f = i;
        this.f20108g = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo20605c() {
        return this.f20109h.mo20607g() + this.f20107f + this.f20108g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo20607g() {
        return this.f20109h.mo20607g() + this.f20107f;
    }

    public final Object get(int i) {
        C6608s.m25969a(i, this.f20108g, "index");
        return this.f20109h.get(i + this.f20107f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo20609k() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final Object[] mo20610l() {
        return this.f20109h.mo20610l();
    }

    /* renamed from: n */
    public final C6614y mo20617n(int i, int i2) {
        C6608s.m25971c(i, i2, this.f20108g);
        C6614y yVar = this.f20109h;
        int i3 = this.f20107f;
        return yVar.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f20108g;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}

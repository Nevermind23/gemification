package p105h7;

import java.util.List;

/* renamed from: h7.p */
final class C6466p extends C6467q {

    /* renamed from: g */
    final transient int f19775g;

    /* renamed from: h */
    final transient int f19776h;

    /* renamed from: i */
    final /* synthetic */ C6467q f19777i;

    C6466p(C6467q qVar, int i, int i2) {
        this.f19777i = qVar;
        this.f19775g = i;
        this.f19776h = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo20337c() {
        return this.f19777i.mo20339g() + this.f19775g + this.f19776h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo20339g() {
        return this.f19777i.mo20339g() + this.f19775g;
    }

    public final Object get(int i) {
        C6460j.m25554a(i, this.f19776h, "index");
        return this.f19777i.get(i + this.f19775g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo20340i() {
        return this.f19777i.mo20340i();
    }

    /* renamed from: k */
    public final C6467q mo20347k(int i, int i2) {
        C6460j.m25558e(i, i2, this.f19776h);
        C6467q qVar = this.f19777i;
        int i3 = this.f19775g;
        return qVar.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f19776h;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}

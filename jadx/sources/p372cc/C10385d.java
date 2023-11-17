package p372cc;

/* renamed from: cc.d */
final class C10385d {

    /* renamed from: a */
    private final int f29576a;

    /* renamed from: b */
    private final int f29577b;

    /* renamed from: c */
    private final int f29578c;

    /* renamed from: d */
    private final int f29579d;

    /* renamed from: e */
    private int f29580e = -1;

    C10385d(int i, int i2, int i3, int i4) {
        this.f29576a = i;
        this.f29577b = i2;
        this.f29578c = i3;
        this.f29579d = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo27019a() {
        return this.f29578c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo27020b() {
        return this.f29577b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo27021c() {
        return this.f29580e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo27022d() {
        return this.f29576a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo27023e() {
        return this.f29579d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo27024f() {
        return this.f29577b - this.f29576a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo27025g() {
        return mo27026h(this.f29580e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo27026h(int i) {
        return i != -1 && this.f29578c == (i % 3) * 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo27027i(int i) {
        this.f29580e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo27028j() {
        this.f29580e = ((this.f29579d / 30) * 3) + (this.f29578c / 3);
    }

    public String toString() {
        return this.f29580e + "|" + this.f29579d;
    }
}

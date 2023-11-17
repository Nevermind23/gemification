package p157l7;

/* renamed from: l7.v */
final class C7009v extends C7005r {

    /* renamed from: h */
    static final C7005r f20885h = new C7009v(new Object[0], 0);

    /* renamed from: f */
    final transient Object[] f20886f;

    /* renamed from: g */
    private final transient int f20887g;

    C7009v(Object[] objArr, int i) {
        this.f20886f = objArr;
        this.f20887g = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo21181b(Object[] objArr, int i) {
        System.arraycopy(this.f20886f, 0, objArr, 0, this.f20887g);
        return this.f20887g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo21182c() {
        return this.f20887g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo21184g() {
        return 0;
    }

    public final Object get(int i) {
        C6995k.m27122a(i, this.f20887g, "index");
        Object obj = this.f20886f[i];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo21185i() {
        return this.f20886f;
    }

    public final int size() {
        return this.f20887g;
    }
}

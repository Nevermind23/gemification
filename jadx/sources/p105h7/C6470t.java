package p105h7;

/* renamed from: h7.t */
final class C6470t extends C6467q {

    /* renamed from: i */
    static final C6467q f19783i = new C6470t(new Object[0], 0);

    /* renamed from: g */
    final transient Object[] f19784g;

    /* renamed from: h */
    private final transient int f19785h;

    C6470t(Object[] objArr, int i) {
        this.f19784g = objArr;
        this.f19785h = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo20336b(Object[] objArr, int i) {
        System.arraycopy(this.f19784g, 0, objArr, 0, this.f19785h);
        return this.f19785h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo20337c() {
        return this.f19785h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo20339g() {
        return 0;
    }

    public final Object get(int i) {
        C6460j.m25554a(i, this.f19785h, "index");
        Object obj = this.f19784g[i];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo20340i() {
        return this.f19784g;
    }

    public final int size() {
        return this.f19785h;
    }
}

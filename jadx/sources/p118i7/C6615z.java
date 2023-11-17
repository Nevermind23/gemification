package p118i7;

/* renamed from: i7.z */
final class C6615z extends C6614y {

    /* renamed from: h */
    static final C6614y f20111h = new C6615z(new Object[0], 0);

    /* renamed from: f */
    final transient Object[] f20112f;

    /* renamed from: g */
    private final transient int f20113g;

    C6615z(Object[] objArr, int i) {
        this.f20112f = objArr;
        this.f20113g = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo20604b(Object[] objArr, int i) {
        System.arraycopy(this.f20112f, 0, objArr, 0, this.f20113g);
        return this.f20113g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo20605c() {
        return this.f20113g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo20607g() {
        return 0;
    }

    public final Object get(int i) {
        C6608s.m25969a(i, this.f20113g, "index");
        Object obj = this.f20112f[i];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo20609k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final Object[] mo20610l() {
        return this.f20112f;
    }

    public final int size() {
        return this.f20113g;
    }
}

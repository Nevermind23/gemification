package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x7 */
final class C4484x7 extends C4417t7 {

    /* renamed from: i */
    static final C4417t7 f13803i = new C4484x7(new Object[0], 0);

    /* renamed from: g */
    final transient Object[] f13804g;

    /* renamed from: h */
    private final transient int f13805h;

    C4484x7(Object[] objArr, int i) {
        this.f13804g = objArr;
        this.f13805h = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo13419b(Object[] objArr, int i) {
        System.arraycopy(this.f13804g, 0, objArr, 0, this.f13805h);
        return this.f13805h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo13420c() {
        return this.f13805h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo13423g() {
        return 0;
    }

    public final Object get(int i) {
        C4111b7.m15556a(i, this.f13805h, "index");
        Object obj = this.f13804g[i];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo13424i() {
        return this.f13804g;
    }

    public final int size() {
        return this.f13805h;
    }
}

package com.facebook.login;

/* renamed from: com.facebook.login.d */
public enum C2674d {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    NATIVE_ONLY(true, true, false, false, false, true),
    KATANA_ONLY(false, true, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false),
    DIALOG_ONLY(false, true, true, false, true, true),
    DEVICE_AUTH(false, false, false, true, false, false);
    

    /* renamed from: d */
    private final boolean f8382d;

    /* renamed from: e */
    private final boolean f8383e;

    /* renamed from: f */
    private final boolean f8384f;

    /* renamed from: g */
    private final boolean f8385g;

    /* renamed from: h */
    private final boolean f8386h;

    /* renamed from: i */
    private final boolean f8387i;

    private C2674d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f8382d = z;
        this.f8383e = z2;
        this.f8384f = z3;
        this.f8385g = z4;
        this.f8386h = z5;
        this.f8387i = z6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo8438a() {
        return this.f8386h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo8439b() {
        return this.f8385g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo8440c() {
        return this.f8387i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo8441e() {
        return this.f8382d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo8442f() {
        return this.f8383e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo8443g() {
        return this.f8384f;
    }
}

package p554op;

/* renamed from: op.b */
public enum C17297b {
    ACTIVE("packages.compare.page.button.my.package", true, false, false),
    ELIGIBLE("text.packages.activate.button", false, true, false),
    BECOMESOLO("text.packages.solo.card.show.solo.button", false, false, true);
    

    /* renamed from: d */
    private final String f48589d;

    /* renamed from: e */
    private final boolean f48590e;

    /* renamed from: f */
    private final boolean f48591f;

    /* renamed from: g */
    private final boolean f48592g;

    private C17297b(String str, boolean z, boolean z2, boolean z3) {
        this.f48589d = str;
        this.f48590e = z;
        this.f48591f = z2;
        this.f48592g = z3;
    }

    /* renamed from: b */
    public final boolean mo44688b() {
        return this.f48591f;
    }

    /* renamed from: c */
    public final boolean mo44689c() {
        return this.f48592g;
    }

    /* renamed from: e */
    public final String mo44690e() {
        return this.f48589d;
    }

    /* renamed from: f */
    public final boolean mo44691f() {
        return this.f48590e;
    }
}

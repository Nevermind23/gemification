package p670xi;

/* renamed from: xi.c */
public enum C18766c {
    NORMAL(0, 0, 8, true),
    RESEND(0, 0, 0, true),
    WAITING(0, 8, 0, false),
    INCORRECT(8, 0, 0, true);
    

    /* renamed from: d */
    private final int f52455d;

    /* renamed from: e */
    private final int f52456e;

    /* renamed from: f */
    private final int f52457f;

    /* renamed from: g */
    private final boolean f52458g;

    private C18766c(int i, int i2, int i3, boolean z) {
        this.f52455d = i;
        this.f52456e = i2;
        this.f52457f = i3;
        this.f52458g = z;
    }

    /* renamed from: b */
    public final int mo46552b() {
        return this.f52456e;
    }

    /* renamed from: c */
    public final int mo46553c() {
        return this.f52455d;
    }

    /* renamed from: e */
    public final boolean mo46554e() {
        return this.f52458g;
    }

    /* renamed from: f */
    public final int mo46555f() {
        return this.f52457f;
    }
}

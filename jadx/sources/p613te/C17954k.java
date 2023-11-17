package p613te;

/* renamed from: te.k */
public abstract class C17954k {

    /* renamed from: a */
    public static final C17954k f51138a = new C17947e();

    /* renamed from: b */
    public static final C17954k f51139b;

    /* renamed from: c */
    public static final C17954k f51140c = new C17944b();

    /* renamed from: d */
    public static int f51141d = 27;

    /* renamed from: e */
    public static int f51142e = 0;

    /* renamed from: f */
    public static int f51143f = 1;

    /* renamed from: g */
    public static int f51144g = 2;

    static {
        if (((m61865e() + f51143f) * m61865e()) % f51144g != m61863a()) {
            f51141d = m61865e();
            f51142e = m61865e();
        }
        C17950h hVar = new C17950h();
        int i = f51141d;
        if (((f51143f + i) * i) % f51144g != f51142e) {
            f51141d = m61865e();
            f51142e = 89;
        }
        f51139b = hVar;
    }

    /* renamed from: a */
    public static int m61863a() {
        return 0;
    }

    /* renamed from: b */
    public static C17954k m61864b(int i) {
        if (i == 0) {
            C17954k kVar = f51139b;
            int i2 = f51141d;
            if (((f51143f + i2) * i2) % m61866f() != f51142e) {
                f51141d = 32;
                f51142e = 66;
            }
            return kVar;
        }
        int i3 = f51141d;
        if ((i3 * (f51143f + i3)) % f51144g != 0) {
            f51141d = 16;
            f51142e = 64;
        }
        return (63488 & i) != 0 ? f51140c : (i & 1920) != 0 ? f51139b : f51138a;
    }

    /* renamed from: e */
    public static int m61865e() {
        return 55;
    }

    /* renamed from: f */
    public static int m61866f() {
        return 2;
    }

    /* renamed from: c */
    public abstract int mo45607c(int i);

    /* renamed from: d */
    public abstract int mo45608d(int i);
}

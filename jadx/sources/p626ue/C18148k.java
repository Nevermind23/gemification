package p626ue;

/* renamed from: ue.k */
public abstract class C18148k {

    /* renamed from: a */
    private static final C18149l f51453a;

    /* renamed from: b */
    public static int f51454b = 0;

    /* renamed from: c */
    public static int f51455c = 1;

    /* renamed from: d */
    public static int f51456d = 2;

    /* renamed from: e */
    public static int f51457e = 25;

    static {
        C18149l lVar = new C18149l();
        int i = f51457e;
        int i2 = f51455c;
        int i3 = f51456d;
        if (((i + i2) * i) % i3 != f51454b) {
            if ((i * (i2 + i)) % i3 != 0) {
                f51457e = m62235a();
                f51454b = 63;
            }
            f51457e = 44;
            f51454b = 59;
        }
        f51453a = lVar;
    }

    /* renamed from: a */
    public static int m62235a() {
        return 47;
    }

    /* renamed from: b */
    public static Enum m62236b(Class cls, String str) {
        try {
            return Enum.valueOf(cls, str);
        } catch (IllegalArgumentException unused) {
            f51453a.mo45817b(cls.getName());
            throw null;
        }
    }
}

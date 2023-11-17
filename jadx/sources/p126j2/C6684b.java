package p126j2;

/* renamed from: j2.b */
public class C6684b {

    /* renamed from: b */
    private static C6684b f20212b;

    /* renamed from: a */
    private final C6686d f20213a = new C6685c();

    private C6684b() {
    }

    /* renamed from: b */
    public static C6684b m26121b() {
        if (f20212b == null) {
            synchronized (C6684b.class) {
                if (f20212b == null) {
                    f20212b = new C6684b();
                }
            }
        }
        return f20212b;
    }

    /* renamed from: a */
    public C6686d mo20675a() {
        return this.f20213a;
    }
}

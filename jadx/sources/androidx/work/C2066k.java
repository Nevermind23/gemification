package androidx.work;

/* renamed from: androidx.work.k */
public abstract class C2066k {

    /* renamed from: androidx.work.k$a */
    class C2067a extends C2066k {
        C2067a() {
        }

        /* renamed from: a */
        public C2065j mo6929a(String str) {
            return null;
        }
    }

    /* renamed from: c */
    public static C2066k m8061c() {
        return new C2067a();
    }

    /* renamed from: a */
    public abstract C2065j mo6929a(String str);

    /* renamed from: b */
    public final C2065j mo6930b(String str) {
        C2065j a = mo6929a(str);
        if (a == null) {
            return C2065j.m8059a(str);
        }
        return a;
    }
}

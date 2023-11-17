package p166m3;

import java.security.MessageDigest;
import p089g4.C6223k;

/* renamed from: m3.g */
public final class C7085g {

    /* renamed from: e */
    private static final C7087b f21044e = new C7086a();

    /* renamed from: a */
    private final Object f21045a;

    /* renamed from: b */
    private final C7087b f21046b;

    /* renamed from: c */
    private final String f21047c;

    /* renamed from: d */
    private volatile byte[] f21048d;

    /* renamed from: m3.g$a */
    class C7086a implements C7087b {
        C7086a() {
        }

        /* renamed from: a */
        public void mo8024a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: m3.g$b */
    public interface C7087b {
        /* renamed from: a */
        void mo8024a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private C7085g(String str, Object obj, C7087b bVar) {
        this.f21047c = C6223k.m24728b(str);
        this.f21045a = obj;
        this.f21046b = (C7087b) C6223k.m24730d(bVar);
    }

    /* renamed from: a */
    public static C7085g m27361a(String str, Object obj, C7087b bVar) {
        return new C7085g(str, obj, bVar);
    }

    /* renamed from: b */
    private static C7087b m27362b() {
        return f21044e;
    }

    /* renamed from: d */
    private byte[] m27363d() {
        if (this.f21048d == null) {
            this.f21048d = this.f21047c.getBytes(C7083e.f21042a);
        }
        return this.f21048d;
    }

    /* renamed from: e */
    public static C7085g m27364e(String str) {
        return new C7085g(str, (Object) null, m27362b());
    }

    /* renamed from: f */
    public static C7085g m27365f(String str, Object obj) {
        return new C7085g(str, obj, m27362b());
    }

    /* renamed from: c */
    public Object mo21307c() {
        return this.f21045a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7085g) {
            return this.f21047c.equals(((C7085g) obj).f21047c);
        }
        return false;
    }

    /* renamed from: g */
    public void mo21309g(Object obj, MessageDigest messageDigest) {
        this.f21046b.mo8024a(m27363d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f21047c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f21047c + '\'' + '}';
    }
}

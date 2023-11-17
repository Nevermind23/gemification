package p081f9;

import java.io.File;
import p133j9.C6762f;

/* renamed from: f9.c */
public class C6173c {

    /* renamed from: c */
    private static final C6175b f19148c = new C6175b();

    /* renamed from: a */
    private final C6762f f19149a;

    /* renamed from: b */
    private C6171a f19150b;

    /* renamed from: f9.c$b */
    private static final class C6175b implements C6171a {
        private C6175b() {
        }

        /* renamed from: a */
        public void mo19736a() {
        }

        /* renamed from: b */
        public String mo19737b() {
            return null;
        }

        /* renamed from: c */
        public byte[] mo19738c() {
            return null;
        }

        /* renamed from: d */
        public void mo19739d() {
        }

        /* renamed from: e */
        public void mo19740e(long j, String str) {
        }
    }

    public C6173c(C6762f fVar) {
        this.f19149a = fVar;
        this.f19150b = f19148c;
    }

    /* renamed from: d */
    private File m24600d(String str) {
        return this.f19149a.mo20802o(str, "userlog");
    }

    /* renamed from: a */
    public void mo19744a() {
        this.f19150b.mo19739d();
    }

    /* renamed from: b */
    public byte[] mo19745b() {
        return this.f19150b.mo19738c();
    }

    /* renamed from: c */
    public String mo19746c() {
        return this.f19150b.mo19737b();
    }

    /* renamed from: e */
    public final void mo19747e(String str) {
        this.f19150b.mo19736a();
        this.f19150b = f19148c;
        if (str != null) {
            mo19748f(m24600d(str), 65536);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo19748f(File file, int i) {
        this.f19150b = new C6183f(file, i);
    }

    /* renamed from: g */
    public void mo19749g(long j, String str) {
        this.f19150b.mo19740e(j, str);
    }

    public C6173c(C6762f fVar, String str) {
        this(fVar);
        mo19747e(str);
    }
}

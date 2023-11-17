package p027b9;

import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import p094g9.C6285b0;
import p094g9.C6335d0;
import p327y9.C9140a;
import p327y9.C9142b;

/* renamed from: b9.d */
public final class C2178d implements C2175a {

    /* renamed from: c */
    private static final C2185g f6368c = new C2180b();

    /* renamed from: a */
    private final C9140a f6369a;

    /* renamed from: b */
    private final AtomicReference f6370b = new AtomicReference((Object) null);

    /* renamed from: b9.d$b */
    private static final class C2180b implements C2185g {
        private C2180b() {
        }

        /* renamed from: a */
        public File mo7080a() {
            return null;
        }

        /* renamed from: b */
        public C6285b0.C6286a mo7081b() {
            return null;
        }

        /* renamed from: c */
        public File mo7082c() {
            return null;
        }

        /* renamed from: d */
        public File mo7083d() {
            return null;
        }

        /* renamed from: e */
        public File mo7084e() {
            return null;
        }

        /* renamed from: f */
        public File mo7085f() {
            return null;
        }

        /* renamed from: g */
        public File mo7086g() {
            return null;
        }
    }

    public C2178d(C9140a aVar) {
        this.f6369a = aVar;
        aVar.mo24710a(new C2176b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m8324g(C9142b bVar) {
        C2184f.m8346f().mo7089b("Crashlytics native component now available.");
        this.f6370b.set((C2175a) bVar.get());
    }

    /* renamed from: a */
    public C2185g mo7076a(String str) {
        C2175a aVar = (C2175a) this.f6370b.get();
        if (aVar == null) {
            return f6368c;
        }
        return aVar.mo7076a(str);
    }

    /* renamed from: b */
    public boolean mo7077b() {
        C2175a aVar = (C2175a) this.f6370b.get();
        if (aVar == null || !aVar.mo7077b()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo7078c(String str, String str2, long j, C6335d0 d0Var) {
        C2184f f = C2184f.m8346f();
        f.mo7095i("Deferring native open session: " + str);
        this.f6369a.mo24710a(new C2177c(str, str2, j, d0Var));
    }

    /* renamed from: d */
    public boolean mo7079d(String str) {
        C2175a aVar = (C2175a) this.f6370b.get();
        if (aVar == null || !aVar.mo7079d(str)) {
            return false;
        }
        return true;
    }
}

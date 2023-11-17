package p310x4;

import com.facebook.C2626d;
import p006a5.C0050b;
import p023b5.C2163a;
import p297w4.C8808k;
import p322y4.C9058a;
import p334z4.C9207a;

/* renamed from: x4.c */
public abstract class C8959c {

    /* renamed from: x4.c$a */
    static class C8960a implements C8808k.C8811c {
        C8960a() {
        }

        /* renamed from: a */
        public void mo8159a(boolean z) {
            if (z) {
                C9058a.m33542a();
                if (C8808k.m32797g(C8808k.C8812d.CrashShield)) {
                    C8953a.m33208a();
                    C9207a.m34022a();
                }
                if (C8808k.m32797g(C8808k.C8812d.ThreadCheck)) {
                    C2163a.m8282a();
                }
            }
        }
    }

    /* renamed from: x4.c$b */
    static class C8961b implements C8808k.C8811c {
        C8961b() {
        }

        /* renamed from: a */
        public void mo8159a(boolean z) {
            if (z) {
                C0050b.m188a();
            }
        }
    }

    /* renamed from: a */
    public static void m33224a() {
        if (C2626d.m10138i()) {
            C8808k.m32791a(C8808k.C8812d.CrashReport, new C8960a());
            C8808k.m32791a(C8808k.C8812d.ErrorReport, new C8961b());
        }
    }
}

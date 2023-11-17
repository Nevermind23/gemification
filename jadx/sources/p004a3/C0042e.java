package p004a3;

import java.util.concurrent.Executor;
import p243s2.C8103c;
import p308x2.C8950b;
import p320y2.C9035a;
import p320y2.C9041b;

/* renamed from: a3.e */
public final class C0042e implements C8950b {

    /* renamed from: a3.e$b */
    private static final class C0044b implements C9035a {
        private C0044b() {
        }

        /* renamed from: a */
        public void mo84a(C9035a.C9038c cVar, C9041b bVar, Executor executor, C9035a.C9036a aVar) {
            bVar.mo7191a(cVar.mo24519b().mo24523d(false).mo24521b(), executor, aVar);
        }

        public void dispose() {
        }
    }

    /* renamed from: a */
    public C9035a mo83a(C8103c cVar) {
        return new C0044b();
    }
}

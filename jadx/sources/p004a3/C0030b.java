package p004a3;

import com.apollographql.apollo.exception.ApolloException;
import java.util.concurrent.Executor;
import p243s2.C8103c;
import p308x2.C8950b;
import p320y2.C9035a;
import p320y2.C9041b;

/* renamed from: a3.b */
public final class C0030b implements C8950b {

    /* renamed from: a3.b$b */
    private static final class C0032b implements C9035a {

        /* renamed from: a */
        volatile boolean f70a;

        /* renamed from: a3.b$b$a */
        class C0033a implements C9035a.C9036a {

            /* renamed from: a */
            final /* synthetic */ C9035a.C9036a f71a;

            /* renamed from: b */
            final /* synthetic */ C9035a.C9038c f72b;

            /* renamed from: c */
            final /* synthetic */ C9041b f73c;

            /* renamed from: d */
            final /* synthetic */ Executor f74d;

            C0033a(C9035a.C9036a aVar, C9035a.C9038c cVar, C9041b bVar, Executor executor) {
                this.f71a = aVar;
                this.f72b = cVar;
                this.f73c = bVar;
                this.f74d = executor;
            }

            /* renamed from: a */
            public void mo90a() {
                this.f71a.mo90a();
            }

            /* renamed from: b */
            public void mo91b(C9035a.C9040d dVar) {
                this.f71a.mo91b(dVar);
            }

            /* renamed from: c */
            public void mo92c(C9035a.C9037b bVar) {
                this.f71a.mo92c(bVar);
            }

            /* renamed from: d */
            public void mo93d(ApolloException apolloException) {
                if (!C0032b.this.f70a) {
                    this.f73c.mo7191a(this.f72b.mo24519b().mo24523d(false).mo24521b(), this.f74d, this.f71a);
                }
            }
        }

        private C0032b() {
        }

        /* renamed from: a */
        public void mo84a(C9035a.C9038c cVar, C9041b bVar, Executor executor, C9035a.C9036a aVar) {
            bVar.mo7191a(cVar.mo24519b().mo24523d(true).mo24521b(), executor, new C0033a(aVar, cVar, bVar, executor));
        }

        public void dispose() {
            this.f70a = true;
        }
    }

    /* renamed from: a */
    public C9035a mo83a(C8103c cVar) {
        return new C0032b();
    }
}

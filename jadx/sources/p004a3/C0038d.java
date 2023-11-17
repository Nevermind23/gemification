package p004a3;

import com.apollographql.apollo.exception.ApolloException;
import java.util.concurrent.Executor;
import p243s2.C8103c;
import p308x2.C8950b;
import p320y2.C9035a;
import p320y2.C9041b;

/* renamed from: a3.d */
public final class C0038d implements C8950b {

    /* renamed from: a3.d$a */
    private static final class C0039a implements C9035a {

        /* renamed from: a */
        volatile boolean f79a;

        /* renamed from: b */
        final C8103c f80b;

        /* renamed from: a3.d$a$a */
        class C0040a implements C9035a.C9036a {

            /* renamed from: a */
            final /* synthetic */ C9035a.C9036a f81a;

            /* renamed from: b */
            final /* synthetic */ C9035a.C9038c f82b;

            /* renamed from: c */
            final /* synthetic */ C9041b f83c;

            /* renamed from: d */
            final /* synthetic */ Executor f84d;

            /* renamed from: a3.d$a$a$a */
            class C0041a implements C9035a.C9036a {

                /* renamed from: a */
                final /* synthetic */ ApolloException f86a;

                C0041a(ApolloException apolloException) {
                    this.f86a = apolloException;
                }

                /* renamed from: a */
                public void mo90a() {
                    C0040a.this.f81a.mo90a();
                }

                /* renamed from: b */
                public void mo91b(C9035a.C9040d dVar) {
                    C0040a.this.f81a.mo91b(dVar);
                }

                /* renamed from: c */
                public void mo92c(C9035a.C9037b bVar) {
                    C0040a.this.f81a.mo92c(bVar);
                }

                /* renamed from: d */
                public void mo93d(ApolloException apolloException) {
                    C0040a.this.f81a.mo93d(this.f86a);
                }
            }

            C0040a(C9035a.C9036a aVar, C9035a.C9038c cVar, C9041b bVar, Executor executor) {
                this.f81a = aVar;
                this.f82b = cVar;
                this.f83c = bVar;
                this.f84d = executor;
            }

            /* renamed from: a */
            public void mo90a() {
                this.f81a.mo90a();
            }

            /* renamed from: b */
            public void mo91b(C9035a.C9040d dVar) {
                this.f81a.mo91b(dVar);
            }

            /* renamed from: c */
            public void mo92c(C9035a.C9037b bVar) {
                this.f81a.mo92c(bVar);
            }

            /* renamed from: d */
            public void mo93d(ApolloException apolloException) {
                C0039a.this.f80b.mo23287b(apolloException, "Failed to fetch network response for operation %s, trying to return cached one", this.f82b.f25169b);
                if (!C0039a.this.f79a) {
                    this.f83c.mo7191a(this.f82b.mo24519b().mo24523d(true).mo24521b(), this.f84d, new C0041a(apolloException));
                }
            }
        }

        C0039a(C8103c cVar) {
            this.f80b = cVar;
        }

        /* renamed from: a */
        public void mo84a(C9035a.C9038c cVar, C9041b bVar, Executor executor, C9035a.C9036a aVar) {
            bVar.mo7191a(cVar.mo24519b().mo24523d(false).mo24521b(), executor, new C0040a(aVar, cVar, bVar, executor));
        }

        public void dispose() {
            this.f79a = true;
        }
    }

    /* renamed from: a */
    public C9035a mo83a(C8103c cVar) {
        return new C0039a(cVar);
    }
}

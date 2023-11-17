package p004a3;

import com.apollographql.apollo.exception.ApolloException;
import java.util.Collection;
import java.util.concurrent.Executor;
import of1.C41880d0;
import p217q2.C7836g;
import p217q2.C7843j;
import p243s2.C8103c;
import p308x2.C8950b;
import p320y2.C9035a;
import p320y2.C9041b;

/* renamed from: a3.c */
public final class C0034c implements C8950b {

    /* renamed from: a3.c$b */
    private static final class C0036b implements C9035a {

        /* renamed from: a3.c$b$a */
        class C0037a implements C9035a.C9036a {

            /* renamed from: a */
            final /* synthetic */ C9035a.C9036a f76a;

            /* renamed from: b */
            final /* synthetic */ C9035a.C9038c f77b;

            C0037a(C9035a.C9036a aVar, C9035a.C9038c cVar) {
                this.f76a = aVar;
                this.f77b = cVar;
            }

            /* renamed from: a */
            public void mo90a() {
                this.f76a.mo90a();
            }

            /* renamed from: b */
            public void mo91b(C9035a.C9040d dVar) {
                this.f76a.mo91b(dVar);
            }

            /* renamed from: c */
            public void mo92c(C9035a.C9037b bVar) {
                this.f76a.mo92c(bVar);
            }

            /* renamed from: d */
            public void mo93d(ApolloException apolloException) {
                this.f76a.mo91b(C0036b.this.mo94b(this.f77b.f25169b));
                this.f76a.mo90a();
            }
        }

        private C0036b() {
        }

        /* renamed from: a */
        public void mo84a(C9035a.C9038c cVar, C9041b bVar, Executor executor, C9035a.C9036a aVar) {
            bVar.mo7191a(cVar.mo24519b().mo24523d(true).mo24521b(), executor, new C0037a(aVar, cVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C9035a.C9040d mo94b(C7836g gVar) {
            return new C9035a.C9040d((C41880d0) null, C7843j.m29754a(gVar).mo22795f(true).mo22790a(), (Collection) null);
        }

        public void dispose() {
        }
    }

    /* renamed from: a */
    public C9035a mo83a(C8103c cVar) {
        return new C0036b();
    }
}

package p034c3;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.ApolloParseException;
import java.io.Closeable;
import java.util.concurrent.Executor;
import of1.C41880d0;
import p101h3.C6422a;
import p217q2.C7836g;
import p217q2.C7843j;
import p217q2.C7851m;
import p230r2.C8044a;
import p243s2.C8103c;
import p243s2.C8120m;
import p295w2.C8744b;
import p320y2.C9035a;
import p320y2.C9041b;

/* renamed from: c3.c */
public final class C2240c implements C9035a {

    /* renamed from: a */
    private final C8744b f6950a;

    /* renamed from: b */
    private final C8120m f6951b;

    /* renamed from: c */
    private final C7851m f6952c;

    /* renamed from: d */
    private final C8103c f6953d;

    /* renamed from: e */
    volatile boolean f6954e;

    /* renamed from: c3.c$a */
    class C2241a implements C9035a.C9036a {

        /* renamed from: a */
        final /* synthetic */ C9035a.C9038c f6955a;

        /* renamed from: b */
        final /* synthetic */ C9035a.C9036a f6956b;

        C2241a(C9035a.C9038c cVar, C9035a.C9036a aVar) {
            this.f6955a = cVar;
            this.f6956b = aVar;
        }

        /* renamed from: a */
        public void mo90a() {
        }

        /* renamed from: b */
        public void mo91b(C9035a.C9040d dVar) {
            try {
                if (!C2240c.this.f6954e) {
                    this.f6956b.mo91b(C2240c.this.mo7183c(this.f6955a.f25169b, (C41880d0) dVar.f25185a.mo23278e()));
                    this.f6956b.mo90a();
                }
            } catch (ApolloException e) {
                mo93d(e);
            }
        }

        /* renamed from: c */
        public void mo92c(C9035a.C9037b bVar) {
            this.f6956b.mo92c(bVar);
        }

        /* renamed from: d */
        public void mo93d(ApolloException apolloException) {
            if (!C2240c.this.f6954e) {
                this.f6956b.mo93d(apolloException);
            }
        }
    }

    public C2240c(C8044a aVar, C8744b bVar, C8120m mVar, C7851m mVar2, C8103c cVar) {
        this.f6950a = bVar;
        this.f6951b = mVar;
        this.f6952c = mVar2;
        this.f6953d = cVar;
    }

    /* renamed from: b */
    private static void m8537b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo84a(C9035a.C9038c cVar, C9041b bVar, Executor executor, C9035a.C9036a aVar) {
        if (!this.f6954e) {
            bVar.mo7191a(cVar, executor, new C2241a(cVar, aVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C9035a.C9040d mo7183c(C7836g gVar, C41880d0 d0Var) {
        boolean z;
        d0Var.mo96742e0().mo96675d("X-APOLLO-CACHE-KEY");
        if (d0Var.mo96752u0()) {
            try {
                C7843j.C7844a e = new C6422a(gVar, this.f6951b, this.f6952c, this.f6950a).mo20300a(d0Var.mo96739a().mo21304t()).mo22787e();
                if (d0Var.mo96745n() != null) {
                    z = true;
                } else {
                    z = false;
                }
                C7843j a = e.mo22795f(z).mo22790a();
                boolean d = a.mo22786d();
                return new C9035a.C9040d(d0Var, a, this.f6950a.mo24154k());
            } catch (Exception e2) {
                this.f6953d.mo23289d(e2, "Failed to parse network response for operation: %s", gVar);
                m8537b(d0Var);
                throw new ApolloParseException("Failed to parse http response", e2);
            }
        } else {
            this.f6953d.mo23288c("Failed to parse network response: %s", d0Var);
            throw new ApolloHttpException(d0Var);
        }
    }

    public void dispose() {
        this.f6954e = true;
    }
}

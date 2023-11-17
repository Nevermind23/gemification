package p034c3;

import com.apollographql.apollo.exception.ApolloException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p217q2.C7830c;
import p217q2.C7843j;
import p243s2.C8103c;
import p243s2.C8105e;
import p243s2.C8115i;
import p320y2.C9035a;
import p320y2.C9041b;

/* renamed from: c3.a */
public class C2229a implements C9035a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8103c f6918a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile boolean f6919b;

    /* renamed from: c */
    final boolean f6920c;

    /* renamed from: c3.a$a */
    class C2230a implements C9035a.C9036a {

        /* renamed from: a */
        final /* synthetic */ C9035a.C9038c f6921a;

        /* renamed from: b */
        final /* synthetic */ C9041b f6922b;

        /* renamed from: c */
        final /* synthetic */ Executor f6923c;

        /* renamed from: d */
        final /* synthetic */ C9035a.C9036a f6924d;

        C2230a(C9035a.C9038c cVar, C9041b bVar, Executor executor, C9035a.C9036a aVar) {
            this.f6921a = cVar;
            this.f6922b = bVar;
            this.f6923c = executor;
            this.f6924d = aVar;
        }

        /* renamed from: a */
        public void mo90a() {
        }

        /* renamed from: b */
        public void mo91b(C9035a.C9040d dVar) {
            if (!C2229a.this.f6919b) {
                C8115i d = C2229a.this.mo7165d(this.f6921a, dVar);
                if (d.mo23280f()) {
                    this.f6922b.mo7191a((C9035a.C9038c) d.mo23278e(), this.f6923c, this.f6924d);
                    return;
                }
                this.f6924d.mo91b(dVar);
                this.f6924d.mo90a();
            }
        }

        /* renamed from: c */
        public void mo92c(C9035a.C9037b bVar) {
            this.f6924d.mo92c(bVar);
        }

        /* renamed from: d */
        public void mo93d(ApolloException apolloException) {
            this.f6924d.mo93d(apolloException);
        }
    }

    /* renamed from: c3.a$b */
    class C2231b implements C8105e {

        /* renamed from: a */
        final /* synthetic */ C9035a.C9038c f6926a;

        C2231b(C9035a.C9038c cVar) {
            this.f6926a = cVar;
        }

        /* renamed from: a */
        public C8115i apply(C7843j jVar) {
            if (jVar.mo22786d()) {
                if (C2229a.this.mo7166e(jVar.mo22785c())) {
                    C8103c c = C2229a.this.f6918a;
                    c.mo23290f("GraphQL server couldn't find Automatic Persisted Query for operation name: " + this.f6926a.f25169b.name().name() + " id: " + this.f6926a.f25169b.operationId(), new Object[0]);
                    return C8115i.m30670h(this.f6926a);
                } else if (C2229a.this.mo7167f(jVar.mo22785c())) {
                    C2229a.this.f6918a.mo23288c("GraphQL server doesn't support Automatic Persisted Queries", new Object[0]);
                    return C8115i.m30670h(this.f6926a);
                }
            }
            return C8115i.m30668a();
        }
    }

    public C2229a(C8103c cVar, boolean z) {
        this.f6918a = cVar;
        this.f6920c = z;
    }

    /* renamed from: a */
    public void mo84a(C9035a.C9038c cVar, C9041b bVar, Executor executor, C9035a.C9036a aVar) {
        boolean z = false;
        C9035a.C9038c.C9039a a = cVar.mo24519b().mo24527h(false).mo24520a(true);
        if (cVar.f25175h || this.f6920c) {
            z = true;
        }
        bVar.mo7191a(a.mo24528i(z).mo24521b(), executor, new C2230a(cVar, bVar, executor, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C8115i mo7165d(C9035a.C9038c cVar, C9035a.C9040d dVar) {
        return dVar.f25186b.mo23277c(new C2231b(cVar));
    }

    public void dispose() {
        this.f6919b = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo7166e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ("PersistedQueryNotFound".equalsIgnoreCase(((C7830c) it.next()).mo22756b())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo7167f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ("PersistedQueryNotSupported".equalsIgnoreCase(((C7830c) it.next()).mo22756b())) {
                return true;
            }
        }
        return false;
    }
}

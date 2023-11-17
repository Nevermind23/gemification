package p034c3;

import com.apollographql.apollo.exception.ApolloException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import of1.C41880d0;
import p217q2.C7836g;
import p217q2.C7843j;
import p243s2.C8103c;
import p243s2.C8105e;
import p243s2.C8115i;
import p243s2.C8120m;
import p243s2.C8140s;
import p282v2.C8687a;
import p282v2.C8693c;
import p295w2.C8744b;
import p295w2.C8746c;
import p295w2.C8747d;
import p320y2.C9035a;
import p320y2.C9041b;

/* renamed from: c3.b */
public final class C2232b implements C9035a {

    /* renamed from: a */
    final C8687a f6928a;

    /* renamed from: b */
    private final C8120m f6929b;

    /* renamed from: c */
    private final Executor f6930c;

    /* renamed from: d */
    final C8103c f6931d;

    /* renamed from: e */
    volatile boolean f6932e;

    /* renamed from: c3.b$a */
    class C2233a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C9035a.C9038c f6933d;

        /* renamed from: e */
        final /* synthetic */ C9035a.C9036a f6934e;

        /* renamed from: f */
        final /* synthetic */ C9041b f6935f;

        /* renamed from: g */
        final /* synthetic */ Executor f6936g;

        /* renamed from: c3.b$a$a */
        class C2234a implements C9035a.C9036a {
            C2234a() {
            }

            /* renamed from: a */
            public void mo90a() {
            }

            /* renamed from: b */
            public void mo91b(C9035a.C9040d dVar) {
                if (!C2232b.this.f6932e) {
                    try {
                        C2233a aVar = C2233a.this;
                        Set b = C2232b.this.mo7170b(dVar, aVar.f6933d);
                        C2233a aVar2 = C2233a.this;
                        Set e = C2232b.this.mo7173e(aVar2.f6933d);
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(e);
                        hashSet.addAll(b);
                        C2232b.this.mo7171c(hashSet);
                        C2233a.this.f6934e.mo91b(dVar);
                        C2233a.this.f6934e.mo90a();
                    } catch (Exception e2) {
                        C2233a aVar3 = C2233a.this;
                        C2232b.this.mo7174f(aVar3.f6933d);
                        throw e2;
                    }
                }
            }

            /* renamed from: c */
            public void mo92c(C9035a.C9037b bVar) {
                C2233a.this.f6934e.mo92c(bVar);
            }

            /* renamed from: d */
            public void mo93d(ApolloException apolloException) {
                C2233a aVar = C2233a.this;
                C2232b.this.mo7174f(aVar.f6933d);
                C2233a.this.f6934e.mo93d(apolloException);
            }
        }

        C2233a(C9035a.C9038c cVar, C9035a.C9036a aVar, C9041b bVar, Executor executor) {
            this.f6933d = cVar;
            this.f6934e = aVar;
            this.f6935f = bVar;
            this.f6936g = executor;
        }

        public void run() {
            if (!C2232b.this.f6932e) {
                C9035a.C9038c cVar = this.f6933d;
                if (cVar.f25172e) {
                    this.f6934e.mo92c(C9035a.C9037b.CACHE);
                    try {
                        this.f6934e.mo91b(C2232b.this.mo7172d(this.f6933d));
                        this.f6934e.mo90a();
                    } catch (ApolloException e) {
                        this.f6934e.mo93d(e);
                    }
                } else {
                    C2232b.this.mo7175g(cVar);
                    this.f6935f.mo7191a(this.f6933d, this.f6936g, new C2234a());
                }
            }
        }
    }

    /* renamed from: c3.b$b */
    class C2235b implements C8105e {

        /* renamed from: a */
        final /* synthetic */ C9035a.C9038c f6939a;

        C2235b(C9035a.C9038c cVar) {
            this.f6939a = cVar;
        }

        /* renamed from: a */
        public List apply(Collection collection) {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((C8693c) it.next()).mo24077a().mo24079b(this.f6939a.f25168a).mo24078a());
            }
            return arrayList;
        }
    }

    /* renamed from: c3.b$c */
    class C2236c implements C8746c {

        /* renamed from: a */
        final /* synthetic */ C8115i f6941a;

        /* renamed from: b */
        final /* synthetic */ C9035a.C9038c f6942b;

        C2236c(C8115i iVar, C9035a.C9038c cVar) {
            this.f6941a = iVar;
            this.f6942b = cVar;
        }

        /* renamed from: b */
        public Set mo7178a(C8747d dVar) {
            return dVar.mo24152e((Collection) this.f6941a.mo23278e(), this.f6942b.f25170c);
        }
    }

    /* renamed from: c3.b$d */
    class C2237d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C9035a.C9038c f6944d;

        C2237d(C9035a.C9038c cVar) {
            this.f6944d = cVar;
        }

        public void run() {
            try {
                if (this.f6944d.f25173f.mo23280f()) {
                    C8687a aVar = C2232b.this.f6928a;
                    C9035a.C9038c cVar = this.f6944d;
                    aVar.mo24068f(cVar.f25169b, (C7836g.C7838b) this.f6944d.f25173f.mo23278e(), cVar.f25168a).mo24072c();
                }
            } catch (Exception e) {
                C2232b.this.f6931d.mo23289d(e, "failed to write operation optimistic updates, for: %s", this.f6944d.f25169b);
            }
        }
    }

    /* renamed from: c3.b$e */
    class C2238e implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C9035a.C9038c f6946d;

        C2238e(C9035a.C9038c cVar) {
            this.f6946d = cVar;
        }

        public void run() {
            try {
                C2232b.this.f6928a.mo24069g(this.f6946d.f25168a).mo24072c();
            } catch (Exception e) {
                C2232b.this.f6931d.mo23289d(e, "failed to rollback operation optimistic updates, for: %s", this.f6946d.f25169b);
            }
        }
    }

    /* renamed from: c3.b$f */
    class C2239f implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Set f6948d;

        C2239f(Set set) {
            this.f6948d = set;
        }

        public void run() {
            try {
                C2232b.this.f6928a.mo24071i(this.f6948d);
            } catch (Exception e) {
                C2232b.this.f6931d.mo23289d(e, "Failed to publish cache changes", new Object[0]);
            }
        }
    }

    public C2232b(C8687a aVar, C8120m mVar, Executor executor, C8103c cVar) {
        this.f6928a = (C8687a) C8140s.m30754b(aVar, "cache == null");
        this.f6929b = (C8120m) C8140s.m30754b(mVar, "responseFieldMapper == null");
        this.f6930c = (Executor) C8140s.m30754b(executor, "dispatcher == null");
        this.f6931d = (C8103c) C8140s.m30754b(cVar, "logger == null");
    }

    /* renamed from: a */
    public void mo84a(C9035a.C9038c cVar, C9041b bVar, Executor executor, C9035a.C9036a aVar) {
        executor.execute(new C2233a(cVar, aVar, bVar, executor));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set mo7170b(C9035a.C9040d dVar, C9035a.C9038c cVar) {
        C8115i g = dVar.f25187c.mo23281g(new C2235b(cVar));
        if (!g.mo23280f()) {
            return Collections.emptySet();
        }
        try {
            return (Set) this.f6928a.mo24064a(new C2236c(g, cVar));
        } catch (Exception e) {
            this.f6931d.mo23288c("Failed to cache operation response", e);
            return Collections.emptySet();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7171c(Set set) {
        this.f6930c.execute(new C2239f(set));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C9035a.C9040d mo7172d(C9035a.C9038c cVar) {
        C8744b b = this.f6928a.mo24065b();
        C7843j jVar = (C7843j) this.f6928a.mo24066c(cVar.f25169b, this.f6929b, b, cVar.f25170c).mo24072c();
        if (jVar.mo22784b() != null) {
            this.f6931d.mo23286a("Cache HIT for operation %s", cVar.f25169b);
            return new C9035a.C9040d((C41880d0) null, jVar, b.mo24154k());
        }
        this.f6931d.mo23286a("Cache MISS for operation %s", cVar.f25169b);
        throw new ApolloException(String.format("Cache miss for operation %s", new Object[]{cVar.f25169b}));
    }

    public void dispose() {
        this.f6932e = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Set mo7173e(C9035a.C9038c cVar) {
        try {
            return (Set) this.f6928a.mo24070h(cVar.f25168a).mo24072c();
        } catch (Exception e) {
            this.f6931d.mo23289d(e, "failed to rollback operation optimistic updates, for: %s", cVar.f25169b);
            return Collections.emptySet();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo7174f(C9035a.C9038c cVar) {
        this.f6930c.execute(new C2238e(cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo7175g(C9035a.C9038c cVar) {
        this.f6930c.execute(new C2237d(cVar));
    }
}

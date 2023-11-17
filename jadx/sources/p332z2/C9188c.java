package p332z2;

import android.support.p013v4.media.session.C0125b;
import com.apollographql.apollo.exception.ApolloException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import of1.C41882e;
import of1.C41931v;
import p204p2.C7664a;
import p217q2.C7841h;
import p217q2.C7842i;
import p217q2.C7843j;
import p217q2.C7851m;
import p230r2.C8045b;
import p243s2.C8103c;
import p269u2.C8550a;
import p282v2.C8687a;
import p308x2.C8949a;

/* renamed from: z2.c */
final class C9188c {

    /* renamed from: a */
    final C8103c f25545a;

    /* renamed from: b */
    private final List f25546b;

    /* renamed from: c */
    private List f25547c;

    /* renamed from: d */
    private C9185a f25548d;

    /* renamed from: e */
    private final AtomicBoolean f25549e = new AtomicBoolean();

    /* renamed from: z2.c$a */
    class C9189a extends C7664a.C7665a {

        /* renamed from: a */
        final /* synthetic */ AtomicInteger f25550a;

        /* renamed from: b */
        final /* synthetic */ C9192d f25551b;

        C9189a(AtomicInteger atomicInteger, C9191c cVar, C9192d dVar) {
            this.f25550a = atomicInteger;
            this.f25551b = dVar;
        }

        /* renamed from: b */
        public void mo20503b(ApolloException apolloException) {
            C8103c cVar = C9188c.this.f25545a;
            if (cVar != null) {
                cVar.mo23289d(apolloException, "Failed to fetch query: %s", this.f25551b.f25564a);
            }
            this.f25550a.decrementAndGet();
        }

        /* renamed from: f */
        public void mo20504f(C7843j jVar) {
            this.f25550a.decrementAndGet();
        }
    }

    /* renamed from: z2.c$b */
    static final class C9190b {

        /* renamed from: a */
        List f25553a = Collections.emptyList();

        /* renamed from: b */
        List f25554b = Collections.emptyList();

        /* renamed from: c */
        C41931v f25555c;

        /* renamed from: d */
        C41882e.C41883a f25556d;

        /* renamed from: e */
        C9198e f25557e;

        /* renamed from: f */
        C7851m f25558f;

        /* renamed from: g */
        C8687a f25559g;

        /* renamed from: h */
        Executor f25560h;

        /* renamed from: i */
        C8103c f25561i;

        /* renamed from: j */
        List f25562j;

        /* renamed from: k */
        C9185a f25563k;

        C9190b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C9190b mo24795a(C8687a aVar) {
            this.f25559g = aVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C9190b mo24796b(List list) {
            this.f25562j = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C9188c mo24797c() {
            return new C9188c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C9190b mo24798d(C9185a aVar) {
            this.f25563k = aVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C9190b mo24799e(Executor executor) {
            this.f25560h = executor;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C9190b mo24800f(C41882e.C41883a aVar) {
            this.f25556d = aVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C9190b mo24801g(C8103c cVar) {
            this.f25561i = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C9190b mo24802h(List list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            this.f25553a = list;
            return this;
        }

        /* renamed from: i */
        public C9190b mo24803i(List list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            this.f25554b = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C9190b mo24804j(C9198e eVar) {
            this.f25557e = eVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C9190b mo24805k(C7851m mVar) {
            this.f25558f = mVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C9190b mo24806l(C41931v vVar) {
            this.f25555c = vVar;
            return this;
        }
    }

    /* renamed from: z2.c$c */
    interface C9191c {
    }

    C9188c(C9190b bVar) {
        this.f25545a = bVar.f25561i;
        this.f25546b = new ArrayList(bVar.f25553a.size());
        for (C7842i k : bVar.f25553a) {
            this.f25546b.add(C9192d.m33969e().mo24825k(k).mo24833s(bVar.f25555c).mo24823i(bVar.f25556d).mo24831q(bVar.f25557e).mo24832r(bVar.f25558f).mo24815a(bVar.f25559g).mo24822h(C8045b.f23193b).mo24830p(C8949a.f24955b).mo24818d(C8550a.f24290b).mo24824j(bVar.f25561i).mo24816b(bVar.f25562j).mo24834t(bVar.f25563k).mo24819e(bVar.f25560h).mo24817c());
        }
        this.f25547c = bVar.f25554b;
        this.f25548d = bVar.f25563k;
    }

    /* renamed from: a */
    static C9190b m33949a() {
        return new C9190b();
    }

    /* renamed from: d */
    private void m33950d() {
        AtomicInteger atomicInteger = new AtomicInteger(this.f25546b.size());
        for (C9192d dVar : this.f25546b) {
            dVar.mo22367b(new C9189a(atomicInteger, (C9191c) null, dVar));
        }
    }

    /* renamed from: e */
    private void m33951e() {
        try {
            for (C7841h b : this.f25547c) {
                Iterator it = this.f25548d.mo24787b(b).iterator();
                if (it.hasNext()) {
                    C0125b.m366a(it.next());
                    throw null;
                }
            }
        } catch (Exception e) {
            this.f25545a.mo23289d(e, "Failed to re-fetch query watcher", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo24793b() {
        for (C9192d cancel : this.f25546b) {
            cancel.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo24794c() {
        if (this.f25549e.compareAndSet(false, true)) {
            m33951e();
            m33950d();
            return;
        }
        throw new IllegalStateException("Already Executed");
    }
}

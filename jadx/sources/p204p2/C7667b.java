package p204p2;

import android.support.p013v4.media.session.C0125b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import of1.C41882e;
import of1.C41931v;
import of1.C41944z;
import p062e3.C6017a;
import p062e3.C6018b;
import p062e3.C6026c;
import p127j3.C6692b;
import p127j3.C6693c;
import p127j3.C6696e;
import p217q2.C7822a;
import p217q2.C7836g;
import p217q2.C7842i;
import p217q2.C7850l;
import p217q2.C7851m;
import p230r2.C8044a;
import p230r2.C8045b;
import p243s2.C8103c;
import p243s2.C8115i;
import p243s2.C8140s;
import p269u2.C8550a;
import p282v2.C8687a;
import p282v2.C8695d;
import p295w2.C8744b;
import p308x2.C8949a;
import p308x2.C8950b;
import p332z2.C9185a;
import p332z2.C9192d;
import p332z2.C9198e;
import ue1.C43064a;

/* renamed from: p2.b */
public final class C7667b {

    /* renamed from: a */
    private final C41931v f22289a;

    /* renamed from: b */
    private final C41882e.C41883a f22290b;

    /* renamed from: c */
    private final C8687a f22291c;

    /* renamed from: d */
    private final C7851m f22292d;

    /* renamed from: e */
    private final C9198e f22293e = new C9198e();

    /* renamed from: f */
    private final Executor f22294f;

    /* renamed from: g */
    private final C8045b.C8048c f22295g;

    /* renamed from: h */
    private final C8950b f22296h;

    /* renamed from: i */
    private final C8550a f22297i;

    /* renamed from: j */
    private final C8103c f22298j;

    /* renamed from: k */
    private final C9185a f22299k = new C9185a();

    /* renamed from: l */
    private final List f22300l;

    /* renamed from: m */
    private final boolean f22301m;

    /* renamed from: n */
    private final C6026c f22302n;

    /* renamed from: o */
    private final boolean f22303o;

    /* renamed from: p */
    private final boolean f22304p;

    /* renamed from: p2.b$a */
    public static class C7668a {

        /* renamed from: a */
        C41882e.C41883a f22305a;

        /* renamed from: b */
        C41931v f22306b;

        /* renamed from: c */
        C8687a f22307c = C8687a.f24511a;

        /* renamed from: d */
        C8115i f22308d = C8115i.m30668a();

        /* renamed from: e */
        C8115i f22309e = C8115i.m30668a();

        /* renamed from: f */
        C8045b.C8048c f22310f = C8045b.f23193b;

        /* renamed from: g */
        C8950b f22311g = C8949a.f24956c;

        /* renamed from: h */
        C8550a f22312h = C8550a.f24290b;

        /* renamed from: i */
        final Map f22313i = new LinkedHashMap();

        /* renamed from: j */
        Executor f22314j;

        /* renamed from: k */
        final List f22315k = new ArrayList();

        /* renamed from: l */
        boolean f22316l;

        /* renamed from: m */
        C6026c f22317m = new C6017a();

        /* renamed from: n */
        boolean f22318n;

        /* renamed from: o */
        C8115i f22319o = C8115i.m30668a();

        /* renamed from: p */
        C6693c f22320p = new C6693c.C6694a(new C6692b());

        /* renamed from: q */
        long f22321q = -1;

        /* renamed from: r */
        boolean f22322r;

        /* renamed from: s */
        boolean f22323s;

        /* renamed from: p2.b$a$a */
        class C7669a implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C8687a f22324d;

            C7669a(C8687a aVar) {
                this.f22324d = aVar;
            }

            /* renamed from: a */
            public C8744b invoke() {
                return this.f22324d.mo24067d();
            }
        }

        /* renamed from: p2.b$a$b */
        class C7670b implements ThreadFactory {
            C7670b() {
            }

            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "Apollo Dispatcher");
            }
        }

        C7668a() {
        }

        /* renamed from: d */
        private Executor m29120d() {
            return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new C7670b());
        }

        /* renamed from: a */
        public C7668a mo22373a(C7850l lVar, C7822a aVar) {
            this.f22313i.put(lVar, aVar);
            return this;
        }

        /* renamed from: b */
        public C7667b mo22374b() {
            C6018b bVar;
            C8140s.m30754b(this.f22306b, "serverUrl is null");
            C8103c cVar = new C8103c((C7672d) null);
            C41882e.C41883a aVar = this.f22305a;
            if (aVar == null) {
                aVar = new C41944z();
            }
            C41882e.C41883a aVar2 = aVar;
            Executor executor = this.f22314j;
            if (executor == null) {
                executor = m29120d();
            }
            Executor executor2 = executor;
            C7851m mVar = new C7851m(Collections.unmodifiableMap(this.f22313i));
            C8687a aVar3 = this.f22307c;
            C8115i iVar = this.f22308d;
            C8115i iVar2 = this.f22309e;
            if (!iVar.mo23280f() || !iVar2.mo23280f()) {
                C6026c cVar2 = this.f22317m;
                C8115i iVar3 = this.f22319o;
                if (iVar3.mo23280f()) {
                    C7669a aVar4 = new C7669a(aVar3);
                    C0125b.m366a(iVar3.mo23278e());
                    bVar = new C6018b(mVar, (C6696e.C6698b) null, this.f22320p, executor2, this.f22321q, aVar4, this.f22318n);
                } else {
                    bVar = cVar2;
                }
                return new C7667b(this.f22306b, aVar2, (C8044a) null, aVar3, mVar, executor2, this.f22310f, this.f22311g, this.f22312h, cVar, Collections.unmodifiableList(this.f22315k), this.f22316l, bVar, this.f22322r, this.f22323s);
            }
            C0125b.m366a(iVar.mo23278e());
            C8695d.m32432a();
            throw null;
        }

        /* renamed from: c */
        public C7668a mo22375c(C41882e.C41883a aVar) {
            this.f22305a = (C41882e.C41883a) C8140s.m30754b(aVar, "factory == null");
            return this;
        }

        /* renamed from: e */
        public C7668a mo22376e(C41944z zVar) {
            return mo22375c((C41882e.C41883a) C8140s.m30754b(zVar, "okHttpClient is null"));
        }

        /* renamed from: f */
        public C7668a mo22377f(String str) {
            this.f22306b = C41931v.m121622m((String) C8140s.m30754b(str, "serverUrl == null"));
            return this;
        }
    }

    C7667b(C41931v vVar, C41882e.C41883a aVar, C8044a aVar2, C8687a aVar3, C7851m mVar, Executor executor, C8045b.C8048c cVar, C8950b bVar, C8550a aVar4, C8103c cVar2, List list, boolean z, C6026c cVar3, boolean z2, boolean z3) {
        this.f22289a = vVar;
        this.f22290b = aVar;
        this.f22291c = aVar3;
        this.f22292d = mVar;
        this.f22294f = executor;
        this.f22295g = cVar;
        this.f22296h = bVar;
        this.f22297i = aVar4;
        this.f22298j = cVar2;
        this.f22300l = list;
        this.f22301m = z;
        this.f22302n = cVar3;
        this.f22303o = z2;
        this.f22304p = z3;
    }

    /* renamed from: a */
    public static C7668a m29117a() {
        return new C7668a();
    }

    /* renamed from: b */
    private C9192d m29118b(C7836g gVar) {
        return C9192d.m33969e().mo24825k(gVar).mo24833s(this.f22289a).mo24823i(this.f22290b).mo24821g((C8044a) null).mo24822h(this.f22295g).mo24831q(this.f22293e).mo24832r(this.f22292d).mo24815a(this.f22291c).mo24830p(this.f22296h).mo24818d(this.f22297i).mo24819e(this.f22294f).mo24824j(this.f22298j).mo24816b(this.f22300l).mo24834t(this.f22299k).mo24827m(Collections.emptyList()).mo24828n(Collections.emptyList()).mo24820f(this.f22301m).mo24836v(this.f22303o).mo24835u(this.f22304p).mo24817c();
    }

    /* renamed from: c */
    public C7671c mo22372c(C7842i iVar) {
        return m29118b(iVar);
    }
}

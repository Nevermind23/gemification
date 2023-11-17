package p332z2;

import com.apollographql.apollo.exception.ApolloCanceledException;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.ApolloParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import of1.C41882e;
import of1.C41931v;
import p034c3.C2229a;
import p034c3.C2232b;
import p034c3.C2240c;
import p034c3.C2242d;
import p034c3.C2246e;
import p088g3.C6204a;
import p204p2.C7664a;
import p204p2.C7671c;
import p217q2.C7836g;
import p217q2.C7842i;
import p217q2.C7843j;
import p217q2.C7851m;
import p230r2.C8044a;
import p230r2.C8045b;
import p243s2.C8102b;
import p243s2.C8103c;
import p243s2.C8115i;
import p243s2.C8120m;
import p243s2.C8140s;
import p269u2.C8550a;
import p282v2.C8687a;
import p308x2.C8950b;
import p320y2.C9035a;
import p320y2.C9041b;
import p332z2.C9186b;

/* renamed from: z2.d */
public final class C9192d implements C7671c, C7664a {

    /* renamed from: a */
    final C7836g f25564a;

    /* renamed from: b */
    final C41931v f25565b;

    /* renamed from: c */
    final C41882e.C41883a f25566c;

    /* renamed from: d */
    final C8045b.C8048c f25567d;

    /* renamed from: e */
    final C9198e f25568e;

    /* renamed from: f */
    final C7851m f25569f;

    /* renamed from: g */
    final C8687a f25570g;

    /* renamed from: h */
    final C8550a f25571h;

    /* renamed from: i */
    final C6204a f25572i;

    /* renamed from: j */
    final C8950b f25573j;

    /* renamed from: k */
    final C9041b f25574k;

    /* renamed from: l */
    final Executor f25575l;

    /* renamed from: m */
    final C8103c f25576m;

    /* renamed from: n */
    final C9185a f25577n;

    /* renamed from: o */
    final List f25578o;

    /* renamed from: p */
    final List f25579p;

    /* renamed from: q */
    final List f25580q;

    /* renamed from: r */
    final C8115i f25581r;

    /* renamed from: s */
    final boolean f25582s;

    /* renamed from: t */
    final AtomicReference f25583t = new AtomicReference(C9186b.IDLE);

    /* renamed from: u */
    final AtomicReference f25584u = new AtomicReference();

    /* renamed from: v */
    final C8115i f25585v;

    /* renamed from: w */
    final boolean f25586w;

    /* renamed from: x */
    final boolean f25587x;

    /* renamed from: z2.d$a */
    class C9193a implements C9035a.C9036a {

        /* renamed from: z2.d$a$a */
        class C9194a implements C8102b {

            /* renamed from: a */
            final /* synthetic */ C9035a.C9037b f25589a;

            C9194a(C9035a.C9037b bVar) {
                this.f25589a = bVar;
            }

            /* renamed from: a */
            public void apply(C7664a.C7665a aVar) {
                int i = C9196c.f25593b[this.f25589a.ordinal()];
                if (i == 1) {
                    aVar.mo20505g(C7664a.C7666b.FETCH_CACHE);
                } else if (i == 2) {
                    aVar.mo20505g(C7664a.C7666b.FETCH_NETWORK);
                }
            }
        }

        C9193a() {
        }

        /* renamed from: a */
        public void mo90a() {
            C8115i k = C9192d.this.mo24811k();
            if (C9192d.this.f25581r.mo23280f()) {
                ((C9188c) C9192d.this.f25581r.mo23278e()).mo24794c();
            }
            if (!k.mo23280f()) {
                C9192d dVar = C9192d.this;
                dVar.f25576m.mo23286a("onCompleted for operation: %s. No callback present.", dVar.mo22366a().name().name());
                return;
            }
            ((C7664a.C7665a) k.mo23278e()).mo20505g(C7664a.C7666b.COMPLETED);
        }

        /* renamed from: b */
        public void mo91b(C9035a.C9040d dVar) {
            C8115i j = C9192d.this.mo24810j();
            if (!j.mo23280f()) {
                C9192d dVar2 = C9192d.this;
                dVar2.f25576m.mo23286a("onResponse for operation: %s. No callback present.", dVar2.mo22366a().name().name());
                return;
            }
            ((C7664a.C7665a) j.mo23278e()).mo20504f((C7843j) dVar.f25186b.mo23278e());
        }

        /* renamed from: c */
        public void mo92c(C9035a.C9037b bVar) {
            C9192d.this.mo24810j().mo23276b(new C9194a(bVar));
        }

        /* renamed from: d */
        public void mo93d(ApolloException apolloException) {
            C8115i k = C9192d.this.mo24811k();
            if (!k.mo23280f()) {
                C9192d dVar = C9192d.this;
                dVar.f25576m.mo23287b(apolloException, "onFailure for operation: %s. No callback present.", dVar.mo22366a().name().name());
            } else if (apolloException instanceof ApolloHttpException) {
                ((C7664a.C7665a) k.mo23278e()).mo22369c((ApolloHttpException) apolloException);
            } else if (apolloException instanceof ApolloParseException) {
                ((C7664a.C7665a) k.mo23278e()).mo22371e((ApolloParseException) apolloException);
            } else if (apolloException instanceof ApolloNetworkException) {
                ((C7664a.C7665a) k.mo23278e()).mo22370d((ApolloNetworkException) apolloException);
            } else {
                ((C7664a.C7665a) k.mo23278e()).mo20503b(apolloException);
            }
        }
    }

    /* renamed from: z2.d$b */
    class C9195b implements C8102b {
        C9195b() {
        }

        /* renamed from: a */
        public void apply(C7664a.C7665a aVar) {
            aVar.mo20505g(C7664a.C7666b.SCHEDULED);
        }
    }

    /* renamed from: z2.d$c */
    static /* synthetic */ class C9196c {

        /* renamed from: a */
        static final /* synthetic */ int[] f25592a;

        /* renamed from: b */
        static final /* synthetic */ int[] f25593b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                y2.a$b[] r0 = p320y2.C9035a.C9037b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25593b = r0
                r1 = 1
                y2.a$b r2 = p320y2.C9035a.C9037b.CACHE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f25593b     // Catch:{ NoSuchFieldError -> 0x001d }
                y2.a$b r3 = p320y2.C9035a.C9037b.NETWORK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                z2.b[] r2 = p332z2.C9186b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f25592a = r2
                z2.b r3 = p332z2.C9186b.ACTIVE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f25592a     // Catch:{ NoSuchFieldError -> 0x0038 }
                z2.b r2 = p332z2.C9186b.IDLE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f25592a     // Catch:{ NoSuchFieldError -> 0x0043 }
                z2.b r1 = p332z2.C9186b.CANCELED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f25592a     // Catch:{ NoSuchFieldError -> 0x004e }
                z2.b r1 = p332z2.C9186b.TERMINATED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p332z2.C9192d.C9196c.<clinit>():void");
        }
    }

    /* renamed from: z2.d$d */
    public static final class C9197d {

        /* renamed from: a */
        C7836g f25594a;

        /* renamed from: b */
        C41931v f25595b;

        /* renamed from: c */
        C41882e.C41883a f25596c;

        /* renamed from: d */
        C8045b.C8048c f25597d;

        /* renamed from: e */
        C9198e f25598e;

        /* renamed from: f */
        C7851m f25599f;

        /* renamed from: g */
        C8687a f25600g;

        /* renamed from: h */
        C8950b f25601h;

        /* renamed from: i */
        C8550a f25602i;

        /* renamed from: j */
        C6204a f25603j = C6204a.f19214b;

        /* renamed from: k */
        Executor f25604k;

        /* renamed from: l */
        C8103c f25605l;

        /* renamed from: m */
        List f25606m;

        /* renamed from: n */
        List f25607n = Collections.emptyList();

        /* renamed from: o */
        List f25608o = Collections.emptyList();

        /* renamed from: p */
        C9185a f25609p;

        /* renamed from: q */
        boolean f25610q;

        /* renamed from: r */
        C8115i f25611r = C8115i.m30668a();

        /* renamed from: s */
        boolean f25612s;

        /* renamed from: t */
        boolean f25613t;

        C9197d() {
        }

        /* renamed from: a */
        public C9197d mo24815a(C8687a aVar) {
            this.f25600g = aVar;
            return this;
        }

        /* renamed from: b */
        public C9197d mo24816b(List list) {
            this.f25606m = list;
            return this;
        }

        /* renamed from: c */
        public C9192d mo24817c() {
            return new C9192d(this);
        }

        /* renamed from: d */
        public C9197d mo24818d(C8550a aVar) {
            this.f25602i = aVar;
            return this;
        }

        /* renamed from: e */
        public C9197d mo24819e(Executor executor) {
            this.f25604k = executor;
            return this;
        }

        /* renamed from: f */
        public C9197d mo24820f(boolean z) {
            this.f25610q = z;
            return this;
        }

        /* renamed from: g */
        public C9197d mo24821g(C8044a aVar) {
            return this;
        }

        /* renamed from: h */
        public C9197d mo24822h(C8045b.C8048c cVar) {
            this.f25597d = cVar;
            return this;
        }

        /* renamed from: i */
        public C9197d mo24823i(C41882e.C41883a aVar) {
            this.f25596c = aVar;
            return this;
        }

        /* renamed from: j */
        public C9197d mo24824j(C8103c cVar) {
            this.f25605l = cVar;
            return this;
        }

        /* renamed from: k */
        public C9197d mo24825k(C7836g gVar) {
            this.f25594a = gVar;
            return this;
        }

        /* renamed from: l */
        public C9197d mo24826l(C8115i iVar) {
            this.f25611r = iVar;
            return this;
        }

        /* renamed from: m */
        public C9197d mo24827m(List list) {
            this.f25608o = list != null ? new ArrayList(list) : Collections.emptyList();
            return this;
        }

        /* renamed from: n */
        public C9197d mo24828n(List list) {
            List list2;
            if (list != null) {
                list2 = new ArrayList(list);
            } else {
                list2 = Collections.emptyList();
            }
            this.f25607n = list2;
            return this;
        }

        /* renamed from: o */
        public C9197d mo24829o(C6204a aVar) {
            this.f25603j = aVar;
            return this;
        }

        /* renamed from: p */
        public C9197d mo24830p(C8950b bVar) {
            this.f25601h = bVar;
            return this;
        }

        /* renamed from: q */
        public C9197d mo24831q(C9198e eVar) {
            this.f25598e = eVar;
            return this;
        }

        /* renamed from: r */
        public C9197d mo24832r(C7851m mVar) {
            this.f25599f = mVar;
            return this;
        }

        /* renamed from: s */
        public C9197d mo24833s(C41931v vVar) {
            this.f25595b = vVar;
            return this;
        }

        /* renamed from: t */
        public C9197d mo24834t(C9185a aVar) {
            this.f25609p = aVar;
            return this;
        }

        /* renamed from: u */
        public C9197d mo24835u(boolean z) {
            this.f25613t = z;
            return this;
        }

        /* renamed from: v */
        public C9197d mo24836v(boolean z) {
            this.f25612s = z;
            return this;
        }
    }

    C9192d(C9197d dVar) {
        C7836g gVar = dVar.f25594a;
        this.f25564a = gVar;
        this.f25565b = dVar.f25595b;
        this.f25566c = dVar.f25596c;
        this.f25567d = dVar.f25597d;
        this.f25568e = dVar.f25598e;
        this.f25569f = dVar.f25599f;
        this.f25570g = dVar.f25600g;
        this.f25573j = dVar.f25601h;
        this.f25571h = dVar.f25602i;
        this.f25572i = dVar.f25603j;
        this.f25575l = dVar.f25604k;
        this.f25576m = dVar.f25605l;
        this.f25578o = dVar.f25606m;
        List list = dVar.f25607n;
        this.f25579p = list;
        List list2 = dVar.f25608o;
        this.f25580q = list2;
        this.f25577n = dVar.f25609p;
        if ((!list2.isEmpty() || !list.isEmpty()) && dVar.f25600g != null) {
            this.f25581r = C8115i.m30670h(C9188c.m33949a().mo24802h(dVar.f25608o).mo24803i(list).mo24806l(dVar.f25595b).mo24800f(dVar.f25596c).mo24804j(dVar.f25598e).mo24805k(dVar.f25599f).mo24795a(dVar.f25600g).mo24799e(dVar.f25604k).mo24801g(dVar.f25605l).mo24796b(dVar.f25606m).mo24798d(dVar.f25609p).mo24797c());
        } else {
            this.f25581r = C8115i.m30668a();
        }
        this.f25586w = dVar.f25612s;
        this.f25582s = dVar.f25610q;
        this.f25587x = dVar.f25613t;
        this.f25574k = m33971h(gVar);
        this.f25585v = dVar.f25611r;
    }

    /* renamed from: d */
    private synchronized void m33968d(C8115i iVar) {
        int i = C9196c.f25592a[((C9186b) this.f25583t.get()).ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.f25584u.set((C7664a.C7665a) iVar.mo23283i());
                this.f25577n.mo24788e(this);
                iVar.mo23276b(new C9195b());
                this.f25583t.set(C9186b.ACTIVE);
            } else if (i == 3) {
                throw new ApolloCanceledException();
            } else if (i != 4) {
                throw new IllegalStateException("Unknown state");
            }
        }
        throw new IllegalStateException("Already Executed");
    }

    /* renamed from: e */
    public static C9197d m33969e() {
        return new C9197d();
    }

    /* renamed from: g */
    private C9035a.C9036a m33970g() {
        return new C9193a();
    }

    /* renamed from: h */
    private C9041b m33971h(C7836g gVar) {
        C8045b.C8048c cVar;
        boolean z = gVar instanceof C7842i;
        if (z) {
            cVar = this.f25567d;
        } else {
            cVar = null;
        }
        C8045b.C8048c cVar2 = cVar;
        C8120m a = this.f25568e.mo24837a(gVar);
        ArrayList arrayList = new ArrayList(this.f25578o);
        arrayList.add(this.f25573j.mo83a(this.f25576m));
        arrayList.add(new C2232b(this.f25570g, a, this.f25575l, this.f25576m));
        if (z && this.f25582s) {
            arrayList.add(new C2229a(this.f25576m, this.f25587x));
        }
        arrayList.add(new C2240c((C8044a) null, this.f25570g.mo24067d(), a, this.f25569f, this.f25576m));
        arrayList.add(new C2242d(this.f25565b, this.f25566c, cVar2, false, this.f25569f, this.f25576m));
        return new C2246e(arrayList);
    }

    /* renamed from: a */
    public C7836g mo22366a() {
        return this.f25564a;
    }

    /* renamed from: b */
    public void mo22367b(C7664a.C7665a aVar) {
        try {
            m33968d(C8115i.m30669d(aVar));
            this.f25574k.mo7191a(C9035a.C9038c.m33459a(this.f25564a).mo24522c(this.f25571h).mo24526g(this.f25572i).mo24523d(false).mo24525f(this.f25585v).mo24528i(this.f25586w).mo24520a(this.f25582s).mo24521b(), this.f25575l, m33970g());
        } catch (ApolloCanceledException e) {
            if (aVar != null) {
                aVar.mo22368a(e);
                return;
            }
            this.f25576m.mo23289d(e, "Operation: %s was canceled", mo22366a().name().name());
        }
    }

    public synchronized void cancel() {
        int i = C9196c.f25592a[((C9186b) this.f25583t.get()).ordinal()];
        if (i == 1) {
            this.f25583t.set(C9186b.CANCELED);
            try {
                this.f25574k.dispose();
                if (this.f25581r.mo23280f()) {
                    ((C9188c) this.f25581r.mo23278e()).mo24793b();
                }
            } finally {
                this.f25577n.mo24790h(this);
                this.f25584u.set((Object) null);
            }
        } else if (i == 2) {
            this.f25583t.set(C9186b.CANCELED);
        } else if (i != 3) {
            if (i != 4) {
                throw new IllegalStateException("Unknown state");
            }
        }
    }

    /* renamed from: f */
    public C9192d clone() {
        return mo24812l().mo24817c();
    }

    /* renamed from: i */
    public C9192d mo22380c(C6204a aVar) {
        if (this.f25583t.get() == C9186b.IDLE) {
            return mo24812l().mo24829o((C6204a) C8140s.m30754b(aVar, "requestHeaders == null")).mo24817c();
        }
        throw new IllegalStateException("Already Executed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public synchronized C8115i mo24810j() {
        int i = C9196c.f25592a[((C9186b) this.f25583t.get()).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("Unknown state");
                    }
                }
            }
            throw new IllegalStateException(C9186b.C9187a.m33947b((C9186b) this.f25583t.get()).mo24792a(C9186b.ACTIVE, C9186b.CANCELED));
        }
        return C8115i.m30669d((C7664a.C7665a) this.f25584u.get());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized C8115i mo24811k() {
        int i = C9196c.f25592a[((C9186b) this.f25583t.get()).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return C8115i.m30669d((C7664a.C7665a) this.f25584u.getAndSet((Object) null));
                } else if (i != 4) {
                    throw new IllegalStateException("Unknown state");
                }
            }
            throw new IllegalStateException(C9186b.C9187a.m33947b((C9186b) this.f25583t.get()).mo24792a(C9186b.ACTIVE, C9186b.CANCELED));
        }
        this.f25577n.mo24790h(this);
        this.f25583t.set(C9186b.TERMINATED);
        return C8115i.m30669d((C7664a.C7665a) this.f25584u.getAndSet((Object) null));
    }

    /* renamed from: l */
    public C9197d mo24812l() {
        return m33969e().mo24825k(this.f25564a).mo24833s(this.f25565b).mo24823i(this.f25566c).mo24821g((C8044a) null).mo24822h(this.f25567d).mo24831q(this.f25568e).mo24832r(this.f25569f).mo24815a(this.f25570g).mo24818d(this.f25571h).mo24829o(this.f25572i).mo24830p(this.f25573j).mo24819e(this.f25575l).mo24824j(this.f25576m).mo24816b(this.f25578o).mo24834t(this.f25577n).mo24828n(this.f25579p).mo24827m(this.f25580q).mo24820f(this.f25582s).mo24835u(this.f25587x).mo24826l(this.f25585v);
    }

    /* renamed from: x */
    public boolean mo19730x() {
        return this.f25583t.get() == C9186b.CANCELED;
    }
}

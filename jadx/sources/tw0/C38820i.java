package tw0;

import cx0.C31455b;
import dx0.C31617e;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40744k;
import ed1.C40748o;
import ed1.C40749p;
import ed1.C40762x;
import ee1.C40765a;
import he1.C41224m;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;
import uw0.C39109a;
import vw0.C39486e;
import yw0.C40085a;

/* renamed from: tw0.i */
public final class C38820i implements C31617e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C39486e f92886a;

    /* renamed from: b */
    private final C39486e f92887b;

    /* renamed from: c */
    private final C40085a f92888c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f92889d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C39109a f92890e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C40765a f92891f;

    /* renamed from: tw0.i$a */
    static final class C38821a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38820i f92892d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38821a(C38820i iVar) {
            super(1);
            this.f92892d = iVar;
        }

        /* renamed from: a */
        public final void mo92530a(C31455b bVar) {
            this.f92892d.f92891f.onNext(bVar.mo71845a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92530a((C31455b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tw0.i$b */
    static final class C38822b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38820i f92893d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38822b(C38820i iVar) {
            super(1);
            this.f92893d = iVar;
        }

        /* renamed from: a */
        public final C40739f invoke(C31455b bVar) {
            C41536l.m120489i(bVar, "it");
            return this.f92893d.f92886a.mo93112b(bVar);
        }
    }

    /* renamed from: tw0.i$c */
    static final class C38823c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38820i f92894d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38823c(C38820i iVar) {
            super(1);
            this.f92894d = iVar;
        }

        /* renamed from: a */
        public final void mo92532a(C31455b bVar) {
            this.f92894d.f92890e.mo92774a(this.f92894d.f92889d);
            this.f92894d.f92891f.onNext(bVar.mo71845a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92532a((C31455b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tw0.i$d */
    static final class C38824d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38820i f92895d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38824d(C38820i iVar) {
            super(1);
            this.f92895d = iVar;
        }

        /* renamed from: a */
        public final C40748o invoke(C31455b bVar) {
            C41536l.m120489i(bVar, "it");
            return this.f92895d.f92886a.mo93112b(bVar).mo94882A().mo94896e(C40744k.m118000q(bVar.mo71846b()));
        }
    }

    /* renamed from: tw0.i$e */
    static final class C38825e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38820i f92896d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38825e(C38820i iVar) {
            super(1);
            this.f92896d = iVar;
        }

        /* renamed from: a */
        public final C40739f invoke(String str) {
            C41536l.m120489i(str, "it");
            return this.f92896d.m113611q(str);
        }
    }

    /* renamed from: tw0.i$f */
    static final class C38826f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38820i f92897d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38826f(C38820i iVar) {
            super(1);
            this.f92897d = iVar;
        }

        /* renamed from: a */
        public final void mo92535a(C31455b bVar) {
            this.f92897d.f92891f.onNext(bVar.mo71845a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92535a((C31455b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tw0.i$g */
    static final class C38827g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C38827g f92898d = new C38827g();

        C38827g() {
            super(1);
        }

        /* renamed from: a */
        public final C41224m invoke(C31455b bVar) {
            C41536l.m120489i(bVar, "it");
            return new C41224m(Boolean.FALSE, bVar.mo71846b());
        }
    }

    /* renamed from: tw0.i$h */
    static final class C38828h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38820i f92899d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38828h(C38820i iVar) {
            super(1);
            this.f92899d = iVar;
        }

        /* renamed from: a */
        public final C40739f invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            boolean booleanValue = ((Boolean) mVar.mo95675a()).booleanValue();
            String str = (String) mVar.mo95676b();
            if (booleanValue) {
                return this.f92899d.m113614t();
            }
            return this.f92899d.m113611q(str);
        }
    }

    public C38820i(C39486e eVar, C39486e eVar2, C40085a aVar, int i, C39109a aVar2) {
        C41536l.m120489i(eVar, "localDataSource");
        C41536l.m120489i(eVar2, "defaultDataSource");
        C41536l.m120489i(aVar, "remoteDataSource");
        C41536l.m120489i(aVar2, "prefs");
        this.f92886a = eVar;
        this.f92887b = eVar2;
        this.f92888c = aVar;
        this.f92889d = i;
        this.f92890e = aVar2;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<List<PaymentConfig>>()");
        this.f92891f = h1;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static final C40739f m113596A(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40739f) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final C40734b m113611q(String str) {
        C40734b n = this.f92888c.mo94023a(str).mo94951j(new C38818g(new C38821a(this))).mo94954n(new C38819h(new C38822b(this)));
        C41536l.m120488h(n, "private fun fetchRemoteC…g(it)\n            }\n    }");
        return n;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final void m113612r(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final C40739f m113613s(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40739f) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final C40734b m113614t() {
        C40734b s = this.f92887b.mo93111a().mo94951j(new C38812a(new C38823c(this))).mo94953m(new C38813b(new C38824d(this))).mo94944A(C40762x.m118162z("")).mo95088s(new C38814c(new C38825e(this)));
        C41536l.m120488h(s, "private fun loadDefaultC…g(it)\n            }\n    }");
        return s;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m113615u(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final C40748o m113616v(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40748o) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final C40739f m113617w(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40739f) lVar.invoke(obj);
    }

    /* renamed from: x */
    private final C40734b m113618x() {
        C40734b s = this.f92886a.mo93111a().mo94951j(new C38815d(new C38826f(this))).mo94956r(new C38816e(C38827g.f92898d)).mo94944A(C40762x.m118162z(new C41224m(Boolean.TRUE, ""))).mo95088s(new C38817f(new C38828h(this)));
        C41536l.m120488h(s, "private fun loadLocalCon…    }\n            }\n    }");
        return s;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final void m113619y(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final C41224m m113620z(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41224m) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40749p mo72030a() {
        C40749p c0 = this.f92891f.mo95017c0();
        C41536l.m120488h(c0, "configs.hide()");
        return c0;
    }

    /* renamed from: b */
    public C40734b mo72031b() {
        if (this.f92889d > this.f92890e.mo92775b()) {
            return m113614t();
        }
        return m113618x();
    }
}

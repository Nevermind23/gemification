package yo0;

import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40736c;
import ed1.C40762x;
import ep0.C12832a;
import he1.C41238w;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.linksharing.data.model.P2PLinkApiModel;
import p341ge.bog.mobilebank.linksharing.domain.model.P2PLink;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import ue1.C43075l;
import xo0.C18869a;
import xo0.C18870b;
import zo0.C19146a;

/* renamed from: yo0.g */
public final class C18986g implements C12832a {

    /* renamed from: g */
    public static final C18987a f52994g = new C18987a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C19146a f52995a;

    /* renamed from: b */
    private final C18869a f52996b;

    /* renamed from: c */
    private final C18870b f52997c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final AtomicReference f52998d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicReference f52999e;

    /* renamed from: f */
    private final PreferencesApiManager f53000f;

    /* renamed from: yo0.g$a */
    public static final class C18987a {
        private C18987a() {
        }

        public /* synthetic */ C18987a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: yo0.g$b */
    /* synthetic */ class C18988b extends C41535k implements C43075l {
        C18988b(Object obj) {
            super(1, obj, C18869a.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C18869a) this.receiver).mo46840b(list);
        }
    }

    /* renamed from: yo0.g$c */
    static final class C18989c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18986g f53001d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18989c(C18986g gVar) {
            super(1);
            this.f53001d = gVar;
        }

        /* renamed from: a */
        public final void mo47029a(List list) {
            this.f53001d.f52998d.set(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47029a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: yo0.g$d */
    /* synthetic */ class C18990d extends C41535k implements C43075l {
        C18990d(Object obj) {
            super(1, obj, C18870b.class, "convert", "convert(Lge/bog/mobilebank/linksharing/data/model/P2PLinkApiModel;)Lge/bog/mobilebank/linksharing/domain/model/P2PLink;", 0);
        }

        /* renamed from: b */
        public final P2PLink invoke(P2PLinkApiModel p2PLinkApiModel) {
            C41536l.m120489i(p2PLinkApiModel, "p0");
            return ((C18870b) this.receiver).mo46841a(p2PLinkApiModel);
        }
    }

    /* renamed from: yo0.g$e */
    static final class C18991e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18986g f53002d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18991e(C18986g gVar) {
            super(1);
            this.f53002d = gVar;
        }

        /* renamed from: a */
        public final void mo47031a(P2PLink p2PLink) {
            this.f53002d.f52999e.set(p2PLink);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47031a((P2PLink) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: yo0.g$f */
    static final class C18992f extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C18992f f53003d = new C18992f();

        C18992f() {
            super(1);
        }

        /* renamed from: a */
        public final C40735b0 invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            if (!(th instanceof ApiError) || !C41536l.m120484d(((ApiError) th).mo84685a().getError(), "-450")) {
                return C40762x.m118158o(th);
            }
            return C40762x.m118162z(P2PLink.f43395m.mo42142a());
        }
    }

    public C18986g(C19146a aVar, C18869a aVar2, C18870b bVar, AtomicReference atomicReference, AtomicReference atomicReference2, PreferencesApiManager preferencesApiManager) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "p2PAccountMapper");
        C41536l.m120489i(bVar, "p2PLinkMapper");
        C41536l.m120489i(atomicReference, "cachedAccounts");
        C41536l.m120489i(atomicReference2, "cachedLink");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        this.f52995a = aVar;
        this.f52996b = aVar2;
        this.f52997c = bVar;
        this.f52998d = atomicReference;
        this.f52999e = atomicReference2;
        this.f53000f = preferencesApiManager;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final List m64101p(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m64102q(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final P2PLink m64103r(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (P2PLink) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m64104s(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final C40735b0 m64105t(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m64106u(C18986g gVar, C40736c cVar) {
        C41536l.m120489i(gVar, "this$0");
        C41536l.m120489i(cVar, "it");
        gVar.f53000f.setP2pHelpTooltipWasShown();
    }

    /* renamed from: a */
    public C40734b mo33480a(String str, long j) {
        C41536l.m120489i(str, "nickname");
        return this.f52995a.mo47340a(str, j);
    }

    /* renamed from: b */
    public C40734b mo33481b(String str) {
        C41536l.m120489i(str, "nickname");
        return this.f52995a.mo47341b(str);
    }

    /* renamed from: c */
    public C40734b mo33482c(long j, String str) {
        C41536l.m120489i(str, "linkNickName");
        return this.f52995a.mo47342c(j, str);
    }

    /* renamed from: d */
    public C40762x mo33483d(boolean z) {
        if (z || this.f52998d.get() == null) {
            C40762x m = this.f52995a.mo47344j0().mo95062A(new C18980a(new C18988b(this.f52996b))).mo95084m(new C18981b(new C18989c(this)));
            C41536l.m120488h(m, "override fun getAccounts…chedAccounts.get())\n    }");
            return m;
        }
        C40762x z2 = C40762x.m118162z(this.f52998d.get());
        C41536l.m120488h(z2, "just(cachedAccounts.get())");
        return z2;
    }

    /* renamed from: e */
    public C40762x mo33484e(boolean z) {
        if (z || this.f52999e.get() == null) {
            C40762x C = this.f52995a.mo47343d().mo95062A(new C18983d(new C18990d(this.f52997c))).mo95084m(new C18984e(new C18991e(this))).mo95064C(new C18985f(C18992f.f53003d));
            C41536l.m120488h(C, "override fun getLink(ref…t(cachedLink.get())\n    }");
            return C;
        }
        C40762x z2 = C40762x.m118162z(this.f52999e.get());
        C41536l.m120488h(z2, "just(cachedLink.get())");
        return z2;
    }

    /* renamed from: f */
    public C40762x mo33485f() {
        C40762x z = C40762x.m118162z(this.f53000f.getShowP2pHelpTooltip());
        C41536l.m120488h(z, "just(preferencesApiManager.showP2pHelpTooltip)");
        return z;
    }

    /* renamed from: g */
    public C40734b mo33486g() {
        C40734b k = C40734b.m117920k(new C18982c(this));
        C41536l.m120488h(k, "create {\n        prefere…lpTooltipWasShown()\n    }");
        return k;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C18986g(C19146a aVar, C18869a aVar2, C18870b bVar, PreferencesApiManager preferencesApiManager) {
        this(aVar, aVar2, bVar, new AtomicReference(), new AtomicReference(), preferencesApiManager);
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "p2PAccountMapper");
        C41536l.m120489i(bVar, "p2PLinkMapper");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
    }
}

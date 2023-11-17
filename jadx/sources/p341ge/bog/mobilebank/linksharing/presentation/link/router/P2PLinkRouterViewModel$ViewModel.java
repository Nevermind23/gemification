package p341ge.bog.mobilebank.linksharing.presentation.link.router;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import cp0.C12023b;
import cp0.C12024c;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lp0.C16656d;
import lp0.C16657e;
import lp0.C16658f;
import lp0.C16659g;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.linksharing.domain.model.P2PLink;
import p341ge.bog.mobilebank.linksharing.presentation.link.CardRegistrationProcessor;
import p341ge.bog.mobilebank.linksharing.presentation.link.router.C15212b;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterViewModel$ViewModel */
public final class P2PLinkRouterViewModel$ViewModel extends C21481a implements C16657e, C16656d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12024c f43537d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C12023b f43538e;

    /* renamed from: f */
    private final CardRegistrationProcessor f43539f;

    /* renamed from: g */
    private final C16657e f43540g = this;

    /* renamed from: h */
    private final C16656d f43541h = this;

    /* renamed from: i */
    private final C1644x f43542i = new C1644x(C15212b.C15214b.f43554a);

    /* renamed from: j */
    private final C1644x f43543j = new C1644x();

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterViewModel$ViewModel$a */
    static final class C15205a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkRouterViewModel$ViewModel f43544d;

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterViewModel$ViewModel$a$a */
        static final class C15206a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C15206a f43545d = new C15206a();

            C15206a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(List list, P2PLink p2PLink) {
                C41536l.m120489i(list, "accounts");
                C41536l.m120489i(p2PLink, "link");
                return C41233s.m119492a(list, p2PLink);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15205a(P2PLinkRouterViewModel$ViewModel p2PLinkRouterViewModel$ViewModel) {
            super(1);
            this.f43544d = p2PLinkRouterViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m55473c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            C40762x T = C40762x.m118154T(this.f43544d.f43538e.mo32117a(true), this.f43544d.f43537d.mo32118a(true), new C15222d(C15206a.f43545d));
            C41536l.m120488h(T, "zip(\n                   …ink -> accounts to link }");
            return C31270e.m92880i(T, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterViewModel$ViewModel$b */
    static final class C15207b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkRouterViewModel$ViewModel f43546d;

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterViewModel$ViewModel$b$a */
        static final class C15208a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PLinkRouterViewModel$ViewModel f43547d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15208a(P2PLinkRouterViewModel$ViewModel p2PLinkRouterViewModel$ViewModel) {
                super(1);
                this.f43547d = p2PLinkRouterViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f43547d.mo42239Y0().mo4826r(C15212b.C15213a.f43553a);
            }
        }

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterViewModel$ViewModel$b$b */
        static final class C15209b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PLinkRouterViewModel$ViewModel f43548d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15209b(P2PLinkRouterViewModel$ViewModel p2PLinkRouterViewModel$ViewModel) {
                super(1);
                this.f43548d = p2PLinkRouterViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo42250a(C41224m mVar) {
                this.f43548d.mo42239Y0().mo4826r(C15212b.C15214b.f43554a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo42250a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterViewModel$ViewModel$b$c */
        static final class C15210c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PLinkRouterViewModel$ViewModel f43549d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15210c(P2PLinkRouterViewModel$ViewModel p2PLinkRouterViewModel$ViewModel) {
                super(1);
                this.f43549d = p2PLinkRouterViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo42251a(C41224m mVar) {
                Object obj;
                P2PLink p2PLink = (P2PLink) mVar.mo95676b();
                C1644x kw = this.f43549d.mo42239Y0();
                if (((List) mVar.mo95675a()).isEmpty()) {
                    obj = C15212b.C15215c.f43555a;
                } else if (C41536l.m120484d(p2PLink, P2PLink.f43395m.mo42142a())) {
                    obj = C15212b.C15216d.f43556a;
                } else {
                    obj = C15212b.C15219f.f43559a;
                }
                kw.mo4826r(obj);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo42251a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15207b(P2PLinkRouterViewModel$ViewModel p2PLinkRouterViewModel$ViewModel) {
            super(1);
            this.f43546d = p2PLinkRouterViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo42248a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92643e(aVar, (int[]) null, new C15208a(this.f43546d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C15209b(this.f43546d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C15210c(this.f43546d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42248a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public P2PLinkRouterViewModel$ViewModel(C12024c cVar, C12023b bVar, CardRegistrationProcessor cardRegistrationProcessor) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "p2pGetLinkUseCase");
        C41536l.m120489i(bVar, "p2pGetAccountsUseCase");
        C41536l.m120489i(cardRegistrationProcessor, "cardRegistrationProcessor");
        this.f43537d = cVar;
        this.f43538e = bVar;
        this.f43539f = cardRegistrationProcessor;
        m55462lw();
    }

    /* renamed from: lw */
    private final void m55462lw() {
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C16658f(new C15205a(this)));
        C41536l.m120488h(L0, "private fun prepareP2PLi…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C16659g(new C15207b(this)));
        C41536l.m120488h(F0, "private fun prepareP2PLi…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final C40754t m55463mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final void m55464nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ar */
    public void mo42240ar() {
        mo42245mf().mo4826r(this.f43539f.mo42170a());
    }

    /* renamed from: hw */
    public C1644x mo42245mf() {
        return this.f43543j;
    }

    /* renamed from: iw */
    public final C16656d mo42242iw() {
        return this.f43541h;
    }

    /* renamed from: jw */
    public final C16657e mo42243jw() {
        return this.f43540g;
    }

    /* renamed from: kw */
    public C1644x mo42239Y0() {
        return this.f43542i;
    }
}

package p341ge.bog.mobilebank.p975ui.activities.viewmodel;

import android.content.Intent;
import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import c51.C31275a;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import f81.C31958a;
import f81.C31959b;
import f81.C31960c;
import f81.C31961d;
import f81.C31962e;
import f81.C31963f;
import f81.C31964g;
import f81.C31965h;
import f81.C31966i;
import f81.C31967j;
import f81.C31968k;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import p653wf.C18569a;
import p726cs.C19792a;
import ru0.C38344a;
import ru0.C38347c;
import ru0.C38349e;
import s70.C28160c;
import ue1.C43075l;
import x41.C39780a;

/* renamed from: ge.bog.mobilebank.ui.activities.viewmodel.RootActivityViewModel$ViewModel */
public final class RootActivityViewModel$ViewModel extends C21481a implements C31958a, C31960c {

    /* renamed from: d */
    private final C18569a f85840d;

    /* renamed from: e */
    private final C19792a f85841e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C28160c f85842f;

    /* renamed from: g */
    private final C38344a f85843g;

    /* renamed from: h */
    private final C38347c f85844h;

    /* renamed from: i */
    private final C38349e f85845i;

    /* renamed from: j */
    private final Client f85846j;

    /* renamed from: k */
    private final C31958a f85847k = this;

    /* renamed from: l */
    private final C31960c f85848l = this;

    /* renamed from: m */
    private final C1644x f85849m = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1644x f85850n = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1644x f85851o = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f85852p = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C1644x f85853q = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C1644x f85854r = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C1644x f85855s = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C1644x f85856t = new C1644x();

    /* renamed from: u */
    private final C40767b f85857u;

    /* renamed from: ge.bog.mobilebank.ui.activities.viewmodel.RootActivityViewModel$ViewModel$a */
    static final class C35522a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RootActivityViewModel$ViewModel f85858d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35522a(RootActivityViewModel$ViewModel rootActivityViewModel$ViewModel) {
            super(1);
            this.f85858d = rootActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo86506a(C31275a aVar) {
            this.f85858d.f85852p.mo4826r(Boolean.valueOf(aVar.mo71528d() || aVar.mo71525a()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86506a((C31275a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.viewmodel.RootActivityViewModel$ViewModel$b */
    static final class C35523b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RootActivityViewModel$ViewModel f85859d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35523b(RootActivityViewModel$ViewModel rootActivityViewModel$ViewModel) {
            super(1);
            this.f85859d = rootActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo86507a(C41238w wVar) {
            this.f85859d.f85855s.mo4826r(wVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86507a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.viewmodel.RootActivityViewModel$ViewModel$c */
    static final class C35524c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RootActivityViewModel$ViewModel f85860d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35524c(RootActivityViewModel$ViewModel rootActivityViewModel$ViewModel) {
            super(1);
            this.f85860d = rootActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo86508a(Integer num) {
            this.f85860d.f85854r.mo4823o(num);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86508a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.viewmodel.RootActivityViewModel$ViewModel$d */
    static final class C35525d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C35525d f85861d = new C35525d();

        C35525d() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.viewmodel.RootActivityViewModel$ViewModel$e */
    static final class C35526e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RootActivityViewModel$ViewModel f85862d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35526e(RootActivityViewModel$ViewModel rootActivityViewModel$ViewModel) {
            super(1);
            this.f85862d = rootActivityViewModel$ViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            this.f85862d.f85856t.mo4826r(bool);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.viewmodel.RootActivityViewModel$ViewModel$f */
    static final class C35527f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RootActivityViewModel$ViewModel f85863d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35527f(RootActivityViewModel$ViewModel rootActivityViewModel$ViewModel) {
            super(1);
            this.f85863d = rootActivityViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo86511a(C41238w wVar) {
            C37224b.m109962a(this.f85863d.f85853q);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86511a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.viewmodel.RootActivityViewModel$ViewModel$g */
    static final class C35528g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RootActivityViewModel$ViewModel f85864d;

        /* renamed from: ge.bog.mobilebank.ui.activities.viewmodel.RootActivityViewModel$ViewModel$g$a */
        static final class C35529a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ RootActivityViewModel$ViewModel f85865d;

            /* renamed from: e */
            final /* synthetic */ C31961d f85866e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35529a(RootActivityViewModel$ViewModel rootActivityViewModel$ViewModel, C31961d dVar) {
                super(1);
                this.f85865d = rootActivityViewModel$ViewModel;
                this.f85866e = dVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Boolean bool) {
                C41536l.m120488h(bool, "restart");
                if (bool.booleanValue()) {
                    C37224b.m109965d(this.f85865d.f85850n, new C31959b(this.f85866e.mo72452a()));
                    return;
                }
                C1644x pw = this.f85865d.f85851o;
                C31961d dVar = this.f85866e;
                C41536l.m120488h(dVar, "data");
                C37224b.m109965d(pw, dVar);
            }
        }

        /* renamed from: ge.bog.mobilebank.ui.activities.viewmodel.RootActivityViewModel$ViewModel$g$b */
        static final class C35530b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ RootActivityViewModel$ViewModel f85867d;

            /* renamed from: e */
            final /* synthetic */ C31961d f85868e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35530b(RootActivityViewModel$ViewModel rootActivityViewModel$ViewModel, C31961d dVar) {
                super(1);
                this.f85867d = rootActivityViewModel$ViewModel;
                this.f85868e = dVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C37224b.m109965d(this.f85867d.f85850n, new C31959b(this.f85868e.mo72452a()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35528g(RootActivityViewModel$ViewModel rootActivityViewModel$ViewModel) {
            super(1);
            this.f85864d = rootActivityViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m105513d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m105514e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C31961d dVar) {
            C41536l.m120489i(dVar, "data");
            C40762x k = this.f85864d.f85842f.mo67673d(dVar.mo72452a().getStringExtra("type")).mo95084m(new C35531a(new C35529a(this.f85864d, dVar))).mo95082k(new C35532b(new C35530b(this.f85864d, dVar)));
            C41536l.m120488h(k, "private fun subscribeToP…ndToLifecycle()\n        }");
            return C31270e.m92880i(k, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RootActivityViewModel$ViewModel(C18569a aVar, C19792a aVar2, C28160c cVar, C38344a aVar3, C38347c cVar2, C38349e eVar, Client client, C39780a aVar4) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "chat");
        C41536l.m120489i(aVar2, "databaseFullSubject");
        C41536l.m120489i(cVar, "checkIfPushNeedsToRestart");
        C41536l.m120489i(aVar3, "getChatBotNboOffers");
        C41536l.m120489i(cVar2, "hideChatBotNboOffer");
        C41536l.m120489i(eVar, "shouldDisplayChatBotNboOffer");
        C41536l.m120489i(client, "client");
        C41536l.m120489i(aVar4, "serverStatusMonitor");
        this.f85840d = aVar;
        this.f85841e = aVar2;
        this.f85842f = cVar;
        this.f85843g = aVar3;
        this.f85844h = cVar2;
        this.f85845i = eVar;
        this.f85846j = client;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<PushProcessData>()");
        this.f85857u = h1;
        m105473Iw();
        m105471Gw();
        C41205b F0 = C32343x.m95413R0(aVar4.mo93512a()).mo94981F0(new C31964g(new C35522a(this)));
        C41536l.m120488h(F0, "serverStatusMonitor.getS…eClient\n                }");
        bindToLifecycle(F0);
        m105490zw();
        m105469Dw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final void m105466Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final void m105467Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final void m105468Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Dw */
    private final void m105469Dw() {
        C41205b F0 = C32343x.m95413R0(this.f85840d.mo33790d()).mo94981F0(new C31968k(new C35526e(this)));
        C41536l.m120488h(F0, "private fun observeIsCha…dToLifecycle()\n\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public static final void m105470Ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Gw */
    private final void m105471Gw() {
        C41205b F0 = this.f85841e.mo48079a().mo94981F0(new C31966i(new C35527f(this)));
        C41536l.m120488h(F0, "private fun subscribeToD…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final void m105472Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Iw */
    private final void m105473Iw() {
        C40749p L0 = this.f85857u.mo94989L0(new C31965h(new C35528g(this)));
        C41536l.m120488h(L0, "private fun subscribeToP…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95462k1(L0), this.f85849m));
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final C40754t m105474Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: zw */
    private final void m105490zw() {
        C41205b F0 = C32343x.m95462k1(this.f85843g.invoke()).mo94981F0(new C31967j(new C35523b(this)));
        C41536l.m120488h(F0, "private fun observeChatB…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* renamed from: Fw */
    public void mo86498Fw() {
        this.f85840d.mo33787a();
    }

    /* renamed from: Ig */
    public LiveData mo72445Ig() {
        return this.f85851o;
    }

    /* renamed from: J4 */
    public LiveData mo72446J4() {
        return this.f85855s;
    }

    /* renamed from: O8 */
    public LiveData mo72447O8() {
        return C1607m0.m5653a(this.f85852p);
    }

    /* renamed from: Uf */
    public LiveData mo72448Uf() {
        return this.f85849m;
    }

    /* renamed from: Vm */
    public void mo72439Vm(Intent intent, boolean z) {
        C40767b bVar = this.f85857u;
        if (intent != null) {
            bVar.onNext(new C31961d(intent, z, this.f85846j.isAuthorized()));
        }
    }

    /* renamed from: Xh */
    public void mo72440Xh() {
        C41205b G0 = C32343x.m95462k1(this.f85840d.mo33792f()).mo94983G0(new C31962e(new C35524c(this)), new C31963f(C35525d.f85861d));
        C41536l.m120488h(G0, "override fun observeChat…ndToLifecycle()\n        }");
        bindToLifecycle(G0);
    }

    public LiveData getUnreadMessages() {
        return this.f85854r;
    }

    /* renamed from: m6 */
    public LiveData mo72450m6() {
        return this.f85853q;
    }

    /* renamed from: sw */
    public boolean mo86499sw() {
        return this.f85845i.invoke();
    }

    /* renamed from: tw */
    public final C18569a mo86500tw() {
        return this.f85840d;
    }

    /* renamed from: uw */
    public final C31958a mo86501uw() {
        return this.f85847k;
    }

    /* renamed from: vw */
    public final C31960c mo86502vw() {
        return this.f85848l;
    }

    /* renamed from: ww */
    public void mo86503ww() {
        this.f85844h.invoke();
    }

    /* renamed from: xw */
    public LiveData mo86504xw() {
        return this.f85856t;
    }

    /* renamed from: yw */
    public boolean mo86505yw() {
        return this.f85846j.getUserInfo().isRBClient();
    }

    /* renamed from: zk */
    public LiveData mo72451zk() {
        return this.f85850n;
    }
}

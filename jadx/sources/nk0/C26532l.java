package nk0;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import ba1.C10146d0;
import bk0.C19393b;
import c41.C31270e;
import ck0.C19764a;
import ck0.C19765b;
import dk0.C20031a;
import dk0.C20032b;
import dk0.C20033c;
import dk0.C20034d;
import dk0.C20035e;
import dk0.C20036f;
import e41.C31658b;
import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40765a;
import ek0.C20261a;
import ek0.C20262b;
import fk0.C20524h;
import fk0.C20526j;
import g91.C32300e0;
import hd1.C41204a;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import j51.C36735g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kk0.C25741a;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lk0.C26050a;
import lk0.C26052b;
import m41.C37224b;
import m51.C37228a;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.googlepay.data.entity.ApproveOpcParams;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p380ck.C10457a;
import p380ck.C10464h;
import p669xh.C18763a;
import p843nw.C26629k;
import p843nw.C26633o;
import p863pw.C27637o;
import pc0.C27494a;
import ue1.C43075l;

/* renamed from: nk0.l */
public final class C26532l extends C21481a implements C26526f, C26527g {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C20524h f67111d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C26633o f67112e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C36735g f67113f;

    /* renamed from: g */
    private final C20526j f67114g;

    /* renamed from: h */
    private final C26629k f67115h;

    /* renamed from: i */
    private final C19393b f67116i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C26052b f67117j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C26050a f67118k;

    /* renamed from: l */
    private final C27494a f67119l;

    /* renamed from: m */
    private final C31658b f67120m;

    /* renamed from: n */
    private C25741a f67121n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C41224m f67122o;

    /* renamed from: p */
    private final C26526f f67123p = this;

    /* renamed from: q */
    private final C26527g f67124q = this;

    /* renamed from: r */
    private final C40765a f67125r;

    /* renamed from: s */
    private final C1644x f67126s;

    /* renamed from: t */
    private final C1644x f67127t;

    /* renamed from: u */
    private final C1644x f67128u;

    /* renamed from: v */
    private final C1644x f67129v;

    /* renamed from: w */
    private final C1644x f67130w;

    /* renamed from: x */
    private final C1644x f67131x;

    /* renamed from: y */
    private final C1644x f67132y;

    /* renamed from: z */
    private final C1644x f67133z;

    /* renamed from: nk0.l$a */
    public /* synthetic */ class C26533a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f67134a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                xh.a[] r0 = p669xh.C18763a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xh.a r1 = p669xh.C18763a.VISA     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xh.a r1 = p669xh.C18763a.AMERICAN_EXPRESS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f67134a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nk0.C26532l.C26533a.<clinit>():void");
        }
    }

    /* renamed from: nk0.l$b */
    static final class C26534b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f67135d;

        /* renamed from: e */
        final /* synthetic */ C26532l f67136e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26534b(List list, C26532l lVar) {
            super(1);
            this.f67135d = list;
            this.f67136e = lVar;
        }

        public final List invoke(List list) {
            Object obj;
            C20034d b;
            String a;
            Object obj2;
            C20034d b2;
            C41536l.m120489i(list, "tokenized");
            List list2 = this.f67135d;
            C26532l lVar = this.f67136e;
            ArrayList<C25741a> arrayList = new ArrayList<>();
            Iterator it = list2.iterator();
            while (true) {
                C20261a aVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C25741a aVar2 = (C25741a) next;
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (lVar.m82891Fw((C20033c) obj2, aVar2)) {
                        break;
                    }
                }
                C20033c cVar = (C20033c) obj2;
                if (!(cVar == null || (b2 = cVar.mo48411b()) == null)) {
                    aVar = b2.mo48416b();
                }
                if (aVar != C20261a.TOKEN_STATE_ACTIVE) {
                    arrayList.add(next);
                }
            }
            C26532l lVar2 = this.f67136e;
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
            for (C25741a aVar3 : arrayList) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (lVar2.m82891Fw((C20033c) obj, aVar3)) {
                        break;
                    }
                }
                C20033c cVar2 = (C20033c) obj;
                arrayList2.add(C25741a.m80989b(aVar3, (String) null, (String) null, (String) null, (CreditCardView.C13270b) null, (String) null, (cVar2 == null || (b = cVar2.mo48411b()) == null || (a = b.mo48415a()) == null) ? null : lVar2.f67118k.mo64938a(aVar3.mo64328e().mo35450j(), aVar3.mo64326c(), a), 31, (Object) null));
            }
            return arrayList2;
        }
    }

    /* renamed from: nk0.l$c */
    static final class C26535c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25741a f67137d;

        /* renamed from: e */
        final /* synthetic */ C26532l f67138e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26535c(C25741a aVar, C26532l lVar) {
            super(1);
            this.f67137d = aVar;
            this.f67138e = lVar;
        }

        /* renamed from: a */
        public final void mo65810a(C41224m mVar) {
            Long l;
            String d = this.f67137d.mo64327d();
            String a = ((C19765b) mVar.mo95676b()).mo48008a();
            String a2 = ((C19764a) mVar.mo95675a()).mo48004a();
            C37228a a3 = this.f67138e.f67113f.mo89562a();
            if (a3 != null) {
                l = Long.valueOf(a3.mo90305b());
            } else {
                l = null;
            }
            ApproveOpcParams approveOpcParams = new ApproveOpcParams(a2, a, d, String.valueOf(l), C10146d0.C10177h.m37232a(), (String) null, (String) null, (String) null, 224, (DefaultConstructorMarker) null);
            this.f67138e.f67122o = C41233s.m119492a(approveOpcParams, this.f67137d);
            C37224b.m109965d(this.f67138e.mo65797t(), approveOpcParams);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo65810a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: nk0.l$d */
    static final class C26536d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26532l f67139d;

        /* renamed from: nk0.l$d$a */
        static final class C26537a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26532l f67140d;

            /* renamed from: e */
            final /* synthetic */ C25741a f67141e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26537a(C26532l lVar, C25741a aVar) {
                super(1);
                this.f67140d = lVar;
                this.f67141e = aVar;
            }

            /* renamed from: a */
            public final void mo65812a(C20035e eVar) {
                C1644x Cw = this.f67140d.mo65795b4();
                C26050a mw = this.f67140d.f67118k;
                C41536l.m120488h(eVar, "it");
                C37224b.m109965d(Cw, mw.mo64941d(eVar, this.f67141e.mo64328e().mo35450j()));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo65812a((C20035e) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26536d(C26532l lVar) {
            super(1);
            this.f67139d = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m82935c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            C40762x m = this.f67139d.f67111d.mo49054a(this.f67139d.mo65799Aw((ApproveOpcParams) mVar.mo95675a())).mo95084m(new C26541m(new C26537a(this.f67139d, (C25741a) mVar.mo95676b())));
            C41536l.m120488h(m, "private fun subscribeToG…ndToLifecycle()\n        }");
            return C31270e.m92880i(m, -1);
        }
    }

    /* renamed from: nk0.l$e */
    static final class C26538e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26532l f67142d;

        /* renamed from: e */
        final /* synthetic */ Long f67143e;

        /* renamed from: nk0.l$e$a */
        static final class C26539a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26532l f67144d;

            /* renamed from: e */
            final /* synthetic */ Long f67145e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26539a(C26532l lVar, Long l) {
                super(1);
                this.f67144d = lVar;
                this.f67145e = l;
            }

            /* renamed from: a */
            public final List invoke(C27637o oVar) {
                C41536l.m120489i(oVar, "it");
                return this.f67144d.f67117j.mo64947b(oVar, this.f67145e);
            }
        }

        /* renamed from: nk0.l$e$b */
        /* synthetic */ class C26540b extends C41535k implements C43075l {
            C26540b(Object obj) {
                super(1, obj, C26532l.class, "filterAndCheckAddedCards", "filterAndCheckAddedCards(Ljava/util/List;)Lio/reactivex/Single;", 0);
            }

            /* renamed from: b */
            public final C40762x invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C26532l) this.receiver).m82910qw(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26538e(C26532l lVar, Long l) {
            super(1);
            this.f67142d = lVar;
            this.f67143e = l;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C40735b0 m82940d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40735b0) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40749p W = this.f67142d.f67112e.mo65886c(C41341q.m119910m(6, 2).contains(num)).mo95026k0(new C26542n(new C26539a(this.f67142d, this.f67143e))).mo95010W(new C26543o(new C26540b(this.f67142d)));
            C41536l.m120488h(W, "private fun subscribeToI…ndToLifecycle()\n        }");
            return C31270e.m92879h(W, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26532l(C20524h hVar, C26633o oVar, C36735g gVar, C20526j jVar, C26629k kVar, C19393b bVar, C26052b bVar2, C26050a aVar, C27494a aVar2, C31658b bVar3, Long l) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(hVar, "generateOpc");
        C41536l.m120489i(oVar, "getCardsAndDetailsUseCase");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(jVar, "getHardwareAndWalletId");
        C41536l.m120489i(kVar, "getCardBlockStatusUseCase");
        C41536l.m120489i(bVar, "checkIfCardsAreAddedToWallet");
        C41536l.m120489i(bVar2, "googlePayMapper");
        C41536l.m120489i(aVar, "tokenizeMapper");
        C41536l.m120489i(aVar2, "otpParamsMapBuilder");
        C41536l.m120489i(bVar3, "startTMXProfilingUseCase");
        this.f67111d = hVar;
        this.f67112e = oVar;
        this.f67113f = gVar;
        this.f67114g = jVar;
        this.f67115h = kVar;
        this.f67116i = bVar;
        this.f67117j = bVar2;
        this.f67118k = aVar;
        this.f67119l = aVar2;
        this.f67120m = bVar3;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<Pair<ApproveOpcPa…s, GooglePayCardModel>>()");
        this.f67125r = h1;
        this.f67126s = new C1644x();
        this.f67127t = new C1644x();
        this.f67128u = new C1644x();
        this.f67129v = new C1644x();
        this.f67130w = new C1644x();
        this.f67131x = new C1644x();
        this.f67132y = new C1644x();
        this.f67133z = new C1644x();
        m82895Jw(l);
        m82893Hw();
        bindToLifecycle(bVar3.mo72084b(TMXFlags.TMX_WALLET_CARD_ADD));
    }

    /* renamed from: Ew */
    private final void m82890Ew(String str, String str2) {
        C36546y.m108282F().mo27137H("Google_Pay", str, (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public final boolean m82891Fw(C20033c cVar, C25741a aVar) {
        if (!C41536l.m120484d(cVar.mo48410a().mo48405d(), aVar.mo64328e().mo35447h()) || cVar.mo48410a().mo48406e() != m82912uw(aVar.mo64328e().mo35443e())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public static final void m82892Gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Hw */
    private final void m82893Hw() {
        C40749p L0 = this.f67125r.mo94989L0(new C26530j(new C26536d(this)));
        C41536l.m120488h(L0, "private fun subscribeToG…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, mo65794Zi()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final C40754t m82894Iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Jw */
    private final void m82895Jw(Long l) {
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C26528h(new C26538e(this, l)));
        C41536l.m120488h(L0, "private fun subscribeToI…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, mo65796g3()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public static final C40754t m82896Kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: pw */
    private final C20032b m82909pw(C25741a aVar) {
        return new C20032b(aVar.mo64328e().mo35447h(), m82912uw(aVar.mo64328e().mo35443e()), m82913vw(aVar.mo64328e().mo35443e()));
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public final C40762x m82910qw(List list) {
        C19393b bVar = this.f67116i;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m82909pw((C25741a) it.next()));
        }
        C40762x A = bVar.mo47614a(arrayList).mo95062A(new C26531k(new C26534b(list, this)));
        C41536l.m120488h(A, "private fun filterAndChe…          }\n            }");
        return A;
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final List m82911rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: uw */
    private final C20031a m82912uw(C18763a aVar) {
        int i = C26533a.f67134a[aVar.ordinal()];
        if (i == 1) {
            return C20031a.CARD_NETWORK_VISA;
        }
        if (i != 2) {
            return C20031a.CARD_NETWORK_MASTERCARD;
        }
        return C20031a.CARD_NETWORK_AMEX;
    }

    /* renamed from: vw */
    private final C20036f m82913vw(C18763a aVar) {
        int i = C26533a.f67134a[aVar.ordinal()];
        if (i == 1) {
            return C20036f.TOKEN_PROVIDER_VISA;
        }
        if (i != 2) {
            return C20036f.TOKEN_PROVIDER_MASTERCARD;
        }
        return C20036f.TOKEN_PROVIDER_AMEX;
    }

    /* renamed from: Aw */
    public HashMap mo65799Aw(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f67119l.mo66809a(otpParams);
    }

    /* renamed from: Bw */
    public final C26527g mo65800Bw() {
        return this.f67124q;
    }

    /* renamed from: Cw */
    public C1644x mo65795b4() {
        return this.f67128u;
    }

    /* renamed from: Dw */
    public C1644x mo65793V2() {
        return this.f67133z;
    }

    /* renamed from: H3 */
    public void mo65790H3() {
        C25741a aVar = this.f67121n;
        if (aVar != null) {
            C20262b f = aVar.mo64330f();
            if (f != null) {
                C37224b.m109965d(mo65793V2(), f);
                return;
            }
            m82890Ew(C10457a.f29783d, aVar.mo64331g());
            C40734b y = this.f67114g.mo49055b().mo95084m(new C26529i(new C26535c(aVar, this))).mo95092y();
            C41536l.m120488h(y, "override fun requestOpc(…ndToLifecycle()\n        }");
            bindToLifecycle(C31270e.m92876e(C31270e.m92878g(y, -1), mo65803sw()));
        }
    }

    /* renamed from: sw */
    public C1644x mo65803sw() {
        return this.f67131x;
    }

    /* renamed from: tw */
    public C1644x mo65798y1() {
        return this.f67132y;
    }

    /* renamed from: v3 */
    public void mo65791v3(C25741a aVar) {
        C41536l.m120489i(aVar, "card");
        this.f67121n = aVar;
        bindToLifecycle(C31270e.m92876e(C31270e.m92880i(this.f67115h.mo65883a(Long.parseLong(aVar.mo64327d())), -1), mo65798y1()));
    }

    /* renamed from: ww */
    public C1644x mo65796g3() {
        return this.f67127t;
    }

    /* renamed from: xw */
    public final C26526f mo65806xw() {
        return this.f67123p;
    }

    /* renamed from: yk */
    public void mo65792yk(String str, String str2, String str3) {
        C41224m mVar;
        C41224m a;
        if (C32300e0.f79712a.mo72816a(str, str2, str3) && (mVar = this.f67122o) != null && (a = C41233s.m119492a(ApproveOpcParams.copy$default((ApproveOpcParams) mVar.mo95675a(), (String) null, (String) null, (String) null, (String) null, (String) null, str, str2, str3, 31, (Object) null), (C25741a) mVar.mo95676b())) != null) {
            this.f67125r.onNext(a);
        }
    }

    /* renamed from: yw */
    public C1644x mo65794Zi() {
        return this.f67126s;
    }

    /* renamed from: zw */
    public C1644x mo65797t() {
        return this.f67129v;
    }
}

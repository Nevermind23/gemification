package p341ge.bog.mobilebank.giftcards.presentation.purchase;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ej0.C20253h;
import ej0.C20255i;
import ej0.C20256j;
import ej0.C20257k;
import ej0.C20260n;
import g91.C32343x;
import hc1.C41145d;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import j51.C36735g;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jj0.C25459a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import m51.C37228a;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.giftcards.presentation.purchase.C24350a;
import rh0.C28038e;
import ue1.C43064a;
import ue1.C43075l;
import vh0.C29075a;
import vh0.C29076b;
import vh0.C29078d;
import wh0.C29398f;
import wh0.C29402i;
import wh0.C29406m;
import wh0.C29409p;
import wh0.C29417x;
import xh0.C29796l;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseViewModel$ViewModel */
public final class GiftCardsPurchaseViewModel$ViewModel extends C21481a implements C20255i {

    /* renamed from: z */
    public static final C24345b f62867z = new C24345b((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C29398f f62868d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C29402i f62869e;

    /* renamed from: f */
    private final C29417x f62870f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C29409p f62871g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C29406m f62872h;

    /* renamed from: i */
    private final C36735g f62873i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C20260n f62874j;

    /* renamed from: k */
    private final C25459a f62875k;

    /* renamed from: l */
    private final C28038e f62876l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C20253h f62877m;

    /* renamed from: n */
    private C20255i f62878n = this;

    /* renamed from: o */
    private boolean f62879o;

    /* renamed from: p */
    private C29796l f62880p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public List f62881q;

    /* renamed from: r */
    private final boolean f62882r;

    /* renamed from: s */
    private final C1644x f62883s;

    /* renamed from: t */
    private final C1644x f62884t;

    /* renamed from: u */
    private final C1644x f62885u;

    /* renamed from: v */
    private final C1644x f62886v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C1644x f62887w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C1644x f62888x;

    /* renamed from: y */
    private final C1644x f62889y;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseViewModel$ViewModel$a */
    static final class C24342a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsPurchaseViewModel$ViewModel f62890d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseViewModel$ViewModel$a$a */
        static final class C24343a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GiftCardsPurchaseViewModel$ViewModel f62891d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24343a(GiftCardsPurchaseViewModel$ViewModel giftCardsPurchaseViewModel$ViewModel) {
                super(1);
                this.f62891d = giftCardsPurchaseViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo62049a(List list) {
                this.f62891d.f62881q = list;
                GiftCardsPurchaseViewModel$ViewModel giftCardsPurchaseViewModel$ViewModel = this.f62891d;
                C41536l.m120488h(list, "accounts");
                giftCardsPurchaseViewModel$ViewModel.m78293Aw(list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo62049a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseViewModel$ViewModel$a$b */
        static final class C24344b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GiftCardsPurchaseViewModel$ViewModel f62892d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24344b(GiftCardsPurchaseViewModel$ViewModel giftCardsPurchaseViewModel$ViewModel) {
                super(1);
                this.f62892d = giftCardsPurchaseViewModel$ViewModel;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "accounts");
                return this.f62892d.f62874j.mo48731d(list, "GEL");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24342a(GiftCardsPurchaseViewModel$ViewModel giftCardsPurchaseViewModel$ViewModel) {
            super(1);
            this.f62890d = giftCardsPurchaseViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m78327d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final List m78328e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40762x A = this.f62890d.f62869e.mo69242a().mo95084m(new C24358b(new C24343a(this.f62890d))).mo95062A(new C24359c(new C24344b(this.f62890d)));
            C41536l.m120488h(A, "@HiltViewModel\n    class…giftcard\"\n        }\n    }");
            return C31270e.m92880i(A, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseViewModel$ViewModel$b */
    public static final class C24345b {
        private C24345b() {
        }

        public /* synthetic */ C24345b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseViewModel$ViewModel$c */
    static final class C24346c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardsPurchaseViewModel$ViewModel f62893d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24346c(GiftCardsPurchaseViewModel$ViewModel giftCardsPurchaseViewModel$ViewModel) {
            super(0);
            this.f62893d = giftCardsPurchaseViewModel$ViewModel;
        }

        /* renamed from: b */
        public final C40734b invoke() {
            return this.f62893d.f62872h.mo69246a();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseViewModel$ViewModel$d */
    static final class C24347d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardsPurchaseViewModel$ViewModel f62894d;

        /* renamed from: e */
        final /* synthetic */ String f62895e;

        /* renamed from: f */
        final /* synthetic */ String f62896f;

        /* renamed from: g */
        final /* synthetic */ String f62897g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24347d(GiftCardsPurchaseViewModel$ViewModel giftCardsPurchaseViewModel$ViewModel, String str, String str2, String str3) {
            super(0);
            this.f62894d = giftCardsPurchaseViewModel$ViewModel;
            this.f62895e = str;
            this.f62896f = str2;
            this.f62897g = str3;
        }

        /* renamed from: b */
        public final C40734b invoke() {
            return this.f62894d.f62871g.mo69249a(this.f62894d.f62877m.mo48723a(this.f62895e, this.f62896f, this.f62897g, "purchase-giftcard"));
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseViewModel$ViewModel$e */
    static final class C24348e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsPurchaseViewModel$ViewModel f62898d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseViewModel$ViewModel$e$a */
        static final class C24349a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GiftCardsPurchaseViewModel$ViewModel f62899d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24349a(GiftCardsPurchaseViewModel$ViewModel giftCardsPurchaseViewModel$ViewModel) {
                super(1);
                this.f62899d = giftCardsPurchaseViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo62054a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                C37224b.m109965d(this.f62899d.f62887w, C24350a.C24352b.f62901a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo62054a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24348e(GiftCardsPurchaseViewModel$ViewModel giftCardsPurchaseViewModel$ViewModel) {
            super(1);
            this.f62898d = giftCardsPurchaseViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo62053a(C31128a aVar) {
            this.f62898d.f62888x.mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C24349a(this.f62898d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62053a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GiftCardsPurchaseViewModel$ViewModel(C29398f fVar, C29402i iVar, C29417x xVar, C29409p pVar, C29406m mVar, C36735g gVar, C20260n nVar, C25459a aVar, C28038e eVar, C20253h hVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        boolean z;
        C29417x xVar2 = xVar;
        C29409p pVar2 = pVar;
        C29406m mVar2 = mVar;
        C36735g gVar2 = gVar;
        C20260n nVar2 = nVar;
        C25459a aVar2 = aVar;
        C28038e eVar2 = eVar;
        C20253h hVar2 = hVar;
        C41536l.m120489i(fVar, "getDraftPurchaseModel");
        C41536l.m120489i(iVar, "getTransferAccounts");
        C41536l.m120489i(xVar2, "saveSelectedAccount");
        C41536l.m120489i(pVar2, "purchaseGiftCard");
        C41536l.m120489i(mVar2, "giveAwayGiftCardUseCase");
        C41536l.m120489i(gVar2, "getLoginInfo");
        C41536l.m120489i(nVar2, "transferAccountUiMapper");
        C41536l.m120489i(aVar2, "animationsUiMapper");
        C41536l.m120489i(eVar2, "purchaseMapper");
        C41536l.m120489i(hVar2, "giftCardsPurchaseHeadersBuilder");
        C41238w wVar = null;
        boolean z2 = true;
        this.f62868d = fVar;
        this.f62869e = iVar;
        this.f62870f = xVar2;
        this.f62871g = pVar2;
        this.f62872h = mVar2;
        this.f62873i = gVar2;
        this.f62874j = nVar2;
        this.f62875k = aVar2;
        this.f62876l = eVar2;
        this.f62877m = hVar2;
        C29076b j = fVar.mo69239a().mo68945j();
        C29076b bVar = C29076b.PURCHASE;
        if (j == bVar) {
            z = true;
        } else {
            z = false;
        }
        this.f62882r = z;
        this.f62883s = new C1644x(fVar.mo69239a());
        C1644x xVar3 = new C1644x();
        this.f62884t = xVar3;
        C1644x xVar4 = new C1644x();
        this.f62885u = xVar4;
        C1644x xVar5 = new C1644x();
        this.f62886v = xVar5;
        this.f62887w = new C1644x();
        this.f62888x = new C1644x();
        this.f62889y = new C1644x(Boolean.valueOf(fVar.mo69239a().mo68945j() != bVar ? false : z2));
        if (z) {
            C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C20257k(new C24342a(this)));
            C41536l.m120488h(L0, "merge(\n                 …T_CODE)\n                }");
            bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), xVar5));
            C29796l t = fVar.mo69239a().mo68955t();
            if (t != null) {
                m78308zw(t);
                wVar = C41238w.f97225a;
            }
            if (wVar == null) {
                xVar4.mo4823o(CreditCardSmallPickerView.C13279b.C13280a.f39265a);
            }
        }
        C29075a g = fVar.mo69239a().mo68941g();
        if (g != null) {
            xVar3.mo4823o(C25459a.m80628b(aVar, g.mo68929b(), g.mo68931d(), (BigDecimal) null, 4, (Object) null));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public final void m78293Aw(List list) {
        Object obj;
        if (this.f62868d.mo69239a().mo68955t() != null) {
            return;
        }
        if (list.size() == 1) {
            m78308zw((C29796l) C41358y.m120007W(list));
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C29796l) obj).mo70032l()) {
                break;
            }
        }
        C29796l lVar = (C29796l) obj;
        if (lVar != null) {
            m78308zw(lVar);
        }
    }

    /* renamed from: Bw */
    private final void m78294Bw(C43064a aVar) {
        C41205b F0 = C31270e.m92878g(C32343x.m95411Q0((C40734b) aVar.invoke()), 1).mo94981F0(new C20256j(new C24348e(this)));
        C41536l.m120488h(F0, "private fun sendPurchase…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final void m78295Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m78298fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: zw */
    private final void m78308zw(C29796l lVar) {
        this.f62880p = lVar;
        this.f62885u.mo4823o(this.f62874j.mo48730c(lVar));
    }

    /* renamed from: Ir */
    public void mo48725Ir() {
        boolean z = this.f62882r;
        if (z && !this.f62879o) {
            C37224b.m109965d(this.f62887w, C24350a.C24356f.f62906a);
        } else if (z && this.f62880p == null) {
            mo48727Og();
        } else if (this.f62868d.mo69239a().mo68958v()) {
            mo48729nk();
        } else {
            C37224b.m109965d(this.f62887w, new C24350a.C24357g(this.f62868d.mo69239a().mo68954s()));
        }
    }

    /* renamed from: K0 */
    public void mo48726K0(boolean z) {
        this.f62879o = z;
    }

    /* renamed from: Og */
    public void mo48727Og() {
        C1644x xVar = this.f62887w;
        C29796l lVar = this.f62880p;
        C37224b.m109965d(xVar, new C24350a.C24353c(lVar != null ? Long.valueOf(lVar.mo70027h()) : null));
    }

    /* renamed from: c3 */
    public void mo48728c3() {
        C37224b.m109965d(this.f62887w, C24350a.C24355e.f62905a);
    }

    /* renamed from: nk */
    public void mo48729nk() {
        long j;
        String a;
        C29796l lVar = this.f62880p;
        if (lVar != null) {
            this.f62870f.mo69257a(lVar);
        }
        if (this.f62882r) {
            C1644x xVar = this.f62887w;
            Map b = this.f62877m.mo48724b();
            C28038e eVar = this.f62876l;
            C29078d a2 = this.f62868d.mo69239a();
            C37228a a3 = this.f62873i.mo89562a();
            if (a3 == null || (a = a3.mo90304a()) == null) {
                j = -1;
            } else {
                j = Long.parseLong(a);
            }
            C37224b.m109965d(xVar, new C24350a.C24354d("purchase-giftcard", new C41145d(b, (Map) null, C32343x.m95469n(eVar.mo67578a(a2, j)), 2, (DefaultConstructorMarker) null)));
            return;
        }
        m78294Bw(new C24346c(this));
    }

    /* renamed from: pw */
    public LiveData mo62037pw() {
        return this.f62889y;
    }

    /* renamed from: qw */
    public LiveData mo62038qw() {
        return this.f62886v;
    }

    /* renamed from: rw */
    public LiveData mo62039rw() {
        return this.f62884t;
    }

    /* renamed from: sw */
    public final C20255i mo62040sw() {
        return this.f62878n;
    }

    /* renamed from: tw */
    public LiveData mo62041tw() {
        return this.f62888x;
    }

    /* renamed from: uw */
    public LiveData mo62042uw() {
        return this.f62883s;
    }

    /* renamed from: vw */
    public LiveData mo62043vw() {
        return this.f62885u;
    }

    /* renamed from: w8 */
    public void mo62044w8(long j) {
        Object obj;
        boolean z;
        List list = this.f62881q;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C29796l) obj).mo70027h() == j) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C29796l lVar = (C29796l) obj;
            if (lVar != null) {
                m78308zw(lVar);
            }
        }
    }

    /* renamed from: ww */
    public LiveData mo62045ww() {
        return this.f62887w;
    }

    /* renamed from: xw */
    public void mo62046xw() {
        C29796l lVar = this.f62880p;
        if (lVar != null) {
            this.f62870f.mo69257a(lVar);
        }
        C37224b.m109965d(this.f62887w, C24350a.C24351a.f62900a);
    }

    /* renamed from: yw */
    public void mo62047yw(String str, String str2, String str3) {
        m78294Bw(new C24347d(this, str, str2, str3));
    }
}

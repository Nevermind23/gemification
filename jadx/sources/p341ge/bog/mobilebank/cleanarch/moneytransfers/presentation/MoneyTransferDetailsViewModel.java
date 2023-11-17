package p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.repository.MoneyTransferRepositoryImpl;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.domain.model.RemittanceCreditInfoContract;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p763fz.C20579a;
import p763fz.C20583e;
import p763fz.C20587i;
import p777gz.C24840c;
import p796iz.C25267a;
import p796iz.C25268b;
import p796iz.C25269c;
import p796iz.C25270d;
import p796iz.C25271e;
import p796iz.C25272f;
import pc0.C27494a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferDetailsViewModel */
public final class MoneyTransferDetailsViewModel extends C21481a {

    /* renamed from: d */
    private final C20587i f56856d;

    /* renamed from: e */
    private final C20579a f56857e;

    /* renamed from: f */
    private final C20583e f56858f;

    /* renamed from: g */
    private final C27494a f56859g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f56860h = new C1644x();

    /* renamed from: i */
    private final C1644x f56861i = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1644x f56862j = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferDetailsViewModel$a */
    static final class C21168a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsViewModel f56863d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21168a(MoneyTransferDetailsViewModel moneyTransferDetailsViewModel) {
            super(1);
            this.f56863d = moneyTransferDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo53067a(C41205b bVar) {
            C21484c.m69417i(this.f56863d.f56862j, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53067a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferDetailsViewModel$b */
    static final class C21169b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsViewModel f56864d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21169b(MoneyTransferDetailsViewModel moneyTransferDetailsViewModel) {
            super(1);
            this.f56864d = moneyTransferDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo53068a(RemittanceCreditInfoContract remittanceCreditInfoContract) {
            C1644x kw = this.f56864d.f56862j;
            C41536l.m120488h(remittanceCreditInfoContract, "it");
            C21484c.m69418j(kw, remittanceCreditInfoContract);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53068a((RemittanceCreditInfoContract) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferDetailsViewModel$c */
    static final class C21170c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsViewModel f56865d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21170c(MoneyTransferDetailsViewModel moneyTransferDetailsViewModel) {
            super(1);
            this.f56865d = moneyTransferDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f56865d.f56862j, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferDetailsViewModel$d */
    static final class C21171d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsViewModel f56866d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21171d(MoneyTransferDetailsViewModel moneyTransferDetailsViewModel) {
            super(1);
            this.f56866d = moneyTransferDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo53070a(C41205b bVar) {
            C21484c.m69417i(this.f56866d.f56860h, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53070a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferDetailsViewModel$e */
    static final class C21172e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsViewModel f56867d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21172e(MoneyTransferDetailsViewModel moneyTransferDetailsViewModel) {
            super(1);
            this.f56867d = moneyTransferDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo53071a(C24840c cVar) {
            C1644x jw = this.f56867d.f56860h;
            C41536l.m120488h(cVar, "it");
            C21484c.m69418j(jw, cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53071a((C24840c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferDetailsViewModel$f */
    static final class C21173f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsViewModel f56868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21173f(MoneyTransferDetailsViewModel moneyTransferDetailsViewModel) {
            super(1);
            this.f56868d = moneyTransferDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f56868d.f56860h, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoneyTransferDetailsViewModel(C20587i iVar, C20579a aVar, C20583e eVar, C27494a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(iVar, "receiveMoneyTransferUseCase");
        C41536l.m120489i(aVar, "convertMoneyUseCase");
        C41536l.m120489i(eVar, "getRemittanceCreditInfoContractUseCase");
        C41536l.m120489i(aVar2, "otpParamsMapBuilder");
        this.f56856d = iVar;
        this.f56857e = aVar;
        this.f56858f = eVar;
        this.f56859g = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m68549pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m68550qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m68551rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final void m68552tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final void m68553uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final void m68554vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: I5 */
    public final LiveData mo53061I5() {
        return this.f56860h;
    }

    /* renamed from: lw */
    public final LiveData mo53062lw() {
        return this.f56861i;
    }

    /* renamed from: mw */
    public final MoneyTransferRepositoryImpl.MoneyTransferParams mo53063mw(String str, MoneyTransferWizardData moneyTransferWizardData) {
        String str2;
        C41536l.m120489i(str, "systemName");
        boolean z = false;
        if (moneyTransferWizardData != null && moneyTransferWizardData.mo53185x()) {
            z = true;
        }
        String str3 = null;
        if (!z) {
            return null;
        }
        String v = moneyTransferWizardData.mo53183v();
        String r = moneyTransferWizardData.mo53178r();
        String t = moneyTransferWizardData.mo53180t();
        MoneyTransferWizardData.Country l = moneyTransferWizardData.mo53174l();
        if (l == null || (str2 = l.mo53189b()) == null) {
            str2 = moneyTransferWizardData.mo53175m();
        }
        Double b = moneyTransferWizardData.mo53162b();
        C41536l.m120486f(b);
        String valueOf = String.valueOf(b.doubleValue());
        AccountLov k = moneyTransferWizardData.mo53173k();
        if (k != null) {
            str3 = k.getAcctNo();
        }
        if (str3 == null) {
            str3 = "";
        }
        return new MoneyTransferRepositoryImpl.MoneyTransferParams(str, v, r, t, str2, valueOf, str3, moneyTransferWizardData.mo53165e(), (Integer) null, "UMTS_RECEIVE_TRANSFER_UPDATE_CREDIT_INFO_STATUS", (String) null, (String) null, (String) null);
    }

    /* renamed from: nw */
    public final LiveData mo53064nw() {
        return this.f56862j;
    }

    /* renamed from: ow */
    public final void mo53065ow(String str, String str2) {
        C41536l.m120489i(str, "systemName");
        C41205b I = this.f56858f.mo49120a(str, str2).mo95083l(new C25270d(new C21168a(this))).mo95070I(new C25271e(new C21169b(this)), new C25272f(new C21170c(this)));
        C41536l.m120488h(I, "fun onReceiveTransferBut…       })\n        )\n    }");
        addDisposable(I);
    }

    /* renamed from: sw */
    public final void mo53066sw(String str, MoneyTransferWizardData moneyTransferWizardData) {
        C41536l.m120489i(str, "systemName");
        boolean z = false;
        if (moneyTransferWizardData != null && moneyTransferWizardData.mo53185x()) {
            z = true;
        }
        if (z) {
            C20587i iVar = this.f56856d;
            C27494a aVar = this.f56859g;
            MoneyTransferRepositoryImpl.MoneyTransferParams mw = mo53063mw(str, moneyTransferWizardData);
            C41536l.m120486f(mw);
            C41205b I = iVar.mo49124a(aVar.mo66809a(mw)).mo95083l(new C25267a(new C21171d(this))).mo95070I(new C25268b(new C21172e(this)), new C25269c(new C21173f(this)));
            C41536l.m120488h(I, "fun receiveTransfer(\n   …        )\n        }\n    }");
            addDisposable(I);
        }
    }
}

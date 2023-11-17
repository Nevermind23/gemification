package p836mz;

import androidx.lifecycle.C1644x;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.repository.MoneyTransferRepositoryImpl;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.domain.model.RemittanceCreditInfoContract;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p763fz.C20587i;
import p777gz.C24840c;
import pc0.C27494a;
import ue1.C43075l;

/* renamed from: mz.r */
public final class C26332r extends C21481a implements C26327m, C26328n {

    /* renamed from: d */
    private final C20587i f66688d;

    /* renamed from: e */
    private final C27494a f66689e;

    /* renamed from: f */
    private final MoneyTransferTypeUiModel f66690f;

    /* renamed from: g */
    private final MoneyTransferWizardData f66691g;

    /* renamed from: h */
    private final RemittanceCreditInfoContract f66692h;

    /* renamed from: i */
    private final C26327m f66693i = this;

    /* renamed from: j */
    private final C26328n f66694j = this;

    /* renamed from: k */
    private final C1644x f66695k = new C1644x();

    /* renamed from: l */
    private final C1644x f66696l = new C1644x();

    /* renamed from: m */
    private final C1644x f66697m = new C1644x();

    /* renamed from: n */
    private final C1644x f66698n = new C1644x();

    /* renamed from: mz.r$a */
    static final class C26333a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26332r f66699d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26333a(C26332r rVar) {
            super(1);
            this.f66699d = rVar;
        }

        /* renamed from: a */
        public final void mo65509a(C41205b bVar) {
            C21484c.m69417i(this.f66699d.mo65498I5(), (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo65509a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: mz.r$b */
    static final class C26334b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26332r f66700d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26334b(C26332r rVar) {
            super(1);
            this.f66700d = rVar;
        }

        /* renamed from: a */
        public final void mo65510a(C24840c cVar) {
            C1644x mw = this.f66700d.mo65498I5();
            C41536l.m120488h(cVar, "it");
            C21484c.m69418j(mw, cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo65510a((C24840c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: mz.r$c */
    static final class C26335c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26332r f66701d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26335c(C26332r rVar) {
            super(1);
            this.f66701d = rVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f66701d.mo65498I5(), th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26332r(C20587i iVar, C27494a aVar, MoneyTransferTypeUiModel moneyTransferTypeUiModel, MoneyTransferWizardData moneyTransferWizardData, RemittanceCreditInfoContract remittanceCreditInfoContract) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(iVar, "receiveMoneyTransferUseCase");
        C41536l.m120489i(aVar, "otpParamsMapBuilder");
        C41536l.m120489i(moneyTransferTypeUiModel, "transferModel");
        C41536l.m120489i(moneyTransferWizardData, "wizardData");
        C41536l.m120489i(remittanceCreditInfoContract, "remittanceCreditInfoContract");
        this.f66688d = iVar;
        this.f66689e = aVar;
        this.f66690f = moneyTransferTypeUiModel;
        this.f66691g = moneyTransferWizardData;
        this.f66692h = remittanceCreditInfoContract;
        mo65497Df().mo4826r(new C41224m(remittanceCreditInfoContract.mo53047a(), remittanceCreditInfoContract.mo53048b()));
        mo65499Ll().mo4826r(new C41224m(remittanceCreditInfoContract.mo53049d(), remittanceCreditInfoContract.mo53051e()));
    }

    /* renamed from: kw */
    private final MoneyTransferRepositoryImpl.MoneyTransferParams m82305kw(boolean z) {
        String str;
        String str2 = null;
        if (!this.f66691g.mo53185x()) {
            return null;
        }
        String d = this.f66690f.mo53145d();
        String v = this.f66691g.mo53183v();
        String r = this.f66691g.mo53178r();
        String t = this.f66691g.mo53180t();
        MoneyTransferWizardData.Country l = this.f66691g.mo53174l();
        if (l == null || (str = l.mo53189b()) == null) {
            str = this.f66691g.mo53175m();
        }
        String str3 = str;
        Double b = this.f66691g.mo53162b();
        C41536l.m120486f(b);
        String valueOf = String.valueOf(b.doubleValue());
        AccountLov k = this.f66691g.mo53173k();
        if (k != null) {
            str2 = k.getAcctNo();
        }
        if (str2 == null) {
            str2 = "";
        }
        return new MoneyTransferRepositoryImpl.MoneyTransferParams(d, v, r, t, str3, valueOf, str2, this.f66691g.mo53165e(), Integer.valueOf(z ? 1 : 0), "UMTS_RECEIVE_TRANSFER_UPDATE_CREDIT_INFO_STATUS", (String) null, (String) null, (String) null);
    }

    /* renamed from: pw */
    private final void m82306pw(MoneyTransferRepositoryImpl.MoneyTransferParams moneyTransferParams) {
        C41205b I = this.f66688d.mo49124a(this.f66689e.mo66809a(moneyTransferParams)).mo95083l(new C26329o(new C26333a(this))).mo95070I(new C26330p(new C26334b(this)), new C26331q(new C26335c(this)));
        C41536l.m120488h(I, "private fun receiveTrans…)\n            )\n        }");
        addDisposable(I);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m82307qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m82308rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final void m82309sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: cj */
    public void mo65495cj() {
        mo65500N3().mo4826r(C32343x.m95466m(C41238w.f97225a));
    }

    /* renamed from: gw */
    public C1644x mo65497Df() {
        return this.f66695k;
    }

    /* renamed from: hw */
    public C1644x mo65500N3() {
        return this.f66697m;
    }

    /* renamed from: iw */
    public C1644x mo65499Ll() {
        return this.f66696l;
    }

    /* renamed from: jw */
    public final C26327m mo65504jw() {
        return this.f66693i;
    }

    /* renamed from: lw */
    public final C26328n mo65505lw() {
        return this.f66694j;
    }

    /* renamed from: mw */
    public C1644x mo65498I5() {
        return this.f66698n;
    }

    /* renamed from: nw */
    public final MoneyTransferTypeUiModel mo65507nw() {
        return this.f66690f;
    }

    /* renamed from: ow */
    public final MoneyTransferWizardData mo65508ow() {
        return this.f66691g;
    }

    /* renamed from: xl */
    public void mo65496xl(boolean z) {
        MoneyTransferRepositoryImpl.MoneyTransferParams kw = m82305kw(z);
        if (kw != null) {
            m82306pw(kw);
        }
    }
}

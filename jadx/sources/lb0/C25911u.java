package lb0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed0.C20217b;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import fd0.C20463a;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kb0.C25702a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.DepositSubmissionNavData;
import ue1.C43075l;
import ya0.C29957a;

/* renamed from: lb0.u */
public final class C25911u extends C21481a implements C25907q, C25908r, C29957a {

    /* renamed from: o */
    public static final C25912a f65920o = new C25912a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C20217b f65921d;

    /* renamed from: e */
    private final C29957a f65922e;

    /* renamed from: f */
    private final DepositSubmissionNavData f65923f;

    /* renamed from: g */
    private final C25907q f65924g = this;

    /* renamed from: h */
    private final C25908r f65925h = this;

    /* renamed from: i */
    private final C1644x f65926i = new C1644x();

    /* renamed from: j */
    private final C1644x f65927j = new C1644x();

    /* renamed from: k */
    private final C1644x f65928k = new C1644x();

    /* renamed from: l */
    private final C1644x f65929l = new C1644x();

    /* renamed from: m */
    private final C1644x f65930m = new C1644x();

    /* renamed from: n */
    private final C40767b f65931n;

    /* renamed from: lb0.u$a */
    public static final class C25912a {
        private C25912a() {
        }

        public /* synthetic */ C25912a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lb0.u$b */
    public /* synthetic */ class C25913b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65932a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ka0.d[] r0 = ka0.C25695d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ka0.d r1 = ka0.C25695d.CALL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ka0.d r1 = ka0.C25695d.ENLARG     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ka0.d r1 = ka0.C25695d.PREMIUM     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f65932a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lb0.C25911u.C25913b.<clinit>():void");
        }
    }

    /* renamed from: lb0.u$c */
    static final class C25914c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25911u f65933d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25914c(C25911u uVar) {
            super(1);
            this.f65933d = uVar;
        }

        /* renamed from: a */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "lookupName");
            return this.f65933d.f65921d.mo48650b(str).mo95075O();
        }
    }

    /* renamed from: lb0.u$d */
    static final class C25915d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25911u f65934d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25915d(C25911u uVar) {
            super(1);
            this.f65934d = uVar;
        }

        /* renamed from: a */
        public final void mo64767a(List list) {
            Boolean bool = Boolean.FALSE;
            C41224m mVar = new C41224m(bool, bool);
            C41536l.m120488h(list, "lookups");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C20463a aVar = (C20463a) it.next();
                if (C41536l.m120484d(aVar.mo49003c(), "CAS")) {
                    mVar = C41224m.m119472d(mVar, Boolean.TRUE, (Object) null, 2, (Object) null);
                } else if (C41536l.m120484d(aVar.mo49003c(), "STO")) {
                    mVar = C41224m.m119472d(mVar, (Object) null, Boolean.TRUE, 1, (Object) null);
                }
            }
            this.f65934d.mo64729Ra().mo4823o(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64767a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25911u(C20217b bVar, C29957a aVar, DepositSubmissionNavData depositSubmissionNavData) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getLookupUseCase");
        C41536l.m120489i(aVar, "depositSecondStepDelegate");
        C41536l.m120489i(depositSubmissionNavData, "depositNavData");
        this.f65921d = bVar;
        this.f65922e = aVar;
        this.f65923f = depositSubmissionNavData;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f65931n = h1;
        mo64759lr(onRefresh());
        mo64740Rd();
        mo64734Ja();
        m81430nw();
        int i = C25913b.f65932a[depositSubmissionNavData.mo57172g().ordinal()];
        if (i == 1) {
            h1.onNext("DEPOSIT_SAVING_PROGRAM.CALL");
        } else if (i == 2) {
            h1.onNext("DEPOSIT_SAVING_PROGRAM.ENLARG");
        } else if (i == 3) {
            h1.onNext("DEPOSIT_SAVING_PROGRAM.PREMIUM");
        }
        aVar.mo64764ov(new C25702a(depositSubmissionNavData, (DepositPurposeUiModel) null, (String) null, (TransferAccountItem) null, 14, (DefaultConstructorMarker) null));
    }

    /* renamed from: nw */
    private final void m81430nw() {
        C40749p L0 = this.f65931n.mo94989L0(new C25909s(new C25914c(this)));
        C41536l.m120488h(L0, "private fun subscribeGet…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C25910t(new C25915d(this)));
        C41536l.m120488h(F0, "private fun subscribeGet…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final C40754t m81431ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m81432pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: F0 */
    public LiveData mo64733F0() {
        return this.f65922e.mo64733F0();
    }

    /* renamed from: Ja */
    public void mo64734Ja() {
        this.f65922e.mo64734Ja();
    }

    /* renamed from: Kb */
    public void mo64735Kb(AccumulateOnPaymentModel accumulateOnPaymentModel) {
        String str;
        DepositSubmissionNavData g;
        C41536l.m120489i(accumulateOnPaymentModel, "accumulateOnPaymentModel");
        mo64762mj(accumulateOnPaymentModel);
        BigDecimal e = accumulateOnPaymentModel.mo57120e();
        if (e != null) {
            double doubleValue = e.doubleValue();
            C1644x gw = mo64730X1();
            Double valueOf = Double.valueOf(doubleValue);
            C25702a aVar = (C25702a) mo64744Yv().mo4814f();
            if (aVar == null || (g = aVar.mo64270g()) == null) {
                str = null;
            } else {
                str = g.mo57165a();
            }
            if (str == null) {
                str = "";
            }
            gw.mo4823o(C41233s.m119492a(valueOf, str));
        }
    }

    /* renamed from: Ma */
    public void mo64736Ma() {
        this.f65922e.mo64736Ma();
    }

    /* renamed from: O */
    public void mo64737O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        this.f65922e.mo64737O(str, str2, str3, str4);
    }

    /* renamed from: P */
    public void mo64738P(TransferAccountItem transferAccountItem) {
        C41536l.m120489i(transferAccountItem, "account");
        this.f65922e.mo64738P(transferAccountItem);
    }

    /* renamed from: P2 */
    public LiveData mo64739P2() {
        return this.f65922e.mo64739P2();
    }

    /* renamed from: Rd */
    public void mo64740Rd() {
        this.f65922e.mo64740Rd();
    }

    /* renamed from: Uo */
    public LiveData mo64741Uo() {
        return this.f65922e.mo64741Uo();
    }

    /* renamed from: Uu */
    public AccumulateOnSpecificDateModel mo64742Uu() {
        return this.f65922e.mo64742Uu();
    }

    /* renamed from: Ve */
    public void mo64743Ve(Long l) {
        this.f65922e.mo64743Ve(l);
    }

    /* renamed from: Yv */
    public LiveData mo64744Yv() {
        return this.f65922e.mo64744Yv();
    }

    /* renamed from: Z */
    public void mo64745Z() {
        this.f65922e.mo64745Z();
    }

    /* renamed from: bu */
    public void mo64746bu(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel) {
        C41536l.m120489i(accumulateOnSpecificDateModel, "<set-?>");
        this.f65922e.mo64746bu(accumulateOnSpecificDateModel);
    }

    /* renamed from: gs */
    public int mo64747gs() {
        return this.f65922e.mo64747gs();
    }

    /* renamed from: gw */
    public C1644x mo64730X1() {
        return this.f65927j;
    }

    /* renamed from: hw */
    public C1644x mo64731e0() {
        return this.f65928k;
    }

    /* renamed from: i3 */
    public LiveData mo64750i3() {
        return this.f65922e.mo64750i3();
    }

    /* renamed from: iw */
    public final C25907q mo64751iw() {
        return this.f65924g;
    }

    /* renamed from: j3 */
    public LiveData mo64752j3() {
        return this.f65922e.mo64752j3();
    }

    /* renamed from: jk */
    public void mo64753jk(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel) {
        String str;
        DepositSubmissionNavData g;
        C41536l.m120489i(accumulateOnSpecificDateModel, "accumulateOnSpecificDateModel");
        mo64746bu(accumulateOnSpecificDateModel);
        BigDecimal d = accumulateOnSpecificDateModel.mo57135d();
        if (d != null) {
            double doubleValue = d.doubleValue();
            C1644x hw = mo64731e0();
            Double valueOf = Double.valueOf(doubleValue);
            C25702a aVar = (C25702a) mo64744Yv().mo4814f();
            if (aVar == null || (g = aVar.mo64270g()) == null) {
                str = null;
            } else {
                str = g.mo57165a();
            }
            if (str == null) {
                str = "";
            }
            hw.mo4823o(C41233s.m119492a(valueOf, str));
        }
    }

    /* renamed from: jw */
    public C1644x mo64732p3() {
        return this.f65929l;
    }

    /* renamed from: k0 */
    public void mo64755k0() {
        this.f65922e.mo64755k0();
    }

    /* renamed from: ki */
    public LiveData mo64756ki() {
        return this.f65922e.mo64756ki();
    }

    /* renamed from: kp */
    public AccumulateOnPaymentModel mo64757kp() {
        return this.f65922e.mo64757kp();
    }

    /* renamed from: kw */
    public C1644x mo64728F2() {
        return this.f65930m;
    }

    /* renamed from: lr */
    public void mo64759lr(C40749p pVar) {
        C41536l.m120489i(pVar, "onRefresh");
        this.f65922e.mo64759lr(pVar);
    }

    /* renamed from: lw */
    public final C25908r mo64760lw() {
        return this.f65925h;
    }

    /* renamed from: m */
    public LiveData mo64761m() {
        return this.f65922e.mo64761m();
    }

    /* renamed from: mj */
    public void mo64762mj(AccumulateOnPaymentModel accumulateOnPaymentModel) {
        C41536l.m120489i(accumulateOnPaymentModel, "<set-?>");
        this.f65922e.mo64762mj(accumulateOnPaymentModel);
    }

    /* renamed from: mw */
    public C1644x mo64729Ra() {
        return this.f65926i;
    }

    /* renamed from: ov */
    public void mo64764ov(C25702a aVar) {
        C41536l.m120489i(aVar, "depositData");
        this.f65922e.mo64764ov(aVar);
    }

    /* renamed from: q1 */
    public void mo64726q1() {
        C37224b.m109965d(mo64732p3(), mo64757kp());
    }

    /* renamed from: r0 */
    public void mo64727r0() {
        C37224b.m109965d(mo64728F2(), mo64742Uu());
    }

    /* renamed from: rq */
    public void mo64765rq(String str) {
        this.f65922e.mo64765rq(str);
    }
}

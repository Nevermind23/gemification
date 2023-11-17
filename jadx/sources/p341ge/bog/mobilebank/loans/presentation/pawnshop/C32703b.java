package p341ge.bog.mobilebank.loans.presentation.pawnshop;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import hs0.C36188a;
import hs0.C36189b;
import hs0.C36194g;
import java.math.BigDecimal;
import k70.C25683g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loans.presentation.LoansFlow;
import p341ge.bog.mobilebank.loans.presentation.pawnshop.C32709d;
import p341ge.bog.mobilebank.loans.presentation.pawnshop.C32713e;
import p380ck.C10463g;
import p380ck.C10464h;
import p729cv.C19803e;
import p729cv.C19804f;
import sr0.C38522g;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.b */
public final class C32703b extends C21481a {

    /* renamed from: o */
    public static final C32704a f80486o = new C32704a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final LoansFlow.PawnLoanPayment f80487d;

    /* renamed from: e */
    private final C38522g f80488e;

    /* renamed from: f */
    private final C19803e f80489f;

    /* renamed from: g */
    private final C19804f f80490g;

    /* renamed from: h */
    private final C25683g f80491h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C36194g f80492i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C10463g f80493j;

    /* renamed from: k */
    private final C1644x f80494k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1644x f80495l = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f80496m = new C1644x();

    /* renamed from: n */
    private final C1644x f80497n = new C1644x();

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.b$a */
    public static final class C32704a {
        private C32704a() {
        }

        public /* synthetic */ C32704a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.b$b */
    public interface C32705b {
        /* renamed from: a */
        C32703b mo32829a(LoansFlow.PawnLoanPayment pawnLoanPayment);
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.b$c */
    static final class C32706c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ boolean f80498d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32706c(boolean z) {
            super(1);
            this.f80498d = z;
        }

        /* renamed from: a */
        public final C36188a invoke(C36188a aVar) {
            C41536l.m120489i(aVar, "uiModel");
            return C36188a.m107623b(aVar, (String) null, this.f80498d, 1, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.b$d */
    static final class C32707d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32703b f80499d;

        /* renamed from: e */
        final /* synthetic */ String f80500e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32707d(C32703b bVar, String str) {
            super(1);
            this.f80499d = bVar;
            this.f80500e = str;
        }

        /* renamed from: a */
        public final void mo74390a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f80499d.f80493j.mo27137H("loan", "conversion_pln_payment", (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
                this.f80499d.m96628vw();
                this.f80499d.f80496m.mo4823o(new C32713e.C32717d(false));
                C37224b.m109965d(this.f80499d.f80495l, new C32709d.C32711b(this.f80499d.f80492i.mo88955b(this.f80499d.f80487d, this.f80500e)));
            } else if (aVar instanceof C31128a.C31129a) {
                this.f80499d.f80496m.mo4823o(new C32713e.C32717d(false));
                C37224b.m109965d(this.f80499d.f80495l, new C32709d.C32710a(((C31128a.C31129a) aVar).mo71342c()));
            } else if (aVar instanceof C31128a.C31130b) {
                this.f80499d.f80496m.mo4823o(new C32713e.C32717d(true));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74390a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32703b(LoansFlow.PawnLoanPayment pawnLoanPayment, C38522g gVar, C19803e eVar, C19804f fVar, C25683g gVar2, C36194g gVar3, C10463g gVar4) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(pawnLoanPayment, "pawnLoanData");
        C41536l.m120489i(gVar, "pawnLoanUseCase");
        C41536l.m120489i(eVar, "refreshAssetLiability");
        C41536l.m120489i(fVar, "refreshProductTypes");
        C41536l.m120489i(gVar2, "refreshLoansWithDetails");
        C41536l.m120489i(gVar3, "pawnShopUiMapper");
        C41536l.m120489i(gVar4, "analytics");
        this.f80487d = pawnLoanPayment;
        this.f80488e = gVar;
        this.f80489f = eVar;
        this.f80490g = fVar;
        this.f80491h = gVar2;
        this.f80492i = gVar3;
        this.f80493j = gVar4;
        C1644x xVar = new C1644x();
        this.f80494k = xVar;
        xVar.mo4823o(new C36188a(pawnLoanPayment.mo74043i(), false, 2, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final void m96627uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public final void m96628vw() {
        this.f80489f.mo48091a();
        this.f80490g.mo48092a();
        this.f80491h.invoke();
    }

    /* renamed from: kw */
    public void mo74379kw(LoansFlow.PawnLoanPayment pawnLoanPayment) {
        C41536l.m120489i(pawnLoanPayment, "pawnLoanData");
        this.f80497n.mo4826r(this.f80492i.mo88954a(pawnLoanPayment));
    }

    /* renamed from: lw */
    public LiveData mo74380lw() {
        return this.f80497n;
    }

    /* renamed from: mw */
    public LiveData mo74381mw() {
        return this.f80495l;
    }

    /* renamed from: nw */
    public LiveData mo74382nw() {
        return this.f80494k;
    }

    /* renamed from: ow */
    public LiveData mo74383ow() {
        return this.f80496m;
    }

    /* renamed from: pw */
    public void mo74384pw() {
        this.f80496m.mo4823o(C32713e.C32715b.f80506a);
    }

    /* renamed from: qw */
    public void mo74385qw(boolean z) {
        C37224b.m109967f(this.f80494k, new C32706c(z));
    }

    /* renamed from: rw */
    public void mo74386rw() {
        C37224b.m109965d(this.f80495l, C32709d.C32712c.f80503a);
    }

    /* renamed from: sw */
    public LoansFlow.PawnLoanPayment mo74387sw() {
        return this.f80487d;
    }

    /* renamed from: tw */
    public void mo74388tw(String str, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        C41536l.m120489i(str, "input");
        BigDecimal add = this.f80487d.mo74034b().add(this.f80487d.mo74039f());
        C41536l.m120488h(add, "this.add(other)");
        BigDecimal add2 = add.add(this.f80487d.mo74041h());
        C41536l.m120488h(add2, "this.add(other)");
        boolean z5 = true;
        if (str.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || new BigDecimal(str).compareTo(add2) <= 0 || !z) {
            if (str.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 || !z) {
                if (str.length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4 || z) {
                    if (z) {
                        if (str.length() != 0) {
                            z5 = false;
                        }
                        if (z5) {
                            this.f80496m.mo4823o(C32713e.C32716c.f80507a);
                            return;
                        }
                    }
                    this.f80496m.mo4823o(C32713e.C32718e.f80509a);
                    return;
                }
                this.f80496m.mo4823o(C32713e.C32719f.f80510a);
                return;
            }
            this.f80493j.mo27137H("loan", "pln_pay_button_click", (String) null, (Bundle) null, C10464h.C10465a.FIREBASE);
            C41205b F0 = C31270e.m92880i(C32343x.m95415S0(this.f80488e.mo92090a(str, this.f80487d.mo74037e(), String.valueOf(this.f80487d.mo74040g()), "T")), -1).mo94981F0(new C36189b(new C32707d(this, str)));
            C41536l.m120488h(F0, "override fun payLoan(inp…}\n            }\n        }");
            bindToLifecycle(F0);
            return;
        }
        this.f80496m.mo4823o(new C32713e.C32714a(add2, this.f80487d.mo74037e()));
    }
}

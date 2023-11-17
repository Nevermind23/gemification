package g20;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.core.util.C1004d;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32300e0;
import g91.C32303f;
import g91.C32314k;
import g91.C32319m;
import g91.C32343x;
import i10.C25100c;
import i20.C25111h;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity;
import p341ge.bog.mobilebank.model.payment.UpcomingPayment;
import p341ge.bog.mobilebank.payment.activities.DDTransparentLoaderActivity;
import p341ge.bog.mobilebank.payment.model.C33624a;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10320i;
import p90.C27411r4;
import q31.C38122f;
import q31.C38125h;
import q70.C27685a;
import r90.C27950a;
import u00.C28535c;
import ue1.C43075l;

/* renamed from: g20.l0 */
public final class C20622l0 extends RecyclerView.C1734f0 {

    /* renamed from: e */
    public static final C20623a f55706e = new C20623a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C27411r4 f55707d;

    /* renamed from: g20.l0$a */
    public static final class C20623a {
        private C20623a() {
        }

        public /* synthetic */ C20623a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20622l0(C27411r4 r4Var) {
        super(r4Var.mo3946b());
        C41536l.m120489i(r4Var, "binding");
        this.f55707d = r4Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m66915l(C20622l0 l0Var, C28535c cVar, View view) {
        C41536l.m120489i(l0Var, "this$0");
        C41536l.m120489i(cVar, "$this_with");
        CommissionsActivity.C21442a aVar = CommissionsActivity.f57309N;
        View view2 = l0Var.itemView;
        C41536l.m120488h(view2, "itemView");
        Activity a = C25100c.m80062a(view2);
        if (a != null) {
            aVar.mo53524b(a, cVar.mo68260b());
        }
    }

    /* renamed from: m */
    private final int m66916m(String str, String str2) {
        if (str != null) {
            switch (str.hashCode()) {
                case -459336179:
                    if (str.equals("ACCOUNT")) {
                        return C10320i.icons_48_loan_overdraft_outline;
                    }
                    break;
                case 65183:
                    if (str.equals(UpcomingPayment.PROD_GROUP_TYPE_AUTO_PAYMENT_OR_TRANSFER)) {
                        return C10320i.f28684Ya;
                    }
                    break;
                case 69478:
                    if (str.equals("FEE")) {
                        return C10320i.icons_48_channel_banking_internet;
                    }
                    break;
                case 2061072:
                    if (str.equals(UpcomingPayment.PROD_GROUP_TYPE_CREDIT_CARD_BILL)) {
                        return C10320i.icons_48_card_credit_outline;
                    }
                    break;
                case 2342128:
                    if (str.equals("LOAN")) {
                        if (str2 == null || !C41536l.m120484d(str2, UpcomingPayment.PROD_CODE_TYPE_PAWN)) {
                            return C10320i.f28676Ra;
                        }
                        return C10320i.f28681Wa;
                    }
                    break;
            }
        }
        return C10320i.icons_48_installment_sms_outline;
    }

    /* renamed from: n */
    private final void m66917n(C25111h hVar, C43075l lVar) {
        this.itemView.setOnClickListener(new C20620k0(hVar, this, lVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m66918o(C25111h hVar, C20622l0 l0Var, C43075l lVar, View view) {
        C41536l.m120489i(hVar, "$this_with");
        C41536l.m120489i(l0Var, "this$0");
        C41536l.m120489i(lVar, "$onOpenCreditCardDetails");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1004d("event_label_2", hVar.mo63622h()));
        C36546y.m108282F().mo27155v("home", hVar.mo63620f(), "click_future_operation_mode", (Long) null, arrayList);
        if (C41536l.m120484d(UpcomingPayment.PROD_GROUP_TYPE_AUTO_PAYMENT_OR_TRANSFER, hVar.mo63620f())) {
            String h = hVar.mo63622h();
            int hashCode = h.hashCode();
            if (hashCode != 67553) {
                if (hashCode != 82446) {
                    if (hashCode != 2038791 || !h.equals("BILL")) {
                        return;
                    }
                } else if (!h.equals("STO")) {
                    return;
                }
                View view2 = l0Var.itemView;
                C41536l.m120488h(view2, "itemView");
                TransferForm.startWith(C25100c.m80062a(view2), "STO", TransferForm.OPERATION_VIEW).setDDKey(hVar.mo63621g()).start();
            } else if (h.equals("DEB")) {
                View view3 = l0Var.itemView;
                C41536l.m120488h(view3, "itemView");
                C33624a.m98713a(C25100c.m80062a(view3)).mo79806f(DDTransparentLoaderActivity.class).mo79809i(hVar.mo63621g()).mo79825y();
            }
        } else if (C41536l.m120484d("LOAN", hVar.mo63620f())) {
            if (C41536l.m120484d(hVar.mo63622h(), C27685a.BNPL.mo67221b())) {
                Context context = l0Var.itemView.getContext();
                C41536l.m120488h(context, "itemView.context");
                C38122f c = C38125h.m112238c(context);
                Context context2 = l0Var.itemView.getContext();
                C41536l.m120488h(context2, "itemView.context");
                c.mo91587Y0(context2, hVar.mo63621g());
                return;
            }
            Context context3 = l0Var.itemView.getContext();
            C41536l.m120488h(context3, "itemView.context");
            C38122f c2 = C38125h.m112238c(context3);
            Context context4 = l0Var.itemView.getContext();
            C41536l.m120488h(context4, "itemView.context");
            C38122f.C38123a.m112229y(c2, context4, Long.valueOf(hVar.mo63621g()), (Integer) null, 4, (Object) null);
        } else if (C41536l.m120484d(UpcomingPayment.PROD_GROUP_TYPE_CREDIT_CARD_BILL, hVar.mo63620f())) {
            lVar.invoke(Long.valueOf(hVar.mo63621g()));
        }
    }

    /* renamed from: j */
    public final void mo49171j(C25111h hVar, boolean z, C43075l lVar) {
        String str;
        String str2;
        C41536l.m120489i(hVar, "data");
        C41536l.m120489i(lVar, "onOpenCreditCardDetails");
        View view = this.f55707d.f69685f;
        C41536l.m120488h(view, "binding.homeUpcomingCellUnderline");
        boolean z2 = true;
        C32343x.m95483r1(view, !z, false, 2, (Object) null);
        AppCompatTextView appCompatTextView = this.f55707d.f69684e;
        if (hVar.mo63614a() != null) {
            str = C32303f.m95204o(hVar.mo63614a().doubleValue()) + " " + C32314k.m95245a(hVar.mo63615b());
        } else {
            str = "";
        }
        appCompatTextView.setText(str);
        if (hVar.mo63617d() == null) {
            AppCompatTextView appCompatTextView2 = this.f55707d.f69686g;
            C41536l.m120488h(appCompatTextView2, "binding.homeUpcomingDate");
            C32343x.m95455i0(appCompatTextView2);
        } else {
            AppCompatTextView appCompatTextView3 = this.f55707d.f69686g;
            C41536l.m120488h(appCompatTextView3, "binding.homeUpcomingDate");
            C32343x.m95447f1(appCompatTextView3);
            this.f55707d.f69686g.setText(C32319m.m95312s(this.itemView.getContext(), hVar.mo63625j(), hVar.mo63617d().longValue()));
        }
        this.f55707d.f69687h.setImageDrawable(C0767a.m2895e(this.itemView.getContext(), m66916m(hVar.mo63620f(), hVar.mo63624i())));
        if (!C41536l.m120484d(hVar.mo63620f(), "FEE")) {
            String c = hVar.mo63616c();
            if (!(c == null || c.length() == 0)) {
                z2 = false;
            }
            if (!z2) {
                str2 = hVar.mo63616c();
                this.f55707d.f69688i.setText(str2);
                m66917n(hVar, lVar);
            }
        }
        str2 = C27950a.m86286c(hVar.mo63618e(), false);
        this.f55707d.f69688i.setText(str2);
        m66917n(hVar, lVar);
    }

    /* renamed from: k */
    public final void mo49172k(C28535c cVar, boolean z) {
        C41536l.m120489i(cVar, "data");
        View view = this.f55707d.f69685f;
        C41536l.m120488h(view, "binding.homeUpcomingCellUnderline");
        C32343x.m95483r1(view, !z, false, 2, (Object) null);
        BigDecimal a = cVar.mo68259a();
        AppCompatTextView appCompatTextView = this.f55707d.f69684e;
        String p = C32303f.m95205p(a);
        String a2 = C32314k.m95245a(cVar.mo68260b());
        appCompatTextView.setText(p + " " + a2);
        this.f55707d.f69687h.setImageDrawable(C0767a.m2895e(this.itemView.getContext(), m66916m(cVar.mo68263e(), cVar.mo68263e())));
        AppCompatTextView appCompatTextView2 = this.f55707d.f69686g;
        C41536l.m120488h(appCompatTextView2, "binding.homeUpcomingDate");
        C32343x.m95455i0(appCompatTextView2);
        this.f55707d.f69688i.setText(C32300e0.m95170h(cVar));
        this.itemView.setOnClickListener(new C20618j0(this, cVar));
    }
}

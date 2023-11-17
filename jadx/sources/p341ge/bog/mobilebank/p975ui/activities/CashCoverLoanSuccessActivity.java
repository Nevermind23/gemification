package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.github.mikephil.charting.utils.Utils;
import g91.C32303f;
import g91.C32319m;
import he1.C41217g;
import iu0.C36546y;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.ui.activities.CashCoverLoanSuccessActivity */
public final class CashCoverLoanSuccessActivity extends C30772sa {

    /* renamed from: G */
    public static final C35179a f84811G = new C35179a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f84812F = C41219i.m119470b(new C35180b(this));

    /* renamed from: ge.bog.mobilebank.ui.activities.CashCoverLoanSuccessActivity$a */
    public static final class C35179a {
        private C35179a() {
        }

        public /* synthetic */ C35179a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo86107a(Context context, String str, String str2, String str3, long j, String str4) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(str, "loanAmount");
            C41536l.m120489i(str2, "ccy");
            C41536l.m120489i(str3, "type");
            C41536l.m120489i(str4, "account");
            Intent intent = new Intent(context, CashCoverLoanSuccessActivity.class);
            intent.putExtra("LOAN_AMOUNT", str);
            intent.putExtra("CCY", str2);
            intent.putExtra("TYPE", str3);
            intent.putExtra("END_DATE", j);
            intent.putExtra("ACCOUNT", str4);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.CashCoverLoanSuccessActivity$b */
    static final class C35180b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CashCoverLoanSuccessActivity f84813d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35180b(CashCoverLoanSuccessActivity cashCoverLoanSuccessActivity) {
            super(0);
            this.f84813d = cashCoverLoanSuccessActivity;
        }

        /* renamed from: b */
        public final SuccessScreenView invoke() {
            return (SuccessScreenView) this.f84813d.findViewById(C10322k.successScreenView);
        }
    }

    /* renamed from: E2 */
    private final SuccessScreenView m103403E2() {
        Object value = this.f84812F.getValue();
        C41536l.m120488h(value, "<get-successScreenView>(...)");
        return (SuccessScreenView) value;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_cash_cover_loan_success;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        String stringExtra = getIntent().getStringExtra("LOAN_AMOUNT");
        C41536l.m120486f(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("CCY");
        C41536l.m120486f(stringExtra2);
        String stringExtra3 = getIntent().getStringExtra("TYPE");
        C41536l.m120486f(stringExtra3);
        long longExtra = getIntent().getLongExtra("END_DATE", -1);
        String stringExtra4 = getIntent().getStringExtra("ACCOUNT");
        C41536l.m120486f(stringExtra4);
        SuccessScreenView E2 = m103403E2();
        String string = getString(C10328q.loan_activated_successfully);
        C41536l.m120488h(string, "getString(R.string.loan_activated_successfully)");
        SuccessScreenView.setTitle$default(E2, string, 0, 2, (Object) null);
        E2.setIcon(C10320i.ic_result_success);
        String string2 = getString(C10328q.f28936Q1);
        C41536l.m120488h(string2, "getString(R.string.common_text_details)");
        E2.addHeader(string2);
        String string3 = getString(C10328q.loan_amount);
        C41536l.m120488h(string3, "getString(R.string.loan_amount)");
        String n = C32303f.m95203n(new BigDecimal(stringExtra), stringExtra2);
        C41536l.m120488h(n, "getFormattedAmount(loanAmount.toBigDecimal(), ccy)");
        SuccessScreenView.addDetailsItem$default(E2, string3, n, (Integer) null, 0, Utils.FLOAT_EPSILON, 0, (Integer) null, (Integer) null, (Image) null, 508, (Object) null);
        String string4 = getString(C10328q.type);
        C41536l.m120488h(string4, "getString(R.string.type)");
        SuccessScreenView successScreenView = E2;
        SuccessScreenView.addDetailsItem$default(E2, string4, stringExtra3, (Integer) null, 0, Utils.FLOAT_EPSILON, 0, (Integer) null, (Integer) null, (Image) null, 508, (Object) null);
        String string5 = getString(C10328q.loan_repayment_date);
        C41536l.m120488h(string5, "getString(R.string.loan_repayment_date)");
        String g = C32319m.m95300g(longExtra, C36546y.m108285N());
        C41536l.m120488h(g, "formatDateDayMonthYear(endDate, App.getInstance())");
        SuccessScreenView.addDetailsItem$default(successScreenView, string5, g, (Integer) null, 0, Utils.FLOAT_EPSILON, 0, (Integer) null, (Integer) null, (Image) null, 508, (Object) null);
        String string6 = getString(C10328q.f28969z1);
        C41536l.m120488h(string6, "getString(R.string.common_text_account)");
        SuccessScreenView.addDetailsItem$default(successScreenView, string6, stringExtra4, (Integer) null, 0, Utils.FLOAT_EPSILON, 0, (Integer) null, (Integer) null, (Image) null, 508, (Object) null);
    }
}

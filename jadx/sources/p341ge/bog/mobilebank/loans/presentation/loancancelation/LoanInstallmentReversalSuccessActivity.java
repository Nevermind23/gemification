package p341ge.bog.mobilebank.loans.presentation.loancancelation;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import ds0.C31584a;
import g91.C32343x;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet.InstallmentReversalSuccessData;
import pr0.C37950e;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.loans.presentation.loancancelation.LoanInstallmentReversalSuccessActivity */
public final class LoanInstallmentReversalSuccessActivity extends C30772sa {

    /* renamed from: H */
    public static final C32678a f80437H = new C32678a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f80438F = C41219i.m119470b(new C32679b(this));

    /* renamed from: G */
    private final C41217g f80439G = C41219i.m119470b(new C32680c(this));

    /* renamed from: ge.bog.mobilebank.loans.presentation.loancancelation.LoanInstallmentReversalSuccessActivity$a */
    public static final class C32678a {
        private C32678a() {
        }

        public /* synthetic */ C32678a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo74306a(Context context, InstallmentReversalSuccessData installmentReversalSuccessData) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(installmentReversalSuccessData, "data");
            Intent intent = new Intent(context, LoanInstallmentReversalSuccessActivity.class);
            intent.putExtra("INSTALLMENT_REVERSAL_SUCCESS_DATA_KEY", installmentReversalSuccessData);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.loancancelation.LoanInstallmentReversalSuccessActivity$b */
    static final class C32679b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoanInstallmentReversalSuccessActivity f80440d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32679b(LoanInstallmentReversalSuccessActivity loanInstallmentReversalSuccessActivity) {
            super(0);
            this.f80440d = loanInstallmentReversalSuccessActivity;
        }

        /* renamed from: b */
        public final C37950e invoke() {
            C37950e d = C37950e.m111544d(this.f80440d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.loancancelation.LoanInstallmentReversalSuccessActivity$c */
    static final class C32680c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoanInstallmentReversalSuccessActivity f80441d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32680c(LoanInstallmentReversalSuccessActivity loanInstallmentReversalSuccessActivity) {
            super(0);
            this.f80441d = loanInstallmentReversalSuccessActivity;
        }

        /* renamed from: b */
        public final InstallmentReversalSuccessData invoke() {
            Parcelable parcelableExtra = this.f80441d.getIntent().getParcelableExtra("INSTALLMENT_REVERSAL_SUCCESS_DATA_KEY");
            C41536l.m120486f(parcelableExtra);
            return (InstallmentReversalSuccessData) parcelableExtra;
        }
    }

    /* renamed from: F2 */
    private final C37950e m96556F2() {
        return (C37950e) this.f80438F.getValue();
    }

    /* renamed from: G2 */
    private final InstallmentReversalSuccessData m96557G2() {
        return (InstallmentReversalSuccessData) this.f80439G.getValue();
    }

    /* renamed from: H2 */
    private final void m96558H2() {
        C37950e F2 = m96556F2();
        F2.f91116l.f68494e.setNavigationEnabled(false);
        F2.f91109e.setOnClickListener(new C31584a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m96559I2(LoanInstallmentReversalSuccessActivity loanInstallmentReversalSuccessActivity, View view) {
        C41536l.m120489i(loanInstallmentReversalSuccessActivity, "this$0");
        C38122f.C38123a.m112215k(C38125h.m112238c(loanInstallmentReversalSuccessActivity), loanInstallmentReversalSuccessActivity, (String) null, (Bundle) null, 6, (Object) null);
    }

    /* renamed from: J2 */
    private final void m96560J2() {
        C37950e F2 = m96556F2();
        F2.f91110f.setTitle(C32343x.m95388F("online.inst.reversal.request.result.page.reason", new Object[0]));
        F2.f91109e.setButtonText(C32343x.m95388F("online.inst.reversal.request.result.page.home.button", new Object[0]));
        F2.f91112h.setTitleText(C32343x.m95388F("online.inst.reversal.application.registered.successfully", new Object[0]));
        F2.f91113i.setTitle(C32343x.m95388F("online.inst.reversal.request.result.page.detail", new Object[0]));
        F2.f91110f.setText(m96557G2().mo74322b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo70996D2(bundle, m96556F2());
        m96560J2();
        m96558H2();
    }

    public void onBackPressed() {
        C38122f.C38123a.m112215k(C38125h.m112238c(this), this, (String) null, (Bundle) null, 6, (Object) null);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return m96557G2().mo74321a();
    }
}

package p341ge.bog.mobilebank.deposits.presentation.actionsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import dc0.C19974c;
import dc0.C19980e;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity;
import p341ge.bog.mobilebank.deposits.presentation.model.DepositBreakOptions;
import p341ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakOption;
import p341ge.bog.mobilebank.p975ui.activities.CashCoverLoanActivity;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p725cr.C19788a;
import rb0.C27984c;
import ue1.C43064a;
import xb0.C29709b;

/* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.a */
public final class C23008a extends C19788a {

    /* renamed from: K */
    public static final C23009a f60530K = new C23009a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C29709b f60531H;

    /* renamed from: I */
    private final C41217g f60532I = C41219i.m119470b(new C23012c(this));

    /* renamed from: J */
    private final C41217g f60533J = C41219i.m119470b(new C23010b(this));

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.a$a */
    public static final class C23009a {
        private C23009a() {
        }

        public /* synthetic */ C23009a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C23008a mo57691a(DepositBreakOptions depositBreakOptions) {
            C41536l.m120489i(depositBreakOptions, "options");
            C23008a aVar = new C23008a();
            aVar.setArguments(C0908e.m3336b(C41233s.m119492a("PARAM_OPTIONS", depositBreakOptions)));
            return aVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.a$b */
    static final class C23010b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C23008a f60534d;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.a$b$a */
        /* synthetic */ class C23011a implements C19980e, C41532h {

            /* renamed from: a */
            final /* synthetic */ C23008a f60535a;

            C23011a(C23008a aVar) {
                this.f60535a = aVar;
            }

            /* renamed from: a */
            public final void mo48346a(DepositBreakOption depositBreakOption) {
                C41536l.m120489i(depositBreakOption, "p0");
                this.f60535a.m74623j2(depositBreakOption);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C19980e) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f60535a, C23008a.class, "onDepositBreakOptionClicked", "onDepositBreakOptionClicked(Lge/bog/mobilebank/deposits/presentation/model/depositbreak/DepositBreakOption;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23010b(C23008a aVar) {
            super(0);
            this.f60534d = aVar;
        }

        /* renamed from: b */
        public final C19974c invoke() {
            return new C19974c(new C23011a(this.f60534d));
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.a$c */
    static final class C23012c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C23008a f60536d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23012c(C23008a aVar) {
            super(0);
            this.f60536d = aVar;
        }

        /* renamed from: b */
        public final DepositBreakOptions invoke() {
            DepositBreakOptions depositBreakOptions;
            Bundle arguments = this.f60536d.getArguments();
            if (arguments != null) {
                depositBreakOptions = (DepositBreakOptions) arguments.getParcelable("PARAM_OPTIONS");
            } else {
                depositBreakOptions = null;
            }
            if (depositBreakOptions == null) {
                return new DepositBreakOptions(C41339p.m119900e(DepositBreakOption.NoOptions.f60819e), -1, (StringSource) null, 4, (DefaultConstructorMarker) null);
            }
            return depositBreakOptions;
        }
    }

    /* renamed from: f2 */
    private final C19974c m74619f2() {
        return (C19974c) this.f60533J.getValue();
    }

    /* renamed from: g2 */
    private final C29709b m74620g2() {
        C29709b bVar = this.f60531H;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: h2 */
    private final String m74621h2() {
        String str;
        if (m74622i2().mo57849a() && m74622i2().mo57850b()) {
            str = "deposits.break.actionsheet.description.can.break.and.loan";
        } else if (m74622i2().mo57849a()) {
            str = "deposits.break.actionsheet.description.can.only.break";
        } else if (m74622i2().mo57850b()) {
            str = "deposits.break.actionsheet.description.can.loan";
        } else {
            str = "deposits.break.actionsheet.description.can.not.break";
        }
        return C34646b.m101752f(C34646b.m101748b(str, new Object[0]), (Context) null, 1, (Object) null);
    }

    /* renamed from: i2 */
    private final DepositBreakOptions m74622i2() {
        return (DepositBreakOptions) this.f60532I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final void m74623j2(DepositBreakOption depositBreakOption) {
        if (depositBreakOption instanceof DepositBreakOption.CashCoverLoan) {
            CashCoverLoanActivity.C35168b bVar = CashCoverLoanActivity.f84776Y;
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            bVar.mo86097a(requireContext, m74622i2().mo57851d());
            requireActivity().finish();
        } else if (depositBreakOption instanceof DepositBreakOption.BreakDeposit) {
            BreakDepositActivity.C23050a aVar = BreakDepositActivity.f60573M;
            Context requireContext2 = requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            aVar.mo57726a(requireContext2, m74622i2().mo57851d());
            requireActivity().finish();
        } else if (depositBreakOption instanceof DepositBreakOption.NoOptions) {
            mo4577k1();
        }
    }

    /* renamed from: k2 */
    private final void m74624k2() {
        m74620g2().f74977f.setAdapter(m74619f2());
        if (m74622i2().mo57855f().size() > 1) {
            m74620g2().f74977f.mo5351j(new C13364a(C0767a.m2895e(requireContext(), C27984c.f71248y)));
        }
        m74619f2().mo6029i(m74622i2().mo57855f());
    }

    /* renamed from: l2 */
    private final void m74625l2() {
        String str;
        mo26370a2(C32343x.m95388F("deposits.break.actionsheet.header", new Object[0]));
        PageDescriptionView pageDescriptionView = m74620g2().f74978g;
        if (m74622i2().mo57849a()) {
            str = "deposits.break.actionsheet.title.can.break";
        } else {
            str = "deposits.break.actionsheet.title.can.not.break";
        }
        pageDescriptionView.setTitle(C32343x.m95388F(str, new Object[0]));
        String h2 = m74621h2();
        StringSource e = m74622i2().mo57853e();
        String str2 = null;
        if (e != null) {
            str2 = C34646b.m101752f(e, (Context) null, 1, (Object) null);
        }
        PageDescriptionView pageDescriptionView2 = m74620g2().f74976e;
        C41536l.m120488h(pageDescriptionView2, "binding.additionalFeedback");
        C32343x.m95455i0(pageDescriptionView2);
        if (str2 != null && m74622i2().mo57850b()) {
            PageDescriptionView pageDescriptionView3 = m74620g2().f74976e;
            C41536l.m120488h(pageDescriptionView3, "binding.additionalFeedback");
            C32343x.m95447f1(pageDescriptionView3);
            m74620g2().f74976e.setText(h2);
            m74620g2().f74978g.setText(str2);
        } else if (str2 != null) {
            m74620g2().f74978g.setText(str2);
        } else {
            m74620g2().f74978g.setText(h2);
        }
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f60531H = C29709b.m90203d(layoutInflater, viewGroup, true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m74625l2();
        m74624k2();
    }
}

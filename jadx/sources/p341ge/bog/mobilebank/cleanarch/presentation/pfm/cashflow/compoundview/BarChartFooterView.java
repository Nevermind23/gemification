package p341ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.C1645y;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import i10.C25100c;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m40.C26141a;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.viewmodel.CashFlowViewModel;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.BarChartFooterView */
public final class BarChartFooterView extends LinearLayout {

    /* renamed from: d */
    private CashFlowViewModel f58832d;

    /* renamed from: e */
    private final C41217g f58833e;

    /* renamed from: f */
    private final C41217g f58834f;

    /* renamed from: g */
    private final C41217g f58835g;

    /* renamed from: h */
    private final C41217g f58836h;

    /* renamed from: i */
    private final C41217g f58837i;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.BarChartFooterView$a */
    static final class C22130a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BarChartFooterView f58838d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22130a(BarChartFooterView barChartFooterView) {
            super(0);
            this.f58838d = barChartFooterView;
        }

        /* renamed from: b */
        public final AppCompatImageView invoke() {
            return (AppCompatImageView) this.f58838d.findViewById(C10322k.arrow);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.BarChartFooterView$b */
    static final class C22131b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BarChartFooterView f58839d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22131b(BarChartFooterView barChartFooterView) {
            super(0);
            this.f58839d = barChartFooterView;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f58839d.findViewById(C10322k.f28826da);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.BarChartFooterView$c */
    static final class C22132c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BarChartFooterView f58840d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22132c(BarChartFooterView barChartFooterView) {
            super(0);
            this.f58840d = barChartFooterView;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f58840d.findViewById(C10322k.difference_value);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.BarChartFooterView$d */
    static final class C22133d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BarChartFooterView f58841d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22133d(BarChartFooterView barChartFooterView) {
            super(0);
            this.f58841d = barChartFooterView;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f58841d.findViewById(C10322k.expenses_value);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.BarChartFooterView$e */
    static final class C22134e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BarChartFooterView f58842d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22134e(BarChartFooterView barChartFooterView) {
            super(0);
            this.f58842d = barChartFooterView;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f58842d.findViewById(C10322k.income_value);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.BarChartFooterView$f */
    static final class C22135f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BarChartFooterView f58843d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22135f(BarChartFooterView barChartFooterView) {
            super(1);
            this.f58843d = barChartFooterView;
        }

        /* renamed from: a */
        public final void mo54952a(C26141a aVar) {
            BarChartFooterView barChartFooterView = this.f58843d;
            C41536l.m120488h(aVar, "data");
            barChartFooterView.setData(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54952a((C26141a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.BarChartFooterView$g */
    static final class C22136g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f58844a;

        C22136g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f58844a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f58844a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f58844a.invoke(obj);
        }
    }

    public BarChartFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    private final void m71735b() {
        CashFlowViewModel cashFlowViewModel = this.f58832d;
        if (cashFlowViewModel == null) {
            C41536l.m120506z("cashFlowViewModel");
            cashFlowViewModel = null;
        }
        C1644x tw = cashFlowViewModel.mo54966tw();
        Activity a = C25100c.m80062a(this);
        C41536l.m120487g(a, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        tw.mo4819k((C1619q) a, new C22136g(new C22135f(this)));
    }

    private final AppCompatImageView getArrow() {
        Object value = this.f58836h.getValue();
        C41536l.m120488h(value, "<get-arrow>(...)");
        return (AppCompatImageView) value;
    }

    private final TextView getDate() {
        Object value = this.f58837i.getValue();
        C41536l.m120488h(value, "<get-date>(...)");
        return (TextView) value;
    }

    private final TextView getDifferenceValue() {
        Object value = this.f58835g.getValue();
        C41536l.m120488h(value, "<get-differenceValue>(...)");
        return (TextView) value;
    }

    private final TextView getExpensesValue() {
        Object value = this.f58834f.getValue();
        C41536l.m120488h(value, "<get-expensesValue>(...)");
        return (TextView) value;
    }

    private final TextView getIncomeValue() {
        Object value = this.f58833e.getValue();
        C41536l.m120488h(value, "<get-incomeValue>(...)");
        return (TextView) value;
    }

    /* access modifiers changed from: private */
    public final void setData(C26141a aVar) {
        getIncomeValue().setText(aVar.mo65042d());
        getExpensesValue().setText(aVar.mo65041c());
        getDifferenceValue().setText(aVar.mo65040b());
        getDate().setText(aVar.mo65039a());
        if (aVar.mo65043e()) {
            getDifferenceValue().setTextColor(C0767a.m2893c(getContext(), C10318g.pfm_red));
            getArrow().setImageResource(C10320i.barchart_arrow_down);
            return;
        }
        getDifferenceValue().setTextColor(C0767a.m2893c(getContext(), C10318g.pfm_green));
        getArrow().setImageResource(C10320i.barchart_arrow_up);
    }

    public final void setViewModel(CashFlowViewModel cashFlowViewModel) {
        C41536l.m120489i(cashFlowViewModel, "cashFlowViewModel");
        this.f58832d = cashFlowViewModel;
        m71735b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BarChartFooterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public BarChartFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58833e = C41219i.m119470b(new C22134e(this));
        this.f58834f = C41219i.m119470b(new C22133d(this));
        this.f58835g = C41219i.m119470b(new C22132c(this));
        this.f58836h = C41219i.m119470b(new C22130a(this));
        this.f58837i = C41219i.m119470b(new C22131b(this));
        View.inflate(context, C10324m.component_barchart_footer, this);
    }
}

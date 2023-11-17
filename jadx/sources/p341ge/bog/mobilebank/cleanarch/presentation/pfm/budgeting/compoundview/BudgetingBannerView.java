package p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.compoundview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h40.C24879a;
import h40.C24880b;
import he1.C41217g;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.AddBudgetActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetActivity;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.compoundview.BudgetingBannerView */
public final class BudgetingBannerView extends LinearLayout {

    /* renamed from: d */
    private final C41217g f58754d;

    /* renamed from: e */
    private final C41217g f58755e;

    /* renamed from: f */
    private final C41217g f58756f;

    /* renamed from: g */
    private final C41217g f58757g;

    /* renamed from: h */
    private String f58758h;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.compoundview.BudgetingBannerView$a */
    static final class C22092a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BudgetingBannerView f58759d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22092a(BudgetingBannerView budgetingBannerView) {
            super(0);
            this.f58759d = budgetingBannerView;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f58759d.findViewById(C10322k.labelTV);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.compoundview.BudgetingBannerView$b */
    static final class C22093b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BudgetingBannerView f58760d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22093b(BudgetingBannerView budgetingBannerView) {
            super(0);
            this.f58760d = budgetingBannerView;
        }

        /* renamed from: b */
        public final ImageView invoke() {
            return (ImageView) this.f58760d.findViewById(C10322k.newBudgetIV);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.compoundview.BudgetingBannerView$c */
    static final class C22094c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BudgetingBannerView f58761d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22094c(BudgetingBannerView budgetingBannerView) {
            super(0);
            this.f58761d = budgetingBannerView;
        }

        /* renamed from: b */
        public final RoundProgressView invoke() {
            return (RoundProgressView) this.f58761d.findViewById(C10322k.f28913yq);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.compoundview.BudgetingBannerView$d */
    static final class C22095d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BudgetingBannerView f58762d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22095d(BudgetingBannerView budgetingBannerView) {
            super(0);
            this.f58762d = budgetingBannerView;
        }

        /* renamed from: b */
        public final ImageView invoke() {
            return (ImageView) this.f58762d.findViewById(C10322k.rightIcon);
        }
    }

    public BudgetingBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m71591d(BudgetingBannerView budgetingBannerView, View view) {
        C41536l.m120489i(budgetingBannerView, "this$0");
        BudgetActivity.C22069a aVar = BudgetActivity.f58716F;
        Context context = budgetingBannerView.getContext();
        C41536l.m120488h(context, "context");
        aVar.mo54847a(context);
        C36546y.m108282F().mo27152s("budgeting", budgetingBannerView.f58758h, "open_budgeting_module");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m71592f(BudgetingBannerView budgetingBannerView, View view) {
        C41536l.m120489i(budgetingBannerView, "this$0");
        AddBudgetActivity.C22058a aVar = AddBudgetActivity.f58698O;
        Context context = budgetingBannerView.getContext();
        C41536l.m120488h(context, "context");
        aVar.mo54840b(false, context);
        C36546y.m108282F().mo27152s("budgeting", budgetingBannerView.f58758h, "open_budgeting_module");
    }

    private final TextView getLabelTV() {
        Object value = this.f58756f.getValue();
        C41536l.m120488h(value, "<get-labelTV>(...)");
        return (TextView) value;
    }

    private final ImageView getNewBudgetView() {
        Object value = this.f58755e.getValue();
        C41536l.m120488h(value, "<get-newBudgetView>(...)");
        return (ImageView) value;
    }

    private final RoundProgressView getProgressCircle() {
        Object value = this.f58754d.getValue();
        C41536l.m120488h(value, "<get-progressCircle>(...)");
        return (RoundProgressView) value;
    }

    private final ImageView getRightIcon() {
        Object value = this.f58757g.getValue();
        C41536l.m120488h(value, "<get-rightIcon>(...)");
        return (ImageView) value;
    }

    /* renamed from: c */
    public final void mo54867c(int i) {
        getProgressCircle().setProgress(i);
        getNewBudgetView().setVisibility(4);
        getProgressCircle().setVisibility(0);
        getLabelTV().setText(getContext().getString(C10328q.current_month_budget));
        getRightIcon().setImageResource(C10320i.arrow_grey);
        setOnClickListener(new C24879a(this));
    }

    /* renamed from: e */
    public final void mo54868e() {
        getNewBudgetView().setVisibility(0);
        getProgressCircle().setVisibility(4);
        getLabelTV().setText(getContext().getString(C10328q.plan_budget));
        getRightIcon().setImageResource(C10320i.ic_plus_sign_gray);
        setOnClickListener(new C24880b(this));
    }

    public final String getAnalyticsLabel() {
        return this.f58758h;
    }

    public final void setAnalyticsLabel(String str) {
        this.f58758h = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BudgetingBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public BudgetingBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58754d = C41219i.m119470b(new C22094c(this));
        this.f58755e = C41219i.m119470b(new C22093b(this));
        this.f58756f = C41219i.m119470b(new C22092a(this));
        this.f58757g = C41219i.m119470b(new C22095d(this));
        View.inflate(context, C10324m.budgeting_banner_view, this);
    }
}

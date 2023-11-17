package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m81.C37246a;
import p90.C27382o2;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.CashCoverLoanExpandableView */
public final class CashCoverLoanExpandableView extends FrameLayout {
    private final C27382o2 binding;
    /* access modifiers changed from: private */
    public C43075l onExpand;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.CashCoverLoanExpandableView$a */
    static final class C35727a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CashCoverLoanExpandableView f86352d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35727a(CashCoverLoanExpandableView cashCoverLoanExpandableView) {
            super(0);
            this.f86352d = cashCoverLoanExpandableView;
        }

        public final void invoke() {
            C43075l access$getOnExpand$p = this.f86352d.onExpand;
            if (access$getOnExpand$p != null) {
                access$getOnExpand$p.invoke(Boolean.FALSE);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.CashCoverLoanExpandableView$b */
    static final class C35728b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CashCoverLoanExpandableView f86353d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35728b(CashCoverLoanExpandableView cashCoverLoanExpandableView) {
            super(0);
            this.f86353d = cashCoverLoanExpandableView;
        }

        public final void invoke() {
            C43075l access$getOnExpand$p = this.f86353d.onExpand;
            if (access$getOnExpand$p != null) {
                access$getOnExpand$p.invoke(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CashCoverLoanExpandableView(Context context) {
        this(context, (AttributeSet) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(CashCoverLoanExpandableView cashCoverLoanExpandableView, View view) {
        C41536l.m120489i(cashCoverLoanExpandableView, "this$0");
        if (cashCoverLoanExpandableView.binding.f69453i.getHeight() > 5) {
            cashCoverLoanExpandableView.collapseAnimated();
        } else {
            cashCoverLoanExpandableView.expandAnimated();
        }
    }

    private final void collapseAnimated() {
        C37246a aVar = new C37246a(this.binding.f69453i, 1);
        this.binding.f69453i.startAnimation(aVar);
        this.binding.f69449e.animate().rotation(Utils.FLOAT_EPSILON).setDuration(150);
        C32343x.m95435b1(aVar, (C43064a) null, new C35727a(this), (C43064a) null, 5, (Object) null);
    }

    private final void expandAnimated() {
        if (this.binding.f69453i.getVisibility() == 8) {
            this.binding.f69453i.setVisibility(0);
        }
        C37246a aVar = new C37246a(this.binding.f69453i, measuredHeight());
        this.binding.f69453i.startAnimation(aVar);
        C32343x.m95435b1(aVar, (C43064a) null, new C35728b(this), (C43064a) null, 5, (Object) null);
        this.binding.f69449e.animate().rotation(180.0f).setDuration(150);
    }

    private final int getViewHeight(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(this.binding.f69453i.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    private final int measuredHeight() {
        int I = C32343x.m95394I(22);
        BogTextView bogTextView = this.binding.f69454j;
        C41536l.m120488h(bogTextView, "binding.headerTV");
        int viewHeight = I + getViewHeight(bogTextView);
        BogTextView bogTextView2 = this.binding.f69452h;
        C41536l.m120488h(bogTextView2, "binding.descriptionTV");
        return viewHeight + getViewHeight(bogTextView2);
    }

    public final void setExpanded(boolean z) {
        if (z) {
            LinearLayout linearLayout = this.binding.f69453i;
            C41536l.m120488h(linearLayout, "binding.expandableDetailsLayout");
            C32343x.m95441d1(linearLayout, measuredHeight());
            return;
        }
        LinearLayout linearLayout2 = this.binding.f69453i;
        C41536l.m120488h(linearLayout2, "binding.expandableDetailsLayout");
        C32343x.m95441d1(linearLayout2, 1);
    }

    public final void setOnExpandCallback(C43075l lVar) {
        C41536l.m120489i(lVar, "onExpand");
        this.onExpand = lVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CashCoverLoanExpandableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        C27382o2 d = C27382o2.m84833d(LayoutInflater.from(getContext()), this, true);
        C41536l.m120488h(d, "inflate(\n            Lay…xt), this, true\n        )");
        this.binding = d;
        d.f69451g.setOnClickListener(new C35811j(this));
    }
}

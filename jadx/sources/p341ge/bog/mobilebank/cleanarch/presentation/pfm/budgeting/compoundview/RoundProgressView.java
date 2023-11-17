package p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.compoundview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C0767a;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.compoundview.RoundProgressView */
public final class RoundProgressView extends LinearLayout {

    /* renamed from: d */
    private final C41217g f58763d;

    /* renamed from: e */
    private final C41217g f58764e;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.compoundview.RoundProgressView$a */
    static final class C22096a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ RoundProgressView f58765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22096a(RoundProgressView roundProgressView) {
            super(0);
            this.f58765d = roundProgressView;
        }

        /* renamed from: b */
        public final ProgressBar invoke() {
            return (ProgressBar) this.f58765d.findViewById(C10322k.progressCircle);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.compoundview.RoundProgressView$b */
    static final class C22097b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ RoundProgressView f58766d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22097b(RoundProgressView roundProgressView) {
            super(0);
            this.f58766d = roundProgressView;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f58766d.findViewById(C10322k.progressPercentTV);
        }
    }

    public RoundProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    private final ProgressBar getProgressBar() {
        Object value = this.f58764e.getValue();
        C41536l.m120488h(value, "<get-progressBar>(...)");
        return (ProgressBar) value;
    }

    private final TextView getProgressPercent() {
        Object value = this.f58763d.getValue();
        C41536l.m120488h(value, "<get-progressPercent>(...)");
        return (TextView) value;
    }

    public final void setProgress(int i) {
        int i2;
        String str;
        ProgressBar progressBar = getProgressBar();
        Context context = getContext();
        if (i > 100) {
            i2 = C10320i.circular_progress_bar_negative;
        } else {
            i2 = C10320i.circular_progress_bar_positive;
        }
        progressBar.setProgressDrawable(C0767a.m2895e(context, i2));
        TextView progressPercent = getProgressPercent();
        if (i > 1000) {
            str = "+100%";
        } else {
            str = i + "%";
        }
        progressPercent.setText(str);
        getProgressBar().setProgress(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoundProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public RoundProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58763d = C41219i.m119470b(new C22097b(this));
        this.f58764e = C41219i.m119470b(new C22096a(this));
        View.inflate(context, C10324m.round_progress_view, this);
    }
}

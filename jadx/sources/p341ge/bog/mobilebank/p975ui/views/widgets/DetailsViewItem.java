package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.core.content.res.C0808h;
import g91.C32296c1;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10318g;
import p366bk.C10321j;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.DetailsViewItem */
public final class DetailsViewItem extends LinearLayout {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DetailsViewItem(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public static /* synthetic */ void addKey$default(DetailsViewItem detailsViewItem, String str, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 16.0f;
        }
        detailsViewItem.addKey(str, f);
    }

    public static /* synthetic */ void addValue$default(DetailsViewItem detailsViewItem, String str, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 14.0f;
        }
        detailsViewItem.addValue(str, f);
    }

    private final void setDefaultMargin() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        C41536l.m120487g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = -1;
        marginLayoutParams.height = -2;
        marginLayoutParams.bottomMargin = C32296c1.m95141a(getContext(), 27);
        marginLayoutParams.leftMargin = C32296c1.m95141a(getContext(), 25);
        marginLayoutParams.rightMargin = C32296c1.m95141a(getContext(), 30);
        setLayoutParams(marginLayoutParams);
        setOrientation(1);
        requestLayout();
    }

    public final void addKey(String str, float f) {
        C41536l.m120489i(str, "text");
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextSize(2, f);
        textView.setGravity(8388611);
        textView.setTypeface(C0808h.m3033h(getContext(), C10321j.bog_headline_medium));
        textView.setTextColor(C0767a.m2893c(getContext(), C10318g.become_solo_details_header));
        addView(textView);
    }

    public final void addValue(String str, float f) {
        C41536l.m120489i(str, "text");
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = C32296c1.m95141a(getContext(), 8);
        textView.setText(str);
        textView.setLayoutParams(layoutParams);
        textView.setLineSpacing(5.0f, 1.0f);
        textView.setTypeface(C0808h.m3033h(getContext(), C10321j.f28707e));
        textView.setTextColor(C0767a.m2893c(getContext(), C10318g.become_solo_details_value));
        textView.setTextSize(2, f);
        addView(textView);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setDefaultMargin();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DetailsViewItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DetailsViewItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DetailsViewItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
    }
}

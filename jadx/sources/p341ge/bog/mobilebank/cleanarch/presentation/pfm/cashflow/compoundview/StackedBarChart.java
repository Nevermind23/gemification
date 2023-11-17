package p341ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.highlight.Highlight;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.StackedBarChart */
public final class StackedBarChart extends BarChart {
    public StackedBarChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public void highlightValue(Highlight highlight, boolean z) {
        if (highlight != null) {
            super.highlightValue(highlight, z);
        }
    }

    public StackedBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StackedBarChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

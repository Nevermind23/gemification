package p341ge.bog.designsystem.components.chartsheader;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.designsystem.components.chartsheader.StackedBarChart */
public class StackedBarChart extends BarChart {

    /* renamed from: d */
    private float f39022d;

    /* renamed from: e */
    private float f39023e;

    /* renamed from: f */
    private float f39024f;

    /* renamed from: g */
    private Float f39025g;

    /* renamed from: h */
    private Integer f39026h;

    /* renamed from: i */
    private Integer f39027i;

    public StackedBarChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final float getBarCornerRadius() {
        return this.f39024f;
    }

    public final float getBarSpace() {
        return this.f39023e;
    }

    public final Float getBudget() {
        return this.f39025g;
    }

    public final Integer getBudgetBackgroundColor() {
        return this.f39027i;
    }

    public final Integer getBudgetColor() {
        return this.f39026h;
    }

    public final float getGroupSpace() {
        return this.f39022d;
    }

    public void groupBars(float f, float f2, float f3) {
        this.f39022d = f2;
        this.f39023e = f3;
        super.groupBars(f, f2, f3);
    }

    public void highlightValue(Highlight highlight, boolean z) {
        if (highlight != null) {
            super.highlightValue(highlight, z);
        }
    }

    public final void setBarCornerRadius(float f) {
        this.f39024f = f;
    }

    public final void setBarSpace(float f) {
        this.f39023e = f;
    }

    public final void setGroupSpace(float f) {
        this.f39022d = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StackedBarChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void setData(BarData barData) {
        this.f39022d = Utils.FLOAT_EPSILON;
        this.f39023e = Utils.FLOAT_EPSILON;
        super.setData(barData);
    }

    public StackedBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

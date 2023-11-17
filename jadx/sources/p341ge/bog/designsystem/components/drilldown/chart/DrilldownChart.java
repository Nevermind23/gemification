package p341ge.bog.designsystem.components.drilldown.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.core.content.C0767a;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p393di.C12131b;

/* renamed from: ge.bog.designsystem.components.drilldown.chart.DrilldownChart */
public final class DrilldownChart extends PieChart {

    /* renamed from: d */
    private float[] f39449d;

    /* renamed from: e */
    private float[] f39450e;

    /* renamed from: f */
    private double f39451f;

    /* renamed from: g */
    private boolean f39452g;

    /* renamed from: h */
    private int f39453h;

    /* renamed from: i */
    private int f39454i;

    /* renamed from: j */
    private float f39455j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DrilldownChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    static /* synthetic */ float m50146a(DrilldownChart drilldownChart, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 100.0f;
        }
        return drilldownChart.calcAngle(f, f2);
    }

    private final float calcAngle(float f, float f2) {
        return (f / f2) * this.mMaxAngle;
    }

    /* renamed from: b */
    public final void mo35678b(List list, double d) {
        C41536l.m120489i(list, "items");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12131b bVar = (C12131b) it.next();
            arrayList.add(new PieEntry((float) ((bVar.mo32332a().mo32328b() * ((double) 100)) / d), "", (Object) bVar.mo32335d()));
            arrayList2.add(Integer.valueOf(C0767a.m2893c(getContext(), bVar.mo32333b())));
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList, "");
        pieDataSet.setDrawValues(false);
        pieDataSet.setColors((List<Integer>) arrayList2);
        pieDataSet.setSelectionShift(this.f39455j);
        PieData pieData = new PieData(pieDataSet);
        setUsePercentValues(true);
        setData(pieData);
        highlightValues((Highlight[]) null);
        invalidate();
    }

    public void clear() {
        this.f39452g = false;
        super.clear();
    }

    public final int getBorderBackgroundColor() {
        return this.f39453h;
    }

    public int getIndexForAngle(float f) {
        double d;
        float normalizedAngle = Utils.getNormalizedAngle(f - getRotationAngle());
        if (isDrawRoundedSlicesEnabled()) {
            double radius = (((double) getRadius()) - (((double) (getRadius() * getHoleRadius())) / 100.0d)) / 2.0d;
            d = Math.toDegrees(radius / (((double) getRadius()) - radius));
        } else {
            d = Utils.DOUBLE_EPSILON;
        }
        int length = this.f39449d.length;
        float f2 = Utils.FLOAT_EPSILON;
        for (int i = 0; i < length; i++) {
            f2 += this.f39449d[i];
            if (((double) f2) + d > ((double) normalizedAngle)) {
                return i;
            }
        }
        return -1;
    }

    public final float[] getPercentAbsoluteAngles() {
        return this.f39450e;
    }

    public final float[] getPercentDrawAngles() {
        return this.f39449d;
    }

    public final float getSelectionShift() {
        return this.f39455j;
    }

    public final int getShadowColor() {
        return this.f39454i;
    }

    public final double getTotalPercentage() {
        return this.f39451f;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        T t = this.mData;
        if (t != null) {
            int entryCount = ((PieData) t).getEntryCount();
            float[] fArr = this.f39449d;
            if (fArr.length != entryCount) {
                this.f39449d = new float[entryCount];
            } else {
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    float f = fArr[i];
                    this.f39449d[i2] = 0.0f;
                    i++;
                    i2++;
                }
            }
            float[] fArr2 = this.f39450e;
            if (fArr2.length != entryCount) {
                this.f39450e = new float[entryCount];
            } else {
                int length2 = fArr2.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2) {
                    float f2 = fArr2[i3];
                    this.f39450e[i4] = 0.0f;
                    i3++;
                    i4++;
                }
            }
            IPieDataSet iPieDataSet = (IPieDataSet) ((PieData) this.mData).getDataSets().get(0);
            int entryCount2 = iPieDataSet.getEntryCount();
            for (int i5 = 0; i5 < entryCount2; i5++) {
                this.f39449d[i5] = m50146a(this, Math.abs(((PieEntry) iPieDataSet.getEntryForIndex(i5)).getY()), Utils.FLOAT_EPSILON, 2, (Object) null);
                if (i5 == 0) {
                    this.f39450e[i5] = this.f39449d[i5];
                } else {
                    float[] fArr3 = this.f39450e;
                    fArr3[i5] = fArr3[i5 - 1] + this.f39449d[i5];
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.f39452g) {
            calculateOffsets();
            this.f39452g = true;
        }
        if (this.mData != null) {
            this.mRenderer.drawData(canvas);
            this.mRenderer.drawExtras(canvas);
            if (valuesToHighlight()) {
                this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
            }
            this.mRenderer.drawValues(canvas);
            this.mLegendRenderer.renderLegend(canvas);
            drawDescription(canvas);
            drawMarkers(canvas);
        }
    }

    public final void setBorderBackgroundColor(int i) {
        this.f39453h = i;
    }

    public final void setPercentAbsoluteAngles(float[] fArr) {
        C41536l.m120489i(fArr, "<set-?>");
        this.f39450e = fArr;
    }

    public final void setPercentDrawAngles(float[] fArr) {
        C41536l.m120489i(fArr, "<set-?>");
        this.f39449d = fArr;
    }

    public final void setSelectionShift(float f) {
        this.f39455j = f;
    }

    public final void setShadowColor(int i) {
        this.f39454i = i;
    }

    public final void setTotalPercentage(double d) {
        this.f39451f = d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DrilldownChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void setData(PieData pieData) {
        if (pieData != null) {
            float yValueSum = pieData.getYValueSum();
            this.f39451f = (double) yValueSum;
            setRotationAngle(270.0f);
            if (isUsePercentValuesEnabled() && yValueSum > 100.0f) {
                float f = yValueSum - ((float) 100);
                setRotationAngle(getRotationAngle() + m50146a(this, f, Utils.FLOAT_EPSILON, 2, (Object) null));
                for (IPieDataSet entryCount : pieData.getDataSets()) {
                    int entryCount2 = entryCount.getEntryCount();
                    for (int i = 0; i < entryCount2 && f > Utils.FLOAT_EPSILON; i++) {
                        float value = ((PieEntry) pieData.getDataSet().getEntryForIndex(i)).getValue() - f;
                        if (value < Utils.FLOAT_EPSILON) {
                            f = -value;
                            value = 0.0f;
                        } else {
                            f = 0.0f;
                        }
                        ((PieEntry) pieData.getDataSet().getEntryForIndex(0)).setY(value);
                    }
                }
            }
        }
        this.f39452g = false;
        super.setData(pieData);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrilldownChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f39449d = new float[1];
        this.f39450e = new float[1];
        this.f39451f = 100.0d;
        this.f39453h = Color.argb(0, 0, 0, 0);
        this.f39454i = Color.argb(25, 0, 0, 0);
    }
}

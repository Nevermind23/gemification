package o40;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import g91.C32343x;
import java.util.HashSet;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: o40.a */
public final class C26721a extends BarChartRenderer {

    /* renamed from: a */
    private final boolean f67353a;

    /* renamed from: b */
    private final HashSet f67354b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26721a(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, boolean z, HashSet hashSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barDataProvider, chartAnimator, viewPortHandler, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : hashSet);
    }

    /* renamed from: a */
    private final Path m83174a(RectF rectF, float f, float f2, boolean z, boolean z2, boolean z3, boolean z4) {
        float f3 = rectF.top;
        float f4 = rectF.left;
        float f5 = rectF.right;
        float f6 = rectF.bottom;
        Path path = new Path();
        if (f < Utils.FLOAT_EPSILON) {
            f = 0.0f;
        }
        if (f2 < Utils.FLOAT_EPSILON) {
            f2 = 0.0f;
        }
        float f7 = f5 - f4;
        float f8 = f6 - f3;
        float f9 = (float) 2;
        float f12 = f7 / f9;
        if (f > f12) {
            f = f12;
        }
        float f13 = f8 / f9;
        if (f2 > f13) {
            f2 = f13;
        }
        float f14 = f7 - (f9 * f);
        float f15 = f8 - (f9 * f2);
        path.moveTo(f5, f3 + f2);
        if (z2) {
            float f16 = -f2;
            path.rQuadTo(Utils.FLOAT_EPSILON, f16, -f, f16);
        } else {
            path.rLineTo(Utils.FLOAT_EPSILON, -f2);
            path.rLineTo(-f, Utils.FLOAT_EPSILON);
        }
        path.rLineTo(-f14, Utils.FLOAT_EPSILON);
        if (z) {
            float f17 = -f;
            path.rQuadTo(f17, Utils.FLOAT_EPSILON, f17, f2);
        } else {
            path.rLineTo(-f, Utils.FLOAT_EPSILON);
            path.rLineTo(Utils.FLOAT_EPSILON, f2);
        }
        path.rLineTo(Utils.FLOAT_EPSILON, f15);
        if (z4) {
            path.rQuadTo(Utils.FLOAT_EPSILON, f2, f, f2);
        } else {
            path.rLineTo(Utils.FLOAT_EPSILON, f2);
            path.rLineTo(f, Utils.FLOAT_EPSILON);
        }
        path.rLineTo(f14, Utils.FLOAT_EPSILON);
        if (z3) {
            path.rQuadTo(f, Utils.FLOAT_EPSILON, f, -f2);
        } else {
            path.rLineTo(f, Utils.FLOAT_EPSILON);
            path.rLineTo(Utils.FLOAT_EPSILON, -f2);
        }
        path.rLineTo(Utils.FLOAT_EPSILON, -f15);
        path.close();
        return path;
    }

    /* access modifiers changed from: protected */
    public void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i) {
        boolean z;
        Canvas canvas2 = canvas;
        IBarDataSet iBarDataSet2 = iBarDataSet;
        int i2 = i;
        C41536l.m120489i(canvas2, "c");
        C41536l.m120489i(iBarDataSet2, "dataSet");
        float H = (float) C32343x.m95392H(10.0f);
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(iBarDataSet.getBarBorderWidth());
        this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        BarBuffer barBuffer = this.mBarBuffers[i2];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i2);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet2);
        transformer.pointValuesToPixel(barBuffer.buffer);
        if (iBarDataSet.getColors().size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        for (int i3 = 0; i3 < barBuffer.size(); i3 += 4) {
            int i4 = i3 + 2;
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i4])) {
                if (this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i3])) {
                    if (!z) {
                        this.mRenderPaint.setColor(iBarDataSet2.getColor(i3 / 4));
                    }
                    float[] fArr = barBuffer.buffer;
                    int i5 = i3 + 1;
                    int i6 = i3 + 3;
                    Path a = m83174a(new RectF(fArr[i3], fArr[i5], fArr[i4], fArr[i6]), H, H, true, true, false, false);
                    if (i3 == barBuffer.size() - 8 && this.f67354b != null) {
                        float[] fArr2 = barBuffer.buffer;
                        a = m83174a(new RectF(fArr2[i3], fArr2[i5], fArr2[i4], fArr2[i6]), H, H, false, false, false, false);
                    }
                    canvas2.drawPath(a, this.mRenderPaint);
                } else {
                    return;
                }
            }
        }
    }

    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        Canvas canvas2 = canvas;
        BarData barData = this.mChart.getBarData();
        C41536l.m120486f(highlightArr);
        for (Highlight highlight : highlightArr) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBarDataSet != null && iBarDataSet.isHighlightEnabled()) {
                BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(barEntry, iBarDataSet)) {
                    Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                    float f = (float) 20;
                    float yMax = this.mChart.getData().getYMax() + (this.mChart.getData().getYMax() / f);
                    float f2 = (-this.mChart.getData().getYMax()) / f;
                    this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                    this.mHighlightPaint.setAlpha(iBarDataSet.getHighLightAlpha());
                    this.mHighlightPaint.setStyle(Paint.Style.FILL);
                    prepareBarHighlight(barEntry.getX(), yMax, f2, barData.getBarWidth() / 2.0f, transformer);
                    setHighlightDrawPos(highlight, this.mBarRect);
                    if (canvas2 != null) {
                        canvas2.drawRoundRect(this.mBarRect, (float) C32343x.m95392H(7.0f), (float) C32343x.m95392H(7.0f), this.mHighlightPaint);
                    }
                    this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                    this.mHighlightPaint.setStyle(Paint.Style.STROKE);
                    this.mHighlightPaint.setPathEffect(new DashPathEffect(new float[]{(float) C32343x.m95392H(2.0f), (float) C32343x.m95392H(2.0f)}, (float) C32343x.m95392H(2.0f)));
                    this.mHighlightPaint.setStrokeWidth((float) C32343x.m95392H(1.0f));
                    prepareBarHighlight(barEntry.getX(), yMax, f2, barData.getBarWidth() / 2.0f, transformer);
                    setHighlightDrawPos(highlight, this.mBarRect);
                    if (canvas2 != null) {
                        canvas2.drawRoundRect(this.mBarRect, (float) C32343x.m95392H(7.0f), (float) C32343x.m95392H(7.0f), this.mHighlightPaint);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void prepareBarHighlight(float f, float f2, float f3, float f4, Transformer transformer) {
        float f5;
        float f6;
        if (!this.f67353a) {
            float f7 = ((float) ((int) f)) + 0.325f;
            f6 = (f7 - f4) - 0.15f;
            f5 = f7 + (f4 * 3.0f) + 0.05f + 0.15f;
        } else {
            float f8 = f4 * ((float) 3);
            f6 = f - f8;
            f5 = f + f8;
        }
        this.mBarRect.set(f6, f2, f5, f3);
        if (transformer != null) {
            transformer.rectToPixelPhase(this.mBarRect, this.mAnimator.getPhaseY());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26721a(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, boolean z, HashSet hashSet) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        C41536l.m120489i(barDataProvider, "chart");
        C41536l.m120489i(chartAnimator, "animator");
        C41536l.m120489i(viewPortHandler, "viewPortHandler");
        this.f67353a = z;
        this.f67354b = hashSet;
    }
}

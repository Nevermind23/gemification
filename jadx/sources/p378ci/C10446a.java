package p378ci;

import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.renderer.PieChartRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.drilldown.chart.DrilldownChart;

/* renamed from: ci.a */
public final class C10446a extends PieChartRenderer {

    /* renamed from: a */
    private final Path f29746a = new Path();

    /* renamed from: b */
    private final RectF f29747b = new RectF();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10446a(DrilldownChart drilldownChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(drilldownChart, chartAnimator, viewPortHandler);
        C41536l.m120489i(drilldownChart, "chart");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawDataSet(android.graphics.Canvas r43, com.github.mikephil.charting.interfaces.datasets.IPieDataSet r44) {
        /*
            r42 = this;
            r8 = r42
            r9 = r44
            java.lang.String r0 = "dataSet"
            kotlin.jvm.internal.C41536l.m120489i(r9, r0)
            com.github.mikephil.charting.charts.PieChart r0 = r8.mChart
            java.lang.String r1 = "null cannot be cast to non-null type ge.bog.designsystem.components.drilldown.chart.DrilldownChart"
            kotlin.jvm.internal.C41536l.m120487g(r0, r1)
            r10 = r0
            ge.bog.designsystem.components.drilldown.chart.DrilldownChart r10 = (p341ge.bog.designsystem.components.drilldown.chart.DrilldownChart) r10
            float r11 = r10.getRotationAngle()
            com.github.mikephil.charting.animation.ChartAnimator r0 = r8.mAnimator
            float r12 = r0.getPhaseX()
            com.github.mikephil.charting.animation.ChartAnimator r0 = r8.mAnimator
            float r13 = r0.getPhaseY()
            android.graphics.RectF r14 = r10.getCircleBox()
            int r15 = r44.getEntryCount()
            boolean r0 = r10.isUsePercentValuesEnabled()
            if (r0 == 0) goto L_0x0036
            float[] r0 = r10.getPercentDrawAngles()
            goto L_0x003a
        L_0x0036:
            float[] r0 = r10.getDrawAngles()
        L_0x003a:
            r7 = r0
            java.lang.String r0 = "drawAngles"
            kotlin.jvm.internal.C41536l.m120488h(r7, r0)
            float r16 = ie1.C41333m.m119786M(r7)
            double r17 = r10.getTotalPercentage()
            com.github.mikephil.charting.utils.MPPointF r6 = r10.getCenterCircleBox()
            float r5 = r10.getRadius()
            boolean r0 = r10.isDrawHoleEnabled()
            r19 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0062
            boolean r0 = r10.isDrawSlicesUnderHoleEnabled()
            if (r0 != 0) goto L_0x0062
            r20 = r4
            goto L_0x0064
        L_0x0062:
            r20 = r19
        L_0x0064:
            r0 = 1120403456(0x42c80000, float:100.0)
            r21 = 0
            if (r20 == 0) goto L_0x0072
            float r1 = r10.getHoleRadius()
            float r1 = r1 / r0
            float r1 = r1 * r5
            r3 = r1
            goto L_0x0074
        L_0x0072:
            r3 = r21
        L_0x0074:
            float r1 = r10.getHoleRadius()
            float r1 = r1 * r5
            float r1 = r1 / r0
            float r0 = r5 - r1
            r22 = 1073741824(0x40000000, float:2.0)
            float r23 = r0 / r22
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            if (r20 == 0) goto L_0x0090
            boolean r0 = r10.isDrawRoundedSlicesEnabled()
            if (r0 == 0) goto L_0x0090
            r24 = r4
            goto L_0x0092
        L_0x0090:
            r24 = r19
        L_0x0092:
            r0 = r19
            r1 = r0
        L_0x0095:
            if (r0 >= r15) goto L_0x00b0
            com.github.mikephil.charting.data.Entry r25 = r9.getEntryForIndex(r0)
            com.github.mikephil.charting.data.PieEntry r25 = (com.github.mikephil.charting.data.PieEntry) r25
            float r25 = r25.getY()
            float r25 = java.lang.Math.abs(r25)
            float r26 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON
            int r25 = (r25 > r26 ? 1 : (r25 == r26 ? 0 : -1))
            if (r25 <= 0) goto L_0x00ad
            int r1 = r1 + 1
        L_0x00ad:
            int r0 = r0 + 1
            goto L_0x0095
        L_0x00b0:
            if (r1 > r4) goto L_0x00b5
            r25 = r21
            goto L_0x00bb
        L_0x00b5:
            float r0 = r8.getSliceSpace(r9)
            r25 = r0
        L_0x00bb:
            android.graphics.Paint r0 = r8.mRenderPaint
            int r4 = r10.getBorderBackgroundColor()
            r0.setColor(r4)
            android.graphics.Path r0 = r8.f29746a
            r0.reset()
            android.graphics.Path r0 = r8.f29746a
            float r4 = r6.f11822x
            r26 = r3
            float r3 = r6.f11823y
            r27 = r14
            android.graphics.Path$Direction r14 = android.graphics.Path.Direction.CW
            r0.addCircle(r4, r3, r5, r14)
            android.graphics.Path r0 = r8.f29746a
            r0.close()
            android.graphics.Canvas r0 = r8.mBitmapCanvas
            android.graphics.Path r3 = r8.f29746a
            android.graphics.Paint r4 = r8.mRenderPaint
            r0.drawPath(r3, r4)
            r14 = r19
            r28 = r21
        L_0x00ea:
            r29 = 1016003125(0x3c8efa35, float:0.017453292)
            if (r14 >= r15) goto L_0x0389
            r30 = r7[r14]
            com.github.mikephil.charting.data.Entry r4 = r9.getEntryForIndex(r14)
            java.lang.String r0 = "dataSet.getEntryForIndex(j)"
            kotlin.jvm.internal.C41536l.m120488h(r4, r0)
            float r0 = r4.getY()
            float r0 = java.lang.Math.abs(r0)
            float r32 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON
            int r0 = (r0 > r32 ? 1 : (r0 == r32 ? 0 : -1))
            if (r0 > 0) goto L_0x011d
        L_0x0108:
            float r30 = r30 * r12
            float r28 = r28 + r30
            r33 = r5
            r34 = r7
            r36 = r10
            r37 = r11
            r38 = r12
            r9 = r26
            r12 = r1
            r11 = r2
            r10 = r6
            goto L_0x0374
        L_0x011d:
            boolean r0 = r10.needsHighlight(r14)
            if (r0 == 0) goto L_0x0126
            if (r24 != 0) goto L_0x0126
            goto L_0x0108
        L_0x0126:
            int r0 = (r25 > r21 ? 1 : (r25 == r21 ? 0 : -1))
            r4 = 1127481344(0x43340000, float:180.0)
            if (r0 <= 0) goto L_0x0132
            int r0 = (r30 > r4 ? 1 : (r30 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0132
            r0 = 1
            goto L_0x0134
        L_0x0132:
            r0 = r19
        L_0x0134:
            android.graphics.Paint r4 = r8.mRenderPaint
            int r3 = r9.getColor(r14)
            r4.setColor(r3)
            r4 = 1
            if (r1 != r4) goto L_0x0143
            r3 = r21
            goto L_0x0147
        L_0x0143:
            float r3 = r5 * r29
            float r3 = r25 / r3
        L_0x0147:
            float r34 = r3 / r22
            float r34 = r28 + r34
            float r34 = r34 * r13
            r43 = r7
            float r7 = r11 + r34
            float r3 = r30 - r3
            float r3 = r3 * r13
            int r34 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r34 >= 0) goto L_0x015a
            r3 = r21
        L_0x015a:
            android.graphics.Path r4 = r8.f29746a
            r4.reset()
            if (r24 == 0) goto L_0x018f
            float r4 = r6.f11822x
            float r35 = r5 - r23
            r36 = r1
            float r1 = r7 * r29
            r37 = r11
            r38 = r12
            double r11 = (double) r1
            r39 = r0
            double r0 = java.lang.Math.cos(r11)
            float r0 = (float) r0
            float r0 = r0 * r35
            float r4 = r4 + r0
            float r0 = r6.f11823y
            double r11 = java.lang.Math.sin(r11)
            float r1 = (float) r11
            float r35 = r35 * r1
            float r0 = r0 + r35
            float r1 = r4 - r23
            float r11 = r0 - r23
            float r4 = r4 + r23
            float r0 = r0 + r23
            r2.set(r1, r11, r4, r0)
            goto L_0x0197
        L_0x018f:
            r39 = r0
            r36 = r1
            r37 = r11
            r38 = r12
        L_0x0197:
            float r0 = r6.f11822x
            float r1 = r7 * r29
            double r11 = (double) r1
            r4 = r2
            double r1 = java.lang.Math.cos(r11)
            float r1 = (float) r1
            float r1 = r1 * r5
            float r35 = r0 + r1
            float r0 = r6.f11823y
            double r1 = java.lang.Math.sin(r11)
            float r1 = (float) r1
            float r1 = r1 * r5
            float r11 = r0 + r1
            r12 = 1135869952(0x43b40000, float:360.0)
            int r40 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r40 < 0) goto L_0x01cb
            float r0 = r3 % r12
            int r0 = (r0 > r32 ? 1 : (r0 == r32 ? 0 : -1))
            if (r0 > 0) goto L_0x01cb
            android.graphics.Path r0 = r8.f29746a
            float r1 = r6.f11822x
            float r2 = r6.f11823y
            android.graphics.Path$Direction r12 = android.graphics.Path.Direction.CW
            r0.addCircle(r1, r2, r5, r12)
            r2 = r27
            r12 = 1127481344(0x43340000, float:180.0)
            goto L_0x01fa
        L_0x01cb:
            if (r24 == 0) goto L_0x01f1
            float r0 = r10.getMaxAngle()
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e3
            if (r14 != 0) goto L_0x01e3
            android.graphics.Path r0 = r8.f29746a
            r1 = 180(0xb4, float:2.52E-43)
            float r1 = (float) r1
            float r1 = r1 + r7
            r12 = 1127481344(0x43340000, float:180.0)
            r0.arcTo(r4, r1, r12)
            goto L_0x01f3
        L_0x01e3:
            r1 = 180(0xb4, float:2.52E-43)
            r12 = 1127481344(0x43340000, float:180.0)
            android.graphics.Path r0 = r8.f29746a
            float r1 = (float) r1
            float r1 = r1 + r7
            r2 = -1020002304(0xffffffffc3340000, float:-180.0)
            r0.arcTo(r4, r1, r2)
            goto L_0x01f3
        L_0x01f1:
            r12 = 1127481344(0x43340000, float:180.0)
        L_0x01f3:
            android.graphics.Path r0 = r8.f29746a
            r2 = r27
            r0.arcTo(r2, r7, r3)
        L_0x01fa:
            android.graphics.RectF r0 = r8.f29747b
            float r1 = r6.f11822x
            float r12 = r1 - r26
            r27 = r2
            float r2 = r6.f11823y
            r31 = r3
            float r3 = r2 - r26
            float r1 = r1 + r26
            float r2 = r2 + r26
            r0.set(r12, r3, r1, r2)
            if (r20 == 0) goto L_0x0301
            int r0 = (r26 > r21 ? 1 : (r26 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x022a
            if (r39 == 0) goto L_0x0218
            goto L_0x022a
        L_0x0218:
            r34 = r43
            r33 = r5
            r9 = r26
            r26 = r31
            r12 = r36
            r0 = 1135869952(0x43b40000, float:360.0)
            r5 = r4
            r36 = r10
            r10 = r6
            goto L_0x0311
        L_0x022a:
            if (r39 == 0) goto L_0x0258
            float r3 = r30 * r13
            r0 = r42
            r12 = r36
            r1 = r6
            r9 = r27
            r2 = r5
            r9 = r26
            r26 = r31
            r41 = r4
            r36 = r10
            r10 = 1
            r4 = r35
            r33 = r5
            r5 = r11
            r11 = r6
            r6 = r7
            r34 = r43
            r7 = r26
            float r0 = r0.calculateMinimumRadiusForSpacedSlice(r1, r2, r3, r4, r5, r6, r7)
            int r1 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r1 >= 0) goto L_0x0253
            float r0 = -r0
        L_0x0253:
            float r3 = java.lang.Math.max(r9, r0)
            goto L_0x0269
        L_0x0258:
            r34 = r43
            r41 = r4
            r33 = r5
            r11 = r6
            r9 = r26
            r26 = r31
            r12 = r36
            r36 = r10
            r10 = 1
            r3 = r9
        L_0x0269:
            if (r12 == r10) goto L_0x027b
            int r0 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x0271
            r4 = r10
            goto L_0x0273
        L_0x0271:
            r4 = r19
        L_0x0273:
            if (r4 == 0) goto L_0x0276
            goto L_0x027b
        L_0x0276:
            float r0 = r3 * r29
            float r0 = r25 / r0
            goto L_0x027d
        L_0x027b:
            r0 = r21
        L_0x027d:
            float r1 = r0 / r22
            float r1 = r28 + r1
            float r1 = r1 * r13
            float r1 = r37 + r1
            float r0 = r30 - r0
            float r0 = r0 * r13
            int r2 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r2 >= 0) goto L_0x028d
            r0 = r21
        L_0x028d:
            float r1 = r1 + r0
            if (r40 < 0) goto L_0x02a8
            r2 = 1135869952(0x43b40000, float:360.0)
            float r2 = r26 % r2
            int r2 = (r2 > r32 ? 1 : (r2 == r32 ? 0 : -1))
            if (r2 > 0) goto L_0x02a8
            android.graphics.Path r0 = r8.f29746a
            float r1 = r11.f11822x
            float r2 = r11.f11823y
            android.graphics.Path$Direction r4 = android.graphics.Path.Direction.CCW
            r0.addCircle(r1, r2, r3, r4)
            r10 = r11
            r11 = r41
            goto L_0x0362
        L_0x02a8:
            if (r24 == 0) goto L_0x02d7
            float r2 = r11.f11822x
            float r5 = r33 - r23
            float r3 = r1 * r29
            double r3 = (double) r3
            double r6 = java.lang.Math.cos(r3)
            float r6 = (float) r6
            float r6 = r6 * r5
            float r2 = r2 + r6
            float r6 = r11.f11823y
            double r3 = java.lang.Math.sin(r3)
            float r3 = (float) r3
            float r5 = r5 * r3
            float r6 = r6 + r5
            float r3 = r2 - r23
            float r4 = r6 - r23
            float r2 = r2 + r23
            float r6 = r6 + r23
            r5 = r41
            r5.set(r3, r4, r2, r6)
            android.graphics.Path r2 = r8.f29746a
            r3 = 1127481344(0x43340000, float:180.0)
            r2.arcTo(r5, r1, r3)
            r10 = r11
            goto L_0x02f7
        L_0x02d7:
            r5 = r41
            android.graphics.Path r2 = r8.f29746a
            float r4 = r11.f11822x
            float r6 = r1 * r29
            double r6 = (double) r6
            r31 = r11
            double r10 = java.lang.Math.cos(r6)
            float r10 = (float) r10
            float r10 = r10 * r3
            float r4 = r4 + r10
            r10 = r31
            float r11 = r10.f11823y
            double r6 = java.lang.Math.sin(r6)
            float r6 = (float) r6
            float r3 = r3 * r6
            float r11 = r11 + r3
            r2.lineTo(r4, r11)
        L_0x02f7:
            android.graphics.Path r2 = r8.f29746a
            android.graphics.RectF r3 = r8.f29747b
            float r0 = -r0
            r2.arcTo(r3, r1, r0)
            goto L_0x0361
        L_0x0301:
            r34 = r43
            r33 = r5
            r9 = r26
            r26 = r31
            r12 = r36
            r5 = r4
            r36 = r10
            r10 = r6
            r0 = 1135869952(0x43b40000, float:360.0)
        L_0x0311:
            float r3 = r26 % r0
            int r0 = (r3 > r32 ? 1 : (r3 == r32 ? 0 : -1))
            if (r0 <= 0) goto L_0x0361
            if (r39 == 0) goto L_0x0356
            android.graphics.Path r0 = r8.f29746a
            float r1 = r10.f11822x
            float r2 = r10.f11823y
            android.graphics.Path$Direction r3 = android.graphics.Path.Direction.CCW
            r0.addCircle(r1, r2, r9, r3)
            float r3 = r26 / r22
            float r31 = r7 + r3
            float r3 = r30 * r13
            r0 = r42
            r1 = r10
            r2 = r33
            r4 = r35
            r6 = r5
            r5 = r11
            r11 = r6
            r6 = r7
            r7 = r26
            float r0 = r0.calculateMinimumRadiusForSpacedSlice(r1, r2, r3, r4, r5, r6, r7)
            float r1 = r10.f11822x
            float r2 = r31 * r29
            double r2 = (double) r2
            double r4 = java.lang.Math.cos(r2)
            float r4 = (float) r4
            float r4 = r4 * r0
            float r1 = r1 + r4
            float r4 = r10.f11823y
            double r2 = java.lang.Math.sin(r2)
            float r2 = (float) r2
            float r0 = r0 * r2
            float r4 = r4 + r0
            android.graphics.Path r0 = r8.f29746a
            r0.lineTo(r1, r4)
            goto L_0x0362
        L_0x0356:
            r11 = r5
            android.graphics.Path r0 = r8.f29746a
            float r1 = r10.f11822x
            float r2 = r10.f11823y
            r0.lineTo(r1, r2)
            goto L_0x0362
        L_0x0361:
            r11 = r5
        L_0x0362:
            android.graphics.Path r0 = r8.f29746a
            r0.close()
            android.graphics.Canvas r0 = r8.mBitmapCanvas
            android.graphics.Path r1 = r8.f29746a
            android.graphics.Paint r2 = r8.mRenderPaint
            r0.drawPath(r1, r2)
            float r30 = r30 * r38
            float r28 = r28 + r30
        L_0x0374:
            int r14 = r14 + 1
            r26 = r9
            r6 = r10
            r2 = r11
            r1 = r12
            r5 = r33
            r7 = r34
            r10 = r36
            r11 = r37
            r12 = r38
            r9 = r44
            goto L_0x00ea
        L_0x0389:
            r33 = r5
            r36 = r10
            r37 = r11
            r11 = r2
            r10 = r6
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x045e
            r0 = 1
            if (r15 != r0) goto L_0x045e
            android.graphics.Paint r0 = r8.mRenderPaint
            int r0 = r0.getColor()
            android.graphics.Paint r1 = r8.mRenderPaint
            android.graphics.MaskFilter r1 = r1.getMaskFilter()
            r2 = 3
            float r2 = (float) r2
            float r2 = r23 / r2
            android.graphics.Paint r3 = r8.mRenderPaint
            int r4 = r36.getShadowColor()
            r3.setColor(r4)
            android.graphics.Paint r3 = r8.mRenderPaint
            android.graphics.BlurMaskFilter r4 = new android.graphics.BlurMaskFilter
            r5 = 4
            int r6 = p642vh.C18368l.m62762k(r5)
            float r6 = (float) r6
            android.graphics.BlurMaskFilter$Blur r7 = android.graphics.BlurMaskFilter.Blur.NORMAL
            r4.<init>(r6, r7)
            r3.setMaskFilter(r4)
            android.graphics.Path r3 = r8.f29746a
            r3.reset()
            float r3 = r10.f11822x
            float r4 = r33 - r23
            float r2 = r2 + r4
            float r5 = (float) r5
            float r5 = r37 + r5
            float r5 = r5 * r29
            double r5 = (double) r5
            double r12 = java.lang.Math.cos(r5)
            float r7 = (float) r12
            float r7 = r7 * r2
            float r3 = r3 + r7
            float r7 = r10.f11823y
            double r5 = java.lang.Math.sin(r5)
            float r5 = (float) r5
            float r2 = r2 * r5
            float r7 = r7 + r2
            float r2 = r3 - r23
            float r5 = r7 - r23
            float r6 = r3 + r23
            float r9 = r7 + r23
            r11.set(r2, r5, r6, r9)
            android.graphics.Path r2 = r8.f29746a
            r5 = 180(0xb4, float:2.52E-43)
            float r5 = (float) r5
            float r5 = r37 + r5
            r6 = -1024458752(0xffffffffc2f00000, float:-120.0)
            r2.arcTo(r11, r5, r6)
            android.graphics.Path r2 = r8.f29746a
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12 = r27
            r9 = r37
            r2.arcTo(r12, r9, r6)
            android.graphics.Path r2 = r8.f29746a
            r2.lineTo(r3, r7)
            android.graphics.Path r2 = r8.f29746a
            r2.close()
            android.graphics.Canvas r2 = r8.mBitmapCanvas
            android.graphics.Path r3 = r8.f29746a
            android.graphics.Paint r6 = r8.mRenderPaint
            r2.drawPath(r3, r6)
            android.graphics.Paint r2 = r8.mRenderPaint
            r2.setColor(r0)
            android.graphics.Paint r0 = r8.mRenderPaint
            r0.setMaskFilter(r1)
            android.graphics.Path r0 = r8.f29746a
            r0.reset()
            float r0 = r10.f11822x
            float r1 = r9 * r29
            double r1 = (double) r1
            double r6 = java.lang.Math.cos(r1)
            float r3 = (float) r6
            float r3 = r3 * r4
            float r0 = r0 + r3
            float r3 = r10.f11823y
            double r1 = java.lang.Math.sin(r1)
            float r1 = (float) r1
            float r4 = r4 * r1
            float r3 = r3 + r4
            float r1 = r0 - r23
            float r2 = r3 - r23
            float r0 = r0 + r23
            float r3 = r3 + r23
            r11.set(r1, r2, r0, r3)
            android.graphics.Path r0 = r8.f29746a
            r1 = -1020002304(0xffffffffc3340000, float:-180.0)
            r0.arcTo(r11, r5, r1)
            android.graphics.Path r0 = r8.f29746a
            r0.close()
            android.graphics.Canvas r0 = r8.mBitmapCanvas
            android.graphics.Path r1 = r8.f29746a
            android.graphics.Paint r2 = r8.mRenderPaint
            r0.drawPath(r1, r2)
        L_0x045e:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p378ci.C10446a.drawDataSet(android.graphics.Canvas, com.github.mikephil.charting.interfaces.datasets.IPieDataSet):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0273  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawHighlighted(android.graphics.Canvas r43, com.github.mikephil.charting.highlight.Highlight[] r44) {
        /*
            r42 = this;
            r8 = r42
            r9 = r44
            java.lang.String r0 = "c"
            r1 = r43
            kotlin.jvm.internal.C41536l.m120489i(r1, r0)
            java.lang.String r0 = "indices"
            kotlin.jvm.internal.C41536l.m120489i(r9, r0)
            com.github.mikephil.charting.charts.PieChart r0 = r8.mChart
            java.lang.String r1 = "null cannot be cast to non-null type ge.bog.designsystem.components.drilldown.chart.DrilldownChart"
            kotlin.jvm.internal.C41536l.m120487g(r0, r1)
            r10 = r0
            ge.bog.designsystem.components.drilldown.chart.DrilldownChart r10 = (p341ge.bog.designsystem.components.drilldown.chart.DrilldownChart) r10
            boolean r0 = r10.isDrawHoleEnabled()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r10.isDrawSlicesUnderHoleEnabled()
            if (r0 != 0) goto L_0x0028
            r13 = 1
            goto L_0x0029
        L_0x0028:
            r13 = 0
        L_0x0029:
            com.github.mikephil.charting.animation.ChartAnimator r0 = r8.mAnimator
            float r14 = r0.getPhaseX()
            com.github.mikephil.charting.animation.ChartAnimator r0 = r8.mAnimator
            float r15 = r0.getPhaseY()
            float r16 = r10.getRotationAngle()
            float[] r7 = r10.getPercentDrawAngles()
            float[] r17 = r10.getPercentAbsoluteAngles()
            com.github.mikephil.charting.utils.MPPointF r6 = r10.getCenterCircleBox()
            float r18 = r10.getRadius()
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r4 = 0
            if (r13 == 0) goto L_0x005d
            float r0 = r10.getHoleRadius()
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            float r0 = r0 * r18
            r19 = r0
            goto L_0x005f
        L_0x005d:
            r19 = r4
        L_0x005f:
            android.graphics.RectF r3 = r8.mDrawHighlightedRectF
            r3.set(r4, r4, r4, r4)
            int r2 = r9.length
            r1 = 0
        L_0x0066:
            if (r1 >= r2) goto L_0x0335
            r0 = r9[r1]
            float r0 = r0.getX()
            int r0 = (int) r0
            int r11 = r7.length
            if (r0 < r11) goto L_0x0085
            r11 = r1
            r20 = r2
            r23 = r4
            r9 = r6
            r25 = r7
            r35 = r10
            r37 = r13
            r24 = r14
            r0 = 1
        L_0x0081:
            r14 = r3
            r10 = r5
            goto L_0x0320
        L_0x0085:
            com.github.mikephil.charting.data.ChartData r11 = r10.getData()
            com.github.mikephil.charting.data.PieData r11 = (com.github.mikephil.charting.data.PieData) r11
            r20 = r9[r1]
            int r4 = r20.getDataSetIndex()
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r4 = r11.getDataSetByIndex((int) r4)
            if (r4 == 0) goto L_0x030f
            boolean r11 = r4.isHighlightEnabled()
            if (r11 != 0) goto L_0x009f
            goto L_0x030f
        L_0x009f:
            int r11 = r4.getEntryCount()
            r9 = 0
            r12 = 0
        L_0x00a5:
            if (r12 >= r11) goto L_0x00c0
            com.github.mikephil.charting.data.Entry r22 = r4.getEntryForIndex(r12)
            com.github.mikephil.charting.data.PieEntry r22 = (com.github.mikephil.charting.data.PieEntry) r22
            float r22 = r22.getY()
            float r22 = java.lang.Math.abs(r22)
            float r23 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON
            int r22 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r22 <= 0) goto L_0x00bd
            int r9 = r9 + 1
        L_0x00bd:
            int r12 = r12 + 1
            goto L_0x00a5
        L_0x00c0:
            if (r0 != 0) goto L_0x00c4
            r11 = 0
            goto L_0x00c9
        L_0x00c4:
            int r11 = r0 + -1
            r11 = r17[r11]
            float r11 = r11 * r14
        L_0x00c9:
            r12 = 1
            if (r9 > r12) goto L_0x00ce
            r12 = 0
            goto L_0x00d2
        L_0x00ce:
            float r12 = r4.getSliceSpace()
        L_0x00d2:
            r22 = r7[r0]
            r23 = r1
            float r1 = r4.getSelectionShift()
            r24 = r14
            float r14 = r19 - r1
            r25 = r2
            float r2 = r18 + r1
            r26 = r7
            android.graphics.RectF r7 = r10.getCircleBox()
            r3.set(r7)
            float r1 = -r1
            r3.inset(r1, r1)
            float r1 = r2 - r14
            r27 = 1073741824(0x40000000, float:2.0)
            float r28 = r1 / r27
            r1 = 0
            int r7 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            r1 = 1127481344(0x43340000, float:180.0)
            if (r7 <= 0) goto L_0x0103
            int r7 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r7 > 0) goto L_0x0103
            r29 = 1
            goto L_0x0105
        L_0x0103:
            r29 = 0
        L_0x0105:
            android.graphics.Paint r7 = r8.mRenderPaint
            int r0 = r4.getColor(r0)
            r7.setColor(r0)
            r30 = 1016003125(0x3c8efa35, float:0.017453292)
            r0 = 1
            if (r9 != r0) goto L_0x0116
            r4 = 0
            goto L_0x011a
        L_0x0116:
            float r4 = r18 * r30
            float r4 = r12 / r4
        L_0x011a:
            if (r9 != r0) goto L_0x011e
            r0 = 0
            goto L_0x0122
        L_0x011e:
            float r0 = r2 * r30
            float r0 = r12 / r0
        L_0x0122:
            float r7 = r4 / r27
            float r7 = r7 + r11
            float r7 = r7 * r15
            float r31 = r16 + r7
            float r4 = r22 - r4
            float r4 = r4 * r15
            r7 = 0
            int r21 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r21 >= 0) goto L_0x0133
            r21 = r7
            goto L_0x0135
        L_0x0133:
            r21 = r4
        L_0x0135:
            float r4 = r0 / r27
            float r4 = r4 + r11
            float r4 = r4 * r15
            float r4 = r16 + r4
            float r0 = r22 - r0
            float r0 = r0 * r15
            int r32 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r32 >= 0) goto L_0x0143
            r0 = r7
        L_0x0143:
            android.graphics.Path r7 = r8.f29746a
            r7.reset()
            float r7 = r6.f11822x
            float r33 = r2 - r28
            float r1 = r31 * r30
            r35 = r10
            r36 = r11
            double r10 = (double) r1
            r38 = r12
            r37 = r13
            double r12 = java.lang.Math.cos(r10)
            float r1 = (float) r12
            float r1 = r1 * r33
            float r7 = r7 + r1
            float r1 = r6.f11823y
            double r12 = java.lang.Math.sin(r10)
            float r12 = (float) r12
            float r12 = r12 * r33
            float r1 = r1 + r12
            float r12 = r7 - r28
            float r13 = r1 - r28
            float r7 = r7 + r28
            float r1 = r1 + r28
            r5.set(r12, r13, r7, r1)
            android.graphics.Path r1 = r8.f29746a
            r7 = 180(0xb4, float:2.52E-43)
            float r7 = (float) r7
            float r7 = r31 + r7
            r12 = 1127481344(0x43340000, float:180.0)
            r1.arcTo(r5, r7, r12)
            r13 = 1135869952(0x43b40000, float:360.0)
            int r34 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r34 < 0) goto L_0x019f
            float r1 = r21 % r13
            float r7 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x019f
            android.graphics.Path r0 = r8.f29746a
            float r1 = r6.f11822x
            float r4 = r6.f11823y
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CW
            r0.addCircle(r1, r4, r2, r7)
            r12 = r9
            r40 = r10
            r39 = r14
            goto L_0x01c3
        L_0x019f:
            android.graphics.Path r1 = r8.f29746a
            float r7 = r6.f11822x
            float r12 = r4 * r30
            r39 = r14
            double r13 = (double) r12
            r12 = r9
            r40 = r10
            double r9 = java.lang.Math.cos(r13)
            float r9 = (float) r9
            float r9 = r9 * r2
            float r7 = r7 + r9
            float r9 = r6.f11823y
            double r10 = java.lang.Math.sin(r13)
            float r10 = (float) r10
            float r2 = r2 * r10
            float r9 = r9 + r2
            r1.moveTo(r7, r9)
            android.graphics.Path r1 = r8.f29746a
            r1.arcTo(r3, r4, r0)
        L_0x01c3:
            if (r29 == 0) goto L_0x01fc
            float r4 = r22 * r15
            float r0 = r6.f11822x
            double r1 = java.lang.Math.cos(r40)
            float r1 = (float) r1
            float r1 = r1 * r18
            float r7 = r0 + r1
            float r0 = r6.f11823y
            double r1 = java.lang.Math.sin(r40)
            float r1 = (float) r1
            float r1 = r1 * r18
            float r9 = r0 + r1
            r0 = r42
            r11 = r23
            r10 = 1127481344(0x43340000, float:180.0)
            r1 = r6
            r13 = r25
            r2 = r18
            r14 = r3
            r3 = r4
            r23 = 0
            r4 = r7
            r7 = r5
            r5 = r9
            r9 = r6
            r6 = r31
            r10 = r7
            r25 = r26
            r7 = r21
            float r4 = r0.calculateMinimumRadiusForSpacedSlice(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0209
        L_0x01fc:
            r14 = r3
            r10 = r5
            r9 = r6
            r11 = r23
            r13 = r25
            r25 = r26
            r23 = 0
            r4 = r23
        L_0x0209:
            android.graphics.RectF r0 = r8.f29747b
            float r1 = r9.f11822x
            float r2 = r1 - r39
            float r3 = r9.f11823y
            float r5 = r3 - r39
            float r1 = r1 + r39
            float r3 = r3 + r39
            r0.set(r2, r5, r1, r3)
            if (r37 == 0) goto L_0x0298
            int r0 = (r39 > r23 ? 1 : (r39 == r23 ? 0 : -1))
            if (r0 > 0) goto L_0x0222
            if (r29 == 0) goto L_0x0298
        L_0x0222:
            if (r29 == 0) goto L_0x0230
            int r0 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x0229
            float r4 = -r4
        L_0x0229:
            r0 = r39
            float r0 = java.lang.Math.max(r0, r4)
            goto L_0x0232
        L_0x0230:
            r0 = r39
        L_0x0232:
            r1 = r0
            r0 = 1
            if (r12 == r0) goto L_0x0245
            int r2 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x023c
            r12 = r0
            goto L_0x023d
        L_0x023c:
            r12 = 0
        L_0x023d:
            if (r12 == 0) goto L_0x0240
            goto L_0x0245
        L_0x0240:
            float r2 = r1 * r30
            float r4 = r38 / r2
            goto L_0x0247
        L_0x0245:
            r4 = r23
        L_0x0247:
            float r2 = r4 / r27
            float r2 = r36 + r2
            float r2 = r2 * r15
            float r2 = r16 + r2
            float r22 = r22 - r4
            float r4 = r22 * r15
            int r3 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r3 >= 0) goto L_0x0258
            r4 = r23
        L_0x0258:
            float r2 = r2 + r4
            if (r34 < 0) goto L_0x0273
            r3 = 1135869952(0x43b40000, float:360.0)
            float r3 = r21 % r3
            float r5 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0273
            android.graphics.Path r2 = r8.f29746a
            float r3 = r9.f11822x
            float r4 = r9.f11823y
            android.graphics.Path$Direction r5 = android.graphics.Path.Direction.CCW
            r2.addCircle(r3, r4, r1, r5)
            r20 = r13
            goto L_0x02cf
        L_0x0273:
            android.graphics.Path r3 = r8.f29746a
            float r5 = r9.f11822x
            float r6 = r2 * r30
            double r6 = (double) r6
            r20 = r13
            double r12 = java.lang.Math.cos(r6)
            float r12 = (float) r12
            float r12 = r12 * r1
            float r5 = r5 + r12
            float r12 = r9.f11823y
            double r6 = java.lang.Math.sin(r6)
            float r6 = (float) r6
            float r1 = r1 * r6
            float r12 = r12 + r1
            r3.lineTo(r5, r12)
            android.graphics.Path r1 = r8.f29746a
            android.graphics.RectF r3 = r8.f29747b
            float r4 = -r4
            r1.arcTo(r3, r2, r4)
            goto L_0x02cf
        L_0x0298:
            r20 = r13
            r0 = 1
            r1 = 1135869952(0x43b40000, float:360.0)
            float r1 = r21 % r1
            float r2 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x02cf
            if (r29 == 0) goto L_0x02c6
            float r1 = r21 / r27
            float r1 = r31 + r1
            float r2 = r9.f11822x
            float r1 = r1 * r30
            double r5 = (double) r1
            double r12 = java.lang.Math.cos(r5)
            float r1 = (float) r12
            float r1 = r1 * r4
            float r2 = r2 + r1
            float r1 = r9.f11823y
            double r5 = java.lang.Math.sin(r5)
            float r3 = (float) r5
            float r4 = r4 * r3
            float r1 = r1 + r4
            android.graphics.Path r3 = r8.f29746a
            r3.lineTo(r2, r1)
            goto L_0x02cf
        L_0x02c6:
            android.graphics.Path r1 = r8.f29746a
            float r2 = r9.f11822x
            float r3 = r9.f11823y
            r1.lineTo(r2, r3)
        L_0x02cf:
            float r1 = r31 + r21
            float r2 = r9.f11822x
            float r3 = r1 * r30
            double r3 = (double) r3
            double r5 = java.lang.Math.cos(r3)
            float r5 = (float) r5
            float r5 = r5 * r33
            float r2 = r2 + r5
            float r5 = r9.f11823y
            double r3 = java.lang.Math.sin(r3)
            float r3 = (float) r3
            float r33 = r33 * r3
            float r5 = r5 + r33
            android.graphics.Path r3 = r8.f29746a
            r3.moveTo(r2, r5)
            float r3 = r2 - r28
            float r4 = r5 - r28
            float r2 = r2 + r28
            float r5 = r5 + r28
            r10.set(r3, r4, r2, r5)
            android.graphics.Path r2 = r8.f29746a
            r3 = 1127481344(0x43340000, float:180.0)
            r2.arcTo(r10, r1, r3)
            android.graphics.Path r1 = r8.f29746a
            r1.close()
            android.graphics.Canvas r1 = r8.mBitmapCanvas
            android.graphics.Path r2 = r8.f29746a
            android.graphics.Paint r3 = r8.mRenderPaint
            r1.drawPath(r2, r3)
            goto L_0x0320
        L_0x030f:
            r11 = r1
            r20 = r2
            r9 = r6
            r25 = r7
            r35 = r10
            r37 = r13
            r24 = r14
            r0 = 1
            r23 = 0
            goto L_0x0081
        L_0x0320:
            int r1 = r11 + 1
            r6 = r9
            r5 = r10
            r3 = r14
            r2 = r20
            r4 = r23
            r14 = r24
            r7 = r25
            r10 = r35
            r13 = r37
            r9 = r44
            goto L_0x0066
        L_0x0335:
            r9 = r6
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p378ci.C10446a.drawHighlighted(android.graphics.Canvas, com.github.mikephil.charting.highlight.Highlight[]):void");
    }
}

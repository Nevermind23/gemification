package com.github.mikephil.charting.charts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.PieRadarChartTouchListener;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;

public abstract class PieRadarChartBase<T extends ChartData<? extends IDataSet<? extends Entry>>> extends Chart<T> {
    protected float mMinOffset = Utils.FLOAT_EPSILON;
    private float mRawRotationAngle = 270.0f;
    protected boolean mRotateEnabled = true;
    private float mRotationAngle = 270.0f;

    /* renamed from: com.github.mikephil.charting.charts.PieRadarChartBase$2 */
    static /* synthetic */ class C37662 {

        /* renamed from: $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment */
        static final /* synthetic */ int[] f11798x2787f53e;

        /* renamed from: $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation */
        static final /* synthetic */ int[] f11799x9c9dbef;

        /* renamed from: $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment */
        static final /* synthetic */ int[] f11800xc926f1ec;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(2:13|14)|15|17|18|19|20|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        static {
            /*
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11799x9c9dbef = r0
                r1 = 1
                com.github.mikephil.charting.components.Legend$LegendOrientation r2 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f11799x9c9dbef     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.components.Legend$LegendOrientation r3 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f11798x2787f53e = r2
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f11798x2787f53e     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = f11798x2787f53e     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f11800xc926f1ec = r2
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = f11800xc926f1ec     // Catch:{ NoSuchFieldError -> 0x005e }
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM     // Catch:{ NoSuchFieldError -> 0x005e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.charts.PieRadarChartBase.C37662.<clinit>():void");
        }
    }

    public PieRadarChartBase(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void calcMinMax() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007b, code lost:
        if (r2 != 2) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void calculateOffsets() {
        /*
            r11 = this;
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            r1 = 0
            if (r0 == 0) goto L_0x0196
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0196
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            boolean r0 = r0.isDrawInsideEnabled()
            if (r0 != 0) goto L_0x0196
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            float r0 = r0.mNeededWidth
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r11.mViewPortHandler
            float r2 = r2.getChartWidth()
            com.github.mikephil.charting.components.Legend r3 = r11.mLegend
            float r3 = r3.getMaxSizePercent()
            float r2 = r2 * r3
            float r0 = java.lang.Math.min(r0, r2)
            int[] r2 = com.github.mikephil.charting.charts.PieRadarChartBase.C37662.f11799x9c9dbef
            com.github.mikephil.charting.components.Legend r3 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendOrientation r3 = r3.getOrientation()
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L_0x008c
            if (r2 == r3) goto L_0x003d
            goto L_0x007d
        L_0x003d:
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r0 = r0.getVerticalAlignment()
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP
            if (r0 == r2) goto L_0x0051
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r0 = r0.getVerticalAlignment()
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM
            if (r0 != r2) goto L_0x007d
        L_0x0051:
            float r0 = r11.getRequiredLegendOffset()
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            float r2 = r2.mNeededHeight
            float r2 = r2 + r0
            com.github.mikephil.charting.utils.ViewPortHandler r0 = r11.mViewPortHandler
            float r0 = r0.getChartHeight()
            com.github.mikephil.charting.components.Legend r5 = r11.mLegend
            float r5 = r5.getMaxSizePercent()
            float r0 = r0 * r5
            float r0 = java.lang.Math.min(r2, r0)
            int[] r2 = com.github.mikephil.charting.charts.PieRadarChartBase.C37662.f11800xc926f1ec
            com.github.mikephil.charting.components.Legend r5 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r5 = r5.getVerticalAlignment()
            int r5 = r5.ordinal()
            r2 = r2[r5]
            if (r2 == r4) goto L_0x0087
            if (r2 == r3) goto L_0x0082
        L_0x007d:
            r0 = r1
            r2 = r0
        L_0x007f:
            r3 = r2
            goto L_0x0181
        L_0x0082:
            r2 = r0
            r0 = r1
            r3 = r0
            goto L_0x0181
        L_0x0087:
            r3 = r0
            r0 = r1
            r2 = r0
            goto L_0x0181
        L_0x008c:
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r2 = r2.getHorizontalAlignment()
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r5 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT
            if (r2 == r5) goto L_0x00a4
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r2 = r2.getHorizontalAlignment()
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r5 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT
            if (r2 != r5) goto L_0x00a1
            goto L_0x00a4
        L_0x00a1:
            r0 = r1
            goto L_0x0122
        L_0x00a4:
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = r2.getVerticalAlignment()
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r5 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER
            if (r2 != r5) goto L_0x00b6
            r2 = 1095761920(0x41500000, float:13.0)
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            float r0 = r0 + r2
            goto L_0x0122
        L_0x00b6:
            r2 = 1090519040(0x41000000, float:8.0)
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            float r0 = r0 + r2
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            float r5 = r2.mNeededHeight
            float r2 = r2.mTextHeightMax
            float r5 = r5 + r2
            com.github.mikephil.charting.utils.MPPointF r2 = r11.getCenter()
            com.github.mikephil.charting.components.Legend r6 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r6 = r6.getHorizontalAlignment()
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r7 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT
            r8 = 1097859072(0x41700000, float:15.0)
            if (r6 != r7) goto L_0x00dc
            int r6 = r11.getWidth()
            float r6 = (float) r6
            float r6 = r6 - r0
            float r6 = r6 + r8
            goto L_0x00de
        L_0x00dc:
            float r6 = r0 - r8
        L_0x00de:
            float r5 = r5 + r8
            float r7 = r11.distanceToCenter(r6, r5)
            float r8 = r11.getRadius()
            float r6 = r11.getAngleForPoint(r6, r5)
            com.github.mikephil.charting.utils.MPPointF r6 = r11.getPosition(r2, r8, r6)
            float r8 = r6.f11822x
            float r9 = r6.f11823y
            float r8 = r11.distanceToCenter(r8, r9)
            r9 = 1084227584(0x40a00000, float:5.0)
            float r9 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r9)
            float r10 = r2.f11823y
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 < 0) goto L_0x0113
            int r5 = r11.getHeight()
            float r5 = (float) r5
            float r5 = r5 - r0
            int r10 = r11.getWidth()
            float r10 = (float) r10
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0113
            goto L_0x011c
        L_0x0113:
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x011b
            float r8 = r8 - r7
            float r9 = r9 + r8
            r0 = r9
            goto L_0x011c
        L_0x011b:
            r0 = r1
        L_0x011c:
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r2)
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r6)
        L_0x0122:
            int[] r2 = com.github.mikephil.charting.charts.PieRadarChartBase.C37662.f11798x2787f53e
            com.github.mikephil.charting.components.Legend r5 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r5 = r5.getHorizontalAlignment()
            int r5 = r5.ordinal()
            r2 = r2[r5]
            if (r2 == r4) goto L_0x017d
            if (r2 == r3) goto L_0x017a
            r0 = 3
            if (r2 == r0) goto L_0x0138
            goto L_0x014a
        L_0x0138:
            int[] r0 = com.github.mikephil.charting.charts.PieRadarChartBase.C37662.f11800xc926f1ec
            com.github.mikephil.charting.components.Legend r2 = r11.mLegend
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = r2.getVerticalAlignment()
            int r2 = r2.ordinal()
            r0 = r0[r2]
            if (r0 == r4) goto L_0x0163
            if (r0 == r3) goto L_0x014c
        L_0x014a:
            goto L_0x007d
        L_0x014c:
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            float r0 = r0.mNeededHeight
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r11.mViewPortHandler
            float r2 = r2.getChartHeight()
            com.github.mikephil.charting.components.Legend r3 = r11.mLegend
            float r3 = r3.getMaxSizePercent()
            float r2 = r2 * r3
            float r0 = java.lang.Math.min(r0, r2)
            goto L_0x0082
        L_0x0163:
            com.github.mikephil.charting.components.Legend r0 = r11.mLegend
            float r0 = r0.mNeededHeight
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r11.mViewPortHandler
            float r2 = r2.getChartHeight()
            com.github.mikephil.charting.components.Legend r3 = r11.mLegend
            float r3 = r3.getMaxSizePercent()
            float r2 = r2 * r3
            float r0 = java.lang.Math.min(r0, r2)
            goto L_0x0087
        L_0x017a:
            r2 = r1
            goto L_0x007f
        L_0x017d:
            r2 = r1
            r3 = r2
            r1 = r0
            r0 = r3
        L_0x0181:
            float r4 = r11.getRequiredBaseOffset()
            float r1 = r1 + r4
            float r4 = r11.getRequiredBaseOffset()
            float r0 = r0 + r4
            float r4 = r11.getRequiredBaseOffset()
            float r3 = r3 + r4
            float r4 = r11.getRequiredBaseOffset()
            float r2 = r2 + r4
            goto L_0x0199
        L_0x0196:
            r0 = r1
            r2 = r0
            r3 = r2
        L_0x0199:
            float r4 = r11.mMinOffset
            float r4 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r4)
            boolean r5 = r11 instanceof com.github.mikephil.charting.charts.RadarChart
            if (r5 == 0) goto L_0x01ba
            com.github.mikephil.charting.components.XAxis r5 = r11.getXAxis()
            boolean r6 = r5.isEnabled()
            if (r6 == 0) goto L_0x01ba
            boolean r6 = r5.isDrawLabelsEnabled()
            if (r6 == 0) goto L_0x01ba
            int r5 = r5.mLabelRotatedWidth
            float r5 = (float) r5
            float r4 = java.lang.Math.max(r4, r5)
        L_0x01ba:
            float r5 = r11.getExtraTopOffset()
            float r3 = r3 + r5
            float r5 = r11.getExtraRightOffset()
            float r0 = r0 + r5
            float r5 = r11.getExtraBottomOffset()
            float r2 = r2 + r5
            float r5 = r11.getExtraLeftOffset()
            float r1 = r1 + r5
            float r1 = java.lang.Math.max(r4, r1)
            float r3 = java.lang.Math.max(r4, r3)
            float r0 = java.lang.Math.max(r4, r0)
            float r5 = r11.getRequiredBaseOffset()
            float r2 = java.lang.Math.max(r5, r2)
            float r2 = java.lang.Math.max(r4, r2)
            com.github.mikephil.charting.utils.ViewPortHandler r4 = r11.mViewPortHandler
            r4.restrainViewPort(r1, r3, r0, r2)
            boolean r4 = r11.mLogEnabled
            if (r4 == 0) goto L_0x021d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "offsetLeft: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = ", offsetTop: "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = ", offsetRight: "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = ", offsetBottom: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "MPAndroidChart"
            android.util.Log.i(r1, r0)
        L_0x021d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.charts.PieRadarChartBase.calculateOffsets():void");
    }

    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener instanceof PieRadarChartTouchListener) {
            ((PieRadarChartTouchListener) chartTouchListener).computeScroll();
        }
    }

    public float distanceToCenter(float f, float f2) {
        float f3;
        float f4;
        MPPointF centerOffsets = getCenterOffsets();
        float f5 = centerOffsets.f11822x;
        if (f > f5) {
            f3 = f - f5;
        } else {
            f3 = f5 - f;
        }
        float f6 = centerOffsets.f11823y;
        if (f2 > f6) {
            f4 = f2 - f6;
        } else {
            f4 = f6 - f2;
        }
        float sqrt = (float) Math.sqrt(Math.pow((double) f3, 2.0d) + Math.pow((double) f4, 2.0d));
        MPPointF.recycleInstance(centerOffsets);
        return sqrt;
    }

    public float getAngleForPoint(float f, float f2) {
        MPPointF centerOffsets = getCenterOffsets();
        double d = (double) (f - centerOffsets.f11822x);
        double d2 = (double) (f2 - centerOffsets.f11823y);
        float degrees = (float) Math.toDegrees(Math.acos(d2 / Math.sqrt((d * d) + (d2 * d2))));
        if (f > centerOffsets.f11822x) {
            degrees = 360.0f - degrees;
        }
        float f3 = degrees + 90.0f;
        if (f3 > 360.0f) {
            f3 -= 360.0f;
        }
        MPPointF.recycleInstance(centerOffsets);
        return f3;
    }

    public float getDiameter() {
        RectF contentRect = this.mViewPortHandler.getContentRect();
        contentRect.left += getExtraLeftOffset();
        contentRect.top += getExtraTopOffset();
        contentRect.right -= getExtraRightOffset();
        contentRect.bottom -= getExtraBottomOffset();
        return Math.min(contentRect.width(), contentRect.height());
    }

    public abstract int getIndexForAngle(float f);

    public int getMaxVisibleCount() {
        return this.mData.getEntryCount();
    }

    public float getMinOffset() {
        return this.mMinOffset;
    }

    public MPPointF getPosition(MPPointF mPPointF, float f, float f2) {
        MPPointF instance = MPPointF.getInstance(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        getPosition(mPPointF, f, f2, instance);
        return instance;
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.mRawRotationAngle;
    }

    /* access modifiers changed from: protected */
    public abstract float getRequiredBaseOffset();

    /* access modifiers changed from: protected */
    public abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
        return this.mRotationAngle;
    }

    public float getYChartMax() {
        return Utils.FLOAT_EPSILON;
    }

    public float getYChartMin() {
        return Utils.FLOAT_EPSILON;
    }

    /* access modifiers changed from: protected */
    public void init() {
        super.init();
        this.mChartTouchListener = new PieRadarChartTouchListener(this);
    }

    public boolean isRotationEnabled() {
        return this.mRotateEnabled;
    }

    public void notifyDataSetChanged() {
        if (this.mData != null) {
            calcMinMax();
            if (this.mLegend != null) {
                this.mLegendRenderer.computeLegend(this.mData);
            }
            calculateOffsets();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChartTouchListener chartTouchListener;
        if (!this.mTouchEnabled || (chartTouchListener = this.mChartTouchListener) == null) {
            return super.onTouchEvent(motionEvent);
        }
        return chartTouchListener.onTouch(this, motionEvent);
    }

    public void setMinOffset(float f) {
        this.mMinOffset = f;
    }

    public void setRotationAngle(float f) {
        this.mRawRotationAngle = f;
        this.mRotationAngle = Utils.getNormalizedAngle(f);
    }

    public void setRotationEnabled(boolean z) {
        this.mRotateEnabled = z;
    }

    @SuppressLint({"NewApi"})
    public void spin(int i, float f, float f2, Easing.EasingFunction easingFunction) {
        setRotationAngle(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rotationAngle", new float[]{f, f2});
        ofFloat.setDuration((long) i);
        ofFloat.setInterpolator(easingFunction);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PieRadarChartBase.this.postInvalidate();
            }
        });
        ofFloat.start();
    }

    public void getPosition(MPPointF mPPointF, float f, float f2, MPPointF mPPointF2) {
        double d = (double) f;
        double d2 = (double) f2;
        mPPointF2.f11822x = (float) (((double) mPPointF.f11822x) + (Math.cos(Math.toRadians(d2)) * d));
        mPPointF2.f11823y = (float) (((double) mPPointF.f11823y) + (d * Math.sin(Math.toRadians(d2))));
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

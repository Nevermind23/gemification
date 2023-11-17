package c40;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.core.content.res.C0808h;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import p366bk.C10318g;

/* renamed from: c40.a */
public class C19472a extends DataRenderer {

    /* renamed from: a */
    protected PieChart f53722a;

    /* renamed from: b */
    protected Paint f53723b;

    /* renamed from: c */
    protected Paint f53724c;

    /* renamed from: d */
    protected Paint f53725d;

    /* renamed from: e */
    private TextPaint f53726e;

    /* renamed from: f */
    private Paint f53727f;

    /* renamed from: g */
    private StaticLayout f53728g;

    /* renamed from: h */
    private CharSequence f53729h;

    /* renamed from: i */
    private RectF f53730i = new RectF();

    /* renamed from: j */
    private RectF[] f53731j = {new RectF(), new RectF(), new RectF()};

    /* renamed from: k */
    protected WeakReference f53732k;

    /* renamed from: l */
    protected Canvas f53733l;

    /* renamed from: m */
    private int f53734m = -1;

    /* renamed from: n */
    private Path f53735n = new Path();

    /* renamed from: o */
    private RectF f53736o = new RectF();

    /* renamed from: p */
    private Path f53737p = new Path();

    /* renamed from: q */
    protected Path f53738q = new Path();

    /* renamed from: r */
    protected RectF f53739r = new RectF();

    public C19472a(PieChart pieChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.f53722a = pieChart;
        Paint paint = new Paint(1);
        this.f53723b = paint;
        paint.setColor(C0808h.m3029d(this.f53722a.getResources(), C10318g.f28625J0, (Resources.Theme) null));
        this.f53723b.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f53724c = paint2;
        paint2.setColor(-1);
        this.f53724c.setStyle(Paint.Style.FILL);
        this.f53724c.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.f53726e = textPaint;
        textPaint.setColor(-16777216);
        this.f53726e.setTextSize(Utils.convertDpToPixel(12.0f));
        this.mValuePaint.setTextSize(Utils.convertDpToPixel(13.0f));
        this.mValuePaint.setColor(-1);
        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint(1);
        this.f53727f = paint3;
        paint3.setColor(-1);
        this.f53727f.setTextAlign(Paint.Align.CENTER);
        this.f53727f.setTextSize(Utils.convertDpToPixel(13.0f));
        Paint paint4 = new Paint(1);
        this.f53725d = paint4;
        paint4.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public void mo47702a(int i) {
        this.f53734m = i;
    }

    /* access modifiers changed from: protected */
    public float calculateMinimumRadiusForSpacedSlice(MPPointF mPPointF, float f, float f2, float f3, float f4, float f5, float f6) {
        MPPointF mPPointF2 = mPPointF;
        double d = (double) ((f5 + f6) * 0.017453292f);
        float cos = mPPointF2.f11822x + (((float) Math.cos(d)) * f);
        float sin = mPPointF2.f11823y + (((float) Math.sin(d)) * f);
        double d2 = (double) ((f5 + (f6 / 2.0f)) * 0.017453292f);
        return (float) (((double) (f - ((float) ((Math.sqrt(Math.pow((double) (cos - f3), 2.0d) + Math.pow((double) (sin - f4), 2.0d)) / 2.0d) * Math.tan(((180.0d - ((double) f2)) / 2.0d) * 0.017453292519943295d))))) - Math.sqrt(Math.pow((double) ((mPPointF2.f11822x + (((float) Math.cos(d2)) * f)) - ((cos + f3) / 2.0f)), 2.0d) + Math.pow((double) ((mPPointF2.f11823y + (((float) Math.sin(d2)) * f)) - ((sin + f4) / 2.0f)), 2.0d)));
    }

    /* access modifiers changed from: protected */
    public void drawCenterText(Canvas canvas) {
        float f;
        MPPointF mPPointF;
        Canvas canvas2 = canvas;
        CharSequence centerText = this.f53722a.getCenterText();
        if (this.f53722a.isDrawCenterTextEnabled() && centerText != null) {
            MPPointF centerCircleBox = this.f53722a.getCenterCircleBox();
            MPPointF centerTextOffset = this.f53722a.getCenterTextOffset();
            float f2 = centerCircleBox.f11822x + centerTextOffset.f11822x;
            float f3 = centerCircleBox.f11823y + centerTextOffset.f11823y;
            if (!this.f53722a.isDrawHoleEnabled() || this.f53722a.isDrawSlicesUnderHoleEnabled()) {
                f = this.f53722a.getRadius();
            } else {
                f = this.f53722a.getRadius() * (this.f53722a.getHoleRadius() / 100.0f);
            }
            RectF[] rectFArr = this.f53731j;
            RectF rectF = rectFArr[0];
            rectF.left = (f2 - f) + 20.0f;
            rectF.top = (f3 - f) + 20.0f;
            rectF.right = (f2 + f) - 20.0f;
            rectF.bottom = (f3 + f) - 20.0f;
            RectF rectF2 = rectFArr[1];
            rectF2.set(rectF);
            float centerTextRadiusPercent = this.f53722a.getCenterTextRadiusPercent() / 100.0f;
            if (((double) centerTextRadiusPercent) > Utils.DOUBLE_EPSILON) {
                rectF2.inset((rectF2.width() - (rectF2.width() * centerTextRadiusPercent)) / 2.0f, (rectF2.height() - (rectF2.height() * centerTextRadiusPercent)) / 2.0f);
            }
            if (!centerText.equals(this.f53729h) || !rectF2.equals(this.f53730i)) {
                this.f53730i.set(rectF2);
                this.f53729h = centerText;
                mPPointF = centerTextOffset;
                StaticLayout staticLayout = r3;
                StaticLayout staticLayout2 = new StaticLayout(centerText, 0, centerText.length(), this.f53726e, (int) Math.max(Math.ceil((double) this.f53730i.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, Utils.FLOAT_EPSILON, false);
                this.f53728g = staticLayout;
            } else {
                mPPointF = centerTextOffset;
            }
            canvas.save();
            Path path = this.f53738q;
            path.reset();
            path.addOval(rectF, Path.Direction.CW);
            canvas2.clipPath(path);
            canvas2.translate(rectF2.left, rectF2.top + ((rectF2.height() - ((float) this.f53728g.getHeight())) / 2.0f));
            this.f53728g.draw(canvas2);
            canvas.restore();
            MPPointF.recycleInstance(centerCircleBox);
            MPPointF.recycleInstance(mPPointF);
        }
    }

    public void drawData(Canvas canvas) {
        Bitmap bitmap;
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference weakReference = this.f53732k;
        if (weakReference == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) weakReference.get();
        }
        if (!(bitmap != null && bitmap.getWidth() == chartWidth && bitmap.getHeight() == chartHeight)) {
            if (chartWidth > 0 && chartHeight > 0) {
                bitmap = Bitmap.createBitmap(chartWidth, chartHeight, Bitmap.Config.ARGB_4444);
                this.f53732k = new WeakReference(bitmap);
                this.f53733l = new Canvas(bitmap);
            } else {
                return;
            }
        }
        bitmap.eraseColor(0);
        for (IPieDataSet iPieDataSet : ((PieData) this.f53722a.getData()).getDataSets()) {
            if (iPieDataSet.isVisible() && iPieDataSet.getEntryCount() > 0) {
                drawDataSet(canvas, iPieDataSet);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawDataSet(Canvas canvas, IPieDataSet iPieDataSet) {
        int i;
        RectF rectF;
        float f;
        float f2;
        int i2;
        float[] fArr;
        int i3;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        RectF rectF2;
        RectF rectF3;
        float f8;
        int i4;
        float f9;
        float f12;
        IPieDataSet iPieDataSet2 = iPieDataSet;
        float rotationAngle = this.f53722a.getRotationAngle();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        RectF circleBox = this.f53722a.getCircleBox();
        int entryCount = iPieDataSet.getEntryCount();
        float[] drawAngles = this.f53722a.getDrawAngles();
        MPPointF centerCircleBox = this.f53722a.getCenterCircleBox();
        float radius = this.f53722a.getRadius();
        boolean z = this.f53722a.isDrawHoleEnabled() && !this.f53722a.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z ? (this.f53722a.getHoleRadius() / 100.0f) * radius : Utils.FLOAT_EPSILON;
        float holeRadius2 = (radius - ((this.f53722a.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        RectF rectF4 = new RectF();
        boolean z2 = z && this.f53722a.isDrawRoundedSlicesEnabled();
        boolean z3 = z;
        int i5 = 0;
        for (int i6 = 0; i6 < entryCount; i6++) {
            if (Math.abs(((PieEntry) iPieDataSet2.getEntryForIndex(i6)).getY()) > Utils.FLOAT_EPSILON) {
                i5++;
            }
        }
        int i7 = 0;
        float f13 = Utils.FLOAT_EPSILON;
        while (i7 < entryCount) {
            float f14 = drawAngles[i7];
            float abs = Math.abs(iPieDataSet2.getEntryForIndex(i7).getY());
            float f15 = Utils.FLOAT_EPSILON;
            if (abs <= f15) {
                f13 += f14 * phaseX;
                f2 = rotationAngle;
                f = phaseX;
                rectF = circleBox;
                i = entryCount;
            } else {
                i = entryCount;
                if (!this.f53722a.needsHighlight(i7) || z2) {
                    fArr = drawAngles;
                    this.mRenderPaint.setColor(iPieDataSet2.getColor(i7));
                    if (i5 == 1) {
                        f7 = Utils.FLOAT_EPSILON;
                        f6 = 2.0f;
                        f5 = Utils.FLOAT_EPSILON;
                    } else {
                        f5 = Utils.FLOAT_EPSILON;
                        f7 = Utils.FLOAT_EPSILON / (radius * 0.017453292f);
                        f6 = 2.0f;
                    }
                    float f16 = rotationAngle + ((f13 + (f7 / f6)) * phaseY);
                    float f17 = (f14 - f7) * phaseY;
                    if (f17 < f5) {
                        f17 = Utils.FLOAT_EPSILON;
                    }
                    this.f53735n.reset();
                    if (z2) {
                        float f18 = radius - holeRadius2;
                        i2 = i7;
                        f9 = rotationAngle;
                        f12 = phaseX;
                        double d = (double) (f16 * 0.017453292f);
                        f3 = phaseY;
                        rectF2 = circleBox;
                        float cos = centerCircleBox.f11822x + (((float) Math.cos(d)) * f18);
                        float sin = centerCircleBox.f11823y + (f18 * ((float) Math.sin(d)));
                        rectF4.set(cos - holeRadius2, sin - holeRadius2, cos + holeRadius2, sin + holeRadius2);
                    } else {
                        f9 = rotationAngle;
                        f12 = phaseX;
                        rectF2 = circleBox;
                        i2 = i7;
                        f3 = phaseY;
                    }
                    float f19 = centerCircleBox.f11822x;
                    double d2 = (double) (f16 * 0.017453292f);
                    Math.cos(d2);
                    Math.sin(d2);
                    int i8 = (f17 > 360.0f ? 1 : (f17 == 360.0f ? 0 : -1));
                    if (i8 < 0 || f17 % 360.0f > f15) {
                        if (z2) {
                            this.f53735n.arcTo(rectF4, f16 + 180.0f, -180.0f);
                        }
                        rectF3 = rectF2;
                        this.f53735n.arcTo(rectF3, f16, f17);
                    } else {
                        this.f53735n.addCircle(centerCircleBox.f11822x, centerCircleBox.f11823y, radius, Path.Direction.CW);
                        rectF3 = rectF2;
                    }
                    RectF rectF5 = this.f53736o;
                    float f22 = centerCircleBox.f11822x;
                    float f23 = centerCircleBox.f11823y;
                    rectF = rectF3;
                    rectF5.set(f22 - holeRadius, f23 - holeRadius, f22 + holeRadius, f23 + holeRadius);
                    if (!z3) {
                        f8 = radius;
                        i4 = i5;
                    } else if (holeRadius <= Utils.FLOAT_EPSILON) {
                        f8 = radius;
                        i4 = i5;
                    } else {
                        float f24 = (i5 == 1 || holeRadius == Utils.FLOAT_EPSILON) ? 0.0f : Utils.FLOAT_EPSILON / (holeRadius * 0.017453292f);
                        float f25 = f2 + ((f13 + (f24 / 2.0f)) * f3);
                        float f26 = (f14 - f24) * f3;
                        if (f26 < Utils.FLOAT_EPSILON) {
                            f26 = 0.0f;
                        }
                        float f27 = f25 + f26;
                        if (i8 < 0 || f17 % 360.0f > f15) {
                            if (z2) {
                                float f28 = radius - holeRadius2;
                                double d3 = (double) (0.017453292f * f27);
                                float cos2 = centerCircleBox.f11822x + (((float) Math.cos(d3)) * f28);
                                float sin2 = centerCircleBox.f11823y + (f28 * ((float) Math.sin(d3)));
                                rectF4.set(cos2 - holeRadius2, sin2 - holeRadius2, cos2 + holeRadius2, sin2 + holeRadius2);
                                f27 = f27;
                                this.f53735n.arcTo(rectF4, f27, 180.0f);
                                f4 = radius;
                                i3 = i5;
                            } else {
                                double d4 = (double) (0.017453292f * f27);
                                f4 = radius;
                                i3 = i5;
                                this.f53735n.lineTo(centerCircleBox.f11822x + (((float) Math.cos(d4)) * holeRadius), centerCircleBox.f11823y + (((float) Math.sin(d4)) * holeRadius));
                            }
                            this.f53735n.arcTo(this.f53736o, f27, -f26);
                            this.f53735n.close();
                            this.f53733l.drawPath(this.f53735n, this.mRenderPaint);
                            f13 += f14 * f;
                            entryCount = i;
                            radius = f4;
                            phaseY = f3;
                            i5 = i3;
                            drawAngles = fArr;
                            rotationAngle = f2;
                            phaseX = f;
                            circleBox = rectF;
                            i7 = i2 + 1;
                            iPieDataSet2 = iPieDataSet;
                        } else {
                            this.f53735n.addCircle(centerCircleBox.f11822x, centerCircleBox.f11823y, holeRadius, Path.Direction.CCW);
                            f4 = radius;
                            i3 = i5;
                            this.f53735n.close();
                            this.f53733l.drawPath(this.f53735n, this.mRenderPaint);
                            f13 += f14 * f;
                            entryCount = i;
                            radius = f4;
                            phaseY = f3;
                            i5 = i3;
                            drawAngles = fArr;
                            rotationAngle = f2;
                            phaseX = f;
                            circleBox = rectF;
                            i7 = i2 + 1;
                            iPieDataSet2 = iPieDataSet;
                        }
                    }
                    if (f17 % 360.0f > f15) {
                        this.f53735n.lineTo(centerCircleBox.f11822x, centerCircleBox.f11823y);
                    }
                    this.f53735n.close();
                    this.f53733l.drawPath(this.f53735n, this.mRenderPaint);
                    f13 += f14 * f;
                    entryCount = i;
                    radius = f4;
                    phaseY = f3;
                    i5 = i3;
                    drawAngles = fArr;
                    rotationAngle = f2;
                    phaseX = f;
                    circleBox = rectF;
                    i7 = i2 + 1;
                    iPieDataSet2 = iPieDataSet;
                } else {
                    f13 += f14 * phaseX;
                    f2 = rotationAngle;
                    f = phaseX;
                    rectF = circleBox;
                }
            }
            fArr = drawAngles;
            i3 = i5;
            i2 = i7;
            f3 = phaseY;
            f4 = radius;
            entryCount = i;
            radius = f4;
            phaseY = f3;
            i5 = i3;
            drawAngles = fArr;
            rotationAngle = f2;
            phaseX = f;
            circleBox = rectF;
            i7 = i2 + 1;
            iPieDataSet2 = iPieDataSet;
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    /* access modifiers changed from: protected */
    public void drawEntryLabel(Canvas canvas, String str, float f, float f2) {
        canvas.drawText(str, f, f2, this.f53727f);
    }

    public void drawExtras(Canvas canvas) {
        drawHole(canvas);
        canvas.drawBitmap((Bitmap) this.f53732k.get(), Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (Paint) null);
        drawCenterText(canvas);
    }

    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        float f;
        boolean z;
        float[] fArr;
        MPPointF mPPointF;
        int i;
        RectF rectF;
        IPieDataSet dataSetByIndex;
        float f2;
        float f3;
        float f4;
        int i2;
        int i3;
        float f5;
        Highlight[] highlightArr2 = highlightArr;
        int i4 = 1;
        boolean z2 = this.f53722a.isDrawHoleEnabled() && !this.f53722a.isDrawSlicesUnderHoleEnabled();
        if (!z2 || !this.f53722a.isDrawRoundedSlicesEnabled()) {
            float phaseX = this.mAnimator.getPhaseX();
            float phaseY = this.mAnimator.getPhaseY();
            float rotationAngle = this.f53722a.getRotationAngle();
            float[] drawAngles = this.f53722a.getDrawAngles();
            float[] absoluteAngles = this.f53722a.getAbsoluteAngles();
            MPPointF centerCircleBox = this.f53722a.getCenterCircleBox();
            float radius = this.f53722a.getRadius();
            float holeRadius = z2 ? (this.f53722a.getHoleRadius() / 100.0f) * radius : 0.0f;
            RectF rectF2 = this.f53739r;
            rectF2.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            int i5 = 0;
            while (i5 < highlightArr2.length) {
                int x = (int) highlightArr2[i5].getX();
                if (x < drawAngles.length && (dataSetByIndex = ((PieData) this.f53722a.getData()).getDataSetByIndex(highlightArr2[i5].getDataSetIndex())) != null && dataSetByIndex.isHighlightEnabled()) {
                    int entryCount = dataSetByIndex.getEntryCount();
                    int i6 = 0;
                    for (int i7 = 0; i7 < entryCount; i7++) {
                        if (Math.abs(((PieEntry) dataSetByIndex.getEntryForIndex(i7)).getY()) > Utils.FLOAT_EPSILON) {
                            i6++;
                        }
                    }
                    if (x == 0) {
                        f2 = Utils.FLOAT_EPSILON;
                    } else {
                        f2 = absoluteAngles[x - 1] * phaseX;
                    }
                    if (i6 <= i4) {
                        f3 = Utils.FLOAT_EPSILON;
                    } else {
                        f3 = dataSetByIndex.getSliceSpace();
                    }
                    float f6 = drawAngles[x];
                    float selectionShift = dataSetByIndex.getSelectionShift();
                    float f7 = holeRadius + selectionShift;
                    int i8 = i5;
                    float f8 = radius + selectionShift;
                    float[] fArr2 = drawAngles;
                    rectF2.set(this.f53722a.getCircleBox());
                    float f9 = -selectionShift;
                    rectF2.inset(f9, f9);
                    boolean z3 = f3 > Utils.FLOAT_EPSILON && f6 <= 180.0f;
                    this.mRenderPaint.setColor(dataSetByIndex.getColor(x));
                    float f12 = i6 == 1 ? Utils.FLOAT_EPSILON : f3 / (radius * 0.017453292f);
                    float f13 = i6 == 1 ? Utils.FLOAT_EPSILON : f3 / (f8 * 0.017453292f);
                    float f14 = rotationAngle + (((f12 / 2.0f) + f2) * phaseY);
                    float f15 = (f6 - f12) * phaseY;
                    float f16 = f15 < Utils.FLOAT_EPSILON ? 0.0f : f15;
                    float f17 = (((f13 / 2.0f) + f2) * phaseY) + rotationAngle;
                    float f18 = (f6 - f13) * phaseY;
                    if (f18 < Utils.FLOAT_EPSILON) {
                        f18 = 0.0f;
                    }
                    this.f53735n.reset();
                    int i9 = (f16 > 360.0f ? 1 : (f16 == 360.0f ? 0 : -1));
                    if (i9 < 0 || f16 % 360.0f > Utils.FLOAT_EPSILON) {
                        i2 = i6;
                        f4 = f2;
                        double d = (double) (f17 * 0.017453292f);
                        z = z2;
                        f = phaseX;
                        this.f53735n.moveTo(centerCircleBox.f11822x + (((float) Math.cos(d)) * f8), centerCircleBox.f11823y + (f8 * ((float) Math.sin(d))));
                        this.f53735n.arcTo(rectF2, f17, f18);
                    } else {
                        this.f53735n.addCircle(centerCircleBox.f11822x, centerCircleBox.f11823y, f8, Path.Direction.CW);
                        i2 = i6;
                        f4 = f2;
                        z = z2;
                        f = phaseX;
                    }
                    if (z3) {
                        double d2 = (double) (f14 * 0.017453292f);
                        i = i8;
                        rectF = rectF2;
                        i3 = i2;
                        mPPointF = centerCircleBox;
                        fArr = fArr2;
                        f5 = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f6 * phaseY, (((float) Math.cos(d2)) * radius) + centerCircleBox.f11822x, centerCircleBox.f11823y + (((float) Math.sin(d2)) * radius), f14, f16);
                    } else {
                        rectF = rectF2;
                        mPPointF = centerCircleBox;
                        i = i8;
                        fArr = fArr2;
                        i3 = i2;
                        f5 = Utils.FLOAT_EPSILON;
                    }
                    RectF rectF3 = this.f53736o;
                    float f19 = mPPointF.f11822x;
                    float f22 = mPPointF.f11823y;
                    rectF3.set(f19 - f7, f22 - f7, f19 + f7, f22 + f7);
                    if (z && (f7 > Utils.FLOAT_EPSILON || z3)) {
                        if (z3) {
                            if (f5 < Utils.FLOAT_EPSILON) {
                                f5 = -f5;
                            }
                            f7 = Math.max(f7, f5);
                        }
                        float f23 = (i3 == 1 || f7 == Utils.FLOAT_EPSILON) ? Utils.FLOAT_EPSILON : f3 / (f7 * 0.017453292f);
                        float f24 = ((f4 + (f23 / 2.0f)) * phaseY) + rotationAngle;
                        float f25 = (f6 - f23) * phaseY;
                        if (f25 < Utils.FLOAT_EPSILON) {
                            f25 = 0.0f;
                        }
                        float f26 = f24 + f25;
                        if (i9 < 0 || f16 % 360.0f > Utils.FLOAT_EPSILON) {
                            double d3 = (double) (f26 * 0.017453292f);
                            this.f53735n.lineTo(mPPointF.f11822x + (((float) Math.cos(d3)) * f7), mPPointF.f11823y + (f7 * ((float) Math.sin(d3))));
                            this.f53735n.arcTo(this.f53736o, f26, -f25);
                        } else {
                            this.f53735n.addCircle(mPPointF.f11822x, mPPointF.f11823y, f7, Path.Direction.CCW);
                        }
                    } else if (f16 % 360.0f > Utils.FLOAT_EPSILON) {
                        if (z3) {
                            double d4 = (double) ((f14 + (f16 / 2.0f)) * 0.017453292f);
                            this.f53735n.lineTo(mPPointF.f11822x + (((float) Math.cos(d4)) * f5), mPPointF.f11823y + (f5 * ((float) Math.sin(d4))));
                        } else {
                            this.f53735n.lineTo(mPPointF.f11822x, mPPointF.f11823y);
                        }
                    }
                    this.f53735n.close();
                    this.f53733l.drawPath(this.f53735n, this.mRenderPaint);
                } else {
                    i = i5;
                    rectF = rectF2;
                    fArr = drawAngles;
                    z = z2;
                    f = phaseX;
                    mPPointF = centerCircleBox;
                }
                i5 = i + 1;
                rectF2 = rectF;
                centerCircleBox = mPPointF;
                drawAngles = fArr;
                z2 = z;
                phaseX = f;
                i4 = 1;
                highlightArr2 = highlightArr;
            }
            MPPointF.recycleInstance(centerCircleBox);
        }
    }

    /* access modifiers changed from: protected */
    public void drawHole(Canvas canvas) {
        if (this.f53722a.isDrawHoleEnabled() && this.f53733l != null) {
            float radius = this.f53722a.getRadius();
            float holeRadius = (this.f53722a.getHoleRadius() / 100.0f) * radius;
            MPPointF centerCircleBox = this.f53722a.getCenterCircleBox();
            if (Color.alpha(this.f53723b.getColor()) > 0) {
                this.f53733l.drawCircle(centerCircleBox.f11822x, centerCircleBox.f11823y, holeRadius, this.f53723b);
            }
            if (Color.alpha(this.f53724c.getColor()) > 0 && this.f53722a.getTransparentCircleRadius() > this.f53722a.getHoleRadius()) {
                int alpha = this.f53724c.getAlpha();
                float transparentCircleRadius = radius * (this.f53722a.getTransparentCircleRadius() / 100.0f);
                this.f53724c.setAlpha((int) (((float) alpha) * this.mAnimator.getPhaseX() * this.mAnimator.getPhaseY()));
                this.f53737p.reset();
                this.f53737p.addCircle(centerCircleBox.f11822x, centerCircleBox.f11823y, transparentCircleRadius, Path.Direction.CW);
                this.f53737p.addCircle(centerCircleBox.f11822x, centerCircleBox.f11823y, holeRadius, Path.Direction.CCW);
                this.f53733l.drawPath(this.f53737p, this.f53724c);
                this.f53724c.setAlpha(alpha);
            }
            MPPointF.recycleInstance(centerCircleBox);
        }
    }

    public void drawValue(Canvas canvas, String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawValues(android.graphics.Canvas r55) {
        /*
            r54 = this;
            r6 = r54
            r7 = r55
            com.github.mikephil.charting.charts.PieChart r0 = r6.f53722a
            com.github.mikephil.charting.utils.MPPointF r8 = r0.getCenterCircleBox()
            com.github.mikephil.charting.charts.PieChart r0 = r6.f53722a
            float r9 = r0.getRadius()
            com.github.mikephil.charting.charts.PieChart r0 = r6.f53722a
            float r0 = r0.getRotationAngle()
            com.github.mikephil.charting.charts.PieChart r1 = r6.f53722a
            float[] r10 = r1.getDrawAngles()
            com.github.mikephil.charting.charts.PieChart r1 = r6.f53722a
            float[] r11 = r1.getAbsoluteAngles()
            com.github.mikephil.charting.animation.ChartAnimator r1 = r6.mAnimator
            float r12 = r1.getPhaseX()
            com.github.mikephil.charting.animation.ChartAnimator r1 = r6.mAnimator
            float r13 = r1.getPhaseY()
            com.github.mikephil.charting.charts.PieChart r1 = r6.f53722a
            float r1 = r1.getHoleRadius()
            float r1 = r1 * r9
            r14 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r14
            float r1 = r9 - r1
            r15 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r15
            com.github.mikephil.charting.charts.PieChart r2 = r6.f53722a
            float r2 = r2.getHoleRadius()
            float r16 = r2 / r14
            r2 = 1092616192(0x41200000, float:10.0)
            float r2 = r9 / r2
            r3 = 1080452710(0x40666666, float:3.6)
            float r2 = r2 * r3
            com.github.mikephil.charting.charts.PieChart r3 = r6.f53722a
            boolean r3 = r3.isDrawHoleEnabled()
            if (r3 == 0) goto L_0x007a
            float r2 = r9 * r16
            float r2 = r9 - r2
            float r2 = r2 / r15
            com.github.mikephil.charting.charts.PieChart r3 = r6.f53722a
            boolean r3 = r3.isDrawSlicesUnderHoleEnabled()
            if (r3 != 0) goto L_0x007a
            com.github.mikephil.charting.charts.PieChart r3 = r6.f53722a
            boolean r3 = r3.isDrawRoundedSlicesEnabled()
            if (r3 == 0) goto L_0x007a
            double r3 = (double) r0
            r0 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 * r0
            double r0 = (double) r1
            r17 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r14 = (double) r9
            double r14 = r14 * r17
            double r0 = r0 / r14
            double r3 = r3 + r0
            float r0 = (float) r3
        L_0x007a:
            r14 = r0
            float r15 = r9 - r2
            com.github.mikephil.charting.charts.PieChart r0 = r6.f53722a
            com.github.mikephil.charting.data.ChartData r0 = r0.getData()
            r17 = r0
            com.github.mikephil.charting.data.PieData r17 = (com.github.mikephil.charting.data.PieData) r17
            java.util.List r5 = r17.getDataSets()
            float r18 = r17.getYValueSum()
            com.github.mikephil.charting.charts.PieChart r0 = r6.f53722a
            boolean r21 = r0.isDrawEntryLabelsEnabled()
            r55.save()
            r0 = 1084227584(0x40a00000, float:5.0)
            float r22 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r23 = 0
            r0 = r23
            r4 = r0
        L_0x00a3:
            int r1 = r5.size()
            if (r4 >= r1) goto L_0x0448
            java.lang.Object r1 = r5.get(r4)
            r3 = r1
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet r3 = (com.github.mikephil.charting.interfaces.datasets.IPieDataSet) r3
            boolean r24 = r3.isDrawValuesEnabled()
            if (r24 != 0) goto L_0x00d0
            if (r21 != 0) goto L_0x00d0
            r26 = r4
            r34 = r5
            r29 = r9
            r35 = r10
            r37 = r11
            r38 = r12
            r39 = r13
            r41 = r14
            r10 = 1073741824(0x40000000, float:2.0)
            r19 = 1120403456(0x42c80000, float:100.0)
            r9 = r7
            r13 = r8
            goto L_0x0434
        L_0x00d0:
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r2 = r3.getXValuePosition()
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r1 = r3.getYValuePosition()
            r6.applyValueTextStyle(r3)
            r25 = r0
            android.graphics.Paint r0 = r6.mValuePaint
            r26 = r4
            java.lang.String r4 = "Q"
            int r0 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r0, r4)
            float r0 = (float) r0
            r4 = 1082130432(0x40800000, float:4.0)
            float r4 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r4)
            float r27 = r0 + r4
            com.github.mikephil.charting.formatter.ValueFormatter r4 = r3.getValueFormatter()
            int r0 = r3.getEntryCount()
            r28 = r5
            android.graphics.Paint r5 = r6.f53725d
            int r7 = r3.getValueLineColor()
            r5.setColor(r7)
            android.graphics.Paint r5 = r6.f53725d
            float r7 = r3.getValueLineWidth()
            float r7 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r7)
            r5.setStrokeWidth(r7)
            float r7 = r6.getSliceSpace(r3)
            com.github.mikephil.charting.utils.MPPointF r5 = r3.getIconsOffset()
            com.github.mikephil.charting.utils.MPPointF r5 = com.github.mikephil.charting.utils.MPPointF.getInstance(r5)
            r29 = r8
            float r8 = r5.f11822x
            float r8 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r8)
            r5.f11822x = r8
            float r8 = r5.f11823y
            float r8 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r8)
            r5.f11823y = r8
            r8 = r23
        L_0x0130:
            if (r8 >= r0) goto L_0x0418
            com.github.mikephil.charting.data.Entry r30 = r3.getEntryForIndex(r8)
            r31 = r5
            r5 = r30
            com.github.mikephil.charting.data.PieEntry r5 = (com.github.mikephil.charting.data.PieEntry) r5
            r30 = 0
            if (r25 != 0) goto L_0x0143
            r32 = r30
            goto L_0x0149
        L_0x0143:
            int r32 = r25 + -1
            r32 = r11[r32]
            float r32 = r32 * r12
        L_0x0149:
            r33 = r10[r25]
            r34 = 1016003125(0x3c8efa35, float:0.017453292)
            float r35 = r15 * r34
            float r35 = r7 / r35
            r20 = 1073741824(0x40000000, float:2.0)
            float r35 = r35 / r20
            float r33 = r33 - r35
            float r33 = r33 / r20
            float r32 = r32 + r33
            float r32 = r32 * r13
            r33 = r0
            float r0 = r14 + r32
            r32 = r7
            com.github.mikephil.charting.charts.PieChart r7 = r6.f53722a
            boolean r7 = r7.isUsePercentValuesEnabled()
            if (r7 == 0) goto L_0x0177
            float r7 = r5.getY()
            float r7 = r7 / r18
            r19 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 * r19
            goto L_0x017b
        L_0x0177:
            float r7 = r5.getY()
        L_0x017b:
            java.lang.String r7 = r4.getPieLabel(r7, r5)
            r35 = r10
            java.lang.String r10 = r5.getLabel()
            r36 = r4
            float r4 = r0 * r34
            r34 = r5
            double r4 = (double) r4
            r37 = r11
            r38 = r12
            double r11 = java.lang.Math.cos(r4)
            float r11 = (float) r11
            r39 = r13
            double r12 = java.lang.Math.sin(r4)
            float r12 = (float) r12
            if (r21 == 0) goto L_0x01a4
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r13 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.OUTSIDE_SLICE
            if (r2 != r13) goto L_0x01a4
            r13 = 1
            goto L_0x01a6
        L_0x01a4:
            r13 = r23
        L_0x01a6:
            r41 = r14
            if (r24 == 0) goto L_0x01b0
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r14 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.OUTSIDE_SLICE
            if (r1 != r14) goto L_0x01b0
            r14 = 1
            goto L_0x01b2
        L_0x01b0:
            r14 = r23
        L_0x01b2:
            r42 = r10
            if (r21 == 0) goto L_0x01bc
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r10 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE
            if (r2 != r10) goto L_0x01bc
            r10 = 1
            goto L_0x01be
        L_0x01bc:
            r10 = r23
        L_0x01be:
            r43 = r2
            if (r24 == 0) goto L_0x01c9
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r2 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE
            if (r1 != r2) goto L_0x01c9
            r40 = 1
            goto L_0x01cb
        L_0x01c9:
            r40 = r23
        L_0x01cb:
            if (r13 != 0) goto L_0x01eb
            if (r14 == 0) goto L_0x01d0
            goto L_0x01eb
        L_0x01d0:
            r46 = r1
            r45 = r12
            r51 = r29
            r52 = r31
            r49 = r36
            r14 = r42
            r19 = 1120403456(0x42c80000, float:100.0)
            r12 = r3
            r29 = r9
            r9 = r55
            r53 = r34
            r34 = r28
            r28 = r53
            goto L_0x033d
        L_0x01eb:
            float r2 = r3.getValueLinePart1Length()
            float r44 = r3.getValueLinePart2Length()
            float r45 = r3.getValueLinePart1OffsetPercentage()
            r19 = 1120403456(0x42c80000, float:100.0)
            float r45 = r45 / r19
            r46 = r1
            com.github.mikephil.charting.charts.PieChart r1 = r6.f53722a
            boolean r1 = r1.isDrawHoleEnabled()
            if (r1 == 0) goto L_0x020e
            float r1 = r9 * r16
            float r47 = r9 - r1
            float r47 = r47 * r45
            float r47 = r47 + r1
            goto L_0x0210
        L_0x020e:
            float r47 = r9 * r45
        L_0x0210:
            boolean r1 = r3.isValueLineVariableLength()
            if (r1 == 0) goto L_0x0224
            float r44 = r44 * r15
            double r4 = java.lang.Math.sin(r4)
            double r4 = java.lang.Math.abs(r4)
            float r1 = (float) r4
            float r44 = r44 * r1
            goto L_0x0226
        L_0x0224:
            float r44 = r44 * r15
        L_0x0226:
            float r1 = r47 * r11
            r5 = r29
            float r4 = r5.f11822x
            float r1 = r1 + r4
            float r47 = r47 * r12
            r29 = r9
            float r9 = r5.f11823y
            float r45 = r47 + r9
            r47 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 + r47
            float r2 = r2 * r15
            float r47 = r2 * r11
            float r47 = r47 + r4
            float r2 = r2 * r12
            float r9 = r9 + r2
            r48 = r5
            double r4 = (double) r0
            r49 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r4 = r4 % r49
            r49 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r0 = (r4 > r49 ? 1 : (r4 == r49 ? 0 : -1))
            if (r0 < 0) goto L_0x0274
            r49 = 4643457506423603200(0x4070e00000000000, double:270.0)
            int r0 = (r4 > r49 ? 1 : (r4 == r49 ? 0 : -1))
            if (r0 > 0) goto L_0x0274
            float r0 = r47 - r44
            android.graphics.Paint r2 = r6.mValuePaint
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.RIGHT
            r2.setTextAlign(r4)
            if (r13 == 0) goto L_0x026e
            android.graphics.Paint r2 = r6.f53727f
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.RIGHT
            r2.setTextAlign(r4)
        L_0x026e:
            float r2 = r0 - r22
            r44 = r0
            r5 = r2
            goto L_0x0289
        L_0x0274:
            float r44 = r47 + r44
            android.graphics.Paint r0 = r6.mValuePaint
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.LEFT
            r0.setTextAlign(r2)
            if (r13 == 0) goto L_0x0286
            android.graphics.Paint r0 = r6.f53727f
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.LEFT
            r0.setTextAlign(r2)
        L_0x0286:
            float r0 = r44 + r22
            r5 = r0
        L_0x0289:
            int r0 = r3.getValueLineColor()
            r2 = 1122867(0x112233, float:1.573472E-39)
            if (r0 == r2) goto L_0x02cd
            boolean r0 = r3.isUsingSliceColorAsValueLineColor()
            if (r0 == 0) goto L_0x02a1
            android.graphics.Paint r0 = r6.f53725d
            int r2 = r3.getColor(r8)
            r0.setColor(r2)
        L_0x02a1:
            android.graphics.Paint r4 = r6.f53725d
            r0 = r55
            r2 = r45
            r45 = r12
            r12 = r3
            r3 = r47
            r49 = r36
            r36 = r4
            r4 = r9
            r52 = r31
            r51 = r48
            r31 = r5
            r53 = r34
            r34 = r28
            r28 = r53
            r5 = r36
            r0.drawLine(r1, r2, r3, r4, r5)
            android.graphics.Paint r5 = r6.f53725d
            r1 = r47
            r2 = r9
            r3 = r44
            r0.drawLine(r1, r2, r3, r4, r5)
            goto L_0x02de
        L_0x02cd:
            r45 = r12
            r52 = r31
            r49 = r36
            r51 = r48
            r12 = r3
            r31 = r5
            r53 = r34
            r34 = r28
            r28 = r53
        L_0x02de:
            if (r13 == 0) goto L_0x030a
            if (r14 == 0) goto L_0x030a
            int r5 = r12.getValueTextColor(r8)
            r0 = r54
            r1 = r55
            r2 = r7
            r3 = r31
            r4 = r9
            r0.drawValue(r1, r2, r3, r4, r5)
            int r0 = r17.getEntryCount()
            if (r8 >= r0) goto L_0x0305
            if (r42 == 0) goto L_0x0305
            float r9 = r9 + r27
            r5 = r55
            r3 = r31
            r4 = r42
            r6.drawEntryLabel(r5, r4, r3, r9)
            goto L_0x033b
        L_0x0305:
            r9 = r55
            r14 = r42
            goto L_0x033d
        L_0x030a:
            r5 = r55
            r3 = r31
            r4 = r42
            if (r13 == 0) goto L_0x0323
            int r0 = r17.getEntryCount()
            if (r8 >= r0) goto L_0x033b
            if (r4 == 0) goto L_0x033b
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r27 / r0
            float r9 = r9 + r1
            r6.drawEntryLabel(r5, r4, r3, r9)
            goto L_0x033b
        L_0x0323:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r14 == 0) goto L_0x033b
            float r1 = r27 / r0
            float r9 = r9 + r1
            int r13 = r12.getValueTextColor(r8)
            r0 = r54
            r1 = r55
            r2 = r7
            r14 = r4
            r4 = r9
            r9 = r5
            r5 = r13
            r0.drawValue(r1, r2, r3, r4, r5)
            goto L_0x033d
        L_0x033b:
            r14 = r4
            r9 = r5
        L_0x033d:
            if (r10 != 0) goto L_0x0348
            if (r40 == 0) goto L_0x0342
            goto L_0x0348
        L_0x0342:
            r13 = r51
        L_0x0344:
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x03a9
        L_0x0348:
            float r0 = r15 * r11
            r13 = r51
            float r1 = r13.f11822x
            float r5 = r0 + r1
            float r0 = r15 * r45
            float r1 = r13.f11823y
            float r31 = r0 + r1
            android.graphics.Paint r0 = r6.mValuePaint
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            if (r10 == 0) goto L_0x0380
            if (r40 == 0) goto L_0x0380
            int r10 = r12.getValueTextColor(r8)
            r0 = r54
            r1 = r55
            r2 = r7
            r3 = r5
            r4 = r31
            r7 = r5
            r5 = r10
            r0.drawValue(r1, r2, r3, r4, r5)
            int r0 = r17.getEntryCount()
            if (r8 >= r0) goto L_0x0344
            if (r14 == 0) goto L_0x0344
            float r0 = r31 + r27
            r6.drawEntryLabel(r9, r14, r7, r0)
            goto L_0x0344
        L_0x0380:
            r3 = r5
            if (r10 == 0) goto L_0x0395
            int r0 = r17.getEntryCount()
            if (r8 >= r0) goto L_0x0344
            if (r14 == 0) goto L_0x0344
            r10 = 1073741824(0x40000000, float:2.0)
            float r0 = r27 / r10
            float r0 = r31 + r0
            r6.drawEntryLabel(r9, r14, r3, r0)
            goto L_0x03a9
        L_0x0395:
            r10 = 1073741824(0x40000000, float:2.0)
            if (r40 == 0) goto L_0x03a9
            float r0 = r27 / r10
            float r4 = r31 + r0
            int r5 = r12.getValueTextColor(r8)
            r0 = r54
            r1 = r55
            r2 = r7
            r0.drawValue(r1, r2, r3, r4, r5)
        L_0x03a9:
            android.graphics.drawable.Drawable r0 = r28.getIcon()
            if (r0 == 0) goto L_0x03f4
            boolean r0 = r12.isDrawIconsEnabled()
            if (r0 == 0) goto L_0x03f4
            android.graphics.drawable.Drawable r1 = r28.getIcon()
            float r0 = r13.f11822x
            int r2 = r6.f53734m
            if (r2 != r8) goto L_0x03c4
            float r2 = r12.getSelectionShift()
            goto L_0x03c6
        L_0x03c4:
            r2 = r30
        L_0x03c6:
            float r2 = r2 * r11
            float r0 = r0 + r2
            float r2 = r13.f11823y
            int r3 = r6.f53734m
            if (r3 != r8) goto L_0x03d2
            float r30 = r12.getSelectionShift()
        L_0x03d2:
            float r3 = r45 * r30
            float r2 = r2 + r3
            r7 = r52
            float r3 = r7.f11823y
            float r4 = r15 + r3
            float r4 = r4 * r11
            float r4 = r4 + r0
            float r3 = r3 + r15
            float r3 = r3 * r45
            float r3 = r3 + r2
            float r0 = r7.f11822x
            float r3 = r3 + r0
            int r2 = (int) r4
            int r3 = (int) r3
            int r4 = r1.getIntrinsicWidth()
            int r5 = r1.getIntrinsicHeight()
            r0 = r55
            com.github.mikephil.charting.utils.Utils.drawImage(r0, r1, r2, r3, r4, r5)
            goto L_0x03f6
        L_0x03f4:
            r7 = r52
        L_0x03f6:
            int r25 = r25 + 1
            int r8 = r8 + 1
            r5 = r7
            r3 = r12
            r9 = r29
            r7 = r32
            r0 = r33
            r28 = r34
            r10 = r35
            r11 = r37
            r12 = r38
            r14 = r41
            r2 = r43
            r1 = r46
            r4 = r49
            r29 = r13
            r13 = r39
            goto L_0x0130
        L_0x0418:
            r7 = r5
            r35 = r10
            r37 = r11
            r38 = r12
            r39 = r13
            r41 = r14
            r34 = r28
            r13 = r29
            r10 = 1073741824(0x40000000, float:2.0)
            r19 = 1120403456(0x42c80000, float:100.0)
            r29 = r9
            r9 = r55
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r7)
            r0 = r25
        L_0x0434:
            int r4 = r26 + 1
            r7 = r9
            r8 = r13
            r9 = r29
            r5 = r34
            r10 = r35
            r11 = r37
            r12 = r38
            r13 = r39
            r14 = r41
            goto L_0x00a3
        L_0x0448:
            r9 = r7
            r13 = r8
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(r13)
            r55.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.C19472a.drawValues(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public float getSliceSpace(IPieDataSet iPieDataSet) {
        if (!iPieDataSet.isAutomaticallyDisableSliceSpacingEnabled()) {
            return iPieDataSet.getSliceSpace();
        }
        if (iPieDataSet.getSliceSpace() / this.mViewPortHandler.getSmallestContentExtension() > (iPieDataSet.getYMin() / ((PieData) this.f53722a.getData()).getYValueSum()) * 2.0f) {
            return Utils.FLOAT_EPSILON;
        }
        return iPieDataSet.getSliceSpace();
    }

    public void initBuffers() {
    }
}

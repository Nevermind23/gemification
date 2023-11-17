package p881ru.tinkoff.scrollingpagerindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.github.mikephil.charting.utils.Utils;
import di1.C40710a;
import di1.C40711b;
import di1.C40712c;
import di1.C40713d;

/* renamed from: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator */
public class ScrollingPagerIndicator extends View {

    /* renamed from: d */
    private int f99636d;

    /* renamed from: e */
    private final int f99637e;

    /* renamed from: f */
    private final int f99638f;

    /* renamed from: g */
    private final int f99639g;

    /* renamed from: h */
    private final int f99640h;

    /* renamed from: i */
    private int f99641i;

    /* renamed from: j */
    private int f99642j;

    /* renamed from: k */
    private int f99643k;

    /* renamed from: l */
    private float f99644l;

    /* renamed from: m */
    private float f99645m;

    /* renamed from: n */
    private float f99646n;

    /* renamed from: o */
    private SparseArray f99647o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f99648p;

    /* renamed from: q */
    private final Paint f99649q;

    /* renamed from: r */
    private final ArgbEvaluator f99650r;

    /* renamed from: s */
    private int f99651s;

    /* renamed from: t */
    private int f99652t;

    /* renamed from: u */
    private boolean f99653u;

    /* renamed from: v */
    private Runnable f99654v;

    /* renamed from: w */
    private C42387b f99655w;

    /* renamed from: x */
    private boolean f99656x;

    /* renamed from: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator$a */
    class C42386a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Object f99657d;

        /* renamed from: e */
        final /* synthetic */ C42387b f99658e;

        C42386a(Object obj, C42387b bVar) {
            this.f99657d = obj;
            this.f99658e = bVar;
        }

        public void run() {
            int unused = ScrollingPagerIndicator.this.f99648p = -1;
            ScrollingPagerIndicator.this.mo97844d(this.f99657d, this.f99658e);
        }
    }

    /* renamed from: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator$b */
    public interface C42387b {
        /* renamed from: a */
        void mo94871a();

        /* renamed from: b */
        void mo94872b(ScrollingPagerIndicator scrollingPagerIndicator, Object obj);
    }

    public ScrollingPagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C40710a.f96388a);
    }

    /* renamed from: b */
    private void m122934b(float f, int i) {
        int i2 = this.f99648p;
        int i3 = this.f99641i;
        if (i2 <= i3) {
            this.f99644l = Utils.FLOAT_EPSILON;
        } else if (this.f99653u || i2 <= i3) {
            this.f99644l = (m122936g(this.f99636d / 2) + (((float) this.f99640h) * f)) - (this.f99645m / 2.0f);
        } else {
            this.f99644l = (m122936g(i) + (((float) this.f99640h) * f)) - (this.f99645m / 2.0f);
            int i4 = this.f99641i / 2;
            float g = m122936g((getDotCount() - 1) - i4);
            if (this.f99644l + (this.f99645m / 2.0f) < m122936g(i4)) {
                this.f99644l = m122936g(i4) - (this.f99645m / 2.0f);
                return;
            }
            float f2 = this.f99644l;
            float f3 = this.f99645m;
            if (f2 + (f3 / 2.0f) > g) {
                this.f99644l = g - (f3 / 2.0f);
            }
        }
    }

    /* renamed from: e */
    private int m122935e(float f) {
        return ((Integer) this.f99650r.evaluate(f, Integer.valueOf(this.f99651s), Integer.valueOf(this.f99652t))).intValue();
    }

    /* renamed from: g */
    private float m122936g(int i) {
        return this.f99646n + ((float) (i * this.f99640h));
    }

    private int getDotCount() {
        if (!this.f99653u || this.f99648p <= this.f99641i) {
            return this.f99648p;
        }
        return this.f99636d;
    }

    /* renamed from: h */
    private float m122937h(int i) {
        Float f = (Float) this.f99647o.get(i);
        if (f != null) {
            return f.floatValue();
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: i */
    private void m122938i(int i) {
        float f;
        if (this.f99648p != i || !this.f99656x) {
            this.f99648p = i;
            this.f99656x = true;
            this.f99647o = new SparseArray();
            if (i < this.f99642j) {
                requestLayout();
                invalidate();
                return;
            }
            if (!this.f99653u || this.f99648p <= this.f99641i) {
                f = (float) (this.f99639g / 2);
            } else {
                f = Utils.FLOAT_EPSILON;
            }
            this.f99646n = f;
            this.f99645m = (float) (((this.f99641i - 1) * this.f99640h) + this.f99639g);
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: l */
    private void m122939l(int i, float f) {
        if (this.f99647o != null && getDotCount() != 0) {
            m122940m(i, 1.0f - Math.abs(f));
        }
    }

    /* renamed from: m */
    private void m122940m(int i, float f) {
        if (f == Utils.FLOAT_EPSILON) {
            this.f99647o.remove(i);
        } else {
            this.f99647o.put(i, Float.valueOf(f));
        }
    }

    /* renamed from: n */
    private void m122941n(int i) {
        if (!this.f99653u || this.f99648p < this.f99641i) {
            this.f99647o.clear();
            this.f99647o.put(i, Float.valueOf(1.0f));
            invalidate();
        }
    }

    /* renamed from: c */
    public void mo97843c(ViewPager2 viewPager2) {
        mo97844d(viewPager2, new C40713d());
    }

    /* renamed from: d */
    public void mo97844d(Object obj, C42387b bVar) {
        mo97845f();
        bVar.mo94872b(this, obj);
        this.f99655w = bVar;
        this.f99654v = new C42386a(obj, bVar);
    }

    /* renamed from: f */
    public void mo97845f() {
        C42387b bVar = this.f99655w;
        if (bVar != null) {
            bVar.mo94871a();
            this.f99655w = null;
            this.f99654v = null;
        }
        this.f99656x = false;
    }

    public int getDotColor() {
        return this.f99651s;
    }

    public int getOrientation() {
        return this.f99643k;
    }

    public int getSelectedDotColor() {
        return this.f99652t;
    }

    public int getVisibleDotCount() {
        return this.f99641i;
    }

    public int getVisibleDotThreshold() {
        return this.f99642j;
    }

    /* renamed from: j */
    public void mo97851j(int i, float f) {
        int i2;
        if (f < Utils.FLOAT_EPSILON || f > 1.0f) {
            throw new IllegalArgumentException("Offset must be [0, 1]");
        } else if (i < 0 || (i != 0 && i >= this.f99648p)) {
            throw new IndexOutOfBoundsException("page must be [0, adapter.getItemCount())");
        } else {
            if (!this.f99653u || ((i2 = this.f99648p) <= this.f99641i && i2 > 1)) {
                this.f99647o.clear();
                if (this.f99643k == 0) {
                    m122939l(i, f);
                    int i3 = this.f99648p;
                    if (i < i3 - 1) {
                        m122939l(i + 1, 1.0f - f);
                    } else if (i3 > 1) {
                        m122939l(0, 1.0f - f);
                    }
                } else {
                    m122939l(i - 1, f);
                    m122939l(i, 1.0f - f);
                }
                invalidate();
            }
            if (this.f99643k == 0) {
                m122934b(f, i);
            } else {
                m122934b(f, i - 1);
            }
            invalidate();
        }
    }

    /* renamed from: k */
    public void mo97852k() {
        Runnable runnable = this.f99654v;
        if (runnable != null) {
            runnable.run();
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        Canvas canvas2 = canvas;
        int dotCount = getDotCount();
        if (dotCount >= this.f99642j) {
            int i2 = this.f99640h;
            int i3 = this.f99639g;
            float f3 = ((float) (((i3 - this.f99638f) / 2) + i2)) * 0.7f;
            float f4 = (float) (i3 / 2);
            float f5 = ((float) i2) * 0.85714287f;
            float f6 = this.f99644l;
            int i4 = ((int) (f6 - this.f99646n)) / i2;
            int g = (((int) ((f6 + this.f99645m) - m122936g(i4))) / this.f99640h) + i4;
            if (i4 == 0 && g + 1 > dotCount) {
                g = dotCount - 1;
            }
            while (i4 <= g) {
                float g2 = m122936g(i4);
                float f7 = this.f99644l;
                if (g2 >= f7) {
                    float f8 = this.f99645m;
                    if (g2 < f7 + f8) {
                        if (!this.f99653u || this.f99648p <= this.f99641i) {
                            f = m122937h(i4);
                        } else {
                            float f9 = f7 + (f8 / 2.0f);
                            if (g2 >= f9 - f5 && g2 <= f9) {
                                f = ((g2 - f9) + f5) / f5;
                            } else if (g2 <= f9 || g2 >= f9 + f5) {
                                f = Utils.FLOAT_EPSILON;
                            } else {
                                f = 1.0f - ((g2 - f9) / f5);
                            }
                        }
                        int i5 = this.f99638f;
                        float f12 = ((float) i5) + (((float) (this.f99639g - i5)) * f);
                        if (this.f99648p > this.f99641i) {
                            if (this.f99653u || !(i4 == 0 || i4 == dotCount - 1)) {
                                f2 = f3;
                            } else {
                                f2 = f4;
                            }
                            int width = getWidth();
                            if (this.f99643k == 1) {
                                width = getHeight();
                            }
                            float f13 = this.f99644l;
                            if (g2 - f13 < f2) {
                                float f14 = ((g2 - f13) * f12) / f2;
                                i = this.f99637e;
                                if (f14 > ((float) i)) {
                                    if (f14 < f12) {
                                        f12 = f14;
                                    }
                                }
                            } else {
                                float f15 = (float) width;
                                if (g2 - f13 > f15 - f2) {
                                    float f16 = ((((-g2) + f13) + f15) * f12) / f2;
                                    i = this.f99637e;
                                    if (f16 > ((float) i)) {
                                        if (f16 < f12) {
                                            f12 = f16;
                                        }
                                    }
                                }
                            }
                            f12 = (float) i;
                        }
                        this.f99649q.setColor(m122935e(f));
                        if (this.f99643k == 0) {
                            canvas2.drawCircle(g2 - this.f99644l, (float) (getMeasuredHeight() / 2), f12 / 2.0f, this.f99649q);
                        } else {
                            canvas2.drawCircle((float) (getMeasuredWidth() / 2), g2 - this.f99644l, f12 / 2.0f, this.f99649q);
                        }
                    }
                }
                i4++;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f99643k
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x0040
            boolean r5 = r4.isInEditMode()
            if (r5 == 0) goto L_0x0019
            int r5 = r4.f99641i
            int r5 = r5 + -1
            int r0 = r4.f99640h
            int r5 = r5 * r0
            int r0 = r4.f99639g
        L_0x0017:
            int r5 = r5 + r0
            goto L_0x002b
        L_0x0019:
            int r5 = r4.f99648p
            int r0 = r4.f99641i
            if (r5 < r0) goto L_0x0023
            float r5 = r4.f99645m
            int r5 = (int) r5
            goto L_0x002b
        L_0x0023:
            int r5 = r5 + -1
            int r0 = r4.f99640h
            int r5 = r5 * r0
            int r0 = r4.f99639g
            goto L_0x0017
        L_0x002b:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r3 = r4.f99639g
            if (r0 == r2) goto L_0x003b
            if (r0 == r1) goto L_0x0077
            r6 = r3
            goto L_0x0077
        L_0x003b:
            int r6 = java.lang.Math.min(r3, r6)
            goto L_0x0077
        L_0x0040:
            boolean r6 = r4.isInEditMode()
            if (r6 == 0) goto L_0x0051
            int r6 = r4.f99641i
            int r6 = r6 + -1
            int r0 = r4.f99640h
            int r6 = r6 * r0
            int r0 = r4.f99639g
        L_0x004f:
            int r6 = r6 + r0
            goto L_0x0063
        L_0x0051:
            int r6 = r4.f99648p
            int r0 = r4.f99641i
            if (r6 < r0) goto L_0x005b
            float r6 = r4.f99645m
            int r6 = (int) r6
            goto L_0x0063
        L_0x005b:
            int r6 = r6 + -1
            int r0 = r4.f99640h
            int r6 = r6 * r0
            int r0 = r4.f99639g
            goto L_0x004f
        L_0x0063:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r3 = r4.f99639g
            if (r0 == r2) goto L_0x0073
            if (r0 == r1) goto L_0x0077
            r5 = r3
            goto L_0x0077
        L_0x0073:
            int r5 = java.lang.Math.min(r3, r5)
        L_0x0077:
            r4.setMeasuredDimension(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p881ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.onMeasure(int, int):void");
    }

    public void setCurrentPosition(int i) {
        if (i != 0 && (i < 0 || i >= this.f99648p)) {
            throw new IndexOutOfBoundsException("Position must be [0, adapter.getItemCount()]");
        } else if (this.f99648p != 0) {
            m122934b(Utils.FLOAT_EPSILON, i);
            m122941n(i);
        }
    }

    public void setDotColor(int i) {
        this.f99651s = i;
        invalidate();
    }

    public void setDotCount(int i) {
        m122938i(i);
    }

    public void setLooped(boolean z) {
        this.f99653u = z;
        mo97852k();
        invalidate();
    }

    public void setOrientation(int i) {
        this.f99643k = i;
        if (this.f99654v != null) {
            mo97852k();
        } else {
            requestLayout();
        }
    }

    public void setSelectedDotColor(int i) {
        this.f99652t = i;
        invalidate();
    }

    public void setVisibleDotCount(int i) {
        if (i % 2 != 0) {
            this.f99641i = i;
            this.f99636d = i + 2;
            if (this.f99654v != null) {
                mo97852k();
            } else {
                requestLayout();
            }
        } else {
            throw new IllegalArgumentException("visibleDotCount must be odd");
        }
    }

    public void setVisibleDotThreshold(int i) {
        this.f99642j = i;
        if (this.f99654v != null) {
            mo97852k();
        } else {
            requestLayout();
        }
    }

    public ScrollingPagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f99650r = new ArgbEvaluator();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C40712c.f96390a, i, C40711b.f96389a);
        int color = obtainStyledAttributes.getColor(C40712c.f96391b, 0);
        this.f99651s = color;
        this.f99652t = obtainStyledAttributes.getColor(C40712c.f96393d, color);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C40712c.f96395f, 0);
        this.f99638f = dimensionPixelSize;
        this.f99639g = obtainStyledAttributes.getDimensionPixelSize(C40712c.f96394e, 0);
        int i2 = -1;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C40712c.f96392c, -1);
        this.f99637e = dimensionPixelSize2 <= dimensionPixelSize ? dimensionPixelSize2 : i2;
        this.f99640h = obtainStyledAttributes.getDimensionPixelSize(C40712c.f96396g, 0) + dimensionPixelSize;
        this.f99653u = obtainStyledAttributes.getBoolean(C40712c.f96397h, false);
        int i3 = obtainStyledAttributes.getInt(C40712c.f96399j, 0);
        setVisibleDotCount(i3);
        this.f99642j = obtainStyledAttributes.getInt(C40712c.f96400k, 2);
        this.f99643k = obtainStyledAttributes.getInt(C40712c.f96398i, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f99649q = paint;
        paint.setAntiAlias(true);
        if (isInEditMode()) {
            setDotCount(i3);
            mo97851j(i3 / 2, Utils.FLOAT_EPSILON);
        }
    }
}

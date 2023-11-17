package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.C1055a;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p009a8.C0072b;
import p009a8.C0073c;
import p009a8.C0074d;
import p009a8.C0076f;
import p009a8.C0078h;
import p009a8.C0081k;
import p009a8.C0082l;
import p045d.C5769a;
import p184n8.C7343c;

class ClockFaceView extends C5231d implements ClockHandView.C5221c {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ClockHandView f16717g;

    /* renamed from: h */
    private final Rect f16718h;

    /* renamed from: i */
    private final RectF f16719i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final SparseArray f16720j;

    /* renamed from: k */
    private final C1055a f16721k;

    /* renamed from: l */
    private final int[] f16722l;

    /* renamed from: m */
    private final float[] f16723m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final int f16724n;

    /* renamed from: o */
    private final int f16725o;

    /* renamed from: p */
    private final int f16726p;

    /* renamed from: q */
    private final int f16727q;

    /* renamed from: r */
    private String[] f16728r;

    /* renamed from: s */
    private float f16729s;

    /* renamed from: t */
    private final ColorStateList f16730t;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    class C5217a implements ViewTreeObserver.OnPreDrawListener {
        C5217a() {
        }

        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo17357j(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f16717g.mo17364g()) - ClockFaceView.this.f16724n);
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    class C5218b extends C1055a {
        C5218b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            int intValue = ((Integer) view.getTag(C0076f.f280r)).intValue();
            if (intValue > 0) {
                accessibilityNodeInfoCompat.mo3636x0((View) ClockFaceView.this.f16720j.get(intValue - 1));
            }
            accessibilityNodeInfoCompat.mo3597b0(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.m4049a(0, 1, intValue, 1, false, view.isSelected()));
            accessibilityNodeInfoCompat.mo3593Z(true);
            accessibilityNodeInfoCompat.mo3596b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3746i);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            float x = view.getX() + (((float) view.getWidth()) / 2.0f);
            long j = uptimeMillis;
            float f = x;
            float height = (((float) view.getHeight()) / 2.0f) + view.getY();
            ClockFaceView.this.f16717g.onTouchEvent(MotionEvent.obtain(uptimeMillis, j, 0, f, height, 0));
            ClockFaceView.this.f16717g.onTouchEvent(MotionEvent.obtain(uptimeMillis, j, 1, f, height, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f128H);
    }

    /* renamed from: q */
    private void m20616q() {
        RectF d = this.f16717g.mo17362d();
        for (int i = 0; i < this.f16720j.size(); i++) {
            TextView textView = (TextView) this.f16720j.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f16718h);
                offsetDescendantRectToMyCoords(textView, this.f16718h);
                textView.setSelected(d.contains((float) this.f16718h.centerX(), (float) this.f16718h.centerY()));
                textView.getPaint().setShader(m20617r(d, this.f16718h, textView));
                textView.invalidate();
            }
        }
    }

    /* renamed from: r */
    private RadialGradient m20617r(RectF rectF, Rect rect, TextView textView) {
        this.f16719i.set(rect);
        this.f16719i.offset((float) textView.getPaddingLeft(), (float) textView.getPaddingTop());
        if (!RectF.intersects(rectF, this.f16719i)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f16719i.left, rectF.centerY() - this.f16719i.top, rectF.width() * 0.5f, this.f16722l, this.f16723m, Shader.TileMode.CLAMP);
    }

    /* renamed from: s */
    private static float m20618s(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    /* renamed from: u */
    private void m20619u(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f16720j.size();
        for (int i2 = 0; i2 < Math.max(this.f16728r.length, size); i2++) {
            TextView textView = (TextView) this.f16720j.get(i2);
            if (i2 >= this.f16728r.length) {
                removeView(textView);
                this.f16720j.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C0078h.f298h, this, false);
                    this.f16720j.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f16728r[i2]);
                textView.setTag(C0076f.f280r, Integer.valueOf(i2));
                ViewCompat.m3619r0(textView, this.f16721k);
                textView.setTextColor(this.f16730t);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, new Object[]{this.f16728r[i2]}));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17356a(float f, boolean z) {
        if (Math.abs(this.f16729s - f) > 0.001f) {
            this.f16729s = f;
            m20616q();
        }
    }

    /* renamed from: j */
    public void mo17357j(int i) {
        if (i != mo17389i()) {
            super.mo17357j(i);
            this.f16717g.mo17365j(mo17389i());
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.m3965A0(accessibilityNodeInfo).mo3595a0(AccessibilityNodeInfoCompat.CollectionInfoCompat.m4048a(1, this.f16728r.length, false, 1));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m20616q();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int s = (int) (((float) this.f16727q) / m20618s(((float) this.f16725o) / ((float) displayMetrics.heightPixels), ((float) this.f16726p) / ((float) displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(s, 1073741824);
        setMeasuredDimension(s, s);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    /* renamed from: t */
    public void mo17359t(String[] strArr, int i) {
        this.f16728r = strArr;
        m20619u(i);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16718h = new Rect();
        this.f16719i = new RectF();
        this.f16720j = new SparseArray();
        this.f16723m = new float[]{Utils.FLOAT_EPSILON, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0082l.f884z1, i, C0081k.f352B);
        Resources resources = getResources();
        ColorStateList a = C7343c.m28003a(context, obtainStyledAttributes, C0082l.f391B1);
        this.f16730t = a;
        LayoutInflater.from(context).inflate(C0078h.f299i, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C0076f.f275m);
        this.f16717g = clockHandView;
        this.f16724n = resources.getDimensionPixelSize(C0074d.f222p);
        int colorForState = a.getColorForState(new int[]{16842913}, a.getDefaultColor());
        this.f16722l = new int[]{colorForState, colorForState, a.getDefaultColor()};
        clockHandView.mo17361b(this);
        int defaultColor = C5769a.m23209a(context, C0073c.f167c).getDefaultColor();
        ColorStateList a2 = C7343c.m28003a(context, obtainStyledAttributes, C0082l.f381A1);
        setBackgroundColor(a2 != null ? a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new C5217a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f16721k = new C5218b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        mo17359t(strArr, 0);
        this.f16725o = resources.getDimensionPixelSize(C0074d.material_time_picker_minimum_screen_height);
        this.f16726p = resources.getDimensionPixelSize(C0074d.material_time_picker_minimum_screen_width);
        this.f16727q = resources.getDimensionPixelSize(C0074d.f224r);
    }
}

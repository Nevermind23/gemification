package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.C0825b;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.text.C0963a;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.internal.C5082i;
import com.google.android.material.internal.C5088l;
import com.google.android.material.internal.C5089m;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p009a8.C0082l;
import p026b8.C2173d;
import p045d.C5769a;
import p054d8.C5853a;
import p080f8.C6170a;
import p106h8.C6477a;
import p184n8.C7343c;
import p184n8.C7344d;
import p197o8.C7492b;
import p223q8.C7922g;

/* renamed from: com.google.android.material.chip.a */
public class C4983a extends C7922g implements Drawable.Callback, C5082i.C5084b {

    /* renamed from: M0 */
    private static final int[] f15838M0 = {16842910};

    /* renamed from: N0 */
    private static final ShapeDrawable f15839N0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private ColorFilter f15840A0;

    /* renamed from: B0 */
    private PorterDuffColorFilter f15841B0;

    /* renamed from: C */
    private ColorStateList f15842C;

    /* renamed from: C0 */
    private ColorStateList f15843C0;

    /* renamed from: D */
    private ColorStateList f15844D;

    /* renamed from: D0 */
    private PorterDuff.Mode f15845D0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: E */
    private float f15846E;

    /* renamed from: E0 */
    private int[] f15847E0;

    /* renamed from: F */
    private float f15848F = -1.0f;

    /* renamed from: F0 */
    private boolean f15849F0;

    /* renamed from: G */
    private ColorStateList f15850G;

    /* renamed from: G0 */
    private ColorStateList f15851G0;

    /* renamed from: H */
    private float f15852H;

    /* renamed from: H0 */
    private WeakReference f15853H0 = new WeakReference((Object) null);

    /* renamed from: I */
    private ColorStateList f15854I;

    /* renamed from: I0 */
    private TextUtils.TruncateAt f15855I0;

    /* renamed from: J */
    private CharSequence f15856J;

    /* renamed from: J0 */
    private boolean f15857J0;

    /* renamed from: K */
    private boolean f15858K;

    /* renamed from: K0 */
    private int f15859K0;

    /* renamed from: L */
    private Drawable f15860L;

    /* renamed from: L0 */
    private boolean f15861L0;

    /* renamed from: M */
    private ColorStateList f15862M;

    /* renamed from: N */
    private float f15863N;

    /* renamed from: O */
    private boolean f15864O;

    /* renamed from: P */
    private boolean f15865P;

    /* renamed from: Q */
    private Drawable f15866Q;

    /* renamed from: R */
    private Drawable f15867R;

    /* renamed from: S */
    private ColorStateList f15868S;

    /* renamed from: T */
    private float f15869T;

    /* renamed from: U */
    private CharSequence f15870U;

    /* renamed from: V */
    private boolean f15871V;

    /* renamed from: W */
    private boolean f15872W;

    /* renamed from: X */
    private Drawable f15873X;

    /* renamed from: Y */
    private ColorStateList f15874Y;

    /* renamed from: Z */
    private C2173d f15875Z;

    /* renamed from: a0 */
    private C2173d f15876a0;

    /* renamed from: b0 */
    private float f15877b0;

    /* renamed from: c0 */
    private float f15878c0;

    /* renamed from: d0 */
    private float f15879d0;

    /* renamed from: e0 */
    private float f15880e0;

    /* renamed from: f0 */
    private float f15881f0;

    /* renamed from: g0 */
    private float f15882g0;

    /* renamed from: h0 */
    private float f15883h0;

    /* renamed from: i0 */
    private float f15884i0;

    /* renamed from: j0 */
    private final Context f15885j0;

    /* renamed from: k0 */
    private final Paint f15886k0 = new Paint(1);

    /* renamed from: l0 */
    private final Paint f15887l0;

    /* renamed from: m0 */
    private final Paint.FontMetrics f15888m0 = new Paint.FontMetrics();

    /* renamed from: n0 */
    private final RectF f15889n0 = new RectF();

    /* renamed from: o0 */
    private final PointF f15890o0 = new PointF();

    /* renamed from: p0 */
    private final Path f15891p0 = new Path();

    /* renamed from: q0 */
    private final C5082i f15892q0;

    /* renamed from: r0 */
    private int f15893r0;

    /* renamed from: s0 */
    private int f15894s0;

    /* renamed from: t0 */
    private int f15895t0;

    /* renamed from: u0 */
    private int f15896u0;

    /* renamed from: v0 */
    private int f15897v0;

    /* renamed from: w0 */
    private int f15898w0;

    /* renamed from: x0 */
    private boolean f15899x0;

    /* renamed from: y0 */
    private int f15900y0;

    /* renamed from: z0 */
    private int f15901z0 = C11051p3.f31759c;

    /* renamed from: com.google.android.material.chip.a$a */
    public interface C4984a {
        /* renamed from: a */
        void mo15866a();
    }

    private C4983a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo22934M(context);
        this.f15885j0 = context;
        C5082i iVar = new C5082i(this);
        this.f15892q0 = iVar;
        this.f15856J = "";
        iVar.mo16519e().density = context.getResources().getDisplayMetrics().density;
        this.f15887l0 = null;
        int[] iArr = f15838M0;
        setState(iArr);
        mo16100l2(iArr);
        this.f15857J0 = true;
        if (C7492b.f21801a) {
            f15839N0.setTint(-1);
        }
    }

    /* renamed from: A0 */
    private void m19220A0(Canvas canvas, Rect rect) {
        if (!this.f15861L0) {
            this.f15886k0.setColor(this.f15893r0);
            this.f15886k0.setStyle(Paint.Style.FILL);
            this.f15889n0.set(rect);
            canvas.drawRoundRect(this.f15889n0, mo16031I0(), mo16031I0(), this.f15886k0);
        }
    }

    /* renamed from: B0 */
    private void m19221B0(Canvas canvas, Rect rect) {
        if (m19227P2()) {
            m19239o0(rect, this.f15889n0);
            RectF rectF = this.f15889n0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f15866Q.setBounds(0, 0, (int) this.f15889n0.width(), (int) this.f15889n0.height());
            if (C7492b.f21801a) {
                this.f15867R.setBounds(this.f15866Q.getBounds());
                this.f15867R.jumpToCurrentState();
                this.f15867R.draw(canvas);
            } else {
                this.f15866Q.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: C0 */
    private void m19222C0(Canvas canvas, Rect rect) {
        this.f15886k0.setColor(this.f15897v0);
        this.f15886k0.setStyle(Paint.Style.FILL);
        this.f15889n0.set(rect);
        if (!this.f15861L0) {
            canvas.drawRoundRect(this.f15889n0, mo16031I0(), mo16031I0(), this.f15886k0);
            return;
        }
        mo22954h(new RectF(rect), this.f15891p0);
        super.mo22959p(canvas, this.f15886k0, this.f15891p0, mo22963u());
    }

    /* renamed from: D0 */
    private void m19223D0(Canvas canvas, Rect rect) {
        Paint paint = this.f15887l0;
        if (paint != null) {
            paint.setColor(C0825b.m3101j(-16777216, C11051p3.f31760d));
            canvas.drawRect(rect, this.f15887l0);
            if (m19226O2() || m19225N2()) {
                m19235l0(rect, this.f15889n0);
                canvas.drawRect(this.f15889n0, this.f15887l0);
            }
            if (this.f15856J != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f15887l0);
            }
            if (m19227P2()) {
                m19239o0(rect, this.f15889n0);
                canvas.drawRect(this.f15889n0, this.f15887l0);
            }
            this.f15887l0.setColor(C0825b.m3101j(-65536, C11051p3.f31760d));
            m19237n0(rect, this.f15889n0);
            canvas.drawRect(this.f15889n0, this.f15887l0);
            this.f15887l0.setColor(C0825b.m3101j(-16711936, C11051p3.f31760d));
            m19240p0(rect, this.f15889n0);
            canvas.drawRect(this.f15889n0, this.f15887l0);
        }
    }

    /* renamed from: E0 */
    private void m19224E0(Canvas canvas, Rect rect) {
        boolean z;
        if (this.f15856J != null) {
            Paint.Align t0 = mo16122t0(rect, this.f15890o0);
            m19241r0(rect, this.f15889n0);
            if (this.f15892q0.mo16518d() != null) {
                this.f15892q0.mo16519e().drawableState = getState();
                this.f15892q0.mo16524j(this.f15885j0);
            }
            this.f15892q0.mo16519e().setTextAlign(t0);
            int i = 0;
            if (Math.round(this.f15892q0.mo16520f(mo16090h1().toString())) > Math.round(this.f15889n0.width())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f15889n0);
            }
            CharSequence charSequence = this.f15856J;
            if (z && this.f15855I0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f15892q0.mo16519e(), this.f15889n0.width(), this.f15855I0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f15890o0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f15892q0.mo16519e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: N2 */
    private boolean m19225N2() {
        return this.f15872W && this.f15873X != null && this.f15899x0;
    }

    /* renamed from: O2 */
    private boolean m19226O2() {
        return this.f15858K && this.f15860L != null;
    }

    /* renamed from: P2 */
    private boolean m19227P2() {
        return this.f15865P && this.f15866Q != null;
    }

    /* renamed from: Q2 */
    private void m19228Q2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: R2 */
    private void m19229R2() {
        this.f15851G0 = this.f15849F0 ? C7492b.m28457d(this.f15854I) : null;
    }

    /* renamed from: S2 */
    private void m19230S2() {
        this.f15867R = new RippleDrawable(C7492b.m28457d(mo16080f1()), this.f15866Q, f15839N0);
    }

    /* renamed from: Z0 */
    private float m19231Z0() {
        Drawable drawable;
        if (this.f15899x0) {
            drawable = this.f15873X;
        } else {
            drawable = this.f15860L;
        }
        float f = this.f15863N;
        if (f <= Utils.FLOAT_EPSILON && drawable != null) {
            f = (float) Math.ceil((double) C5089m.m19901b(this.f15885j0, 24));
            if (((float) drawable.getIntrinsicHeight()) <= f) {
                return (float) drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    /* renamed from: a1 */
    private float m19232a1() {
        Drawable drawable;
        if (this.f15899x0) {
            drawable = this.f15873X;
        } else {
            drawable = this.f15860L;
        }
        float f = this.f15863N;
        if (f > Utils.FLOAT_EPSILON || drawable == null) {
            return f;
        }
        return (float) drawable.getIntrinsicWidth();
    }

    /* renamed from: b2 */
    private void m19233b2(ColorStateList colorStateList) {
        if (this.f15842C != colorStateList) {
            this.f15842C = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: k0 */
    private void m19234k0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C0836a.m3151m(drawable, C0836a.m3144f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f15866Q) {
                if (drawable.isStateful()) {
                    drawable.setState(mo16064W0());
                }
                C0836a.m3153o(drawable, this.f15868S);
                return;
            }
            Drawable drawable2 = this.f15860L;
            if (drawable == drawable2 && this.f15864O) {
                C0836a.m3153o(drawable2, this.f15862M);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    /* renamed from: l0 */
    private void m19235l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m19226O2() || m19225N2()) {
            float f = this.f15877b0 + this.f15878c0;
            float a1 = m19232a1();
            if (C0836a.m3144f(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + a1;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - a1;
            }
            float Z0 = m19231Z0();
            float exactCenterY = rect.exactCenterY() - (Z0 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + Z0;
        }
    }

    /* renamed from: l1 */
    private ColorFilter m19236l1() {
        ColorFilter colorFilter = this.f15840A0;
        return colorFilter != null ? colorFilter : this.f15841B0;
    }

    /* renamed from: n0 */
    private void m19237n0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m19227P2()) {
            float f = this.f15884i0 + this.f15883h0 + this.f15869T + this.f15882g0 + this.f15881f0;
            if (C0836a.m3144f(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: n1 */
    private static boolean m19238n1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o0 */
    private void m19239o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m19227P2()) {
            float f = this.f15884i0 + this.f15883h0;
            if (C0836a.m3144f(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f15869T;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f15869T;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f15869T;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: p0 */
    private void m19240p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m19227P2()) {
            float f = this.f15884i0 + this.f15883h0 + this.f15869T + this.f15882g0 + this.f15881f0;
            if (C0836a.m3144f(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: r0 */
    private void m19241r0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f15856J != null) {
            float m0 = this.f15877b0 + mo16101m0() + this.f15880e0;
            float q0 = this.f15884i0 + mo16111q0() + this.f15881f0;
            if (C0836a.m3144f(this) == 0) {
                rectF.left = ((float) rect.left) + m0;
                rectF.right = ((float) rect.right) - q0;
            } else {
                rectF.left = ((float) rect.left) + q0;
                rectF.right = ((float) rect.right) - m0;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: r1 */
    private static boolean m19242r1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: s0 */
    private float m19243s0() {
        this.f15892q0.mo16519e().getFontMetrics(this.f15888m0);
        Paint.FontMetrics fontMetrics = this.f15888m0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: s1 */
    private static boolean m19244s1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: t1 */
    private static boolean m19245t1(C7344d dVar) {
        if (dVar == null || dVar.mo21720i() == null || !dVar.mo21720i().isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: u0 */
    private boolean m19246u0() {
        return this.f15872W && this.f15873X != null && this.f15871V;
    }

    /* renamed from: u1 */
    private void m19247u1(AttributeSet attributeSet, int i, int i2) {
        TypedArray i3 = C5088l.m19898i(this.f15885j0, attributeSet, C0082l.f430F0, i, i2, new int[0]);
        this.f15861L0 = i3.hasValue(C0082l.f794q1);
        m19233b2(C7343c.m28003a(this.f15885j0, i3, C0082l.f664d1));
        mo16023F1(C7343c.m28003a(this.f15885j0, i3, C0082l.f540Q0));
        mo16059T1(i3.getDimension(C0082l.f615Y0, Utils.FLOAT_EPSILON));
        int i4 = C0082l.f550R0;
        if (i3.hasValue(i4)) {
            mo16029H1(i3.getDimension(i4, Utils.FLOAT_EPSILON));
        }
        mo16067X1(C7343c.m28003a(this.f15885j0, i3, C0082l.f644b1));
        mo16070Z1(i3.getDimension(C0082l.f654c1, Utils.FLOAT_EPSILON));
        mo16132y2(C7343c.m28003a(this.f15885j0, i3, C0082l.f784p1));
        mo16019D2(i3.getText(C0082l.f480K0));
        C7344d g = C7343c.m28009g(this.f15885j0, i3, C0082l.f440G0);
        g.mo21723l(i3.getDimension(C0082l.f450H0, g.mo21721j()));
        mo16021E2(g);
        int i5 = i3.getInt(C0082l.f460I0, 0);
        if (i5 == 1) {
            mo16113q2(TextUtils.TruncateAt.START);
        } else if (i5 == 2) {
            mo16113q2(TextUtils.TruncateAt.MIDDLE);
        } else if (i5 == 3) {
            mo16113q2(TextUtils.TruncateAt.END);
        }
        mo16057S1(i3.getBoolean(C0082l.f606X0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            mo16057S1(i3.getBoolean(C0082l.f579U0, false));
        }
        mo16041L1(C7343c.m28007e(this.f15885j0, i3, C0082l.f570T0));
        int i6 = C0082l.f597W0;
        if (i3.hasValue(i6)) {
            mo16051P1(C7343c.m28003a(this.f15885j0, i3, i6));
        }
        mo16047N1(i3.getDimension(C0082l.f588V0, -1.0f));
        mo16106o2(i3.getBoolean(C0082l.f734k1, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            mo16106o2(i3.getBoolean(C0082l.f684f1, false));
        }
        mo16074c2(C7343c.m28007e(this.f15885j0, i3, C0082l.f674e1));
        mo16103m2(C7343c.m28003a(this.f15885j0, i3, C0082l.f724j1));
        mo16091h2(i3.getDimension(C0082l.f704h1, Utils.FLOAT_EPSILON));
        mo16129x1(i3.getBoolean(C0082l.f490L0, false));
        mo16020E1(i3.getBoolean(C0082l.f530P0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            mo16020E1(i3.getBoolean(C0082l.f510N0, false));
        }
        mo16133z1(C7343c.m28007e(this.f15885j0, i3, C0082l.f500M0));
        int i7 = C0082l.f520O0;
        if (i3.hasValue(i7)) {
            mo16014B1(C7343c.m28003a(this.f15885j0, i3, i7));
        }
        mo16015B2(C2173d.m8298c(this.f15885j0, i3, C0082l.f804r1));
        mo16114r2(C2173d.m8298c(this.f15885j0, i3, C0082l.f754m1));
        mo16063V1(i3.getDimension(C0082l.f634a1, Utils.FLOAT_EPSILON));
        mo16127v2(i3.getDimension(C0082l.f774o1, Utils.FLOAT_EPSILON));
        mo16123t2(i3.getDimension(C0082l.f764n1, Utils.FLOAT_EPSILON));
        mo16036J2(i3.getDimension(C0082l.f824t1, Utils.FLOAT_EPSILON));
        mo16027G2(i3.getDimension(C0082l.f814s1, Utils.FLOAT_EPSILON));
        mo16097j2(i3.getDimension(C0082l.f714i1, Utils.FLOAT_EPSILON));
        mo16079e2(i3.getDimension(C0082l.f694g1, Utils.FLOAT_EPSILON));
        mo16035J1(i3.getDimension(C0082l.f560S0, Utils.FLOAT_EPSILON));
        mo16130x2(i3.getDimensionPixelSize(C0082l.f470J0, Integer.MAX_VALUE));
        i3.recycle();
    }

    /* renamed from: v0 */
    public static C4983a m19248v0(Context context, AttributeSet attributeSet, int i, int i2) {
        C4983a aVar = new C4983a(context, attributeSet, i, i2);
        aVar.m19247u1(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: w0 */
    private void m19249w0(Canvas canvas, Rect rect) {
        if (m19225N2()) {
            m19235l0(rect, this.f15889n0);
            RectF rectF = this.f15889n0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f15873X.setBounds(0, 0, (int) this.f15889n0.width(), (int) this.f15889n0.height());
            this.f15873X.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: w1 */
    private boolean m19250w1(int[] iArr, int[] iArr2) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f15842C;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, this.f15893r0);
        } else {
            i = 0;
        }
        int l = mo22956l(i);
        boolean z5 = true;
        if (this.f15893r0 != l) {
            this.f15893r0 = l;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f15844D;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(iArr, this.f15894s0);
        } else {
            i2 = 0;
        }
        int l2 = mo22956l(i2);
        if (this.f15894s0 != l2) {
            this.f15894s0 = l2;
            onStateChange = true;
        }
        int g = C6170a.m24586g(l, l2);
        if (this.f15895t0 != g) {
            z = true;
        } else {
            z = false;
        }
        if (mo22965x() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            this.f15895t0 = g;
            mo22941X(ColorStateList.valueOf(g));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f15850G;
        if (colorStateList3 != null) {
            i3 = colorStateList3.getColorForState(iArr, this.f15896u0);
        } else {
            i3 = 0;
        }
        if (this.f15896u0 != i3) {
            this.f15896u0 = i3;
            onStateChange = true;
        }
        if (this.f15851G0 == null || !C7492b.m28458e(iArr)) {
            i4 = 0;
        } else {
            i4 = this.f15851G0.getColorForState(iArr, this.f15897v0);
        }
        if (this.f15897v0 != i4) {
            this.f15897v0 = i4;
            if (this.f15849F0) {
                onStateChange = true;
            }
        }
        if (this.f15892q0.mo16518d() == null || this.f15892q0.mo16518d().mo21720i() == null) {
            i5 = 0;
        } else {
            i5 = this.f15892q0.mo16518d().mo21720i().getColorForState(iArr, this.f15898w0);
        }
        if (this.f15898w0 != i5) {
            this.f15898w0 = i5;
            onStateChange = true;
        }
        if (!m19238n1(getState(), 16842912) || !this.f15871V) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.f15899x0 == z3 || this.f15873X == null) {
            z4 = false;
        } else {
            float m0 = mo16101m0();
            this.f15899x0 = z3;
            if (m0 != mo16101m0()) {
                onStateChange = true;
                z4 = true;
            } else {
                z4 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f15843C0;
        if (colorStateList4 != null) {
            i6 = colorStateList4.getColorForState(iArr, this.f15900y0);
        } else {
            i6 = 0;
        }
        if (this.f15900y0 != i6) {
            this.f15900y0 = i6;
            this.f15841B0 = C6477a.m25603g(this, this.f15843C0, this.f15845D0);
        } else {
            z5 = onStateChange;
        }
        if (m19244s1(this.f15860L)) {
            z5 |= this.f15860L.setState(iArr);
        }
        if (m19244s1(this.f15873X)) {
            z5 |= this.f15873X.setState(iArr);
        }
        if (m19244s1(this.f15866Q)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z5 |= this.f15866Q.setState(iArr3);
        }
        if (C7492b.f21801a && m19244s1(this.f15867R)) {
            z5 |= this.f15867R.setState(iArr2);
        }
        if (z5) {
            invalidateSelf();
        }
        if (z4) {
            mo16126v1();
        }
        return z5;
    }

    /* renamed from: x0 */
    private void m19251x0(Canvas canvas, Rect rect) {
        if (!this.f15861L0) {
            this.f15886k0.setColor(this.f15894s0);
            this.f15886k0.setStyle(Paint.Style.FILL);
            this.f15886k0.setColorFilter(m19236l1());
            this.f15889n0.set(rect);
            canvas.drawRoundRect(this.f15889n0, mo16031I0(), mo16031I0(), this.f15886k0);
        }
    }

    /* renamed from: y0 */
    private void m19252y0(Canvas canvas, Rect rect) {
        if (m19226O2()) {
            m19235l0(rect, this.f15889n0);
            RectF rectF = this.f15889n0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f15860L.setBounds(0, 0, (int) this.f15889n0.width(), (int) this.f15889n0.height());
            this.f15860L.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: z0 */
    private void m19253z0(Canvas canvas, Rect rect) {
        if (this.f15852H > Utils.FLOAT_EPSILON && !this.f15861L0) {
            this.f15886k0.setColor(this.f15896u0);
            this.f15886k0.setStyle(Paint.Style.STROKE);
            if (!this.f15861L0) {
                this.f15886k0.setColorFilter(m19236l1());
            }
            RectF rectF = this.f15889n0;
            float f = this.f15852H;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.f15848F - (this.f15852H / 2.0f);
            canvas.drawRoundRect(this.f15889n0, f2, f2, this.f15886k0);
        }
    }

    /* renamed from: A1 */
    public void mo16012A1(int i) {
        mo16133z1(C5769a.m23210b(this.f15885j0, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A2 */
    public void mo16013A2(boolean z) {
        this.f15857J0 = z;
    }

    /* renamed from: B1 */
    public void mo16014B1(ColorStateList colorStateList) {
        if (this.f15874Y != colorStateList) {
            this.f15874Y = colorStateList;
            if (m19246u0()) {
                C0836a.m3153o(this.f15873X, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: B2 */
    public void mo16015B2(C2173d dVar) {
        this.f15875Z = dVar;
    }

    /* renamed from: C1 */
    public void mo16016C1(int i) {
        mo16014B1(C5769a.m23209a(this.f15885j0, i));
    }

    /* renamed from: C2 */
    public void mo16017C2(int i) {
        mo16015B2(C2173d.m8299d(this.f15885j0, i));
    }

    /* renamed from: D1 */
    public void mo16018D1(int i) {
        mo16020E1(this.f15885j0.getResources().getBoolean(i));
    }

    /* renamed from: D2 */
    public void mo16019D2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f15856J, charSequence)) {
            this.f15856J = charSequence;
            this.f15892q0.mo16523i(true);
            invalidateSelf();
            mo16126v1();
        }
    }

    /* renamed from: E1 */
    public void mo16020E1(boolean z) {
        boolean z2;
        if (this.f15872W != z) {
            boolean N2 = m19225N2();
            this.f15872W = z;
            boolean N22 = m19225N2();
            if (N2 != N22) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (N22) {
                    m19234k0(this.f15873X);
                } else {
                    m19228Q2(this.f15873X);
                }
                invalidateSelf();
                mo16126v1();
            }
        }
    }

    /* renamed from: E2 */
    public void mo16021E2(C7344d dVar) {
        this.f15892q0.mo16522h(dVar, this.f15885j0);
    }

    /* renamed from: F0 */
    public Drawable mo16022F0() {
        return this.f15873X;
    }

    /* renamed from: F1 */
    public void mo16023F1(ColorStateList colorStateList) {
        if (this.f15844D != colorStateList) {
            this.f15844D = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: F2 */
    public void mo16024F2(int i) {
        mo16021E2(new C7344d(this.f15885j0, i));
    }

    /* renamed from: G0 */
    public ColorStateList mo16025G0() {
        return this.f15874Y;
    }

    /* renamed from: G1 */
    public void mo16026G1(int i) {
        mo16023F1(C5769a.m23209a(this.f15885j0, i));
    }

    /* renamed from: G2 */
    public void mo16027G2(float f) {
        if (this.f15881f0 != f) {
            this.f15881f0 = f;
            invalidateSelf();
            mo16126v1();
        }
    }

    /* renamed from: H0 */
    public ColorStateList mo16028H0() {
        return this.f15844D;
    }

    /* renamed from: H1 */
    public void mo16029H1(float f) {
        if (this.f15848F != f) {
            this.f15848F = f;
            setShapeAppearanceModel(mo22929D().mo22989w(f));
        }
    }

    /* renamed from: H2 */
    public void mo16030H2(int i) {
        mo16027G2(this.f15885j0.getResources().getDimension(i));
    }

    /* renamed from: I0 */
    public float mo16031I0() {
        return this.f15861L0 ? mo22930F() : this.f15848F;
    }

    /* renamed from: I1 */
    public void mo16032I1(int i) {
        mo16029H1(this.f15885j0.getResources().getDimension(i));
    }

    /* renamed from: I2 */
    public void mo16033I2(float f) {
        C7344d i1 = mo16092i1();
        if (i1 != null) {
            i1.mo21723l(f);
            this.f15892q0.mo16519e().setTextSize(f);
            mo15515a();
        }
    }

    /* renamed from: J0 */
    public float mo16034J0() {
        return this.f15884i0;
    }

    /* renamed from: J1 */
    public void mo16035J1(float f) {
        if (this.f15884i0 != f) {
            this.f15884i0 = f;
            invalidateSelf();
            mo16126v1();
        }
    }

    /* renamed from: J2 */
    public void mo16036J2(float f) {
        if (this.f15880e0 != f) {
            this.f15880e0 = f;
            invalidateSelf();
            mo16126v1();
        }
    }

    /* renamed from: K0 */
    public Drawable mo16037K0() {
        Drawable drawable = this.f15860L;
        if (drawable != null) {
            return C0836a.m3155q(drawable);
        }
        return null;
    }

    /* renamed from: K1 */
    public void mo16038K1(int i) {
        mo16035J1(this.f15885j0.getResources().getDimension(i));
    }

    /* renamed from: K2 */
    public void mo16039K2(int i) {
        mo16036J2(this.f15885j0.getResources().getDimension(i));
    }

    /* renamed from: L0 */
    public float mo16040L0() {
        return this.f15863N;
    }

    /* renamed from: L1 */
    public void mo16041L1(Drawable drawable) {
        Drawable drawable2;
        Drawable K0 = mo16037K0();
        if (K0 != drawable) {
            float m0 = mo16101m0();
            if (drawable != null) {
                drawable2 = C0836a.m3156r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f15860L = drawable2;
            float m02 = mo16101m0();
            m19228Q2(K0);
            if (m19226O2()) {
                m19234k0(this.f15860L);
            }
            invalidateSelf();
            if (m0 != m02) {
                mo16126v1();
            }
        }
    }

    /* renamed from: L2 */
    public void mo16042L2(boolean z) {
        if (this.f15849F0 != z) {
            this.f15849F0 = z;
            m19229R2();
            onStateChange(getState());
        }
    }

    /* renamed from: M0 */
    public ColorStateList mo16043M0() {
        return this.f15862M;
    }

    /* renamed from: M1 */
    public void mo16044M1(int i) {
        mo16041L1(C5769a.m23210b(this.f15885j0, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M2 */
    public boolean mo16045M2() {
        return this.f15857J0;
    }

    /* renamed from: N0 */
    public float mo16046N0() {
        return this.f15846E;
    }

    /* renamed from: N1 */
    public void mo16047N1(float f) {
        if (this.f15863N != f) {
            float m0 = mo16101m0();
            this.f15863N = f;
            float m02 = mo16101m0();
            invalidateSelf();
            if (m0 != m02) {
                mo16126v1();
            }
        }
    }

    /* renamed from: O0 */
    public float mo16048O0() {
        return this.f15877b0;
    }

    /* renamed from: O1 */
    public void mo16049O1(int i) {
        mo16047N1(this.f15885j0.getResources().getDimension(i));
    }

    /* renamed from: P0 */
    public ColorStateList mo16050P0() {
        return this.f15850G;
    }

    /* renamed from: P1 */
    public void mo16051P1(ColorStateList colorStateList) {
        this.f15864O = true;
        if (this.f15862M != colorStateList) {
            this.f15862M = colorStateList;
            if (m19226O2()) {
                C0836a.m3153o(this.f15860L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: Q0 */
    public float mo16052Q0() {
        return this.f15852H;
    }

    /* renamed from: Q1 */
    public void mo16053Q1(int i) {
        mo16051P1(C5769a.m23209a(this.f15885j0, i));
    }

    /* renamed from: R0 */
    public Drawable mo16054R0() {
        Drawable drawable = this.f15866Q;
        if (drawable != null) {
            return C0836a.m3155q(drawable);
        }
        return null;
    }

    /* renamed from: R1 */
    public void mo16055R1(int i) {
        mo16057S1(this.f15885j0.getResources().getBoolean(i));
    }

    /* renamed from: S0 */
    public CharSequence mo16056S0() {
        return this.f15870U;
    }

    /* renamed from: S1 */
    public void mo16057S1(boolean z) {
        boolean z2;
        if (this.f15858K != z) {
            boolean O2 = m19226O2();
            this.f15858K = z;
            boolean O22 = m19226O2();
            if (O2 != O22) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (O22) {
                    m19234k0(this.f15860L);
                } else {
                    m19228Q2(this.f15860L);
                }
                invalidateSelf();
                mo16126v1();
            }
        }
    }

    /* renamed from: T0 */
    public float mo16058T0() {
        return this.f15883h0;
    }

    /* renamed from: T1 */
    public void mo16059T1(float f) {
        if (this.f15846E != f) {
            this.f15846E = f;
            invalidateSelf();
            mo16126v1();
        }
    }

    /* renamed from: U0 */
    public float mo16060U0() {
        return this.f15869T;
    }

    /* renamed from: U1 */
    public void mo16061U1(int i) {
        mo16059T1(this.f15885j0.getResources().getDimension(i));
    }

    /* renamed from: V0 */
    public float mo16062V0() {
        return this.f15882g0;
    }

    /* renamed from: V1 */
    public void mo16063V1(float f) {
        if (this.f15877b0 != f) {
            this.f15877b0 = f;
            invalidateSelf();
            mo16126v1();
        }
    }

    /* renamed from: W0 */
    public int[] mo16064W0() {
        return this.f15847E0;
    }

    /* renamed from: W1 */
    public void mo16065W1(int i) {
        mo16063V1(this.f15885j0.getResources().getDimension(i));
    }

    /* renamed from: X0 */
    public ColorStateList mo16066X0() {
        return this.f15868S;
    }

    /* renamed from: X1 */
    public void mo16067X1(ColorStateList colorStateList) {
        if (this.f15850G != colorStateList) {
            this.f15850G = colorStateList;
            if (this.f15861L0) {
                mo22949f0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: Y0 */
    public void mo16068Y0(RectF rectF) {
        m19240p0(getBounds(), rectF);
    }

    /* renamed from: Y1 */
    public void mo16069Y1(int i) {
        mo16067X1(C5769a.m23209a(this.f15885j0, i));
    }

    /* renamed from: Z1 */
    public void mo16070Z1(float f) {
        if (this.f15852H != f) {
            this.f15852H = f;
            this.f15886k0.setStrokeWidth(f);
            if (this.f15861L0) {
                super.mo22950g0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo15515a() {
        mo16126v1();
        invalidateSelf();
    }

    /* renamed from: a2 */
    public void mo16071a2(int i) {
        mo16070Z1(this.f15885j0.getResources().getDimension(i));
    }

    /* renamed from: b1 */
    public TextUtils.TruncateAt mo16072b1() {
        return this.f15855I0;
    }

    /* renamed from: c1 */
    public C2173d mo16073c1() {
        return this.f15876a0;
    }

    /* renamed from: c2 */
    public void mo16074c2(Drawable drawable) {
        Drawable drawable2;
        Drawable R0 = mo16054R0();
        if (R0 != drawable) {
            float q0 = mo16111q0();
            if (drawable != null) {
                drawable2 = C0836a.m3156r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f15866Q = drawable2;
            if (C7492b.f21801a) {
                m19230S2();
            }
            float q02 = mo16111q0();
            m19228Q2(R0);
            if (m19227P2()) {
                m19234k0(this.f15866Q);
            }
            invalidateSelf();
            if (q0 != q02) {
                mo16126v1();
            }
        }
    }

    /* renamed from: d1 */
    public float mo16075d1() {
        return this.f15879d0;
    }

    /* renamed from: d2 */
    public void mo16076d2(CharSequence charSequence) {
        if (this.f15870U != charSequence) {
            this.f15870U = C0963a.m3446c().mo3424h(charSequence);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i2 = this.f15901z0;
            if (i2 < 255) {
                i = C5853a.m23534a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            } else {
                i = 0;
            }
            m19220A0(canvas, bounds);
            m19251x0(canvas, bounds);
            if (this.f15861L0) {
                super.draw(canvas);
            }
            m19253z0(canvas, bounds);
            m19222C0(canvas, bounds);
            m19252y0(canvas, bounds);
            m19249w0(canvas, bounds);
            if (this.f15857J0) {
                m19224E0(canvas, bounds);
            }
            m19221B0(canvas, bounds);
            m19223D0(canvas, bounds);
            if (this.f15901z0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e1 */
    public float mo16078e1() {
        return this.f15878c0;
    }

    /* renamed from: e2 */
    public void mo16079e2(float f) {
        if (this.f15883h0 != f) {
            this.f15883h0 = f;
            invalidateSelf();
            if (m19227P2()) {
                mo16126v1();
            }
        }
    }

    /* renamed from: f1 */
    public ColorStateList mo16080f1() {
        return this.f15854I;
    }

    /* renamed from: f2 */
    public void mo16081f2(int i) {
        mo16079e2(this.f15885j0.getResources().getDimension(i));
    }

    /* renamed from: g1 */
    public C2173d mo16082g1() {
        return this.f15875Z;
    }

    /* renamed from: g2 */
    public void mo16083g2(int i) {
        mo16074c2(C5769a.m23210b(this.f15885j0, i));
    }

    public int getAlpha() {
        return this.f15901z0;
    }

    public ColorFilter getColorFilter() {
        return this.f15840A0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f15846E;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f15877b0 + mo16101m0() + this.f15880e0 + this.f15892q0.mo16520f(mo16090h1().toString()) + this.f15881f0 + mo16111q0() + this.f15884i0), this.f15859K0);
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        if (this.f15861L0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f15848F);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f15848F);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: h1 */
    public CharSequence mo16090h1() {
        return this.f15856J;
    }

    /* renamed from: h2 */
    public void mo16091h2(float f) {
        if (this.f15869T != f) {
            this.f15869T = f;
            invalidateSelf();
            if (m19227P2()) {
                mo16126v1();
            }
        }
    }

    /* renamed from: i1 */
    public C7344d mo16092i1() {
        return this.f15892q0.mo16518d();
    }

    /* renamed from: i2 */
    public void mo16093i2(int i) {
        mo16091h2(this.f15885j0.getResources().getDimension(i));
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        if (m19242r1(this.f15842C) || m19242r1(this.f15844D) || m19242r1(this.f15850G) || ((this.f15849F0 && m19242r1(this.f15851G0)) || m19245t1(this.f15892q0.mo16518d()) || m19246u0() || m19244s1(this.f15860L) || m19244s1(this.f15873X) || m19242r1(this.f15843C0))) {
            return true;
        }
        return false;
    }

    /* renamed from: j1 */
    public float mo16096j1() {
        return this.f15881f0;
    }

    /* renamed from: j2 */
    public void mo16097j2(float f) {
        if (this.f15882g0 != f) {
            this.f15882g0 = f;
            invalidateSelf();
            if (m19227P2()) {
                mo16126v1();
            }
        }
    }

    /* renamed from: k1 */
    public float mo16098k1() {
        return this.f15880e0;
    }

    /* renamed from: k2 */
    public void mo16099k2(int i) {
        mo16097j2(this.f15885j0.getResources().getDimension(i));
    }

    /* renamed from: l2 */
    public boolean mo16100l2(int[] iArr) {
        if (Arrays.equals(this.f15847E0, iArr)) {
            return false;
        }
        this.f15847E0 = iArr;
        if (m19227P2()) {
            return m19250w1(getState(), iArr);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public float mo16101m0() {
        if (m19226O2() || m19225N2()) {
            return this.f15878c0 + m19232a1() + this.f15879d0;
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: m1 */
    public boolean mo16102m1() {
        return this.f15849F0;
    }

    /* renamed from: m2 */
    public void mo16103m2(ColorStateList colorStateList) {
        if (this.f15868S != colorStateList) {
            this.f15868S = colorStateList;
            if (m19227P2()) {
                C0836a.m3153o(this.f15866Q, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: n2 */
    public void mo16104n2(int i) {
        mo16103m2(C5769a.m23209a(this.f15885j0, i));
    }

    /* renamed from: o1 */
    public boolean mo16105o1() {
        return this.f15871V;
    }

    /* renamed from: o2 */
    public void mo16106o2(boolean z) {
        boolean z2;
        if (this.f15865P != z) {
            boolean P2 = m19227P2();
            this.f15865P = z;
            boolean P22 = m19227P2();
            if (P2 != P22) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (P22) {
                    m19234k0(this.f15866Q);
                } else {
                    m19228Q2(this.f15866Q);
                }
                invalidateSelf();
                mo16126v1();
            }
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m19226O2()) {
            onLayoutDirectionChanged |= C0836a.m3151m(this.f15860L, i);
        }
        if (m19225N2()) {
            onLayoutDirectionChanged |= C0836a.m3151m(this.f15873X, i);
        }
        if (m19227P2()) {
            onLayoutDirectionChanged |= C0836a.m3151m(this.f15866Q, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m19226O2()) {
            onLevelChange |= this.f15860L.setLevel(i);
        }
        if (m19225N2()) {
            onLevelChange |= this.f15873X.setLevel(i);
        }
        if (m19227P2()) {
            onLevelChange |= this.f15866Q.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f15861L0) {
            super.onStateChange(iArr);
        }
        return m19250w1(iArr, mo16064W0());
    }

    /* renamed from: p1 */
    public boolean mo16109p1() {
        return m19244s1(this.f15866Q);
    }

    /* renamed from: p2 */
    public void mo16110p2(C4984a aVar) {
        this.f15853H0 = new WeakReference(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public float mo16111q0() {
        if (m19227P2()) {
            return this.f15882g0 + this.f15869T + this.f15883h0;
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: q1 */
    public boolean mo16112q1() {
        return this.f15865P;
    }

    /* renamed from: q2 */
    public void mo16113q2(TextUtils.TruncateAt truncateAt) {
        this.f15855I0 = truncateAt;
    }

    /* renamed from: r2 */
    public void mo16114r2(C2173d dVar) {
        this.f15876a0 = dVar;
    }

    /* renamed from: s2 */
    public void mo16115s2(int i) {
        mo16114r2(C2173d.m8299d(this.f15885j0, i));
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f15901z0 != i) {
            this.f15901z0 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f15840A0 != colorFilter) {
            this.f15840A0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f15843C0 != colorStateList) {
            this.f15843C0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f15845D0 != mode) {
            this.f15845D0 = mode;
            this.f15841B0 = C6477a.m25603g(this, this.f15843C0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m19226O2()) {
            visible |= this.f15860L.setVisible(z, z2);
        }
        if (m19225N2()) {
            visible |= this.f15873X.setVisible(z, z2);
        }
        if (m19227P2()) {
            visible |= this.f15866Q.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public Paint.Align mo16122t0(Rect rect, PointF pointF) {
        pointF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f15856J != null) {
            float m0 = this.f15877b0 + mo16101m0() + this.f15880e0;
            if (C0836a.m3144f(this) == 0) {
                pointF.x = ((float) rect.left) + m0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - m0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m19243s0();
        }
        return align;
    }

    /* renamed from: t2 */
    public void mo16123t2(float f) {
        if (this.f15879d0 != f) {
            float m0 = mo16101m0();
            this.f15879d0 = f;
            float m02 = mo16101m0();
            invalidateSelf();
            if (m0 != m02) {
                mo16126v1();
            }
        }
    }

    /* renamed from: u2 */
    public void mo16124u2(int i) {
        mo16123t2(this.f15885j0.getResources().getDimension(i));
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v1 */
    public void mo16126v1() {
        C4984a aVar = (C4984a) this.f15853H0.get();
        if (aVar != null) {
            aVar.mo15866a();
        }
    }

    /* renamed from: v2 */
    public void mo16127v2(float f) {
        if (this.f15878c0 != f) {
            float m0 = mo16101m0();
            this.f15878c0 = f;
            float m02 = mo16101m0();
            invalidateSelf();
            if (m0 != m02) {
                mo16126v1();
            }
        }
    }

    /* renamed from: w2 */
    public void mo16128w2(int i) {
        mo16127v2(this.f15885j0.getResources().getDimension(i));
    }

    /* renamed from: x1 */
    public void mo16129x1(boolean z) {
        if (this.f15871V != z) {
            this.f15871V = z;
            float m0 = mo16101m0();
            if (!z && this.f15899x0) {
                this.f15899x0 = false;
            }
            float m02 = mo16101m0();
            invalidateSelf();
            if (m0 != m02) {
                mo16126v1();
            }
        }
    }

    /* renamed from: x2 */
    public void mo16130x2(int i) {
        this.f15859K0 = i;
    }

    /* renamed from: y1 */
    public void mo16131y1(int i) {
        mo16129x1(this.f15885j0.getResources().getBoolean(i));
    }

    /* renamed from: y2 */
    public void mo16132y2(ColorStateList colorStateList) {
        if (this.f15854I != colorStateList) {
            this.f15854I = colorStateList;
            m19229R2();
            onStateChange(getState());
        }
    }

    /* renamed from: z1 */
    public void mo16133z1(Drawable drawable) {
        if (this.f15873X != drawable) {
            float m0 = mo16101m0();
            this.f15873X = drawable;
            float m02 = mo16101m0();
            m19228Q2(this.f15873X);
            m19234k0(this.f15873X);
            invalidateSelf();
            if (m0 != m02) {
                mo16126v1();
            }
        }
    }

    /* renamed from: z2 */
    public void mo16134z2(int i) {
        mo16132y2(C5769a.m23209a(this.f15885j0, i));
    }
}

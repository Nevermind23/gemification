package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.text.C0990w;
import androidx.core.text.C0991x;
import androidx.core.util.C1008h;
import androidx.core.view.C1266x;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.internal.C5079g;
import p026b8.C2170a;
import p080f8.C6170a;
import p184n8.C7340a;
import p184n8.C7344d;
import p184n8.C7351i;
import p292w.C8720a;

/* renamed from: com.google.android.material.internal.a */
public final class C5071a {

    /* renamed from: t0 */
    private static final boolean f16148t0 = false;

    /* renamed from: u0 */
    private static final Paint f16149u0 = null;

    /* renamed from: A */
    private Typeface f16150A;

    /* renamed from: B */
    private Typeface f16151B;

    /* renamed from: C */
    private Typeface f16152C;

    /* renamed from: D */
    private C7340a f16153D;

    /* renamed from: E */
    private C7340a f16154E;

    /* renamed from: F */
    private TextUtils.TruncateAt f16155F = TextUtils.TruncateAt.END;

    /* renamed from: G */
    private CharSequence f16156G;

    /* renamed from: H */
    private CharSequence f16157H;

    /* renamed from: I */
    private boolean f16158I;

    /* renamed from: J */
    private boolean f16159J = true;

    /* renamed from: K */
    private boolean f16160K;

    /* renamed from: L */
    private Bitmap f16161L;

    /* renamed from: M */
    private Paint f16162M;

    /* renamed from: N */
    private float f16163N;

    /* renamed from: O */
    private float f16164O;

    /* renamed from: P */
    private float f16165P;

    /* renamed from: Q */
    private float f16166Q;

    /* renamed from: R */
    private float f16167R;

    /* renamed from: S */
    private int f16168S;

    /* renamed from: T */
    private int[] f16169T;

    /* renamed from: U */
    private boolean f16170U;

    /* renamed from: V */
    private final TextPaint f16171V;

    /* renamed from: W */
    private final TextPaint f16172W;

    /* renamed from: X */
    private TimeInterpolator f16173X;

    /* renamed from: Y */
    private TimeInterpolator f16174Y;

    /* renamed from: Z */
    private float f16175Z;

    /* renamed from: a */
    private final View f16176a;

    /* renamed from: a0 */
    private float f16177a0;

    /* renamed from: b */
    private float f16178b;

    /* renamed from: b0 */
    private float f16179b0;

    /* renamed from: c */
    private boolean f16180c;

    /* renamed from: c0 */
    private ColorStateList f16181c0;

    /* renamed from: d */
    private float f16182d;

    /* renamed from: d0 */
    private float f16183d0;

    /* renamed from: e */
    private float f16184e;

    /* renamed from: e0 */
    private float f16185e0;

    /* renamed from: f */
    private int f16186f;

    /* renamed from: f0 */
    private float f16187f0;

    /* renamed from: g */
    private final Rect f16188g;

    /* renamed from: g0 */
    private ColorStateList f16189g0;

    /* renamed from: h */
    private final Rect f16190h;

    /* renamed from: h0 */
    private float f16191h0;

    /* renamed from: i */
    private final RectF f16192i;

    /* renamed from: i0 */
    private float f16193i0;

    /* renamed from: j */
    private int f16194j = 16;

    /* renamed from: j0 */
    private float f16195j0;

    /* renamed from: k */
    private int f16196k = 16;

    /* renamed from: k0 */
    private StaticLayout f16197k0;

    /* renamed from: l */
    private float f16198l = 15.0f;

    /* renamed from: l0 */
    private float f16199l0;

    /* renamed from: m */
    private float f16200m = 15.0f;

    /* renamed from: m0 */
    private float f16201m0;

    /* renamed from: n */
    private ColorStateList f16202n;

    /* renamed from: n0 */
    private float f16203n0;

    /* renamed from: o */
    private ColorStateList f16204o;

    /* renamed from: o0 */
    private CharSequence f16205o0;

    /* renamed from: p */
    private int f16206p;

    /* renamed from: p0 */
    private int f16207p0 = 1;

    /* renamed from: q */
    private float f16208q;

    /* renamed from: q0 */
    private float f16209q0 = Utils.FLOAT_EPSILON;

    /* renamed from: r */
    private float f16210r;

    /* renamed from: r0 */
    private float f16211r0 = 1.0f;

    /* renamed from: s */
    private float f16212s;

    /* renamed from: s0 */
    private int f16213s0 = C5079g.f16231n;

    /* renamed from: t */
    private float f16214t;

    /* renamed from: u */
    private float f16215u;

    /* renamed from: v */
    private float f16216v;

    /* renamed from: w */
    private Typeface f16217w;

    /* renamed from: x */
    private Typeface f16218x;

    /* renamed from: y */
    private Typeface f16219y;

    /* renamed from: z */
    private Typeface f16220z;

    /* renamed from: com.google.android.material.internal.a$a */
    class C5072a implements C7340a.C7341a {
        C5072a() {
        }

        /* renamed from: a */
        public void mo16498a(Typeface typeface) {
            C5071a.this.mo16474h0(typeface);
        }
    }

    /* renamed from: com.google.android.material.internal.a$b */
    class C5073b implements C7340a.C7341a {
        C5073b() {
        }

        /* renamed from: a */
        public void mo16498a(Typeface typeface) {
            C5071a.this.mo16488s0(typeface);
        }
    }

    public C5071a(View view) {
        this.f16176a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f16171V = textPaint;
        this.f16172W = new TextPaint(textPaint);
        this.f16190h = new Rect();
        this.f16188g = new Rect();
        this.f16192i = new RectF();
        this.f16184e = m19774e();
        mo16466W(view.getContext().getResources().getConfiguration());
    }

    /* renamed from: K */
    private Layout.Alignment m19759K() {
        int b = C1266x.m4406b(this.f16194j, this.f16158I ? 1 : 0) & 7;
        if (b == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (b != 5) {
            if (this.f16158I) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        } else if (this.f16158I) {
            return Layout.Alignment.ALIGN_NORMAL;
        } else {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    /* renamed from: K0 */
    private boolean m19760K0() {
        return this.f16207p0 > 1 && (!this.f16158I || this.f16180c) && !this.f16160K;
    }

    /* renamed from: N */
    private void m19761N(TextPaint textPaint) {
        textPaint.setTextSize(this.f16200m);
        textPaint.setTypeface(this.f16217w);
        textPaint.setLetterSpacing(this.f16191h0);
    }

    /* renamed from: O */
    private void m19762O(TextPaint textPaint) {
        textPaint.setTextSize(this.f16198l);
        textPaint.setTypeface(this.f16220z);
        textPaint.setLetterSpacing(this.f16193i0);
    }

    /* renamed from: Q */
    private void m19763Q(float f) {
        Rect rect;
        if (this.f16180c) {
            RectF rectF = this.f16192i;
            if (f < this.f16184e) {
                rect = this.f16188g;
            } else {
                rect = this.f16190h;
            }
            rectF.set(rect);
            return;
        }
        this.f16192i.left = m19767V((float) this.f16188g.left, (float) this.f16190h.left, f, this.f16173X);
        this.f16192i.top = m19767V(this.f16208q, this.f16210r, f, this.f16173X);
        this.f16192i.right = m19767V((float) this.f16188g.right, (float) this.f16190h.right, f, this.f16173X);
        this.f16192i.bottom = m19767V((float) this.f16188g.bottom, (float) this.f16190h.bottom, f, this.f16173X);
    }

    /* renamed from: R */
    private static boolean m19764R(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    /* renamed from: S */
    private boolean m19765S() {
        return ViewCompat.m3541B(this.f16176a) == 1;
    }

    /* renamed from: U */
    private boolean m19766U(CharSequence charSequence, boolean z) {
        C0990w wVar;
        if (z) {
            wVar = C0991x.f3632d;
        } else {
            wVar = C0991x.f3631c;
        }
        return wVar.mo3433a(charSequence, 0, charSequence.length());
    }

    /* renamed from: V */
    private static float m19767V(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C2170a.m8290a(f, f2, f3);
    }

    /* renamed from: X */
    private float m19768X(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: a */
    private static int m19769a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), Math.round((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), Math.round((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), Math.round((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a0 */
    private static boolean m19770a0(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: b */
    private void m19771b(boolean z) {
        float f;
        int i;
        StaticLayout staticLayout;
        m19779i(1.0f, z);
        CharSequence charSequence = this.f16157H;
        if (!(charSequence == null || (staticLayout = this.f16197k0) == null)) {
            this.f16205o0 = TextUtils.ellipsize(charSequence, this.f16171V, (float) staticLayout.getWidth(), this.f16155F);
        }
        CharSequence charSequence2 = this.f16205o0;
        float f2 = Utils.FLOAT_EPSILON;
        if (charSequence2 != null) {
            this.f16199l0 = m19768X(this.f16171V, charSequence2);
        } else {
            this.f16199l0 = Utils.FLOAT_EPSILON;
        }
        int b = C1266x.m4406b(this.f16196k, this.f16158I ? 1 : 0);
        int i2 = b & 112;
        if (i2 == 48) {
            this.f16210r = (float) this.f16190h.top;
        } else if (i2 != 80) {
            this.f16210r = ((float) this.f16190h.centerY()) - ((this.f16171V.descent() - this.f16171V.ascent()) / 2.0f);
        } else {
            this.f16210r = ((float) this.f16190h.bottom) + this.f16171V.ascent();
        }
        int i3 = b & 8388615;
        if (i3 == 1) {
            this.f16214t = ((float) this.f16190h.centerX()) - (this.f16199l0 / 2.0f);
        } else if (i3 != 5) {
            this.f16214t = (float) this.f16190h.left;
        } else {
            this.f16214t = ((float) this.f16190h.right) - this.f16199l0;
        }
        m19779i(Utils.FLOAT_EPSILON, z);
        StaticLayout staticLayout2 = this.f16197k0;
        if (staticLayout2 != null) {
            f = (float) staticLayout2.getHeight();
        } else {
            f = 0.0f;
        }
        StaticLayout staticLayout3 = this.f16197k0;
        if (staticLayout3 == null || this.f16207p0 <= 1) {
            CharSequence charSequence3 = this.f16157H;
            if (charSequence3 != null) {
                f2 = m19768X(this.f16171V, charSequence3);
            }
        } else {
            f2 = (float) staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f16197k0;
        if (staticLayout4 != null) {
            i = staticLayout4.getLineCount();
        } else {
            i = 0;
        }
        this.f16206p = i;
        int b2 = C1266x.m4406b(this.f16194j, this.f16158I ? 1 : 0);
        int i4 = b2 & 112;
        if (i4 == 48) {
            this.f16208q = (float) this.f16188g.top;
        } else if (i4 != 80) {
            this.f16208q = ((float) this.f16188g.centerY()) - (f / 2.0f);
        } else {
            this.f16208q = (((float) this.f16188g.bottom) - f) + this.f16171V.descent();
        }
        int i5 = b2 & 8388615;
        if (i5 == 1) {
            this.f16212s = ((float) this.f16188g.centerX()) - (f2 / 2.0f);
        } else if (i5 != 5) {
            this.f16212s = (float) this.f16188g.left;
        } else {
            this.f16212s = ((float) this.f16188g.right) - f2;
        }
        m19781j();
        m19791y0(this.f16178b);
    }

    /* renamed from: c */
    private void m19772c() {
        m19777g(this.f16178b);
    }

    /* renamed from: d */
    private float m19773d(float f) {
        float f2 = this.f16184e;
        if (f <= f2) {
            return C2170a.m8291b(1.0f, Utils.FLOAT_EPSILON, this.f16182d, f2, f);
        }
        return C2170a.m8291b(Utils.FLOAT_EPSILON, 1.0f, f2, 1.0f, f);
    }

    /* renamed from: e */
    private float m19774e() {
        float f = this.f16182d;
        return f + ((1.0f - f) * 0.5f);
    }

    /* renamed from: e0 */
    private void m19775e0(float f) {
        this.f16201m0 = f;
        ViewCompat.m3601i0(this.f16176a);
    }

    /* renamed from: f */
    private boolean m19776f(CharSequence charSequence) {
        boolean S = m19765S();
        if (this.f16159J) {
            return m19766U(charSequence, S);
        }
        return S;
    }

    /* renamed from: g */
    private void m19777g(float f) {
        float f2;
        m19763Q(f);
        if (!this.f16180c) {
            this.f16215u = m19767V(this.f16212s, this.f16214t, f, this.f16173X);
            this.f16216v = m19767V(this.f16208q, this.f16210r, f, this.f16173X);
            m19791y0(f);
            f2 = f;
        } else if (f < this.f16184e) {
            this.f16215u = this.f16212s;
            this.f16216v = this.f16208q;
            m19791y0(Utils.FLOAT_EPSILON);
            f2 = 0.0f;
        } else {
            this.f16215u = this.f16214t;
            this.f16216v = this.f16210r - ((float) Math.max(0, this.f16186f));
            m19791y0(1.0f);
            f2 = 1.0f;
        }
        TimeInterpolator timeInterpolator = C2170a.f6351b;
        m19775e0(1.0f - m19767V(Utils.FLOAT_EPSILON, 1.0f, 1.0f - f, timeInterpolator));
        m19785o0(m19767V(1.0f, Utils.FLOAT_EPSILON, f, timeInterpolator));
        if (this.f16204o != this.f16202n) {
            this.f16171V.setColor(m19769a(m19790x(), mo16491v(), f2));
        } else {
            this.f16171V.setColor(mo16491v());
        }
        float f3 = this.f16191h0;
        float f4 = this.f16193i0;
        if (f3 != f4) {
            this.f16171V.setLetterSpacing(m19767V(f4, f3, f, timeInterpolator));
        } else {
            this.f16171V.setLetterSpacing(f3);
        }
        this.f16165P = m19767V(this.f16183d0, this.f16175Z, f, (TimeInterpolator) null);
        this.f16166Q = m19767V(this.f16185e0, this.f16177a0, f, (TimeInterpolator) null);
        this.f16167R = m19767V(this.f16187f0, this.f16179b0, f, (TimeInterpolator) null);
        int a = m19769a(m19789w(this.f16189g0), m19789w(this.f16181c0), f);
        this.f16168S = a;
        this.f16171V.setShadowLayer(this.f16165P, this.f16166Q, this.f16167R, a);
        if (this.f16180c) {
            this.f16171V.setAlpha((int) (m19773d(f) * ((float) this.f16171V.getAlpha())));
        }
        ViewCompat.m3601i0(this.f16176a);
    }

    /* renamed from: h */
    private void m19778h(float f) {
        m19779i(f, false);
    }

    /* renamed from: i */
    private void m19779i(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this.f16156G != null) {
            float width = (float) this.f16190h.width();
            float width2 = (float) this.f16188g.width();
            if (m19764R(f, 1.0f)) {
                f3 = this.f16200m;
                f2 = this.f16191h0;
                this.f16163N = 1.0f;
                typeface = this.f16217w;
            } else {
                float f4 = this.f16198l;
                float f5 = this.f16193i0;
                Typeface typeface2 = this.f16220z;
                if (m19764R(f, Utils.FLOAT_EPSILON)) {
                    this.f16163N = 1.0f;
                } else {
                    this.f16163N = m19767V(this.f16198l, this.f16200m, f, this.f16174Y) / this.f16198l;
                }
                float f6 = this.f16200m / this.f16198l;
                float f7 = width2 * f6;
                if (!z && f7 > width) {
                    width = Math.min(width / f6, width2);
                } else {
                    width = width2;
                }
                f3 = f4;
                f2 = f5;
                typeface = typeface2;
            }
            int i = 1;
            boolean z7 = false;
            if (width > Utils.FLOAT_EPSILON) {
                if (this.f16164O != f3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f16195j0 != f2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.f16152C != typeface) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                StaticLayout staticLayout = this.f16197k0;
                if (staticLayout == null || width == ((float) staticLayout.getWidth())) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z2 || z3 || z5 || z4 || this.f16170U) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.f16164O = f3;
                this.f16195j0 = f2;
                this.f16152C = typeface;
                this.f16170U = false;
                TextPaint textPaint = this.f16171V;
                if (this.f16163N != 1.0f) {
                    z7 = true;
                }
                textPaint.setLinearText(z7);
                z7 = z6;
            }
            if (this.f16157H == null || z7) {
                this.f16171V.setTextSize(this.f16164O);
                this.f16171V.setTypeface(this.f16152C);
                this.f16171V.setLetterSpacing(this.f16195j0);
                this.f16158I = m19776f(this.f16156G);
                if (m19760K0()) {
                    i = this.f16207p0;
                }
                StaticLayout k = m19782k(i, width, this.f16158I);
                this.f16197k0 = k;
                this.f16157H = k.getText();
            }
        }
    }

    /* renamed from: i0 */
    private boolean m19780i0(Typeface typeface) {
        C7340a aVar = this.f16154E;
        if (aVar != null) {
            aVar.mo21715c();
        }
        if (this.f16219y == typeface) {
            return false;
        }
        this.f16219y = typeface;
        Typeface b = C7351i.m28039b(this.f16176a.getContext().getResources().getConfiguration(), typeface);
        this.f16218x = b;
        if (b == null) {
            b = this.f16219y;
        }
        this.f16217w = b;
        return true;
    }

    /* renamed from: j */
    private void m19781j() {
        Bitmap bitmap = this.f16161L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f16161L = null;
        }
    }

    /* renamed from: k */
    private StaticLayout m19782k(int i, float f, boolean z) {
        Layout.Alignment alignment;
        StaticLayout staticLayout = null;
        if (i == 1) {
            try {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } catch (C5079g.C5080a e) {
                Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            }
        } else {
            alignment = m19759K();
        }
        staticLayout = C5079g.m19863b(this.f16156G, this.f16171V, (int) f).mo16511d(this.f16155F).mo16514g(z).mo16510c(alignment).mo16513f(false).mo16516i(i).mo16515h(this.f16209q0, this.f16211r0).mo16512e(this.f16213s0).mo16517j((C5081h) null).mo16509a();
        return (StaticLayout) C1008h.m3530g(staticLayout);
    }

    /* renamed from: m */
    private void m19783m(Canvas canvas, float f, float f2) {
        int alpha = this.f16171V.getAlpha();
        canvas.translate(f, f2);
        float f3 = (float) alpha;
        this.f16171V.setAlpha((int) (this.f16203n0 * f3));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint = this.f16171V;
            textPaint.setShadowLayer(this.f16165P, this.f16166Q, this.f16167R, C6170a.m24580a(this.f16168S, textPaint.getAlpha()));
        }
        Canvas canvas2 = canvas;
        this.f16197k0.draw(canvas);
        this.f16171V.setAlpha((int) (this.f16201m0 * f3));
        if (i >= 31) {
            TextPaint textPaint2 = this.f16171V;
            textPaint2.setShadowLayer(this.f16165P, this.f16166Q, this.f16167R, C6170a.m24580a(this.f16168S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f16197k0.getLineBaseline(0);
        CharSequence charSequence = this.f16205o0;
        float f4 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), Utils.FLOAT_EPSILON, f4, this.f16171V);
        if (i >= 31) {
            this.f16171V.setShadowLayer(this.f16165P, this.f16166Q, this.f16167R, this.f16168S);
        }
        if (!this.f16180c) {
            String trim = this.f16205o0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.f16171V.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f16197k0.getLineEnd(0), str.length()), Utils.FLOAT_EPSILON, f4, this.f16171V);
        }
    }

    /* renamed from: n */
    private void m19784n() {
        if (this.f16161L == null && !this.f16188g.isEmpty() && !TextUtils.isEmpty(this.f16157H)) {
            m19777g(Utils.FLOAT_EPSILON);
            int width = this.f16197k0.getWidth();
            int height = this.f16197k0.getHeight();
            if (width > 0 && height > 0) {
                this.f16161L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f16197k0.draw(new Canvas(this.f16161L));
                if (this.f16162M == null) {
                    this.f16162M = new Paint(3);
                }
            }
        }
    }

    /* renamed from: o0 */
    private void m19785o0(float f) {
        this.f16203n0 = f;
        ViewCompat.m3601i0(this.f16176a);
    }

    /* renamed from: s */
    private float m19786s(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) - (this.f16199l0 / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            if (this.f16158I) {
                return (float) this.f16190h.left;
            }
            return ((float) this.f16190h.right) - this.f16199l0;
        } else if (this.f16158I) {
            return ((float) this.f16190h.right) - this.f16199l0;
        } else {
            return (float) this.f16190h.left;
        }
    }

    /* renamed from: t */
    private float m19787t(RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) + (this.f16199l0 / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            if (this.f16158I) {
                return rectF.left + this.f16199l0;
            }
            return (float) this.f16190h.right;
        } else if (this.f16158I) {
            return (float) this.f16190h.right;
        } else {
            return rectF.left + this.f16199l0;
        }
    }

    /* renamed from: t0 */
    private boolean m19788t0(Typeface typeface) {
        C7340a aVar = this.f16153D;
        if (aVar != null) {
            aVar.mo21715c();
        }
        if (this.f16151B == typeface) {
            return false;
        }
        this.f16151B = typeface;
        Typeface b = C7351i.m28039b(this.f16176a.getContext().getResources().getConfiguration(), typeface);
        this.f16150A = b;
        if (b == null) {
            b = this.f16151B;
        }
        this.f16220z = b;
        return true;
    }

    /* renamed from: w */
    private int m19789w(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f16169T;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: x */
    private int m19790x() {
        return m19789w(this.f16202n);
    }

    /* renamed from: y0 */
    private void m19791y0(float f) {
        boolean z;
        m19778h(f);
        if (!f16148t0 || this.f16163N == 1.0f) {
            z = false;
        } else {
            z = true;
        }
        this.f16160K = z;
        if (z) {
            m19784n();
        }
        ViewCompat.m3601i0(this.f16176a);
    }

    /* renamed from: A */
    public int mo16442A() {
        return this.f16194j;
    }

    /* renamed from: A0 */
    public void mo16443A0(float f) {
        this.f16211r0 = f;
    }

    /* renamed from: B */
    public float mo16444B() {
        m19762O(this.f16172W);
        return -this.f16172W.ascent();
    }

    /* renamed from: B0 */
    public void mo16445B0(int i) {
        if (i != this.f16207p0) {
            this.f16207p0 = i;
            m19781j();
            mo16467Y();
        }
    }

    /* renamed from: C */
    public Typeface mo16446C() {
        Typeface typeface = this.f16220z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: C0 */
    public void mo16447C0(TimeInterpolator timeInterpolator) {
        this.f16173X = timeInterpolator;
        mo16467Y();
    }

    /* renamed from: D */
    public float mo16448D() {
        return this.f16178b;
    }

    /* renamed from: D0 */
    public void mo16449D0(boolean z) {
        this.f16159J = z;
    }

    /* renamed from: E */
    public float mo16450E() {
        return this.f16184e;
    }

    /* renamed from: E0 */
    public final boolean mo16451E0(int[] iArr) {
        this.f16169T = iArr;
        if (!mo16465T()) {
            return false;
        }
        mo16467Y();
        return true;
    }

    /* renamed from: F */
    public int mo16452F() {
        return this.f16213s0;
    }

    /* renamed from: F0 */
    public void mo16453F0(C5081h hVar) {
        if (hVar != null) {
            mo16468Z(true);
        }
    }

    /* renamed from: G */
    public int mo16454G() {
        StaticLayout staticLayout = this.f16197k0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    /* renamed from: G0 */
    public void mo16455G0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f16156G, charSequence)) {
            this.f16156G = charSequence;
            this.f16157H = null;
            m19781j();
            mo16467Y();
        }
    }

    /* renamed from: H */
    public float mo16456H() {
        return this.f16197k0.getSpacingAdd();
    }

    /* renamed from: H0 */
    public void mo16457H0(TimeInterpolator timeInterpolator) {
        this.f16174Y = timeInterpolator;
        mo16467Y();
    }

    /* renamed from: I */
    public float mo16458I() {
        return this.f16197k0.getSpacingMultiplier();
    }

    /* renamed from: I0 */
    public void mo16459I0(TextUtils.TruncateAt truncateAt) {
        this.f16155F = truncateAt;
        mo16467Y();
    }

    /* renamed from: J */
    public int mo16460J() {
        return this.f16207p0;
    }

    /* renamed from: J0 */
    public void mo16461J0(Typeface typeface) {
        boolean i0 = m19780i0(typeface);
        boolean t0 = m19788t0(typeface);
        if (i0 || t0) {
            mo16467Y();
        }
    }

    /* renamed from: L */
    public TimeInterpolator mo16462L() {
        return this.f16173X;
    }

    /* renamed from: M */
    public CharSequence mo16463M() {
        return this.f16156G;
    }

    /* renamed from: P */
    public TextUtils.TruncateAt mo16464P() {
        return this.f16155F;
    }

    /* renamed from: T */
    public final boolean mo16465T() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f16204o;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.f16202n) == null || !colorStateList.isStateful())) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    public void mo16466W(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f16219y;
            if (typeface != null) {
                this.f16218x = C7351i.m28039b(configuration, typeface);
            }
            Typeface typeface2 = this.f16151B;
            if (typeface2 != null) {
                this.f16150A = C7351i.m28039b(configuration, typeface2);
            }
            Typeface typeface3 = this.f16218x;
            if (typeface3 == null) {
                typeface3 = this.f16219y;
            }
            this.f16217w = typeface3;
            Typeface typeface4 = this.f16150A;
            if (typeface4 == null) {
                typeface4 = this.f16151B;
            }
            this.f16220z = typeface4;
            mo16468Z(true);
        }
    }

    /* renamed from: Y */
    public void mo16467Y() {
        mo16468Z(false);
    }

    /* renamed from: Z */
    public void mo16468Z(boolean z) {
        if ((this.f16176a.getHeight() > 0 && this.f16176a.getWidth() > 0) || z) {
            m19771b(z);
            m19772c();
        }
    }

    /* renamed from: b0 */
    public void mo16469b0(int i, int i2, int i3, int i4) {
        if (!m19770a0(this.f16190h, i, i2, i3, i4)) {
            this.f16190h.set(i, i2, i3, i4);
            this.f16170U = true;
        }
    }

    /* renamed from: c0 */
    public void mo16470c0(Rect rect) {
        mo16469b0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d0 */
    public void mo16471d0(int i) {
        C7344d dVar = new C7344d(this.f16176a.getContext(), i);
        if (dVar.mo21720i() != null) {
            this.f16204o = dVar.mo21720i();
        }
        if (dVar.mo21721j() != Utils.FLOAT_EPSILON) {
            this.f16200m = dVar.mo21721j();
        }
        ColorStateList colorStateList = dVar.f21538c;
        if (colorStateList != null) {
            this.f16181c0 = colorStateList;
        }
        this.f16177a0 = dVar.f21543h;
        this.f16179b0 = dVar.f21544i;
        this.f16175Z = dVar.f21545j;
        this.f16191h0 = dVar.f21547l;
        C7340a aVar = this.f16154E;
        if (aVar != null) {
            aVar.mo21715c();
        }
        this.f16154E = new C7340a(new C5072a(), dVar.mo21716e());
        dVar.mo21719h(this.f16176a.getContext(), this.f16154E);
        mo16467Y();
    }

    /* renamed from: f0 */
    public void mo16472f0(ColorStateList colorStateList) {
        if (this.f16204o != colorStateList) {
            this.f16204o = colorStateList;
            mo16467Y();
        }
    }

    /* renamed from: g0 */
    public void mo16473g0(int i) {
        if (this.f16196k != i) {
            this.f16196k = i;
            mo16467Y();
        }
    }

    /* renamed from: h0 */
    public void mo16474h0(Typeface typeface) {
        if (m19780i0(typeface)) {
            mo16467Y();
        }
    }

    /* renamed from: j0 */
    public void mo16475j0(int i) {
        this.f16186f = i;
    }

    /* renamed from: k0 */
    public void mo16476k0(int i, int i2, int i3, int i4) {
        if (!m19770a0(this.f16188g, i, i2, i3, i4)) {
            this.f16188g.set(i, i2, i3, i4);
            this.f16170U = true;
        }
    }

    /* renamed from: l */
    public void mo16477l(Canvas canvas) {
        boolean z;
        int save = canvas.save();
        if (this.f16157H != null && this.f16192i.width() > Utils.FLOAT_EPSILON && this.f16192i.height() > Utils.FLOAT_EPSILON) {
            this.f16171V.setTextSize(this.f16164O);
            float f = this.f16215u;
            float f2 = this.f16216v;
            if (!this.f16160K || this.f16161L == null) {
                z = false;
            } else {
                z = true;
            }
            float f3 = this.f16163N;
            if (f3 != 1.0f && !this.f16180c) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.f16161L, f, f2, this.f16162M);
                canvas.restoreToCount(save);
                return;
            }
            if (!m19760K0() || (this.f16180c && this.f16178b <= this.f16184e)) {
                canvas.translate(f, f2);
                this.f16197k0.draw(canvas);
            } else {
                m19783m(canvas, this.f16215u - ((float) this.f16197k0.getLineStart(0)), f2);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: l0 */
    public void mo16478l0(Rect rect) {
        mo16476k0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: m0 */
    public void mo16479m0(float f) {
        if (this.f16193i0 != f) {
            this.f16193i0 = f;
            mo16467Y();
        }
    }

    /* renamed from: n0 */
    public void mo16480n0(int i) {
        C7344d dVar = new C7344d(this.f16176a.getContext(), i);
        if (dVar.mo21720i() != null) {
            this.f16202n = dVar.mo21720i();
        }
        if (dVar.mo21721j() != Utils.FLOAT_EPSILON) {
            this.f16198l = dVar.mo21721j();
        }
        ColorStateList colorStateList = dVar.f21538c;
        if (colorStateList != null) {
            this.f16189g0 = colorStateList;
        }
        this.f16185e0 = dVar.f21543h;
        this.f16187f0 = dVar.f21544i;
        this.f16183d0 = dVar.f21545j;
        this.f16193i0 = dVar.f21547l;
        C7340a aVar = this.f16153D;
        if (aVar != null) {
            aVar.mo21715c();
        }
        this.f16153D = new C7340a(new C5073b(), dVar.mo21716e());
        dVar.mo21719h(this.f16176a.getContext(), this.f16153D);
        mo16467Y();
    }

    /* renamed from: o */
    public void mo16481o(RectF rectF, int i, int i2) {
        this.f16158I = m19776f(this.f16156G);
        rectF.left = Math.max(m19786s(i, i2), (float) this.f16190h.left);
        rectF.top = (float) this.f16190h.top;
        rectF.right = Math.min(m19787t(rectF, i, i2), (float) this.f16190h.right);
        rectF.bottom = ((float) this.f16190h.top) + mo16486r();
    }

    /* renamed from: p */
    public ColorStateList mo16482p() {
        return this.f16204o;
    }

    /* renamed from: p0 */
    public void mo16483p0(ColorStateList colorStateList) {
        if (this.f16202n != colorStateList) {
            this.f16202n = colorStateList;
            mo16467Y();
        }
    }

    /* renamed from: q */
    public int mo16484q() {
        return this.f16196k;
    }

    /* renamed from: q0 */
    public void mo16485q0(int i) {
        if (this.f16194j != i) {
            this.f16194j = i;
            mo16467Y();
        }
    }

    /* renamed from: r */
    public float mo16486r() {
        m19761N(this.f16172W);
        return -this.f16172W.ascent();
    }

    /* renamed from: r0 */
    public void mo16487r0(float f) {
        if (this.f16198l != f) {
            this.f16198l = f;
            mo16467Y();
        }
    }

    /* renamed from: s0 */
    public void mo16488s0(Typeface typeface) {
        if (m19788t0(typeface)) {
            mo16467Y();
        }
    }

    /* renamed from: u */
    public Typeface mo16489u() {
        Typeface typeface = this.f16217w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: u0 */
    public void mo16490u0(float f) {
        float a = C8720a.m32477a(f, Utils.FLOAT_EPSILON, 1.0f);
        if (a != this.f16178b) {
            this.f16178b = a;
            m19772c();
        }
    }

    /* renamed from: v */
    public int mo16491v() {
        return m19789w(this.f16204o);
    }

    /* renamed from: v0 */
    public void mo16492v0(boolean z) {
        this.f16180c = z;
    }

    /* renamed from: w0 */
    public void mo16493w0(float f) {
        this.f16182d = f;
        this.f16184e = m19774e();
    }

    /* renamed from: x0 */
    public void mo16494x0(int i) {
        this.f16213s0 = i;
    }

    /* renamed from: y */
    public int mo16495y() {
        return this.f16206p;
    }

    /* renamed from: z */
    public float mo16496z() {
        m19762O(this.f16172W);
        return (-this.f16172W.ascent()) + this.f16172W.descent();
    }

    /* renamed from: z0 */
    public void mo16497z0(float f) {
        this.f16209q0 = f;
    }
}

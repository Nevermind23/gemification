package p341ge.bog.mobilebank.p975ui.components.slidingmenu;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.core.view.C1174i1;
import androidx.core.view.C1248u0;
import androidx.core.widget.C1313n;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: ge.bog.mobilebank.ui.components.slidingmenu.a */
public class C35568a {

    /* renamed from: w */
    private static final Interpolator f85990w = new C35569a();

    /* renamed from: a */
    private int f85991a;

    /* renamed from: b */
    private int f85992b;

    /* renamed from: c */
    private int f85993c = -1;

    /* renamed from: d */
    private float[] f85994d;

    /* renamed from: e */
    private float[] f85995e;

    /* renamed from: f */
    private float[] f85996f;

    /* renamed from: g */
    private float[] f85997g;

    /* renamed from: h */
    private int[] f85998h;

    /* renamed from: i */
    private int[] f85999i;

    /* renamed from: j */
    private int[] f86000j;

    /* renamed from: k */
    private int f86001k;

    /* renamed from: l */
    private VelocityTracker f86002l;

    /* renamed from: m */
    private float f86003m;

    /* renamed from: n */
    private float f86004n;

    /* renamed from: o */
    private int f86005o;

    /* renamed from: p */
    private int f86006p;

    /* renamed from: q */
    private C1313n f86007q;

    /* renamed from: r */
    private final C35571c f86008r;

    /* renamed from: s */
    private View f86009s;

    /* renamed from: t */
    private boolean f86010t;

    /* renamed from: u */
    private final ViewGroup f86011u;

    /* renamed from: v */
    private final Runnable f86012v = new C35570b();

    /* renamed from: ge.bog.mobilebank.ui.components.slidingmenu.a$a */
    class C35569a implements Interpolator {
        C35569a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.components.slidingmenu.a$b */
    class C35570b implements Runnable {
        C35570b() {
        }

        public void run() {
            C35568a.this.mo86603F(0);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.components.slidingmenu.a$c */
    public static abstract class C35571c {
        /* renamed from: a */
        public int mo86621a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public abstract int mo86595b(View view, int i, int i2);

        /* renamed from: c */
        public int mo86622c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo86623d(View view) {
            return 0;
        }

        /* renamed from: e */
        public abstract int mo86596e(View view);

        /* renamed from: f */
        public void mo86624f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo86625g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo86626h(int i, int i2) {
        }

        /* renamed from: i */
        public abstract void mo86597i(View view, int i);

        /* renamed from: j */
        public abstract void mo86598j(int i);

        /* renamed from: k */
        public abstract void mo86599k(View view, int i, int i2, int i3, int i4);

        /* renamed from: l */
        public abstract void mo86600l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo86601m(View view, int i);
    }

    private C35568a(Context context, ViewGroup viewGroup, Interpolator interpolator, C35571c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f86011u = viewGroup;
            this.f86008r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f86005o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f85992b = viewConfiguration.getScaledTouchSlop();
            this.f86003m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f86004n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f86007q = C1313n.m4550c(context, interpolator == null ? f85990w : interpolator);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: B */
    private void m105624B() {
        this.f86002l.computeCurrentVelocity(1000, this.f86003m);
        m105638o(m105630f(C1174i1.m4257a(this.f86002l, this.f85993c), this.f86004n, this.f86003m), m105630f(C1174i1.m4258b(this.f86002l, this.f85993c), this.f86004n, this.f86003m));
    }

    /* renamed from: C */
    private void m105625C(float f, float f2, int i) {
        boolean d = m105628d(f, f2, i, 1);
        if (m105628d(f2, f, i, 4)) {
            d |= true;
        }
        if (m105628d(f, f2, i, 2)) {
            d |= true;
        }
        if (m105628d(f2, f, i, 8)) {
            d |= true;
        }
        if (d) {
            int[] iArr = this.f85999i;
            iArr[i] = iArr[i] | d;
            this.f86008r.mo86624f(d ? 1 : 0, i);
        }
    }

    /* renamed from: D */
    private void m105626D(float f, float f2, int i) {
        m105641r(i);
        float[] fArr = this.f85994d;
        this.f85996f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f85995e;
        this.f85997g[i] = f2;
        fArr2[i] = f2;
        this.f85998h[i] = m105643u((int) f, (int) f2);
        this.f86001k |= 1 << i;
    }

    /* renamed from: E */
    private void m105627E(MotionEvent motionEvent) {
        float[] fArr;
        int d = C1248u0.m4357d(motionEvent);
        for (int i = 0; i < d; i++) {
            int e = C1248u0.m4358e(motionEvent, i);
            float f = C1248u0.m4359f(motionEvent, i);
            float g = C1248u0.m4360g(motionEvent, i);
            float[] fArr2 = this.f85996f;
            if (fArr2 != null && (fArr = this.f85997g) != null && fArr2.length > e && fArr.length > e) {
                fArr2[e] = f;
                fArr[e] = g;
            }
        }
    }

    /* renamed from: d */
    private boolean m105628d(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f85998h[i] & i2) != i2 || (this.f86006p & i2) == 0 || (this.f86000j[i] & i2) == i2 || (this.f85999i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f85992b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f86008r.mo86625g(i2)) {
            int[] iArr = this.f86000j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f85999i[i] & i2) != 0 || abs <= ((float) this.f85992b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    private boolean m105629e(View view, float f, float f2) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.f86008r.mo86623d(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f86008r.mo86596e(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            int i = this.f85992b;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f85992b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f85992b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: f */
    private float m105630f(float f, float f2, float f3) {
        float abs = Math.abs(f);
        return abs < f2 ? Utils.FLOAT_EPSILON : abs > f3 ? f > Utils.FLOAT_EPSILON ? f3 : -f3 : f;
    }

    /* renamed from: g */
    private int m105631g(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: h */
    private void m105632h() {
        float[] fArr = this.f85994d;
        if (fArr != null) {
            Arrays.fill(fArr, Utils.FLOAT_EPSILON);
            Arrays.fill(this.f85995e, Utils.FLOAT_EPSILON);
            Arrays.fill(this.f85996f, Utils.FLOAT_EPSILON);
            Arrays.fill(this.f85997g, Utils.FLOAT_EPSILON);
            Arrays.fill(this.f85998h, 0);
            Arrays.fill(this.f85999i, 0);
            Arrays.fill(this.f86000j, 0);
            this.f86001k = 0;
        }
    }

    /* renamed from: i */
    private void m105633i(int i) {
        float[] fArr = this.f85994d;
        if (fArr != null && fArr.length > i) {
            fArr[i] = 0.0f;
            this.f85995e[i] = 0.0f;
            this.f85996f[i] = 0.0f;
            this.f85997g[i] = 0.0f;
            this.f85998h[i] = 0;
            this.f85999i[i] = 0;
            this.f86000j[i] = 0;
            this.f86001k = (~(1 << i)) & this.f86001k;
        }
    }

    /* renamed from: j */
    private int m105634j(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f86011u.getWidth();
        float f = (float) (width / 2);
        float p = f + (m105639p(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(p / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: k */
    private int m105635k(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int g = m105631g(i3, (int) this.f86004n, (int) this.f86003m);
        int g2 = m105631g(i4, (int) this.f86004n, (int) this.f86003m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(g);
        int abs4 = Math.abs(g2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (g != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (g2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m105634j(i, g, this.f86008r.mo86623d(view))) * f5) + (((float) m105634j(i2, g2, this.f86008r.mo86596e(view))) * f6));
    }

    /* renamed from: m */
    public static C35568a m105636m(ViewGroup viewGroup, float f, Interpolator interpolator, C35571c cVar) {
        C35568a n = m105637n(viewGroup, interpolator, cVar);
        n.f85992b = (int) (((float) n.f85992b) * (1.0f / f));
        return n;
    }

    /* renamed from: n */
    public static C35568a m105637n(ViewGroup viewGroup, Interpolator interpolator, C35571c cVar) {
        return new C35568a(viewGroup.getContext(), viewGroup, interpolator, cVar);
    }

    /* renamed from: o */
    private void m105638o(float f, float f2) {
        this.f86010t = true;
        this.f86008r.mo86600l(this.f86009s, f, f2);
        this.f86010t = false;
        if (this.f85991a == 1) {
            mo86603F(0);
        }
    }

    /* renamed from: p */
    private float m105639p(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    /* renamed from: q */
    private void m105640q(int i, int i2, int i3, int i4) {
        int left = this.f86009s.getLeft();
        int top = this.f86009s.getTop();
        if (i3 != 0) {
            i = this.f86008r.mo86621a(this.f86009s, i, i3);
            this.f86009s.offsetLeftAndRight(i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f86008r.mo86595b(this.f86009s, i2, i4);
            this.f86009s.offsetTopAndBottom(i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f86008r.mo86599k(this.f86009s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: r */
    private void m105641r(int i) {
        float[] fArr = this.f85994d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f85995e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f85996f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f85997g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f85998h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f85999i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f86000j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f85994d = fArr2;
            this.f85995e = fArr3;
            this.f85996f = fArr4;
            this.f85997g = fArr5;
            this.f85998h = iArr;
            this.f85999i = iArr2;
            this.f86000j = iArr3;
        }
    }

    /* renamed from: t */
    private boolean m105642t(int i, int i2, int i3, int i4) {
        int left = this.f86009s.getLeft();
        int top = this.f86009s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f86007q.mo3867a();
            mo86603F(0);
            return false;
        }
        this.f86007q.mo3874i(left, top, i5, i6, m105635k(this.f86009s, i5, i6, i3, i4));
        mo86603F(2);
        return true;
    }

    /* renamed from: u */
    private int m105643u(int i, int i2) {
        int i3;
        if (i < this.f86011u.getLeft() + this.f86005o) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f86011u.getTop() + this.f86005o) {
            i3 |= 4;
        }
        if (i > this.f86011u.getRight() - this.f86005o) {
            i3 |= 2;
        }
        if (i2 > this.f86011u.getBottom() - this.f86005o) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: A */
    public void mo86602A(MotionEvent motionEvent) {
        int i;
        int c = C1248u0.m4356c(motionEvent);
        int b = C1248u0.m4355b(motionEvent);
        if (c == 0) {
            mo86610b();
        }
        if (this.f86002l == null) {
            this.f86002l = VelocityTracker.obtain();
        }
        this.f86002l.addMovement(motionEvent);
        int i2 = 0;
        if (c == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int e = C1248u0.m4358e(motionEvent, 0);
            View s = mo86613s((int) x, (int) y);
            m105626D(x, y, e);
            mo86608K(s, e);
            int i3 = this.f85998h[e];
            int i4 = this.f86006p;
            if ((i3 & i4) != 0) {
                this.f86008r.mo86626h(i3 & i4, e);
            }
        } else if (c == 1) {
            if (this.f85991a == 1) {
                m105624B();
            }
            mo86610b();
        } else if (c != 2) {
            if (c == 3) {
                if (this.f85991a == 1) {
                    m105638o(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                }
                mo86610b();
            } else if (c == 5) {
                int e2 = C1248u0.m4358e(motionEvent, b);
                float f = C1248u0.m4359f(motionEvent, b);
                float g = C1248u0.m4360g(motionEvent, b);
                m105626D(f, g, e2);
                if (this.f85991a == 0) {
                    mo86608K(mo86613s((int) f, (int) g), e2);
                    int i5 = this.f85998h[e2];
                    int i6 = this.f86006p;
                    if ((i5 & i6) != 0) {
                        this.f86008r.mo86626h(i5 & i6, e2);
                    }
                } else if (mo86616x((int) f, (int) g)) {
                    mo86608K(this.f86009s, e2);
                }
            } else if (c == 6) {
                int e3 = C1248u0.m4358e(motionEvent, b);
                if (this.f85991a == 1 && e3 == this.f85993c) {
                    int d = C1248u0.m4357d(motionEvent);
                    while (true) {
                        if (i2 >= d) {
                            i = -1;
                            break;
                        }
                        int e4 = C1248u0.m4358e(motionEvent, i2);
                        if (e4 != this.f85993c) {
                            View s2 = mo86613s((int) C1248u0.m4359f(motionEvent, i2), (int) C1248u0.m4360g(motionEvent, i2));
                            View view = this.f86009s;
                            if (s2 == view && mo86608K(view, e4)) {
                                i = this.f85993c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m105624B();
                    }
                }
                m105633i(e3);
            }
        } else if (this.f85991a == 1) {
            int a = C1248u0.m4354a(motionEvent, this.f85993c);
            float f2 = C1248u0.m4359f(motionEvent, a);
            float g2 = C1248u0.m4360g(motionEvent, a);
            float[] fArr = this.f85996f;
            int i7 = this.f85993c;
            int i8 = (int) (f2 - fArr[i7]);
            int i9 = (int) (g2 - this.f85997g[i7]);
            m105640q(this.f86009s.getLeft() + i8, this.f86009s.getTop() + i9, i8, i9);
            m105627E(motionEvent);
        } else {
            int d2 = C1248u0.m4357d(motionEvent);
            while (i2 < d2) {
                int e5 = C1248u0.m4358e(motionEvent, i2);
                float f3 = C1248u0.m4359f(motionEvent, i2);
                float g3 = C1248u0.m4360g(motionEvent, i2);
                float f4 = f3 - this.f85994d[e5];
                float f5 = g3 - this.f85995e[e5];
                m105625C(f4, f5, e5);
                if (this.f85991a != 1) {
                    View s3 = mo86613s((int) this.f85994d[e5], (int) this.f85995e[e5]);
                    if (m105629e(s3, f4, f5) && mo86608K(s3, e5)) {
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            m105627E(motionEvent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo86603F(int i) {
        if (this.f85991a != i) {
            this.f85991a = i;
            this.f86008r.mo86598j(i);
            if (this.f85991a == 0) {
                this.f86009s = null;
            }
        }
    }

    /* renamed from: G */
    public void mo86604G(float f) {
        this.f86004n = f;
    }

    /* renamed from: H */
    public boolean mo86605H(int i, int i2) {
        if (this.f86010t) {
            return m105642t(i, i2, (int) C1174i1.m4257a(this.f86002l, this.f85993c), (int) C1174i1.m4258b(this.f86002l, this.f85993c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: I */
    public boolean mo86606I(MotionEvent motionEvent) {
        View s;
        int c = C1248u0.m4356c(motionEvent);
        int b = C1248u0.m4355b(motionEvent);
        if (c == 0) {
            mo86610b();
        }
        if (this.f86002l == null) {
            this.f86002l = VelocityTracker.obtain();
        }
        this.f86002l.addMovement(motionEvent);
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    int d = C1248u0.m4357d(motionEvent);
                    for (int i = 0; i < d && this.f85994d != null && this.f85995e != null; i++) {
                        int e = C1248u0.m4358e(motionEvent, i);
                        if (e < this.f85994d.length && e < this.f85995e.length) {
                            float f = C1248u0.m4359f(motionEvent, i);
                            float g = C1248u0.m4360g(motionEvent, i);
                            float f2 = f - this.f85994d[e];
                            float f3 = g - this.f85995e[e];
                            m105625C(f2, f3, e);
                            if (this.f85991a == 1) {
                                break;
                            }
                            View s2 = mo86613s((int) this.f85994d[e], (int) this.f85995e[e]);
                            if (s2 != null && m105629e(s2, f2, f3) && mo86608K(s2, e)) {
                                break;
                            }
                        }
                    }
                    m105627E(motionEvent);
                } else if (c != 3) {
                    if (c == 5) {
                        int e2 = C1248u0.m4358e(motionEvent, b);
                        float f4 = C1248u0.m4359f(motionEvent, b);
                        float g2 = C1248u0.m4360g(motionEvent, b);
                        m105626D(f4, g2, e2);
                        int i2 = this.f85991a;
                        if (i2 == 0) {
                            int i3 = this.f85998h[e2];
                            int i4 = this.f86006p;
                            if ((i3 & i4) != 0) {
                                this.f86008r.mo86626h(i3 & i4, e2);
                            }
                        } else if (i2 == 2 && (s = mo86613s((int) f4, (int) g2)) == this.f86009s) {
                            mo86608K(s, e2);
                        }
                    } else if (c == 6) {
                        m105633i(C1248u0.m4358e(motionEvent, b));
                    }
                }
            }
            mo86610b();
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int e3 = C1248u0.m4358e(motionEvent, 0);
            m105626D(x, y, e3);
            View s3 = mo86613s((int) x, (int) y);
            if (s3 == this.f86009s && this.f85991a == 2) {
                mo86608K(s3, e3);
            }
            int i5 = this.f85998h[e3];
            int i6 = this.f86006p;
            if ((i5 & i6) != 0) {
                this.f86008r.mo86626h(i5 & i6, e3);
            }
        }
        if (this.f85991a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public boolean mo86607J(View view, int i, int i2) {
        this.f86009s = view;
        this.f85993c = -1;
        return m105642t(i, i2, 0, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo86608K(View view, int i) {
        if (view == this.f86009s && this.f85993c == i) {
            return true;
        }
        if (view == null || !this.f86008r.mo86601m(view, i)) {
            return false;
        }
        this.f85993c = i;
        mo86611c(view, i);
        return true;
    }

    /* renamed from: a */
    public void mo86609a() {
        mo86610b();
        if (this.f85991a == 2) {
            int d = this.f86007q.mo3869d();
            int e = this.f86007q.mo3870e();
            this.f86007q.mo3867a();
            int d2 = this.f86007q.mo3869d();
            int e2 = this.f86007q.mo3870e();
            this.f86008r.mo86599k(this.f86009s, d2, e2, d2 - d, e2 - e);
        }
        mo86603F(0);
    }

    /* renamed from: b */
    public void mo86610b() {
        this.f85993c = -1;
        m105632h();
        VelocityTracker velocityTracker = this.f86002l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f86002l = null;
        }
    }

    /* renamed from: c */
    public void mo86611c(View view, int i) {
        if (view.getParent() == this.f86011u) {
            this.f86009s = view;
            this.f85993c = i;
            this.f86008r.mo86597i(view, i);
            mo86603F(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f86011u + ")");
    }

    /* renamed from: l */
    public boolean mo86612l(boolean z) {
        if (this.f86009s == null) {
            return false;
        }
        if (this.f85991a == 2) {
            boolean b = this.f86007q.mo3868b();
            int d = this.f86007q.mo3869d();
            int e = this.f86007q.mo3870e();
            int left = d - this.f86009s.getLeft();
            int top = e - this.f86009s.getTop();
            if (b || top == 0) {
                if (left != 0) {
                    this.f86009s.offsetLeftAndRight(left);
                }
                if (top != 0) {
                    this.f86009s.offsetTopAndBottom(top);
                }
                if (!(left == 0 && top == 0)) {
                    this.f86008r.mo86599k(this.f86009s, d, e, left, top);
                }
                if (b && d == this.f86007q.mo3871f() && e == this.f86007q.mo3872g()) {
                    this.f86007q.mo3867a();
                    b = this.f86007q.mo3873h();
                }
                if (!b) {
                    if (z) {
                        this.f86011u.post(this.f86012v);
                    } else {
                        mo86603F(0);
                    }
                }
            } else {
                this.f86009s.setTop(0);
                return true;
            }
        }
        if (this.f85991a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public View mo86613s(int i, int i2) {
        for (int childCount = this.f86011u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f86011u.getChildAt(this.f86008r.mo86622c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: v */
    public int mo86614v() {
        return this.f85992b;
    }

    /* renamed from: w */
    public int mo86615w() {
        return this.f85991a;
    }

    /* renamed from: x */
    public boolean mo86616x(int i, int i2) {
        return mo86618z(this.f86009s, i, i2);
    }

    /* renamed from: y */
    public boolean mo86617y() {
        return this.f85991a == 1;
    }

    /* renamed from: z */
    public boolean mo86618z(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }
}

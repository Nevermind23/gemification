package p001a0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: a0.d */
public class C0011d {

    /* renamed from: x */
    private static final Interpolator f20x = new C0012a();

    /* renamed from: a */
    private int f21a;

    /* renamed from: b */
    private int f22b;

    /* renamed from: c */
    private int f23c = -1;

    /* renamed from: d */
    private float[] f24d;

    /* renamed from: e */
    private float[] f25e;

    /* renamed from: f */
    private float[] f26f;

    /* renamed from: g */
    private float[] f27g;

    /* renamed from: h */
    private int[] f28h;

    /* renamed from: i */
    private int[] f29i;

    /* renamed from: j */
    private int[] f30j;

    /* renamed from: k */
    private int f31k;

    /* renamed from: l */
    private VelocityTracker f32l;

    /* renamed from: m */
    private float f33m;

    /* renamed from: n */
    private float f34n;

    /* renamed from: o */
    private int f35o;

    /* renamed from: p */
    private final int f36p;

    /* renamed from: q */
    private int f37q;

    /* renamed from: r */
    private OverScroller f38r;

    /* renamed from: s */
    private final C0014c f39s;

    /* renamed from: t */
    private View f40t;

    /* renamed from: u */
    private boolean f41u;

    /* renamed from: v */
    private final ViewGroup f42v;

    /* renamed from: w */
    private final Runnable f43w = new C0013b();

    /* renamed from: a0.d$a */
    class C0012a implements Interpolator {
        C0012a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: a0.d$b */
    class C0013b implements Runnable {
        C0013b() {
        }

        public void run() {
            C0011d.this.mo39F(0);
        }
    }

    /* renamed from: a0.d$c */
    public static abstract class C0014c {
        public abstract int clampViewPositionHorizontal(View view, int i, int i2);

        public abstract int clampViewPositionVertical(View view, int i, int i2);

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public int getViewHorizontalDragRange(View view) {
            return 0;
        }

        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(View view, int i) {
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        }

        public void onViewReleased(View view, float f, float f2) {
        }

        public abstract boolean tryCaptureView(View view, int i);
    }

    private C0011d(Context context, ViewGroup viewGroup, C0014c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f42v = viewGroup;
            this.f39s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f36p = i;
            this.f35o = i;
            this.f22b = viewConfiguration.getScaledTouchSlop();
            this.f33m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f34n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f38r = new OverScroller(context, f20x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: B */
    private void m68B() {
        this.f32l.computeCurrentVelocity(1000, this.f33m);
        m82n(m74e(this.f32l.getXVelocity(this.f23c), this.f34n, this.f33m), m74e(this.f32l.getYVelocity(this.f23c), this.f34n, this.f33m));
    }

    /* renamed from: C */
    private void m69C(float f, float f2, int i) {
        boolean c = m72c(f, f2, i, 1);
        if (m72c(f2, f, i, 4)) {
            c |= true;
        }
        if (m72c(f, f2, i, 2)) {
            c |= true;
        }
        if (m72c(f2, f, i, 8)) {
            c |= true;
        }
        if (c) {
            int[] iArr = this.f29i;
            iArr[i] = iArr[i] | c;
            this.f39s.onEdgeDragStarted(c ? 1 : 0, i);
        }
    }

    /* renamed from: D */
    private void m70D(float f, float f2, int i) {
        m85q(i);
        float[] fArr = this.f24d;
        this.f26f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f25e;
        this.f27g[i] = f2;
        fArr2[i] = f2;
        this.f28h[i] = m87t((int) f, (int) f2);
        this.f31k |= 1 << i;
    }

    /* renamed from: E */
    private void m71E(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m88y(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f26f[pointerId] = x;
                this.f27g[pointerId] = y;
            }
        }
    }

    /* renamed from: c */
    private boolean m72c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f28h[i] & i2) != i2 || (this.f37q & i2) == 0 || (this.f30j[i] & i2) == i2 || (this.f29i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f22b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f39s.onEdgeLock(i2)) {
            int[] iArr = this.f30j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f29i[i] & i2) != 0 || abs <= ((float) this.f22b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    private boolean m73d(View view, float f, float f2) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.f39s.getViewHorizontalDragRange(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f39s.getViewVerticalDragRange(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            int i = this.f22b;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f22b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f22b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    private float m74e(float f, float f2, float f3) {
        float abs = Math.abs(f);
        return abs < f2 ? Utils.FLOAT_EPSILON : abs > f3 ? f > Utils.FLOAT_EPSILON ? f3 : -f3 : f;
    }

    /* renamed from: f */
    private int m75f(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: g */
    private void m76g() {
        float[] fArr = this.f24d;
        if (fArr != null) {
            Arrays.fill(fArr, Utils.FLOAT_EPSILON);
            Arrays.fill(this.f25e, Utils.FLOAT_EPSILON);
            Arrays.fill(this.f26f, Utils.FLOAT_EPSILON);
            Arrays.fill(this.f27g, Utils.FLOAT_EPSILON);
            Arrays.fill(this.f28h, 0);
            Arrays.fill(this.f29i, 0);
            Arrays.fill(this.f30j, 0);
            this.f31k = 0;
        }
    }

    /* renamed from: h */
    private void m77h(int i) {
        if (this.f24d != null && mo51x(i)) {
            this.f24d[i] = 0.0f;
            this.f25e[i] = 0.0f;
            this.f26f[i] = 0.0f;
            this.f27g[i] = 0.0f;
            this.f28h[i] = 0;
            this.f29i[i] = 0;
            this.f30j[i] = 0;
            this.f31k = (~(1 << i)) & this.f31k;
        }
    }

    /* renamed from: i */
    private int m78i(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f42v.getWidth();
        float f = (float) (width / 2);
        float o = f + (m83o(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(o / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: j */
    private int m79j(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int f5 = m75f(i3, (int) this.f34n, (int) this.f33m);
        int f6 = m75f(i4, (int) this.f34n, (int) this.f33m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(f5);
        int abs4 = Math.abs(f6);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (f5 != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f7 = f2 / f;
        if (f6 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f8 = f4 / f3;
        return (int) ((((float) m78i(i, f5, this.f39s.getViewHorizontalDragRange(view))) * f7) + (((float) m78i(i2, f6, this.f39s.getViewVerticalDragRange(view))) * f8));
    }

    /* renamed from: l */
    public static C0011d m80l(ViewGroup viewGroup, float f, C0014c cVar) {
        C0011d m = m81m(viewGroup, cVar);
        m.f22b = (int) (((float) m.f22b) * (1.0f / f));
        return m;
    }

    /* renamed from: m */
    public static C0011d m81m(ViewGroup viewGroup, C0014c cVar) {
        return new C0011d(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: n */
    private void m82n(float f, float f2) {
        this.f41u = true;
        this.f39s.onViewReleased(this.f40t, f, f2);
        this.f41u = false;
        if (this.f21a == 1) {
            mo39F(0);
        }
    }

    /* renamed from: o */
    private float m83o(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: p */
    private void m84p(int i, int i2, int i3, int i4) {
        int left = this.f40t.getLeft();
        int top = this.f40t.getTop();
        if (i3 != 0) {
            i = this.f39s.clampViewPositionHorizontal(this.f40t, i, i3);
            ViewCompat.m3587b0(this.f40t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f39s.clampViewPositionVertical(this.f40t, i2, i4);
            ViewCompat.m3589c0(this.f40t, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f39s.onViewPositionChanged(this.f40t, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: q */
    private void m85q(int i) {
        float[] fArr = this.f24d;
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
                float[] fArr6 = this.f25e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f26f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f27g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f28h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f29i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f30j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f24d = fArr2;
            this.f25e = fArr3;
            this.f26f = fArr4;
            this.f27g = fArr5;
            this.f28h = iArr;
            this.f29i = iArr2;
            this.f30j = iArr3;
        }
    }

    /* renamed from: s */
    private boolean m86s(int i, int i2, int i3, int i4) {
        int left = this.f40t.getLeft();
        int top = this.f40t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f38r.abortAnimation();
            mo39F(0);
            return false;
        }
        this.f38r.startScroll(left, top, i5, i6, m79j(this.f40t, i5, i6, i3, i4));
        mo39F(2);
        return true;
    }

    /* renamed from: t */
    private int m87t(int i, int i2) {
        int i3;
        if (i < this.f42v.getLeft() + this.f35o) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f42v.getTop() + this.f35o) {
            i3 |= 4;
        }
        if (i > this.f42v.getRight() - this.f35o) {
            i3 |= 2;
        }
        if (i2 > this.f42v.getBottom() - this.f35o) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: y */
    private boolean m88y(int i) {
        if (mo51x(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: A */
    public void mo38A(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo44a();
        }
        if (this.f32l == null) {
            this.f32l = VelocityTracker.obtain();
        }
        this.f32l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r = mo47r((int) x, (int) y);
            m70D(x, y, pointerId);
            mo43J(r, pointerId);
            int i3 = this.f28h[pointerId];
            int i4 = this.f37q;
            if ((i3 & i4) != 0) {
                this.f39s.onEdgeTouched(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f21a == 1) {
                m68B();
            }
            mo44a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f21a == 1) {
                    m82n(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                }
                mo44a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m70D(x2, y2, pointerId2);
                if (this.f21a == 0) {
                    mo43J(mo47r((int) x2, (int) y2), pointerId2);
                    int i5 = this.f28h[pointerId2];
                    int i6 = this.f37q;
                    if ((i5 & i6) != 0) {
                        this.f39s.onEdgeTouched(i5 & i6, pointerId2);
                    }
                } else if (mo50w((int) x2, (int) y2)) {
                    mo43J(this.f40t, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f21a == 1 && pointerId3 == this.f23c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f23c) {
                            View r2 = mo47r((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f40t;
                            if (r2 == view && mo43J(view, pointerId4)) {
                                i = this.f23c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m68B();
                    }
                }
                m77h(pointerId3);
            }
        } else if (this.f21a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (m88y(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f24d[pointerId5];
                    float f2 = y3 - this.f25e[pointerId5];
                    m69C(f, f2, pointerId5);
                    if (this.f21a != 1) {
                        View r3 = mo47r((int) x3, (int) y3);
                        if (m73d(r3, f, f2) && mo43J(r3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m71E(motionEvent);
        } else if (m88y(this.f23c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f23c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f26f;
            int i7 = this.f23c;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.f27g[i7]);
            m84p(this.f40t.getLeft() + i8, this.f40t.getTop() + i9, i8, i9);
            m71E(motionEvent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo39F(int i) {
        this.f42v.removeCallbacks(this.f43w);
        if (this.f21a != i) {
            this.f21a = i;
            this.f39s.onViewDragStateChanged(i);
            if (this.f21a == 0) {
                this.f40t = null;
            }
        }
    }

    /* renamed from: G */
    public boolean mo40G(int i, int i2) {
        if (this.f41u) {
            return m86s(i, i2, (int) this.f32l.getXVelocity(this.f23c), (int) this.f32l.getYVelocity(this.f23c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo41H(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo44a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f32l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f32l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f32l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m77h(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m70D(r7, r1, r2)
            int r3 = r0.f21a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f28h
            r1 = r1[r2]
            int r3 = r0.f37q
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            a0.d$c r4 = r0.f39s
            r1 = r1 & r3
            r4.onEdgeTouched(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo47r(r3, r1)
            android.view.View r3 = r0.f40t
            if (r1 != r3) goto L_0x0031
            r0.mo43J(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f24d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f25e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m88y(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f24d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f25e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo47r(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.m73d(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = r6
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            a0.d$c r14 = r0.f39s
            int r12 = r14.clampViewPositionHorizontal(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            a0.d$c r5 = r0.f39s
            int r5 = r5.clampViewPositionVertical(r7, r15, r14)
            a0.d$c r14 = r0.f39s
            int r14 = r14.getViewHorizontalDragRange(r7)
            a0.d$c r15 = r0.f39s
            int r15 = r15.getViewVerticalDragRange(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.m69C(r9, r10, r4)
            int r5 = r0.f21a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo43J(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.m71E(r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo44a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m70D(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo47r(r2, r3)
            android.view.View r3 = r0.f40t
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f21a
            if (r3 != r4) goto L_0x0125
            r0.mo43J(r2, r1)
        L_0x0125:
            int[] r2 = r0.f28h
            r2 = r2[r1]
            int r3 = r0.f37q
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            a0.d$c r4 = r0.f39s
            r2 = r2 & r3
            r4.onEdgeTouched(r2, r1)
        L_0x0135:
            int r1 = r0.f21a
            if (r1 != r6) goto L_0x013a
            r5 = r6
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p001a0.C0011d.mo41H(android.view.MotionEvent):boolean");
    }

    /* renamed from: I */
    public boolean mo42I(View view, int i, int i2) {
        this.f40t = view;
        this.f23c = -1;
        boolean s = m86s(i, i2, 0, 0);
        if (!s && this.f21a == 0 && this.f40t != null) {
            this.f40t = null;
        }
        return s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo43J(View view, int i) {
        if (view == this.f40t && this.f23c == i) {
            return true;
        }
        if (view == null || !this.f39s.tryCaptureView(view, i)) {
            return false;
        }
        this.f23c = i;
        mo45b(view, i);
        return true;
    }

    /* renamed from: a */
    public void mo44a() {
        this.f23c = -1;
        m76g();
        VelocityTracker velocityTracker = this.f32l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f32l = null;
        }
    }

    /* renamed from: b */
    public void mo45b(View view, int i) {
        if (view.getParent() == this.f42v) {
            this.f40t = view;
            this.f23c = i;
            this.f39s.onViewCaptured(view, i);
            mo39F(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f42v + ")");
    }

    /* renamed from: k */
    public boolean mo46k(boolean z) {
        if (this.f21a == 2) {
            boolean computeScrollOffset = this.f38r.computeScrollOffset();
            int currX = this.f38r.getCurrX();
            int currY = this.f38r.getCurrY();
            int left = currX - this.f40t.getLeft();
            int top = currY - this.f40t.getTop();
            if (left != 0) {
                ViewCompat.m3587b0(this.f40t, left);
            }
            if (top != 0) {
                ViewCompat.m3589c0(this.f40t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f39s.onViewPositionChanged(this.f40t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f38r.getFinalX() && currY == this.f38r.getFinalY()) {
                this.f38r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f42v.post(this.f43w);
                } else {
                    mo39F(0);
                }
            }
        }
        if (this.f21a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public View mo47r(int i, int i2) {
        for (int childCount = this.f42v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f42v.getChildAt(this.f39s.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: u */
    public float mo48u() {
        return this.f34n;
    }

    /* renamed from: v */
    public int mo49v() {
        return this.f22b;
    }

    /* renamed from: w */
    public boolean mo50w(int i, int i2) {
        return mo52z(this.f40t, i, i2);
    }

    /* renamed from: x */
    public boolean mo51x(int i) {
        return ((1 << i) & this.f31k) != 0;
    }

    /* renamed from: z */
    public boolean mo52z(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }
}

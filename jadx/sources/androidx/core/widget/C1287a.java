package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.core.widget.a */
public abstract class C1287a implements View.OnTouchListener {

    /* renamed from: u */
    private static final int f3841u = ViewConfiguration.getTapTimeout();

    /* renamed from: d */
    final C1288a f3842d = new C1288a();

    /* renamed from: e */
    private final Interpolator f3843e = new AccelerateInterpolator();

    /* renamed from: f */
    final View f3844f;

    /* renamed from: g */
    private Runnable f3845g;

    /* renamed from: h */
    private float[] f3846h = {Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON};

    /* renamed from: i */
    private float[] f3847i = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j */
    private int f3848j;

    /* renamed from: k */
    private int f3849k;

    /* renamed from: l */
    private float[] f3850l = {Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON};

    /* renamed from: m */
    private float[] f3851m = {Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON};

    /* renamed from: n */
    private float[] f3852n = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: o */
    private boolean f3853o;

    /* renamed from: p */
    boolean f3854p;

    /* renamed from: q */
    boolean f3855q;

    /* renamed from: r */
    boolean f3856r;

    /* renamed from: s */
    private boolean f3857s;

    /* renamed from: t */
    private boolean f3858t;

    /* renamed from: androidx.core.widget.a$a */
    private static class C1288a {

        /* renamed from: a */
        private int f3859a;

        /* renamed from: b */
        private int f3860b;

        /* renamed from: c */
        private float f3861c;

        /* renamed from: d */
        private float f3862d;

        /* renamed from: e */
        private long f3863e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f3864f = 0;

        /* renamed from: g */
        private int f3865g = 0;

        /* renamed from: h */
        private int f3866h = 0;

        /* renamed from: i */
        private long f3867i = -1;

        /* renamed from: j */
        private float f3868j;

        /* renamed from: k */
        private int f3869k;

        C1288a() {
        }

        /* renamed from: e */
        private float m4486e(long j) {
            long j2 = this.f3863e;
            if (j < j2) {
                return Utils.FLOAT_EPSILON;
            }
            long j3 = this.f3867i;
            if (j3 < 0 || j < j3) {
                return C1287a.m4465e(((float) (j - j2)) / ((float) this.f3859a), Utils.FLOAT_EPSILON, 1.0f) * 0.5f;
            }
            float f = this.f3868j;
            return (1.0f - f) + (f * C1287a.m4465e(((float) (j - j3)) / ((float) this.f3869k), Utils.FLOAT_EPSILON, 1.0f));
        }

        /* renamed from: g */
        private float m4487g(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void mo3855a() {
            if (this.f3864f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = m4487g(m4486e(currentAnimationTimeMillis));
                this.f3864f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f3864f)) * g;
                this.f3865g = (int) (this.f3861c * f);
                this.f3866h = (int) (f * this.f3862d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int mo3856b() {
            return this.f3865g;
        }

        /* renamed from: c */
        public int mo3857c() {
            return this.f3866h;
        }

        /* renamed from: d */
        public int mo3858d() {
            float f = this.f3861c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int mo3859f() {
            float f = this.f3862d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: h */
        public boolean mo3860h() {
            if (this.f3867i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= this.f3867i + ((long) this.f3869k)) {
                return false;
            }
            return true;
        }

        /* renamed from: i */
        public void mo3861i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3869k = C1287a.m4466f((int) (currentAnimationTimeMillis - this.f3863e), 0, this.f3860b);
            this.f3868j = m4486e(currentAnimationTimeMillis);
            this.f3867i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void mo3862j(int i) {
            this.f3860b = i;
        }

        /* renamed from: k */
        public void mo3863k(int i) {
            this.f3859a = i;
        }

        /* renamed from: l */
        public void mo3864l(float f, float f2) {
            this.f3861c = f;
            this.f3862d = f2;
        }

        /* renamed from: m */
        public void mo3865m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3863e = currentAnimationTimeMillis;
            this.f3867i = -1;
            this.f3864f = currentAnimationTimeMillis;
            this.f3868j = 0.5f;
            this.f3865g = 0;
            this.f3866h = 0;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    private class C1289b implements Runnable {
        C1289b() {
        }

        public void run() {
            C1287a aVar = C1287a.this;
            if (aVar.f3856r) {
                if (aVar.f3854p) {
                    aVar.f3854p = false;
                    aVar.f3842d.mo3865m();
                }
                C1288a aVar2 = C1287a.this.f3842d;
                if (aVar2.mo3860h() || !C1287a.this.mo3854u()) {
                    C1287a.this.f3856r = false;
                    return;
                }
                C1287a aVar3 = C1287a.this;
                if (aVar3.f3855q) {
                    aVar3.f3855q = false;
                    aVar3.mo3841c();
                }
                aVar2.mo3855a();
                C1287a.this.mo3842j(aVar2.mo3856b(), aVar2.mo3857c());
                ViewCompat.m3603j0(C1287a.this.f3844f, this);
            }
        }
    }

    public C1287a(View view) {
        this.f3844f = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo3847o(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        mo3849p(f3, f3);
        mo3844l(1);
        mo3846n(Float.MAX_VALUE, Float.MAX_VALUE);
        mo3852s(0.2f, 0.2f);
        mo3853t(1.0f, 1.0f);
        mo3843k(f3841u);
        mo3851r(500);
        mo3850q(500);
    }

    /* renamed from: d */
    private float m4464d(int i, float f, float f2, float f3) {
        float h = m4468h(this.f3846h[i], f2, this.f3847i[i], f);
        int i2 = (h > Utils.FLOAT_EPSILON ? 1 : (h == Utils.FLOAT_EPSILON ? 0 : -1));
        if (i2 == 0) {
            return Utils.FLOAT_EPSILON;
        }
        float f4 = this.f3850l[i];
        float f5 = this.f3851m[i];
        float f6 = this.f3852n[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return m4465e(h * f7, f5, f6);
        }
        return -m4465e((-h) * f7, f5, f6);
    }

    /* renamed from: e */
    static float m4465e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    static int m4466f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: g */
    private float m4467g(float f, float f2) {
        if (f2 == Utils.FLOAT_EPSILON) {
            return Utils.FLOAT_EPSILON;
        }
        int i = this.f3848j;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= Utils.FLOAT_EPSILON) {
                    return 1.0f - (f / f2);
                }
                if (!this.f3856r || i != 1) {
                    return Utils.FLOAT_EPSILON;
                }
                return 1.0f;
            }
        } else if (i == 2 && f < Utils.FLOAT_EPSILON) {
            return f / (-f2);
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: h */
    private float m4468h(float f, float f2, float f3, float f4) {
        float f5;
        float e = m4465e(f * f2, Utils.FLOAT_EPSILON, f3);
        float g = m4467g(f2 - f4, e) - m4467g(f4, e);
        if (g < Utils.FLOAT_EPSILON) {
            f5 = -this.f3843e.getInterpolation(-g);
        } else if (g <= Utils.FLOAT_EPSILON) {
            return Utils.FLOAT_EPSILON;
        } else {
            f5 = this.f3843e.getInterpolation(g);
        }
        return m4465e(f5, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m4469i() {
        if (this.f3854p) {
            this.f3856r = false;
        } else {
            this.f3842d.mo3861i();
        }
    }

    /* renamed from: v */
    private void m4470v() {
        int i;
        if (this.f3845g == null) {
            this.f3845g = new C1289b();
        }
        this.f3856r = true;
        this.f3854p = true;
        if (this.f3853o || (i = this.f3849k) <= 0) {
            this.f3845g.run();
        } else {
            ViewCompat.m3605k0(this.f3844f, this.f3845g, (long) i);
        }
        this.f3853o = true;
    }

    /* renamed from: a */
    public abstract boolean mo3839a(int i);

    /* renamed from: b */
    public abstract boolean mo3840b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3841c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
        this.f3844f.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo3842j(int i, int i2);

    /* renamed from: k */
    public C1287a mo3843k(int i) {
        this.f3849k = i;
        return this;
    }

    /* renamed from: l */
    public C1287a mo3844l(int i) {
        this.f3848j = i;
        return this;
    }

    /* renamed from: m */
    public C1287a mo3845m(boolean z) {
        if (this.f3857s && !z) {
            m4469i();
        }
        this.f3857s = z;
        return this;
    }

    /* renamed from: n */
    public C1287a mo3846n(float f, float f2) {
        float[] fArr = this.f3847i;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public C1287a mo3847o(float f, float f2) {
        float[] fArr = this.f3852n;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3857s
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m4469i()
            goto L_0x0058
        L_0x001a:
            r5.f3855q = r2
            r5.f3853o = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3844f
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m4464d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3844f
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m4464d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f3842d
            r7.mo3864l(r0, r6)
            boolean r6 = r5.f3856r
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo3854u()
            if (r6 == 0) goto L_0x0058
            r5.m4470v()
        L_0x0058:
            boolean r6 = r5.f3858t
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f3856r
            if (r6 == 0) goto L_0x0061
            r1 = r2
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C1287a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public C1287a mo3849p(float f, float f2) {
        float[] fArr = this.f3851m;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public C1287a mo3850q(int i) {
        this.f3842d.mo3862j(i);
        return this;
    }

    /* renamed from: r */
    public C1287a mo3851r(int i) {
        this.f3842d.mo3863k(i);
        return this;
    }

    /* renamed from: s */
    public C1287a mo3852s(float f, float f2) {
        float[] fArr = this.f3846h;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public C1287a mo3853t(float f, float f2) {
        float[] fArr = this.f3850l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo3854u() {
        C1288a aVar = this.f3842d;
        int f = aVar.mo3859f();
        int d = aVar.mo3858d();
        if ((f == 0 || !mo3840b(f)) && (d == 0 || !mo3839a(d))) {
            return false;
        }
        return true;
    }
}

package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.C0318p;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.appcompat.widget.y0 */
public abstract class C0515y0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: d */
    private final float f2272d;

    /* renamed from: e */
    private final int f2273e;

    /* renamed from: f */
    private final int f2274f;

    /* renamed from: g */
    final View f2275g;

    /* renamed from: h */
    private Runnable f2276h;

    /* renamed from: i */
    private Runnable f2277i;

    /* renamed from: j */
    private boolean f2278j;

    /* renamed from: k */
    private int f2279k;

    /* renamed from: l */
    private final int[] f2280l = new int[2];

    /* renamed from: androidx.appcompat.widget.y0$a */
    private class C0516a implements Runnable {
        C0516a() {
        }

        public void run() {
            ViewParent parent = C0515y0.this.f2275g.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.y0$b */
    private class C0517b implements Runnable {
        C0517b() {
        }

        public void run() {
            C0515y0.this.mo2363e();
        }
    }

    public C0515y0(View view) {
        this.f2275g = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2272d = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2273e = tapTimeout;
        this.f2274f = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m2059a() {
        Runnable runnable = this.f2277i;
        if (runnable != null) {
            this.f2275g.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f2276h;
        if (runnable2 != null) {
            this.f2275g.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m2060f(MotionEvent motionEvent) {
        C0494u0 u0Var;
        boolean z;
        View view = this.f2275g;
        C0318p b = mo823b();
        if (b == null || !b.mo922b() || (u0Var = (C0494u0) b.mo929o()) == null || !u0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m2063i(view, obtainNoHistory);
        m2064j(u0Var, obtainNoHistory);
        boolean e = u0Var.mo2056e(obtainNoHistory, this.f2279k);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            z = false;
        } else {
            z = true;
        }
        if (!e || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2061g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f2275g
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f2279k
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f2272d
            boolean r6 = m2062h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m2059a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m2059a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f2279k = r6
            java.lang.Runnable r6 = r5.f2276h
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.y0$a r6 = new androidx.appcompat.widget.y0$a
            r6.<init>()
            r5.f2276h = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f2276h
            int r1 = r5.f2273e
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f2277i
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.y0$b r6 = new androidx.appcompat.widget.y0$b
            r6.<init>()
            r5.f2277i = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f2277i
            int r1 = r5.f2274f
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0515y0.m2061g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m2062h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        if (f < f4 || f2 < f4 || f >= ((float) (view.getRight() - view.getLeft())) + f3 || f2 >= ((float) (view.getBottom() - view.getTop())) + f3) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m2063i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2280l;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m2064j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2280l;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    public abstract C0318p mo823b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo824c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo1353d() {
        C0318p b = mo823b();
        if (b == null || !b.mo922b()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2363e() {
        m2059a();
        View view = this.f2275g;
        if (view.isEnabled() && !view.isLongClickable() && mo824c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f2278j = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f2278j;
        if (!z2) {
            if (!m2061g(motionEvent) || !mo824c()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
                this.f2275g.onTouchEvent(obtain);
                obtain.recycle();
            }
        } else if (m2060f(motionEvent) || !mo1353d()) {
            z = true;
        } else {
            z = false;
        }
        this.f2278j = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f2278j = false;
        this.f2279k = -1;
        Runnable runnable = this.f2276h;
        if (runnable != null) {
            this.f2275g.removeCallbacks(runnable);
        }
    }
}

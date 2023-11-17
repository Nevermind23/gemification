package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;

/* renamed from: com.google.android.material.appbar.e */
abstract class C4926e extends C4929g {

    /* renamed from: d */
    private Runnable f15491d;

    /* renamed from: e */
    OverScroller f15492e;

    /* renamed from: f */
    private boolean f15493f;

    /* renamed from: g */
    private int f15494g = -1;

    /* renamed from: h */
    private int f15495h;

    /* renamed from: i */
    private int f15496i = -1;

    /* renamed from: j */
    private VelocityTracker f15497j;

    /* renamed from: com.google.android.material.appbar.e$a */
    private class C4927a implements Runnable {

        /* renamed from: d */
        private final CoordinatorLayout f15498d;

        /* renamed from: e */
        private final View f15499e;

        C4927a(CoordinatorLayout coordinatorLayout, View view) {
            this.f15498d = coordinatorLayout;
            this.f15499e = view;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f15499e != null && (overScroller = C4926e.this.f15492e) != null) {
                if (overScroller.computeScrollOffset()) {
                    C4926e eVar = C4926e.this;
                    eVar.mo15460P(this.f15498d, this.f15499e, eVar.f15492e.getCurrY());
                    ViewCompat.m3603j0(this.f15499e, this);
                    return;
                }
                C4926e.this.mo15338N(this.f15498d, this.f15499e);
            }
        }
    }

    public C4926e() {
    }

    /* renamed from: I */
    private void m18708I() {
        if (this.f15497j == null) {
            this.f15497j = VelocityTracker.obtain();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3034D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, android.view.View r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = r2
            goto L_0x001c
        L_0x001b:
            r12 = r3
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f15494g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f15495h = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f15494g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f15495h
            int r7 = r1 - r0
            r11.f15495h = r0
            int r8 = r11.mo15335K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.mo15459O(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = r3
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f15497j
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f15497j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f15497j
            int r4 = r11.f15494g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo15336L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo15458J(r6, r7, r8, r9, r10)
            r12 = r2
            goto L_0x0073
        L_0x0072:
            r12 = r3
        L_0x0073:
            r11.f15493f = r3
            r11.f15494g = r1
            android.view.VelocityTracker r13 = r11.f15497j
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f15497j = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f15497j
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f15493f
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = r3
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.C4926e.mo3034D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public abstract boolean mo15334H(View view);

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final boolean mo15458J(CoordinatorLayout coordinatorLayout, View view, int i, int i2, float f) {
        View view2 = view;
        Runnable runnable = this.f15491d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f15491d = null;
        }
        if (this.f15492e == null) {
            this.f15492e = new OverScroller(view.getContext());
        }
        this.f15492e.fling(0, mo15362E(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f15492e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C4927a aVar = new C4927a(coordinatorLayout, view);
            this.f15491d = aVar;
            ViewCompat.m3603j0(view, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo15338N(coordinatorLayout, view);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public abstract int mo15335K(View view);

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public abstract int mo15336L(View view);

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public abstract int mo15337M();

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public abstract void mo15338N(CoordinatorLayout coordinatorLayout, View view);

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final int mo15459O(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return mo15339Q(coordinatorLayout, view, mo15337M() - i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public int mo15460P(CoordinatorLayout coordinatorLayout, View view, int i) {
        return mo15339Q(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public abstract int mo15339Q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);

    /* renamed from: k */
    public boolean mo3045k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.f15496i < 0) {
            this.f15496i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f15493f) {
            int i = this.f15494g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f15495h) > this.f15496i) {
                this.f15495h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f15494g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!mo15334H(view) || !coordinatorLayout.mo3022v(view, x, y2)) {
                z = false;
            } else {
                z = true;
            }
            this.f15493f = z;
            if (z) {
                this.f15495h = y2;
                this.f15494g = motionEvent.getPointerId(0);
                m18708I();
                OverScroller overScroller = this.f15492e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f15492e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f15497j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public C4926e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

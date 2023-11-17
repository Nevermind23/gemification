package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C1117b3;
import androidx.core.view.ViewCompat;

/* renamed from: androidx.appcompat.widget.a2 */
class C0397a2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: n */
    private static C0397a2 f2018n;

    /* renamed from: o */
    private static C0397a2 f2019o;

    /* renamed from: d */
    private final View f2020d;

    /* renamed from: e */
    private final CharSequence f2021e;

    /* renamed from: f */
    private final int f2022f;

    /* renamed from: g */
    private final Runnable f2023g = new C0518y1(this);

    /* renamed from: h */
    private final Runnable f2024h = new C0530z1(this);

    /* renamed from: i */
    private int f2025i;

    /* renamed from: j */
    private int f2026j;

    /* renamed from: k */
    private C0409b2 f2027k;

    /* renamed from: l */
    private boolean f2028l;

    /* renamed from: m */
    private boolean f2029m;

    private C0397a2(View view, CharSequence charSequence) {
        this.f2020d = view;
        this.f2021e = charSequence;
        this.f2022f = C1117b3.m4138c(ViewConfiguration.get(view.getContext()));
        m1611c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    private void m1610b() {
        this.f2020d.removeCallbacks(this.f2023g);
    }

    /* renamed from: c */
    private void m1611c() {
        this.f2029m = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m1612e() {
        mo1918i(false);
    }

    /* renamed from: f */
    private void m1613f() {
        this.f2020d.postDelayed(this.f2023g, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: g */
    private static void m1614g(C0397a2 a2Var) {
        C0397a2 a2Var2 = f2018n;
        if (a2Var2 != null) {
            a2Var2.m1610b();
        }
        f2018n = a2Var;
        if (a2Var != null) {
            a2Var.m1613f();
        }
    }

    /* renamed from: h */
    public static void m1615h(View view, CharSequence charSequence) {
        C0397a2 a2Var = f2018n;
        if (a2Var != null && a2Var.f2020d == view) {
            m1614g((C0397a2) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0397a2 a2Var2 = f2019o;
            if (a2Var2 != null && a2Var2.f2020d == view) {
                a2Var2.mo1917d();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0397a2(view, charSequence);
    }

    /* renamed from: j */
    private boolean m1616j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f2029m && Math.abs(x - this.f2025i) <= this.f2022f && Math.abs(y - this.f2026j) <= this.f2022f) {
            return false;
        }
        this.f2025i = x;
        this.f2026j = y;
        this.f2029m = false;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1917d() {
        if (f2019o == this) {
            f2019o = null;
            C0409b2 b2Var = this.f2027k;
            if (b2Var != null) {
                b2Var.mo1954c();
                this.f2027k = null;
                m1611c();
                this.f2020d.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2018n == this) {
            m1614g((C0397a2) null);
        }
        this.f2020d.removeCallbacks(this.f2024h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1918i(boolean z) {
        long j;
        long j2;
        long j3;
        if (ViewCompat.m3578U(this.f2020d)) {
            m1614g((C0397a2) null);
            C0397a2 a2Var = f2019o;
            if (a2Var != null) {
                a2Var.mo1917d();
            }
            f2019o = this;
            this.f2028l = z;
            C0409b2 b2Var = new C0409b2(this.f2020d.getContext());
            this.f2027k = b2Var;
            b2Var.mo1956e(this.f2020d, this.f2025i, this.f2026j, this.f2028l, this.f2021e);
            this.f2020d.addOnAttachStateChangeListener(this);
            if (this.f2028l) {
                j = 2500;
            } else {
                if ((ViewCompat.m3565N(this.f2020d) & 1) == 1) {
                    j3 = (long) ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    j3 = (long) ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j = j2 - j3;
            }
            this.f2020d.removeCallbacks(this.f2024h);
            this.f2020d.postDelayed(this.f2024h, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2027k != null && this.f2028l) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2020d.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1611c();
                mo1917d();
            }
        } else if (this.f2020d.isEnabled() && this.f2027k == null && m1616j(motionEvent)) {
            m1614g(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f2025i = view.getWidth() / 2;
        this.f2026j = view.getHeight() / 2;
        mo1918i(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo1917d();
    }
}

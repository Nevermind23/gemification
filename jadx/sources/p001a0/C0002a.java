package p001a0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.C1055a;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.C1106z;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0006b;

/* renamed from: a0.a */
public abstract class C0002a extends C1055a {

    /* renamed from: k */
    private static final Rect f2k = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: l */
    private static final C0006b.C0007a f3l = new C0003a();

    /* renamed from: m */
    private static final C0006b.C0008b f4m = new C0004b();

    /* renamed from: a */
    private final Rect f5a = new Rect();

    /* renamed from: b */
    private final Rect f6b = new Rect();

    /* renamed from: c */
    private final Rect f7c = new Rect();

    /* renamed from: d */
    private final int[] f8d = new int[2];

    /* renamed from: e */
    private final AccessibilityManager f9e;

    /* renamed from: f */
    private final View f10f;

    /* renamed from: g */
    private C0005c f11g;

    /* renamed from: h */
    int f12h = Integer.MIN_VALUE;

    /* renamed from: i */
    int f13i = Integer.MIN_VALUE;

    /* renamed from: j */
    private int f14j = Integer.MIN_VALUE;

    /* renamed from: a0.a$a */
    class C0003a implements C0006b.C0007a {
        C0003a() {
        }

        /* renamed from: b */
        public void mo28a(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, Rect rect) {
            accessibilityNodeInfoCompat.mo3613l(rect);
        }
    }

    /* renamed from: a0.a$b */
    class C0004b implements C0006b.C0008b {
        C0004b() {
        }

        /* renamed from: c */
        public AccessibilityNodeInfoCompat mo30a(SparseArrayCompat sparseArrayCompat, int i) {
            return (AccessibilityNodeInfoCompat) sparseArrayCompat.valueAt(i);
        }

        /* renamed from: d */
        public int mo31b(SparseArrayCompat sparseArrayCompat) {
            return sparseArrayCompat.size();
        }
    }

    /* renamed from: a0.a$c */
    private class C0005c extends AccessibilityNodeProviderCompat {
        C0005c() {
        }

        /* renamed from: b */
        public AccessibilityNodeInfoCompat mo34b(int i) {
            return AccessibilityNodeInfoCompat.m3968N(C0002a.this.mo24w(i));
        }

        /* renamed from: d */
        public AccessibilityNodeInfoCompat mo35d(int i) {
            int i2;
            if (i == 2) {
                i2 = C0002a.this.f12h;
            } else {
                i2 = C0002a.this.f13i;
            }
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo34b(i2);
        }

        /* renamed from: f */
        public boolean mo36f(int i, int i2, Bundle bundle) {
            return C0002a.this.mo11E(i, i2, bundle);
        }
    }

    public C0002a(View view) {
        if (view != null) {
            this.f10f = view;
            this.f9e = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (ViewCompat.m3634z(view) == 0) {
                ViewCompat.m3544C0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: F */
    private boolean m6F(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return mo12I(i);
        }
        if (i2 == 2) {
            return mo14d(i);
        }
        if (i2 == 64) {
            return m8H(i);
        }
        if (i2 != 128) {
            return mo26y(i, i2, bundle);
        }
        return m10c(i);
    }

    /* renamed from: G */
    private boolean m7G(int i, Bundle bundle) {
        return ViewCompat.m3597g0(this.f10f, i, bundle);
    }

    /* renamed from: H */
    private boolean m8H(int i) {
        int i2;
        if (!this.f9e.isEnabled() || !this.f9e.isTouchExplorationEnabled() || (i2 = this.f12h) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m10c(i2);
        }
        this.f12h = i;
        this.f10f.invalidate();
        mo13J(i, 32768);
        return true;
    }

    /* renamed from: K */
    private void m9K(int i) {
        int i2 = this.f14j;
        if (i2 != i) {
            this.f14j = i;
            mo13J(i, 128);
            mo13J(i2, C11398b.f33139r);
        }
    }

    /* renamed from: c */
    private boolean m10c(int i) {
        if (this.f12h != i) {
            return false;
        }
        this.f12h = Integer.MIN_VALUE;
        this.f10f.invalidate();
        mo13J(i, 65536);
        return true;
    }

    /* renamed from: e */
    private boolean m11e() {
        int i = this.f13i;
        return i != Integer.MIN_VALUE && mo26y(i, 16, (Bundle) null);
    }

    /* renamed from: f */
    private AccessibilityEvent m12f(int i, int i2) {
        if (i != -1) {
            return m13g(i, i2);
        }
        return m14h(i2);
    }

    /* renamed from: g */
    private AccessibilityEvent m13g(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        AccessibilityNodeInfoCompat w = mo24w(i);
        obtain.getText().add(w.mo3631v());
        obtain.setContentDescription(w.mo3622q());
        obtain.setScrollable(w.mo3581I());
        obtain.setPassword(w.mo3580H());
        obtain.setEnabled(w.mo3576D());
        obtain.setChecked(w.mo3574B());
        mo7A(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(w.mo3619o());
            C1106z.m4113c(obtain, this.f10f, i);
            obtain.setPackageName(this.f10f.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: h */
    private AccessibilityEvent m14h(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f10f.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: i */
    private AccessibilityNodeInfoCompat m15i(int i) {
        boolean z;
        AccessibilityNodeInfoCompat L = AccessibilityNodeInfoCompat.m3966L();
        L.mo3602e0(true);
        L.mo3605g0(true);
        L.mo3592Y("android.view.View");
        Rect rect = f2k;
        L.mo3588U(rect);
        L.mo3589V(rect);
        L.mo3620o0(this.f10f);
        mo9C(i, L);
        if (L.mo3631v() == null && L.mo3622q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        L.mo3613l(this.f6b);
        if (!this.f6b.equals(rect)) {
            int j = L.mo3610j();
            if ((j & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((j & 128) == 0) {
                L.mo3616m0(this.f10f.getContext().getPackageName());
                L.mo3630u0(this.f10f, i);
                if (this.f12h == i) {
                    L.mo3587S(true);
                    L.mo3594a(128);
                } else {
                    L.mo3587S(false);
                    L.mo3594a(64);
                }
                if (this.f13i == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    L.mo3594a(2);
                } else if (L.mo3577E()) {
                    L.mo3594a(1);
                }
                L.mo3607h0(z);
                this.f10f.getLocationOnScreen(this.f8d);
                L.mo3615m(this.f5a);
                if (this.f5a.equals(rect)) {
                    L.mo3613l(this.f5a);
                    if (L.f3719b != -1) {
                        AccessibilityNodeInfoCompat L2 = AccessibilityNodeInfoCompat.m3966L();
                        for (int i2 = L.f3719b; i2 != -1; i2 = L2.f3719b) {
                            L2.mo3621p0(this.f10f, -1);
                            L2.mo3588U(f2k);
                            mo9C(i2, L2);
                            L2.mo3613l(this.f6b);
                            Rect rect2 = this.f5a;
                            Rect rect3 = this.f6b;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        L2.mo3585P();
                    }
                    this.f5a.offset(this.f8d[0] - this.f10f.getScrollX(), this.f8d[1] - this.f10f.getScrollY());
                }
                if (this.f10f.getLocalVisibleRect(this.f7c)) {
                    this.f7c.offset(this.f8d[0] - this.f10f.getScrollX(), this.f8d[1] - this.f10f.getScrollY());
                    if (this.f5a.intersect(this.f7c)) {
                        L.mo3589V(this.f5a);
                        if (m20t(this.f5a)) {
                            L.mo3637y0(true);
                        }
                    }
                }
                return L;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: j */
    private AccessibilityNodeInfoCompat m16j() {
        AccessibilityNodeInfoCompat M = AccessibilityNodeInfoCompat.m3967M(this.f10f);
        ViewCompat.m3593e0(this.f10f, M);
        ArrayList arrayList = new ArrayList();
        mo23r(arrayList);
        if (M.mo3617n() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                M.mo3598c(this.f10f, ((Integer) arrayList.get(i)).intValue());
            }
            return M;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: n */
    private SparseArrayCompat m17n() {
        ArrayList arrayList = new ArrayList();
        mo23r(arrayList);
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
        for (int i = 0; i < arrayList.size(); i++) {
            sparseArrayCompat.put(((Integer) arrayList.get(i)).intValue(), m15i(((Integer) arrayList.get(i)).intValue()));
        }
        return sparseArrayCompat;
    }

    /* renamed from: o */
    private void m18o(int i, Rect rect) {
        mo24w(i).mo3613l(rect);
    }

    /* renamed from: s */
    private static Rect m19s(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: t */
    private boolean m20t(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f10f.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f10f.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= Utils.FLOAT_EPSILON || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private static int m21u(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: v */
    private boolean m22v(int i, Rect rect) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2;
        boolean z;
        SparseArrayCompat n = m17n();
        int i2 = this.f13i;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            accessibilityNodeInfoCompat = null;
        } else {
            accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) n.get(i2);
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat3 = accessibilityNodeInfoCompat;
        if (i == 1 || i == 2) {
            if (ViewCompat.m3541B(this.f10f) == 1) {
                z = true;
            } else {
                z = false;
            }
            accessibilityNodeInfoCompat2 = (AccessibilityNodeInfoCompat) C0006b.m53d(n, f4m, f3l, accessibilityNodeInfoCompat3, i, z, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f13i;
            if (i4 != Integer.MIN_VALUE) {
                m18o(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m19s(this.f10f, i, rect2);
            }
            accessibilityNodeInfoCompat2 = (AccessibilityNodeInfoCompat) C0006b.m52c(n, f4m, f3l, accessibilityNodeInfoCompat3, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (accessibilityNodeInfoCompat2 != null) {
            i3 = n.keyAt(n.indexOfValue(accessibilityNodeInfoCompat2));
        }
        return mo12I(i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo7A(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract void mo8B(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo9C(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract void mo10D(int i, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo11E(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return m6F(i, i2, bundle);
        }
        return m7G(i2, bundle);
    }

    /* renamed from: I */
    public final boolean mo12I(int i) {
        int i2;
        if ((!this.f10f.isFocused() && !this.f10f.requestFocus()) || (i2 = this.f13i) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo14d(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f13i = i;
        mo10D(i, true);
        mo13J(i, 8);
        return true;
    }

    /* renamed from: J */
    public final boolean mo13J(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f9e.isEnabled() || (parent = this.f10f.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f10f, m12f(i, i2));
    }

    /* renamed from: d */
    public final boolean mo14d(int i) {
        if (this.f13i != i) {
            return false;
        }
        this.f13i = Integer.MIN_VALUE;
        mo10D(i, false);
        mo13J(i, 8);
        return true;
    }

    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        if (this.f11g == null) {
            this.f11g = new C0005c();
        }
        return this.f11g;
    }

    /* renamed from: k */
    public final boolean mo16k(MotionEvent motionEvent) {
        if (!this.f9e.isEnabled() || !this.f9e.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int q = mo22q(motionEvent.getX(), motionEvent.getY());
            m9K(q);
            if (q != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f14j == Integer.MIN_VALUE) {
            return false;
        } else {
            m9K(Integer.MIN_VALUE);
            return true;
        }
    }

    /* renamed from: l */
    public final boolean mo17l(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int u = m21u(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m22v(u, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m11e();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m22v(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m22v(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: m */
    public final int mo18m() {
        return this.f12h;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        mo27z(accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        mo8B(accessibilityNodeInfoCompat);
    }

    /* renamed from: p */
    public final int mo21p() {
        return this.f13i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract int mo22q(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo23r(List list);

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public AccessibilityNodeInfoCompat mo24w(int i) {
        if (i == -1) {
            return m16j();
        }
        return m15i(i);
    }

    /* renamed from: x */
    public final void mo25x(boolean z, int i, Rect rect) {
        int i2 = this.f13i;
        if (i2 != Integer.MIN_VALUE) {
            mo14d(i2);
        }
        if (z) {
            m22v(i, rect);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract boolean mo26y(int i, int i2, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo27z(AccessibilityEvent accessibilityEvent) {
    }
}

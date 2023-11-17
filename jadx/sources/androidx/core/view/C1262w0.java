package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.w0 */
public class C1262w0 {

    /* renamed from: a */
    private ViewParent f3829a;

    /* renamed from: b */
    private ViewParent f3830b;

    /* renamed from: c */
    private final View f3831c;

    /* renamed from: d */
    private boolean f3832d;

    /* renamed from: e */
    private int[] f3833e;

    public C1262w0(View view) {
        this.f3831c = view;
    }

    /* renamed from: h */
    private boolean m4383h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent i6;
        int i7;
        int i8;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!mo3742m() || (i6 = m4384i(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f3831c.getLocationInWindow(iArr4);
            i8 = iArr4[0];
            i7 = iArr4[1];
        } else {
            i8 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] j = m4385j();
            j[0] = 0;
            j[1] = 0;
            iArr3 = j;
        } else {
            iArr3 = iArr2;
        }
        C1169h3.m4243d(i6, this.f3831c, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f3831c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i8;
            iArr4[1] = iArr4[1] - i7;
        }
        return true;
    }

    /* renamed from: i */
    private ViewParent m4384i(int i) {
        if (i == 0) {
            return this.f3829a;
        }
        if (i != 1) {
            return null;
        }
        return this.f3830b;
    }

    /* renamed from: j */
    private int[] m4385j() {
        if (this.f3833e == null) {
            this.f3833e = new int[2];
        }
        return this.f3833e;
    }

    /* renamed from: o */
    private void m4386o(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f3829a = viewParent;
        } else if (i == 1) {
            this.f3830b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean mo3733a(float f, float f2, boolean z) {
        ViewParent i;
        if (!mo3742m() || (i = m4384i(0)) == null) {
            return false;
        }
        return C1169h3.m4240a(i, this.f3831c, f, f2, z);
    }

    /* renamed from: b */
    public boolean mo3734b(float f, float f2) {
        ViewParent i;
        if (!mo3742m() || (i = m4384i(0)) == null) {
            return false;
        }
        return C1169h3.m4241b(i, this.f3831c, f, f2);
    }

    /* renamed from: c */
    public boolean mo3735c(int i, int i2, int[] iArr, int[] iArr2) {
        return mo3736d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean mo3736d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent i4;
        int i5;
        int i6;
        if (!mo3742m() || (i4 = m4384i(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f3831c.getLocationInWindow(iArr2);
                i6 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i6 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                iArr = m4385j();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C1169h3.m4242c(i4, this.f3831c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f3831c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i6;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: e */
    public void mo3737e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m4383h(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean mo3738f(int i, int i2, int i3, int i4, int[] iArr) {
        return m4383h(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: g */
    public boolean mo3739g(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m4383h(i, i2, i3, i4, iArr, i5, (int[]) null);
    }

    /* renamed from: k */
    public boolean mo3740k() {
        return mo3741l(0);
    }

    /* renamed from: l */
    public boolean mo3741l(int i) {
        return m4384i(i) != null;
    }

    /* renamed from: m */
    public boolean mo3742m() {
        return this.f3832d;
    }

    /* renamed from: n */
    public void mo3743n(boolean z) {
        if (this.f3832d) {
            ViewCompat.m3576S0(this.f3831c);
        }
        this.f3832d = z;
    }

    /* renamed from: p */
    public boolean mo3744p(int i) {
        return mo3745q(i, 0);
    }

    /* renamed from: q */
    public boolean mo3745q(int i, int i2) {
        if (mo3741l(i2)) {
            return true;
        }
        if (!mo3742m()) {
            return false;
        }
        View view = this.f3831c;
        for (ViewParent parent = this.f3831c.getParent(); parent != null; parent = parent.getParent()) {
            if (C1169h3.m4245f(parent, view, this.f3831c, i, i2)) {
                m4386o(i2, parent);
                C1169h3.m4244e(parent, view, this.f3831c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: r */
    public void mo3746r() {
        mo3747s(0);
    }

    /* renamed from: s */
    public void mo3747s(int i) {
        ViewParent i2 = m4384i(i);
        if (i2 != null) {
            C1169h3.m4246g(i2, this.f3831c, i);
            m4386o(i, (ViewParent) null);
        }
    }
}

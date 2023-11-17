package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1593j;
import androidx.viewpager.widget.C1907a;

/* renamed from: androidx.fragment.app.z */
public abstract class C1547z extends C1907a {

    /* renamed from: c */
    private final FragmentManager f4495c;

    /* renamed from: d */
    private final int f4496d;

    /* renamed from: e */
    private C1493e0 f4497e;

    /* renamed from: f */
    private Fragment f4498f;

    /* renamed from: g */
    private boolean f4499g;

    public C1547z(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    /* renamed from: v */
    private static String m5482v(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    /* renamed from: a */
    public void mo4594a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f4497e == null) {
            this.f4497e = this.f4495c.mo4428p();
        }
        this.f4497e.mo4519m(fragment);
        if (fragment.equals(this.f4498f)) {
            this.f4498f = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public void mo4595c(ViewGroup viewGroup) {
        C1493e0 e0Var = this.f4497e;
        if (e0Var != null) {
            if (!this.f4499g) {
                try {
                    this.f4499g = true;
                    e0Var.mo4518l();
                    this.f4499g = false;
                } catch (Throwable th) {
                    this.f4499g = false;
                    throw th;
                }
            }
            this.f4497e = null;
        }
    }

    /* renamed from: h */
    public Object mo4596h(ViewGroup viewGroup, int i) {
        if (this.f4497e == null) {
            this.f4497e = this.f4495c.mo4428p();
        }
        long u = mo4806u(i);
        Fragment k0 = this.f4495c.mo4418k0(m5482v(viewGroup.getId(), u));
        if (k0 != null) {
            this.f4497e.mo4637h(k0);
        } else {
            k0 = mo4805t(i);
            this.f4497e.mo4632c(viewGroup.getId(), k0, m5482v(viewGroup.getId(), u));
        }
        if (k0 != this.f4498f) {
            k0.setMenuVisibility(false);
            if (this.f4496d == 1) {
                this.f4497e.mo4524v(k0, C1593j.C1598b.STARTED);
            } else {
                k0.setUserVisibleHint(false);
            }
        }
        return k0;
    }

    /* renamed from: i */
    public boolean mo4597i(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    /* renamed from: l */
    public void mo4598l(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: m */
    public Parcelable mo4599m() {
        return null;
    }

    /* renamed from: o */
    public void mo4600o(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f4498f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f4496d == 1) {
                    if (this.f4497e == null) {
                        this.f4497e = this.f4495c.mo4428p();
                    }
                    this.f4497e.mo4524v(this.f4498f, C1593j.C1598b.STARTED);
                } else {
                    this.f4498f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f4496d == 1) {
                if (this.f4497e == null) {
                    this.f4497e = this.f4495c.mo4428p();
                }
                this.f4497e.mo4524v(fragment, C1593j.C1598b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f4498f = fragment;
        }
    }

    /* renamed from: r */
    public void mo4601r(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    /* renamed from: t */
    public abstract Fragment mo4805t(int i);

    /* renamed from: u */
    public long mo4806u(int i) {
        return (long) i;
    }

    public C1547z(FragmentManager fragmentManager, int i) {
        this.f4497e = null;
        this.f4498f = null;
        this.f4495c = fragmentManager;
        this.f4496d = i;
    }
}

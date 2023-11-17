package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1593j;
import androidx.viewpager.widget.C1907a;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.c0 */
public abstract class C1489c0 extends C1907a {

    /* renamed from: c */
    private final FragmentManager f4347c;

    /* renamed from: d */
    private final int f4348d;

    /* renamed from: e */
    private C1493e0 f4349e;

    /* renamed from: f */
    private ArrayList f4350f;

    /* renamed from: g */
    private ArrayList f4351g;

    /* renamed from: h */
    private Fragment f4352h;

    /* renamed from: i */
    private boolean f4353i;

    public C1489c0(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    /* renamed from: a */
    public void mo4594a(ViewGroup viewGroup, int i, Object obj) {
        Fragment.SavedState savedState;
        Fragment fragment = (Fragment) obj;
        if (this.f4349e == null) {
            this.f4349e = this.f4347c.mo4428p();
        }
        while (this.f4350f.size() <= i) {
            this.f4350f.add((Object) null);
        }
        ArrayList arrayList = this.f4350f;
        if (fragment.isAdded()) {
            savedState = this.f4347c.mo4352A1(fragment);
        } else {
            savedState = null;
        }
        arrayList.set(i, savedState);
        this.f4351g.set(i, (Object) null);
        this.f4349e.mo4522q(fragment);
        if (fragment.equals(this.f4352h)) {
            this.f4352h = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public void mo4595c(ViewGroup viewGroup) {
        C1493e0 e0Var = this.f4349e;
        if (e0Var != null) {
            if (!this.f4353i) {
                try {
                    this.f4353i = true;
                    e0Var.mo4518l();
                    this.f4353i = false;
                } catch (Throwable th) {
                    this.f4353i = false;
                    throw th;
                }
            }
            this.f4349e = null;
        }
    }

    /* renamed from: h */
    public Object mo4596h(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f4351g.size() > i && (fragment = (Fragment) this.f4351g.get(i)) != null) {
            return fragment;
        }
        if (this.f4349e == null) {
            this.f4349e = this.f4347c.mo4428p();
        }
        Fragment t = mo4602t(i);
        if (this.f4350f.size() > i && (savedState = (Fragment.SavedState) this.f4350f.get(i)) != null) {
            t.setInitialSavedState(savedState);
        }
        while (this.f4351g.size() <= i) {
            this.f4351g.add((Object) null);
        }
        t.setMenuVisibility(false);
        if (this.f4348d == 0) {
            t.setUserVisibleHint(false);
        }
        this.f4351g.set(i, t);
        this.f4349e.mo4631b(viewGroup.getId(), t);
        if (this.f4348d == 1) {
            this.f4349e.mo4524v(t, C1593j.C1598b.STARTED);
        }
        return t;
    }

    /* renamed from: i */
    public boolean mo4597i(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    /* renamed from: l */
    public void mo4598l(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f4350f.clear();
            this.f4351g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f4350f.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment u0 = this.f4347c.mo4438u0(bundle, str);
                    if (u0 != null) {
                        while (this.f4351g.size() <= parseInt) {
                            this.f4351g.add((Object) null);
                        }
                        u0.setMenuVisibility(false);
                        this.f4351g.set(parseInt, u0);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public Parcelable mo4599m() {
        Bundle bundle;
        if (this.f4350f.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f4350f.size()];
            this.f4350f.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f4351g.size(); i++) {
            Fragment fragment = (Fragment) this.f4351g.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f4347c.mo4425n1(bundle, "f" + i, fragment);
            }
        }
        return bundle;
    }

    /* renamed from: o */
    public void mo4600o(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f4352h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f4348d == 1) {
                    if (this.f4349e == null) {
                        this.f4349e = this.f4347c.mo4428p();
                    }
                    this.f4349e.mo4524v(this.f4352h, C1593j.C1598b.STARTED);
                } else {
                    this.f4352h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f4348d == 1) {
                if (this.f4349e == null) {
                    this.f4349e = this.f4347c.mo4428p();
                }
                this.f4349e.mo4524v(fragment, C1593j.C1598b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f4352h = fragment;
        }
    }

    /* renamed from: r */
    public void mo4601r(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    /* renamed from: t */
    public abstract Fragment mo4602t(int i);

    public C1489c0(FragmentManager fragmentManager, int i) {
        this.f4349e = null;
        this.f4350f = new ArrayList();
        this.f4351g = new ArrayList();
        this.f4352h = null;
        this.f4347c = fragmentManager;
        this.f4348d = i;
    }
}

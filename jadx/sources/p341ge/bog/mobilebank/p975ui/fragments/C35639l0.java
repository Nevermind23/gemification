package p341ge.bog.mobilebank.p975ui.fragments;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.FragmentManager;
import p30.C27185o;
import p341ge.bog.mobilebank.model.search.SearchResultType;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.fragments.l0 */
public class C35639l0 extends C35651n1 {

    /* renamed from: d */
    protected FragmentManager f86176d;

    /* renamed from: e */
    private int f86177e;

    /* renamed from: f */
    private int f86178f;

    /* renamed from: g */
    private long f86179g = -1;

    /* renamed from: h */
    private C35651n1 f86180h;

    /* renamed from: j1 */
    private void m105851j1() {
        if (this.f86176d == null) {
            try {
                this.f86176d = getChildFragmentManager();
            } catch (Exception unused) {
            }
        }
        if (this.f86176d != null) {
            for (int i = 0; i < this.f86176d.mo4432r0(); i++) {
                mo86726l1();
            }
        }
    }

    /* renamed from: k1 */
    public static C35639l0 m105852k1() {
        return new C35639l0();
    }

    public String getHeaderText() {
        C35651n1 n1Var = this.f86180h;
        if (n1Var == null) {
            return null;
        }
        return n1Var.getHeaderText();
    }

    public SearchResultType getSearchType() {
        C35651n1 n1Var = this.f86180h;
        if (n1Var == null) {
            return null;
        }
        return n1Var.getSearchType();
    }

    /* renamed from: i1 */
    public void mo86725i1(C35651n1 n1Var, boolean z) {
        this.f86180h = n1Var;
        if (!z) {
            m105851j1();
        }
        if (this.f86176d == null) {
            try {
                this.f86176d = getChildFragmentManager();
            } catch (Exception unused) {
            }
        }
        FragmentManager fragmentManager = this.f86176d;
        if (fragmentManager != null) {
            C1493e0 p = fragmentManager.mo4428p();
            p.mo4639r(C10322k.fragment_container_frame, n1Var);
            if (z) {
                p.mo4636g((String) null);
            }
            p.mo4515i();
        }
    }

    /* renamed from: l1 */
    public boolean mo86726l1() {
        if (this.f86176d == null) {
            try {
                this.f86176d = getChildFragmentManager();
            } catch (Exception unused) {
            }
        }
        FragmentManager fragmentManager = this.f86176d;
        if (fragmentManager == null || fragmentManager.mo4432r0() <= 0) {
            return false;
        }
        this.f86176d.mo4409g1();
        return true;
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_container;
    }

    /* renamed from: m1 */
    public void mo86727m1(int i) {
        this.f86177e = i;
    }

    /* renamed from: n1 */
    public void mo86728n1(long j) {
        this.f86179g = j;
    }

    /* renamed from: o1 */
    public void mo86729o1(int i) {
        this.f86178f = i;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f86176d = getChildFragmentManager();
        C27185o L1 = C27185o.m84186L1(false);
        L1.setViewPagerFragment(isViewPagerFragment());
        Bundle bundle2 = new Bundle();
        bundle2.putInt("PAYMENTS_FRAGMENT_TAB_KEY", this.f86177e);
        bundle2.putInt("PRODUCT_TYPE_KEY", this.f86178f);
        bundle2.putLong("PRODUCT_ACCT_KEY", this.f86179g);
        L1.setArguments(bundle2);
        mo86725i1(L1, false);
    }
}

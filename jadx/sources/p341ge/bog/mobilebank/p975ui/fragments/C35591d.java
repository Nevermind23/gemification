package p341ge.bog.mobilebank.p975ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import g91.C32303f;
import p341ge.bog.mobilebank.model.Bond;
import p90.C27317h3;

/* renamed from: ge.bog.mobilebank.ui.fragments.d */
public class C35591d extends C35651n1 {

    /* renamed from: d */
    private C27317h3 f86069d;

    /* renamed from: e */
    private Bond f86070e;

    /* renamed from: j1 */
    private void m105729j1() {
        this.f86069d.mo66610E(C32303f.m95198i(this.f86070e.getCcy(), true));
        this.f86069d.mo66609D(this.f86070e);
    }

    /* renamed from: i1 */
    public void mo86666i1(Bond bond) {
        this.f86070e = bond;
        if (this.f86069d != null) {
            m105729j1();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C27317h3 B = C27317h3.m84576B(layoutInflater, viewGroup, false);
        this.f86069d = B;
        this.rootView = B.mo3946b();
        if (this.f86070e != null) {
            m105729j1();
        }
        return this.rootView;
    }
}

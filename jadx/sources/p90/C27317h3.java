package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C1360g;
import androidx.databinding.ViewDataBinding;
import p341ge.bog.mobilebank.model.Bond;
import p366bk.C10324m;

/* renamed from: p90.h3 */
public abstract class C27317h3 extends ViewDataBinding {

    /* renamed from: y */
    protected Bond f68875y;

    /* renamed from: z */
    protected String f68876z;

    protected C27317h3(Object obj, View view, int i) {
        super(obj, view, i);
    }

    /* renamed from: B */
    public static C27317h3 m84576B(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        C1360g.m4684d();
        return m84577C(layoutInflater, viewGroup, z, (Object) null);
    }

    /* renamed from: C */
    public static C27317h3 m84577C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (C27317h3) ViewDataBinding.m4664r(layoutInflater, C10324m.fragment_bond_details, viewGroup, z, obj);
    }

    /* renamed from: D */
    public abstract void mo66609D(Bond bond);

    /* renamed from: E */
    public abstract void mo66610E(String str);
}

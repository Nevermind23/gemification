package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.C1360g;
import androidx.databinding.ViewDataBinding;
import p341ge.bog.mobilebank.model.DepositBond;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10324m;

/* renamed from: p90.p3 */
public abstract class C27392p3 extends ViewDataBinding {

    /* renamed from: A */
    public final ConstraintLayout f69527A;

    /* renamed from: B */
    protected DepositBond f69528B;

    /* renamed from: C */
    protected String f69529C;

    /* renamed from: y */
    public final BigDividerView f69530y;

    /* renamed from: z */
    public final BogTextView f69531z;

    protected C27392p3(Object obj, View view, int i, BigDividerView bigDividerView, BogTextView bogTextView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.f69530y = bigDividerView;
        this.f69531z = bogTextView;
        this.f69527A = constraintLayout;
    }

    /* renamed from: B */
    public static C27392p3 m84872B(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        C1360g.m4684d();
        return m84873C(layoutInflater, viewGroup, z, (Object) null);
    }

    /* renamed from: C */
    public static C27392p3 m84873C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (C27392p3) ViewDataBinding.m4664r(layoutInflater, C10324m.fragment_deposit_bond_details, viewGroup, z, obj);
    }

    /* renamed from: D */
    public abstract void mo66686D(DepositBond depositBond);

    /* renamed from: E */
    public abstract void mo66687E(String str);
}

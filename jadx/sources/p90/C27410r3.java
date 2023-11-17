package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.C1360g;
import androidx.databinding.ViewDataBinding;
import p341ge.bog.mobilebank.model.deposits.Deposit;
import p341ge.bog.mobilebank.model.deposits.DepositDetails;
import p341ge.bog.mobilebank.model.deposits.DepositMaximaWrapper;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10324m;

/* renamed from: p90.r3 */
public abstract class C27410r3 extends ViewDataBinding {

    /* renamed from: A */
    public final LinearLayout f69670A;

    /* renamed from: B */
    public final LinearLayout f69671B;

    /* renamed from: C */
    public final LinearLayout f69672C;

    /* renamed from: D */
    public final ImageView f69673D;

    /* renamed from: E */
    public final LinearLayout f69674E;

    /* renamed from: F */
    public final LinearLayout f69675F;

    /* renamed from: G */
    public final ConstraintLayout f69676G;

    /* renamed from: H */
    protected Deposit f69677H;

    /* renamed from: I */
    protected DepositDetails f69678I;

    /* renamed from: J */
    protected DepositMaximaWrapper f69679J;

    /* renamed from: K */
    protected String f69680K;

    /* renamed from: y */
    public final BigDividerView f69681y;

    /* renamed from: z */
    public final BogTextView f69682z;

    protected C27410r3(Object obj, View view, int i, BigDividerView bigDividerView, BogTextView bogTextView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView, LinearLayout linearLayout4, LinearLayout linearLayout5, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.f69681y = bigDividerView;
        this.f69682z = bogTextView;
        this.f69670A = linearLayout;
        this.f69671B = linearLayout2;
        this.f69672C = linearLayout3;
        this.f69673D = imageView;
        this.f69674E = linearLayout4;
        this.f69675F = linearLayout5;
        this.f69676G = constraintLayout;
    }

    /* renamed from: B */
    public static C27410r3 m84944B(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        C1360g.m4684d();
        return m84945C(layoutInflater, viewGroup, z, (Object) null);
    }

    /* renamed from: C */
    public static C27410r3 m84945C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (C27410r3) ViewDataBinding.m4664r(layoutInflater, C10324m.fragment_deposit_detailed, viewGroup, z, obj);
    }

    /* renamed from: D */
    public abstract void mo66707D(String str);

    /* renamed from: E */
    public abstract void mo66708E(Deposit deposit);

    /* renamed from: F */
    public abstract void mo66709F(DepositDetails depositDetails);

    /* renamed from: G */
    public abstract void mo66710G(DepositMaximaWrapper depositMaximaWrapper);
}

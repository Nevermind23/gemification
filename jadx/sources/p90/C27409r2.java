package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.C1360g;
import androidx.databinding.ViewDataBinding;
import p341ge.bog.mobilebank.model.credit.BillInfo;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10324m;

/* renamed from: p90.r2 */
public abstract class C27409r2 extends ViewDataBinding {

    /* renamed from: A */
    public final LinearLayout f69651A;

    /* renamed from: B */
    public final LinearLayout f69652B;

    /* renamed from: C */
    public final LinearLayout f69653C;

    /* renamed from: D */
    public final BogTextView f69654D;

    /* renamed from: E */
    public final LinearLayout f69655E;

    /* renamed from: F */
    public final BogTextView f69656F;

    /* renamed from: G */
    public final BogTextView f69657G;

    /* renamed from: H */
    public final ImageView f69658H;

    /* renamed from: I */
    public final ImageView f69659I;

    /* renamed from: J */
    public final BogTextView f69660J;

    /* renamed from: K */
    public final BogTextView f69661K;

    /* renamed from: L */
    public final LinearLayout f69662L;

    /* renamed from: M */
    public final BogTextView f69663M;

    /* renamed from: N */
    public final BogTextView f69664N;

    /* renamed from: O */
    protected CreditCardAccount f69665O;

    /* renamed from: P */
    protected BillInfo f69666P;

    /* renamed from: Q */
    protected String f69667Q;

    /* renamed from: y */
    public final BogTextView f69668y;

    /* renamed from: z */
    public final LinearLayout f69669z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C27409r2(Object obj, View view, int i, BogTextView bogTextView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, BogTextView bogTextView2, LinearLayout linearLayout5, BogTextView bogTextView3, BogTextView bogTextView4, ImageView imageView, ImageView imageView2, BogTextView bogTextView5, BogTextView bogTextView6, LinearLayout linearLayout6, BogTextView bogTextView7, BogTextView bogTextView8) {
        super(obj, view, i);
        this.f69668y = bogTextView;
        this.f69669z = linearLayout;
        this.f69651A = linearLayout2;
        this.f69652B = linearLayout3;
        this.f69653C = linearLayout4;
        this.f69654D = bogTextView2;
        this.f69655E = linearLayout5;
        this.f69656F = bogTextView3;
        this.f69657G = bogTextView4;
        this.f69658H = imageView;
        this.f69659I = imageView2;
        this.f69660J = bogTextView5;
        this.f69661K = bogTextView6;
        this.f69662L = linearLayout6;
        this.f69663M = bogTextView7;
        this.f69664N = bogTextView8;
    }

    /* renamed from: B */
    public static C27409r2 m84939B(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        C1360g.m4684d();
        return m84940C(layoutInflater, viewGroup, z, (Object) null);
    }

    /* renamed from: C */
    public static C27409r2 m84940C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (C27409r2) ViewDataBinding.m4664r(layoutInflater, C10324m.credit_card_detailed, viewGroup, z, obj);
    }

    /* renamed from: D */
    public abstract void mo66704D(BillInfo billInfo);

    /* renamed from: E */
    public abstract void mo66705E(CreditCardAccount creditCardAccount);

    /* renamed from: F */
    public abstract void mo66706F(String str);
}

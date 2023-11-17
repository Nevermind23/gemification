package p90;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.C1360g;
import androidx.databinding.ViewDataBinding;
import l50.C25838r;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10324m;

/* renamed from: p90.k3 */
public abstract class C27347k3 extends ViewDataBinding {

    /* renamed from: A */
    public final ImageView f69137A;

    /* renamed from: B */
    public final BogTextView f69138B;

    /* renamed from: C */
    public final LinearLayout f69139C;

    /* renamed from: D */
    public final BogTextView f69140D;

    /* renamed from: E */
    public final BogTextView f69141E;

    /* renamed from: F */
    public final AppCompatTextView f69142F;

    /* renamed from: G */
    public final ListItem f69143G;

    /* renamed from: H */
    public final AppCompatTextView f69144H;

    /* renamed from: I */
    public final ImageView f69145I;

    /* renamed from: J */
    public final BogTextView f69146J;

    /* renamed from: K */
    public final AppCompatTextView f69147K;

    /* renamed from: L */
    public final BogTextView f69148L;

    /* renamed from: M */
    public final LinearLayout f69149M;

    /* renamed from: N */
    public final BogTextView f69150N;

    /* renamed from: O */
    public final LinearLayout f69151O;

    /* renamed from: P */
    public final LinearLayout f69152P;

    /* renamed from: Q */
    public final LinearLayout f69153Q;

    /* renamed from: R */
    protected C25838r f69154R;

    /* renamed from: S */
    protected Context f69155S;

    /* renamed from: y */
    public final BogTextView f69156y;

    /* renamed from: z */
    public final View f69157z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C27347k3(Object obj, View view, int i, BogTextView bogTextView, View view2, ImageView imageView, BogTextView bogTextView2, LinearLayout linearLayout, BogTextView bogTextView3, BogTextView bogTextView4, AppCompatTextView appCompatTextView, ListItem listItem, AppCompatTextView appCompatTextView2, ImageView imageView2, BogTextView bogTextView5, AppCompatTextView appCompatTextView3, BogTextView bogTextView6, LinearLayout linearLayout2, BogTextView bogTextView7, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
        super(obj, view, i);
        this.f69156y = bogTextView;
        this.f69157z = view2;
        this.f69137A = imageView;
        this.f69138B = bogTextView2;
        this.f69139C = linearLayout;
        this.f69140D = bogTextView3;
        this.f69141E = bogTextView4;
        this.f69142F = appCompatTextView;
        this.f69143G = listItem;
        this.f69144H = appCompatTextView2;
        this.f69145I = imageView2;
        this.f69146J = bogTextView5;
        this.f69147K = appCompatTextView3;
        this.f69148L = bogTextView6;
        this.f69149M = linearLayout2;
        this.f69150N = bogTextView7;
        this.f69151O = linearLayout3;
        this.f69152P = linearLayout4;
        this.f69153Q = linearLayout5;
    }

    /* renamed from: B */
    public static C27347k3 m84696B(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        C1360g.m4684d();
        return m84697C(layoutInflater, viewGroup, z, (Object) null);
    }

    /* renamed from: C */
    public static C27347k3 m84697C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (C27347k3) ViewDataBinding.m4664r(layoutInflater, C10324m.fragment_card_detailed, viewGroup, z, obj);
    }

    /* renamed from: D */
    public abstract void mo66640D(C25838r rVar);

    /* renamed from: E */
    public abstract void mo66641E(Context context);
}

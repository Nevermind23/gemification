package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.C1360g;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import l50.C25827g;
import l50.C25828h;
import l50.C25832l;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10324m;

/* renamed from: p90.f3 */
public abstract class C27297f3 extends ViewDataBinding {

    /* renamed from: A */
    public final RecyclerView f68702A;

    /* renamed from: B */
    public final LinearLayout f68703B;

    /* renamed from: C */
    public final LinearLayout f68704C;

    /* renamed from: D */
    public final LinearLayout f68705D;

    /* renamed from: E */
    public final LinearLayout f68706E;

    /* renamed from: F */
    public final BogTextView f68707F;

    /* renamed from: G */
    public final NestedScrollView f68708G;

    /* renamed from: H */
    public final LinearLayout f68709H;

    /* renamed from: I */
    public final LinearLayout f68710I;

    /* renamed from: J */
    public final LinearLayout f68711J;

    /* renamed from: K */
    public final LinearLayout f68712K;

    /* renamed from: L */
    public final ImageView f68713L;

    /* renamed from: M */
    public final ImageView f68714M;

    /* renamed from: N */
    protected C25832l f68715N;

    /* renamed from: O */
    protected C25828h f68716O;

    /* renamed from: P */
    protected C25827g f68717P;

    /* renamed from: Q */
    protected String f68718Q;

    /* renamed from: y */
    public final LinearLayout f68719y;

    /* renamed from: z */
    public final LinearLayout f68720z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C27297f3(Object obj, View view, int i, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, BogTextView bogTextView, NestedScrollView nestedScrollView, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, ImageView imageView, ImageView imageView2) {
        super(obj, view, i);
        this.f68719y = linearLayout;
        this.f68720z = linearLayout2;
        this.f68702A = recyclerView;
        this.f68703B = linearLayout3;
        this.f68704C = linearLayout4;
        this.f68705D = linearLayout5;
        this.f68706E = linearLayout6;
        this.f68707F = bogTextView;
        this.f68708G = nestedScrollView;
        this.f68709H = linearLayout7;
        this.f68710I = linearLayout8;
        this.f68711J = linearLayout9;
        this.f68712K = linearLayout10;
        this.f68713L = imageView;
        this.f68714M = imageView2;
    }

    /* renamed from: B */
    public static C27297f3 m84491B(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        C1360g.m4684d();
        return m84492C(layoutInflater, viewGroup, z, (Object) null);
    }

    /* renamed from: C */
    public static C27297f3 m84492C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (C27297f3) ViewDataBinding.m4664r(layoutInflater, C10324m.fragment_account_detailed, viewGroup, z, obj);
    }

    /* renamed from: D */
    public abstract void mo66587D(C25832l lVar);

    /* renamed from: E */
    public abstract void mo66588E(C25828h hVar);

    /* renamed from: F */
    public abstract void mo66589F(String str);

    /* renamed from: G */
    public abstract void mo66590G(C25827g gVar);
}

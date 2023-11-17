package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.y0 */
public final class C27470y0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f70245d;

    /* renamed from: e */
    public final BigDividerView f70246e;

    /* renamed from: f */
    public final BogTextView f70247f;

    /* renamed from: g */
    public final RecyclerView f70248g;

    /* renamed from: h */
    public final ConstraintLayout f70249h;

    /* renamed from: i */
    public final C27272c8 f70250i;

    private C27470y0(ConstraintLayout constraintLayout, BigDividerView bigDividerView, BogTextView bogTextView, RecyclerView recyclerView, ConstraintLayout constraintLayout2, C27272c8 c8Var) {
        this.f70245d = constraintLayout;
        this.f70246e = bigDividerView;
        this.f70247f = bogTextView;
        this.f70248g = recyclerView;
        this.f70249h = constraintLayout2;
        this.f70250i = c8Var;
    }

    /* renamed from: a */
    public static C27470y0 m85185a(View view) {
        int i = C10322k.f28850jc;
        BigDividerView bigDividerView = (BigDividerView) C6202b.m24689a(view, i);
        if (bigDividerView != null) {
            i = C10322k.f28741Hf;
            BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
            if (bogTextView != null) {
                i = C10322k.f28712Br;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = C10322k.f28730Ex;
                    View a = C6202b.m24689a(view, i);
                    if (a != null) {
                        return new C27470y0(constraintLayout, bigDividerView, bogTextView, recyclerView, constraintLayout, C27272c8.m84388a(a));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27470y0 m85186d(LayoutInflater layoutInflater) {
        return m85187e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27470y0 m85187e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_offer_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85185a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f70245d;
    }
}

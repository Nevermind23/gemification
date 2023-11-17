package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.l0 */
public final class C12755l0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f37777d;

    /* renamed from: e */
    public final EmptyWidget f37778e;

    /* renamed from: f */
    public final LinearLayout f37779f;

    /* renamed from: g */
    public final RecyclerView f37780g;

    private C12755l0(LinearLayout linearLayout, EmptyWidget emptyWidget, LinearLayout linearLayout2, RecyclerView recyclerView) {
        this.f37777d = linearLayout;
        this.f37778e = emptyWidget;
        this.f37779f = linearLayout2;
        this.f37780g = recyclerView;
    }

    /* renamed from: a */
    public static C12755l0 m48414a(View view) {
        int i = C10114f.benef_title;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = C10114f.pager_recycler;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i2);
            if (recyclerView != null) {
                return new C12755l0(linearLayout, emptyWidget, linearLayout, recyclerView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12755l0 m48415d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_benefit_pager, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48414a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f37777d;
    }
}

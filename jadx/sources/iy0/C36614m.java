package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;

/* renamed from: iy0.m */
public final class C36614m implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88323d;

    /* renamed from: e */
    public final AppBarLayout f88324e;

    /* renamed from: f */
    public final RecyclerView f88325f;

    /* renamed from: g */
    public final CardView f88326g;

    /* renamed from: h */
    public final ToolbarView f88327h;

    private C36614m(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, RecyclerView recyclerView, CardView cardView, ToolbarView toolbarView) {
        this.f88323d = constraintLayout;
        this.f88324e = appBarLayout;
        this.f88325f = recyclerView;
        this.f88326g = cardView;
        this.f88327h = toolbarView;
    }

    /* renamed from: a */
    public static C36614m m108588a(View view) {
        int i = C36271e.f87533m;
        AppBarLayout appBarLayout = (AppBarLayout) C6202b.m24689a(view, i);
        if (appBarLayout != null) {
            i = C36271e.f87520h1;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C36271e.f87500U1;
                CardView cardView = (CardView) C6202b.m24689a(view, i);
                if (cardView != null) {
                    i = C36271e.f87551w2;
                    ToolbarView toolbarView = (ToolbarView) C6202b.m24689a(view, i);
                    if (toolbarView != null) {
                        return new C36614m((ConstraintLayout) view, appBarLayout, recyclerView, cardView, toolbarView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36614m m108589d(LayoutInflater layoutInflater) {
        return m108590e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C36614m m108590e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.activity_product_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108588a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88323d;
    }
}

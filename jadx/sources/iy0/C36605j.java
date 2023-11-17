package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;

/* renamed from: iy0.j */
public final class C36605j implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88278d;

    /* renamed from: e */
    public final AppBarLayout f88279e;

    /* renamed from: f */
    public final RecyclerView f88280f;

    /* renamed from: g */
    public final FrameLayout f88281g;

    /* renamed from: h */
    public final ToolbarView f88282h;

    private C36605j(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, RecyclerView recyclerView, FrameLayout frameLayout, ToolbarView toolbarView) {
        this.f88278d = constraintLayout;
        this.f88279e = appBarLayout;
        this.f88280f = recyclerView;
        this.f88281g = frameLayout;
        this.f88282h = toolbarView;
    }

    /* renamed from: a */
    public static C36605j m108549a(View view) {
        int i = C36271e.f87533m;
        AppBarLayout appBarLayout = (AppBarLayout) C6202b.m24689a(view, i);
        if (appBarLayout != null) {
            i = C36271e.f87520h1;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C36271e.f87500U1;
                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                if (frameLayout != null) {
                    i = C36271e.f87551w2;
                    ToolbarView toolbarView = (ToolbarView) C6202b.m24689a(view, i);
                    if (toolbarView != null) {
                        return new C36605j((ConstraintLayout) view, appBarLayout, recyclerView, frameLayout, toolbarView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36605j m108550d(LayoutInflater layoutInflater) {
        return m108551e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C36605j m108551e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.activity_credit_card_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108549a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88278d;
    }
}

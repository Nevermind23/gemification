package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p480jl.C16213d;
import p480jl.C16214e;

/* renamed from: nl.f */
public final class C17053f implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f47595d;

    /* renamed from: e */
    public final AppBarLayout f47596e;

    /* renamed from: f */
    public final FrameLayout f47597f;

    /* renamed from: g */
    public final RecyclerView f47598g;

    /* renamed from: h */
    public final ToolbarView f47599h;

    private C17053f(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, FrameLayout frameLayout, RecyclerView recyclerView, ToolbarView toolbarView) {
        this.f47595d = constraintLayout;
        this.f47596e = appBarLayout;
        this.f47597f = frameLayout;
        this.f47598g = recyclerView;
        this.f47599h = toolbarView;
    }

    /* renamed from: a */
    public static C17053f m59914a(View view) {
        int i = C16213d.f45739b;
        AppBarLayout appBarLayout = (AppBarLayout) C6202b.m24689a(view, i);
        if (appBarLayout != null) {
            i = C16213d.f45719A;
            FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
            if (frameLayout != null) {
                i = C16213d.f45735T;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    i = C16213d.f45725E0;
                    ToolbarView toolbarView = (ToolbarView) C6202b.m24689a(view, i);
                    if (toolbarView != null) {
                        return new C17053f((ConstraintLayout) view, appBarLayout, frameLayout, recyclerView, toolbarView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17053f m59915d(LayoutInflater layoutInflater) {
        return m59916e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17053f m59916e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.activity_bnpl_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59914a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f47595d;
    }
}

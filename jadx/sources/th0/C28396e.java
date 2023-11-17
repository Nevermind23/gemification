package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;

/* renamed from: th0.e */
public final class C28396e implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72010d;

    /* renamed from: e */
    public final AppBarLayout f72011e;

    /* renamed from: f */
    public final FragmentContainerView f72012f;

    /* renamed from: g */
    public final ToolbarView f72013g;

    private C28396e(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, FragmentContainerView fragmentContainerView, ToolbarView toolbarView) {
        this.f72010d = constraintLayout;
        this.f72011e = appBarLayout;
        this.f72012f = fragmentContainerView;
        this.f72013g = toolbarView;
    }

    /* renamed from: a */
    public static C28396e m87104a(View view) {
        int i = C27010e.f67831r;
        AppBarLayout appBarLayout = (AppBarLayout) C6202b.m24689a(view, i);
        if (appBarLayout != null) {
            i = C27010e.f67825j1;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) C6202b.m24689a(view, i);
            if (fragmentContainerView != null) {
                i = C27010e.f67830l2;
                ToolbarView toolbarView = (ToolbarView) C6202b.m24689a(view, i);
                if (toolbarView != null) {
                    return new C28396e((ConstraintLayout) view, appBarLayout, fragmentContainerView, toolbarView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28396e m87105d(LayoutInflater layoutInflater) {
        return m87106e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28396e m87106e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.activity_gift_cards, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87104a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72010d;
    }
}

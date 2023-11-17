package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;
import lr0.C37130e;
import lr0.C37131f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;

/* renamed from: pr0.f */
public final class C37952f implements C6201a {

    /* renamed from: d */
    private final FrameLayout f91119d;

    /* renamed from: e */
    public final AppBarLayout f91120e;

    /* renamed from: f */
    public final FragmentContainerView f91121f;

    /* renamed from: g */
    public final ToolbarView f91122g;

    private C37952f(FrameLayout frameLayout, AppBarLayout appBarLayout, FragmentContainerView fragmentContainerView, ToolbarView toolbarView) {
        this.f91119d = frameLayout;
        this.f91120e = appBarLayout;
        this.f91121f = fragmentContainerView;
        this.f91122g = toolbarView;
    }

    /* renamed from: a */
    public static C37952f m111552a(View view) {
        int i = C37130e.f89438o;
        AppBarLayout appBarLayout = (AppBarLayout) C6202b.m24689a(view, i);
        if (appBarLayout != null) {
            i = C37130e.f89448v0;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) C6202b.m24689a(view, i);
            if (fragmentContainerView != null) {
                i = C37130e.f89453y1;
                ToolbarView toolbarView = (ToolbarView) C6202b.m24689a(view, i);
                if (toolbarView != null) {
                    return new C37952f((FrameLayout) view, appBarLayout, fragmentContainerView, toolbarView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37952f m111553d(LayoutInflater layoutInflater) {
        return m111554e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C37952f m111554e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.activity_loans, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111552a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f91119d;
    }
}

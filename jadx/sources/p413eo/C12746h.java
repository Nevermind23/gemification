package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.h */
public final class C12746h implements C6201a {

    /* renamed from: d */
    private final LinearLayout f37738d;

    /* renamed from: e */
    public final FragmentContainerView f37739e;

    /* renamed from: f */
    public final ToolbarView f37740f;

    private C12746h(LinearLayout linearLayout, FragmentContainerView fragmentContainerView, ToolbarView toolbarView) {
        this.f37738d = linearLayout;
        this.f37739e = fragmentContainerView;
        this.f37740f = toolbarView;
    }

    /* renamed from: a */
    public static C12746h m48377a(View view) {
        int i = C10114f.f27924C0;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C6202b.m24689a(view, i);
        if (fragmentContainerView != null) {
            i = C10114f.f27970r1;
            ToolbarView toolbarView = (ToolbarView) C6202b.m24689a(view, i);
            if (toolbarView != null) {
                return new C12746h((LinearLayout) view, fragmentContainerView, toolbarView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12746h m48378d(LayoutInflater layoutInflater) {
        return m48379e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C12746h m48379e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.activity_category_packages, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48377a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f37738d;
    }
}

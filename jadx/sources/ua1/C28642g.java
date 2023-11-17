package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;

/* renamed from: ua1.g */
public final class C28642g implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72732d;

    /* renamed from: e */
    public final FragmentContainerView f72733e;

    /* renamed from: f */
    public final ToolbarView f72734f;

    private C28642g(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView, ToolbarView toolbarView) {
        this.f72732d = constraintLayout;
        this.f72733e = fragmentContainerView;
        this.f72734f = toolbarView;
    }

    /* renamed from: a */
    public static C28642g m87670a(View view) {
        int i = C10216u.f28301Q0;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C6202b.m24689a(view, i);
        if (fragmentContainerView != null) {
            i = C10216u.f28327g3;
            ToolbarView toolbarView = (ToolbarView) C6202b.m24689a(view, i);
            if (toolbarView != null) {
                return new C28642g((ConstraintLayout) view, fragmentContainerView, toolbarView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28642g m87671d(LayoutInflater layoutInflater) {
        return m87672e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28642g m87672e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.activity_setup_parameters, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87670a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72732d;
    }
}

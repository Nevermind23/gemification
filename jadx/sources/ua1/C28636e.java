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

/* renamed from: ua1.e */
public final class C28636e implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72710d;

    /* renamed from: e */
    public final FragmentContainerView f72711e;

    /* renamed from: f */
    public final ToolbarView f72712f;

    private C28636e(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView, ToolbarView toolbarView) {
        this.f72710d = constraintLayout;
        this.f72711e = fragmentContainerView;
        this.f72712f = toolbarView;
    }

    /* renamed from: a */
    public static C28636e m87642a(View view) {
        int i = C10216u.f28301Q0;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C6202b.m24689a(view, i);
        if (fragmentContainerView != null) {
            i = C10216u.f28327g3;
            ToolbarView toolbarView = (ToolbarView) C6202b.m24689a(view, i);
            if (toolbarView != null) {
                return new C28636e((ConstraintLayout) view, fragmentContainerView, toolbarView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28636e m87643d(LayoutInflater layoutInflater) {
        return m87644e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28636e m87644e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.activity_password_recovery, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87642a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72710d;
    }
}

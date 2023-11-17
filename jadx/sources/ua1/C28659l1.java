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

/* renamed from: ua1.l1 */
public final class C28659l1 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72814d;

    /* renamed from: e */
    public final FragmentContainerView f72815e;

    private C28659l1(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView) {
        this.f72814d = constraintLayout;
        this.f72815e = fragmentContainerView;
    }

    /* renamed from: a */
    public static C28659l1 m87746a(View view) {
        int i = C10216u.f28298P0;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C6202b.m24689a(view, i);
        if (fragmentContainerView != null) {
            return new C28659l1((ConstraintLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28659l1 m87747d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.layout_action_sheet_fragment_container, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87746a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72814d;
    }
}

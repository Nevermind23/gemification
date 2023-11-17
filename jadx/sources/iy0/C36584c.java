package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: iy0.c */
public final class C36584c implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88158d;

    /* renamed from: e */
    public final FragmentContainerView f88159e;

    private C36584c(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView) {
        this.f88158d = constraintLayout;
        this.f88159e = fragmentContainerView;
    }

    /* renamed from: a */
    public static C36584c m108461a(View view) {
        int i = C36271e.f87546t0;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C6202b.m24689a(view, i);
        if (fragmentContainerView != null) {
            return new C36584c((ConstraintLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36584c m108462d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.action_sheet_additional_functions, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108461a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88158d;
    }
}

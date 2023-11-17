package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.a */
public final class C12726a implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f37659d;

    /* renamed from: e */
    public final FragmentContainerView f37660e;

    private C12726a(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView) {
        this.f37659d = constraintLayout;
        this.f37660e = fragmentContainerView;
    }

    /* renamed from: a */
    public static C12726a m48297a(View view) {
        int i = C10114f.f27958i0;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C6202b.m24689a(view, i);
        if (fragmentContainerView != null) {
            return new C12726a((ConstraintLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12726a m48298d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.action_sheet_add_financial_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48297a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f37659d;
    }
}

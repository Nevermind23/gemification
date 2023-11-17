package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import bv0.C31204d;
import bv0.C31205e;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: ev0.a */
public final class C31815a implements C6201a {

    /* renamed from: d */
    private final LinearLayout f78444d;

    /* renamed from: e */
    public final FragmentContainerView f78445e;

    private C31815a(LinearLayout linearLayout, FragmentContainerView fragmentContainerView) {
        this.f78444d = linearLayout;
        this.f78445e = fragmentContainerView;
    }

    /* renamed from: a */
    public static C31815a m94044a(View view) {
        int i = C31204d.f77539w;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C6202b.m24689a(view, i);
        if (fragmentContainerView != null) {
            return new C31815a((LinearLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31815a m94045d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.action_sheet_select_bank_and_period, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94044a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f78444d;
    }
}

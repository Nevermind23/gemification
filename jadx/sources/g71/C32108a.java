package g71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import c71.C31284d;
import c71.C31285e;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: g71.a */
public final class C32108a implements C6201a {

    /* renamed from: d */
    private final LinearLayout f78963d;

    /* renamed from: e */
    public final FragmentContainerView f78964e;

    private C32108a(LinearLayout linearLayout, FragmentContainerView fragmentContainerView) {
        this.f78963d = linearLayout;
        this.f78964e = fragmentContainerView;
    }

    /* renamed from: a */
    public static C32108a m94564a(View view) {
        int i = C31284d.f77712x;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C6202b.m24689a(view, i);
        if (fragmentContainerView != null) {
            return new C32108a((LinearLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C32108a m94565d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31285e.action_sheet_pass_migrate, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94564a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f78963d;
    }
}

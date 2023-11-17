package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import p086g1.C6201a;
import p086g1.C6202b;
import rs0.C38336c;
import rs0.C38337d;

/* renamed from: vs0.u */
public final class C39462u implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f93850d;

    /* renamed from: e */
    public final FragmentContainerView f93851e;

    private C39462u(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView) {
        this.f93850d = constraintLayout;
        this.f93851e = fragmentContainerView;
    }

    /* renamed from: a */
    public static C39462u m114703a(View view) {
        int i = C38336c.f91863X;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C6202b.m24689a(view, i);
        if (fragmentContainerView != null) {
            return new C39462u((ConstraintLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39462u m114704d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.layout_close_piggy_bank_action_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114703a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f93850d;
    }
}

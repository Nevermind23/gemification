package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentContainerView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.a */
public final class C17147a implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f47964d;

    /* renamed from: e */
    public final FragmentContainerView f47965e;

    private C17147a(RelativeLayout relativeLayout, FragmentContainerView fragmentContainerView) {
        this.f47964d = relativeLayout;
        this.f47965e = fragmentContainerView;
    }

    /* renamed from: a */
    public static C17147a m60224a(View view) {
        int i = C16347e.f46195w0;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view.findViewById(i);
        if (fragmentContainerView != null) {
            return new C17147a((RelativeLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17147a m60225d(LayoutInflater layoutInflater) {
        return m60226e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17147a m60226e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.activity_navigation_identomat, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60224a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f47964d;
    }
}

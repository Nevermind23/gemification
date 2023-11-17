package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: ua1.f */
public final class C28639f implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72723d;

    /* renamed from: e */
    public final FragmentContainerView f72724e;

    private C28639f(LinearLayout linearLayout, FragmentContainerView fragmentContainerView) {
        this.f72723d = linearLayout;
        this.f72724e = fragmentContainerView;
    }

    /* renamed from: a */
    public static C28639f m87656a(View view) {
        int i = C10216u.f28301Q0;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C6202b.m24689a(view, i);
        if (fragmentContainerView != null) {
            return new C28639f((LinearLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28639f m87657d(LayoutInflater layoutInflater) {
        return m87658e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28639f m87658e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.f28350f, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87656a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72723d;
    }
}

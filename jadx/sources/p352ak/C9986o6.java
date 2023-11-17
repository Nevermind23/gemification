package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.o6 */
public final class C9986o6 implements C6201a {

    /* renamed from: d */
    private final View f27374d;

    /* renamed from: e */
    public final AppCompatImageView f27375e;

    private C9986o6(View view, AppCompatImageView appCompatImageView) {
        this.f27374d = view;
        this.f27375e = appCompatImageView;
    }

    /* renamed from: a */
    public static C9986o6 m36625a(View view) {
        int i = C17782g.f49752d0;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            return new C9986o6(view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9986o6 m36626c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_verified_badge, viewGroup);
            return m36625a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27374d;
    }
}

package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import oh0.C27011f;
import p086g1.C6201a;

/* renamed from: th0.u */
public final class C28428u implements C6201a {

    /* renamed from: d */
    private final FrameLayout f72215d;

    private C28428u(FrameLayout frameLayout) {
        this.f72215d = frameLayout;
    }

    /* renamed from: a */
    public static C28428u m87233a(View view) {
        if (view != null) {
            return new C28428u((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28428u m87234d(LayoutInflater layoutInflater) {
        return m87235e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28428u m87235e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_contacts_permission_icon, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87233a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f72215d;
    }
}

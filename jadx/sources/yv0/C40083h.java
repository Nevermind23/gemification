package yv0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p086g1.C6201a;
import uv0.C39107d;

/* renamed from: yv0.h */
public final class C40083h implements C6201a {

    /* renamed from: d */
    private final FrameLayout f95298d;

    private C40083h(FrameLayout frameLayout) {
        this.f95298d = frameLayout;
    }

    /* renamed from: a */
    public static C40083h m116137a(View view) {
        if (view != null) {
            return new C40083h((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C40083h m116138d(LayoutInflater layoutInflater) {
        return m116139e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C40083h m116139e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39107d.layout_contacts_permission_icon, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116137a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f95298d;
    }
}

package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import hy0.C36272f;
import p086g1.C6201a;

/* renamed from: iy0.x */
public final class C36647x implements C6201a {

    /* renamed from: d */
    private final FrameLayout f88453d;

    private C36647x(FrameLayout frameLayout) {
        this.f88453d = frameLayout;
    }

    /* renamed from: a */
    public static C36647x m108723a(View view) {
        if (view != null) {
            return new C36647x((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36647x m108724d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.grid_item_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108723a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f88453d;
    }
}

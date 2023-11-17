package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.m */
public final class C9963m implements C6201a {

    /* renamed from: d */
    private final FrameLayout f27258d;

    /* renamed from: e */
    public final AppCompatImageView f27259e;

    private C9963m(FrameLayout frameLayout, AppCompatImageView appCompatImageView) {
        this.f27258d = frameLayout;
        this.f27259e = appCompatImageView;
    }

    /* renamed from: a */
    public static C9963m m36542a(View view) {
        int i = C17782g.f49787r4;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            return new C9963m((FrameLayout) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9963m m36543d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.item_dynamic_thumbnail_card_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36542a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f27258d;
    }
}

package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p601sg.C17783h;

/* renamed from: ak.l */
public final class C9955l implements C6201a {

    /* renamed from: d */
    private final AppCompatImageView f27219d;

    /* renamed from: e */
    public final AppCompatImageView f27220e;

    private C9955l(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f27219d = appCompatImageView;
        this.f27220e = appCompatImageView2;
    }

    /* renamed from: a */
    public static C9955l m36510a(View view) {
        if (view != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view;
            return new C9955l(appCompatImageView, appCompatImageView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C9955l m36511d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.item_dialog_rate_star, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36510a(inflate);
    }

    /* renamed from: c */
    public AppCompatImageView mo3946b() {
        return this.f27219d;
    }
}

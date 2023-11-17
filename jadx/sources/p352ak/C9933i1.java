package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p601sg.C17783h;

/* renamed from: ak.i1 */
public final class C9933i1 implements C6201a {

    /* renamed from: d */
    private final AppCompatImageView f27091d;

    /* renamed from: e */
    public final AppCompatImageView f27092e;

    private C9933i1(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f27091d = appCompatImageView;
        this.f27092e = appCompatImageView2;
    }

    /* renamed from: a */
    public static C9933i1 m36434a(View view) {
        if (view != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view;
            return new C9933i1(appCompatImageView, appCompatImageView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C9933i1 m36435d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_icon_normal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36434a(inflate);
    }

    /* renamed from: c */
    public AppCompatImageView mo3946b() {
        return this.f27091d;
    }
}

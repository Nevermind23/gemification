package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import oh0.C27011f;
import p086g1.C6201a;

/* renamed from: th0.w0 */
public final class C28433w0 implements C6201a {

    /* renamed from: d */
    private final AppCompatImageView f72226d;

    /* renamed from: e */
    public final AppCompatImageView f72227e;

    private C28433w0(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f72226d = appCompatImageView;
        this.f72227e = appCompatImageView2;
    }

    /* renamed from: a */
    public static C28433w0 m87255a(View view) {
        if (view != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view;
            return new C28433w0(appCompatImageView, appCompatImageView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28433w0 m87256d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_terms_of_usage_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87255a(inflate);
    }

    /* renamed from: c */
    public AppCompatImageView mo3946b() {
        return this.f72226d;
    }
}

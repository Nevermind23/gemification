package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.x0 */
public final class C10044x0 implements C6201a {

    /* renamed from: d */
    private final View f27719d;

    /* renamed from: e */
    public final LayerView f27720e;

    /* renamed from: f */
    public final AppCompatImageView f27721f;

    /* renamed from: g */
    public final AppCompatTextView f27722g;

    private C10044x0(View view, LayerView layerView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f27719d = view;
        this.f27720e = layerView;
        this.f27721f = appCompatImageView;
        this.f27722g = appCompatTextView;
    }

    /* renamed from: a */
    public static C10044x0 m36840a(View view) {
        int i = C17782g.chip_circle_layer;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            i = C17782g.chip_icon_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C17782g.chip_title_text;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    return new C10044x0(view, layerView, appCompatImageView, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10044x0 m36841c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_big_chips, viewGroup);
            return m36840a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27719d;
    }
}

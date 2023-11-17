package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.k3 */
public final class C9951k3 implements C6201a {

    /* renamed from: d */
    private final View f27196d;

    /* renamed from: e */
    public final AppCompatImageView f27197e;

    /* renamed from: f */
    public final LayerView f27198f;

    /* renamed from: g */
    public final LinearLayout f27199g;

    /* renamed from: h */
    public final LinearLayout f27200h;

    /* renamed from: i */
    public final AppCompatImageView f27201i;

    /* renamed from: j */
    public final AppCompatTextView f27202j;

    private C9951k3(View view, AppCompatImageView appCompatImageView, LayerView layerView, LinearLayout linearLayout, LinearLayout linearLayout2, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.f27196d = view;
        this.f27197e = appCompatImageView;
        this.f27198f = layerView;
        this.f27199g = linearLayout;
        this.f27200h = linearLayout2;
        this.f27201i = appCompatImageView2;
        this.f27202j = appCompatTextView;
    }

    /* renamed from: a */
    public static C9951k3 m36497a(View view) {
        int i = C17782g.f49720R;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.arrow_layer_view;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C17782g.f49731U1;
                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                if (linearLayout != null) {
                    i = C17782g.f49776o3;
                    LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view, i);
                    if (linearLayout2 != null) {
                        i = C17782g.f49766j4;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                        if (appCompatImageView2 != null) {
                            i = C17782g.f49751c9;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                            if (appCompatTextView != null) {
                                return new C9951k3(view, appCompatImageView, layerView, linearLayout, linearLayout2, appCompatImageView2, appCompatTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9951k3 m36498c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_icon_accordion, viewGroup);
            return m36497a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27196d;
    }
}

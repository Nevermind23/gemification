package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.n6 */
public final class C9978n6 implements C6201a {

    /* renamed from: d */
    private final View f27321d;

    /* renamed from: e */
    public final Button f27322e;

    /* renamed from: f */
    public final AppCompatTextView f27323f;

    /* renamed from: g */
    public final AppCompatTextView f27324g;

    /* renamed from: h */
    public final LinearLayout f27325h;

    /* renamed from: i */
    public final AppCompatImageView f27326i;

    /* renamed from: j */
    public final LayerView f27327j;

    private C9978n6(View view, Button button, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, LinearLayout linearLayout, AppCompatImageView appCompatImageView, LayerView layerView) {
        this.f27321d = view;
        this.f27322e = button;
        this.f27323f = appCompatTextView;
        this.f27324g = appCompatTextView2;
        this.f27325h = linearLayout;
        this.f27326i = appCompatImageView;
        this.f27327j = layerView;
    }

    /* renamed from: a */
    public static C9978n6 m36597a(View view) {
        int i = C17782g.f49732U5;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C17782g.primary_title;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C17782g.secondary_title;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    i = C17782g.titlesContainer;
                    LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                    if (linearLayout != null) {
                        i = C17782g.toolbar_icon;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                        if (appCompatImageView != null) {
                            i = C17782g.toolbar_icon_layer;
                            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                            if (layerView != null) {
                                return new C9978n6(view, button, appCompatTextView, appCompatTextView2, linearLayout, appCompatImageView, layerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9978n6 m36598c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_toolbar, viewGroup);
            return m36597a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27321d;
    }
}

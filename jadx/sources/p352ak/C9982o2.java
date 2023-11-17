package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.o2 */
public final class C9982o2 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27351d;

    /* renamed from: e */
    public final AppCompatTextView f27352e;

    /* renamed from: f */
    public final LayerView f27353f;

    /* renamed from: g */
    public final AppCompatTextView f27354g;

    /* renamed from: h */
    public final AppCompatTextView f27355h;

    /* renamed from: i */
    public final LayerView f27356i;

    /* renamed from: j */
    public final AppCompatTextView f27357j;

    private C9982o2(LinearLayout linearLayout, AppCompatTextView appCompatTextView, LayerView layerView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, LayerView layerView2, AppCompatTextView appCompatTextView4) {
        this.f27351d = linearLayout;
        this.f27352e = appCompatTextView;
        this.f27353f = layerView;
        this.f27354g = appCompatTextView2;
        this.f27355h = appCompatTextView3;
        this.f27356i = layerView2;
        this.f27357j = appCompatTextView4;
    }

    /* renamed from: a */
    public static C9982o2 m36610a(View view) {
        int i = C17782g.negative_bottom_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.negative_container;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C17782g.negative_title_text;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    i = C17782g.positive_bottom_text;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView3 != null) {
                        i = C17782g.positive_container;
                        LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                        if (layerView2 != null) {
                            i = C17782g.positive_title_text;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) C6202b.m24689a(view, i);
                            if (appCompatTextView4 != null) {
                                return new C9982o2((LinearLayout) view, appCompatTextView, layerView, appCompatTextView2, appCompatTextView3, layerView2, appCompatTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9982o2 m36611d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_colored_total_state, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36610a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27351d;
    }
}

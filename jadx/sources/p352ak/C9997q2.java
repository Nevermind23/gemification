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

/* renamed from: ak.q2 */
public final class C9997q2 implements C6201a {

    /* renamed from: d */
    private final LayerView f27423d;

    /* renamed from: e */
    public final AppCompatTextView f27424e;

    /* renamed from: f */
    public final AppCompatImageView f27425f;

    /* renamed from: g */
    public final AppCompatImageView f27426g;

    /* renamed from: h */
    public final AppCompatImageView f27427h;

    /* renamed from: i */
    public final AppCompatTextView f27428i;

    private C9997q2(LayerView layerView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView2) {
        this.f27423d = layerView;
        this.f27424e = appCompatTextView;
        this.f27425f = appCompatImageView;
        this.f27426g = appCompatImageView2;
        this.f27427h = appCompatImageView3;
        this.f27428i = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9997q2 m36666a(View view) {
        int i = C17782g.f49814z0;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.f49755e1;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C17782g.f49807w1;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView2 != null) {
                    i = C17782g.star_image;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) C6202b.m24689a(view, i);
                    if (appCompatImageView3 != null) {
                        i = C17782g.top_text;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                        if (appCompatTextView2 != null) {
                            return new C9997q2((LayerView) view, appCompatTextView, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9997q2 m36667d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_credit_cad_small_picker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36666a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f27423d;
    }
}

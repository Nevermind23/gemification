package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.input.BogEditText;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.b5 */
public final class C9881b5 implements C6201a {

    /* renamed from: d */
    private final View f26815d;

    /* renamed from: e */
    public final AppCompatTextView f26816e;

    /* renamed from: f */
    public final FrameLayout f26817f;

    /* renamed from: g */
    public final LinearLayout f26818g;

    /* renamed from: h */
    public final AppCompatImageView f26819h;

    /* renamed from: i */
    public final AppCompatImageView f26820i;

    /* renamed from: j */
    public final BogEditText f26821j;

    /* renamed from: k */
    public final LayerView f26822k;

    private C9881b5(View view, AppCompatTextView appCompatTextView, FrameLayout frameLayout, LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, BogEditText bogEditText, LayerView layerView) {
        this.f26815d = view;
        this.f26816e = appCompatTextView;
        this.f26817f = frameLayout;
        this.f26818g = linearLayout;
        this.f26819h = appCompatImageView;
        this.f26820i = appCompatImageView2;
        this.f26821j = bogEditText;
        this.f26822k = layerView;
    }

    /* renamed from: a */
    public static C9881b5 m36242a(View view) {
        int i = C17782g.f49721R0;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.clear_button;
            FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
            if (frameLayout != null) {
                i = C17782g.f49731U1;
                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                if (linearLayout != null) {
                    i = C17782g.icon_clear;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                    if (appCompatImageView != null) {
                        i = C17782g.icon_search;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                        if (appCompatImageView2 != null) {
                            i = C17782g.search_input_text;
                            BogEditText bogEditText = (BogEditText) C6202b.m24689a(view, i);
                            if (bogEditText != null) {
                                i = C17782g.search_view_container;
                                LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                                if (layerView != null) {
                                    return new C9881b5(view, appCompatTextView, frameLayout, linearLayout, appCompatImageView, appCompatImageView2, bogEditText, layerView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9881b5 m36243c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_search, viewGroup);
            return m36242a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f26815d;
    }
}

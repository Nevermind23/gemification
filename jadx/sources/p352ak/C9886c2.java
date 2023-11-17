package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.c2 */
public final class C9886c2 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f26839d;

    /* renamed from: e */
    public final FrameLayout f26840e;

    /* renamed from: f */
    public final AppCompatTextView f26841f;

    /* renamed from: g */
    public final AppCompatImageView f26842g;

    /* renamed from: h */
    public final LayerView f26843h;

    /* renamed from: i */
    public final AppCompatTextView f26844i;

    private C9886c2(FrameLayout frameLayout, FrameLayout frameLayout2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, LayerView layerView, AppCompatTextView appCompatTextView2) {
        this.f26839d = frameLayout;
        this.f26840e = frameLayout2;
        this.f26841f = appCompatTextView;
        this.f26842g = appCompatImageView;
        this.f26843h = layerView;
        this.f26844i = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9886c2 m36261a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = C17782g.f49769k1;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.f49787r4;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C17782g.f49794t4;
                LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                if (layerView != null) {
                    i = C17782g.place_holder_text_View;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView2 != null) {
                        return new C9886c2(frameLayout, frameLayout, appCompatTextView, appCompatImageView, layerView, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9886c2 m36262d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_category_card_horizontal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36261a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f26839d;
    }
}

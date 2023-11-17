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

/* renamed from: ak.d2 */
public final class C9894d2 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f26881d;

    /* renamed from: e */
    public final FrameLayout f26882e;

    /* renamed from: f */
    public final AppCompatTextView f26883f;

    /* renamed from: g */
    public final AppCompatImageView f26884g;

    /* renamed from: h */
    public final LayerView f26885h;

    private C9894d2(FrameLayout frameLayout, FrameLayout frameLayout2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, LayerView layerView) {
        this.f26881d = frameLayout;
        this.f26882e = frameLayout2;
        this.f26883f = appCompatTextView;
        this.f26884g = appCompatImageView;
        this.f26885h = layerView;
    }

    /* renamed from: a */
    public static C9894d2 m36289a(View view) {
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
                    return new C9894d2(frameLayout, frameLayout, appCompatTextView, appCompatImageView, layerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9894d2 m36290d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_category_card_vertical, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36289a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f26881d;
    }
}

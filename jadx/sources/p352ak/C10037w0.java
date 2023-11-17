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

/* renamed from: ak.w0 */
public final class C10037w0 implements C6201a {

    /* renamed from: d */
    private final View f27683d;

    /* renamed from: e */
    public final AppCompatImageView f27684e;

    /* renamed from: f */
    public final LayerView f27685f;

    /* renamed from: g */
    public final LayerView f27686g;

    /* renamed from: h */
    public final AppCompatTextView f27687h;

    private C10037w0(View view, AppCompatImageView appCompatImageView, LayerView layerView, LayerView layerView2, AppCompatTextView appCompatTextView) {
        this.f27683d = view;
        this.f27684e = appCompatImageView;
        this.f27685f = layerView;
        this.f27686g = layerView2;
        this.f27687h = appCompatTextView;
    }

    /* renamed from: a */
    public static C10037w0 m36814a(View view) {
        int i = C17782g.f49766j4;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.f49772m4;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C17782g.f49767j5;
                LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                if (layerView2 != null) {
                    i = C17782g.f49711N5;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView != null) {
                        return new C10037w0(view, appCompatImageView, layerView, layerView2, appCompatTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10037w0 m36815c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_banner_feedback, viewGroup);
            return m36814a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27683d;
    }
}

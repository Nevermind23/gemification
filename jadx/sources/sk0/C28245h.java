package sk0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ok0.C27029e;
import ok0.C27030f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: sk0.h */
public final class C28245h implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f71667d;

    /* renamed from: e */
    public final View f71668e;

    /* renamed from: f */
    public final TextView f71669f;

    /* renamed from: g */
    public final AppCompatImageView f71670g;

    /* renamed from: h */
    public final LayerView f71671h;

    private C28245h(ConstraintLayout constraintLayout, View view, TextView textView, AppCompatImageView appCompatImageView, LayerView layerView) {
        this.f71667d = constraintLayout;
        this.f71668e = view;
        this.f71669f = textView;
        this.f71670g = appCompatImageView;
        this.f71671h = layerView;
    }

    /* renamed from: a */
    public static C28245h m86802a(View view) {
        int i = C27029e.f67885U;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C27029e.f67891h0;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C27029e.transfer_image;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    i = C27029e.transfer_image_layer;
                    LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                    if (layerView != null) {
                        return new C28245h((ConstraintLayout) view, a, textView, appCompatImageView, layerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28245h m86803d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27030f.item_transfer_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m86802a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f71667d;
    }
}

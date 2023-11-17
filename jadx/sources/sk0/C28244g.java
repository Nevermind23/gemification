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

/* renamed from: sk0.g */
public final class C28244g implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f71663d;

    /* renamed from: e */
    public final AppCompatImageView f71664e;

    /* renamed from: f */
    public final LayerView f71665f;

    /* renamed from: g */
    public final TextView f71666g;

    private C28244g(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, LayerView layerView, TextView textView) {
        this.f71663d = constraintLayout;
        this.f71664e = appCompatImageView;
        this.f71665f = layerView;
        this.f71666g = textView;
    }

    /* renamed from: a */
    public static C28244g m86798a(View view) {
        int i = C27029e.search_item_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C27029e.search_item_image_layer;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C27029e.f67891h0;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    return new C28244g((ConstraintLayout) view, appCompatImageView, layerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28244g m86799d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27030f.item_list_search_logout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m86798a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f71663d;
    }
}

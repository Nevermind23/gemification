package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.h8 */
public final class C27322h8 implements C6201a {

    /* renamed from: d */
    private final LayerView f68896d;

    /* renamed from: e */
    public final LayerView f68897e;

    /* renamed from: f */
    public final AppCompatImageView f68898f;

    /* renamed from: g */
    public final AppCompatImageView f68899g;

    private C27322h8(LayerView layerView, LayerView layerView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f68896d = layerView;
        this.f68897e = layerView2;
        this.f68898f = appCompatImageView;
        this.f68899g = appCompatImageView2;
    }

    /* renamed from: a */
    public static C27322h8 m84594a(View view) {
        int i = C10322k.f28804X7;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            i = C10322k.gamification_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C10322k.gamification_logo;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView2 != null) {
                    return new C27322h8((LayerView) view, layerView, appCompatImageView, appCompatImageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27322h8 m84595d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.view_gamification_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84594a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f68896d;
    }
}

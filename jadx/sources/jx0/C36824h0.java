package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: jx0.h0 */
public final class C36824h0 implements C6201a {

    /* renamed from: d */
    private final LayerView f88864d;

    /* renamed from: e */
    public final AppCompatImageView f88865e;

    private C36824h0(LayerView layerView, AppCompatImageView appCompatImageView) {
        this.f88864d = layerView;
        this.f88865e = appCompatImageView;
    }

    /* renamed from: a */
    public static C36824h0 m109108a(View view) {
        int i = C32024d.f78860y;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            return new C36824h0((LayerView) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36824h0 m109109d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.view_input_contact_icon, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109108a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88864d;
    }
}

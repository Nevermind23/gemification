package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import sn0.C17901e;
import sn0.C17902f;

/* renamed from: xn0.o */
public final class C18857o implements C6201a {

    /* renamed from: d */
    private final EmptyWidget f52766d;

    /* renamed from: e */
    public final EmptyWidget f52767e;

    /* renamed from: f */
    public final LayerView f52768f;

    /* renamed from: g */
    public final ImageView f52769g;

    private C18857o(EmptyWidget emptyWidget, EmptyWidget emptyWidget2, LayerView layerView, ImageView imageView) {
        this.f52766d = emptyWidget;
        this.f52767e = emptyWidget2;
        this.f52768f = layerView;
        this.f52769g = imageView;
    }

    /* renamed from: a */
    public static C18857o m63798a(View view) {
        EmptyWidget emptyWidget = (EmptyWidget) view;
        int i = C17901e.f50950F;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            i = C17901e.f50952H;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                return new C18857o(emptyWidget, emptyWidget, layerView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C18857o m63799d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.list_item_category_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63798a(inflate);
    }

    /* renamed from: c */
    public EmptyWidget mo3946b() {
        return this.f52766d;
    }
}

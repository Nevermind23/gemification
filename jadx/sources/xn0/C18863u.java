package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import sn0.C17901e;
import sn0.C17902f;

/* renamed from: xn0.u */
public final class C18863u implements C6201a {

    /* renamed from: d */
    private final LayerView f52779d;

    /* renamed from: e */
    public final Button f52780e;

    /* renamed from: f */
    public final EmptyWidget f52781f;

    /* renamed from: g */
    public final LayerView f52782g;

    /* renamed from: h */
    public final ImageView f52783h;

    /* renamed from: i */
    public final RecyclerView f52784i;

    private C18863u(LayerView layerView, Button button, EmptyWidget emptyWidget, LayerView layerView2, ImageView imageView, RecyclerView recyclerView) {
        this.f52779d = layerView;
        this.f52780e = button;
        this.f52781f = emptyWidget;
        this.f52782g = layerView2;
        this.f52783h = imageView;
        this.f52784i = recyclerView;
    }

    /* renamed from: a */
    public static C18863u m63822a(View view) {
        int i = C17901e.all_offers_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C17901e.f50986w;
            EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
            if (emptyWidget != null) {
                i = C17901e.f50950F;
                LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                if (layerView != null) {
                    i = C17901e.f50952H;
                    ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                    if (imageView != null) {
                        i = C17901e.f50961b0;
                        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                        if (recyclerView != null) {
                            return new C18863u((LayerView) view, button, emptyWidget, layerView, imageView, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C18863u m63823d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.section_home_categories, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63822a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f52779d;
    }
}

package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import sn0.C17901e;
import sn0.C17902f;

/* renamed from: xn0.w */
public final class C18865w implements C6201a {

    /* renamed from: d */
    private final LinearLayout f52787d;

    /* renamed from: e */
    public final Button f52788e;

    /* renamed from: f */
    public final EmptyWidget f52789f;

    /* renamed from: g */
    public final LayerView f52790g;

    /* renamed from: h */
    public final ImageView f52791h;

    /* renamed from: i */
    public final RecyclerView f52792i;

    private C18865w(LinearLayout linearLayout, Button button, EmptyWidget emptyWidget, LayerView layerView, ImageView imageView, RecyclerView recyclerView) {
        this.f52787d = linearLayout;
        this.f52788e = button;
        this.f52789f = emptyWidget;
        this.f52790g = layerView;
        this.f52791h = imageView;
        this.f52792i = recyclerView;
    }

    /* renamed from: a */
    public static C18865w m63830a(View view) {
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
                            return new C18865w((LinearLayout) view, button, emptyWidget, layerView, imageView, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C18865w m63831d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.section_home_offers, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63830a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f52787d;
    }
}

package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: th0.s */
public final class C28424s implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72199d;

    /* renamed from: e */
    public final LinearLayout f72200e;

    /* renamed from: f */
    public final AppCompatImageView f72201f;

    /* renamed from: g */
    public final EmptyWidget f72202g;

    /* renamed from: h */
    public final Button f72203h;

    /* renamed from: i */
    public final LayerView f72204i;

    /* renamed from: j */
    public final RecyclerView f72205j;

    private C28424s(LinearLayout linearLayout, LinearLayout linearLayout2, AppCompatImageView appCompatImageView, EmptyWidget emptyWidget, Button button, LayerView layerView, RecyclerView recyclerView) {
        this.f72199d = linearLayout;
        this.f72200e = linearLayout2;
        this.f72201f = appCompatImageView;
        this.f72202g = emptyWidget;
        this.f72203h = button;
        this.f72204i = layerView;
        this.f72205j = recyclerView;
    }

    /* renamed from: a */
    public static C28424s m87217a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C27010e.categories_section_logo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C27010e.categories_section_widget;
            EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
            if (emptyWidget != null) {
                i = C27010e.find_all_button;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    i = C27010e.f67814Z0;
                    LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                    if (layerView != null) {
                        i = C27010e.inner_categories_recycler_view;
                        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                        if (recyclerView != null) {
                            return new C28424s(linearLayout, linearLayout, appCompatImageView, emptyWidget, button, layerView, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28424s m87218d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_categories_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87217a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72199d;
    }
}

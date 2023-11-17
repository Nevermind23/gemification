package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.categorycard.CategoryCardView;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import sn0.C17901e;
import sn0.C17902f;

/* renamed from: xn0.y */
public final class C18867y implements C6201a {

    /* renamed from: d */
    private final LayerView f52796d;

    /* renamed from: e */
    public final TextView f52797e;

    /* renamed from: f */
    public final RecyclerView f52798f;

    /* renamed from: g */
    public final CategoryCardView f52799g;

    /* renamed from: h */
    public final EmptyWidget f52800h;

    private C18867y(LayerView layerView, TextView textView, RecyclerView recyclerView, CategoryCardView categoryCardView, EmptyWidget emptyWidget) {
        this.f52796d = layerView;
        this.f52797e = textView;
        this.f52798f = recyclerView;
        this.f52799g = categoryCardView;
        this.f52800h = emptyWidget;
    }

    /* renamed from: a */
    public static C18867y m63838a(View view) {
        int i = C17901e.f50982r;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C17901e.f50961b0;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C17901e.single_card;
                CategoryCardView categoryCardView = (CategoryCardView) C6202b.m24689a(view, i);
                if (categoryCardView != null) {
                    i = C17901e.f50978m0;
                    EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                    if (emptyWidget != null) {
                        return new C18867y((LayerView) view, textView, recyclerView, categoryCardView, emptyWidget);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C18867y m63839d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.section_progress_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63838a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f52796d;
    }
}

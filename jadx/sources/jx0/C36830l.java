package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: jx0.l */
public final class C36830l implements C6201a {

    /* renamed from: d */
    private final LayerView f88879d;

    /* renamed from: e */
    public final RecyclerView f88880e;

    /* renamed from: f */
    public final ActionSheetTitle f88881f;

    private C36830l(LayerView layerView, RecyclerView recyclerView, ActionSheetTitle actionSheetTitle) {
        this.f88879d = layerView;
        this.f88880e = recyclerView;
        this.f88881f = actionSheetTitle;
    }

    /* renamed from: a */
    public static C36830l m109132a(View view) {
        int i = C32024d.f78841b0;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C32024d.f78854q0;
            ActionSheetTitle actionSheetTitle = (ActionSheetTitle) C6202b.m24689a(view, i);
            if (actionSheetTitle != null) {
                return new C36830l((LayerView) view, recyclerView, actionSheetTitle);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36830l m109133d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_categories_other, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109132a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88879d;
    }
}

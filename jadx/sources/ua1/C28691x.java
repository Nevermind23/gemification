package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: ua1.x */
public final class C28691x implements C6201a {

    /* renamed from: d */
    private final LayerView f73032d;

    /* renamed from: e */
    public final ActionSheetTitle f73033e;

    /* renamed from: f */
    public final LayerView f73034f;

    /* renamed from: g */
    public final RecyclerView f73035g;

    /* renamed from: h */
    public final AppCompatTextView f73036h;

    private C28691x(LayerView layerView, ActionSheetTitle actionSheetTitle, LayerView layerView2, RecyclerView recyclerView, AppCompatTextView appCompatTextView) {
        this.f73032d = layerView;
        this.f73033e = actionSheetTitle;
        this.f73034f = layerView2;
        this.f73035g = recyclerView;
        this.f73036h = appCompatTextView;
    }

    /* renamed from: a */
    public static C28691x m87882a(View view) {
        int i = C10216u.f28317b;
        ActionSheetTitle actionSheetTitle = (ActionSheetTitle) C6202b.m24689a(view, i);
        if (actionSheetTitle != null) {
            i = C10216u.more_layer_view;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C10216u.f28332j2;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    i = C10216u.subtitle_text_view;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView != null) {
                        return new C28691x((LayerView) view, actionSheetTitle, layerView, recyclerView, appCompatTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28691x m87883d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_my_devices, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87882a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f73032d;
    }
}

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
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: jx0.j */
public final class C36827j implements C6201a {

    /* renamed from: d */
    private final LayerView f88870d;

    /* renamed from: e */
    public final Button f88871e;

    /* renamed from: f */
    public final RecyclerView f88872f;

    /* renamed from: g */
    public final ActionSheetTitle f88873g;

    private C36827j(LayerView layerView, Button button, RecyclerView recyclerView, ActionSheetTitle actionSheetTitle) {
        this.f88870d = layerView;
        this.f88871e = button;
        this.f88872f = recyclerView;
        this.f88873g = actionSheetTitle;
    }

    /* renamed from: a */
    public static C36827j m109120a(View view) {
        int i = C32024d.f78846f;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C32024d.f78841b0;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C32024d.f78854q0;
                ActionSheetTitle actionSheetTitle = (ActionSheetTitle) C6202b.m24689a(view, i);
                if (actionSheetTitle != null) {
                    return new C36827j((LayerView) view, button, recyclerView, actionSheetTitle);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36827j m109121d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_categories_horizontal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109120a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88870d;
    }
}

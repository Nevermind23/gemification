package o51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import n51.C37356b;
import n51.C37357c;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: o51.b */
public final class C37645b implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f90416d;

    /* renamed from: e */
    public final Button f90417e;

    /* renamed from: f */
    public final Button f90418f;

    /* renamed from: g */
    public final LayerView f90419g;

    /* renamed from: h */
    public final RecyclerView f90420h;

    private C37645b(ConstraintLayout constraintLayout, Button button, Button button2, LayerView layerView, RecyclerView recyclerView) {
        this.f90416d = constraintLayout;
        this.f90417e = button;
        this.f90418f = button2;
        this.f90419g = layerView;
        this.f90420h = recyclerView;
    }

    /* renamed from: a */
    public static C37645b m110672a(View view) {
        int i = C37356b.button_clear;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C37356b.button_filter;
            Button button2 = (Button) C6202b.m24689a(view, i);
            if (button2 != null) {
                i = C37356b.f89825j;
                LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                if (layerView != null) {
                    i = C37356b.f89832p;
                    RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                    if (recyclerView != null) {
                        return new C37645b((ConstraintLayout) view, button, button2, layerView, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37645b m110673d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37357c.action_sheet_select_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m110672a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f90416d;
    }
}

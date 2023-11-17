package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p480jl.C16213d;
import p480jl.C16214e;

/* renamed from: nl.t */
public final class C17067t implements C6201a {

    /* renamed from: d */
    private final LayerView f47673d;

    /* renamed from: e */
    public final Button f47674e;

    private C17067t(LayerView layerView, Button button) {
        this.f47673d = layerView;
        this.f47674e = button;
    }

    /* renamed from: a */
    public static C17067t m59974a(View view) {
        int i = C16213d.f45748m0;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            return new C17067t((LayerView) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17067t m59975d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.item_bnpl_schedule_loading_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59974a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f47673d;
    }
}

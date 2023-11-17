package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.c0 */
public final class C12733c0 implements C6201a {

    /* renamed from: d */
    private final LayerView f37687d;

    /* renamed from: e */
    public final Input f37688e;

    private C12733c0(LayerView layerView, Input input) {
        this.f37687d = layerView;
        this.f37688e = input;
    }

    /* renamed from: a */
    public static C12733c0 m48325a(View view) {
        int i = C10114f.solo_lounge_input;
        Input input = (Input) C6202b.m24689a(view, i);
        if (input != null) {
            return new C12733c0((LayerView) view, input);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12733c0 m48326d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_application_second_stage_lounge_input, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48325a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37687d;
    }
}

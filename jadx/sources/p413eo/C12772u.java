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

/* renamed from: eo.u */
public final class C12772u implements C6201a {

    /* renamed from: d */
    private final LayerView f37869d;

    /* renamed from: e */
    public final Input f37870e;

    private C12772u(LayerView layerView, Input input) {
        this.f37869d = layerView;
        this.f37870e = input;
    }

    /* renamed from: a */
    public static C12772u m48487a(View view) {
        int i = C10114f.f27949b0;
        Input input = (Input) C6202b.m24689a(view, i);
        if (input != null) {
            return new C12772u((LayerView) view, input);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12772u m48488d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_application_first_stage_email_input, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48487a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37869d;
    }
}

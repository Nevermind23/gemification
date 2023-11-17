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

/* renamed from: eo.v */
public final class C12774v implements C6201a {

    /* renamed from: d */
    private final LayerView f37876d;

    /* renamed from: e */
    public final Input f37877e;

    private C12774v(LayerView layerView, Input input) {
        this.f37876d = layerView;
        this.f37877e = input;
    }

    /* renamed from: a */
    public static C12774v m48495a(View view) {
        int i = C10114f.job_name_input;
        Input input = (Input) C6202b.m24689a(view, i);
        if (input != null) {
            return new C12774v((LayerView) view, input);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12774v m48496d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_application_first_stage_job_name_input, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48495a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37876d;
    }
}

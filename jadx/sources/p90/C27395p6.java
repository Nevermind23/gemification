package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.p6 */
public final class C27395p6 implements C6201a {

    /* renamed from: d */
    private final LayerView f69538d;

    /* renamed from: e */
    public final LayerView f69539e;

    /* renamed from: f */
    public final Button f69540f;

    private C27395p6(LayerView layerView, LayerView layerView2, Button button) {
        this.f69538d = layerView;
        this.f69539e = layerView2;
        this.f69540f = button;
    }

    /* renamed from: a */
    public static C27395p6 m84884a(View view) {
        LayerView layerView = (LayerView) view;
        int i = C10322k.transfer_contact_see_all_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            return new C27395p6(layerView, layerView, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27395p6 m84885d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_transfer_contact_list_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84884a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f69538d;
    }
}

package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.e1 */
public final class C12740e1 implements C6201a {

    /* renamed from: d */
    private final LayerView f37707d;

    /* renamed from: e */
    public final ButtonListLargeView f37708e;

    private C12740e1(LayerView layerView, ButtonListLargeView buttonListLargeView) {
        this.f37707d = layerView;
        this.f37708e = buttonListLargeView;
    }

    /* renamed from: a */
    public static C12740e1 m48353a(View view) {
        int i = C10114f.buttonList;
        ButtonListLargeView buttonListLargeView = (ButtonListLargeView) C6202b.m24689a(view, i);
        if (buttonListLargeView != null) {
            return new C12740e1((LayerView) view, buttonListLargeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12740e1 m48354d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.list_item_user_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48353a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37707d;
    }
}

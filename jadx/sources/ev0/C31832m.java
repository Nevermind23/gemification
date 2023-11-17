package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bv0.C31204d;
import bv0.C31205e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;

/* renamed from: ev0.m */
public final class C31832m implements C6201a {

    /* renamed from: d */
    private final LayerView f78529d;

    /* renamed from: e */
    public final TwoLineTextItem f78530e;

    /* renamed from: f */
    public final Button f78531f;

    private C31832m(LayerView layerView, TwoLineTextItem twoLineTextItem, Button button) {
        this.f78529d = layerView;
        this.f78530e = twoLineTextItem;
        this.f78531f = button;
    }

    /* renamed from: a */
    public static C31832m m94117a(View view) {
        int i = C31204d.f77523a;
        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
        if (twoLineTextItem != null) {
            i = C31204d.f77522Z;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C31832m((LayerView) view, twoLineTextItem, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31832m m94118d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.f77543m, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94117a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f78529d;
    }
}

package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;

/* renamed from: iy0.p0 */
public final class C36624p0 implements C6201a {

    /* renamed from: d */
    private final LayerView f88372d;

    /* renamed from: e */
    public final TwoLineTextItem f88373e;

    /* renamed from: f */
    public final Button f88374f;

    private C36624p0(LayerView layerView, TwoLineTextItem twoLineTextItem, Button button) {
        this.f88372d = layerView;
        this.f88373e = twoLineTextItem;
        this.f88374f = button;
    }

    /* renamed from: a */
    public static C36624p0 m108631a(View view) {
        int i = C36271e.f87507a;
        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
        if (twoLineTextItem != null) {
            i = C36271e.f87526j2;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C36624p0((LayerView) view, twoLineTextItem, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36624p0 m108632d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.f87557Q, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108631a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88372d;
    }
}

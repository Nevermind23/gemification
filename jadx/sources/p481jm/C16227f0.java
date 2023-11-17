package p481jm;

import android.view.View;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p411em.C12488e;

/* renamed from: jm.f0 */
public final class C16227f0 implements C6201a {

    /* renamed from: d */
    private final LayerView f45827d;

    /* renamed from: e */
    public final Input f45828e;

    /* renamed from: f */
    public final ChipGroup f45829f;

    /* renamed from: g */
    public final EmptyWidget f45830g;

    private C16227f0(LayerView layerView, Input input, ChipGroup chipGroup, EmptyWidget emptyWidget) {
        this.f45827d = layerView;
        this.f45828e = input;
        this.f45829f = chipGroup;
        this.f45830g = emptyWidget;
    }

    /* renamed from: a */
    public static C16227f0 m57836a(View view) {
        int i = C12488e.number_selector;
        Input input = (Input) C6202b.m24689a(view, i);
        if (input != null) {
            i = C12488e.pin_chips;
            ChipGroup chipGroup = (ChipGroup) C6202b.m24689a(view, i);
            if (chipGroup != null) {
                i = C12488e.pin_number_header;
                EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                if (emptyWidget != null) {
                    return new C16227f0((LayerView) view, input, chipGroup, emptyWidget);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f45827d;
    }
}

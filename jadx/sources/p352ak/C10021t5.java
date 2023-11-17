package p352ak;

import android.view.View;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: ak.t5 */
public final class C10021t5 implements C6201a {

    /* renamed from: d */
    private final LayerView f27599d;

    private C10021t5(LayerView layerView) {
        this.f27599d = layerView;
    }

    /* renamed from: a */
    public static C10021t5 m36755a(View view) {
        if (view != null) {
            return new C10021t5((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f27599d;
    }
}

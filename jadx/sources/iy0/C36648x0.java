package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: iy0.x0 */
public final class C36648x0 implements C6201a {

    /* renamed from: d */
    private final LayerView f88454d;

    private C36648x0(LayerView layerView) {
        this.f88454d = layerView;
    }

    /* renamed from: a */
    public static C36648x0 m108727a(View view) {
        if (view != null) {
            return new C36648x0((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36648x0 m108728d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_overdraft_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108727a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88454d;
    }
}

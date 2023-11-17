package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bv0.C31205e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productheader.ClearProductHeaderView;

/* renamed from: ev0.a0 */
public final class C31816a0 implements C6201a {

    /* renamed from: d */
    private final ClearProductHeaderView f78446d;

    private C31816a0(ClearProductHeaderView clearProductHeaderView) {
        this.f78446d = clearProductHeaderView;
    }

    /* renamed from: a */
    public static C31816a0 m94048a(View view) {
        if (view != null) {
            return new C31816a0((ClearProductHeaderView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31816a0 m94049d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_product_details_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94048a(inflate);
    }

    /* renamed from: c */
    public ClearProductHeaderView mo3946b() {
        return this.f78446d;
    }
}

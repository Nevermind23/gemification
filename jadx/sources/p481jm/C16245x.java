package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p411em.C12489f;

/* renamed from: jm.x */
public final class C16245x implements C6201a {

    /* renamed from: d */
    private final TwoLineTextItem f46002d;

    private C16245x(TwoLineTextItem twoLineTextItem) {
        this.f46002d = twoLineTextItem;
    }

    /* renamed from: a */
    public static C16245x m57915a(View view) {
        if (view != null) {
            return new C16245x((TwoLineTextItem) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C16245x m57916d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.item_details_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57915a(inflate);
    }

    /* renamed from: c */
    public TwoLineTextItem mo3946b() {
        return this.f46002d;
    }
}

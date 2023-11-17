package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import lr0.C37131f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;

/* renamed from: pr0.b0 */
public final class C37945b0 implements C6201a {

    /* renamed from: d */
    private final TwoLineTextItem f91092d;

    /* renamed from: e */
    public final TwoLineTextItem f91093e;

    private C37945b0(TwoLineTextItem twoLineTextItem, TwoLineTextItem twoLineTextItem2) {
        this.f91092d = twoLineTextItem;
        this.f91093e = twoLineTextItem2;
    }

    /* renamed from: a */
    public static C37945b0 m111523a(View view) {
        if (view != null) {
            TwoLineTextItem twoLineTextItem = (TwoLineTextItem) view;
            return new C37945b0(twoLineTextItem, twoLineTextItem);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C37945b0 m111524d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_repayment_success_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111523a(inflate);
    }

    /* renamed from: c */
    public TwoLineTextItem mo3946b() {
        return this.f91092d;
    }
}

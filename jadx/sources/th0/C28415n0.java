package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;

/* renamed from: th0.n0 */
public final class C28415n0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72148d;

    /* renamed from: e */
    public final TwoLineReverseTextItem f72149e;

    /* renamed from: f */
    public final TextView f72150f;

    private C28415n0(ConstraintLayout constraintLayout, TwoLineReverseTextItem twoLineReverseTextItem, TextView textView) {
        this.f72148d = constraintLayout;
        this.f72149e = twoLineReverseTextItem;
        this.f72150f = textView;
    }

    /* renamed from: a */
    public static C28415n0 m87181a(View view) {
        int i = C27010e.gift_card_two_line_text_item;
        TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
        if (twoLineReverseTextItem != null) {
            i = C27010e.tvGiftCardAmount;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                return new C28415n0((ConstraintLayout) view, twoLineReverseTextItem, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28415n0 m87182d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_card_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87181a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72148d;
    }
}

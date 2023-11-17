package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: th0.o0 */
public final class C28417o0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72158d;

    /* renamed from: e */
    public final TextView f72159e;

    private C28417o0(LinearLayout linearLayout, TextView textView) {
        this.f72158d = linearLayout;
        this.f72159e = textView;
    }

    /* renamed from: a */
    public static C28417o0 m87189a(View view) {
        int i = C27010e.tvGiftCardDate;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            return new C28417o0((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28417o0 m87190d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_card_transaction_date, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87189a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72158d;
    }
}

package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.y4 */
public final class C27474y4 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70264d;

    /* renamed from: e */
    public final TextView f70265e;

    /* renamed from: f */
    public final ImageButton f70266f;

    private C27474y4(LinearLayout linearLayout, TextView textView, ImageButton imageButton) {
        this.f70264d = linearLayout;
        this.f70265e = textView;
        this.f70266f = imageButton;
    }

    /* renamed from: a */
    public static C27474y4 m85204a(View view) {
        int i = C10322k.bill_split_split_evenly_text;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C10322k.resetMoneyAmountsBtn;
            ImageButton imageButton = (ImageButton) C6202b.m24689a(view, i);
            if (imageButton != null) {
                return new C27474y4((LinearLayout) view, textView, imageButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27474y4 m85205d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_bill_split_reset_money_amounts, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85204a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f70264d;
    }
}

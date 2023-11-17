package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.b5 */
public final class C27259b5 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68389d;

    /* renamed from: e */
    public final CardView f68390e;

    /* renamed from: f */
    public final AppCompatTextView f68391f;

    /* renamed from: g */
    public final TextView f68392g;

    private C27259b5(LinearLayout linearLayout, CardView cardView, AppCompatTextView appCompatTextView, TextView textView) {
        this.f68389d = linearLayout;
        this.f68390e = cardView;
        this.f68391f = appCompatTextView;
        this.f68392g = textView;
    }

    /* renamed from: a */
    public static C27259b5 m84335a(View view) {
        int i = C10322k.addressee_count_layout;
        CardView cardView = (CardView) C6202b.m24689a(view, i);
        if (cardView != null) {
            i = C10322k.contactsAmountText;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C10322k.newContactButton;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    return new C27259b5((LinearLayout) view, cardView, appCompatTextView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27259b5 m84336d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_bill_split_summary_contacts_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84335a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68389d;
    }
}

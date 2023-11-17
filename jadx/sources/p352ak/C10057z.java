package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.z */
public final class C10057z implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27787d;

    /* renamed from: e */
    public final Barrier f27788e;

    /* renamed from: f */
    public final TextView f27789f;

    /* renamed from: g */
    public final TextView f27790g;

    /* renamed from: h */
    public final TextView f27791h;

    /* renamed from: i */
    public final LinearLayout f27792i;

    private C10057z(ConstraintLayout constraintLayout, Barrier barrier, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout) {
        this.f27787d = constraintLayout;
        this.f27788e = barrier;
        this.f27789f = textView;
        this.f27790g = textView2;
        this.f27791h = textView3;
        this.f27792i = linearLayout;
    }

    /* renamed from: a */
    public static C10057z m36889a(View view) {
        int i = C17782g.f49760g0;
        Barrier barrier = (Barrier) C6202b.m24689a(view, i);
        if (barrier != null) {
            i = C17782g.transaction_amount;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C17782g.transaction_description;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    i = C17782g.transaction_title;
                    TextView textView3 = (TextView) C6202b.m24689a(view, i);
                    if (textView3 != null) {
                        i = C17782g.transactions_container;
                        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                        if (linearLayout != null) {
                            return new C10057z((ConstraintLayout) view, barrier, textView, textView2, textView3, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10057z m36890d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.layout_package_card_transaction_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36889a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27787d;
    }
}

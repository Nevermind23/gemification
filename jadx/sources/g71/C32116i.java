package g71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c71.C31284d;
import c71.C31285e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;

/* renamed from: g71.i */
public final class C32116i implements C6201a {

    /* renamed from: d */
    private final LinearLayout f79008d;

    /* renamed from: e */
    public final TextView f79009e;

    /* renamed from: f */
    public final RecyclerView f79010f;

    /* renamed from: g */
    public final FixedButtonView f79011g;

    /* renamed from: h */
    public final CreditCardView f79012h;

    private C32116i(LinearLayout linearLayout, TextView textView, RecyclerView recyclerView, FixedButtonView fixedButtonView, CreditCardView creditCardView) {
        this.f79008d = linearLayout;
        this.f79009e = textView;
        this.f79010f = recyclerView;
        this.f79011g = fixedButtonView;
        this.f79012h = creditCardView;
    }

    /* renamed from: a */
    public static C32116i m94597a(View view) {
        int i = C31284d.f77707s;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C31284d.pass_devices_recycler;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C31284d.f77703Q;
                FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view, i);
                if (fixedButtonView != null) {
                    i = C31284d.substitute_card;
                    CreditCardView creditCardView = (CreditCardView) C6202b.m24689a(view, i);
                    if (creditCardView != null) {
                        return new C32116i((LinearLayout) view, textView, recyclerView, fixedButtonView, creditCardView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C32116i m94598d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31285e.fragment_substitute_pass_devices, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94597a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f79008d;
    }
}

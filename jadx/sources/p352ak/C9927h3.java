package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.h3 */
public final class C9927h3 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27056d;

    /* renamed from: e */
    public final TextView f27057e;

    /* renamed from: f */
    public final Button f27058f;

    /* renamed from: g */
    public final CreditCardSmallPickerView f27059g;

    /* renamed from: h */
    public final Button f27060h;

    private C9927h3(LinearLayout linearLayout, TextView textView, Button button, CreditCardSmallPickerView creditCardSmallPickerView, Button button2) {
        this.f27056d = linearLayout;
        this.f27057e = textView;
        this.f27058f = button;
        this.f27059g = creditCardSmallPickerView;
        this.f27060h = button2;
    }

    /* renamed from: a */
    public static C9927h3 m36413a(View view) {
        int i = C17782g.f49716O4;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C17782g.f49700K5;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C17782g.picker;
                CreditCardSmallPickerView creditCardSmallPickerView = (CreditCardSmallPickerView) C6202b.m24689a(view, i);
                if (creditCardSmallPickerView != null) {
                    i = C17782g.f49813y7;
                    Button button2 = (Button) C6202b.m24689a(view, i);
                    if (button2 != null) {
                        return new C9927h3((LinearLayout) view, textView, button, creditCardSmallPickerView, button2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9927h3 m36414d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_fixed_button_card_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36413a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27056d;
    }
}

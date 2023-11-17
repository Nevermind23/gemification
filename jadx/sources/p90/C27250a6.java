package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.a6 */
public final class C27250a6 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68323d;

    /* renamed from: e */
    public final TextInputLayout f68324e;

    /* renamed from: f */
    public final TextInputEditText f68325f;

    private C27250a6(LinearLayout linearLayout, TextInputLayout textInputLayout, TextInputEditText textInputEditText) {
        this.f68323d = linearLayout;
        this.f68324e = textInputLayout;
        this.f68325f = textInputEditText;
    }

    /* renamed from: a */
    public static C27250a6 m84299a(View view) {
        int i = C10322k.requested_amount_header_tv;
        TextInputLayout textInputLayout = (TextInputLayout) C6202b.m24689a(view, i);
        if (textInputLayout != null) {
            i = C10322k.requested_amount_tv;
            TextInputEditText textInputEditText = (TextInputEditText) C6202b.m24689a(view, i);
            if (textInputEditText != null) {
                return new C27250a6((LinearLayout) view, textInputLayout, textInputEditText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27250a6 m84300d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_money_request_summary_primary_wizard_field, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84299a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68323d;
    }
}

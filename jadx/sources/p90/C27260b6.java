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

/* renamed from: p90.b6 */
public final class C27260b6 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68393d;

    /* renamed from: e */
    public final TextInputEditText f68394e;

    /* renamed from: f */
    public final TextInputLayout f68395f;

    /* renamed from: g */
    public final TextInputLayout f68396g;

    /* renamed from: h */
    public final TextInputEditText f68397h;

    private C27260b6(LinearLayout linearLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputEditText textInputEditText2) {
        this.f68393d = linearLayout;
        this.f68394e = textInputEditText;
        this.f68395f = textInputLayout;
        this.f68396g = textInputLayout2;
        this.f68397h = textInputEditText2;
    }

    /* renamed from: a */
    public static C27260b6 m84339a(View view) {
        int i = C10322k.comment_tv;
        TextInputEditText textInputEditText = (TextInputEditText) C6202b.m24689a(view, i);
        if (textInputEditText != null) {
            i = C10322k.money_request_account_header_tv;
            TextInputLayout textInputLayout = (TextInputLayout) C6202b.m24689a(view, i);
            if (textInputLayout != null) {
                i = C10322k.money_request_comment_header_tv;
                TextInputLayout textInputLayout2 = (TextInputLayout) C6202b.m24689a(view, i);
                if (textInputLayout2 != null) {
                    i = C10322k.receiver_account_tv;
                    TextInputEditText textInputEditText2 = (TextInputEditText) C6202b.m24689a(view, i);
                    if (textInputEditText2 != null) {
                        return new C27260b6((LinearLayout) view, textInputEditText, textInputLayout, textInputLayout2, textInputEditText2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27260b6 m84340d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_money_request_summary_secondary_wizard_fields, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84339a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68393d;
    }
}

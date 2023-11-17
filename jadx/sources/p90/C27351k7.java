package p90;

import android.view.View;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p366bk.C10322k;

/* renamed from: p90.k7 */
public final class C27351k7 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69175d;

    /* renamed from: e */
    public final BogInputLayout f69176e;

    /* renamed from: f */
    public final BogInputLayout f69177f;

    private C27351k7(LinearLayout linearLayout, BogInputLayout bogInputLayout, BogInputLayout bogInputLayout2) {
        this.f69175d = linearLayout;
        this.f69176e = bogInputLayout;
        this.f69177f = bogInputLayout2;
    }

    /* renamed from: a */
    public static C27351k7 m84712a(View view) {
        int i = C10322k.wizard_input_layout;
        BogInputLayout bogInputLayout = (BogInputLayout) C6202b.m24689a(view, i);
        if (bogInputLayout != null) {
            i = C10322k.wizard_phone_index;
            BogInputLayout bogInputLayout2 = (BogInputLayout) C6202b.m24689a(view, i);
            if (bogInputLayout2 != null) {
                return new C27351k7((LinearLayout) view, bogInputLayout, bogInputLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69175d;
    }
}

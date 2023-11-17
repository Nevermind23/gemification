package ha0;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.flexbox.FlexboxLayout;
import da0.C19951e;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: ha0.r */
public final class C24941r implements C6201a {

    /* renamed from: d */
    private final LinearLayoutCompat f64236d;

    /* renamed from: e */
    public final TextView f64237e;

    /* renamed from: f */
    public final FlexboxLayout f64238f;

    private C24941r(LinearLayoutCompat linearLayoutCompat, TextView textView, FlexboxLayout flexboxLayout) {
        this.f64236d = linearLayoutCompat;
        this.f64237e = textView;
        this.f64238f = flexboxLayout;
    }

    /* renamed from: a */
    public static C24941r m79747a(View view) {
        int i = C19951e.withdrawal_type_header_text;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C19951e.withdrawal_types_container;
            FlexboxLayout flexboxLayout = (FlexboxLayout) C6202b.m24689a(view, i);
            if (flexboxLayout != null) {
                return new C24941r((LinearLayoutCompat) view, textView, flexboxLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayoutCompat mo3946b() {
        return this.f64236d;
    }
}

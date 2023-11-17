package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import da0.C19951e;
import da0.C19952f;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: ha0.o */
public final class C24938o implements C6201a {

    /* renamed from: d */
    private final LinearLayoutCompat f64229d;

    /* renamed from: e */
    public final AppCompatTextView f64230e;

    /* renamed from: f */
    public final AppCompatTextView f64231f;

    private C24938o(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f64229d = linearLayoutCompat;
        this.f64230e = appCompatTextView;
        this.f64231f = appCompatTextView2;
    }

    /* renamed from: a */
    public static C24938o m79736a(View view) {
        int i = C19951e.f54506E0;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C19951e.f54512H0;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                return new C24938o((LinearLayoutCompat) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24938o m79737d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.item_deposit_application_result_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79736a(inflate);
    }

    /* renamed from: c */
    public LinearLayoutCompat mo3946b() {
        return this.f64229d;
    }
}

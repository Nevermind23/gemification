package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import rs0.C38336c;
import rs0.C38337d;

/* renamed from: vs0.q */
public final class C39458q implements C6201a {

    /* renamed from: d */
    private final LinearLayout f93836d;

    /* renamed from: e */
    public final AppCompatTextView f93837e;

    /* renamed from: f */
    public final AppCompatTextView f93838f;

    private C39458q(LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f93836d = linearLayout;
        this.f93837e = appCompatTextView;
        this.f93838f = appCompatTextView2;
    }

    /* renamed from: a */
    public static C39458q m114687a(View view) {
        int i = C38336c.accumulated_amount_value;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C38336c.available_amount_label;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                return new C39458q((LinearLayout) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39458q m114688d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.item_piggy_bank_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114687a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f93836d;
    }
}

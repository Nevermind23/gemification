package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p451hk.C15526d;
import p451hk.C15527e;

/* renamed from: kk.c */
public final class C16449c implements C6201a {

    /* renamed from: d */
    private final LinearLayout f46463d;

    /* renamed from: e */
    public final TextView f46464e;

    /* renamed from: f */
    public final TextView f46465f;

    private C16449c(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f46463d = linearLayout;
        this.f46464e = textView;
        this.f46465f = textView2;
    }

    /* renamed from: a */
    public static C16449c m58599a(View view) {
        int i = C15526d.female;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C15526d.male;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                return new C16449c((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16449c m58600d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.action_sheet_select_gender, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58599a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f46463d;
    }
}

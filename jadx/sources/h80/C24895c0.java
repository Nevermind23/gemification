package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import u70.C28606b;
import u70.C28607c;

/* renamed from: h80.c0 */
public final class C24895c0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f63905d;

    /* renamed from: e */
    public final View f63906e;

    /* renamed from: f */
    public final LinearLayout f63907f;

    /* renamed from: g */
    public final TextView f63908g;

    /* renamed from: h */
    public final TextView f63909h;

    /* renamed from: i */
    public final ConstraintLayout f63910i;

    /* renamed from: j */
    public final TextView f63911j;

    private C24895c0(ConstraintLayout constraintLayout, View view, LinearLayout linearLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, TextView textView3) {
        this.f63905d = constraintLayout;
        this.f63906e = view;
        this.f63907f = linearLayout;
        this.f63908g = textView;
        this.f63909h = textView2;
        this.f63910i = constraintLayout2;
        this.f63911j = textView3;
    }

    /* renamed from: a */
    public static C24895c0 m79561a(View view) {
        int i = C28606b.f72568B;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C28606b.income_details_container;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C28606b.income_source;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C28606b.job_title;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = C28606b.salary_amount;
                        TextView textView3 = (TextView) C6202b.m24689a(view, i);
                        if (textView3 != null) {
                            return new C24895c0(constraintLayout, a, linearLayout, textView, textView2, constraintLayout, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24895c0 m79562d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.salary_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79561a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f63905d;
    }
}

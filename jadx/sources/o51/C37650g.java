package o51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import n51.C37356b;
import n51.C37357c;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: o51.g */
public final class C37650g implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f90488d;

    /* renamed from: e */
    public final TextView f90489e;

    /* renamed from: f */
    public final TextView f90490f;

    /* renamed from: g */
    public final TextView f90491g;

    private C37650g(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f90488d = constraintLayout;
        this.f90489e = textView;
        this.f90490f = textView2;
        this.f90491g = textView3;
    }

    /* renamed from: a */
    public static C37650g m110693a(View view) {
        int i = C37356b.f89822d;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C37356b.f89815G;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                i = C37356b.f89813C0;
                TextView textView3 = (TextView) C6202b.m24689a(view, i);
                if (textView3 != null) {
                    return new C37650g((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37650g m110694d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37357c.item_account_statement, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m110693a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f90488d;
    }
}

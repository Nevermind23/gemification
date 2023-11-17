package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import np0.C37439e;
import np0.C37440f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;

/* renamed from: sp0.z */
public final class C38507z implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f92305d;

    /* renamed from: e */
    public final TextView f92306e;

    /* renamed from: f */
    public final CheckboxView f92307f;

    /* renamed from: g */
    public final TextView f92308g;

    /* renamed from: h */
    public final TextView f92309h;

    private C38507z(ConstraintLayout constraintLayout, TextView textView, CheckboxView checkboxView, TextView textView2, TextView textView3) {
        this.f92305d = constraintLayout;
        this.f92306e = textView;
        this.f92307f = checkboxView;
        this.f92308g = textView2;
        this.f92309h = textView3;
    }

    /* renamed from: a */
    public static C38507z m113042a(View view) {
        int i = C37439e.f89999d;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C37439e.f90009o;
            CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
            if (checkboxView != null) {
                i = C37439e.creditor;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    i = C37439e.f89979C0;
                    TextView textView3 = (TextView) C6202b.m24689a(view, i);
                    if (textView3 != null) {
                        return new C38507z((ConstraintLayout) view, textView, checkboxView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38507z m113043d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.item_refinance_info_checkbox, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m113042a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f92305d;
    }
}

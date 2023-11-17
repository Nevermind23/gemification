package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import np0.C37439e;
import np0.C37440f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.input.Input;

/* renamed from: sp0.j */
public final class C38491j implements C6201a {

    /* renamed from: d */
    private final LinearLayout f92218d;

    /* renamed from: e */
    public final Input f92219e;

    /* renamed from: f */
    public final EmptyWidget f92220f;

    /* renamed from: g */
    public final Input f92221g;

    /* renamed from: h */
    public final Input f92222h;

    private C38491j(LinearLayout linearLayout, Input input, EmptyWidget emptyWidget, Input input2, Input input3) {
        this.f92218d = linearLayout;
        this.f92219e = input;
        this.f92220f = emptyWidget;
        this.f92221g = input2;
        this.f92222h = input3;
    }

    /* renamed from: a */
    public static C38491j m112978a(View view) {
        int i = C37439e.f90001e;
        Input input = (Input) C6202b.m24689a(view, i);
        if (input != null) {
            i = C37439e.f90016y;
            EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
            if (emptyWidget != null) {
                i = C37439e.month_term_input;
                Input input2 = (Input) C6202b.m24689a(view, i);
                if (input2 != null) {
                    i = C37439e.pay_day_input;
                    Input input3 = (Input) C6202b.m24689a(view, i);
                    if (input3 != null) {
                        return new C38491j((LinearLayout) view, input, emptyWidget, input2, input3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38491j m112979d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.form_segment_loan_details_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112978a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f92218d;
    }
}

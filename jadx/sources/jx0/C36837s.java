package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.input.Input;

/* renamed from: jx0.s */
public final class C36837s implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88900d;

    /* renamed from: e */
    public final Input f88901e;

    private C36837s(LinearLayout linearLayout, Input input) {
        this.f88900d = linearLayout;
        this.f88901e = input;
    }

    /* renamed from: a */
    public static C36837s m109160a(View view) {
        int i = C32024d.f78834D;
        Input input = (Input) C6202b.m24689a(view, i);
        if (input != null) {
            return new C36837s((LinearLayout) view, input);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36837s m109161d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_payment_form_element_amount, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109160a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88900d;
    }
}

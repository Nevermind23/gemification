package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: jx0.d0 */
public final class C36816d0 implements C6201a {

    /* renamed from: d */
    private final StateView f88819d;

    /* renamed from: e */
    public final StateView f88820e;

    /* renamed from: f */
    public final C36820f0 f88821f;

    /* renamed from: g */
    public final RecyclerView f88822g;

    private C36816d0(StateView stateView, StateView stateView2, C36820f0 f0Var, RecyclerView recyclerView) {
        this.f88819d = stateView;
        this.f88820e = stateView2;
        this.f88821f = f0Var;
        this.f88822g = recyclerView;
    }

    /* renamed from: a */
    public static C36816d0 m109078a(View view) {
        StateView stateView = (StateView) view;
        int i = C32024d.f78847k0;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            C36820f0 a2 = C36820f0.m109094a(a);
            int i2 = C32024d.templates_recycler;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i2);
            if (recyclerView != null) {
                return new C36816d0(stateView, stateView, a2, recyclerView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36816d0 m109079d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_payment_form_element_template_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109078a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f88819d;
    }
}

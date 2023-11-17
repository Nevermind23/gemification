package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ie0.C25188h;
import p086g1.C6201a;

/* renamed from: ue0.c1 */
public final class C28717c1 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73158d;

    private C28717c1(ConstraintLayout constraintLayout) {
        this.f73158d = constraintLayout;
    }

    /* renamed from: a */
    public static C28717c1 m87986a(View view) {
        if (view != null) {
            return new C28717c1((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28717c1 m87987d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.layout_search_symbol_no_data, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87986a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73158d;
    }
}

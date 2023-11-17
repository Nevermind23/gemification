package g71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c71.C31284d;
import c71.C31285e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;

/* renamed from: g71.h */
public final class C32115h implements C6201a {

    /* renamed from: d */
    private final LinearLayout f79004d;

    /* renamed from: e */
    public final RecyclerView f79005e;

    /* renamed from: f */
    public final TextView f79006f;

    /* renamed from: g */
    public final FixedButtonView f79007g;

    private C32115h(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, FixedButtonView fixedButtonView) {
        this.f79004d = linearLayout;
        this.f79005e = recyclerView;
        this.f79006f = textView;
        this.f79007g = fixedButtonView;
    }

    /* renamed from: a */
    public static C32115h m94593a(View view) {
        int i = C31284d.cardsRecyclerView;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C31284d.f77707s;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C31284d.f77701I;
                FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view, i);
                if (fixedButtonView != null) {
                    return new C32115h((LinearLayout) view, recyclerView, textView, fixedButtonView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C32115h m94594d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31285e.fragment_substitute_cards, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94593a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f79004d;
    }
}

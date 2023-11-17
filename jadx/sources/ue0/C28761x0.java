package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;

/* renamed from: ue0.x0 */
public final class C28761x0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f73532d;

    /* renamed from: e */
    public final CheckboxView f73533e;

    /* renamed from: f */
    public final TwoLineReverseTextItem f73534f;

    private C28761x0(LinearLayout linearLayout, CheckboxView checkboxView, TwoLineReverseTextItem twoLineReverseTextItem) {
        this.f73532d = linearLayout;
        this.f73533e = checkboxView;
        this.f73534f = twoLineReverseTextItem;
    }

    /* renamed from: a */
    public static C28761x0 m88177a(View view) {
        int i = C25187g.checkBx;
        CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
        if (checkboxView != null) {
            i = C25187g.watchListItem;
            TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
            if (twoLineReverseTextItem != null) {
                return new C28761x0((LinearLayout) view, checkboxView, twoLineReverseTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28761x0 m88178d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.item_watchlist, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88177a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f73532d;
    }
}

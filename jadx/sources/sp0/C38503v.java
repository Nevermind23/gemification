package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import np0.C37439e;
import np0.C37440f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;

/* renamed from: sp0.v */
public final class C38503v implements C6201a {

    /* renamed from: d */
    private final LinearLayout f92292d;

    /* renamed from: e */
    public final View f92293e;

    /* renamed from: f */
    public final ListItem f92294f;

    /* renamed from: g */
    public final SingleLineTextItem f92295g;

    private C38503v(LinearLayout linearLayout, View view, ListItem listItem, SingleLineTextItem singleLineTextItem) {
        this.f92292d = linearLayout;
        this.f92293e = view;
        this.f92294f = listItem;
        this.f92295g = singleLineTextItem;
    }

    /* renamed from: a */
    public static C38503v m113026a(View view) {
        int i = C37439e.f90011p;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C37439e.f90004h0;
            ListItem listItem = (ListItem) C6202b.m24689a(view, i);
            if (listItem != null) {
                i = C37439e.term_item;
                SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
                if (singleLineTextItem != null) {
                    return new C38503v((LinearLayout) view, a, listItem, singleLineTextItem);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38503v m113027d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.item_loan_term, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m113026a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f92292d;
    }
}

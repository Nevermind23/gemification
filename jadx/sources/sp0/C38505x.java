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

/* renamed from: sp0.x */
public final class C38505x implements C6201a {

    /* renamed from: d */
    private final LinearLayout f92299d;

    /* renamed from: e */
    public final View f92300e;

    /* renamed from: f */
    public final ListItem f92301f;

    /* renamed from: g */
    public final SingleLineTextItem f92302g;

    private C38505x(LinearLayout linearLayout, View view, ListItem listItem, SingleLineTextItem singleLineTextItem) {
        this.f92299d = linearLayout;
        this.f92300e = view;
        this.f92301f = listItem;
        this.f92302g = singleLineTextItem;
    }

    /* renamed from: a */
    public static C38505x m113034a(View view) {
        int i = C37439e.f90011p;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C37439e.f90004h0;
            ListItem listItem = (ListItem) C6202b.m24689a(view, i);
            if (listItem != null) {
                i = C37439e.term_item;
                SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
                if (singleLineTextItem != null) {
                    return new C38505x((LinearLayout) view, a, listItem, singleLineTextItem);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38505x m113035d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.item_pay_day, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m113034a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f92299d;
    }
}

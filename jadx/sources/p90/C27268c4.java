package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.c4 */
public final class C27268c4 implements C6201a {

    /* renamed from: d */
    private final NestedScrollView f68469d;

    /* renamed from: e */
    public final TwoLineTextItem f68470e;

    /* renamed from: f */
    public final ListItem f68471f;

    /* renamed from: g */
    public final TwoLineTextItem f68472g;

    /* renamed from: h */
    public final TwoLineTextItem f68473h;

    /* renamed from: i */
    public final TwoLineTextItem f68474i;

    /* renamed from: j */
    public final TwoLineTextItem f68475j;

    /* renamed from: k */
    public final TwoLineTextItem f68476k;

    /* renamed from: l */
    public final TwoLineTextItem f68477l;

    private C27268c4(NestedScrollView nestedScrollView, TwoLineTextItem twoLineTextItem, ListItem listItem, TwoLineTextItem twoLineTextItem2, TwoLineTextItem twoLineTextItem3, TwoLineTextItem twoLineTextItem4, TwoLineTextItem twoLineTextItem5, TwoLineTextItem twoLineTextItem6, TwoLineTextItem twoLineTextItem7) {
        this.f68469d = nestedScrollView;
        this.f68470e = twoLineTextItem;
        this.f68471f = listItem;
        this.f68472g = twoLineTextItem2;
        this.f68473h = twoLineTextItem3;
        this.f68474i = twoLineTextItem4;
        this.f68475j = twoLineTextItem5;
        this.f68476k = twoLineTextItem6;
        this.f68477l = twoLineTextItem7;
    }

    /* renamed from: a */
    public static C27268c4 m84372a(View view) {
        int i = C10322k.due_date;
        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
        if (twoLineTextItem != null) {
            i = C10322k.due_date_layout;
            ListItem listItem = (ListItem) C6202b.m24689a(view, i);
            if (listItem != null) {
                i = C10322k.gifts_amount;
                TwoLineTextItem twoLineTextItem2 = (TwoLineTextItem) C6202b.m24689a(view, i);
                if (twoLineTextItem2 != null) {
                    i = C10322k.plus_status;
                    TwoLineTextItem twoLineTextItem3 = (TwoLineTextItem) C6202b.m24689a(view, i);
                    if (twoLineTextItem3 != null) {
                        i = C10322k.points_spent;
                        TwoLineTextItem twoLineTextItem4 = (TwoLineTextItem) C6202b.m24689a(view, i);
                        if (twoLineTextItem4 != null) {
                            i = C10322k.points_to_spent;
                            TwoLineTextItem twoLineTextItem5 = (TwoLineTextItem) C6202b.m24689a(view, i);
                            if (twoLineTextItem5 != null) {
                                i = C10322k.reg_date;
                                TwoLineTextItem twoLineTextItem6 = (TwoLineTextItem) C6202b.m24689a(view, i);
                                if (twoLineTextItem6 != null) {
                                    i = C10322k.total_points;
                                    TwoLineTextItem twoLineTextItem7 = (TwoLineTextItem) C6202b.m24689a(view, i);
                                    if (twoLineTextItem7 != null) {
                                        return new C27268c4((NestedScrollView) view, twoLineTextItem, listItem, twoLineTextItem2, twoLineTextItem3, twoLineTextItem4, twoLineTextItem5, twoLineTextItem6, twoLineTextItem7);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27268c4 m84373d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_plus_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84372a(inflate);
    }

    /* renamed from: c */
    public NestedScrollView mo3946b() {
        return this.f68469d;
    }
}

package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.m0 */
public final class C12757m0 implements C6201a {

    /* renamed from: d */
    private final ListItem f37791d;

    /* renamed from: e */
    public final View f37792e;

    /* renamed from: f */
    public final TwoLineTextItem f37793f;

    private C12757m0(ListItem listItem, View view, TwoLineTextItem twoLineTextItem) {
        this.f37791d = listItem;
        this.f37792e = view;
        this.f37793f = twoLineTextItem;
    }

    /* renamed from: a */
    public static C12757m0 m48422a(View view) {
        int i = C10114f.f27944Y;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C10114f.f27973s1;
            TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
            if (twoLineTextItem != null) {
                return new C12757m0((ListItem) view, a, twoLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12757m0 m48423d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_email, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48422a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f37791d;
    }
}

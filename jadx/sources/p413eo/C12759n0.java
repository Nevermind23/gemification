package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.n0 */
public final class C12759n0 implements C6201a {

    /* renamed from: d */
    private final ListItem f37796d;

    /* renamed from: e */
    public final View f37797e;

    /* renamed from: f */
    public final TwoLineTextItem f37798f;

    /* renamed from: g */
    public final Button f37799g;

    private C12759n0(ListItem listItem, View view, TwoLineTextItem twoLineTextItem, Button button) {
        this.f37796d = listItem;
        this.f37797e = view;
        this.f37798f = twoLineTextItem;
        this.f37799g = button;
    }

    /* renamed from: a */
    public static C12759n0 m48430a(View view) {
        int i = C10114f.f27944Y;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C10114f.info_desc;
            TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
            if (twoLineTextItem != null) {
                i = C10114f.remove_info_button;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    return new C12759n0((ListItem) view, a, twoLineTextItem, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12759n0 m48431d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_financial_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48430a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f37796d;
    }
}

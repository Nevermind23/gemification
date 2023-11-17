package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bv0.C31204d;
import bv0.C31205e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;

/* renamed from: ev0.z */
public final class C31845z implements C6201a {

    /* renamed from: d */
    private final ListItem f78552d;

    /* renamed from: e */
    public final TwoLineTextItem f78553e;

    private C31845z(ListItem listItem, TwoLineTextItem twoLineTextItem) {
        this.f78552d = listItem;
        this.f78553e = twoLineTextItem;
    }

    /* renamed from: a */
    public static C31845z m94169a(View view) {
        int i = C31204d.two_line_item;
        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
        if (twoLineTextItem != null) {
            return new C31845z((ListItem) view, twoLineTextItem);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31845z m94170d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_product, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94169a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f78552d;
    }
}

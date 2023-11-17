package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;

/* renamed from: ua1.b1 */
public final class C28629b1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72680d;

    /* renamed from: e */
    public final ListItem f72681e;

    private C28629b1(LinearLayout linearLayout, ListItem listItem) {
        this.f72680d = linearLayout;
        this.f72681e = listItem;
    }

    /* renamed from: a */
    public static C28629b1 m87613a(View view) {
        int i = C10216u.contact_info_item;
        ListItem listItem = (ListItem) C6202b.m24689a(view, i);
        if (listItem != null) {
            return new C28629b1((LinearLayout) view, listItem);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28629b1 m87614d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.item_contact_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87613a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72680d;
    }
}

package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;

/* renamed from: ue0.i */
public final class C28730i implements C6201a {

    /* renamed from: d */
    private final LinearLayout f73287d;

    /* renamed from: e */
    public final ListItem f73288e;

    /* renamed from: f */
    public final ListItem f73289f;

    private C28730i(LinearLayout linearLayout, ListItem listItem, ListItem listItem2) {
        this.f73287d = linearLayout;
        this.f73288e = listItem;
        this.f73289f = listItem2;
    }

    /* renamed from: a */
    public static C28730i m88042a(View view) {
        int i = C25187g.delete_list_item;
        ListItem listItem = (ListItem) C6202b.m24689a(view, i);
        if (listItem != null) {
            i = C25187g.edit_list_item;
            ListItem listItem2 = (ListItem) C6202b.m24689a(view, i);
            if (listItem2 != null) {
                return new C28730i((LinearLayout) view, listItem, listItem2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28730i m88043d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.action_sheet_gt_edit_watchlist, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88042a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f73287d;
    }
}

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

/* renamed from: ua1.r */
public final class C28675r implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72900d;

    /* renamed from: e */
    public final LinearLayout f72901e;

    /* renamed from: f */
    public final ListItem f72902f;

    /* renamed from: g */
    public final ListItem f72903g;

    private C28675r(LinearLayout linearLayout, LinearLayout linearLayout2, ListItem listItem, ListItem listItem2) {
        this.f72900d = linearLayout;
        this.f72901e = linearLayout2;
        this.f72902f = listItem;
        this.f72903g = listItem2;
    }

    /* renamed from: a */
    public static C28675r m87814a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C10216u.section_email;
        ListItem listItem = (ListItem) C6202b.m24689a(view, i);
        if (listItem != null) {
            i = C10216u.section_phone;
            ListItem listItem2 = (ListItem) C6202b.m24689a(view, i);
            if (listItem2 != null) {
                return new C28675r(linearLayout, linearLayout, listItem, listItem2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28675r m87815d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_confirm_phone_new_contact_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87814a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72900d;
    }
}

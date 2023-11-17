package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;

/* renamed from: ua1.e1 */
public final class C28638e1 implements C6201a {

    /* renamed from: d */
    private final ListItem f72719d;

    /* renamed from: e */
    public final AppCompatTextView f72720e;

    /* renamed from: f */
    public final ListItem f72721f;

    /* renamed from: g */
    public final AppCompatTextView f72722g;

    private C28638e1(ListItem listItem, AppCompatTextView appCompatTextView, ListItem listItem2, AppCompatTextView appCompatTextView2) {
        this.f72719d = listItem;
        this.f72720e = appCompatTextView;
        this.f72721f = listItem2;
        this.f72722g = appCompatTextView2;
    }

    /* renamed from: a */
    public static C28638e1 m87652a(View view) {
        int i = C10216u.country_code;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            ListItem listItem = (ListItem) view;
            int i2 = C10216u.country_name;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i2);
            if (appCompatTextView2 != null) {
                return new C28638e1(listItem, appCompatTextView, listItem, appCompatTextView2);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28638e1 m87653d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.item_country_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87652a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f72719d;
    }
}

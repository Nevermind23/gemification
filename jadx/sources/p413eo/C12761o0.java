package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.o0 */
public final class C12761o0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f37811d;

    /* renamed from: e */
    public final View f37812e;

    /* renamed from: f */
    public final ListItem f37813f;

    /* renamed from: g */
    public final LinearLayout f37814g;

    /* renamed from: h */
    public final TextView f37815h;

    private C12761o0(LinearLayout linearLayout, View view, ListItem listItem, LinearLayout linearLayout2, TextView textView) {
        this.f37811d = linearLayout;
        this.f37812e = view;
        this.f37813f = listItem;
        this.f37814g = linearLayout2;
        this.f37815h = textView;
    }

    /* renamed from: a */
    public static C12761o0 m48439a(View view) {
        int i = C10114f.f27944Y;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C10114f.financial_info;
            ListItem listItem = (ListItem) C6202b.m24689a(view, i);
            if (listItem != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i = C10114f.financial_type;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    return new C12761o0(linearLayout, a, listItem, linearLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12761o0 m48440d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_financial_info_component, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48439a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f37811d;
    }
}

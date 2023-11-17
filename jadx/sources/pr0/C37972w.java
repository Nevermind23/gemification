package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import lr0.C37130e;
import lr0.C37131f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;

/* renamed from: pr0.w */
public final class C37972w implements C6201a {

    /* renamed from: d */
    private final ListItem f91269d;

    /* renamed from: e */
    public final TextView f91270e;

    /* renamed from: f */
    public final TextView f91271f;

    private C37972w(ListItem listItem, TextView textView, TextView textView2) {
        this.f91269d = listItem;
        this.f91270e = textView;
        this.f91271f = textView2;
    }

    /* renamed from: a */
    public static C37972w m111633a(View view) {
        int i = C37130e.f89449v1;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C37130e.f89419D1;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                return new C37972w((ListItem) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37972w m111634d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_payment_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111633a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f91269d;
    }
}

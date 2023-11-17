package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import np0.C37439e;
import np0.C37440f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;

/* renamed from: sp0.t */
public final class C38501t implements C6201a {

    /* renamed from: d */
    private final ListItem f92281d;

    /* renamed from: e */
    public final TextView f92282e;

    /* renamed from: f */
    public final ImageView f92283f;

    /* renamed from: g */
    public final TextView f92284g;

    private C38501t(ListItem listItem, TextView textView, ImageView imageView, TextView textView2) {
        this.f92281d = listItem;
        this.f92282e = textView;
        this.f92283f = imageView;
        this.f92284g = textView2;
    }

    /* renamed from: a */
    public static C38501t m113018a(View view) {
        int i = C37439e.f90002f;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C37439e.f89991Q;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C37439e.f89994X0;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    return new C38501t((ListItem) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38501t m113019d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.item_forgiven_fund, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m113018a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f92281d;
    }
}

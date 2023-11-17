package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.s0 */
public final class C12769s0 implements C6201a {

    /* renamed from: d */
    private final ListItem f37859d;

    /* renamed from: e */
    public final ImageView f37860e;

    /* renamed from: f */
    public final TextView f37861f;

    private C12769s0(ListItem listItem, ImageView imageView, TextView textView) {
        this.f37859d = listItem;
        this.f37860e = imageView;
        this.f37861f = textView;
    }

    /* renamed from: a */
    public static C12769s0 m48475a(View view) {
        int i = C10114f.f27926E0;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10114f.point_name;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                return new C12769s0((ListItem) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12769s0 m48476d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_solo_lounge_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48475a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f37859d;
    }
}

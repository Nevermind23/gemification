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

/* renamed from: eo.t0 */
public final class C12771t0 implements C6201a {

    /* renamed from: d */
    private final ListItem f37865d;

    /* renamed from: e */
    public final TextView f37866e;

    /* renamed from: f */
    public final ImageView f37867f;

    /* renamed from: g */
    public final TextView f37868g;

    private C12771t0(ListItem listItem, TextView textView, ImageView imageView, TextView textView2) {
        this.f37865d = listItem;
        this.f37866e = textView;
        this.f37867f = imageView;
        this.f37868g = textView2;
    }

    /* renamed from: a */
    public static C12771t0 m48483a(View view) {
        int i = C10114f.f27969r;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C10114f.f27964m0;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C10114f.f27974t1;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    return new C12771t0((ListItem) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12771t0 m48484d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48483a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f37865d;
    }
}

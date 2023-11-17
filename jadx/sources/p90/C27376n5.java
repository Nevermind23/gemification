package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.n5 */
public final class C27376n5 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f69380d;

    /* renamed from: e */
    public final TextView f69381e;

    private C27376n5(FrameLayout frameLayout, TextView textView) {
        this.f69380d = frameLayout;
        this.f69381e = textView;
    }

    /* renamed from: a */
    public static C27376n5 m84811a(View view) {
        int i = C10322k.delivery_header;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            return new C27376n5((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27376n5 m84812d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_delivery_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84811a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f69380d;
    }
}

package p90;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;

/* renamed from: p90.j0 */
public final class C27334j0 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f69011d;

    /* renamed from: e */
    public final ImageView f69012e;

    /* renamed from: f */
    public final TextView f69013f;

    /* renamed from: g */
    public final FrameLayout f69014g;

    /* renamed from: h */
    public final C27272c8 f69015h;

    private C27334j0(FrameLayout frameLayout, ImageView imageView, TextView textView, FrameLayout frameLayout2, C27272c8 c8Var) {
        this.f69011d = frameLayout;
        this.f69012e = imageView;
        this.f69013f = textView;
        this.f69014g = frameLayout2;
        this.f69015h = c8Var;
    }

    /* renamed from: a */
    public static C27334j0 m84645a(View view) {
        int i = C10322k.f28789Sg;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10322k.f28715Cl;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i = C10322k.f28730Ex;
                View a = C6202b.m24689a(view, i);
                if (a != null) {
                    return new C27334j0(frameLayout, imageView, textView, frameLayout, C27272c8.m84388a(a));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f69011d;
    }
}

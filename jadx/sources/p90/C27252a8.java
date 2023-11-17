package p90;

import android.view.View;
import android.widget.FrameLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;

/* renamed from: p90.a8 */
public final class C27252a8 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f68329d;

    /* renamed from: e */
    public final FrameLayout f68330e;

    /* renamed from: f */
    public final View f68331f;

    /* renamed from: g */
    public final BogTextView f68332g;

    /* renamed from: h */
    public final BogTextView f68333h;

    private C27252a8(FrameLayout frameLayout, FrameLayout frameLayout2, View view, BogTextView bogTextView, BogTextView bogTextView2) {
        this.f68329d = frameLayout;
        this.f68330e = frameLayout2;
        this.f68331f = view;
        this.f68332g = bogTextView;
        this.f68333h = bogTextView2;
    }

    /* renamed from: a */
    public static C27252a8 m84306a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = C10322k.f28850jc;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C10322k.item_desc;
            BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
            if (bogTextView != null) {
                i = C10322k.f28846ii;
                BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view, i);
                if (bogTextView2 != null) {
                    return new C27252a8(frameLayout, frameLayout, a, bogTextView, bogTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f68329d;
    }
}

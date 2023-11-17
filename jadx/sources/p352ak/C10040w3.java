package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.w3 */
public final class C10040w3 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27692d;

    /* renamed from: e */
    public final FrameLayout f27693e;

    /* renamed from: f */
    public final LinearLayout f27694f;

    /* renamed from: g */
    public final FrameLayout f27695g;

    /* renamed from: h */
    public final FrameLayout f27696h;

    /* renamed from: i */
    public final FrameLayout f27697i;

    private C10040w3(LinearLayout linearLayout, FrameLayout frameLayout, LinearLayout linearLayout2, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4) {
        this.f27692d = linearLayout;
        this.f27693e = frameLayout;
        this.f27694f = linearLayout2;
        this.f27695g = frameLayout2;
        this.f27696h = frameLayout3;
        this.f27697i = frameLayout4;
    }

    /* renamed from: a */
    public static C10040w3 m36824a(View view) {
        int i = C17782g.bottomViewContainer;
        FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
        if (frameLayout != null) {
            i = C17782g.f49691I3;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C17782g.f49777o5;
                FrameLayout frameLayout2 = (FrameLayout) C6202b.m24689a(view, i);
                if (frameLayout2 != null) {
                    i = C17782g.middleViewContainer;
                    FrameLayout frameLayout3 = (FrameLayout) C6202b.m24689a(view, i);
                    if (frameLayout3 != null) {
                        i = C17782g.rightViewContainer;
                        FrameLayout frameLayout4 = (FrameLayout) C6202b.m24689a(view, i);
                        if (frameLayout4 != null) {
                            return new C10040w3((LinearLayout) view, frameLayout, linearLayout, frameLayout2, frameLayout3, frameLayout4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10040w3 m36825d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36824a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27692d;
    }
}

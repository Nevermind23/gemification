package p90;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p086g1.C6201a;

/* renamed from: p90.d1 */
public final class C27275d1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68509d;

    /* renamed from: e */
    public final LinearLayout f68510e;

    /* renamed from: f */
    public final FrameLayout f68511f;

    /* renamed from: g */
    public final C27272c8 f68512g;

    private C27275d1(LinearLayout linearLayout, LinearLayout linearLayout2, FrameLayout frameLayout, C27272c8 c8Var) {
        this.f68509d = linearLayout;
        this.f68510e = linearLayout2;
        this.f68511f = frameLayout;
        this.f68512g = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27275d1 m84400a(android.view.View r4) {
        /*
            r0 = r4
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            int r1 = p366bk.C10322k.fragment_content_view
            android.view.View r2 = p086g1.C6202b.m24689a(r4, r1)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            if (r2 == 0) goto L_0x001f
            int r1 = p366bk.C10322k.f28730Ex
            android.view.View r3 = p086g1.C6202b.m24689a(r4, r1)
            if (r3 == 0) goto L_0x001f
            p90.c8 r4 = p90.C27272c8.m84388a(r3)
            p90.d1 r1 = new p90.d1
            r1.<init>(r0, r0, r2, r4)
            return r1
        L_0x001f:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27275d1.m84400a(android.view.View):p90.d1");
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68509d;
    }
}

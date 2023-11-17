package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.components.UserTipPagerHelper;
import p366bk.C10324m;

/* renamed from: p90.k0 */
public final class C27344k0 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f69107d;

    /* renamed from: e */
    public final ImageView f69108e;

    /* renamed from: f */
    public final C27251a7 f69109f;

    /* renamed from: g */
    public final C27364m2 f69110g;

    /* renamed from: h */
    public final UserTipPagerHelper f69111h;

    private C27344k0(FrameLayout frameLayout, ImageView imageView, C27251a7 a7Var, C27364m2 m2Var, UserTipPagerHelper userTipPagerHelper) {
        this.f69107d = frameLayout;
        this.f69108e = imageView;
        this.f69109f = a7Var;
        this.f69110g = m2Var;
        this.f69111h = userTipPagerHelper;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = p366bk.C10322k.f28776Oc;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27344k0 m84683a(android.view.View r8) {
        /*
            int r0 = p366bk.C10322k.f28849j4
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L_0x0038
            int r0 = p366bk.C10322k.f28776Oc
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0038
            p90.a7 r5 = p90.C27251a7.m84303a(r1)
            int r0 = p366bk.C10322k.f28784Qe
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0038
            p90.m2 r6 = p90.C27364m2.m84766a(r1)
            int r0 = p366bk.C10322k.user_tip_helper_view
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r7 = r1
            ge.bog.mobilebank.ui.components.UserTipPagerHelper r7 = (p341ge.bog.mobilebank.p975ui.components.UserTipPagerHelper) r7
            if (r7 == 0) goto L_0x0038
            p90.k0 r0 = new p90.k0
            r3 = r8
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0038:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27344k0.m84683a(android.view.View):p90.k0");
    }

    /* renamed from: d */
    public static C27344k0 m84684d(LayoutInflater layoutInflater) {
        return m84685e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27344k0 m84685e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_launcher, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84683a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f69107d;
    }
}

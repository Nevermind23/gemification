package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p366bk.C10324m;

/* renamed from: p90.f2 */
public final class C27296f2 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68697d;

    /* renamed from: e */
    public final LinearLayout f68698e;

    /* renamed from: f */
    public final C27364m2 f68699f;

    /* renamed from: g */
    public final C27251a7 f68700g;

    /* renamed from: h */
    public final C27272c8 f68701h;

    private C27296f2(LinearLayout linearLayout, LinearLayout linearLayout2, C27364m2 m2Var, C27251a7 a7Var, C27272c8 c8Var) {
        this.f68697d = linearLayout;
        this.f68698e = linearLayout2;
        this.f68699f = m2Var;
        this.f68700g = a7Var;
        this.f68701h = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = p366bk.C10322k.f28784Qe;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27296f2 m84486a(android.view.View r8) {
        /*
            int r0 = p366bk.C10322k.f28776Oc
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L_0x0039
            int r0 = p366bk.C10322k.f28784Qe
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0039
            p90.m2 r5 = p90.C27364m2.m84766a(r1)
            int r0 = p366bk.C10322k.horizontal_error_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0039
            p90.a7 r6 = p90.C27251a7.m84303a(r1)
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0039
            p90.c8 r7 = p90.C27272c8.m84388a(r1)
            p90.f2 r0 = new p90.f2
            r3 = r8
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0039:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27296f2.m84486a(android.view.View):p90.f2");
    }

    /* renamed from: d */
    public static C27296f2 m84487d(LayoutInflater layoutInflater) {
        return m84488e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27296f2 m84488e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_transfer_loader, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84486a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68697d;
    }
}

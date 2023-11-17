package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p086g1.C6201a;
import p366bk.C10324m;

/* renamed from: p90.b2 */
public final class C27256b2 implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f68368d;

    /* renamed from: e */
    public final LinearLayout f68369e;

    /* renamed from: f */
    public final LinearLayout f68370f;

    /* renamed from: g */
    public final LinearLayout f68371g;

    /* renamed from: h */
    public final C27364m2 f68372h;

    /* renamed from: i */
    public final C27251a7 f68373i;

    /* renamed from: j */
    public final C27477y7 f68374j;

    /* renamed from: k */
    public final C27272c8 f68375k;

    private C27256b2(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, C27364m2 m2Var, C27251a7 a7Var, C27477y7 y7Var, C27272c8 c8Var) {
        this.f68368d = relativeLayout;
        this.f68369e = linearLayout;
        this.f68370f = linearLayout2;
        this.f68371g = linearLayout3;
        this.f68372h = m2Var;
        this.f68373i = a7Var;
        this.f68374j = y7Var;
        this.f68375k = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = p366bk.C10322k.f28784Qe;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27256b2 m84323a(android.view.View r11) {
        /*
            int r0 = p366bk.C10322k.f28821b5
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L_0x005b
            int r0 = p366bk.C10322k.f28776Oc
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x005b
            int r0 = p366bk.C10322k.f28769Me
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L_0x005b
            int r0 = p366bk.C10322k.f28784Qe
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x005b
            p90.m2 r7 = p90.C27364m2.m84766a(r1)
            int r0 = p366bk.C10322k.horizontal_error_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x005b
            p90.a7 r8 = p90.C27251a7.m84303a(r1)
            int r0 = p366bk.C10322k.pay_group
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x005b
            p90.y7 r9 = p90.C27477y7.m85215a(r1)
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x005b
            p90.c8 r10 = p90.C27272c8.m84388a(r1)
            p90.b2 r0 = new p90.b2
            r3 = r11
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x005b:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27256b2.m84323a(android.view.View):p90.b2");
    }

    /* renamed from: d */
    public static C27256b2 m84324d(LayoutInflater layoutInflater) {
        return m84325e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27256b2 m84325e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_sms_notif_manager, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84323a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f68368d;
    }
}

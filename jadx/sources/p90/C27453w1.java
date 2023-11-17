package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p366bk.C10324m;

/* renamed from: p90.w1 */
public final class C27453w1 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f70152d;

    /* renamed from: e */
    public final FrameLayout f70153e;

    /* renamed from: f */
    public final FrameLayout f70154f;

    /* renamed from: g */
    public final C27272c8 f70155g;

    private C27453w1(ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, C27272c8 c8Var) {
        this.f70152d = constraintLayout;
        this.f70153e = frameLayout;
        this.f70154f = frameLayout2;
        this.f70155g = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27453w1 m85118a(android.view.View r4) {
        /*
            int r0 = p366bk.C10322k.f28769Me
            android.view.View r1 = p086g1.C6202b.m24689a(r4, r0)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            if (r1 == 0) goto L_0x0028
            int r0 = p366bk.C10322k.f28752Iq
            android.view.View r2 = p086g1.C6202b.m24689a(r4, r0)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            if (r2 == 0) goto L_0x0028
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r3 = p086g1.C6202b.m24689a(r4, r0)
            if (r3 == 0) goto L_0x0028
            p90.c8 r0 = p90.C27272c8.m84388a(r3)
            p90.w1 r3 = new p90.w1
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r1, r2, r0)
            return r3
        L_0x0028:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27453w1.m85118a(android.view.View):p90.w1");
    }

    /* renamed from: d */
    public static C27453w1 m85119d(LayoutInflater layoutInflater) {
        return m85120e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27453w1 m85120e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_remittance_credit_info_contract, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85118a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f70152d;
    }
}

package g71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import c71.C31285e;
import p086g1.C6201a;
import p90.C27272c8;

/* renamed from: g71.b */
public final class C32109b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f78965d;

    /* renamed from: e */
    public final FragmentContainerView f78966e;

    /* renamed from: f */
    public final C27272c8 f78967f;

    /* renamed from: g */
    public final LinearLayout f78968g;

    private C32109b(LinearLayout linearLayout, FragmentContainerView fragmentContainerView, C27272c8 c8Var, LinearLayout linearLayout2) {
        this.f78965d = linearLayout;
        this.f78966e = fragmentContainerView;
        this.f78967f = c8Var;
        this.f78968g = linearLayout2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = c71.C31284d.f77698F0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g71.C32109b m94568a(android.view.View r3) {
        /*
            int r0 = c71.C31284d.f77700H
            android.view.View r1 = p086g1.C6202b.m24689a(r3, r0)
            androidx.fragment.app.FragmentContainerView r1 = (androidx.fragment.app.FragmentContainerView) r1
            if (r1 == 0) goto L_0x001e
            int r0 = c71.C31284d.f77698F0
            android.view.View r2 = p086g1.C6202b.m24689a(r3, r0)
            if (r2 == 0) goto L_0x001e
            p90.c8 r0 = p90.C27272c8.m84388a(r2)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            g71.b r2 = new g71.b
            r2.<init>(r3, r1, r0, r3)
            return r2
        L_0x001e:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g71.C32109b.m94568a(android.view.View):g71.b");
    }

    /* renamed from: d */
    public static C32109b m94569d(LayoutInflater layoutInflater) {
        return m94570e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C32109b m94570e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31285e.activity_transport_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94568a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f78965d;
    }
}

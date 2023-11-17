package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import fx0.C32025e;
import p086g1.C6201a;
import p90.C27272c8;

/* renamed from: jx0.d */
public final class C36815d implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88816d;

    /* renamed from: e */
    public final FragmentContainerView f88817e;

    /* renamed from: f */
    public final C27272c8 f88818f;

    private C36815d(LinearLayout linearLayout, FragmentContainerView fragmentContainerView, C27272c8 c8Var) {
        this.f88816d = linearLayout;
        this.f88817e = fragmentContainerView;
        this.f88818f = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = fx0.C32024d.f78856r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static jx0.C36815d m109073a(android.view.View r3) {
        /*
            int r0 = fx0.C32024d.f78837I
            android.view.View r1 = p086g1.C6202b.m24689a(r3, r0)
            androidx.fragment.app.FragmentContainerView r1 = (androidx.fragment.app.FragmentContainerView) r1
            if (r1 == 0) goto L_0x001e
            int r0 = fx0.C32024d.f78856r0
            android.view.View r2 = p086g1.C6202b.m24689a(r3, r0)
            if (r2 == 0) goto L_0x001e
            p90.c8 r0 = p90.C27272c8.m84388a(r2)
            jx0.d r2 = new jx0.d
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2.<init>(r3, r1, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: jx0.C36815d.m109073a(android.view.View):jx0.d");
    }

    /* renamed from: d */
    public static C36815d m109074d(LayoutInflater layoutInflater) {
        return m109075e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C36815d m109075e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.activity_payment_providers, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109073a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88816d;
    }
}

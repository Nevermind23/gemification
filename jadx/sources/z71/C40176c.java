package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import p086g1.C6201a;
import p90.C27272c8;
import y71.C40031e;

/* renamed from: z71.c */
public final class C40176c implements C6201a {

    /* renamed from: d */
    private final LinearLayout f95455d;

    /* renamed from: e */
    public final FragmentContainerView f95456e;

    /* renamed from: f */
    public final C27272c8 f95457f;

    private C40176c(LinearLayout linearLayout, FragmentContainerView fragmentContainerView, C27272c8 c8Var) {
        this.f95455d = linearLayout;
        this.f95456e = fragmentContainerView;
        this.f95457f = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = y71.C40030d.f95091B0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static z71.C40176c m116410a(android.view.View r3) {
        /*
            int r0 = y71.C40030d.f95098Z
            android.view.View r1 = p086g1.C6202b.m24689a(r3, r0)
            androidx.fragment.app.FragmentContainerView r1 = (androidx.fragment.app.FragmentContainerView) r1
            if (r1 == 0) goto L_0x001e
            int r0 = y71.C40030d.f95091B0
            android.view.View r2 = p086g1.C6202b.m24689a(r3, r0)
            if (r2 == 0) goto L_0x001e
            p90.c8 r0 = p90.C27272c8.m84388a(r2)
            z71.c r2 = new z71.c
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
        throw new UnsupportedOperationException("Method not decompiled: z71.C40176c.m116410a(android.view.View):z71.c");
    }

    /* renamed from: d */
    public static C40176c m116411d(LayoutInflater layoutInflater) {
        return m116412e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C40176c m116412e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.activity_travel_insurance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116410a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f95455d;
    }
}

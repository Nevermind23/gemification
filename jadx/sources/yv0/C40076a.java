package yv0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import p086g1.C6201a;
import p90.C27272c8;
import uv0.C39107d;

/* renamed from: yv0.a */
public final class C40076a implements C6201a {

    /* renamed from: d */
    private final LinearLayout f95250d;

    /* renamed from: e */
    public final FragmentContainerView f95251e;

    /* renamed from: f */
    public final C27272c8 f95252f;

    private C40076a(LinearLayout linearLayout, FragmentContainerView fragmentContainerView, C27272c8 c8Var) {
        this.f95250d = linearLayout;
        this.f95251e = fragmentContainerView;
        this.f95252f = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = uv0.C39106c.f93248I;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static yv0.C40076a m116108a(android.view.View r3) {
        /*
            int r0 = uv0.C39106c.f93256q
            android.view.View r1 = p086g1.C6202b.m24689a(r3, r0)
            androidx.fragment.app.FragmentContainerView r1 = (androidx.fragment.app.FragmentContainerView) r1
            if (r1 == 0) goto L_0x001e
            int r0 = uv0.C39106c.f93248I
            android.view.View r2 = p086g1.C6202b.m24689a(r3, r0)
            if (r2 == 0) goto L_0x001e
            p90.c8 r0 = p90.C27272c8.m84388a(r2)
            yv0.a r2 = new yv0.a
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
        throw new UnsupportedOperationException("Method not decompiled: yv0.C40076a.m116108a(android.view.View):yv0.a");
    }

    /* renamed from: d */
    public static C40076a m116109d(LayoutInflater layoutInflater) {
        return m116110e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C40076a m116110e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39107d.activity_p2p, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116108a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f95250d;
    }
}

package om0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import km0.C25746d;
import p086g1.C6201a;
import p90.C27272c8;

/* renamed from: om0.c */
public final class C27052c implements C6201a {

    /* renamed from: d */
    private final LinearLayout f67934d;

    /* renamed from: e */
    public final FragmentContainerView f67935e;

    /* renamed from: f */
    public final C27272c8 f67936f;

    private C27052c(LinearLayout linearLayout, FragmentContainerView fragmentContainerView, C27272c8 c8Var) {
        this.f67934d = linearLayout;
        this.f67935e = fragmentContainerView;
        this.f67936f = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = km0.C25745c.f65522L;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static om0.C27052c m83879a(android.view.View r3) {
        /*
            int r0 = km0.C25745c.f65527o
            android.view.View r1 = p086g1.C6202b.m24689a(r3, r0)
            androidx.fragment.app.FragmentContainerView r1 = (androidx.fragment.app.FragmentContainerView) r1
            if (r1 == 0) goto L_0x001e
            int r0 = km0.C25745c.f65522L
            android.view.View r2 = p086g1.C6202b.m24689a(r3, r0)
            if (r2 == 0) goto L_0x001e
            p90.c8 r0 = p90.C27272c8.m84388a(r2)
            om0.c r2 = new om0.c
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
        throw new UnsupportedOperationException("Method not decompiled: om0.C27052c.m83879a(android.view.View):om0.c");
    }

    /* renamed from: d */
    public static C27052c m83880d(LayoutInflater layoutInflater) {
        return m83881e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27052c m83881e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25746d.activity_junior, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m83879a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f67934d;
    }
}

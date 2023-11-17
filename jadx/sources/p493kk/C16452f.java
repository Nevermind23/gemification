package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import p086g1.C6201a;
import p451hk.C15527e;
import p90.C27272c8;

/* renamed from: kk.f */
public final class C16452f implements C6201a {

    /* renamed from: d */
    private final LinearLayout f46472d;

    /* renamed from: e */
    public final FragmentContainerView f46473e;

    /* renamed from: f */
    public final C27272c8 f46474f;

    private C16452f(LinearLayout linearLayout, FragmentContainerView fragmentContainerView, C27272c8 c8Var) {
        this.f46472d = linearLayout;
        this.f46473e = fragmentContainerView;
        this.f46474f = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = p451hk.C15526d.f44061T1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p493kk.C16452f m58611a(android.view.View r3) {
        /*
            int r0 = p451hk.C15526d.f44066b1
            android.view.View r1 = p086g1.C6202b.m24689a(r3, r0)
            androidx.fragment.app.FragmentContainerView r1 = (androidx.fragment.app.FragmentContainerView) r1
            if (r1 == 0) goto L_0x001e
            int r0 = p451hk.C15526d.f44061T1
            android.view.View r2 = p086g1.C6202b.m24689a(r3, r0)
            if (r2 == 0) goto L_0x001e
            p90.c8 r0 = p90.C27272c8.m84388a(r2)
            kk.f r2 = new kk.f
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
        throw new UnsupportedOperationException("Method not decompiled: p493kk.C16452f.m58611a(android.view.View):kk.f");
    }

    /* renamed from: d */
    public static C16452f m58612d(LayoutInflater layoutInflater) {
        return m58613e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C16452f m58613e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.activity_auto_liability_insurance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58611a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f46472d;
    }
}

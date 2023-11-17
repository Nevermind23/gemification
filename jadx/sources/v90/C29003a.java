package v90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import p086g1.C6201a;
import p90.C27272c8;
import s90.C28165c;

/* renamed from: v90.a */
public final class C29003a implements C6201a {

    /* renamed from: d */
    private final LinearLayout f73942d;

    /* renamed from: e */
    public final FragmentContainerView f73943e;

    /* renamed from: f */
    public final C27272c8 f73944f;

    private C29003a(LinearLayout linearLayout, FragmentContainerView fragmentContainerView, C27272c8 c8Var) {
        this.f73942d = linearLayout;
        this.f73943e = fragmentContainerView;
        this.f73944f = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = s90.C28164b.f71518v;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static v90.C29003a m88736a(android.view.View r3) {
        /*
            int r0 = s90.C28164b.f71515n
            android.view.View r1 = p086g1.C6202b.m24689a(r3, r0)
            androidx.fragment.app.FragmentContainerView r1 = (androidx.fragment.app.FragmentContainerView) r1
            if (r1 == 0) goto L_0x001e
            int r0 = s90.C28164b.f71518v
            android.view.View r2 = p086g1.C6202b.m24689a(r3, r0)
            if (r2 == 0) goto L_0x001e
            p90.c8 r0 = p90.C27272c8.m84388a(r2)
            v90.a r2 = new v90.a
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
        throw new UnsupportedOperationException("Method not decompiled: v90.C29003a.m88736a(android.view.View):v90.a");
    }

    /* renamed from: d */
    public static C29003a m88737d(LayoutInflater layoutInflater) {
        return m88738e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C29003a m88738e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28165c.activity_ddsto, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88736a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f73942d;
    }
}

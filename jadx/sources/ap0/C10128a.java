package ap0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import p086g1.C6201a;
import p90.C27272c8;
import wo0.C18653c;

/* renamed from: ap0.a */
public final class C10128a implements C6201a {

    /* renamed from: d */
    private final LinearLayout f28049d;

    /* renamed from: e */
    public final FragmentContainerView f28050e;

    /* renamed from: f */
    public final C27272c8 f28051f;

    /* renamed from: g */
    public final LinearLayout f28052g;

    private C10128a(LinearLayout linearLayout, FragmentContainerView fragmentContainerView, C27272c8 c8Var, LinearLayout linearLayout2) {
        this.f28049d = linearLayout;
        this.f28050e = fragmentContainerView;
        this.f28051f = c8Var;
        this.f28052g = linearLayout2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = wo0.C18652b.f52249b0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ap0.C10128a m37039a(android.view.View r3) {
        /*
            int r0 = wo0.C18652b.f52244H
            android.view.View r1 = p086g1.C6202b.m24689a(r3, r0)
            androidx.fragment.app.FragmentContainerView r1 = (androidx.fragment.app.FragmentContainerView) r1
            if (r1 == 0) goto L_0x001e
            int r0 = wo0.C18652b.f52249b0
            android.view.View r2 = p086g1.C6202b.m24689a(r3, r0)
            if (r2 == 0) goto L_0x001e
            p90.c8 r0 = p90.C27272c8.m84388a(r2)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            ap0.a r2 = new ap0.a
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
        throw new UnsupportedOperationException("Method not decompiled: ap0.C10128a.m37039a(android.view.View):ap0.a");
    }

    /* renamed from: d */
    public static C10128a m37040d(LayoutInflater layoutInflater) {
        return m37041e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C10128a m37041e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18653c.activity_p2p_link_sharing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37039a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f28049d;
    }
}

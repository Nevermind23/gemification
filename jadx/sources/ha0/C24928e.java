package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import da0.C19952f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p90.C27272c8;

/* renamed from: ha0.e */
public final class C24928e implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f64106d;

    /* renamed from: e */
    public final FrameLayout f64107e;

    /* renamed from: f */
    public final FrameLayout f64108f;

    /* renamed from: g */
    public final FragmentContainerView f64109g;

    /* renamed from: h */
    public final Button f64110h;

    /* renamed from: i */
    public final PageState f64111i;

    /* renamed from: j */
    public final C27272c8 f64112j;

    private C24928e(ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, FragmentContainerView fragmentContainerView, Button button, PageState pageState, C27272c8 c8Var) {
        this.f64106d = constraintLayout;
        this.f64107e = frameLayout;
        this.f64108f = frameLayout2;
        this.f64109g = fragmentContainerView;
        this.f64110h = button;
        this.f64111i = pageState;
        this.f64112j = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = da0.C19951e.f54510G0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ha0.C24928e m79689a(android.view.View r10) {
        /*
            int r0 = da0.C19951e.f54517L
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            if (r4 == 0) goto L_0x004d
            int r0 = da0.C19951e.f54525d0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r5 = r1
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            if (r5 == 0) goto L_0x004d
            int r0 = da0.C19951e.f54529j0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            androidx.fragment.app.FragmentContainerView r6 = (androidx.fragment.app.FragmentContainerView) r6
            if (r6 == 0) goto L_0x004d
            int r0 = da0.C19951e.f54538t0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r7 = r1
            ge.bog.designsystem.components.buttons.Button r7 = (p341ge.bog.designsystem.components.buttons.Button) r7
            if (r7 == 0) goto L_0x004d
            int r0 = da0.C19951e.f54543z0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            ge.bog.designsystem.components.pagestate.PageState r8 = (p341ge.bog.designsystem.components.pagestate.PageState) r8
            if (r8 == 0) goto L_0x004d
            int r0 = da0.C19951e.f54510G0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            if (r1 == 0) goto L_0x004d
            p90.c8 r9 = p90.C27272c8.m84388a(r1)
            ha0.e r0 = new ha0.e
            r3 = r10
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x004d:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C24928e.m79689a(android.view.View):ha0.e");
    }

    /* renamed from: d */
    public static C24928e m79690d(LayoutInflater layoutInflater) {
        return m79691e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C24928e m79691e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.activity_combined_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79689a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f64106d;
    }
}

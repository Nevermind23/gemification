package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import p086g1.C6201a;
import p90.C27272c8;
import p90.C27486z7;
import rb0.C27986e;

/* renamed from: xb0.i */
public final class C29721i implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f75075d;

    /* renamed from: e */
    public final FragmentContainerView f75076e;

    /* renamed from: f */
    public final FrameLayout f75077f;

    /* renamed from: g */
    public final C27486z7 f75078g;

    /* renamed from: h */
    public final CardView f75079h;

    /* renamed from: i */
    public final C27272c8 f75080i;

    private C29721i(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView, FrameLayout frameLayout, C27486z7 z7Var, CardView cardView, C27272c8 c8Var) {
        this.f75075d = constraintLayout;
        this.f75076e = fragmentContainerView;
        this.f75077f = frameLayout;
        this.f75078g = z7Var;
        this.f75079h = cardView;
        this.f75080i = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = rb0.C27985d.f71266O0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r0 = rb0.C27985d.f71292r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static xb0.C29721i m90250a(android.view.View r9) {
        /*
            int r0 = rb0.C27985d.f71252B0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            androidx.fragment.app.FragmentContainerView r4 = (androidx.fragment.app.FragmentContainerView) r4
            if (r4 == 0) goto L_0x0043
            int r0 = rb0.C27985d.f71261I0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            if (r5 == 0) goto L_0x0043
            int r0 = rb0.C27985d.f71266O0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0043
            p90.z7 r6 = p90.C27486z7.m85250a(r1)
            int r0 = rb0.C27985d.f71267P0
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            androidx.cardview.widget.CardView r7 = (androidx.cardview.widget.CardView) r7
            if (r7 == 0) goto L_0x0043
            int r0 = rb0.C27985d.f71292r1
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            if (r1 == 0) goto L_0x0043
            p90.c8 r8 = p90.C27272c8.m84388a(r1)
            xb0.i r0 = new xb0.i
            r3 = r9
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0043:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xb0.C29721i.m90250a(android.view.View):xb0.i");
    }

    /* renamed from: d */
    public static C29721i m90251d(LayoutInflater layoutInflater) {
        return m90252e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C29721i m90252e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.activity_deposit_prolongation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90250a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f75075d;
    }
}

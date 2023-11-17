package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p366bk.C10324m;

/* renamed from: p90.c0 */
public final class C27264c0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f68419d;

    /* renamed from: e */
    public final ConstraintLayout f68420e;

    /* renamed from: f */
    public final FrameLayout f68421f;

    /* renamed from: g */
    public final ProgressBar f68422g;

    /* renamed from: h */
    public final FrameLayout f68423h;

    /* renamed from: i */
    public final C27272c8 f68424i;

    private C27264c0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, ProgressBar progressBar, FrameLayout frameLayout2, C27272c8 c8Var) {
        this.f68419d = constraintLayout;
        this.f68420e = constraintLayout2;
        this.f68421f = frameLayout;
        this.f68422g = progressBar;
        this.f68423h = frameLayout2;
        this.f68424i = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27264c0 m84353a(android.view.View r7) {
        /*
            r2 = r7
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            int r0 = p366bk.C10322k.f28769Me
            android.view.View r1 = p086g1.C6202b.m24689a(r7, r0)
            r3 = r1
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            if (r3 == 0) goto L_0x0038
            int r0 = p366bk.C10322k.f28719Dq
            android.view.View r1 = p086g1.C6202b.m24689a(r7, r0)
            r4 = r1
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            if (r4 == 0) goto L_0x0038
            int r0 = p366bk.C10322k.f28728Eq
            android.view.View r1 = p086g1.C6202b.m24689a(r7, r0)
            r5 = r1
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            if (r5 == 0) goto L_0x0038
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r7, r0)
            if (r1 == 0) goto L_0x0038
            p90.c8 r6 = p90.C27272c8.m84388a(r1)
            p90.c0 r7 = new p90.c0
            r0 = r7
            r1 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x0038:
            android.content.res.Resources r7 = r7.getResources()
            java.lang.String r7 = r7.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27264c0.m84353a(android.view.View):p90.c0");
    }

    /* renamed from: d */
    public static C27264c0 m84354d(LayoutInflater layoutInflater) {
        return m84355e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27264c0 m84355e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_edit_profile_2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84353a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f68419d;
    }
}

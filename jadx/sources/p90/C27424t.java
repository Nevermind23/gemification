package p90;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import p086g1.C6201a;

/* renamed from: p90.t */
public final class C27424t implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69804d;

    /* renamed from: e */
    public final ConstraintLayout f69805e;

    /* renamed from: f */
    public final ImageView f69806f;

    /* renamed from: g */
    public final Group f69807g;

    /* renamed from: h */
    public final TextView f69808h;

    /* renamed from: i */
    public final RecyclerView f69809i;

    /* renamed from: j */
    public final SwipeRefreshLayout f69810j;

    /* renamed from: k */
    public final Guideline f69811k;

    /* renamed from: l */
    public final Guideline f69812l;

    /* renamed from: m */
    public final Guideline f69813m;

    /* renamed from: n */
    public final FrameLayout f69814n;

    /* renamed from: o */
    public final C27486z7 f69815o;

    /* renamed from: p */
    public final FrameLayout f69816p;

    /* renamed from: q */
    public final C27272c8 f69817q;

    private C27424t(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, Group group, TextView textView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, FrameLayout frameLayout, C27486z7 z7Var, FrameLayout frameLayout2, C27272c8 c8Var) {
        this.f69804d = constraintLayout;
        this.f69805e = constraintLayout2;
        this.f69806f = imageView;
        this.f69807g = group;
        this.f69808h = textView;
        this.f69809i = recyclerView;
        this.f69810j = swipeRefreshLayout;
        this.f69811k = guideline;
        this.f69812l = guideline2;
        this.f69813m = guideline3;
        this.f69814n = frameLayout;
        this.f69815o = z7Var;
        this.f69816p = frameLayout2;
        this.f69817q = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        r0 = p366bk.C10322k.f28774Ns;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27424t m85006a(android.view.View r15) {
        /*
            r2 = r15
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            int r0 = p366bk.C10322k.commissions_empty_image
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r3 = r1
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r3 == 0) goto L_0x0091
            int r0 = p366bk.C10322k.commissions_empty_list_warning_group
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r4 = r1
            androidx.constraintlayout.widget.Group r4 = (androidx.constraintlayout.widget.Group) r4
            if (r4 == 0) goto L_0x0091
            int r0 = p366bk.C10322k.commissions_empty_text
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0091
            int r0 = p366bk.C10322k.commissions_recycler
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x0091
            int r0 = p366bk.C10322k.commissions_swipe_refresh
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r7 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r7 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r7
            if (r7 == 0) goto L_0x0091
            int r0 = p366bk.C10322k.gdBot
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r8 = r1
            androidx.constraintlayout.widget.Guideline r8 = (androidx.constraintlayout.widget.Guideline) r8
            if (r8 == 0) goto L_0x0091
            int r0 = p366bk.C10322k.gdEnd
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r9 = r1
            androidx.constraintlayout.widget.Guideline r9 = (androidx.constraintlayout.widget.Guideline) r9
            if (r9 == 0) goto L_0x0091
            int r0 = p366bk.C10322k.gdStart
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r10 = r1
            androidx.constraintlayout.widget.Guideline r10 = (androidx.constraintlayout.widget.Guideline) r10
            if (r10 == 0) goto L_0x0091
            int r0 = p366bk.C10322k.f28913yq
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r11 = r1
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            if (r11 == 0) goto L_0x0091
            int r0 = p366bk.C10322k.f28774Ns
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            if (r1 == 0) goto L_0x0091
            p90.z7 r12 = p90.C27486z7.m85250a(r1)
            int r0 = p366bk.C10322k.retryBtnContainer
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r13 = r1
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            if (r13 == 0) goto L_0x0091
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            if (r1 == 0) goto L_0x0091
            p90.c8 r14 = p90.C27272c8.m84388a(r1)
            p90.t r15 = new p90.t
            r0 = r15
            r1 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r15
        L_0x0091:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27424t.m85006a(android.view.View):p90.t");
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69804d;
    }
}

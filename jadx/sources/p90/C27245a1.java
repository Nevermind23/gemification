package p90;

import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.p975ui.components.BogProgressBar;
import p341ge.bog.mobilebank.p975ui.components.BogSwipeRefreshLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;

/* renamed from: p90.a1 */
public final class C27245a1 implements C6201a {

    /* renamed from: d */
    private final CoordinatorLayout f68267d;

    /* renamed from: e */
    public final CardView f68268e;

    /* renamed from: f */
    public final BogProgressBar f68269f;

    /* renamed from: g */
    public final BogTextView f68270g;

    /* renamed from: h */
    public final SwitchCompat f68271h;

    /* renamed from: i */
    public final FrameLayout f68272i;

    /* renamed from: j */
    public final BogTextView f68273j;

    /* renamed from: k */
    public final ConstraintLayout f68274k;

    /* renamed from: l */
    public final Group f68275l;

    /* renamed from: m */
    public final ImageView f68276m;

    /* renamed from: n */
    public final BogTextView f68277n;

    /* renamed from: o */
    public final BogButton f68278o;

    /* renamed from: p */
    public final Button f68279p;

    /* renamed from: q */
    public final RecyclerView f68280q;

    /* renamed from: r */
    public final C27486z7 f68281r;

    /* renamed from: s */
    public final FrameLayout f68282s;

    /* renamed from: t */
    public final CoordinatorLayout f68283t;

    /* renamed from: u */
    public final BogSwipeRefreshLayout f68284u;

    /* renamed from: v */
    public final C27272c8 f68285v;

    private C27245a1(CoordinatorLayout coordinatorLayout, CardView cardView, BogProgressBar bogProgressBar, BogTextView bogTextView, SwitchCompat switchCompat, FrameLayout frameLayout, BogTextView bogTextView2, ConstraintLayout constraintLayout, Group group, ImageView imageView, BogTextView bogTextView3, BogButton bogButton, Button button, RecyclerView recyclerView, C27486z7 z7Var, FrameLayout frameLayout2, CoordinatorLayout coordinatorLayout2, BogSwipeRefreshLayout bogSwipeRefreshLayout, C27272c8 c8Var) {
        this.f68267d = coordinatorLayout;
        this.f68268e = cardView;
        this.f68269f = bogProgressBar;
        this.f68270g = bogTextView;
        this.f68271h = switchCompat;
        this.f68272i = frameLayout;
        this.f68273j = bogTextView2;
        this.f68274k = constraintLayout;
        this.f68275l = group;
        this.f68276m = imageView;
        this.f68277n = bogTextView3;
        this.f68278o = bogButton;
        this.f68279p = button;
        this.f68280q = recyclerView;
        this.f68281r = z7Var;
        this.f68282s = frameLayout2;
        this.f68283t = coordinatorLayout2;
        this.f68284u = bogSwipeRefreshLayout;
        this.f68285v = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        r1 = p366bk.C10322k.f28774Ns;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bb, code lost:
        r1 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27245a1 m84285a(android.view.View r23) {
        /*
            r0 = r23
            int r1 = p366bk.C10322k.buttonContainer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            androidx.cardview.widget.CardView r5 = (androidx.cardview.widget.CardView) r5
            if (r5 == 0) goto L_0x00d0
            int r1 = p366bk.C10322k.buttonProgressBar
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.mobilebank.ui.components.BogProgressBar r6 = (p341ge.bog.mobilebank.p975ui.components.BogProgressBar) r6
            if (r6 == 0) goto L_0x00d0
            int r1 = p366bk.C10322k.credit_info_agreement_description_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r7 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r7
            if (r7 == 0) goto L_0x00d0
            int r1 = p366bk.C10322k.credit_info_agreement_switch
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            androidx.appcompat.widget.SwitchCompat r8 = (androidx.appcompat.widget.SwitchCompat) r8
            if (r8 == 0) goto L_0x00d0
            int r1 = p366bk.C10322k.credit_info_agreement_switch_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            if (r9 == 0) goto L_0x00d0
            int r1 = p366bk.C10322k.credit_info_agreement_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r10 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r10
            if (r10 == 0) goto L_0x00d0
            int r1 = p366bk.C10322k.cri_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            if (r11 == 0) goto L_0x00d0
            int r1 = p366bk.C10322k.emptyStateGroup
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            androidx.constraintlayout.widget.Group r12 = (androidx.constraintlayout.widget.Group) r12
            if (r12 == 0) goto L_0x00d0
            int r1 = p366bk.C10322k.emptyStateImage
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            if (r13 == 0) goto L_0x00d0
            int r1 = p366bk.C10322k.emptyStateText
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r14 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r14
            if (r14 == 0) goto L_0x00d0
            int r1 = p366bk.C10322k.historyBtn
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.mobilebank.ui.views.widgets.BogButton r15 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogButton) r15
            if (r15 == 0) goto L_0x00d0
            int r1 = p366bk.C10322k.newApplication
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.buttons.Button r16 = (p341ge.bog.designsystem.components.buttons.Button) r16
            if (r16 == 0) goto L_0x00d0
            int r1 = p366bk.C10322k.f28709Ar
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            androidx.recyclerview.widget.RecyclerView r17 = (androidx.recyclerview.widget.RecyclerView) r17
            if (r17 == 0) goto L_0x00d0
            int r1 = p366bk.C10322k.f28774Ns
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00d0
            p90.z7 r18 = p90.C27486z7.m85250a(r2)
            int r1 = p366bk.C10322k.retryBtnContainer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            android.widget.FrameLayout r19 = (android.widget.FrameLayout) r19
            if (r19 == 0) goto L_0x00d0
            r20 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r20 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r20
            int r1 = p366bk.C10322k.swipeToRefresh
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.mobilebank.ui.components.BogSwipeRefreshLayout r21 = (p341ge.bog.mobilebank.p975ui.components.BogSwipeRefreshLayout) r21
            if (r21 == 0) goto L_0x00d0
            int r1 = p366bk.C10322k.f28730Ex
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00d0
            p90.c8 r22 = p90.C27272c8.m84388a(r2)
            p90.a1 r0 = new p90.a1
            r3 = r0
            r4 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        L_0x00d0:
            android.content.res.Resources r0 = r23.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27245a1.m84285a(android.view.View):p90.a1");
    }

    /* renamed from: c */
    public CoordinatorLayout mo3946b() {
        return this.f68267d;
    }
}

package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p411em.C12489f;
import p90.C27272c8;

/* renamed from: jm.k */
public final class C16232k implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f45892d;

    /* renamed from: e */
    public final Button f45893e;

    /* renamed from: f */
    public final C16225e0 f45894f;

    /* renamed from: g */
    public final C16225e0 f45895g;

    /* renamed from: h */
    public final FrameLayout f45896h;

    /* renamed from: i */
    public final PageState f45897i;

    /* renamed from: j */
    public final C27272c8 f45898j;

    private C16232k(ConstraintLayout constraintLayout, Button button, C16225e0 e0Var, C16225e0 e0Var2, FrameLayout frameLayout, PageState pageState, C27272c8 c8Var) {
        this.f45892d = constraintLayout;
        this.f45893e = button;
        this.f45894f = e0Var;
        this.f45895g = e0Var2;
        this.f45896h = frameLayout;
        this.f45897i = pageState;
        this.f45898j = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r0 = p411em.C12488e.f37198d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = p411em.C12488e.card_details;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p481jm.C16232k m57859a(android.view.View r10) {
        /*
            int r0 = p411em.C12488e.f37200f
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x004f
            int r0 = p411em.C12488e.card_details
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            if (r1 == 0) goto L_0x004f
            jm.e0 r5 = p481jm.C16225e0.m57828a(r1)
            int r0 = p411em.C12488e.delivery_details
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            if (r1 == 0) goto L_0x004f
            jm.e0 r6 = p481jm.C16225e0.m57828a(r1)
            int r0 = p411em.C12488e.f37203g1
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r7 = r1
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            if (r7 == 0) goto L_0x004f
            int r0 = p411em.C12488e.state
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            ge.bog.designsystem.components.pagestate.PageState r8 = (p341ge.bog.designsystem.components.pagestate.PageState) r8
            if (r8 == 0) goto L_0x004f
            int r0 = p411em.C12488e.f37198d2
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            if (r1 == 0) goto L_0x004f
            p90.c8 r9 = p90.C27272c8.m84388a(r1)
            jm.k r0 = new jm.k
            r3 = r10
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x004f:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p481jm.C16232k.m57859a(android.view.View):jm.k");
    }

    /* renamed from: d */
    public static C16232k m57860d(LayoutInflater layoutInflater) {
        return m57861e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C16232k m57861e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.activity_order_card_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57859a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f45892d;
    }
}

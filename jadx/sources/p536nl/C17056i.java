package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p480jl.C16214e;
import p90.C27272c8;

/* renamed from: nl.i */
public final class C17056i implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f47633d;

    /* renamed from: e */
    public final Button f47634e;

    /* renamed from: f */
    public final LayerView f47635f;

    /* renamed from: g */
    public final TextView f47636g;

    /* renamed from: h */
    public final NotificationBadgeView f47637h;

    /* renamed from: i */
    public final TextView f47638i;

    /* renamed from: j */
    public final NotificationBadgeView f47639j;

    /* renamed from: k */
    public final PageDescriptionView f47640k;

    /* renamed from: l */
    public final C27272c8 f47641l;

    private C17056i(ConstraintLayout constraintLayout, Button button, LayerView layerView, TextView textView, NotificationBadgeView notificationBadgeView, TextView textView2, NotificationBadgeView notificationBadgeView2, PageDescriptionView pageDescriptionView, C27272c8 c8Var) {
        this.f47633d = constraintLayout;
        this.f47634e = button;
        this.f47635f = layerView;
        this.f47636g = textView;
        this.f47637h = notificationBadgeView;
        this.f47638i = textView2;
        this.f47639j = notificationBadgeView2;
        this.f47640k = pageDescriptionView;
        this.f47641l = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r0 = p480jl.C16213d.f45723D0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p536nl.C17056i m59929a(android.view.View r12) {
        /*
            int r0 = p480jl.C16213d.f45755s
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x0063
            int r0 = p480jl.C16213d.f45720B
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r5 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r5 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r5
            if (r5 == 0) goto L_0x0063
            int r0 = p480jl.C16213d.f45729I
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0063
            int r0 = p480jl.C16213d.f45730J
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r7 = r1
            ge.bog.designsystem.components.notificationbadges.NotificationBadgeView r7 = (p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView) r7
            if (r7 == 0) goto L_0x0063
            int r0 = p480jl.C16213d.f45731K
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0063
            int r0 = p480jl.C16213d.f45732L
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r9 = r1
            ge.bog.designsystem.components.notificationbadges.NotificationBadgeView r9 = (p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView) r9
            if (r9 == 0) goto L_0x0063
            int r0 = p480jl.C16213d.f45742d0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r10 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r10 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r10
            if (r10 == 0) goto L_0x0063
            int r0 = p480jl.C16213d.f45723D0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            if (r1 == 0) goto L_0x0063
            p90.c8 r11 = p90.C27272c8.m84388a(r1)
            nl.i r0 = new nl.i
            r3 = r12
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0063:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p536nl.C17056i.m59929a(android.view.View):nl.i");
    }

    /* renamed from: d */
    public static C17056i m59930d(LayoutInflater layoutInflater) {
        return m59931e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17056i m59931e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.activity_bnpl_welcome, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59929a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f47633d;
    }
}

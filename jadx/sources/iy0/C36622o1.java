package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;

/* renamed from: iy0.o1 */
public final class C36622o1 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88342d;

    /* renamed from: e */
    public final NotificationBadgeView f88343e;

    /* renamed from: f */
    public final ListItem f88344f;

    /* renamed from: g */
    public final View f88345g;

    /* renamed from: h */
    public final Barrier f88346h;

    /* renamed from: i */
    public final AppCompatTextView f88347i;

    /* renamed from: j */
    public final LayerView f88348j;

    /* renamed from: k */
    public final Group f88349k;

    /* renamed from: l */
    public final LinearLayoutCompat f88350l;

    /* renamed from: m */
    public final AppCompatTextView f88351m;

    /* renamed from: n */
    public final SingleLineTextItem f88352n;

    /* renamed from: o */
    public final TwoLineReverseTextItem f88353o;

    /* renamed from: p */
    public final C36625p1 f88354p;

    /* renamed from: q */
    public final C36625p1 f88355q;

    /* renamed from: r */
    public final FrameLayout f88356r;

    /* renamed from: s */
    public final Barrier f88357s;

    private C36622o1(ConstraintLayout constraintLayout, NotificationBadgeView notificationBadgeView, ListItem listItem, View view, Barrier barrier, AppCompatTextView appCompatTextView, LayerView layerView, Group group, LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView2, SingleLineTextItem singleLineTextItem, TwoLineReverseTextItem twoLineReverseTextItem, C36625p1 p1Var, C36625p1 p1Var2, FrameLayout frameLayout, Barrier barrier2) {
        this.f88342d = constraintLayout;
        this.f88343e = notificationBadgeView;
        this.f88344f = listItem;
        this.f88345g = view;
        this.f88346h = barrier;
        this.f88347i = appCompatTextView;
        this.f88348j = layerView;
        this.f88349k = group;
        this.f88350l = linearLayoutCompat;
        this.f88351m = appCompatTextView2;
        this.f88352n = singleLineTextItem;
        this.f88353o = twoLineReverseTextItem;
        this.f88354p = p1Var;
        this.f88355q = p1Var2;
        this.f88356r = frameLayout;
        this.f88357s = barrier2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r1 = hy0.C36271e.online_payments_limit;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r1 = hy0.C36271e.f87516f0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static iy0.C36622o1 m108622a(android.view.View r20) {
        /*
            r0 = r20
            int r1 = hy0.C36271e.checked_badge
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.notificationbadges.NotificationBadgeView r5 = (p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView) r5
            if (r5 == 0) goto L_0x00b2
            int r1 = hy0.C36271e.f87511d0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.list.ListItem r6 = (p341ge.bog.designsystem.components.list.ListItem) r6
            if (r6 == 0) goto L_0x00b2
            int r1 = hy0.C36271e.f87516f0
            android.view.View r7 = p086g1.C6202b.m24689a(r0, r1)
            if (r7 == 0) goto L_0x00b2
            int r1 = hy0.C36271e.f87524j0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            androidx.constraintlayout.widget.Barrier r8 = (androidx.constraintlayout.widget.Barrier) r8
            if (r8 == 0) goto L_0x00b2
            int r1 = hy0.C36271e.insurance_amount_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
            if (r9 == 0) goto L_0x00b2
            int r1 = hy0.C36271e.insurance_details_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r10 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r10
            if (r10 == 0) goto L_0x00b2
            int r1 = hy0.C36271e.insurance_details_group
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            androidx.constraintlayout.widget.Group r11 = (androidx.constraintlayout.widget.Group) r11
            if (r11 == 0) goto L_0x00b2
            int r1 = hy0.C36271e.insurance_fee_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            androidx.appcompat.widget.LinearLayoutCompat r12 = (androidx.appcompat.widget.LinearLayoutCompat) r12
            if (r12 == 0) goto L_0x00b2
            int r1 = hy0.C36271e.insurance_period_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.appcompat.widget.AppCompatTextView r13 = (androidx.appcompat.widget.AppCompatTextView) r13
            if (r13 == 0) goto L_0x00b2
            int r1 = hy0.C36271e.f87501V0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.list.SingleLineTextItem r14 = (p341ge.bog.designsystem.components.list.SingleLineTextItem) r14
            if (r14 == 0) goto L_0x00b2
            int r1 = hy0.C36271e.no_insurance_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.list.TwoLineReverseTextItem r15 = (p341ge.bog.designsystem.components.list.TwoLineReverseTextItem) r15
            if (r15 == 0) goto L_0x00b2
            int r1 = hy0.C36271e.online_payments_limit
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00b2
            iy0.p1 r16 = iy0.C36625p1.m108635a(r2)
            int r1 = hy0.C36271e.pos_limit
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00b2
            iy0.p1 r17 = iy0.C36625p1.m108635a(r2)
            int r1 = hy0.C36271e.stroke
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            android.widget.FrameLayout r18 = (android.widget.FrameLayout) r18
            if (r18 == 0) goto L_0x00b2
            int r1 = hy0.C36271e.f87553x2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            androidx.constraintlayout.widget.Barrier r19 = (androidx.constraintlayout.widget.Barrier) r19
            if (r19 == 0) goto L_0x00b2
            iy0.o1 r1 = new iy0.o1
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        L_0x00b2:
            android.content.res.Resources r0 = r20.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C36622o1.m108622a(android.view.View):iy0.o1");
    }

    /* renamed from: d */
    public static C36622o1 m108623d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_insurance_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108622a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88342d;
    }
}

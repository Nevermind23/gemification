package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.common.CropImageView;
import p341ge.bog.designsystem.components.creditcard.badge.CreditCardsBadgeView;
import p341ge.bog.designsystem.components.multipledots.HideableAmountView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p601sg.C17783h;

/* renamed from: ak.t4 */
public final class C10020t4 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27587d;

    /* renamed from: e */
    public final AppCompatTextView f27588e;

    /* renamed from: f */
    public final HideableAmountView f27589f;

    /* renamed from: g */
    public final NotificationBadgeView f27590g;

    /* renamed from: h */
    public final FrameLayout f27591h;

    /* renamed from: i */
    public final CropImageView f27592i;

    /* renamed from: j */
    public final View f27593j;

    /* renamed from: k */
    public final CreditCardsBadgeView f27594k;

    /* renamed from: l */
    public final AppCompatImageView f27595l;

    /* renamed from: m */
    public final View f27596m;

    /* renamed from: n */
    public final TextBadgeView f27597n;

    /* renamed from: o */
    public final TextView f27598o;

    private C10020t4(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, HideableAmountView hideableAmountView, NotificationBadgeView notificationBadgeView, FrameLayout frameLayout, CropImageView cropImageView, View view, CreditCardsBadgeView creditCardsBadgeView, AppCompatImageView appCompatImageView, View view2, TextBadgeView textBadgeView, TextView textView) {
        this.f27587d = constraintLayout;
        this.f27588e = appCompatTextView;
        this.f27589f = hideableAmountView;
        this.f27590g = notificationBadgeView;
        this.f27591h = frameLayout;
        this.f27592i = cropImageView;
        this.f27593j = view;
        this.f27594k = creditCardsBadgeView;
        this.f27595l = appCompatImageView;
        this.f27596m = view2;
        this.f27597n = textBadgeView;
        this.f27598o = textView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = p601sg.C17782g.colorOverlay;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r0 = p601sg.C17782g.overlay;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C10020t4 m36751a(android.view.View r15) {
        /*
            int r0 = p601sg.C17782g.f49676C
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r4 = r1
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            if (r4 == 0) goto L_0x007d
            int r0 = p601sg.C17782g.f49688H
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r5 = r1
            ge.bog.designsystem.components.multipledots.HideableAmountView r5 = (p341ge.bog.designsystem.components.multipledots.HideableAmountView) r5
            if (r5 == 0) goto L_0x007d
            int r0 = p601sg.C17782g.f49742X
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r6 = r1
            ge.bog.designsystem.components.notificationbadges.NotificationBadgeView r6 = (p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView) r6
            if (r6 == 0) goto L_0x007d
            int r0 = p601sg.C17782g.bottom_view_container
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r7 = r1
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            if (r7 == 0) goto L_0x007d
            int r0 = p601sg.C17782g.f49736W0
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r8 = r1
            ge.bog.designsystem.components.common.CropImageView r8 = (p341ge.bog.designsystem.components.common.CropImageView) r8
            if (r8 == 0) goto L_0x007d
            int r0 = p601sg.C17782g.colorOverlay
            android.view.View r9 = p086g1.C6202b.m24689a(r15, r0)
            if (r9 == 0) goto L_0x007d
            int r0 = p601sg.C17782g.credit_cards
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r10 = r1
            ge.bog.designsystem.components.creditcard.badge.CreditCardsBadgeView r10 = (p341ge.bog.designsystem.components.creditcard.badge.CreditCardsBadgeView) r10
            if (r10 == 0) goto L_0x007d
            int r0 = p601sg.C17782g.f49744Y3
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r11 = r1
            androidx.appcompat.widget.AppCompatImageView r11 = (androidx.appcompat.widget.AppCompatImageView) r11
            if (r11 == 0) goto L_0x007d
            int r0 = p601sg.C17782g.overlay
            android.view.View r12 = p086g1.C6202b.m24689a(r15, r0)
            if (r12 == 0) goto L_0x007d
            int r0 = p601sg.C17782g.spent_badge
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r13 = r1
            ge.bog.designsystem.components.textbadge.TextBadgeView r13 = (p341ge.bog.designsystem.components.textbadge.TextBadgeView) r13
            if (r13 == 0) goto L_0x007d
            int r0 = p601sg.C17782g.f49745Y8
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r14 = r1
            android.widget.TextView r14 = (android.widget.TextView) r14
            if (r14 == 0) goto L_0x007d
            ak.t4 r0 = new ak.t4
            r3 = r15
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x007d:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C10020t4.m36751a(android.view.View):ak.t4");
    }

    /* renamed from: d */
    public static C10020t4 m36752d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_product_cards_wide, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36751a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27587d;
    }
}

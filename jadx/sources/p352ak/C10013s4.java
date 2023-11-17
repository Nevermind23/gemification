package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.common.CropImageView;
import p341ge.bog.designsystem.components.creditcard.badge.CreditCardsBadgeView;
import p341ge.bog.designsystem.components.multipledots.HideableAmountView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p601sg.C17783h;

/* renamed from: ak.s4 */
public final class C10013s4 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27532d;

    /* renamed from: e */
    public final AppCompatTextView f27533e;

    /* renamed from: f */
    public final HideableAmountView f27534f;

    /* renamed from: g */
    public final NotificationBadgeView f27535g;

    /* renamed from: h */
    public final CropImageView f27536h;

    /* renamed from: i */
    public final View f27537i;

    /* renamed from: j */
    public final CreditCardsBadgeView f27538j;

    /* renamed from: k */
    public final AppCompatImageView f27539k;

    /* renamed from: l */
    public final View f27540l;

    /* renamed from: m */
    public final TextView f27541m;

    private C10013s4(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, HideableAmountView hideableAmountView, NotificationBadgeView notificationBadgeView, CropImageView cropImageView, View view, CreditCardsBadgeView creditCardsBadgeView, AppCompatImageView appCompatImageView, View view2, TextView textView) {
        this.f27532d = constraintLayout;
        this.f27533e = appCompatTextView;
        this.f27534f = hideableAmountView;
        this.f27535g = notificationBadgeView;
        this.f27536h = cropImageView;
        this.f27537i = view;
        this.f27538j = creditCardsBadgeView;
        this.f27539k = appCompatImageView;
        this.f27540l = view2;
        this.f27541m = textView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        r0 = p601sg.C17782g.overlay;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = p601sg.C17782g.colorOverlay;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C10013s4 m36725a(android.view.View r13) {
        /*
            int r0 = p601sg.C17782g.f49676C
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r4 = r1
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            if (r4 == 0) goto L_0x0067
            int r0 = p601sg.C17782g.f49688H
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r5 = r1
            ge.bog.designsystem.components.multipledots.HideableAmountView r5 = (p341ge.bog.designsystem.components.multipledots.HideableAmountView) r5
            if (r5 == 0) goto L_0x0067
            int r0 = p601sg.C17782g.f49742X
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r6 = r1
            ge.bog.designsystem.components.notificationbadges.NotificationBadgeView r6 = (p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView) r6
            if (r6 == 0) goto L_0x0067
            int r0 = p601sg.C17782g.f49736W0
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r7 = r1
            ge.bog.designsystem.components.common.CropImageView r7 = (p341ge.bog.designsystem.components.common.CropImageView) r7
            if (r7 == 0) goto L_0x0067
            int r0 = p601sg.C17782g.colorOverlay
            android.view.View r8 = p086g1.C6202b.m24689a(r13, r0)
            if (r8 == 0) goto L_0x0067
            int r0 = p601sg.C17782g.credit_cards
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r9 = r1
            ge.bog.designsystem.components.creditcard.badge.CreditCardsBadgeView r9 = (p341ge.bog.designsystem.components.creditcard.badge.CreditCardsBadgeView) r9
            if (r9 == 0) goto L_0x0067
            int r0 = p601sg.C17782g.f49744Y3
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r10 = r1
            androidx.appcompat.widget.AppCompatImageView r10 = (androidx.appcompat.widget.AppCompatImageView) r10
            if (r10 == 0) goto L_0x0067
            int r0 = p601sg.C17782g.overlay
            android.view.View r11 = p086g1.C6202b.m24689a(r13, r0)
            if (r11 == 0) goto L_0x0067
            int r0 = p601sg.C17782g.f49745Y8
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L_0x0067
            ak.s4 r0 = new ak.s4
            r3 = r13
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x0067:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C10013s4.m36725a(android.view.View):ak.s4");
    }

    /* renamed from: d */
    public static C10013s4 m36726d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_product_cards_square, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36725a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27532d;
    }
}

package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p356ao.C10115g;

/* renamed from: eo.i0 */
public final class C12749i0 implements C6201a {

    /* renamed from: d */
    private final ListItem f37750d;

    /* renamed from: e */
    public final NotificationBadgeView f37751e;

    /* renamed from: f */
    public final ImageView f37752f;

    /* renamed from: g */
    public final TextView f37753g;

    /* renamed from: h */
    public final View f37754h;

    /* renamed from: i */
    public final ImageView f37755i;

    /* renamed from: j */
    public final TextView f37756j;

    private C12749i0(ListItem listItem, NotificationBadgeView notificationBadgeView, ImageView imageView, TextView textView, View view, ImageView imageView2, TextView textView2) {
        this.f37750d = listItem;
        this.f37751e = notificationBadgeView;
        this.f37752f = imageView;
        this.f37753g = textView;
        this.f37754h = view;
        this.f37755i = imageView2;
        this.f37756j = textView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = p356ao.C10114f.f27944Y;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p413eo.C12749i0 m48390a(android.view.View r10) {
        /*
            int r0 = p356ao.C10114f.f27971s
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            ge.bog.designsystem.components.notificationbadges.NotificationBadgeView r4 = (p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView) r4
            if (r4 == 0) goto L_0x0049
            int r0 = p356ao.C10114f.benefit_icon
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L_0x0049
            int r0 = p356ao.C10114f.f27938S
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0049
            int r0 = p356ao.C10114f.f27944Y
            android.view.View r7 = p086g1.C6202b.m24689a(r10, r0)
            if (r7 == 0) goto L_0x0049
            int r0 = p356ao.C10114f.end_icon
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r8 == 0) goto L_0x0049
            int r0 = p356ao.C10114f.f27923B0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x0049
            eo.i0 r0 = new eo.i0
            r3 = r10
            ge.bog.designsystem.components.list.ListItem r3 = (p341ge.bog.designsystem.components.list.ListItem) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0049:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p413eo.C12749i0.m48390a(android.view.View):eo.i0");
    }

    /* renamed from: d */
    public static C12749i0 m48391d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_benefit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48390a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f37750d;
    }
}

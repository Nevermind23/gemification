package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.toggle.ToggleView;
import rs0.C38337d;

/* renamed from: vs0.l */
public final class C39453l implements C6201a {

    /* renamed from: d */
    private final NestedScrollView f93802d;

    /* renamed from: e */
    public final RecyclerView f93803e;

    /* renamed from: f */
    public final ListItem f93804f;

    /* renamed from: g */
    public final View f93805g;

    /* renamed from: h */
    public final InlineFeedback f93806h;

    /* renamed from: i */
    public final ListItem f93807i;

    /* renamed from: j */
    public final AppCompatTextView f93808j;

    /* renamed from: k */
    public final Button f93809k;

    /* renamed from: l */
    public final EmptyWidget f93810l;

    /* renamed from: m */
    public final AppCompatImageView f93811m;

    /* renamed from: n */
    public final ListItem f93812n;

    /* renamed from: o */
    public final TwoLineTextItem f93813o;

    /* renamed from: p */
    public final AppCompatImageView f93814p;

    /* renamed from: q */
    public final TwoLineTextItem f93815q;

    /* renamed from: r */
    public final ToggleView f93816r;

    /* renamed from: s */
    public final EmptyWidget f93817s;

    /* renamed from: t */
    public final TwoLineTextItem f93818t;

    /* renamed from: u */
    public final ListItem f93819u;

    private C39453l(NestedScrollView nestedScrollView, RecyclerView recyclerView, ListItem listItem, View view, InlineFeedback inlineFeedback, ListItem listItem2, AppCompatTextView appCompatTextView, Button button, EmptyWidget emptyWidget, AppCompatImageView appCompatImageView, ListItem listItem3, TwoLineTextItem twoLineTextItem, AppCompatImageView appCompatImageView2, TwoLineTextItem twoLineTextItem2, ToggleView toggleView, EmptyWidget emptyWidget2, TwoLineTextItem twoLineTextItem3, ListItem listItem4) {
        this.f93802d = nestedScrollView;
        this.f93803e = recyclerView;
        this.f93804f = listItem;
        this.f93805g = view;
        this.f93806h = inlineFeedback;
        this.f93807i = listItem2;
        this.f93808j = appCompatTextView;
        this.f93809k = button;
        this.f93810l = emptyWidget;
        this.f93811m = appCompatImageView;
        this.f93812n = listItem3;
        this.f93813o = twoLineTextItem;
        this.f93814p = appCompatImageView2;
        this.f93815q = twoLineTextItem2;
        this.f93816r = toggleView;
        this.f93817s = emptyWidget2;
        this.f93818t = twoLineTextItem3;
        this.f93819u = listItem4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r1 = rs0.C38336c.active_state_divider;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static vs0.C39453l m114667a(android.view.View r22) {
        /*
            r0 = r22
            int r1 = rs0.C38336c.f91870e
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.active_state_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.list.ListItem r6 = (p341ge.bog.designsystem.components.list.ListItem) r6
            if (r6 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.active_state_divider
            android.view.View r7 = p086g1.C6202b.m24689a(r0, r1)
            if (r7 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.active_state_feedback
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r8 = (p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback) r8
            if (r8 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.close_piggy_bank_item
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.list.ListItem r9 = (p341ge.bog.designsystem.components.list.ListItem) r9
            if (r9 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.close_piggy_bank_label
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            androidx.appcompat.widget.AppCompatTextView r10 = (androidx.appcompat.widget.AppCompatTextView) r10
            if (r10 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.edit_accounts_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.buttons.Button r11 = (p341ge.bog.designsystem.components.buttons.Button) r11
            if (r11 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.linked_accounts_header
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r12 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r12
            if (r12 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.piggy_bank_account_chevron
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.appcompat.widget.AppCompatImageView r13 = (androidx.appcompat.widget.AppCompatImageView) r13
            if (r13 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.piggy_bank_account_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.list.ListItem r14 = (p341ge.bog.designsystem.components.list.ListItem) r14
            if (r14 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.piggy_bank_account_label
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r15 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r15
            if (r15 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.piggy_bank_active_state_icon
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            androidx.appcompat.widget.AppCompatImageView r16 = (androidx.appcompat.widget.AppCompatImageView) r16
            if (r16 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.piggy_bank_active_state_label
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r17 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r17
            if (r17 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.piggy_bank_active_state_toggle
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            ge.bog.designsystem.components.toggle.ToggleView r18 = (p341ge.bog.designsystem.components.toggle.ToggleView) r18
            if (r18 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.piggy_bank_management_label
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r19 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r19
            if (r19 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.piggy_bank_transfer_amount_label
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.designsystem.components.list.TwoLineTextItem r20 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r20
            if (r20 == 0) goto L_0x00ca
            int r1 = rs0.C38336c.f91903z1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.designsystem.components.list.ListItem r21 = (p341ge.bog.designsystem.components.list.ListItem) r21
            if (r21 == 0) goto L_0x00ca
            vs0.l r1 = new vs0.l
            r3 = r1
            r4 = r0
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
        L_0x00ca:
            android.content.res.Resources r0 = r22.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vs0.C39453l.m114667a(android.view.View):vs0.l");
    }

    /* renamed from: d */
    public static C39453l m114668d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.fragment_piggy_bank_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114667a(inflate);
    }

    /* renamed from: c */
    public NestedScrollView mo3946b() {
        return this.f93802d;
    }
}

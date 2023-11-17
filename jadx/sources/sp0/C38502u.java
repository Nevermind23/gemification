package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import np0.C37440f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.list.ListItem;

/* renamed from: sp0.u */
public final class C38502u implements C6201a {

    /* renamed from: d */
    private final LinearLayout f92285d;

    /* renamed from: e */
    public final CheckboxView f92286e;

    /* renamed from: f */
    public final View f92287f;

    /* renamed from: g */
    public final TextView f92288g;

    /* renamed from: h */
    public final ListItem f92289h;

    /* renamed from: i */
    public final TextView f92290i;

    /* renamed from: j */
    public final TextView f92291j;

    private C38502u(LinearLayout linearLayout, CheckboxView checkboxView, View view, TextView textView, ListItem listItem, TextView textView2, TextView textView3) {
        this.f92285d = linearLayout;
        this.f92286e = checkboxView;
        this.f92287f = view;
        this.f92288g = textView;
        this.f92289h = listItem;
        this.f92290i = textView2;
        this.f92291j = textView3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = np0.C37439e.f89978C;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sp0.C38502u m113022a(android.view.View r10) {
        /*
            int r0 = np0.C37439e.f90009o
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            ge.bog.designsystem.components.checkbox.CheckboxView r4 = (p341ge.bog.designsystem.components.checkbox.CheckboxView) r4
            if (r4 == 0) goto L_0x0049
            int r0 = np0.C37439e.f89978C
            android.view.View r5 = p086g1.C6202b.m24689a(r10, r0)
            if (r5 == 0) goto L_0x0049
            int r0 = np0.C37439e.life_insurance_tv
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0049
            int r0 = np0.C37439e.f90004h0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r7 = r1
            ge.bog.designsystem.components.list.ListItem r7 = (p341ge.bog.designsystem.components.list.ListItem) r7
            if (r7 == 0) goto L_0x0049
            int r0 = np0.C37439e.name_tv
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0049
            int r0 = np0.C37439e.payment_insurance_tv
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x0049
            sp0.u r0 = new sp0.u
            r3 = r10
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
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
        throw new UnsupportedOperationException("Method not decompiled: sp0.C38502u.m113022a(android.view.View):sp0.u");
    }

    /* renamed from: d */
    public static C38502u m113023d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.item_loan_insurance_provider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m113022a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f92285d;
    }
}

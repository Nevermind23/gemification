package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import ba1.C10217v;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ua1.k */
public final class C28654k implements C6201a {

    /* renamed from: d */
    private final ScrollView f72784d;

    /* renamed from: e */
    public final Button f72785e;

    /* renamed from: f */
    public final CheckboxView f72786f;

    /* renamed from: g */
    public final PageDescriptionView f72787g;

    /* renamed from: h */
    public final View f72788h;

    /* renamed from: i */
    public final ButtonListView f72789i;

    private C28654k(ScrollView scrollView, Button button, CheckboxView checkboxView, PageDescriptionView pageDescriptionView, View view, ButtonListView buttonListView) {
        this.f72784d = scrollView;
        this.f72785e = button;
        this.f72786f = checkboxView;
        this.f72787g = pageDescriptionView;
        this.f72788h = view;
        this.f72789i = buttonListView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = ba1.C10216u.f28296F2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ua1.C28654k m87722a(android.view.View r9) {
        /*
            int r0 = ba1.C10216u.activation_button
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x003e
            int r0 = ba1.C10216u.activation_checkbox
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            ge.bog.designsystem.components.checkbox.CheckboxView r5 = (p341ge.bog.designsystem.components.checkbox.CheckboxView) r5
            if (r5 == 0) goto L_0x003e
            int r0 = ba1.C10216u.f28293C1
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r6 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r6 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r6
            if (r6 == 0) goto L_0x003e
            int r0 = ba1.C10216u.f28296F2
            android.view.View r7 = p086g1.C6202b.m24689a(r9, r0)
            if (r7 == 0) goto L_0x003e
            int r0 = ba1.C10216u.statement_category_view
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r8 = r1
            ge.bog.designsystem.components.buttonlist.ButtonListView r8 = (p341ge.bog.designsystem.components.buttonlist.ButtonListView) r8
            if (r8 == 0) goto L_0x003e
            ua1.k r0 = new ua1.k
            r3 = r9
            android.widget.ScrollView r3 = (android.widget.ScrollView) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x003e:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ua1.C28654k.m87722a(android.view.View):ua1.k");
    }

    /* renamed from: d */
    public static C28654k m87723d(LayoutInflater layoutInflater) {
        return m87724e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28654k m87724e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_activate_channel_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87722a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f72784d;
    }
}

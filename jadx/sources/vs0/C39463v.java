package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import rs0.C38337d;

/* renamed from: vs0.v */
public final class C39463v implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f93852d;

    /* renamed from: e */
    public final RecyclerView f93853e;

    /* renamed from: f */
    public final Button f93854f;

    /* renamed from: g */
    public final PageDescriptionView f93855g;

    /* renamed from: h */
    public final View f93856h;

    private C39463v(ConstraintLayout constraintLayout, RecyclerView recyclerView, Button button, PageDescriptionView pageDescriptionView, View view) {
        this.f93852d = constraintLayout;
        this.f93853e = recyclerView;
        this.f93854f = button;
        this.f93855g = pageDescriptionView;
        this.f93856h = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = rs0.C38336c.f91857L;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static vs0.C39463v m114707a(android.view.View r8) {
        /*
            int r0 = rs0.C38336c.f91870e
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            if (r4 == 0) goto L_0x0033
            int r0 = rs0.C38336c.f91902z
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r5 = r1
            ge.bog.designsystem.components.buttons.Button r5 = (p341ge.bog.designsystem.components.buttons.Button) r5
            if (r5 == 0) goto L_0x0033
            int r0 = rs0.C38336c.f91854G
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r6 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r6 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r6
            if (r6 == 0) goto L_0x0033
            int r0 = rs0.C38336c.f91857L
            android.view.View r7 = p086g1.C6202b.m24689a(r8, r0)
            if (r7 == 0) goto L_0x0033
            vs0.v r0 = new vs0.v
            r3 = r8
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0033:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vs0.C39463v.m114707a(android.view.View):vs0.v");
    }

    /* renamed from: d */
    public static C39463v m114708d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.layout_piggy_bank_account_action_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114707a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f93852d;
    }
}

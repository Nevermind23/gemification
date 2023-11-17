package b31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import x11.C39772e;

/* renamed from: b31.d */
public final class C31115d implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f77327d;

    /* renamed from: e */
    public final CheckboxView f77328e;

    /* renamed from: f */
    public final View f77329f;

    private C31115d(ConstraintLayout constraintLayout, CheckboxView checkboxView, View view) {
        this.f77327d = constraintLayout;
        this.f77328e = checkboxView;
        this.f77329f = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = x11.C39771d.f94471g;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b31.C31115d m92578a(android.view.View r3) {
        /*
            int r0 = x11.C39771d.f94468d
            android.view.View r1 = p086g1.C6202b.m24689a(r3, r0)
            ge.bog.designsystem.components.checkbox.CheckboxView r1 = (p341ge.bog.designsystem.components.checkbox.CheckboxView) r1
            if (r1 == 0) goto L_0x001a
            int r0 = x11.C39771d.f94471g
            android.view.View r2 = p086g1.C6202b.m24689a(r3, r0)
            if (r2 == 0) goto L_0x001a
            b31.d r0 = new b31.d
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r0.<init>(r3, r1, r2)
            return r0
        L_0x001a:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b31.C31115d.m92578a(android.view.View):b31.d");
    }

    /* renamed from: d */
    public static C31115d m92579d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39772e.action_sheet_chooser_default_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92578a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f77327d;
    }
}

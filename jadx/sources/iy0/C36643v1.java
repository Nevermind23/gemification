package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;

/* renamed from: iy0.v1 */
public final class C36643v1 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88443d;

    /* renamed from: e */
    public final TwoLineTextItem f88444e;

    /* renamed from: f */
    public final View f88445f;

    private C36643v1(ConstraintLayout constraintLayout, TwoLineTextItem twoLineTextItem, View view) {
        this.f88443d = constraintLayout;
        this.f88444e = twoLineTextItem;
        this.f88445f = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = hy0.C36271e.f87521h2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static iy0.C36643v1 m108707a(android.view.View r3) {
        /*
            int r0 = hy0.C36271e.account_text
            android.view.View r1 = p086g1.C6202b.m24689a(r3, r0)
            ge.bog.designsystem.components.list.TwoLineTextItem r1 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r1
            if (r1 == 0) goto L_0x001a
            int r0 = hy0.C36271e.f87521h2
            android.view.View r2 = p086g1.C6202b.m24689a(r3, r0)
            if (r2 == 0) goto L_0x001a
            iy0.v1 r0 = new iy0.v1
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
        throw new UnsupportedOperationException("Method not decompiled: iy0.C36643v1.m108707a(android.view.View):iy0.v1");
    }

    /* renamed from: d */
    public static C36643v1 m108708d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_selectable_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108707a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88443d;
    }
}

package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p356ao.C10115g;

/* renamed from: eo.r0 */
public final class C12767r0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f37840d;

    /* renamed from: e */
    public final LinearLayout f37841e;

    /* renamed from: f */
    public final TwoLineTextItem f37842f;

    /* renamed from: g */
    public final View f37843g;

    /* renamed from: h */
    public final EmptyWidget f37844h;

    private C12767r0(LinearLayout linearLayout, LinearLayout linearLayout2, TwoLineTextItem twoLineTextItem, View view, EmptyWidget emptyWidget) {
        this.f37840d = linearLayout;
        this.f37841e = linearLayout2;
        this.f37842f = twoLineTextItem;
        this.f37843g = view;
        this.f37844h = emptyWidget;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = p356ao.C10114f.f27944Y;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p413eo.C12767r0 m48466a(android.view.View r6) {
        /*
            r2 = r6
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            int r0 = p356ao.C10114f.details_component
            android.view.View r1 = p086g1.C6202b.m24689a(r6, r0)
            r3 = r1
            ge.bog.designsystem.components.list.TwoLineTextItem r3 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r3
            if (r3 == 0) goto L_0x0029
            int r0 = p356ao.C10114f.f27944Y
            android.view.View r4 = p086g1.C6202b.m24689a(r6, r0)
            if (r4 == 0) goto L_0x0029
            int r0 = p356ao.C10114f.f27968q1
            android.view.View r1 = p086g1.C6202b.m24689a(r6, r0)
            r5 = r1
            ge.bog.designsystem.components.emptywidget.EmptyWidget r5 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r5
            if (r5 == 0) goto L_0x0029
            eo.r0 r6 = new eo.r0
            r0 = r6
            r1 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x0029:
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r6 = r6.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p413eo.C12767r0.m48466a(android.view.View):eo.r0");
    }

    /* renamed from: d */
    public static C12767r0 m48467d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_result_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48466a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f37840d;
    }
}

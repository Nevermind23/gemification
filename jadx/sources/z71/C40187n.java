package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import y71.C40031e;

/* renamed from: z71.n */
public final class C40187n implements C6201a {

    /* renamed from: d */
    private final LinearLayout f95547d;

    /* renamed from: e */
    public final ImageView f95548e;

    /* renamed from: f */
    public final SingleLineTextItem f95549f;

    /* renamed from: g */
    public final View f95550g;

    private C40187n(LinearLayout linearLayout, ImageView imageView, SingleLineTextItem singleLineTextItem, View view) {
        this.f95547d = linearLayout;
        this.f95548e = imageView;
        this.f95549f = singleLineTextItem;
        this.f95550g = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = y71.C40030d.f95118w;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static z71.C40187n m116455a(android.view.View r4) {
        /*
            int r0 = y71.C40030d.call_btn
            android.view.View r1 = p086g1.C6202b.m24689a(r4, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto L_0x0024
            int r0 = y71.C40030d.f95111p
            android.view.View r2 = p086g1.C6202b.m24689a(r4, r0)
            ge.bog.designsystem.components.list.SingleLineTextItem r2 = (p341ge.bog.designsystem.components.list.SingleLineTextItem) r2
            if (r2 == 0) goto L_0x0024
            int r0 = y71.C40030d.f95118w
            android.view.View r3 = p086g1.C6202b.m24689a(r4, r0)
            if (r3 == 0) goto L_0x0024
            z71.n r0 = new z71.n
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.<init>(r4, r1, r2, r3)
            return r0
        L_0x0024:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z71.C40187n.m116455a(android.view.View):z71.n");
    }

    /* renamed from: d */
    public static C40187n m116456d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.item_insurance_details_contact, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116455a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f95547d;
    }
}

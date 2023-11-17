package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p601sg.C17783h;

/* renamed from: ak.u0 */
public final class C10023u0 implements C6201a {

    /* renamed from: d */
    private final View f27603d;

    /* renamed from: e */
    public final TextView f27604e;

    /* renamed from: f */
    public final ConstraintLayout f27605f;

    /* renamed from: g */
    public final View f27606g;

    private C10023u0(View view, TextView textView, ConstraintLayout constraintLayout, View view2) {
        this.f27603d = view;
        this.f27604e = textView;
        this.f27605f = constraintLayout;
        this.f27606g = view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = p601sg.C17782g.click_catcher;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C10023u0 m36762a(android.view.View r4) {
        /*
            int r0 = p601sg.C17782g.amount_badge_big_sign_text
            android.view.View r1 = p086g1.C6202b.m24689a(r4, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0022
            int r0 = p601sg.C17782g.amount_badge_container
            android.view.View r2 = p086g1.C6202b.m24689a(r4, r0)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            if (r2 == 0) goto L_0x0022
            int r0 = p601sg.C17782g.click_catcher
            android.view.View r3 = p086g1.C6202b.m24689a(r4, r0)
            if (r3 == 0) goto L_0x0022
            ak.u0 r0 = new ak.u0
            r0.<init>(r4, r1, r2, r3)
            return r0
        L_0x0022:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C10023u0.m36762a(android.view.View):ak.u0");
    }

    /* renamed from: c */
    public static C10023u0 m36763c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_amount_sign_badge_big, viewGroup);
            return m36762a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27603d;
    }
}

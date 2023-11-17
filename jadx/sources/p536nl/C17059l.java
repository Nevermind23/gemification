package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p480jl.C16214e;

/* renamed from: nl.l */
public final class C17059l implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f47651d;

    /* renamed from: e */
    public final ImageView f47652e;

    /* renamed from: f */
    public final View f47653f;

    /* renamed from: g */
    public final TextView f47654g;

    private C17059l(ConstraintLayout constraintLayout, ImageView imageView, View view, TextView textView) {
        this.f47651d = constraintLayout;
        this.f47652e = imageView;
        this.f47653f = view;
        this.f47654g = textView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = p480jl.C16213d.f45756s0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p536nl.C17059l m59942a(android.view.View r4) {
        /*
            int r0 = p480jl.C16213d.f45726F
            android.view.View r1 = p086g1.C6202b.m24689a(r4, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto L_0x0024
            int r0 = p480jl.C16213d.f45756s0
            android.view.View r2 = p086g1.C6202b.m24689a(r4, r0)
            if (r2 == 0) goto L_0x0024
            int r0 = p480jl.C16213d.shop_name
            android.view.View r3 = p086g1.C6202b.m24689a(r4, r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x0024
            nl.l r0 = new nl.l
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
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
        throw new UnsupportedOperationException("Method not decompiled: p536nl.C17059l.m59942a(android.view.View):nl.l");
    }

    /* renamed from: d */
    public static C17059l m59943d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.item_bnpl_offer_shop, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59942a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f47651d;
    }
}

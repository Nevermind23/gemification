package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import p086g1.C6201a;
import p366bk.C10324m;

/* renamed from: p90.u2 */
public final class C27436u2 implements C6201a {

    /* renamed from: d */
    private final CardView f69910d;

    /* renamed from: e */
    public final AppCompatTextView f69911e;

    /* renamed from: f */
    public final ImageView f69912f;

    /* renamed from: g */
    public final AppCompatTextView f69913g;

    /* renamed from: h */
    public final View f69914h;

    /* renamed from: i */
    public final AppCompatTextView f69915i;

    private C27436u2(CardView cardView, AppCompatTextView appCompatTextView, ImageView imageView, AppCompatTextView appCompatTextView2, View view, AppCompatTextView appCompatTextView3) {
        this.f69910d = cardView;
        this.f69911e = appCompatTextView;
        this.f69912f = imageView;
        this.f69913g = appCompatTextView2;
        this.f69914h = view;
        this.f69915i = appCompatTextView3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = p366bk.C10322k.selectorView;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27436u2 m85052a(android.view.View r9) {
        /*
            int r0 = p366bk.C10322k.f28871n1
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            if (r4 == 0) goto L_0x003e
            int r0 = p366bk.C10322k.f28767Lg
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L_0x003e
            int r0 = p366bk.C10322k.interest_accrued_text
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r6 = r1
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            if (r6 == 0) goto L_0x003e
            int r0 = p366bk.C10322k.selectorView
            android.view.View r7 = p086g1.C6202b.m24689a(r9, r0)
            if (r7 == 0) goto L_0x003e
            int r0 = p366bk.C10322k.f28721Dx
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r8 = r1
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            if (r8 == 0) goto L_0x003e
            p90.u2 r0 = new p90.u2
            r3 = r9
            androidx.cardview.widget.CardView r3 = (androidx.cardview.widget.CardView) r3
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
        throw new UnsupportedOperationException("Method not decompiled: p90.C27436u2.m85052a(android.view.View):p90.u2");
    }

    /* renamed from: d */
    public static C27436u2 m85053d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.deposit_wizard_banner_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85052a(inflate);
    }

    /* renamed from: c */
    public CardView mo3946b() {
        return this.f69910d;
    }
}

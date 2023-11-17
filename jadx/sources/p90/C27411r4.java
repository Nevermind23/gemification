package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p366bk.C10324m;

/* renamed from: p90.r4 */
public final class C27411r4 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69683d;

    /* renamed from: e */
    public final AppCompatTextView f69684e;

    /* renamed from: f */
    public final View f69685f;

    /* renamed from: g */
    public final AppCompatTextView f69686g;

    /* renamed from: h */
    public final ImageView f69687h;

    /* renamed from: i */
    public final AppCompatTextView f69688i;

    private C27411r4(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, View view, AppCompatTextView appCompatTextView2, ImageView imageView, AppCompatTextView appCompatTextView3) {
        this.f69683d = constraintLayout;
        this.f69684e = appCompatTextView;
        this.f69685f = view;
        this.f69686g = appCompatTextView2;
        this.f69687h = imageView;
        this.f69688i = appCompatTextView3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = p366bk.C10322k.home_upcoming_cell_underline;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27411r4 m84950a(android.view.View r9) {
        /*
            int r0 = p366bk.C10322k.home_upcoming_amount
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r4 = r1
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            if (r4 == 0) goto L_0x003e
            int r0 = p366bk.C10322k.home_upcoming_cell_underline
            android.view.View r5 = p086g1.C6202b.m24689a(r9, r0)
            if (r5 == 0) goto L_0x003e
            int r0 = p366bk.C10322k.home_upcoming_date
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r6 = r1
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            if (r6 == 0) goto L_0x003e
            int r0 = p366bk.C10322k.home_upcoming_icon
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L_0x003e
            int r0 = p366bk.C10322k.home_upcoming_title
            android.view.View r1 = p086g1.C6202b.m24689a(r9, r0)
            r8 = r1
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            if (r8 == 0) goto L_0x003e
            p90.r4 r0 = new p90.r4
            r3 = r9
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
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
        throw new UnsupportedOperationException("Method not decompiled: p90.C27411r4.m84950a(android.view.View):p90.r4");
    }

    /* renamed from: d */
    public static C27411r4 m84951d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.home_upcoming_payments_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84950a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69683d;
    }
}

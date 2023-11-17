package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;
import p086g1.C6201a;
import p366bk.C10324m;

/* renamed from: p90.u5 */
public final class C27439u5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69968d;

    /* renamed from: e */
    public final TextView f69969e;

    /* renamed from: f */
    public final ImageButton f69970f;

    /* renamed from: g */
    public final FrameLayout f69971g;

    /* renamed from: h */
    public final CircularProgressBar f69972h;

    /* renamed from: i */
    public final View f69973i;

    /* renamed from: j */
    public final TextView f69974j;

    /* renamed from: k */
    public final TextView f69975k;

    private C27439u5(ConstraintLayout constraintLayout, TextView textView, ImageButton imageButton, FrameLayout frameLayout, CircularProgressBar circularProgressBar, View view, TextView textView2, TextView textView3) {
        this.f69968d = constraintLayout;
        this.f69969e = textView;
        this.f69970f = imageButton;
        this.f69971g = frameLayout;
        this.f69972h = circularProgressBar;
        this.f69973i = view;
        this.f69974j = textView2;
        this.f69975k = textView3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = p366bk.C10322k.f28729Eu;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27439u5 m85066a(android.view.View r11) {
        /*
            int r0 = p366bk.C10322k.comment_text
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0054
            int r0 = p366bk.C10322k.menu_icon
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            android.widget.ImageButton r5 = (android.widget.ImageButton) r5
            if (r5 == 0) goto L_0x0054
            int r0 = p366bk.C10322k.f28752Iq
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            if (r6 == 0) goto L_0x0054
            int r0 = p366bk.C10322k.f28759Jq
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            com.mikhaellopez.circularprogressbar.CircularProgressBar r7 = (com.mikhaellopez.circularprogressbar.CircularProgressBar) r7
            if (r7 == 0) goto L_0x0054
            int r0 = p366bk.C10322k.f28729Eu
            android.view.View r8 = p086g1.C6202b.m24689a(r11, r0)
            if (r8 == 0) goto L_0x0054
            int r0 = p366bk.C10322k.total_received_amount_text
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x0054
            int r0 = p366bk.C10322k.total_requested_amount_text
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x0054
            p90.u5 r0 = new p90.u5
            r3 = r11
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0054:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27439u5.m85066a(android.view.View):p90.u5");
    }

    /* renamed from: d */
    public static C27439u5 m85067d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_money_request_details_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85066a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69968d;
    }
}

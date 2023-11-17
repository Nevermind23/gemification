package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p366bk.C10324m;

/* renamed from: p90.j2 */
public final class C27336j2 implements C6201a {

    /* renamed from: d */
    private final CardView f69040d;

    /* renamed from: e */
    public final ImageView f69041e;

    /* renamed from: f */
    public final TextView f69042f;

    /* renamed from: g */
    public final TextBadgeView f69043g;

    /* renamed from: h */
    public final AppCompatTextView f69044h;

    /* renamed from: i */
    public final Button f69045i;

    /* renamed from: j */
    public final Guideline f69046j;

    /* renamed from: k */
    public final Guideline f69047k;

    /* renamed from: l */
    public final Barrier f69048l;

    /* renamed from: m */
    public final AppCompatTextView f69049m;

    /* renamed from: n */
    public final AppCompatTextView f69050n;

    /* renamed from: o */
    public final AppCompatTextView f69051o;

    /* renamed from: p */
    public final AppCompatTextView f69052p;

    /* renamed from: q */
    public final View f69053q;

    /* renamed from: r */
    public final Guideline f69054r;

    private C27336j2(CardView cardView, ImageView imageView, TextView textView, TextBadgeView textBadgeView, AppCompatTextView appCompatTextView, Button button, Guideline guideline, Guideline guideline2, Barrier barrier, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, View view, Guideline guideline3) {
        this.f69040d = cardView;
        this.f69041e = imageView;
        this.f69042f = textView;
        this.f69043g = textBadgeView;
        this.f69044h = appCompatTextView;
        this.f69045i = button;
        this.f69046j = guideline;
        this.f69047k = guideline2;
        this.f69048l = barrier;
        this.f69049m = appCompatTextView2;
        this.f69050n = appCompatTextView3;
        this.f69051o = appCompatTextView4;
        this.f69052p = appCompatTextView5;
        this.f69053q = view;
        this.f69054r = guideline3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        r1 = p366bk.C10322k.f28729Eu;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27336j2 m84653a(android.view.View r19) {
        /*
            r0 = r19
            int r1 = p366bk.C10322k.application_image
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L_0x00a5
            int r1 = p366bk.C10322k.application_info
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x00a5
            int r1 = p366bk.C10322k.application_status
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.textbadge.TextBadgeView r7 = (p341ge.bog.designsystem.components.textbadge.TextBadgeView) r7
            if (r7 == 0) goto L_0x00a5
            int r1 = p366bk.C10322k.application_title_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            if (r8 == 0) goto L_0x00a5
            int r1 = p366bk.C10322k.cancel_card_order_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.designsystem.components.buttons.Button r9 = (p341ge.bog.designsystem.components.buttons.Button) r9
            if (r9 == 0) goto L_0x00a5
            int r1 = p366bk.C10322k.f28906w7
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            androidx.constraintlayout.widget.Guideline r10 = (androidx.constraintlayout.widget.Guideline) r10
            if (r10 == 0) goto L_0x00a5
            int r1 = p366bk.C10322k.f28750Ic
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            androidx.constraintlayout.widget.Guideline r11 = (androidx.constraintlayout.widget.Guideline) r11
            if (r11 == 0) goto L_0x00a5
            int r1 = p366bk.C10322k.icon_status_barrier
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            androidx.constraintlayout.widget.Barrier r12 = (androidx.constraintlayout.widget.Barrier) r12
            if (r12 == 0) goto L_0x00a5
            int r1 = p366bk.C10322k.left_info_block_header_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.appcompat.widget.AppCompatTextView r13 = (androidx.appcompat.widget.AppCompatTextView) r13
            if (r13 == 0) goto L_0x00a5
            int r1 = p366bk.C10322k.left_info_block_value_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            androidx.appcompat.widget.AppCompatTextView r14 = (androidx.appcompat.widget.AppCompatTextView) r14
            if (r14 == 0) goto L_0x00a5
            int r1 = p366bk.C10322k.right_info_block_header_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            androidx.appcompat.widget.AppCompatTextView r15 = (androidx.appcompat.widget.AppCompatTextView) r15
            if (r15 == 0) goto L_0x00a5
            int r1 = p366bk.C10322k.right_info_block_value_text
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            androidx.appcompat.widget.AppCompatTextView r16 = (androidx.appcompat.widget.AppCompatTextView) r16
            if (r16 == 0) goto L_0x00a5
            int r1 = p366bk.C10322k.f28729Eu
            android.view.View r17 = p086g1.C6202b.m24689a(r0, r1)
            if (r17 == 0) goto L_0x00a5
            int r1 = p366bk.C10322k.f28738Gv
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            androidx.constraintlayout.widget.Guideline r18 = (androidx.constraintlayout.widget.Guideline) r18
            if (r18 == 0) goto L_0x00a5
            p90.j2 r1 = new p90.j2
            r4 = r0
            androidx.cardview.widget.CardView r4 = (androidx.cardview.widget.CardView) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
        L_0x00a5:
            android.content.res.Resources r0 = r19.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27336j2.m84653a(android.view.View):p90.j2");
    }

    /* renamed from: d */
    public static C27336j2 m84654d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.applications_recycler_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84653a(inflate);
    }

    /* renamed from: c */
    public CardView mo3946b() {
        return this.f69040d;
    }
}

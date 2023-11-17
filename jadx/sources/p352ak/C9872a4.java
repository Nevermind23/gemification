package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p601sg.C17783h;

/* renamed from: ak.a4 */
public final class C9872a4 implements C6201a {

    /* renamed from: d */
    private final View f26761d;

    /* renamed from: e */
    public final Button f26762e;

    /* renamed from: f */
    public final TextView f26763f;

    /* renamed from: g */
    public final TextView f26764g;

    /* renamed from: h */
    public final View f26765h;

    /* renamed from: i */
    public final Button f26766i;

    /* renamed from: j */
    public final TextView f26767j;

    /* renamed from: k */
    public final AppCompatImageView f26768k;

    /* renamed from: l */
    public final LinearLayout f26769l;

    /* renamed from: m */
    public final TextView f26770m;

    /* renamed from: n */
    public final TextView f26771n;

    private C9872a4(View view, Button button, TextView textView, TextView textView2, View view2, Button button2, TextView textView3, AppCompatImageView appCompatImageView, LinearLayout linearLayout, TextView textView4, TextView textView5) {
        this.f26761d = view;
        this.f26762e = button;
        this.f26763f = textView;
        this.f26764g = textView2;
        this.f26765h = view2;
        this.f26766i = button2;
        this.f26767j = textView3;
        this.f26768k = appCompatImageView;
        this.f26769l = linearLayout;
        this.f26770m = textView4;
        this.f26771n = textView5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = p601sg.C17782g.f49699K2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C9872a4 m36210a(android.view.View r14) {
        /*
            int r0 = p601sg.C17782g.cancel_card_button
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x0073
            int r0 = p601sg.C17782g.f49674A2
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0073
            int r0 = p601sg.C17782g.desc_text_top
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0073
            int r0 = p601sg.C17782g.f49699K2
            android.view.View r7 = p086g1.C6202b.m24689a(r14, r0)
            if (r7 == 0) goto L_0x0073
            int r0 = p601sg.C17782g.edit_card_button
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r8 = r1
            ge.bog.designsystem.components.buttons.Button r8 = (p341ge.bog.designsystem.components.buttons.Button) r8
            if (r8 == 0) goto L_0x0073
            int r0 = p601sg.C17782g.f49715O3
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x0073
            int r0 = p601sg.C17782g.f49787r4
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r10 = r1
            androidx.appcompat.widget.AppCompatImageView r10 = (androidx.appcompat.widget.AppCompatImageView) r10
            if (r10 == 0) goto L_0x0073
            int r0 = p601sg.C17782g.f49690H4
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r11 = r1
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            if (r11 == 0) goto L_0x0073
            int r0 = p601sg.C17782g.info_desc_text
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L_0x0073
            int r0 = p601sg.C17782g.info_header_text
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r13 = r1
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L_0x0073
            ak.a4 r0 = new ak.a4
            r2 = r0
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0073:
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C9872a4.m36210a(android.view.View):ak.a4");
    }

    /* renamed from: c */
    public static C9872a4 m36211c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_medium_text_image_card, viewGroup);
            return m36210a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f26761d;
    }
}

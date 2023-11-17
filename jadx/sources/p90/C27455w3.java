package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p366bk.C10324m;

/* renamed from: p90.w3 */
public final class C27455w3 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f70161d;

    /* renamed from: e */
    public final Button f70162e;

    /* renamed from: f */
    public final ImageView f70163f;

    /* renamed from: g */
    public final TextView f70164g;

    /* renamed from: h */
    public final TextView f70165h;

    /* renamed from: i */
    public final TextView f70166i;

    /* renamed from: j */
    public final TextView f70167j;

    /* renamed from: k */
    public final TextView f70168k;

    /* renamed from: l */
    public final View f70169l;

    /* renamed from: m */
    public final Button f70170m;

    private C27455w3(ConstraintLayout constraintLayout, Button button, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view, Button button2) {
        this.f70161d = constraintLayout;
        this.f70162e = button;
        this.f70163f = imageView;
        this.f70164g = textView;
        this.f70165h = textView2;
        this.f70166i = textView3;
        this.f70167j = textView4;
        this.f70168k = textView5;
        this.f70169l = view;
        this.f70170m = button2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r0 = p366bk.C10322k.f28729Eu;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27455w3 m85127a(android.view.View r13) {
        /*
            int r0 = p366bk.C10322k.decline_button
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x006a
            int r0 = p366bk.C10322k.profile_picture_image
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L_0x006a
            int r0 = p366bk.C10322k.request_description_text
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x006a
            int r0 = p366bk.C10322k.request_nickname_text
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x006a
            int r0 = p366bk.C10322k.requested_amount_text
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x006a
            int r0 = p366bk.C10322k.requester_name_text
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x006a
            int r0 = p366bk.C10322k.requesting_label_text
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x006a
            int r0 = p366bk.C10322k.f28729Eu
            android.view.View r11 = p086g1.C6202b.m24689a(r13, r0)
            if (r11 == 0) goto L_0x006a
            int r0 = p366bk.C10322k.f28882py
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r12 = r1
            ge.bog.designsystem.components.buttons.Button r12 = (p341ge.bog.designsystem.components.buttons.Button) r12
            if (r12 == 0) goto L_0x006a
            p90.w3 r0 = new p90.w3
            r3 = r13
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x006a:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27455w3.m85127a(android.view.View):p90.w3");
    }

    /* renamed from: d */
    public static C27455w3 m85128d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_money_request_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85127a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f70161d;
    }
}

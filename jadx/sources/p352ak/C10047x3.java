package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p601sg.C17783h;

/* renamed from: ak.x3 */
public final class C10047x3 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27745d;

    /* renamed from: e */
    public final LinearLayout f27746e;

    /* renamed from: f */
    public final Button f27747f;

    /* renamed from: g */
    public final ImageView f27748g;

    /* renamed from: h */
    public final TextView f27749h;

    /* renamed from: i */
    public final TextView f27750i;

    /* renamed from: j */
    public final View f27751j;

    private C10047x3(ConstraintLayout constraintLayout, LinearLayout linearLayout, Button button, ImageView imageView, TextView textView, TextView textView2, View view) {
        this.f27745d = constraintLayout;
        this.f27746e = linearLayout;
        this.f27747f = button;
        this.f27748g = imageView;
        this.f27749h = textView;
        this.f27750i = textView2;
        this.f27751j = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = p601sg.C17782g.top_separator;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C10047x3 m36851a(android.view.View r10) {
        /*
            int r0 = p601sg.C17782g.f49731U1
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L_0x0049
            int r0 = p601sg.C17782g.list_section_header_button
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r5 = r1
            ge.bog.designsystem.components.buttons.Button r5 = (p341ge.bog.designsystem.components.buttons.Button) r5
            if (r5 == 0) goto L_0x0049
            int r0 = p601sg.C17782g.list_section_image
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L_0x0049
            int r0 = p601sg.C17782g.list_section_subtitle
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0049
            int r0 = p601sg.C17782g.list_section_title
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0049
            int r0 = p601sg.C17782g.top_separator
            android.view.View r9 = p086g1.C6202b.m24689a(r10, r0)
            if (r9 == 0) goto L_0x0049
            ak.x3 r0 = new ak.x3
            r3 = r10
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0049:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C10047x3.m36851a(android.view.View):ak.x3");
    }

    /* renamed from: d */
    public static C10047x3 m36852d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_list_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36851a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27745d;
    }
}

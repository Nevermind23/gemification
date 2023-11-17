package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p601sg.C17783h;

/* renamed from: ak.e5 */
public final class C9905e5 implements C6201a {

    /* renamed from: d */
    private final View f26953d;

    /* renamed from: e */
    public final RecyclerView f26954e;

    /* renamed from: f */
    public final ConstraintLayout f26955f;

    /* renamed from: g */
    public final LinearLayout f26956g;

    /* renamed from: h */
    public final ImageView f26957h;

    /* renamed from: i */
    public final FrameLayout f26958i;

    /* renamed from: j */
    public final InfoBadgeView f26959j;

    /* renamed from: k */
    public final PageState f26960k;

    /* renamed from: l */
    public final ButtonListView f26961l;

    /* renamed from: m */
    public final AppCompatTextView f26962m;

    /* renamed from: n */
    public final View f26963n;

    /* renamed from: o */
    public final AppCompatTextView f26964o;

    /* renamed from: p */
    public final Button f26965p;

    /* renamed from: q */
    public final AppCompatTextView f26966q;

    private C9905e5(View view, RecyclerView recyclerView, ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout, InfoBadgeView infoBadgeView, PageState pageState, ButtonListView buttonListView, AppCompatTextView appCompatTextView, View view2, AppCompatTextView appCompatTextView2, Button button, AppCompatTextView appCompatTextView3) {
        this.f26953d = view;
        this.f26954e = recyclerView;
        this.f26955f = constraintLayout;
        this.f26956g = linearLayout;
        this.f26957h = imageView;
        this.f26958i = frameLayout;
        this.f26959j = infoBadgeView;
        this.f26960k = pageState;
        this.f26961l = buttonListView;
        this.f26962m = appCompatTextView;
        this.f26963n = view2;
        this.f26964o = appCompatTextView2;
        this.f26965p = button;
        this.f26966q = appCompatTextView3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        r0 = p601sg.C17782g.template_header_divider;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C9905e5 m36331a(android.view.View r16) {
        /*
            r1 = r16
            int r0 = p601sg.C17782g.button_recycler
            android.view.View r2 = p086g1.C6202b.m24689a(r1, r0)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            if (r2 == 0) goto L_0x008b
            int r0 = p601sg.C17782g.f49731U1
            android.view.View r3 = p086g1.C6202b.m24689a(r1, r0)
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            if (r3 == 0) goto L_0x008b
            int r0 = p601sg.C17782g.icon_and_texts_layout
            android.view.View r4 = p086g1.C6202b.m24689a(r1, r0)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L_0x008b
            int r0 = p601sg.C17782g.f49766j4
            android.view.View r5 = p086g1.C6202b.m24689a(r1, r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L_0x008b
            int r0 = p601sg.C17782g.f49798u4
            android.view.View r6 = p086g1.C6202b.m24689a(r1, r0)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            if (r6 == 0) goto L_0x008b
            int r0 = p601sg.C17782g.f49678C4
            android.view.View r7 = p086g1.C6202b.m24689a(r1, r0)
            ge.bog.designsystem.components.infobadge.InfoBadgeView r7 = (p341ge.bog.designsystem.components.infobadge.InfoBadgeView) r7
            if (r7 == 0) goto L_0x008b
            int r0 = p601sg.C17782g.statement_header_page_state
            android.view.View r8 = p086g1.C6202b.m24689a(r1, r0)
            ge.bog.designsystem.components.pagestate.PageState r8 = (p341ge.bog.designsystem.components.pagestate.PageState) r8
            if (r8 == 0) goto L_0x008b
            int r0 = p601sg.C17782g.statement_header_view
            android.view.View r9 = p086g1.C6202b.m24689a(r1, r0)
            ge.bog.designsystem.components.buttonlist.ButtonListView r9 = (p341ge.bog.designsystem.components.buttonlist.ButtonListView) r9
            if (r9 == 0) goto L_0x008b
            int r0 = p601sg.C17782g.f49784q8
            android.view.View r10 = p086g1.C6202b.m24689a(r1, r0)
            androidx.appcompat.widget.AppCompatTextView r10 = (androidx.appcompat.widget.AppCompatTextView) r10
            if (r10 == 0) goto L_0x008b
            int r0 = p601sg.C17782g.template_header_divider
            android.view.View r11 = p086g1.C6202b.m24689a(r1, r0)
            if (r11 == 0) goto L_0x008b
            int r0 = p601sg.C17782g.f49816z8
            android.view.View r12 = p086g1.C6202b.m24689a(r1, r0)
            androidx.appcompat.widget.AppCompatTextView r12 = (androidx.appcompat.widget.AppCompatTextView) r12
            if (r12 == 0) goto L_0x008b
            int r0 = p601sg.C17782g.textButton
            android.view.View r13 = p086g1.C6202b.m24689a(r1, r0)
            ge.bog.designsystem.components.buttons.Button r13 = (p341ge.bog.designsystem.components.buttons.Button) r13
            if (r13 == 0) goto L_0x008b
            int r0 = p601sg.C17782g.f49751c9
            android.view.View r14 = p086g1.C6202b.m24689a(r1, r0)
            androidx.appcompat.widget.AppCompatTextView r14 = (androidx.appcompat.widget.AppCompatTextView) r14
            if (r14 == 0) goto L_0x008b
            ak.e5 r15 = new ak.e5
            r0 = r15
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r15
        L_0x008b:
            android.content.res.Resources r1 = r16.getResources()
            java.lang.String r0 = r1.getResourceName(r0)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C9905e5.m36331a(android.view.View):ak.e5");
    }

    /* renamed from: c */
    public static C9905e5 m36332c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_statement_header, viewGroup);
            return m36331a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f26953d;
    }
}

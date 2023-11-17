package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p90.C27272c8;
import p90.C27486z7;
import u70.C28607c;

/* renamed from: h80.l */
public final class C24905l implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f64005d;

    /* renamed from: e */
    public final PageDescriptionView f64006e;

    /* renamed from: f */
    public final PageDescriptionView f64007f;

    /* renamed from: g */
    public final LinearLayout f64008g;

    /* renamed from: h */
    public final RecyclerView f64009h;

    /* renamed from: i */
    public final BogTextView f64010i;

    /* renamed from: j */
    public final Button f64011j;

    /* renamed from: k */
    public final FrameLayout f64012k;

    /* renamed from: l */
    public final C27486z7 f64013l;

    /* renamed from: m */
    public final CardView f64014m;

    /* renamed from: n */
    public final Button f64015n;

    /* renamed from: o */
    public final PageDescriptionView f64016o;

    /* renamed from: p */
    public final LinearLayout f64017p;

    /* renamed from: q */
    public final PageState f64018q;

    /* renamed from: r */
    public final C27272c8 f64019r;

    /* renamed from: s */
    public final FrameLayout f64020s;

    /* renamed from: t */
    public final Button f64021t;

    /* renamed from: u */
    public final BogTextView f64022u;

    /* renamed from: v */
    public final LinearLayout f64023v;

    private C24905l(ConstraintLayout constraintLayout, PageDescriptionView pageDescriptionView, PageDescriptionView pageDescriptionView2, LinearLayout linearLayout, RecyclerView recyclerView, BogTextView bogTextView, Button button, FrameLayout frameLayout, C27486z7 z7Var, CardView cardView, Button button2, PageDescriptionView pageDescriptionView3, LinearLayout linearLayout2, PageState pageState, C27272c8 c8Var, FrameLayout frameLayout2, Button button3, BogTextView bogTextView2, LinearLayout linearLayout3) {
        this.f64005d = constraintLayout;
        this.f64006e = pageDescriptionView;
        this.f64007f = pageDescriptionView2;
        this.f64008g = linearLayout;
        this.f64009h = recyclerView;
        this.f64010i = bogTextView;
        this.f64011j = button;
        this.f64012k = frameLayout;
        this.f64013l = z7Var;
        this.f64014m = cardView;
        this.f64015n = button2;
        this.f64016o = pageDescriptionView3;
        this.f64017p = linearLayout2;
        this.f64018q = pageState;
        this.f64019r = c8Var;
        this.f64020s = frameLayout2;
        this.f64021t = button3;
        this.f64022u = bogTextView2;
        this.f64023v = linearLayout3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        r1 = u70.C28606b.f72567A0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        r1 = u70.C28606b.f72587Q0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h80.C24905l m79603a(android.view.View r23) {
        /*
            r0 = r23
            int r1 = u70.C28606b.f72566A
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r5 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r5
            if (r5 == 0) goto L_0x00da
            int r1 = u70.C28606b.documents_empty_description
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r6 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r6
            if (r6 == 0) goto L_0x00da
            int r1 = u70.C28606b.documents_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            if (r7 == 0) goto L_0x00da
            int r1 = u70.C28606b.documents_recycler
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            if (r8 == 0) goto L_0x00da
            int r1 = u70.C28606b.files_size_error
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r9 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r9
            if (r9 == 0) goto L_0x00da
            int r1 = u70.C28606b.navigate_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.buttons.Button r10 = (p341ge.bog.designsystem.components.buttons.Button) r10
            if (r10 == 0) goto L_0x00da
            int r1 = u70.C28606b.f72609u0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            if (r11 == 0) goto L_0x00da
            int r1 = u70.C28606b.f72567A0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00da
            p90.z7 r12 = p90.C27486z7.m85250a(r2)
            int r1 = u70.C28606b.f72569B0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.cardview.widget.CardView r13 = (androidx.cardview.widget.CardView) r13
            if (r13 == 0) goto L_0x00da
            int r1 = u70.C28606b.f72578J0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            ge.bog.designsystem.components.buttons.Button r14 = (p341ge.bog.designsystem.components.buttons.Button) r14
            if (r14 == 0) goto L_0x00da
            int r1 = u70.C28606b.success_description
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r15 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r15
            if (r15 == 0) goto L_0x00da
            int r1 = u70.C28606b.f72579L0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            android.widget.LinearLayout r16 = (android.widget.LinearLayout) r16
            if (r16 == 0) goto L_0x00da
            int r1 = u70.C28606b.f72581M0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.designsystem.components.pagestate.PageState r17 = (p341ge.bog.designsystem.components.pagestate.PageState) r17
            if (r17 == 0) goto L_0x00da
            int r1 = u70.C28606b.f72587Q0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00da
            p90.c8 r18 = p90.C27272c8.m84388a(r2)
            int r1 = u70.C28606b.f72588R0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            android.widget.FrameLayout r19 = (android.widget.FrameLayout) r19
            if (r19 == 0) goto L_0x00da
            int r1 = u70.C28606b.f72589U0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            ge.bog.designsystem.components.buttons.Button r20 = (p341ge.bog.designsystem.components.buttons.Button) r20
            if (r20 == 0) goto L_0x00da
            int r1 = u70.C28606b.upload_date
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r21 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r21
            if (r21 == 0) goto L_0x00da
            int r1 = u70.C28606b.upload_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            android.widget.LinearLayout r22 = (android.widget.LinearLayout) r22
            if (r22 == 0) goto L_0x00da
            h80.l r1 = new h80.l
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r1
        L_0x00da:
            android.content.res.Resources r0 = r23.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h80.C24905l.m79603a(android.view.View):h80.l");
    }

    /* renamed from: d */
    public static C24905l m79604d(LayoutInflater layoutInflater) {
        return m79605e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C24905l m79605e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.activity_documents_upload, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79603a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f64005d;
    }
}

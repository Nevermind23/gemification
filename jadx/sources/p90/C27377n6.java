package p90;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogEditText;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.FlipImageViewContainer;

/* renamed from: p90.n6 */
public final class C27377n6 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f69382d;

    /* renamed from: e */
    public final LinearLayout f69383e;

    /* renamed from: f */
    public final View f69384f;

    /* renamed from: g */
    public final BogTextView f69385g;

    /* renamed from: h */
    public final FlipImageViewContainer f69386h;

    /* renamed from: i */
    public final LinearLayout f69387i;

    /* renamed from: j */
    public final BogTextView f69388j;

    /* renamed from: k */
    public final C27486z7 f69389k;

    /* renamed from: l */
    public final BogEditText f69390l;

    /* renamed from: m */
    public final BogTextView f69391m;

    /* renamed from: n */
    public final FrameLayout f69392n;

    /* renamed from: o */
    public final BogTextView f69393o;

    /* renamed from: p */
    public final BogTextView f69394p;

    /* renamed from: q */
    public final BogTextView f69395q;

    private C27377n6(FrameLayout frameLayout, LinearLayout linearLayout, View view, BogTextView bogTextView, FlipImageViewContainer flipImageViewContainer, LinearLayout linearLayout2, BogTextView bogTextView2, C27486z7 z7Var, BogEditText bogEditText, BogTextView bogTextView3, FrameLayout frameLayout2, BogTextView bogTextView4, BogTextView bogTextView5, BogTextView bogTextView6) {
        this.f69382d = frameLayout;
        this.f69383e = linearLayout;
        this.f69384f = view;
        this.f69385g = bogTextView;
        this.f69386h = flipImageViewContainer;
        this.f69387i = linearLayout2;
        this.f69388j = bogTextView2;
        this.f69389k = z7Var;
        this.f69390l = bogEditText;
        this.f69391m = bogTextView3;
        this.f69392n = frameLayout2;
        this.f69393o = bogTextView4;
        this.f69394p = bogTextView5;
        this.f69395q = bogTextView6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r1 = p366bk.C10322k.retry_get_debt;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = p366bk.C10322k.blur_view;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27377n6 m84815a(android.view.View r18) {
        /*
            r0 = r18
            int r1 = p366bk.C10322k.amount_wrapper
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x0091
            int r1 = p366bk.C10322k.blur_view
            android.view.View r6 = p086g1.C6202b.m24689a(r0, r1)
            if (r6 == 0) goto L_0x0091
            int r1 = p366bk.C10322k.error_tv
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r7 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r7
            if (r7 == 0) goto L_0x0091
            int r1 = p366bk.C10322k.flipper
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.mobilebank.ui.views.widgets.FlipImageViewContainer r8 = (p341ge.bog.mobilebank.p975ui.views.widgets.FlipImageViewContainer) r8
            if (r8 == 0) goto L_0x0091
            int r1 = p366bk.C10322k.item_to_click
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            if (r9 == 0) goto L_0x0091
            int r1 = p366bk.C10322k.non_editable_tv
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r10 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r10
            if (r10 == 0) goto L_0x0091
            int r1 = p366bk.C10322k.retry_get_debt
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x0091
            p90.z7 r11 = p90.C27486z7.m85250a(r2)
            int r1 = p366bk.C10322k.template_amount_et
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.mobilebank.ui.views.widgets.BogEditText r12 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogEditText) r12
            if (r12 == 0) goto L_0x0091
            int r1 = p366bk.C10322k.template_amount_text_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r13
            if (r13 == 0) goto L_0x0091
            r14 = r0
            android.widget.FrameLayout r14 = (android.widget.FrameLayout) r14
            int r1 = p366bk.C10322k.template_item_bottom_desc
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r15 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r15
            if (r15 == 0) goto L_0x0091
            int r1 = p366bk.C10322k.template_item_mid_desc
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r16 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r16
            if (r16 == 0) goto L_0x0091
            int r1 = p366bk.C10322k.template_item_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r17 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r17
            if (r17 == 0) goto L_0x0091
            p90.n6 r0 = new p90.n6
            r3 = r0
            r4 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        L_0x0091:
            android.content.res.Resources r0 = r18.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27377n6.m84815a(android.view.View):p90.n6");
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f69382d;
    }
}

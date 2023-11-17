package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.controllers.PaymentHeaderView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p366bk.C10324m;

/* renamed from: p90.h1 */
public final class C27315h1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68854d;

    /* renamed from: e */
    public final C27486z7 f68855e;

    /* renamed from: f */
    public final FrameLayout f68856f;

    /* renamed from: g */
    public final AppCompatButton f68857g;

    /* renamed from: h */
    public final FrameLayout f68858h;

    /* renamed from: i */
    public final BogTextView f68859i;

    /* renamed from: j */
    public final LinearLayout f68860j;

    /* renamed from: k */
    public final C27364m2 f68861k;

    /* renamed from: l */
    public final C27251a7 f68862l;

    /* renamed from: m */
    public final NestedScrollView f68863m;

    /* renamed from: n */
    public final LinearLayout f68864n;

    /* renamed from: o */
    public final C27468x7 f68865o;

    /* renamed from: p */
    public final RelativeLayout f68866p;

    /* renamed from: q */
    public final LinearLayout f68867q;

    /* renamed from: r */
    public final C27477y7 f68868r;

    /* renamed from: s */
    public final RecyclerView f68869s;

    /* renamed from: t */
    public final C27427t2 f68870t;

    /* renamed from: u */
    public final PaymentHeaderView f68871u;

    /* renamed from: v */
    public final TextTypeView f68872v;

    /* renamed from: w */
    public final C27272c8 f68873w;

    private C27315h1(LinearLayout linearLayout, C27486z7 z7Var, FrameLayout frameLayout, AppCompatButton appCompatButton, FrameLayout frameLayout2, BogTextView bogTextView, LinearLayout linearLayout2, C27364m2 m2Var, C27251a7 a7Var, NestedScrollView nestedScrollView, LinearLayout linearLayout3, C27468x7 x7Var, RelativeLayout relativeLayout, LinearLayout linearLayout4, C27477y7 y7Var, RecyclerView recyclerView, C27427t2 t2Var, PaymentHeaderView paymentHeaderView, TextTypeView textTypeView, C27272c8 c8Var) {
        this.f68854d = linearLayout;
        this.f68855e = z7Var;
        this.f68856f = frameLayout;
        this.f68857g = appCompatButton;
        this.f68858h = frameLayout2;
        this.f68859i = bogTextView;
        this.f68860j = linearLayout2;
        this.f68861k = m2Var;
        this.f68862l = a7Var;
        this.f68863m = nestedScrollView;
        this.f68864n = linearLayout3;
        this.f68865o = x7Var;
        this.f68866p = relativeLayout;
        this.f68867q = linearLayout4;
        this.f68868r = y7Var;
        this.f68869s = recyclerView;
        this.f68870t = t2Var;
        this.f68871u = paymentHeaderView;
        this.f68872v = textTypeView;
        this.f68873w = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        r1 = p366bk.C10322k.f28784Qe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        r1 = p366bk.C10322k.payment_footer;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a7, code lost:
        r1 = p366bk.C10322k.payment_rv_header;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cb, code lost:
        r1 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27315h1 m84567a(android.view.View r24) {
        /*
            r0 = r24
            int r1 = p366bk.C10322k.btnRetryOpId
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00df
            p90.z7 r5 = p90.C27486z7.m85250a(r2)
            int r1 = p366bk.C10322k.btn_retry_op_id_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            if (r6 == 0) goto L_0x00df
            int r1 = p366bk.C10322k.dd_details_menu_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            androidx.appcompat.widget.AppCompatButton r7 = (androidx.appcompat.widget.AppCompatButton) r7
            if (r7 == 0) goto L_0x00df
            int r1 = p366bk.C10322k.dd_header_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            if (r8 == 0) goto L_0x00df
            int r1 = p366bk.C10322k.details_tv
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r9 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r9
            if (r9 == 0) goto L_0x00df
            int r1 = p366bk.C10322k.f28776Oc
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            if (r10 == 0) goto L_0x00df
            int r1 = p366bk.C10322k.f28784Qe
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00df
            p90.m2 r11 = p90.C27364m2.m84766a(r2)
            int r1 = p366bk.C10322k.horizontal_error_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00df
            p90.a7 r12 = p90.C27251a7.m84303a(r2)
            int r1 = p366bk.C10322k.f28809Yg
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.core.widget.NestedScrollView r13 = (androidx.core.widget.NestedScrollView) r13
            if (r13 == 0) goto L_0x00df
            r14 = r0
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            int r1 = p366bk.C10322k.payment_details_header
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00df
            p90.x7 r15 = p90.C27468x7.m85179a(r2)
            int r1 = p366bk.C10322k.payment_details_root
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            android.widget.RelativeLayout r16 = (android.widget.RelativeLayout) r16
            if (r16 == 0) goto L_0x00df
            int r1 = p366bk.C10322k.payment_dynamic_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            android.widget.LinearLayout r17 = (android.widget.LinearLayout) r17
            if (r17 == 0) goto L_0x00df
            int r1 = p366bk.C10322k.payment_footer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00df
            p90.y7 r18 = p90.C27477y7.m85215a(r2)
            int r1 = p366bk.C10322k.payment_rv
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            androidx.recyclerview.widget.RecyclerView r19 = (androidx.recyclerview.widget.RecyclerView) r19
            if (r19 == 0) goto L_0x00df
            int r1 = p366bk.C10322k.payment_rv_header
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00df
            p90.t2 r20 = p90.C27427t2.m85017a(r2)
            int r1 = p366bk.C10322k.template_header_view
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r21 = (p341ge.bog.mobilebank.p975ui.views.controllers.PaymentHeaderView) r21
            if (r21 == 0) goto L_0x00df
            int r1 = p366bk.C10322k.template_icon_tv
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r22 = r2
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r22 = (p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView) r22
            if (r22 == 0) goto L_0x00df
            int r1 = p366bk.C10322k.f28730Ex
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00df
            p90.c8 r23 = p90.C27272c8.m84388a(r2)
            p90.h1 r0 = new p90.h1
            r3 = r0
            r4 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        L_0x00df:
            android.content.res.Resources r0 = r24.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27315h1.m84567a(android.view.View):p90.h1");
    }

    /* renamed from: d */
    public static C27315h1 m84568d(LayoutInflater layoutInflater) {
        return m84569e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27315h1 m84569e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_payment_form_old, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84567a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68854d;
    }
}

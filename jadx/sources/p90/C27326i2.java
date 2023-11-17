package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.ErrorLoadingView;
import p366bk.C10324m;

/* renamed from: p90.i2 */
public final class C27326i2 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68946d;

    /* renamed from: e */
    public final BogTextView f68947e;

    /* renamed from: f */
    public final BogTextView f68948f;

    /* renamed from: g */
    public final LinearLayout f68949g;

    /* renamed from: h */
    public final BogTextView f68950h;

    /* renamed from: i */
    public final BogTextView f68951i;

    /* renamed from: j */
    public final RecyclerView f68952j;

    /* renamed from: k */
    public final C27332i8 f68953k;

    /* renamed from: l */
    public final LinearLayout f68954l;

    /* renamed from: m */
    public final ErrorLoadingView f68955m;

    /* renamed from: n */
    public final C27364m2 f68956n;

    /* renamed from: o */
    public final ImageView f68957o;

    /* renamed from: p */
    public final Button f68958p;

    /* renamed from: q */
    public final FrameLayout f68959q;

    /* renamed from: r */
    public final WebView f68960r;

    /* renamed from: s */
    public final C27486z7 f68961s;

    /* renamed from: t */
    public final FrameLayout f68962t;

    /* renamed from: u */
    public final TextView f68963u;

    private C27326i2(LinearLayout linearLayout, BogTextView bogTextView, BogTextView bogTextView2, LinearLayout linearLayout2, BogTextView bogTextView3, BogTextView bogTextView4, RecyclerView recyclerView, C27332i8 i8Var, LinearLayout linearLayout3, ErrorLoadingView errorLoadingView, C27364m2 m2Var, ImageView imageView, Button button, FrameLayout frameLayout, WebView webView, C27486z7 z7Var, FrameLayout frameLayout2, TextView textView) {
        this.f68946d = linearLayout;
        this.f68947e = bogTextView;
        this.f68948f = bogTextView2;
        this.f68949g = linearLayout2;
        this.f68950h = bogTextView3;
        this.f68951i = bogTextView4;
        this.f68952j = recyclerView;
        this.f68953k = i8Var;
        this.f68954l = linearLayout3;
        this.f68955m = errorLoadingView;
        this.f68956n = m2Var;
        this.f68957o = imageView;
        this.f68958p = button;
        this.f68959q = frameLayout;
        this.f68960r = webView;
        this.f68961s = z7Var;
        this.f68962t = frameLayout2;
        this.f68963u = textView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        r1 = p366bk.C10322k.close_button_layout;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        r1 = p366bk.C10322k.f28784Qe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a1, code lost:
        r1 = p366bk.C10322k.f28774Ns;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27326i2 m84611a(android.view.View r22) {
        /*
            r0 = r22
            int r1 = p366bk.C10322k.authorize_box_commission_tv
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r5 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r5
            if (r5 == 0) goto L_0x00cf
            int r1 = p366bk.C10322k.choose_payment_amount_tv
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r6 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r6
            if (r6 == 0) goto L_0x00cf
            int r1 = p366bk.C10322k.choose_payment_authorized_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            if (r7 == 0) goto L_0x00cf
            int r1 = p366bk.C10322k.choose_payment_commission_tv
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r8 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r8
            if (r8 == 0) goto L_0x00cf
            int r1 = p366bk.C10322k.choose_payment_method_label_tv
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r9 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r9
            if (r9 == 0) goto L_0x00cf
            int r1 = p366bk.C10322k.choose_payment_recyclerview
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            if (r10 == 0) goto L_0x00cf
            int r1 = p366bk.C10322k.close_button_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00cf
            p90.i8 r11 = p90.C27332i8.m84637a(r2)
            int r1 = p366bk.C10322k.dialog_base_authorize
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            if (r12 == 0) goto L_0x00cf
            int r1 = p366bk.C10322k.f28803Wc
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            ge.bog.mobilebank.ui.views.widgets.ErrorLoadingView r13 = (p341ge.bog.mobilebank.p975ui.views.widgets.ErrorLoadingView) r13
            if (r13 == 0) goto L_0x00cf
            int r1 = p366bk.C10322k.f28784Qe
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00cf
            p90.m2 r14 = p90.C27364m2.m84766a(r2)
            int r1 = p366bk.C10322k.imageView
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            if (r15 == 0) goto L_0x00cf
            int r1 = p366bk.C10322k.login_wizard_next_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.buttons.Button r16 = (p341ge.bog.designsystem.components.buttons.Button) r16
            if (r16 == 0) goto L_0x00cf
            int r1 = p366bk.C10322k.payment_option_progress_bar_layout
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            android.widget.FrameLayout r17 = (android.widget.FrameLayout) r17
            if (r17 == 0) goto L_0x00cf
            int r1 = p366bk.C10322k.payment_option_webview
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            android.webkit.WebView r18 = (android.webkit.WebView) r18
            if (r18 == 0) goto L_0x00cf
            int r1 = p366bk.C10322k.f28774Ns
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x00cf
            p90.z7 r19 = p90.C27486z7.m85250a(r2)
            int r1 = p366bk.C10322k.retry_btn_container
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r20 = r2
            android.widget.FrameLayout r20 = (android.widget.FrameLayout) r20
            if (r20 == 0) goto L_0x00cf
            int r1 = p366bk.C10322k.saved_commission
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            android.widget.TextView r21 = (android.widget.TextView) r21
            if (r21 == 0) goto L_0x00cf
            p90.i2 r1 = new p90.i2
            r3 = r1
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
        L_0x00cf:
            android.content.res.Resources r0 = r22.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27326i2.m84611a(android.view.View):p90.i2");
    }

    /* renamed from: d */
    public static C27326i2 m84612d(LayoutInflater layoutInflater) {
        return m84613e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27326i2 m84613e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_wizard_payment_option, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84611a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68946d;
    }
}

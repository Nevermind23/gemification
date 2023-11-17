package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.ErrorLoadingView;
import p366bk.C10324m;

/* renamed from: p90.s1 */
public final class C27417s1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69733d;

    /* renamed from: e */
    public final BogTextView f69734e;

    /* renamed from: f */
    public final BogTextView f69735f;

    /* renamed from: g */
    public final RecyclerView f69736g;

    /* renamed from: h */
    public final ErrorLoadingView f69737h;

    /* renamed from: i */
    public final BogButton f69738i;

    /* renamed from: j */
    public final FrameLayout f69739j;

    /* renamed from: k */
    public final C27332i8 f69740k;

    private C27417s1(LinearLayout linearLayout, BogTextView bogTextView, BogTextView bogTextView2, RecyclerView recyclerView, ErrorLoadingView errorLoadingView, BogButton bogButton, FrameLayout frameLayout, C27332i8 i8Var) {
        this.f69733d = linearLayout;
        this.f69734e = bogTextView;
        this.f69735f = bogTextView2;
        this.f69736g = recyclerView;
        this.f69737h = errorLoadingView;
        this.f69738i = bogButton;
        this.f69739j = frameLayout;
        this.f69740k = i8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = p366bk.C10322k.wizard_close_button;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27417s1 m84972a(android.view.View r11) {
        /*
            int r0 = p366bk.C10322k.choose_payment_amount_tv
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r4
            if (r4 == 0) goto L_0x0058
            int r0 = p366bk.C10322k.choose_payment_method_label_tv
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r5 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r5
            if (r5 == 0) goto L_0x0058
            int r0 = p366bk.C10322k.choose_payment_recyclerview
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x0058
            int r0 = p366bk.C10322k.f28803Wc
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            ge.bog.mobilebank.ui.views.widgets.ErrorLoadingView r7 = (p341ge.bog.mobilebank.p975ui.views.widgets.ErrorLoadingView) r7
            if (r7 == 0) goto L_0x0058
            int r0 = p366bk.C10322k.f28889ro
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            ge.bog.mobilebank.ui.views.widgets.BogButton r8 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogButton) r8
            if (r8 == 0) goto L_0x0058
            int r0 = p366bk.C10322k.payment_option_progress_bar_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            if (r9 == 0) goto L_0x0058
            int r0 = p366bk.C10322k.wizard_close_button
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x0058
            p90.i8 r10 = p90.C27332i8.m84637a(r1)
            p90.s1 r0 = new p90.s1
            r3 = r11
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0058:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27417s1.m84972a(android.view.View):p90.s1");
    }

    /* renamed from: d */
    public static C27417s1 m84973d(LayoutInflater layoutInflater) {
        return m84974e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27417s1 m84974e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_qr_pay_card_select, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84972a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69733d;
    }
}

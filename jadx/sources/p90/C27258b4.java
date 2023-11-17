package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10324m;

/* renamed from: p90.b4 */
public final class C27258b4 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f68378d;

    /* renamed from: e */
    public final BogTextView f68379e;

    /* renamed from: f */
    public final BogTextView f68380f;

    /* renamed from: g */
    public final FrameLayout f68381g;

    /* renamed from: h */
    public final RecyclerView f68382h;

    /* renamed from: i */
    public final LinearLayout f68383i;

    /* renamed from: j */
    public final RecyclerView f68384j;

    /* renamed from: k */
    public final LinearLayout f68385k;

    /* renamed from: l */
    public final BogTextView f68386l;

    /* renamed from: m */
    public final FrameLayout f68387m;

    /* renamed from: n */
    public final C27351k7 f68388n;

    private C27258b4(FrameLayout frameLayout, BogTextView bogTextView, BogTextView bogTextView2, FrameLayout frameLayout2, RecyclerView recyclerView, LinearLayout linearLayout, RecyclerView recyclerView2, LinearLayout linearLayout2, BogTextView bogTextView3, FrameLayout frameLayout3, C27351k7 k7Var) {
        this.f68378d = frameLayout;
        this.f68379e = bogTextView;
        this.f68380f = bogTextView2;
        this.f68381g = frameLayout2;
        this.f68382h = recyclerView;
        this.f68383i = linearLayout;
        this.f68384j = recyclerView2;
        this.f68385k = linearLayout2;
        this.f68386l = bogTextView3;
        this.f68387m = frameLayout3;
        this.f68388n = k7Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        r0 = p366bk.C10322k.wizard_text_input_layout;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27258b4 m84331a(android.view.View r14) {
        /*
            int r0 = p366bk.C10322k.payment_wizard_contacts_tv
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r4 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r4
            if (r4 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.payment_wizard_error_tv
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r5 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r5 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r5
            if (r5 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.payment_wizard_input_container
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r6 = r1
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            if (r6 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.payment_wizard_recycler
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r7 = r1
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            if (r7 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.payment_wizard_selector_container
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r8 = r1
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.payment_wizard_selector_recycler
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r9 = r1
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            if (r9 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.payment_wizard_selector_recycler_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r10 = r1
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            if (r10 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.payment_wizard_selector_title
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r11 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r11 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r11
            if (r11 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.payment_wizard_selector_title_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            r12 = r1
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            if (r12 == 0) goto L_0x0079
            int r0 = p366bk.C10322k.wizard_text_input_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r14, r0)
            if (r1 == 0) goto L_0x0079
            p90.k7 r13 = p90.C27351k7.m84712a(r1)
            p90.b4 r0 = new p90.b4
            r3 = r14
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0079:
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27258b4.m84331a(android.view.View):p90.b4");
    }

    /* renamed from: d */
    public static C27258b4 m84332d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_payment_wizard, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84331a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f68378d;
    }
}

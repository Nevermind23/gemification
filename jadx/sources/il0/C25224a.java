package il0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import el0.C20265c;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p90.C27272c8;

/* renamed from: il0.a */
public final class C25224a implements C6201a {

    /* renamed from: d */
    private final LinearLayout f64790d;

    /* renamed from: e */
    public final PageDescriptionView f64791e;

    /* renamed from: f */
    public final LinearLayout f64792f;

    /* renamed from: g */
    public final RecyclerView f64793g;

    /* renamed from: h */
    public final Button f64794h;

    /* renamed from: i */
    public final LoadingView f64795i;

    /* renamed from: j */
    public final StateView f64796j;

    /* renamed from: k */
    public final C27272c8 f64797k;

    private C25224a(LinearLayout linearLayout, PageDescriptionView pageDescriptionView, LinearLayout linearLayout2, RecyclerView recyclerView, Button button, LoadingView loadingView, StateView stateView, C27272c8 c8Var) {
        this.f64790d = linearLayout;
        this.f64791e = pageDescriptionView;
        this.f64792f = linearLayout2;
        this.f64793g = recyclerView;
        this.f64794h = button;
        this.f64795i = loadingView;
        this.f64796j = stateView;
        this.f64797k = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = el0.C20264b.f55169n;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static il0.C25224a m80292a(android.view.View r11) {
        /*
            int r0 = el0.C20264b.error_desc
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r4 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r4
            if (r4 == 0) goto L_0x0058
            int r0 = el0.C20264b.f55163d
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x0058
            int r0 = el0.C20264b.policies_recycler
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x0058
            int r0 = el0.C20264b.f55165j
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            ge.bog.designsystem.components.buttons.Button r7 = (p341ge.bog.designsystem.components.buttons.Button) r7
            if (r7 == 0) goto L_0x0058
            int r0 = el0.C20264b.f55166k
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            ge.bog.designsystem.components.loading.LoadingView r8 = (p341ge.bog.designsystem.components.loading.LoadingView) r8
            if (r8 == 0) goto L_0x0058
            int r0 = el0.C20264b.f55167l
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r9 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r9
            if (r9 == 0) goto L_0x0058
            int r0 = el0.C20264b.f55169n
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x0058
            p90.c8 r10 = p90.C27272c8.m84388a(r1)
            il0.a r0 = new il0.a
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
        throw new UnsupportedOperationException("Method not decompiled: il0.C25224a.m80292a(android.view.View):il0.a");
    }

    /* renamed from: d */
    public static C25224a m80293d(LayoutInflater layoutInflater) {
        return m80294e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C25224a m80294e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C20265c.activity_insurance_polices, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m80292a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f64790d;
    }
}

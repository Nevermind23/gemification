package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import bv0.C31205e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.p975ui.components.BogProgressBar;
import p90.C27272c8;

/* renamed from: ev0.c */
public final class C31819c implements C6201a {

    /* renamed from: d */
    private final LinearLayout f78461d;

    /* renamed from: e */
    public final WebView f78462e;

    /* renamed from: f */
    public final StateView f78463f;

    /* renamed from: g */
    public final LinearLayout f78464g;

    /* renamed from: h */
    public final PageDescriptionView f78465h;

    /* renamed from: i */
    public final BogProgressBar f78466i;

    /* renamed from: j */
    public final Button f78467j;

    /* renamed from: k */
    public final C27272c8 f78468k;

    private C31819c(LinearLayout linearLayout, WebView webView, StateView stateView, LinearLayout linearLayout2, PageDescriptionView pageDescriptionView, BogProgressBar bogProgressBar, Button button, C27272c8 c8Var) {
        this.f78461d = linearLayout;
        this.f78462e = webView;
        this.f78463f = stateView;
        this.f78464g = linearLayout2;
        this.f78465h = pageDescriptionView;
        this.f78466i = bogProgressBar;
        this.f78467j = button;
        this.f78468k = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = bv0.C31204d.f77530d0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ev0.C31819c m94061a(android.view.View r11) {
        /*
            int r0 = bv0.C31204d.authorization_web_view
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            android.webkit.WebView r4 = (android.webkit.WebView) r4
            if (r4 == 0) goto L_0x0058
            int r0 = bv0.C31204d.f77535r
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r5 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r5
            if (r5 == 0) goto L_0x0058
            int r0 = bv0.C31204d.f77536s
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L_0x0058
            int r0 = bv0.C31204d.error_page
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r7 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r7
            if (r7 == 0) goto L_0x0058
            int r0 = bv0.C31204d.f77517R
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            ge.bog.mobilebank.ui.components.BogProgressBar r8 = (p341ge.bog.mobilebank.p975ui.components.BogProgressBar) r8
            if (r8 == 0) goto L_0x0058
            int r0 = bv0.C31204d.f77519T
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            ge.bog.designsystem.components.buttons.Button r9 = (p341ge.bog.designsystem.components.buttons.Button) r9
            if (r9 == 0) goto L_0x0058
            int r0 = bv0.C31204d.f77530d0
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x0058
            p90.c8 r10 = p90.C27272c8.m84388a(r1)
            ev0.c r0 = new ev0.c
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
        throw new UnsupportedOperationException("Method not decompiled: ev0.C31819c.m94061a(android.view.View):ev0.c");
    }

    /* renamed from: d */
    public static C31819c m94062d(LayoutInflater layoutInflater) {
        return m94063e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C31819c m94063e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.activity_open_bank_authorization, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94061a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f78461d;
    }
}

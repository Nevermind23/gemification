package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p366bk.C10324m;

/* renamed from: p90.b1 */
public final class C27255b1 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f68363d;

    /* renamed from: e */
    public final Button f68364e;

    /* renamed from: f */
    public final PageDescriptionView f68365f;

    /* renamed from: g */
    public final C27272c8 f68366g;

    /* renamed from: h */
    public final WebView f68367h;

    private C27255b1(ConstraintLayout constraintLayout, Button button, PageDescriptionView pageDescriptionView, C27272c8 c8Var, WebView webView) {
        this.f68363d = constraintLayout;
        this.f68364e = button;
        this.f68365f = pageDescriptionView;
        this.f68366g = c8Var;
        this.f68367h = webView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27255b1 m84318a(android.view.View r8) {
        /*
            int r0 = p366bk.C10322k.f28778P4
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x0037
            int r0 = p366bk.C10322k.pageDescription
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r5 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r5 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r5
            if (r5 == 0) goto L_0x0037
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0037
            p90.c8 r6 = p90.C27272c8.m84388a(r1)
            int r0 = p366bk.C10322k.webView
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r7 = r1
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            if (r7 == 0) goto L_0x0037
            p90.b1 r0 = new p90.b1
            r3 = r8
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0037:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27255b1.m84318a(android.view.View):p90.b1");
    }

    /* renamed from: d */
    public static C27255b1 m84319d(LayoutInflater layoutInflater) {
        return m84320e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27255b1 m84320e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_open_banking_auth, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84318a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f68363d;
    }
}

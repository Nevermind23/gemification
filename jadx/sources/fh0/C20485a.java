package fh0;

import ah0.C19245a;
import ah0.C19246b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: fh0.a */
public final class C20485a implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f55475d;

    /* renamed from: e */
    public final StateView f55476e;

    /* renamed from: f */
    public final ConstraintLayout f55477f;

    /* renamed from: g */
    public final PageDescriptionView f55478g;

    /* renamed from: h */
    public final SwipeRefreshLayout f55479h;

    /* renamed from: i */
    public final WebView f55480i;

    /* renamed from: j */
    public final FrameLayout f55481j;

    /* renamed from: k */
    public final Button f55482k;

    private C20485a(ConstraintLayout constraintLayout, StateView stateView, ConstraintLayout constraintLayout2, PageDescriptionView pageDescriptionView, SwipeRefreshLayout swipeRefreshLayout, WebView webView, FrameLayout frameLayout, Button button) {
        this.f55475d = constraintLayout;
        this.f55476e = stateView;
        this.f55477f = constraintLayout2;
        this.f55478g = pageDescriptionView;
        this.f55479h = swipeRefreshLayout;
        this.f55480i = webView;
        this.f55481j = frameLayout;
        this.f55482k = button;
    }

    /* renamed from: a */
    public static C20485a m66690a(View view) {
        int i = C19245a.f53464a;
        StateView stateView = (StateView) C6202b.m24689a(view, i);
        if (stateView != null) {
            i = C19245a.f53465d;
            ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view, i);
            if (constraintLayout != null) {
                i = C19245a.f53466e;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView != null) {
                    i = C19245a.gamification_refresh;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C6202b.m24689a(view, i);
                    if (swipeRefreshLayout != null) {
                        i = C19245a.gamification_web_view;
                        WebView webView = (WebView) C6202b.m24689a(view, i);
                        if (webView != null) {
                            i = C19245a.f53467i;
                            FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                            if (frameLayout != null) {
                                i = C19245a.f53468l;
                                Button button = (Button) C6202b.m24689a(view, i);
                                if (button != null) {
                                    return new C20485a((ConstraintLayout) view, stateView, constraintLayout, pageDescriptionView, swipeRefreshLayout, webView, frameLayout, button);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C20485a m66691d(LayoutInflater layoutInflater) {
        return m66692e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C20485a m66692e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19246b.activity_gamification, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m66690a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f55475d;
    }
}

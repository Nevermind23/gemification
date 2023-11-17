package yv0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import uv0.C39106c;
import uv0.C39107d;

/* renamed from: yv0.e */
public final class C40080e implements C6201a {

    /* renamed from: d */
    private final LinearLayout f95281d;

    /* renamed from: e */
    public final LinearLayout f95282e;

    /* renamed from: f */
    public final WebView f95283f;

    private C40080e(LinearLayout linearLayout, LinearLayout linearLayout2, WebView webView) {
        this.f95281d = linearLayout;
        this.f95282e = linearLayout2;
        this.f95283f = webView;
    }

    /* renamed from: a */
    public static C40080e m116125a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C39106c.top_up_web_view;
        WebView webView = (WebView) C6202b.m24689a(view, i);
        if (webView != null) {
            return new C40080e(linearLayout, linearLayout, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C40080e m116126d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39107d.fragment_p2p_top_up_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116125a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f95281d;
    }
}

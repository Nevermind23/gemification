package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import p086g1.C6201a;
import p366bk.C10324m;

/* renamed from: p90.h2 */
public final class C27316h2 implements C6201a {

    /* renamed from: d */
    private final WebView f68874d;

    private C27316h2(WebView webView) {
        this.f68874d = webView;
    }

    /* renamed from: a */
    public static C27316h2 m84572a(View view) {
        if (view != null) {
            return new C27316h2((WebView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C27316h2 m84573d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_web_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84572a(inflate);
    }

    /* renamed from: c */
    public WebView mo3946b() {
        return this.f68874d;
    }
}

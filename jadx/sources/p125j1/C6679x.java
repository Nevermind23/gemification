package p125j1;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;
import p112i1.C6510e;

/* renamed from: j1.x */
public abstract class C6679x {
    @Deprecated
    /* renamed from: a */
    public static int m26110a(WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    /* renamed from: b */
    public static WebViewRenderProcess m26111b(WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    /* renamed from: c */
    public static WebViewRenderProcessClient m26112c(WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }

    @Deprecated
    /* renamed from: d */
    public static void m26113d(WebSettings webSettings, int i) {
        webSettings.setForceDark(i);
    }

    /* renamed from: e */
    public static void m26114e(WebView webView, C6510e eVar) {
        webView.setWebViewRenderProcessClient((WebViewRenderProcessClient) null);
    }

    /* renamed from: f */
    public static void m26115f(WebView webView, Executor executor, C6510e eVar) {
        webView.setWebViewRenderProcessClient(executor, (WebViewRenderProcessClient) null);
    }

    /* renamed from: g */
    public static boolean m26116g(WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }
}

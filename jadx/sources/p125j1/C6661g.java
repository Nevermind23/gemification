package p125j1;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: j1.g */
public abstract class C6661g {
    /* renamed from: a */
    public static PackageInfo m26082a() {
        return WebView.getCurrentWebViewPackage();
    }

    /* renamed from: b */
    public static boolean m26083b(WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    /* renamed from: c */
    public static WebChromeClient m26084c(WebView webView) {
        return webView.getWebChromeClient();
    }

    /* renamed from: d */
    public static WebViewClient m26085d(WebView webView) {
        return webView.getWebViewClient();
    }

    /* renamed from: e */
    public static void m26086e(WebSettings webSettings, boolean z) {
        webSettings.setSafeBrowsingEnabled(z);
    }
}

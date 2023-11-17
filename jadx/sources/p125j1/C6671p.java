package p125j1;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import p112i1.C6506a;

/* renamed from: j1.p */
public abstract class C6671p {
    /* renamed from: a */
    public static TracingController m26096a() {
        return TracingController.getInstance();
    }

    /* renamed from: b */
    public static ClassLoader m26097b() {
        return WebView.getWebViewClassLoader();
    }

    /* renamed from: c */
    public static Looper m26098c(WebView webView) {
        return webView.getWebViewLooper();
    }

    /* renamed from: d */
    public static boolean m26099d(TracingController tracingController) {
        return tracingController.isTracing();
    }

    /* renamed from: e */
    public static void m26100e(String str) {
        WebView.setDataDirectorySuffix(str);
    }

    /* renamed from: f */
    public static void m26101f(TracingController tracingController, C6506a aVar) {
        C6670o.m26095a();
        C6669n.m26094a();
        throw null;
    }

    /* renamed from: g */
    public static boolean m26102g(TracingController tracingController, OutputStream outputStream, Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}

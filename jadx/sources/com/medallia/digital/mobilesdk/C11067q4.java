package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.medallia.digital.mobilesdk.Broadcasts;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: com.medallia.digital.mobilesdk.q4 */
class C11067q4 extends WebViewClient {

    /* renamed from: a */
    private final C11013n2 f31823a;

    /* renamed from: b */
    private final boolean f31824b;

    /* renamed from: c */
    private final ArrayList<String> f31825c;

    C11067q4(C11013n2 n2Var, boolean z, ArrayList<String> arrayList) {
        this.f31823a = n2Var;
        this.f31824b = z;
        this.f31825c = arrayList;
    }

    /* renamed from: a */
    private WebResourceResponse m40599a(String str) {
        C10735b4.m39109b("Url was blocked from WebView = " + str);
        return new WebResourceResponse("text/plain", "UTF-8", (InputStream) null);
    }

    /* renamed from: b */
    private void m40601b(String str) {
        Broadcasts.C10688d.m38944a(Broadcasts.C10688d.C10689a.formBlockedUrl, this.f31823a.getFormId(), this.f31823a.getFormType(), str);
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C10735b4.m39109b("Form showed onPageFinished");
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return (webResourceRequest == null || webResourceRequest.getUrl() == null || !C11110u2.m40742a(webResourceRequest.getUrl().toString(), this.f31824b, this.f31825c, this.f31823a.getFormId(), this.f31823a.getFormType())) ? super.shouldInterceptRequest(webView, webResourceRequest) : m40599a(webResourceRequest.getUrl().toString());
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        if (C11110u2.m40742a(webResourceRequest.getUrl().toString(), this.f31824b, this.f31825c, this.f31823a.getFormId(), this.f31823a.getFormType())) {
            m40601b(webResourceRequest.getUrl().toString());
            return true;
        }
        m40600a(webView.getContext(), webResourceRequest.getUrl().toString());
        return true;
    }

    /* renamed from: a */
    private void m40600a(Context context, String str) {
        if (str != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
    }
}

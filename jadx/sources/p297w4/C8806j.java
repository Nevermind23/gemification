package p297w4;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;
import p334z4.C9207a;

/* renamed from: w4.j */
public class C8806j extends C8785c0 {

    /* renamed from: s */
    private static final String f24703s = "w4.j";

    /* renamed from: r */
    private boolean f24704r;

    /* renamed from: w4.j$a */
    class C8807a implements Runnable {
        C8807a() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    C8806j.super.cancel();
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    private C8806j(Context context, String str, String str2) {
        super(context, str);
        mo24205v(str2);
    }

    /* renamed from: A */
    public static C8806j m32788A(Context context, String str, String str2) {
        C8785c0.m32740n(context);
        return new C8806j(context, str, str2);
    }

    public void cancel() {
        WebView m = mo24191m();
        if (!mo24200p() || mo24192o() || m == null || !m.isShown()) {
            super.cancel();
        } else if (!this.f24704r) {
            this.f24704r = true;
            m.loadUrl("javascript:" + "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new C8807a(), 1500);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Bundle mo24201r(String str) {
        Bundle a0 = C8769a0.m32655a0(Uri.parse(str).getQuery());
        String string = a0.getString("bridge_args");
        a0.remove("bridge_args");
        if (!C8769a0.m32644Q(string)) {
            try {
                a0.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C8776c.m32719a(new JSONObject(string)));
            } catch (JSONException e) {
                C8769a0.m32650W(f24703s, "Unable to parse bridge_args JSON", e);
            }
        }
        String string2 = a0.getString("method_results");
        a0.remove("method_results");
        if (!C8769a0.m32644Q(string2)) {
            if (C8769a0.m32644Q(string2)) {
                string2 = "{}";
            }
            try {
                a0.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C8776c.m32719a(new JSONObject(string2)));
            } catch (JSONException e2) {
                C8769a0.m32650W(f24703s, "Unable to parse bridge_args JSON", e2);
            }
        }
        a0.remove("version");
        a0.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C8832s.m32896t());
        return a0;
    }
}

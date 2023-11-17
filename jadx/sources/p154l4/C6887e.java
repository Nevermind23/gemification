package p154l4;

import android.util.Log;

/* renamed from: l4.e */
public abstract class C6887e {

    /* renamed from: a */
    private static final String f20639a = "l4.e";

    /* renamed from: b */
    private static Class f20640b;

    /* renamed from: a */
    public static void m26734a() {
        m26736c("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    /* renamed from: b */
    public static void m26735b(String str) {
        m26736c("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    /* renamed from: c */
    public static void m26736c(String str, String str2, String str3) {
        Class<String> cls = String.class;
        try {
            if (f20640b == null) {
                f20640b = Class.forName("com.unity3d.player.UnityPlayer");
            }
            f20640b.getMethod("UnitySendMessage", new Class[]{cls, cls, cls}).invoke(f20640b, new Object[]{str, str2, str3});
        } catch (Exception e) {
            Log.e(f20639a, "Failed to send message to Unity", e);
        }
    }
}

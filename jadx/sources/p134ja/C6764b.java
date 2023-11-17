package p134ja;

/* renamed from: ja.b */
public abstract class C6764b {
    /* renamed from: a */
    public static String m26382a(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", new Object[]{m26385d(str, str2), str3, "perf-android-sdk", "android-ide"});
    }

    /* renamed from: b */
    public static String m26383b(String str, String str2) {
        return String.format("%s/trends?utm_source=%s&utm_medium=%s", new Object[]{m26385d(str, str2), "perf-android-sdk", "android-ide"});
    }

    /* renamed from: c */
    public static String m26384c(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", new Object[]{m26385d(str, str2), str3, "perf-android-sdk", "android-ide"});
    }

    /* renamed from: d */
    private static String m26385d(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", new Object[]{"https://console.firebase.google.com", str, str2});
    }
}

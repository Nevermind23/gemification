package p193o4;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.facebook.C2626d;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.messages.iam.C11651j;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p297w4.C8769a0;
import p334z4.C9207a;

/* renamed from: o4.b */
public abstract class C7438b {
    /* renamed from: a */
    public static void m28292a() {
    }

    /* renamed from: b */
    public static void m28293b() {
    }

    /* renamed from: c */
    public static String m28294c(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public static String m28295d() {
        Context e = C2626d.m10134e();
        try {
            return e.getPackageManager().getPackageInfo(e.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: e */
    public static View m28296e(Activity activity) {
        Class<C7438b> cls = C7438b.class;
        if (C9207a.m34024c(cls) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m28297f() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith(C11651j.f33767h)) {
            String str2 = Build.MODEL;
            if (str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || ((Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT))) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static double m28298g(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return Utils.DOUBLE_EPSILON;
            }
            return NumberFormat.getNumberInstance(C8769a0.m32694v()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return Utils.DOUBLE_EPSILON;
        }
    }
}

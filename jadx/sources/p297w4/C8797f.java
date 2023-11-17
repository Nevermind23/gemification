package p297w4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.C2626d;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import p334z4.C9207a;

/* renamed from: w4.f */
public abstract class C8797f {

    /* renamed from: a */
    private static final String[] f24690a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* renamed from: a */
    public static String m32769a() {
        Class<C8797f> cls = C8797f.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            Context e = C2626d.m10134e();
            List<ResolveInfo> queryIntentServices = e.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null) {
                HashSet hashSet = new HashSet(Arrays.asList(f24690a));
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static String m32770b() {
        Class<C8797f> cls = C8797f.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return "fbconnect://cct." + C2626d.m10134e().getPackageName();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static String m32771c(String str) {
        Class<C8797f> cls = C8797f.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            if (C8775b0.m32711d(C2626d.m10134e(), str)) {
                return str;
            }
            if (C8775b0.m32711d(C2626d.m10134e(), m32770b())) {
                return m32770b();
            }
            return "";
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }
}

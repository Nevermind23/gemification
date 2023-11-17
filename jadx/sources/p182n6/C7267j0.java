package p182n6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p286v6.C8708e;

/* renamed from: n6.j0 */
public abstract class C7267j0 {

    /* renamed from: a */
    private static final Object f21460a = new Object();

    /* renamed from: b */
    private static boolean f21461b;

    /* renamed from: c */
    private static String f21462c;

    /* renamed from: d */
    private static int f21463d;

    /* renamed from: a */
    public static int m27915a(Context context) {
        m27916b(context);
        return f21463d;
    }

    /* renamed from: b */
    private static void m27916b(Context context) {
        synchronized (f21460a) {
            if (!f21461b) {
                f21461b = true;
                try {
                    Bundle bundle = C8708e.m32461a(context).mo24089c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f21462c = bundle.getString("com.google.app.id");
                        f21463d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}

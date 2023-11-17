package p261t7;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C3941b;
import com.google.android.gms.common.C3943d;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import p182n6.C7264i;

/* renamed from: t7.a */
public abstract class C8420a {

    /* renamed from: a */
    private static final C3941b f23873a = C3941b.m14941h();

    /* renamed from: b */
    private static final Object f23874b = new Object();

    /* renamed from: c */
    private static Method f23875c = null;

    /* renamed from: d */
    private static Method f23876d = null;

    /* renamed from: a */
    public static void m31586a(Context context) {
        Context context2;
        C7264i.m27903l(context, "Context must not be null");
        f23873a.mo12158n(context, 11925000);
        synchronized (f23874b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.m15258e(context, DynamiteModule.f12829f, "com.google.android.gms.providerinstaller.dynamite").mo12396b();
            } catch (DynamiteModule.LoadingException e) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                context2 = null;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context e2 = C3943d.m14962e(context);
                if (e2 != null) {
                    try {
                        if (f23876d == null) {
                            Class cls = Long.TYPE;
                            f23876d = m31587b(e2, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                        }
                        f23876d.invoke((Object) null, new Object[]{context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2)});
                    } catch (Exception e3) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e3.getMessage())));
                    }
                }
                if (e2 != null) {
                    m31588c(e2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new GooglePlayServicesNotAvailableException(8);
                }
            } else {
                m31588c(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
            }
        }
    }

    /* renamed from: b */
    private static Method m31587b(Context context, String str, String str2, Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    /* renamed from: c */
    private static void m31588c(Context context, Context context2, String str) {
        String str2;
        try {
            if (f23875c == null) {
                f23875c = m31587b(context, str, "insertProvider", new Class[]{Context.class});
            }
            f23875c.invoke((Object) null, new Object[]{context});
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    str2 = e.getMessage();
                } else {
                    str2 = cause.getMessage();
                }
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(str2)));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}

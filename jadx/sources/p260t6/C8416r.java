package p260t6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C3948e;
import p286v6.C8708e;

/* renamed from: t6.r */
public abstract class C8416r {
    /* renamed from: a */
    public static boolean m31577a(Context context, int i) {
        if (!m31578b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C3948e.m14975a(context).mo12171b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m31578b(Context context, int i, String str) {
        return C8708e.m32461a(context).mo24093g(i, str);
    }
}

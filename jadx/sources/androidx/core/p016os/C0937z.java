package androidx.core.p016os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: androidx.core.os.z */
public abstract class C0937z {

    /* renamed from: androidx.core.os.z$a */
    static class C0938a {
        /* renamed from: a */
        static boolean m3387a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* renamed from: a */
    public static boolean m3386a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0938a.m3387a(context);
        }
        return true;
    }
}

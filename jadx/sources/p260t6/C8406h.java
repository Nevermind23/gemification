package p260t6;

import android.content.Context;
import android.util.Log;
import p182n6.C7264i;

/* renamed from: t6.h */
public abstract class C8406h {

    /* renamed from: a */
    private static final String[] f23850a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: a */
    public static boolean m31543a(Context context, Throwable th) {
        try {
            C7264i.m27902k(context);
            C7264i.m27902k(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}

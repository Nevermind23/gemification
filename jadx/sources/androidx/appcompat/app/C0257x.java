package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.os.Build;
import com.salesforce.marketingcloud.C11398b;

/* renamed from: androidx.appcompat.app.x */
public abstract class C0257x extends Service {

    /* renamed from: androidx.appcompat.app.x$a */
    private static class C0258a {
        /* renamed from: a */
        static int m874a() {
            return C11398b.f33140s;
        }
    }

    /* renamed from: a */
    public static ServiceInfo m873a(Context context) {
        int i;
        if (Build.VERSION.SDK_INT >= 24) {
            i = C0258a.m874a() | 128;
        } else {
            i = 640;
        }
        return context.getPackageManager().getServiceInfo(new ComponentName(context, C0257x.class), i);
    }
}

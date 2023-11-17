package p076f4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import p166m3.C7083e;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: f4.b */
public abstract class C6154b {

    /* renamed from: a */
    private static final ConcurrentMap f19136a = new ConcurrentHashMap();

    /* renamed from: a */
    private static PackageInfo m24567a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: b */
    private static String m24568b(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    /* renamed from: c */
    public static C7083e m24569c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap concurrentMap = f19136a;
        C7083e eVar = (C7083e) concurrentMap.get(packageName);
        if (eVar != null) {
            return eVar;
        }
        C7083e d = m24570d(context);
        C7083e eVar2 = (C7083e) concurrentMap.putIfAbsent(packageName, d);
        if (eVar2 == null) {
            return d;
        }
        return eVar2;
    }

    /* renamed from: d */
    private static C7083e m24570d(Context context) {
        return new C6156d(m24568b(m24567a(context)));
    }
}

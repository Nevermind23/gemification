package p203p1;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C2073m;
import he1.C41238w;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: p1.y */
public abstract class C7662y {

    /* renamed from: a */
    private static final String f22281a;

    static {
        String i = C2073m.m8073i("WakeLocks");
        C41536l.m120488h(i, "tagWithPrefix(\"WakeLocks\")");
        f22281a = i;
    }

    /* renamed from: a */
    public static final void m29105a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C7663z zVar = C7663z.f22282a;
        synchronized (zVar) {
            linkedHashMap.putAll(zVar.mo22365a());
            C41238w wVar = C41238w.f97225a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            boolean z = false;
            if (wakeLock != null && wakeLock.isHeld()) {
                z = true;
            }
            if (z) {
                C2073m.m8071e().mo6966k(f22281a, "WakeLock held for " + str);
            }
        }
    }

    /* renamed from: b */
    public static final PowerManager.WakeLock m29106b(Context context, String str) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        C7663z zVar = C7663z.f22282a;
        synchronized (zVar) {
            String str3 = (String) zVar.mo22365a().put(newWakeLock, str2);
        }
        C41536l.m120488h(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}

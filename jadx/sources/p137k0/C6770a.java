package p137k0;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.medallia.digital.mobilesdk.C10749b8;

/* renamed from: k0.a */
public abstract class C6770a extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray f20341a = new SparseArray();

    /* renamed from: b */
    private static int f20342b = 1;

    /* renamed from: b */
    public static boolean m26401b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray sparseArray = f20341a;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    /* renamed from: c */
    public static ComponentName m26402c(Context context, Intent intent) {
        SparseArray sparseArray = f20341a;
        synchronized (sparseArray) {
            int i = f20342b;
            int i2 = i + 1;
            f20342b = i2;
            if (i2 <= 0) {
                f20342b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(C10749b8.C10751b.f30743b);
            sparseArray.put(i, newWakeLock);
            return startService;
        }
    }
}

package p117i6;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;

/* renamed from: i6.e */
public final class C6576e extends ClassLoader {
    /* access modifiers changed from: protected */
    public final Class loadClass(String str, boolean z) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("CloudMessengerCompat", 3))) {
            return zzd.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return zzd.class;
    }
}

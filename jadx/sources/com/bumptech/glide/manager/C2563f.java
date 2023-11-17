package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.core.content.C0767a;
import com.bumptech.glide.manager.C2559c;

/* renamed from: com.bumptech.glide.manager.f */
public class C2563f implements C2561d {
    /* renamed from: a */
    public C2559c mo8057a(Context context, C2559c.C2560a aVar) {
        boolean z;
        String str;
        if (C0767a.m2891a(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z) {
            return new C2562e(context, aVar);
        }
        return new C2574o();
    }
}

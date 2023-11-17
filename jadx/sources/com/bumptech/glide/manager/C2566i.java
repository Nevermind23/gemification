package com.bumptech.glide.manager;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: com.bumptech.glide.manager.i */
final class C2566i implements C2568k, ComponentCallbacks2 {
    C2566i() {
    }

    /* renamed from: a */
    public void mo8058a(Activity activity) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        onTrimMemory(20);
    }

    public void onTrimMemory(int i) {
    }
}

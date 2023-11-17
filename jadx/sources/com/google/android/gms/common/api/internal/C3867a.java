package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p260t6.C8413o;

/* renamed from: com.google.android.gms.common.api.internal.a */
public final class C3867a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: h */
    private static final C3867a f12317h = new C3867a();

    /* renamed from: d */
    private final AtomicBoolean f12318d = new AtomicBoolean();

    /* renamed from: e */
    private final AtomicBoolean f12319e = new AtomicBoolean();

    /* renamed from: f */
    private final ArrayList f12320f = new ArrayList();

    /* renamed from: g */
    private boolean f12321g = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a */
    public interface C3868a {
        /* renamed from: a */
        void mo12004a(boolean z);
    }

    private C3867a() {
    }

    /* renamed from: b */
    public static C3867a m14588b() {
        return f12317h;
    }

    /* renamed from: c */
    public static void m14589c(Application application) {
        C3867a aVar = f12317h;
        synchronized (aVar) {
            if (!aVar.f12321g) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.f12321g = true;
            }
        }
    }

    /* renamed from: f */
    private final void m14590f(boolean z) {
        synchronized (f12317h) {
            Iterator it = this.f12320f.iterator();
            while (it.hasNext()) {
                ((C3868a) it.next()).mo12004a(z);
            }
        }
    }

    /* renamed from: a */
    public void mo11991a(C3868a aVar) {
        synchronized (f12317h) {
            this.f12320f.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean mo11992d() {
        return this.f12318d.get();
    }

    /* renamed from: e */
    public boolean mo11993e(boolean z) {
        if (!this.f12319e.get()) {
            if (!C8413o.m31564b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f12319e.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f12318d.set(true);
            }
        }
        return mo11992d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f12318d.compareAndSet(true, false);
        this.f12319e.set(true);
        if (compareAndSet) {
            m14590f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f12318d.compareAndSet(true, false);
        this.f12319e.set(true);
        if (compareAndSet) {
            m14590f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f12318d.compareAndSet(false, true)) {
            this.f12319e.set(true);
            m14590f(true);
        }
    }
}

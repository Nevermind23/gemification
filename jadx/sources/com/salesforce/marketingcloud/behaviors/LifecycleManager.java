package com.salesforce.marketingcloud.behaviors;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1616p;
import androidx.lifecycle.C1646z;
import com.salesforce.marketingcloud.C11460f;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.InitializationStatus;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness"})
public final class LifecycleManager extends C11460f implements C1616p {

    /* renamed from: g */
    static LifecycleManager f33156g;

    /* renamed from: d */
    private final Application f33157d;

    /* renamed from: e */
    private final AtomicBoolean f33158e = new AtomicBoolean(false);

    /* renamed from: f */
    AtomicBoolean f33159f = new AtomicBoolean(false);

    private LifecycleManager(Application application) {
        this.f33157d = application;
    }

    /* renamed from: a */
    public static synchronized LifecycleManager m41716a(Application application) {
        LifecycleManager lifecycleManager;
        synchronized (LifecycleManager.class) {
            if (f33156g == null) {
                f33156g = new LifecycleManager(application);
            }
            lifecycleManager = f33156g;
        }
        return lifecycleManager;
    }

    public String componentName() {
        return "LifecycleManager";
    }

    public JSONObject componentState() {
        return null;
    }

    /* access modifiers changed from: package-private */
    @C1646z(C1593j.C1594a.ON_STOP)
    public void onApplicationBackgrounded() {
        if (this.f33159f.getAndSet(false)) {
            C11461g.m41880a(C11404c.f33179k, "Application went into the background.", new Object[0]);
            C11404c.m41719a(this.f33157d, C11402a.BEHAVIOR_APP_BACKGROUNDED, new Bundle());
        }
    }

    /* access modifiers changed from: package-private */
    @C1646z(C1593j.C1594a.ON_START)
    public void onApplicationForegrounded() {
        if (!this.f33159f.getAndSet(true) && this.f33158e.get()) {
            C11461g.m41880a(C11404c.f33179k, "Application came into the foreground.", new Object[0]);
            C11404c.m41719a(this.f33157d, C11402a.BEHAVIOR_APP_FOREGROUNDED, new Bundle());
        }
    }

    public void tearDown(boolean z) {
        this.f33158e.set(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29669a(InitializationStatus.C11293a aVar) {
        this.f33158e.set(true);
        if (this.f33159f.get()) {
            C11404c.m41719a(this.f33157d, C11402a.BEHAVIOR_APP_FOREGROUNDED, (Bundle) null);
        }
    }
}

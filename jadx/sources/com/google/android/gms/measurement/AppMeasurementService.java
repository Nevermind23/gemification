package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C4718m8;
import p137k0.C6770a;
import p248s7.C8271y;

public final class AppMeasurementService extends Service implements C8271y {

    /* renamed from: d */
    private C4718m8 f14173d;

    /* renamed from: d */
    private final C4718m8 m17546d() {
        if (this.f14173d == null) {
            this.f14173d = new C4718m8(this);
        }
        return this.f14173d;
    }

    /* renamed from: a */
    public final boolean mo14263a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: b */
    public final void mo14264b(Intent intent) {
        C6770a.m26401b(intent);
    }

    /* renamed from: c */
    public final void mo14265c(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public IBinder onBind(Intent intent) {
        return m17546d().mo14558b(intent);
    }

    public void onCreate() {
        super.onCreate();
        m17546d().mo14561e();
    }

    public void onDestroy() {
        m17546d().mo14562f();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        m17546d().mo14563g(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        m17546d().mo14557a(intent, i, i2);
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        m17546d().mo14566j(intent);
        return true;
    }
}

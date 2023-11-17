package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C4718m8;
import p248s7.C8271y;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements C8271y {

    /* renamed from: d */
    private C4718m8 f14171d;

    /* renamed from: d */
    private final C4718m8 m17541d() {
        if (this.f14171d == null) {
            this.f14171d = new C4718m8(this);
        }
        return this.f14171d;
    }

    /* renamed from: a */
    public final boolean mo14263a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo14264b(Intent intent) {
    }

    /* renamed from: c */
    public final void mo14265c(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public void onCreate() {
        super.onCreate();
        m17541d().mo14561e();
    }

    public void onDestroy() {
        m17541d().mo14562f();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        m17541d().mo14563g(intent);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        m17541d().mo14565i(jobParameters);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public boolean onUnbind(Intent intent) {
        m17541d().mo14566j(intent);
        return true;
    }
}

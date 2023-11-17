package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.j8 */
public final /* synthetic */ class C4685j8 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C4718m8 f14543d;

    /* renamed from: e */
    public final /* synthetic */ C4746p3 f14544e;

    /* renamed from: f */
    public final /* synthetic */ JobParameters f14545f;

    public /* synthetic */ C4685j8(C4718m8 m8Var, C4746p3 p3Var, JobParameters jobParameters) {
        this.f14543d = m8Var;
        this.f14544e = p3Var;
        this.f14545f = jobParameters;
    }

    public final void run() {
        this.f14543d.mo14560d(this.f14544e, this.f14545f);
    }
}

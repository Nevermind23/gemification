package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p168m5.C7129p;
import p168m5.C7135u;
import p259t5.C8375e;
import p311x5.C8965a;

public class JobInfoSchedulerService extends JobService {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m13984b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C7135u.m27505f(getApplicationContext());
        C7129p.C7130a d = C7129p.m27484a().mo21361b(string).mo21363d(C8965a.m33238b(i));
        if (string2 != null) {
            d.mo21362c(Base64.decode(string2, 0));
        }
        C7135u.m27503c().mo21391e().mo23589v(d.mo21360a(), i2, new C8375e(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

package p259t5;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* renamed from: t5.e */
public final /* synthetic */ class C8375e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JobInfoSchedulerService f23789d;

    /* renamed from: e */
    public final /* synthetic */ JobParameters f23790e;

    public /* synthetic */ C8375e(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f23789d = jobInfoSchedulerService;
        this.f23790e = jobParameters;
    }

    public final void run() {
        this.f23789d.m13984b(this.f23790e);
    }
}

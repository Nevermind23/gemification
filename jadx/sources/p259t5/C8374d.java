package p259t5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p168m5.C7129p;
import p220q5.C7894a;
import p272u5.C8587d;
import p311x5.C8965a;

/* renamed from: t5.d */
public class C8374d implements C8398x {

    /* renamed from: a */
    private final Context f23786a;

    /* renamed from: b */
    private final C8587d f23787b;

    /* renamed from: c */
    private final C8376f f23788c;

    public C8374d(Context context, C8587d dVar, C8376f fVar) {
        this.f23786a = context;
        this.f23787b = dVar;
        this.f23788c = fVar;
    }

    /* renamed from: d */
    private boolean m31452d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo23576a(C7129p pVar, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f23786a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f23786a.getSystemService("jobscheduler");
        int c = mo23578c(pVar);
        if (z || !m31452d(jobScheduler, c, i)) {
            long K = this.f23787b.mo23948K(pVar);
            JobInfo.Builder c2 = this.f23788c.mo23580c(new JobInfo.Builder(c, componentName), pVar.mo21357d(), K, i);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", pVar.mo21355b());
            persistableBundle.putInt("priority", C8965a.m33237a(pVar.mo21357d()));
            if (pVar.mo21356c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(pVar.mo21356c(), 0));
            }
            c2.setExtras(persistableBundle);
            C7894a.m29865c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(c), Long.valueOf(this.f23788c.mo23581g(pVar.mo21357d(), K, i)), Long.valueOf(K), Integer.valueOf(i));
            jobScheduler.schedule(c2.build());
            return;
        }
        C7894a.m29864b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
    }

    /* renamed from: b */
    public void mo23577b(C7129p pVar, int i) {
        mo23576a(pVar, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo23578c(C7129p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f23786a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.mo21355b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C8965a.m33237a(pVar.mo21357d())).array());
        if (pVar.mo21356c() != null) {
            adler32.update(pVar.mo21356c());
        }
        return (int) adler32.getValue();
    }
}

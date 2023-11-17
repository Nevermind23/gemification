package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.util.C1000a;
import androidx.work.C2073m;
import androidx.work.C2085q;
import androidx.work.C2093w;
import androidx.work.impl.C2007e0;
import androidx.work.impl.C2045t;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p190o1.C7378i;
import p190o1.C7385l;
import p190o1.C7386m;
import p190o1.C7399v;
import p190o1.C7402w;
import p190o1.C7417y;
import p203p1.C7648l;

/* renamed from: androidx.work.impl.background.systemjob.l */
public class C1998l implements C2045t {

    /* renamed from: h */
    private static final String f6020h = C2073m.m8073i("SystemJobScheduler");

    /* renamed from: d */
    private final Context f6021d;

    /* renamed from: e */
    private final JobScheduler f6022e;

    /* renamed from: f */
    private final C2007e0 f6023f;

    /* renamed from: g */
    private final C1996k f6024g;

    public C1998l(Context context, C2007e0 e0Var) {
        this(context, e0Var, (JobScheduler) context.getSystemService("jobscheduler"), new C1996k(context));
    }

    /* renamed from: b */
    public static void m7837b(Context context) {
        List<JobInfo> g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g = m7840g(context, jobScheduler)) != null && !g.isEmpty()) {
            for (JobInfo id : g) {
                m7838d(jobScheduler, id.getId());
            }
        }
    }

    /* renamed from: d */
    private static void m7838d(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C2073m.m8071e().mo6962d(f6020h, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    /* renamed from: f */
    private static List m7839f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g = m7840g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g) {
            C7386m h = m7841h(jobInfo);
            if (h != null && str.equals(h.mo21770b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static List m7840g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C2073m.m8071e().mo6962d(f6020h, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private static C7386m m7841h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C7386m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m7842i(Context context, C2007e0 e0Var) {
        int i;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g = m7840g(context, jobScheduler);
        List<String> d = e0Var.mo6828s().mo6748K().mo21764d();
        boolean z = false;
        if (g != null) {
            i = g.size();
        } else {
            i = 0;
        }
        HashSet hashSet = new HashSet(i);
        if (g != null && !g.isEmpty()) {
            for (JobInfo jobInfo : g) {
                C7386m h = m7841h(jobInfo);
                if (h != null) {
                    hashSet.add(h.mo21770b());
                } else {
                    m7838d(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = d.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    C2073m.m8071e().mo6959a(f6020h, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase s = e0Var.mo6828s();
            s.mo23807e();
            try {
                C7402w N = s.mo6751N();
                for (String o : d) {
                    N.mo21814o(o, -1);
                }
                s.mo23804F();
            } finally {
                s.mo23809i();
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo6803a(C7399v... vVarArr) {
        int i;
        List f;
        int i2;
        WorkDatabase s = this.f6023f.mo6828s();
        C7648l lVar = new C7648l(s);
        int length = vVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            C7399v vVar = vVarArr[i3];
            s.mo23807e();
            try {
                C7399v i4 = s.mo6751N().mo21808i(vVar.f21630a);
                if (i4 == null) {
                    C2073m.m8071e().mo6966k(f6020h, "Skipping scheduling " + vVar.f21630a + " because it's no longer in the DB");
                    s.mo23804F();
                } else if (i4.f21631b != C2093w.ENQUEUED) {
                    C2073m.m8071e().mo6966k(f6020h, "Skipping scheduling " + vVar.f21630a + " because it is no longer enqueued");
                    s.mo23804F();
                } else {
                    C7386m a = C7417y.m28225a(vVar);
                    C7378i g = s.mo6748K().mo21767g(a);
                    if (g != null) {
                        i = g.f21603c;
                    } else {
                        i = lVar.mo22353e(this.f6023f.mo6823l().mo6699i(), this.f6023f.mo6823l().mo6697g());
                    }
                    if (g == null) {
                        this.f6023f.mo6828s().mo6748K().mo21762b(C7385l.m28121a(a, i));
                    }
                    mo6806j(vVar, i);
                    if (Build.VERSION.SDK_INT == 23 && (f = m7839f(this.f6021d, this.f6022e, vVar.f21630a)) != null) {
                        int indexOf = f.indexOf(Integer.valueOf(i));
                        if (indexOf >= 0) {
                            f.remove(indexOf);
                        }
                        if (!f.isEmpty()) {
                            i2 = ((Integer) f.get(0)).intValue();
                        } else {
                            i2 = lVar.mo22353e(this.f6023f.mo6823l().mo6699i(), this.f6023f.mo6823l().mo6697g());
                        }
                        mo6806j(vVar, i2);
                    }
                    s.mo23804F();
                }
                i3++;
            } finally {
                s.mo23809i();
            }
        }
    }

    /* renamed from: c */
    public void mo6804c(String str) {
        List<Integer> f = m7839f(this.f6021d, this.f6022e, str);
        if (f != null && !f.isEmpty()) {
            for (Integer intValue : f) {
                m7838d(this.f6022e, intValue.intValue());
            }
            this.f6023f.mo6828s().mo6748K().mo21766f(str);
        }
    }

    /* renamed from: e */
    public boolean mo6805e() {
        return true;
    }

    /* renamed from: j */
    public void mo6806j(C7399v vVar, int i) {
        int i2;
        JobInfo a = this.f6024g.mo6802a(vVar, i);
        C2073m e = C2073m.m8071e();
        String str = f6020h;
        e.mo6959a(str, "Scheduling work ID " + vVar.f21630a + "Job ID " + i);
        try {
            if (this.f6022e.schedule(a) == 0) {
                C2073m.m8071e().mo6966k(str, "Unable to schedule work ID " + vVar.f21630a);
                if (vVar.f21646q && vVar.f21647r == C2085q.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    vVar.f21646q = false;
                    C2073m.m8071e().mo6959a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{vVar.f21630a}));
                    mo6806j(vVar, i);
                }
            }
        } catch (IllegalStateException e2) {
            List g = m7840g(this.f6021d, this.f6022e);
            if (g != null) {
                i2 = g.size();
            } else {
                i2 = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f6023f.mo6828s().mo6751N().mo21804e().size()), Integer.valueOf(this.f6023f.mo6823l().mo6698h())});
            C2073m.m8071e().mo6961c(f6020h, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e2);
            C1000a l = this.f6023f.mo6823l().mo6702l();
            if (l != null) {
                l.accept(illegalStateException);
                return;
            }
            throw illegalStateException;
        } catch (Throwable th) {
            C2073m.m8071e().mo6962d(f6020h, "Unable to schedule " + vVar, th);
        }
    }

    public C1998l(Context context, C2007e0 e0Var, JobScheduler jobScheduler, C1996k kVar) {
        this.f6021d = context;
        this.f6023f = e0Var;
        this.f6022e = jobScheduler;
        this.f6024g = kVar;
    }
}

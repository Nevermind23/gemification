package p203p1;

import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.C41536l;

/* renamed from: p1.l */
public final class C7648l {

    /* renamed from: a */
    private final WorkDatabase f22264a;

    public C7648l(WorkDatabase workDatabase) {
        C41536l.m120489i(workDatabase, "workDatabase");
        this.f22264a = workDatabase;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final Integer m29080d(C7648l lVar) {
        C41536l.m120489i(lVar, "this$0");
        return Integer.valueOf(C7649m.m29087d(lVar.f22264a, "next_alarm_manager_id"));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final Integer m29081f(C7648l lVar, int i, int i2) {
        C41536l.m120489i(lVar, "this$0");
        int a = C7649m.m29087d(lVar.f22264a, "next_job_scheduler_id");
        boolean z = false;
        if (i <= a && a <= i2) {
            z = true;
        }
        if (!z) {
            C7649m.m29088e(lVar.f22264a, "next_job_scheduler_id", i + 1);
        } else {
            i = a;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: c */
    public final int mo22352c() {
        Object D = this.f22264a.mo23802D(new C7646j(this));
        C41536l.m120488h(D, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) D).intValue();
    }

    /* renamed from: e */
    public final int mo22353e(int i, int i2) {
        Object D = this.f22264a.mo23802D(new C7647k(this, i, i2));
        C41536l.m120488h(D, "workDatabase.runInTransa…            id\n        })");
        return ((Number) D).intValue();
    }
}

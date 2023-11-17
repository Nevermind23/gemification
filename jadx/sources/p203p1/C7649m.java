package p203p1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.C41536l;
import p190o1.C7372d;
import p318y0.C8998i;

/* renamed from: p1.m */
public abstract class C7649m {
    /* renamed from: c */
    public static final void m29086c(Context context, C8998i iVar) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(iVar, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            iVar.mo23650F();
            try {
                iVar.mo23656Y("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                iVar.mo23656Y("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                iVar.mo23655X();
            } finally {
                iVar.mo23662i0();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final int m29087d(WorkDatabase workDatabase, String str) {
        int i;
        Long b = workDatabase.mo6747J().mo21755b(str);
        int i2 = 0;
        if (b != null) {
            i = (int) b.longValue();
        } else {
            i = 0;
        }
        if (i != Integer.MAX_VALUE) {
            i2 = i + 1;
        }
        m29088e(workDatabase, str, i2);
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m29088e(WorkDatabase workDatabase, String str, int i) {
        workDatabase.mo6747J().mo21754a(new C7372d(str, Long.valueOf((long) i)));
    }
}

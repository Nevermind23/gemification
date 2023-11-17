package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.C2073m;
import androidx.work.impl.WorkDatabase;
import p190o1.C7378i;
import p190o1.C7379j;
import p190o1.C7385l;
import p190o1.C7386m;
import p203p1.C7648l;

/* renamed from: androidx.work.impl.background.systemalarm.a */
abstract class C1972a {

    /* renamed from: a */
    private static final String f5971a = C2073m.m8073i("Alarms");

    /* renamed from: androidx.work.impl.background.systemalarm.a$a */
    static class C1973a {
        /* renamed from: a */
        static void m7776a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExact(i, j, pendingIntent);
        }
    }

    /* renamed from: a */
    public static void m7772a(Context context, WorkDatabase workDatabase, C7386m mVar) {
        C7379j K = workDatabase.mo6748K();
        C7378i g = K.mo21767g(mVar);
        if (g != null) {
            m7773b(context, mVar, g.f21603c);
            C2073m e = C2073m.m8071e();
            String str = f5971a;
            e.mo6959a(str, "Removing SystemIdInfo for workSpecId (" + mVar + ")");
            K.mo21761a(mVar);
        }
    }

    /* renamed from: b */
    private static void m7773b(Context context, C7386m mVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1974b.m7778b(context, mVar), 603979776);
        if (service != null && alarmManager != null) {
            C2073m e = C2073m.m8071e();
            String str = f5971a;
            e.mo6959a(str, "Cancelling existing alarm with (workSpecId, systemId) (" + mVar + ", " + i + ")");
            alarmManager.cancel(service);
        }
    }

    /* renamed from: c */
    public static void m7774c(Context context, WorkDatabase workDatabase, C7386m mVar, long j) {
        C7379j K = workDatabase.mo6748K();
        C7378i g = K.mo21767g(mVar);
        if (g != null) {
            m7773b(context, mVar, g.f21603c);
            m7775d(context, mVar, g.f21603c, j);
            return;
        }
        int c = new C7648l(workDatabase).mo22352c();
        K.mo21762b(C7385l.m28121a(mVar, c));
        m7775d(context, mVar, c, j);
    }

    /* renamed from: d */
    private static void m7775d(Context context, C7386m mVar, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1974b.m7778b(context, mVar), 201326592);
        if (alarmManager != null) {
            C1973a.m7776a(alarmManager, 0, j, service);
        }
    }
}

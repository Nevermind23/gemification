package p203p1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p190o1.C7372d;
import p318y0.C8998i;

/* renamed from: p1.s */
public class C7655s {

    /* renamed from: a */
    private final WorkDatabase f22266a;

    public C7655s(WorkDatabase workDatabase) {
        this.f22266a = workDatabase;
    }

    /* renamed from: c */
    public static void m29096c(Context context, C8998i iVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = 0;
            long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j = 1;
            }
            iVar.mo23650F();
            try {
                iVar.mo23656Y("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                iVar.mo23656Y("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                sharedPreferences.edit().clear().apply();
                iVar.mo23655X();
            } finally {
                iVar.mo23662i0();
            }
        }
    }

    /* renamed from: a */
    public long mo22354a() {
        Long b = this.f22266a.mo6747J().mo21755b("last_force_stop_ms");
        if (b != null) {
            return b.longValue();
        }
        return 0;
    }

    /* renamed from: b */
    public boolean mo22355b() {
        Long b = this.f22266a.mo6747J().mo21755b("reschedule_needed");
        if (b == null || b.longValue() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo22356d(long j) {
        this.f22266a.mo6747J().mo21754a(new C7372d("last_force_stop_ms", Long.valueOf(j)));
    }

    /* renamed from: e */
    public void mo22357e(boolean z) {
        this.f22266a.mo6747J().mo21754a(new C7372d("reschedule_needed", z));
    }
}

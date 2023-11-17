package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.util.C1000a;
import androidx.work.C1950b;
import androidx.work.C2073m;
import androidx.work.C2093w;
import androidx.work.impl.C1968a0;
import androidx.work.impl.C2007e0;
import androidx.work.impl.C2046u;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.C1998l;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p190o1.C7392r;
import p190o1.C7399v;
import p190o1.C7402w;
import p203p1.C7643g;
import p203p1.C7655s;
import p203p1.C7656t;

public class ForceStopRunnable implements Runnable {

    /* renamed from: h */
    private static final String f6159h = C2073m.m8073i("ForceStopRunnable");

    /* renamed from: i */
    private static final long f6160i = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: d */
    private final Context f6161d;

    /* renamed from: e */
    private final C2007e0 f6162e;

    /* renamed from: f */
    private final C7655s f6163f;

    /* renamed from: g */
    private int f6164g = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        private static final String f6165a = C2073m.m8073i("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                C2073m.m8071e().mo6965j(f6165a, "Rescheduling alarm that keeps track of force-stops.");
                ForceStopRunnable.m7984g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, C2007e0 e0Var) {
        this.f6161d = context.getApplicationContext();
        this.f6162e = e0Var;
        this.f6163f = e0Var.mo6824o();
    }

    /* renamed from: c */
    static Intent m7982c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: d */
    private static PendingIntent m7983d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m7982c(context), i);
    }

    /* renamed from: g */
    static void m7984g(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        PendingIntent d = m7983d(context, i);
        long currentTimeMillis = System.currentTimeMillis() + f6160i;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d);
        }
    }

    /* renamed from: a */
    public boolean mo6880a() {
        boolean z;
        boolean i = C1998l.m7842i(this.f6161d, this.f6162e);
        WorkDatabase s = this.f6162e.mo6828s();
        C7402w N = s.mo6751N();
        C7392r M = s.mo6750M();
        s.mo23807e();
        try {
            List<C7399v> t = N.mo21819t();
            if (t == null || t.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                for (C7399v vVar : t) {
                    N.mo21817r(C2093w.ENQUEUED, vVar.f21630a);
                    N.mo21814o(vVar.f21630a, -1);
                }
            }
            M.mo21782b();
            s.mo23804F();
            if (z || i) {
                return true;
            }
            return false;
        } finally {
            s.mo23809i();
        }
    }

    /* renamed from: b */
    public void mo6881b() {
        boolean a = mo6880a();
        if (mo6884h()) {
            C2073m.m8071e().mo6959a(f6159h, "Rescheduling Workers.");
            this.f6162e.mo6831w();
            this.f6162e.mo6824o().mo22357e(false);
        } else if (mo6882e()) {
            C2073m.m8071e().mo6959a(f6159h, "Application was force-stopped, rescheduling.");
            this.f6162e.mo6831w();
            this.f6163f.mo22356d(System.currentTimeMillis());
        } else if (a) {
            C2073m.m8071e().mo6959a(f6159h, "Found unfinished work, scheduling it.");
            C2046u.m7981b(this.f6162e.mo6823l(), this.f6162e.mo6828s(), this.f6162e.mo6826q());
        }
    }

    /* renamed from: e */
    public boolean mo6882e() {
        int i;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                i = 570425344;
            } else {
                i = 536870912;
            }
            PendingIntent d = m7983d(this.f6161d, i);
            if (i2 >= 30) {
                if (d != null) {
                    d.cancel();
                }
                List a = ((ActivityManager) this.f6161d.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                if (a != null && !a.isEmpty()) {
                    long a2 = this.f6163f.mo22354a();
                    for (int i3 = 0; i3 < a.size(); i3++) {
                        ApplicationExitInfo a3 = C7643g.m29075a(a.get(i3));
                        if (a3.getReason() == 10 && a3.getTimestamp() >= a2) {
                            return true;
                        }
                    }
                }
            } else if (d == null) {
                m7984g(this.f6161d);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e) {
            C2073m.m8071e().mo6967l(f6159h, "Ignoring exception", e);
            return true;
        }
    }

    /* renamed from: f */
    public boolean mo6883f() {
        C1950b l = this.f6162e.mo6823l();
        if (TextUtils.isEmpty(l.mo6693c())) {
            C2073m.m8071e().mo6959a(f6159h, "The default process name was not specified.");
            return true;
        }
        boolean b = C7656t.m29102b(this.f6161d, l);
        C2073m e = C2073m.m8071e();
        String str = f6159h;
        e.mo6959a(str, "Is default app process = " + b);
        return b;
    }

    /* renamed from: h */
    public boolean mo6884h() {
        return this.f6162e.mo6824o().mo22355b();
    }

    /* renamed from: i */
    public void mo6885i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    public void run() {
        try {
            if (!mo6883f()) {
                this.f6162e.mo6830v();
                return;
            }
            while (true) {
                C1968a0.m7761d(this.f6161d);
                C2073m.m8071e().mo6959a(f6159h, "Performing cleanup operations.");
                mo6881b();
                break;
            }
            this.f6162e.mo6830v();
        } catch (SQLiteException e) {
            C2073m.m8071e().mo6961c(f6159h, "Unexpected SQLite exception during migrations");
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected SQLite exception during migrations", e);
            C1000a e2 = this.f6162e.mo6823l().mo6695e();
            if (e2 != null) {
                e2.accept(illegalStateException);
            } else {
                throw illegalStateException;
            }
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e3) {
            int i = this.f6164g + 1;
            this.f6164g = i;
            if (i >= 3) {
                C2073m e4 = C2073m.m8071e();
                String str = f6159h;
                e4.mo6962d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e3);
                IllegalStateException illegalStateException2 = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e3);
                C1000a e5 = this.f6162e.mo6823l().mo6695e();
                if (e5 != null) {
                    C2073m.m8071e().mo6960b(str, "Routing exception to the specified exception handler", illegalStateException2);
                    e5.accept(illegalStateException2);
                } else {
                    throw illegalStateException2;
                }
            } else {
                C2073m e6 = C2073m.m8071e();
                String str2 = f6159h;
                e6.mo6960b(str2, "Retrying after " + (((long) i) * 300), e3);
                mo6885i(((long) this.f6164g) * 300);
            }
        } catch (Throwable th) {
            this.f6162e.mo6830v();
            throw th;
        }
    }
}

package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C1635t;
import androidx.work.C2073m;
import androidx.work.impl.foreground.C2017b;

public class SystemForegroundService extends C1635t implements C2017b.C2019b {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String f6045i = C2073m.m8073i("SystemFgService");

    /* renamed from: j */
    private static SystemForegroundService f6046j = null;

    /* renamed from: e */
    private Handler f6047e;

    /* renamed from: f */
    private boolean f6048f;

    /* renamed from: g */
    C2017b f6049g;

    /* renamed from: h */
    NotificationManager f6050h;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    class C2011a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ int f6051d;

        /* renamed from: e */
        final /* synthetic */ Notification f6052e;

        /* renamed from: f */
        final /* synthetic */ int f6053f;

        C2011a(int i, Notification notification, int i2) {
            this.f6051d = i;
            this.f6052e = notification;
            this.f6053f = i2;
        }

        public void run() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                C2015e.m7893a(SystemForegroundService.this, this.f6051d, this.f6052e, this.f6053f);
            } else if (i >= 29) {
                C2014d.m7892a(SystemForegroundService.this, this.f6051d, this.f6052e, this.f6053f);
            } else {
                SystemForegroundService.this.startForeground(this.f6051d, this.f6052e);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    class C2012b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ int f6055d;

        /* renamed from: e */
        final /* synthetic */ Notification f6056e;

        C2012b(int i, Notification notification) {
            this.f6055d = i;
            this.f6056e = notification;
        }

        public void run() {
            SystemForegroundService.this.f6050h.notify(this.f6055d, this.f6056e);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    class C2013c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ int f6058d;

        C2013c(int i) {
            this.f6058d = i;
        }

        public void run() {
            SystemForegroundService.this.f6050h.cancel(this.f6058d);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$d */
    static class C2014d {
        /* renamed from: a */
        static void m7892a(Service service, int i, Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$e */
    static class C2015e {
        /* renamed from: a */
        static void m7893a(Service service, int i, Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                C2073m.m8071e().mo6967l(SystemForegroundService.f6045i, "Unable to start foreground service", e);
            }
        }
    }

    /* renamed from: f */
    private void m7888f() {
        this.f6047e = new Handler(Looper.getMainLooper());
        this.f6050h = (NotificationManager) getApplicationContext().getSystemService("notification");
        C2017b bVar = new C2017b(getApplicationContext());
        this.f6049g = bVar;
        bVar.mo6848n(this);
    }

    /* renamed from: a */
    public void mo6835a(int i, Notification notification) {
        this.f6047e.post(new C2012b(i, notification));
    }

    /* renamed from: c */
    public void mo6836c(int i, int i2, Notification notification) {
        this.f6047e.post(new C2011a(i, notification, i2));
    }

    /* renamed from: d */
    public void mo6837d(int i) {
        this.f6047e.post(new C2013c(i));
    }

    public void onCreate() {
        super.onCreate();
        f6046j = this;
        m7888f();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f6049g.mo6846l();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f6048f) {
            C2073m.m8071e().mo6963f(f6045i, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f6049g.mo6846l();
            m7888f();
            this.f6048f = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f6049g.mo6847m(intent);
        return 3;
    }

    public void stop() {
        this.f6048f = true;
        C2073m.m8071e().mo6959a(f6045i, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f6046j = null;
        stopSelf();
    }
}

package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.C0750x;
import com.google.firebase.messaging.C5315d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p260t6.C8413o;
import p337z7.C9231i;

/* renamed from: com.google.firebase.messaging.f */
class C5324f {

    /* renamed from: a */
    private final ExecutorService f17039a;

    /* renamed from: b */
    private final Context f17040b;

    /* renamed from: c */
    private final C5328g0 f17041c;

    public C5324f(Context context, C5328g0 g0Var, ExecutorService executorService) {
        this.f17039a = executorService;
        this.f17040b = context;
        this.f17041c = g0Var;
    }

    /* renamed from: b */
    private boolean m21058b() {
        if (((KeyguardManager) this.f17040b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C8413o.m31568f()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f17040b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                if (next.importance == 100) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m21059c(C5315d.C5316a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f17040b.getSystemService("notification")).notify(aVar.f17034b, aVar.f17035c, aVar.f17033a.mo3212b());
    }

    /* renamed from: d */
    private C5313c0 m21060d() {
        C5313c0 o = C5313c0.m21003o(this.f17041c.mo17595p("gcm.n.image"));
        if (o != null) {
            o.mo17569t(this.f17039a);
        }
        return o;
    }

    /* renamed from: e */
    private void m21061e(C0750x.C0759e eVar, C5313c0 c0Var) {
        if (c0Var != null) {
            try {
                Bitmap bitmap = (Bitmap) C9231i.m34108b(c0Var.mo17568q(), 5, TimeUnit.SECONDS);
                eVar.mo3222o(bitmap);
                eVar.mo3231x(new C0750x.C0752b().mo3204i(bitmap).mo3203h((Bitmap) null));
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                c0Var.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                c0Var.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo17574a() {
        if (this.f17041c.mo17581a("gcm.n.noui")) {
            return true;
        }
        if (m21058b()) {
            return false;
        }
        C5313c0 d = m21060d();
        C5315d.C5316a e = C5315d.m21012e(this.f17040b, this.f17041c);
        m21061e(e.f17033a, d);
        m21059c(e);
        return true;
    }
}

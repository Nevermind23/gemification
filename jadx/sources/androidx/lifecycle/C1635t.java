package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.C41536l;

/* renamed from: androidx.lifecycle.t */
public abstract class C1635t extends Service implements C1619q {

    /* renamed from: d */
    private final C1604l0 f4659d = new C1604l0(this);

    public C1593j getLifecycle() {
        return this.f4659d.mo4916a();
    }

    public IBinder onBind(Intent intent) {
        C41536l.m120489i(intent, "intent");
        this.f4659d.mo4917b();
        return null;
    }

    public void onCreate() {
        this.f4659d.mo4918c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f4659d.mo4919d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.f4659d.mo4920e();
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}

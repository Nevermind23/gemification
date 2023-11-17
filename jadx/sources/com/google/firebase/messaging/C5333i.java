package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.profileinstaller.C1694g;
import com.google.firebase.messaging.C5318d1;
import java.util.concurrent.ExecutorService;
import p337z7.C9227g;
import p337z7.C9231i;
import p337z7.Task;

/* renamed from: com.google.firebase.messaging.i */
public abstract class C5333i extends Service {
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    final ExecutorService executor = C5344n.m21142d();
    private int lastStartId;
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* renamed from: com.google.firebase.messaging.i$a */
    class C5334a implements C5318d1.C5319a {
        C5334a() {
        }

        /* renamed from: a */
        public Task mo17572a(Intent intent) {
            return C5333i.this.m21114f(intent);
        }
    }

    /* renamed from: c */
    private void m21111c(Intent intent) {
        if (intent != null) {
            C5311b1.m20994c(intent);
        }
        synchronized (this.lock) {
            int i = this.runningTasks - 1;
            this.runningTasks = i;
            if (i == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m21112d(Intent intent, Task task) {
        m21111c(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m21113e(Intent intent, C9227g gVar) {
        try {
            handleIntent(intent);
        } finally {
            gVar.mo24885c((Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public Task m21114f(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return C9231i.m34113g((Object) null);
        }
        C9227g gVar = new C9227g();
        this.executor.execute(new C5327g(this, intent, gVar));
        return gVar.mo24883a();
    }

    /* access modifiers changed from: protected */
    public abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new C5318d1(new C5334a());
        }
        return this.binder;
    }

    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            m21111c(intent);
            return 2;
        }
        Task f = m21114f(startCommandIntent);
        if (f.mo24872q()) {
            m21111c(intent);
            return 2;
        }
        f.mo24857b(new C1694g(), new C5331h(this, intent));
        return 3;
    }

    /* access modifiers changed from: package-private */
    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}

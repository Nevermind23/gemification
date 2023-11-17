package p182n6;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C3860c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p066e7.C6047k;

/* renamed from: n6.x */
public final class C7292x implements Handler.Callback {

    /* renamed from: a */
    private final C7291w f21482a;

    /* renamed from: b */
    private final ArrayList f21483b = new ArrayList();

    /* renamed from: c */
    final ArrayList f21484c = new ArrayList();

    /* renamed from: d */
    private final ArrayList f21485d = new ArrayList();

    /* renamed from: e */
    private volatile boolean f21486e = false;

    /* renamed from: f */
    private final AtomicInteger f21487f = new AtomicInteger(0);

    /* renamed from: g */
    private boolean f21488g = false;

    /* renamed from: h */
    private final Handler f21489h;

    /* renamed from: i */
    private final Object f21490i = new Object();

    public C7292x(Looper looper, C7291w wVar) {
        this.f21482a = wVar;
        this.f21489h = new C6047k(looper, this);
    }

    /* renamed from: a */
    public final void mo21662a() {
        this.f21486e = false;
        this.f21487f.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo21663b() {
        this.f21486e = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21664c(com.google.android.gms.common.ConnectionResult r6) {
        /*
            r5 = this;
            android.os.Handler r0 = r5.f21489h
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            p182n6.C7264i.m27896e(r0, r1)
            android.os.Handler r0 = r5.f21489h
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.f21490i
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x004a }
            java.util.ArrayList r2 = r5.f21485d     // Catch:{ all -> 0x004a }
            r1.<init>(r2)     // Catch:{ all -> 0x004a }
            java.util.concurrent.atomic.AtomicInteger r2 = r5.f21487f     // Catch:{ all -> 0x004a }
            int r2 = r2.get()     // Catch:{ all -> 0x004a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004a }
        L_0x0021:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x004a }
            com.google.android.gms.common.api.c$c r3 = (com.google.android.gms.common.api.C3860c.C3863c) r3     // Catch:{ all -> 0x004a }
            boolean r4 = r5.f21486e     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicInteger r4 = r5.f21487f     // Catch:{ all -> 0x004a }
            int r4 = r4.get()     // Catch:{ all -> 0x004a }
            if (r4 == r2) goto L_0x003a
            goto L_0x0046
        L_0x003a:
            java.util.ArrayList r4 = r5.f21485d     // Catch:{ all -> 0x004a }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0021
            r3.mo12084y(r6)     // Catch:{ all -> 0x004a }
            goto L_0x0021
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p182n6.C7292x.mo21664c(com.google.android.gms.common.ConnectionResult):void");
    }

    /* renamed from: d */
    public final void mo21665d(Bundle bundle) {
        C7264i.m27896e(this.f21489h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f21490i) {
            C7264i.m27905n(!this.f21488g);
            this.f21489h.removeMessages(1);
            this.f21488g = true;
            C7264i.m27905n(this.f21484c.isEmpty());
            ArrayList arrayList = new ArrayList(this.f21483b);
            int i = this.f21487f.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3860c.C3862b bVar = (C3860c.C3862b) it.next();
                if (!this.f21486e || !this.f21482a.mo12050c()) {
                    break;
                } else if (this.f21487f.get() != i) {
                    break;
                } else if (!this.f21484c.contains(bVar)) {
                    bVar.mo12102k(bundle);
                }
            }
            this.f21484c.clear();
            this.f21488g = false;
        }
    }

    /* renamed from: e */
    public final void mo21666e(int i) {
        C7264i.m27896e(this.f21489h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f21489h.removeMessages(1);
        synchronized (this.f21490i) {
            this.f21488g = true;
            ArrayList arrayList = new ArrayList(this.f21483b);
            int i2 = this.f21487f.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3860c.C3862b bVar = (C3860c.C3862b) it.next();
                if (!this.f21486e) {
                    break;
                } else if (this.f21487f.get() != i2) {
                    break;
                } else if (this.f21483b.contains(bVar)) {
                    bVar.mo12107x(i);
                }
            }
            this.f21484c.clear();
            this.f21488g = false;
        }
    }

    /* renamed from: f */
    public final void mo21667f(C3860c.C3862b bVar) {
        C7264i.m27902k(bVar);
        synchronized (this.f21490i) {
            if (this.f21483b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f21483b.add(bVar);
            }
        }
        if (this.f21482a.mo12050c()) {
            Handler handler = this.f21489h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    /* renamed from: g */
    public final void mo21668g(C3860c.C3863c cVar) {
        C7264i.m27902k(cVar);
        synchronized (this.f21490i) {
            if (this.f21485d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f21485d.add(cVar);
            }
        }
    }

    /* renamed from: h */
    public final void mo21669h(C3860c.C3863c cVar) {
        C7264i.m27902k(cVar);
        synchronized (this.f21490i) {
            if (!this.f21485d.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C3860c.C3862b bVar = (C3860c.C3862b) message.obj;
            synchronized (this.f21490i) {
                if (this.f21486e && this.f21482a.mo12050c() && this.f21483b.contains(bVar)) {
                    bVar.mo12102k((Bundle) null);
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}

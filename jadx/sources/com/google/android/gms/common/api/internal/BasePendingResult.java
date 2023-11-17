package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.support.p013v4.media.session.C0125b;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C3860c;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p066e7.C6047k;
import p143k6.C6819b;
import p143k6.C6823e;
import p182n6.C7264i;

@KeepName
public abstract class BasePendingResult<R extends C6823e> extends C6819b {

    /* renamed from: m */
    static final ThreadLocal f12303m = new C3913n1();

    /* renamed from: a */
    private final Object f12304a = new Object();

    /* renamed from: b */
    protected final C3866a f12305b;

    /* renamed from: c */
    protected final WeakReference f12306c;

    /* renamed from: d */
    private final CountDownLatch f12307d = new CountDownLatch(1);

    /* renamed from: e */
    private final ArrayList f12308e = new ArrayList();

    /* renamed from: f */
    private final AtomicReference f12309f = new AtomicReference();

    /* renamed from: g */
    private C6823e f12310g;

    /* renamed from: h */
    private Status f12311h;

    /* renamed from: i */
    private volatile boolean f12312i;

    /* renamed from: j */
    private boolean f12313j;

    /* renamed from: k */
    private boolean f12314k;

    /* renamed from: l */
    private boolean f12315l = false;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C3866a extends C6047k {
        public C3866a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C0125b.m366a(pair.first);
                C6823e eVar = (C6823e) pair.second;
                try {
                    throw null;
                } catch (RuntimeException e) {
                    BasePendingResult.m14565m(eVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo11974f(Status.f12255m);
            }
        }
    }

    protected BasePendingResult(C3860c cVar) {
        Looper looper;
        if (cVar != null) {
            looper = cVar.mo11955i();
        } else {
            looper = Looper.getMainLooper();
        }
        this.f12305b = new C3866a(looper);
        this.f12306c = new WeakReference(cVar);
    }

    /* renamed from: j */
    private final C6823e m14563j() {
        C6823e eVar;
        synchronized (this.f12304a) {
            C7264i.m27906o(!this.f12312i, "Result has already been consumed.");
            C7264i.m27906o(mo11976h(), "Result is not ready.");
            eVar = this.f12310g;
            this.f12310g = null;
            this.f12312i = true;
        }
        C3870a1 a1Var = (C3870a1) this.f12309f.getAndSet((Object) null);
        if (a1Var != null) {
            a1Var.f12323a.f12348a.remove(this);
        }
        return (C6823e) C7264i.m27902k(eVar);
    }

    /* renamed from: k */
    private final void m14564k(C6823e eVar) {
        this.f12310g = eVar;
        this.f12311h = eVar.getStatus();
        this.f12307d.countDown();
        boolean z = this.f12313j;
        ArrayList arrayList = this.f12308e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C6819b.C6820a) arrayList.get(i)).mo12110a(this.f12311h);
        }
        this.f12308e.clear();
    }

    /* renamed from: m */
    public static void m14565m(C6823e eVar) {
    }

    /* renamed from: b */
    public final void mo11970b(C6819b.C6820a aVar) {
        boolean z;
        if (aVar != null) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27893b(z, "Callback cannot be null.");
        synchronized (this.f12304a) {
            if (mo11976h()) {
                aVar.mo12110a(this.f12311h);
            } else {
                this.f12308e.add(aVar);
            }
        }
    }

    /* renamed from: c */
    public final C6823e mo11971c(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C7264i.m27901j("await must not be called on the UI thread when time is greater than zero.");
        }
        C7264i.m27906o(!this.f12312i, "Result has already been consumed.");
        C7264i.m27906o(true, "Cannot await if then() has been called.");
        try {
            if (!this.f12307d.await(j, timeUnit)) {
                mo11974f(Status.f12255m);
            }
        } catch (InterruptedException unused) {
            mo11974f(Status.f12253k);
        }
        C7264i.m27906o(mo11976h(), "Result is not ready.");
        return m14563j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11972d() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f12304a
            monitor-enter(r0)
            boolean r1 = r2.f12313j     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x001f
            boolean r1 = r2.f12312i     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x000c
            goto L_0x001f
        L_0x000c:
            k6.e r1 = r2.f12310g     // Catch:{ all -> 0x0021 }
            m14565m(r1)     // Catch:{ all -> 0x0021 }
            r1 = 1
            r2.f12313j = r1     // Catch:{ all -> 0x0021 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f12256n     // Catch:{ all -> 0x0021 }
            k6.e r1 = r2.mo11973e(r1)     // Catch:{ all -> 0x0021 }
            r2.m14564k(r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0021:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo11972d():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C6823e mo11973e(Status status);

    /* renamed from: f */
    public final void mo11974f(Status status) {
        synchronized (this.f12304a) {
            if (!mo11976h()) {
                mo11977i(mo11973e(status));
                this.f12314k = true;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo11975g() {
        boolean z;
        synchronized (this.f12304a) {
            z = this.f12313j;
        }
        return z;
    }

    /* renamed from: h */
    public final boolean mo11976h() {
        return this.f12307d.getCount() == 0;
    }

    /* renamed from: i */
    public final void mo11977i(C6823e eVar) {
        synchronized (this.f12304a) {
            if (this.f12314k || this.f12313j) {
                m14565m(eVar);
                return;
            }
            mo11976h();
            C7264i.m27906o(!mo11976h(), "Results have already been set");
            C7264i.m27906o(!this.f12312i, "Result has already been consumed");
            m14564k(eVar);
        }
    }

    /* renamed from: l */
    public final void mo11978l() {
        boolean z = true;
        if (!this.f12315l && !((Boolean) f12303m.get()).booleanValue()) {
            z = false;
        }
        this.f12315l = z;
    }

    /* renamed from: n */
    public final boolean mo11979n() {
        boolean g;
        synchronized (this.f12304a) {
            if (((C3860c) this.f12306c.get()) == null || !this.f12315l) {
                mo11972d();
            }
            g = mo11975g();
        }
        return g;
    }

    /* renamed from: o */
    public final void mo11980o(C3870a1 a1Var) {
        this.f12309f.set(a1Var);
    }
}

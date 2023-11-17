package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.q4 */
final class C4758q4 extends Thread {

    /* renamed from: d */
    private final Object f14788d;

    /* renamed from: e */
    private final BlockingQueue f14789e;

    /* renamed from: f */
    private boolean f14790f = false;

    /* renamed from: g */
    final /* synthetic */ C4769r4 f14791g;

    public C4758q4(C4769r4 r4Var, String str, BlockingQueue blockingQueue) {
        this.f14791g = r4Var;
        C7264i.m27902k(str);
        C7264i.m27902k(blockingQueue);
        this.f14788d = new Object();
        this.f14789e = blockingQueue;
        setName(str);
    }

    /* renamed from: b */
    private final void m18183b() {
        synchronized (this.f14791g.f14819i) {
            if (!this.f14790f) {
                this.f14791g.f14820j.release();
                this.f14791g.f14819i.notifyAll();
                C4769r4 r4Var = this.f14791g;
                if (this == r4Var.f14813c) {
                    r4Var.f14813c = null;
                } else if (this == r4Var.f14814d) {
                    r4Var.f14814d = null;
                } else {
                    r4Var.f14613a.mo14551d().mo14675r().mo14615a("Current scheduler thread is neither worker nor network");
                }
                this.f14790f = true;
            }
        }
    }

    /* renamed from: c */
    private final void m18184c(InterruptedException interruptedException) {
        this.f14791g.f14613a.mo14551d().mo14680w().mo14616b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: a */
    public final void mo14760a() {
        synchronized (this.f14788d) {
            this.f14788d.notifyAll();
        }
    }

    public final void run() {
        int i;
        boolean z = false;
        while (!z) {
            try {
                this.f14791g.f14820j.acquire();
                z = true;
            } catch (InterruptedException e) {
                m18184c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C4747p4 p4Var = (C4747p4) this.f14789e.poll();
                if (p4Var != null) {
                    if (true != p4Var.f14726e) {
                        i = 10;
                    } else {
                        i = threadPriority;
                    }
                    Process.setThreadPriority(i);
                    p4Var.run();
                } else {
                    synchronized (this.f14788d) {
                        if (this.f14789e.peek() == null) {
                            boolean unused = this.f14791g.f14821k;
                            try {
                                this.f14788d.wait(30000);
                            } catch (InterruptedException e2) {
                                m18184c(e2);
                            }
                        }
                    }
                    synchronized (this.f14791g.f14819i) {
                        if (this.f14789e.peek() == null) {
                            m18183b();
                            m18183b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            m18183b();
            throw th;
        }
    }
}

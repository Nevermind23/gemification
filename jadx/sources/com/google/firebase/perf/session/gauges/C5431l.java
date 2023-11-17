package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p134ja.C6763a;
import p212pa.C7789k;
import p212pa.C7797n;
import p225qa.C7950b;

/* renamed from: com.google.firebase.perf.session.gauges.l */
public class C5431l {

    /* renamed from: f */
    private static final C6763a f17306f = C6763a.m26371e();

    /* renamed from: a */
    private final ScheduledExecutorService f17307a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue f17308b;

    /* renamed from: c */
    private final Runtime f17309c;

    /* renamed from: d */
    private ScheduledFuture f17310d;

    /* renamed from: e */
    private long f17311e;

    C5431l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    /* renamed from: d */
    private int m21557d() {
        return C7797n.m29504c(C7789k.BYTES.mo22550a(this.f17309c.totalMemory() - this.f17309c.freeMemory()));
    }

    /* renamed from: e */
    public static boolean m21558e(long j) {
        return j <= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m21559f(Timer timer) {
        C7950b l = m21563l(timer);
        if (l != null) {
            this.f17308b.add(l);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m21560g(Timer timer) {
        C7950b l = m21563l(timer);
        if (l != null) {
            this.f17308b.add(l);
        }
    }

    /* renamed from: h */
    private synchronized void m21561h(Timer timer) {
        try {
            this.f17307a.schedule(new C5430k(this, timer), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C6763a aVar = f17306f;
            aVar.mo20812j("Unable to collect Memory Metric: " + e.getMessage());
        }
        return;
    }

    /* renamed from: i */
    private synchronized void m21562i(long j, Timer timer) {
        this.f17311e = j;
        try {
            this.f17310d = this.f17307a.scheduleAtFixedRate(new C5429j(this, timer), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C6763a aVar = f17306f;
            aVar.mo20812j("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
        return;
    }

    /* renamed from: l */
    private C7950b m21563l(Timer timer) {
        if (timer == null) {
            return null;
        }
        return (C7950b) C7950b.m30120V().mo23034z(timer.mo18039b()).mo23033A(m21557d()).mo18768o();
    }

    /* renamed from: c */
    public void mo18036c(Timer timer) {
        m21561h(timer);
    }

    /* renamed from: j */
    public void mo18037j(long j, Timer timer) {
        if (!m21558e(j)) {
            if (this.f17310d == null) {
                m21562i(j, timer);
            } else if (this.f17311e != j) {
                mo18038k();
                m21562i(j, timer);
            }
        }
    }

    /* renamed from: k */
    public void mo18038k() {
        ScheduledFuture scheduledFuture = this.f17310d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f17310d = null;
            this.f17311e = -1;
        }
    }

    C5431l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f17310d = null;
        this.f17311e = -1;
        this.f17307a = scheduledExecutorService;
        this.f17308b = new ConcurrentLinkedQueue();
        this.f17309c = runtime;
    }
}

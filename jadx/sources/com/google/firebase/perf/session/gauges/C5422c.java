package com.google.firebase.perf.session.gauges;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p134ja.C6763a;
import p225qa.C7960e;

/* renamed from: com.google.firebase.perf.session.gauges.c */
public class C5422c {

    /* renamed from: g */
    private static final C6763a f17283g = C6763a.m26371e();

    /* renamed from: h */
    private static final long f17284h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: a */
    public final ConcurrentLinkedQueue f17285a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    private final ScheduledExecutorService f17286b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    private final String f17287c;

    /* renamed from: d */
    private final long f17288d;

    /* renamed from: e */
    private ScheduledFuture f17289e = null;

    /* renamed from: f */
    private long f17290f = -1;

    C5422c() {
        int myPid = Process.myPid();
        this.f17287c = "/proc/" + Integer.toString(myPid) + "/stat";
        this.f17288d = m21542e();
    }

    /* renamed from: d */
    private long m21541d(long j) {
        return Math.round((((double) j) / ((double) this.f17288d)) * ((double) f17284h));
    }

    /* renamed from: e */
    private long m21542e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    /* renamed from: f */
    public static boolean m21543f(long j) {
        return j <= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m21544g(Timer timer) {
        C7960e m = m21548m(timer);
        if (m != null) {
            this.f17285a.add(m);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m21545h(Timer timer) {
        C7960e m = m21548m(timer);
        if (m != null) {
            this.f17285a.add(m);
        }
    }

    /* renamed from: i */
    private synchronized void m21546i(Timer timer) {
        try {
            this.f17286b.schedule(new C5421b(this, timer), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C6763a aVar = f17283g;
            aVar.mo20812j("Unable to collect Cpu Metric: " + e.getMessage());
        }
        return;
    }

    /* renamed from: j */
    private synchronized void m21547j(long j, Timer timer) {
        this.f17290f = j;
        try {
            this.f17289e = this.f17286b.scheduleAtFixedRate(new C5420a(this, timer), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C6763a aVar = f17283g;
            aVar.mo20812j("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
        return;
    }

    /* renamed from: m */
    private C7960e m21548m(Timer timer) {
        BufferedReader bufferedReader;
        if (timer == null) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(this.f17287c));
            long b = timer.mo18039b();
            String[] split = bufferedReader.readLine().split(" ");
            long parseLong = Long.parseLong(split[13]);
            long parseLong2 = Long.parseLong(split[15]);
            C7960e eVar = (C7960e) C7960e.m30158W().mo23048z(b).mo23046A(m21541d(Long.parseLong(split[14]) + Long.parseLong(split[16]))).mo23047B(m21541d(parseLong + parseLong2)).mo18768o();
            bufferedReader.close();
            return eVar;
        } catch (IOException e) {
            C6763a aVar = f17283g;
            aVar.mo20812j("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e2) {
            C6763a aVar2 = f17283g;
            aVar2.mo20812j("Unexpected '/proc/[pid]/stat' file format encountered: " + e2.getMessage());
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: c */
    public void mo18026c(Timer timer) {
        m21546i(timer);
    }

    /* renamed from: k */
    public void mo18027k(long j, Timer timer) {
        long j2 = this.f17288d;
        if (j2 != -1 && j2 != 0 && !m21543f(j)) {
            if (this.f17289e == null) {
                m21547j(j, timer);
            } else if (this.f17290f != j) {
                mo18028l();
                m21547j(j, timer);
            }
        }
    }

    /* renamed from: l */
    public void mo18028l() {
        ScheduledFuture scheduledFuture = this.f17289e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f17289e = null;
            this.f17290f = -1;
        }
    }
}

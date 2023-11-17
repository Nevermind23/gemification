package p199oa;

import android.content.Context;
import com.github.mikephil.charting.utils.Utils;
import com.google.firebase.perf.config.C5380a;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p134ja.C6763a;
import p212pa.C7777a;
import p212pa.C7779c;
import p212pa.C7786i;
import p212pa.C7797n;
import p225qa.C7979i;
import p225qa.C7983k;
import p225qa.C7987l;

/* renamed from: oa.d */
final class C7498d {

    /* renamed from: a */
    private final C5380a f21821a;

    /* renamed from: b */
    private final double f21822b;

    /* renamed from: c */
    private final double f21823c;

    /* renamed from: d */
    private C7499a f21824d;

    /* renamed from: e */
    private C7499a f21825e;

    /* renamed from: f */
    private boolean f21826f;

    /* renamed from: oa.d$a */
    static class C7499a {

        /* renamed from: k */
        private static final C6763a f21827k = C6763a.m26371e();

        /* renamed from: l */
        private static final long f21828l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a */
        private final C7777a f21829a;

        /* renamed from: b */
        private final boolean f21830b;

        /* renamed from: c */
        private Timer f21831c;

        /* renamed from: d */
        private C7786i f21832d;

        /* renamed from: e */
        private long f21833e;

        /* renamed from: f */
        private double f21834f;

        /* renamed from: g */
        private C7786i f21835g;

        /* renamed from: h */
        private C7786i f21836h;

        /* renamed from: i */
        private long f21837i;

        /* renamed from: j */
        private long f21838j;

        C7499a(C7786i iVar, long j, C7777a aVar, C5380a aVar2, String str, boolean z) {
            this.f21829a = aVar;
            this.f21833e = j;
            this.f21832d = iVar;
            this.f21834f = (double) j;
            this.f21831c = aVar.mo22535a();
            m28480g(aVar2, str, z);
            this.f21830b = z;
        }

        /* renamed from: c */
        private static long m28476c(C5380a aVar, String str) {
            if (str == "Trace") {
                return aVar.mo17715E();
            }
            return aVar.mo17727q();
        }

        /* renamed from: d */
        private static long m28477d(C5380a aVar, String str) {
            if (str == "Trace") {
                return aVar.mo17730t();
            }
            return aVar.mo17730t();
        }

        /* renamed from: e */
        private static long m28478e(C5380a aVar, String str) {
            if (str == "Trace") {
                return aVar.mo17716F();
            }
            return aVar.mo17728r();
        }

        /* renamed from: f */
        private static long m28479f(C5380a aVar, String str) {
            if (str == "Trace") {
                return aVar.mo17730t();
            }
            return aVar.mo17730t();
        }

        /* renamed from: g */
        private void m28480g(C5380a aVar, String str, boolean z) {
            long f = m28479f(aVar, str);
            long e = m28478e(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C7786i iVar = new C7786i(e, f, timeUnit);
            this.f21835g = iVar;
            this.f21837i = e;
            if (z) {
                f21827k.mo20805b("Foreground %s logging rate:%f, burst capacity:%d", str, iVar, Long.valueOf(e));
            }
            long d = m28477d(aVar, str);
            long c = m28476c(aVar, str);
            C7786i iVar2 = new C7786i(c, d, timeUnit);
            this.f21836h = iVar2;
            this.f21838j = c;
            if (z) {
                f21827k.mo20805b("Background %s logging rate:%f, capacity:%d", str, iVar2, Long.valueOf(c));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo21936a(boolean z) {
            C7786i iVar;
            long j;
            if (z) {
                iVar = this.f21835g;
            } else {
                iVar = this.f21836h;
            }
            this.f21832d = iVar;
            if (z) {
                j = this.f21837i;
            } else {
                j = this.f21838j;
            }
            this.f21833e = j;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
            return false;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean mo21937b(p225qa.C7979i r5) {
            /*
                r4 = this;
                monitor-enter(r4)
                pa.a r5 = r4.f21829a     // Catch:{ all -> 0x0049 }
                com.google.firebase.perf.util.Timer r5 = r5.mo22535a()     // Catch:{ all -> 0x0049 }
                com.google.firebase.perf.util.Timer r0 = r4.f21831c     // Catch:{ all -> 0x0049 }
                long r0 = r0.mo18042e(r5)     // Catch:{ all -> 0x0049 }
                double r0 = (double) r0     // Catch:{ all -> 0x0049 }
                pa.i r2 = r4.f21832d     // Catch:{ all -> 0x0049 }
                double r2 = r2.mo22549a()     // Catch:{ all -> 0x0049 }
                double r0 = r0 * r2
                long r2 = f21828l     // Catch:{ all -> 0x0049 }
                double r2 = (double) r2     // Catch:{ all -> 0x0049 }
                double r0 = r0 / r2
                r2 = 0
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 <= 0) goto L_0x002d
                double r2 = r4.f21834f     // Catch:{ all -> 0x0049 }
                double r2 = r2 + r0
                long r0 = r4.f21833e     // Catch:{ all -> 0x0049 }
                double r0 = (double) r0     // Catch:{ all -> 0x0049 }
                double r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x0049 }
                r4.f21834f = r0     // Catch:{ all -> 0x0049 }
                r4.f21831c = r5     // Catch:{ all -> 0x0049 }
            L_0x002d:
                double r0 = r4.f21834f     // Catch:{ all -> 0x0049 }
                r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 < 0) goto L_0x003b
                double r0 = r0 - r2
                r4.f21834f = r0     // Catch:{ all -> 0x0049 }
                monitor-exit(r4)
                r5 = 1
                return r5
            L_0x003b:
                boolean r5 = r4.f21830b     // Catch:{ all -> 0x0049 }
                if (r5 == 0) goto L_0x0046
                ja.a r5 = f21827k     // Catch:{ all -> 0x0049 }
                java.lang.String r0 = "Exceeded log rate limit, dropping the log."
                r5.mo20812j(r0)     // Catch:{ all -> 0x0049 }
            L_0x0046:
                monitor-exit(r4)
                r5 = 0
                return r5
            L_0x0049:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p199oa.C7498d.C7499a.mo21937b(qa.i):boolean");
        }
    }

    public C7498d(Context context, C7786i iVar, long j) {
        this(iVar, j, new C7777a(), m28466b(), m28466b(), C5380a.m21272g());
        this.f21826f = C7797n.m29503b(context);
    }

    /* renamed from: b */
    static double m28466b() {
        return new Random().nextDouble();
    }

    /* renamed from: c */
    private boolean m28467c(List list) {
        if (list.size() <= 0 || ((C7983k) list.get(0)).mo23111Y() <= 0 || ((C7983k) list.get(0)).mo23110X(0) != C7987l.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m28468d() {
        if (this.f21823c < this.f21821a.mo17722f()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m28469e() {
        if (this.f21822b < this.f21821a.mo17729s()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m28470f() {
        if (this.f21822b < this.f21821a.mo17717G()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21931a(boolean z) {
        this.f21824d.mo21936a(z);
        this.f21825e.mo21936a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo21932g(C7979i iVar) {
        if (!mo21935j(iVar)) {
            return false;
        }
        if (iVar.mo23101b()) {
            return !this.f21825e.mo21937b(iVar);
        }
        if (iVar.mo23103h()) {
            return !this.f21824d.mo21937b(iVar);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo21933h(C7979i iVar) {
        if (iVar.mo23103h() && !m28470f() && !m28467c(iVar.mo23104j().mo23120s0())) {
            return false;
        }
        if (mo21934i(iVar) && !m28468d() && !m28467c(iVar.mo23104j().mo23120s0())) {
            return false;
        }
        if (!iVar.mo23101b() || m28469e() || m28467c(iVar.mo23102c().mo23069n0())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo21934i(C7979i iVar) {
        if (!iVar.mo23103h() || !iVar.mo23104j().mo23119r0().startsWith("_st_") || !iVar.mo23104j().mo23114g0("Hosting_activity")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo21935j(C7979i iVar) {
        if ((!iVar.mo23103h() || ((!iVar.mo23104j().mo23119r0().equals(C7779c.FOREGROUND_TRACE_NAME.toString()) && !iVar.mo23104j().mo23119r0().equals(C7779c.BACKGROUND_TRACE_NAME.toString())) || iVar.mo23104j().mo23115j0() <= 0)) && !iVar.mo23100a()) {
            return true;
        }
        return false;
    }

    C7498d(C7786i iVar, long j, C7777a aVar, double d, double d2, C5380a aVar2) {
        double d3 = d;
        double d4 = d2;
        this.f21824d = null;
        this.f21825e = null;
        boolean z = false;
        this.f21826f = false;
        C7797n.m29502a(Utils.DOUBLE_EPSILON <= d3 && d3 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (Utils.DOUBLE_EPSILON <= d4 && d4 < 1.0d) {
            z = true;
        }
        C7797n.m29502a(z, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f21822b = d3;
        this.f21823c = d4;
        this.f21821a = aVar2;
        C7786i iVar2 = iVar;
        long j2 = j;
        C7777a aVar3 = aVar;
        C5380a aVar4 = aVar2;
        this.f21824d = new C7499a(iVar2, j2, aVar3, aVar4, "Trace", this.f21826f);
        this.f21825e = new C7499a(iVar2, j2, aVar3, aVar4, "Network", this.f21826f);
    }
}

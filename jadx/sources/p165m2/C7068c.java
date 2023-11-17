package p165m2;

import android.net.TrafficStats;
import com.androidnetworking.error.ANError;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import of1.C41869b0;
import of1.C41871c;
import of1.C41872c0;
import of1.C41880d0;
import of1.C41928u;
import of1.C41935w;
import of1.C41944z;
import p113i2.C6511a;
import p113i2.C6522c;
import p152l2.C6867a;
import p191o2.C7421c;

/* renamed from: m2.c */
public abstract class C7068c {

    /* renamed from: a */
    public static C41944z f21006a = m27328b();

    /* renamed from: b */
    public static String f21007b = null;

    /* renamed from: m2.c$a */
    static class C7069a implements C41935w {

        /* renamed from: a */
        final /* synthetic */ C6511a f21008a;

        C7069a(C6511a aVar) {
            this.f21008a = aVar;
        }

        /* renamed from: a */
        public C41880d0 mo21294a(C41935w.C41936a aVar) {
            C41880d0 a = aVar.mo97008a(aVar.mo97011w());
            return a.mo96736Q().mo96763b(new C7075f(a.mo96739a(), this.f21008a.mo20473u())).mo96764c();
        }
    }

    /* renamed from: m2.c$b */
    static class C7070b implements C41935w {

        /* renamed from: a */
        final /* synthetic */ C6511a f21009a;

        C7070b(C6511a aVar) {
            this.f21009a = aVar;
        }

        /* renamed from: a */
        public C41880d0 mo21294a(C41935w.C41936a aVar) {
            C41880d0 a = aVar.mo97008a(aVar.mo97011w());
            return a.mo96736Q().mo96763b(new C7075f(a.mo96739a(), this.f21009a.mo20473u())).mo96764c();
        }
    }

    /* renamed from: a */
    public static void m27327a(C41869b0.C41870a aVar, C6511a aVar2) {
        if (aVar2.mo20450H() != null) {
            aVar.mo96683a("User-Agent", aVar2.mo20450H());
        } else {
            String str = f21007b;
            if (str != null) {
                aVar2.mo20458P(str);
                aVar.mo96683a("User-Agent", f21007b);
            }
        }
        C41928u w = aVar2.mo20475w();
        if (w != null) {
            aVar.mo96692j(w);
            if (aVar2.mo20450H() != null && !w.mo96929i().contains("User-Agent")) {
                aVar.mo96683a("User-Agent", aVar2.mo20450H());
            }
        }
    }

    /* renamed from: b */
    public static C41944z m27328b() {
        C41944z zVar = f21006a;
        if (zVar == null) {
            return m27329c();
        }
        return zVar;
    }

    /* renamed from: c */
    public static C41944z m27329c() {
        C41944z.C41945a B = new C41944z().mo97033B();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return B.mo97101f(60, timeUnit).mo97079O(60, timeUnit).mo97102f0(60, timeUnit).mo97097d();
    }

    /* renamed from: d */
    public static C41880d0 m27330d(C6511a aVar) {
        C41944z zVar;
        long j;
        try {
            C41869b0.C41870a w = new C41869b0.C41870a().mo96705w(aVar.mo20449G());
            m27327a(w, aVar);
            C41869b0.C41870a e = w.mo96687e();
            if (aVar.mo20469r() != null) {
                e.mo96685c(aVar.mo20469r());
            }
            C41869b0 b = e.mo96684b();
            if (aVar.mo20478z() != null) {
                C41944z.C41945a B = aVar.mo20478z().mo97033B();
                f21006a.mo97048f();
                zVar = B.mo97099e((C41871c) null).mo97093b(new C7069a(aVar)).mo97097d();
            } else {
                zVar = f21006a.mo97033B().mo97093b(new C7070b(aVar)).mo97097d();
            }
            aVar.mo20453K(zVar.mo96791a(b));
            long currentTimeMillis = System.currentTimeMillis();
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            C41880d0 v = aVar.mo20470s().mo96788v();
            C7421c.m28238i(v, aVar.mo20471t(), aVar.mo20474v());
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (v.mo96745n() == null) {
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                if (totalRxBytes != -1) {
                    if (totalRxBytes2 != -1) {
                        j = totalRxBytes2 - totalRxBytes;
                        C6522c.m25792a().mo20501b(j, currentTimeMillis2);
                        aVar.mo20467p();
                        C7421c.m28239j((C6867a) null, currentTimeMillis2, -1, v.mo96739a().mo21302o(), false);
                    }
                }
                j = v.mo96739a().mo21302o();
                C6522c.m25792a().mo20501b(j, currentTimeMillis2);
                aVar.mo20467p();
                C7421c.m28239j((C6867a) null, currentTimeMillis2, -1, v.mo96739a().mo21302o(), false);
            } else {
                aVar.mo20467p();
            }
            return v;
        } catch (IOException e2) {
            try {
                File file = new File(aVar.mo20471t() + File.separator + aVar.mo20474v());
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            throw new ANError((Throwable) e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00da A[Catch:{ IOException -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0 A[Catch:{ IOException -> 0x00f3 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static of1.C41880d0 m27331e(p113i2.C6511a r17) {
        /*
            r0 = r17
            of1.b0$a r1 = new of1.b0$a     // Catch:{ IOException -> 0x00f3 }
            r1.<init>()     // Catch:{ IOException -> 0x00f3 }
            java.lang.String r2 = r17.mo20449G()     // Catch:{ IOException -> 0x00f3 }
            of1.b0$a r1 = r1.mo96705w(r2)     // Catch:{ IOException -> 0x00f3 }
            m27327a(r1, r0)     // Catch:{ IOException -> 0x00f3 }
            int r2 = r17.mo20476x()     // Catch:{ IOException -> 0x00f3 }
            r3 = 0
            switch(r2) {
                case 0: goto L_0x004c;
                case 1: goto L_0x0043;
                case 2: goto L_0x003a;
                case 3: goto L_0x0031;
                case 4: goto L_0x002c;
                case 5: goto L_0x0023;
                case 6: goto L_0x001c;
                default: goto L_0x001a;
            }     // Catch:{ IOException -> 0x00f3 }
        L_0x001a:
            r2 = r3
            goto L_0x0051
        L_0x001c:
            java.lang.String r2 = "OPTIONS"
            of1.b0$a r1 = r1.mo96693k(r2, r3)     // Catch:{ IOException -> 0x00f3 }
            goto L_0x001a
        L_0x0023:
            of1.c0 r2 = r17.mo20444B()     // Catch:{ IOException -> 0x00f3 }
            of1.b0$a r1 = r1.mo96694l(r2)     // Catch:{ IOException -> 0x00f3 }
            goto L_0x0051
        L_0x002c:
            of1.b0$a r1 = r1.mo96690h()     // Catch:{ IOException -> 0x00f3 }
            goto L_0x001a
        L_0x0031:
            of1.c0 r2 = r17.mo20444B()     // Catch:{ IOException -> 0x00f3 }
            of1.b0$a r1 = r1.mo96686d(r2)     // Catch:{ IOException -> 0x00f3 }
            goto L_0x0051
        L_0x003a:
            of1.c0 r2 = r17.mo20444B()     // Catch:{ IOException -> 0x00f3 }
            of1.b0$a r1 = r1.mo96696n(r2)     // Catch:{ IOException -> 0x00f3 }
            goto L_0x0051
        L_0x0043:
            of1.c0 r2 = r17.mo20444B()     // Catch:{ IOException -> 0x00f3 }
            of1.b0$a r1 = r1.mo96695m(r2)     // Catch:{ IOException -> 0x00f3 }
            goto L_0x0051
        L_0x004c:
            of1.b0$a r1 = r1.mo96687e()     // Catch:{ IOException -> 0x00f3 }
            goto L_0x001a
        L_0x0051:
            of1.d r4 = r17.mo20469r()     // Catch:{ IOException -> 0x00f3 }
            if (r4 == 0) goto L_0x005e
            of1.d r4 = r17.mo20469r()     // Catch:{ IOException -> 0x00f3 }
            r1.mo96685c(r4)     // Catch:{ IOException -> 0x00f3 }
        L_0x005e:
            of1.b0 r1 = r1.mo96684b()     // Catch:{ IOException -> 0x00f3 }
            of1.z r4 = r17.mo20478z()     // Catch:{ IOException -> 0x00f3 }
            if (r4 == 0) goto L_0x0085
            of1.z r4 = r17.mo20478z()     // Catch:{ IOException -> 0x00f3 }
            of1.z$a r4 = r4.mo97033B()     // Catch:{ IOException -> 0x00f3 }
            of1.z r5 = f21006a     // Catch:{ IOException -> 0x00f3 }
            r5.mo97048f()     // Catch:{ IOException -> 0x00f3 }
            of1.z$a r3 = r4.mo97099e(r3)     // Catch:{ IOException -> 0x00f3 }
            of1.z r3 = r3.mo97097d()     // Catch:{ IOException -> 0x00f3 }
            of1.e r1 = r3.mo96791a(r1)     // Catch:{ IOException -> 0x00f3 }
            r0.mo20453K(r1)     // Catch:{ IOException -> 0x00f3 }
            goto L_0x008e
        L_0x0085:
            of1.z r3 = f21006a     // Catch:{ IOException -> 0x00f3 }
            of1.e r1 = r3.mo96791a(r1)     // Catch:{ IOException -> 0x00f3 }
            r0.mo20453K(r1)     // Catch:{ IOException -> 0x00f3 }
        L_0x008e:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00f3 }
            long r5 = android.net.TrafficStats.getTotalRxBytes()     // Catch:{ IOException -> 0x00f3 }
            of1.e r1 = r17.mo20470s()     // Catch:{ IOException -> 0x00f3 }
            of1.d0 r1 = r1.mo96788v()     // Catch:{ IOException -> 0x00f3 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00f3 }
            long r10 = r7 - r3
            of1.d0 r3 = r1.mo96745n()     // Catch:{ IOException -> 0x00f3 }
            if (r3 != 0) goto L_0x00ef
            long r3 = android.net.TrafficStats.getTotalRxBytes()     // Catch:{ IOException -> 0x00f3 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x00bb
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            long r3 = r3 - r5
            goto L_0x00c3
        L_0x00bb:
            of1.e0 r3 = r1.mo96739a()     // Catch:{ IOException -> 0x00f3 }
            long r3 = r3.mo21302o()     // Catch:{ IOException -> 0x00f3 }
        L_0x00c3:
            i2.c r5 = p113i2.C6522c.m25792a()     // Catch:{ IOException -> 0x00f3 }
            r5.mo20501b(r3, r10)     // Catch:{ IOException -> 0x00f3 }
            r17.mo20467p()     // Catch:{ IOException -> 0x00f3 }
            r9 = 0
            if (r2 == 0) goto L_0x00e0
            long r3 = r2.mo21298a()     // Catch:{ IOException -> 0x00f3 }
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00e0
            long r2 = r2.mo21298a()     // Catch:{ IOException -> 0x00f3 }
            r12 = r2
            goto L_0x00e1
        L_0x00e0:
            r12 = r7
        L_0x00e1:
            of1.e0 r0 = r1.mo96739a()     // Catch:{ IOException -> 0x00f3 }
            long r14 = r0.mo21302o()     // Catch:{ IOException -> 0x00f3 }
            r16 = 0
            p191o2.C7421c.m28239j(r9, r10, r12, r14, r16)     // Catch:{ IOException -> 0x00f3 }
            goto L_0x00f2
        L_0x00ef:
            r17.mo20467p()     // Catch:{ IOException -> 0x00f3 }
        L_0x00f2:
            return r1
        L_0x00f3:
            r0 = move-exception
            com.androidnetworking.error.ANError r1 = new com.androidnetworking.error.ANError
            r1.<init>((java.lang.Throwable) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p165m2.C7068c.m27331e(i2.a):of1.d0");
    }

    /* renamed from: f */
    public static C41880d0 m27332f(C6511a aVar) {
        try {
            C41869b0.C41870a w = new C41869b0.C41870a().mo96705w(aVar.mo20449G());
            m27327a(w, aVar);
            C41872c0 y = aVar.mo20477y();
            y.mo21298a();
            C41869b0.C41870a m = w.mo96695m(new C7073e(y, aVar.mo20448F()));
            if (aVar.mo20469r() != null) {
                m.mo96685c(aVar.mo20469r());
            }
            C41869b0 b = m.mo96684b();
            if (aVar.mo20478z() != null) {
                C41944z.C41945a B = aVar.mo20478z().mo97033B();
                f21006a.mo97048f();
                aVar.mo20453K(B.mo97099e((C41871c) null).mo97097d().mo96791a(b));
            } else {
                aVar.mo20453K(f21006a.mo96791a(b));
            }
            System.currentTimeMillis();
            C41880d0 v = aVar.mo20470s().mo96788v();
            System.currentTimeMillis();
            aVar.mo20467p();
            return v;
        } catch (IOException e) {
            throw new ANError((Throwable) e);
        }
    }
}

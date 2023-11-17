package p040c9;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: c9.c */
public class C2282c implements C2281b, C2280a {

    /* renamed from: a */
    private final C2284e f7081a;

    /* renamed from: b */
    private final int f7082b;

    /* renamed from: c */
    private final TimeUnit f7083c;

    /* renamed from: d */
    private final Object f7084d = new Object();

    /* renamed from: e */
    private CountDownLatch f7085e;

    /* renamed from: f */
    private boolean f7086f = false;

    public C2282c(C2284e eVar, int i, TimeUnit timeUnit) {
        this.f7081a = eVar;
        this.f7082b = i;
        this.f7083c = timeUnit;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        p027b9.C2184f.m8346f().mo7091d("Interrupted while awaiting app exception callback from Analytics listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122a(java.lang.String r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7084d
            monitor-enter(r0)
            b9.f r1 = p027b9.C2184f.m8346f()     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r2.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r3 = "Logging event "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r3 = " to Firebase Analytics with params "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r7)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x006d }
            r1.mo7095i(r2)     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x006d }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x006d }
            r5.f7085e = r1     // Catch:{ all -> 0x006d }
            r1 = 0
            r5.f7086f = r1     // Catch:{ all -> 0x006d }
            c9.e r1 = r5.f7081a     // Catch:{ all -> 0x006d }
            r1.mo122a(r6, r7)     // Catch:{ all -> 0x006d }
            b9.f r6 = p027b9.C2184f.m8346f()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "Awaiting app exception callback from Analytics..."
            r6.mo7095i(r7)     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r6 = r5.f7085e     // Catch:{ InterruptedException -> 0x005f }
            int r7 = r5.f7082b     // Catch:{ InterruptedException -> 0x005f }
            long r3 = (long) r7     // Catch:{ InterruptedException -> 0x005f }
            java.util.concurrent.TimeUnit r7 = r5.f7083c     // Catch:{ InterruptedException -> 0x005f }
            boolean r6 = r6.await(r3, r7)     // Catch:{ InterruptedException -> 0x005f }
            if (r6 == 0) goto L_0x0055
            r5.f7086f = r2     // Catch:{ InterruptedException -> 0x005f }
            b9.f r6 = p027b9.C2184f.m8346f()     // Catch:{ InterruptedException -> 0x005f }
            java.lang.String r7 = "App exception callback received from Analytics listener."
            r6.mo7095i(r7)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0068
        L_0x0055:
            b9.f r6 = p027b9.C2184f.m8346f()     // Catch:{ InterruptedException -> 0x005f }
            java.lang.String r7 = "Timeout exceeded while awaiting app exception callback from Analytics listener."
            r6.mo7097k(r7)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0068
        L_0x005f:
            b9.f r6 = p027b9.C2184f.m8346f()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "Interrupted while awaiting app exception callback from Analytics listener."
            r6.mo7091d(r7)     // Catch:{ all -> 0x006d }
        L_0x0068:
            r6 = 0
            r5.f7085e = r6     // Catch:{ all -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            return
        L_0x006d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c9.C2282c.mo122a(java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: b */
    public void mo7325b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f7085e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}

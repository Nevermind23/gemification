package p113i2;

/* renamed from: i2.c */
public class C6522c {

    /* renamed from: e */
    private static C6522c f19933e;

    /* renamed from: a */
    private C6523d f19934a = C6523d.UNKNOWN;

    /* renamed from: b */
    private int f19935b = 0;

    /* renamed from: c */
    private int f19936c = 0;

    /* renamed from: d */
    private int f19937d = 0;

    /* renamed from: a */
    public static C6522c m25792a() {
        if (f19933e == null) {
            synchronized (C6522c.class) {
                if (f19933e == null) {
                    f19933e = new C6522c();
                }
            }
        }
        return f19933e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0076, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo20501b(long r3, long r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0075
            r0 = 20000(0x4e20, double:9.8813E-320)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0075
            double r3 = (double) r3
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 * r0
            double r5 = (double) r5
            double r3 = r3 / r5
            r5 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r3 = r3 * r5
            r5 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x001d
            goto L_0x0075
        L_0x001d:
            int r5 = r2.f19935b     // Catch:{ all -> 0x0072 }
            int r6 = r2.f19936c     // Catch:{ all -> 0x0072 }
            int r5 = r5 * r6
            double r0 = (double) r5     // Catch:{ all -> 0x0072 }
            double r0 = r0 + r3
            int r3 = r6 + 1
            double r3 = (double) r3     // Catch:{ all -> 0x0072 }
            double r0 = r0 / r3
            int r3 = (int) r0     // Catch:{ all -> 0x0072 }
            r2.f19935b = r3     // Catch:{ all -> 0x0072 }
            int r6 = r6 + 1
            r2.f19936c = r6     // Catch:{ all -> 0x0072 }
            r4 = 5
            if (r6 == r4) goto L_0x003b
            i2.d r5 = r2.f19934a     // Catch:{ all -> 0x0072 }
            i2.d r0 = p113i2.C6523d.UNKNOWN     // Catch:{ all -> 0x0072 }
            if (r5 != r0) goto L_0x0070
            r5 = 2
            if (r6 != r5) goto L_0x0070
        L_0x003b:
            i2.d r5 = r2.f19934a     // Catch:{ all -> 0x0072 }
            r2.f19937d = r3     // Catch:{ all -> 0x0072 }
            if (r3 > 0) goto L_0x0046
            i2.d r3 = p113i2.C6523d.UNKNOWN     // Catch:{ all -> 0x0072 }
            r2.f19934a = r3     // Catch:{ all -> 0x0072 }
            goto L_0x0067
        L_0x0046:
            r0 = 150(0x96, float:2.1E-43)
            if (r3 >= r0) goto L_0x004f
            i2.d r3 = p113i2.C6523d.POOR     // Catch:{ all -> 0x0072 }
            r2.f19934a = r3     // Catch:{ all -> 0x0072 }
            goto L_0x0067
        L_0x004f:
            r0 = 550(0x226, float:7.71E-43)
            if (r3 >= r0) goto L_0x0058
            i2.d r3 = p113i2.C6523d.MODERATE     // Catch:{ all -> 0x0072 }
            r2.f19934a = r3     // Catch:{ all -> 0x0072 }
            goto L_0x0067
        L_0x0058:
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r3 >= r0) goto L_0x0061
            i2.d r3 = p113i2.C6523d.GOOD     // Catch:{ all -> 0x0072 }
            r2.f19934a = r3     // Catch:{ all -> 0x0072 }
            goto L_0x0067
        L_0x0061:
            if (r3 <= r0) goto L_0x0067
            i2.d r3 = p113i2.C6523d.EXCELLENT     // Catch:{ all -> 0x0072 }
            r2.f19934a = r3     // Catch:{ all -> 0x0072 }
        L_0x0067:
            if (r6 != r4) goto L_0x006e
            r3 = 0
            r2.f19935b = r3     // Catch:{ all -> 0x0072 }
            r2.f19936c = r3     // Catch:{ all -> 0x0072 }
        L_0x006e:
            i2.d r3 = r2.f19934a     // Catch:{ all -> 0x0072 }
        L_0x0070:
            monitor-exit(r2)
            return
        L_0x0072:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0075:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p113i2.C6522c.mo20501b(long, long):void");
    }
}

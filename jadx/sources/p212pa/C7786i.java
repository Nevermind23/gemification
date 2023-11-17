package p212pa;

import java.util.concurrent.TimeUnit;

/* renamed from: pa.i */
public class C7786i {

    /* renamed from: a */
    private long f22507a;

    /* renamed from: b */
    private long f22508b;

    /* renamed from: c */
    private TimeUnit f22509c;

    /* renamed from: pa.i$a */
    static /* synthetic */ class C7787a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22510a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22510a = r0
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22510a     // Catch:{ NoSuchFieldError -> 0x001d }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22510a     // Catch:{ NoSuchFieldError -> 0x0028 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p212pa.C7786i.C7787a.<clinit>():void");
        }
    }

    public C7786i(long j, long j2, TimeUnit timeUnit) {
        this.f22507a = j;
        this.f22508b = j2;
        this.f22509c = timeUnit;
    }

    /* renamed from: a */
    public double mo22549a() {
        int i = C7787a.f22510a[this.f22509c.ordinal()];
        if (i == 1) {
            return (((double) this.f22507a) / ((double) this.f22508b)) * ((double) TimeUnit.SECONDS.toNanos(1));
        }
        if (i == 2) {
            return (((double) this.f22507a) / ((double) this.f22508b)) * ((double) TimeUnit.SECONDS.toMicros(1));
        }
        if (i != 3) {
            return ((double) this.f22507a) / ((double) this.f22509c.toSeconds(this.f22508b));
        }
        return (((double) this.f22507a) / ((double) this.f22508b)) * ((double) TimeUnit.SECONDS.toMillis(1));
    }
}

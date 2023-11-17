package p342j$.time.temporal;

import p342j$.time.DayOfWeek;
import p342j$.time.LocalDate;
import p342j$.time.chrono.C9289a;
import p342j$.time.chrono.C9291c;
import p342j$.time.chrono.C9295g;

/* renamed from: j$.time.temporal.g */
enum C9339g implements TemporalField {
    ;
    
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final int[] f25873a = null;

    static {
        f25873a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* renamed from: k */
    static boolean m34484k(TemporalAccessor temporalAccessor) {
        return ((C9289a) C9291c.m34327b(temporalAccessor)).equals(C9295g.f25767a);
    }

    /* renamed from: m */
    static C9347o m34486m(LocalDate localDate) {
        return C9347o.m34511i(1, (long) m34491r(m34490q(localDate)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if ((r0 == -3 || (r0 == -2 && r5.mo24964r())) == false) goto L_0x005a;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m34487n(p342j$.time.LocalDate r5) {
        /*
            j$.time.DayOfWeek r0 = r5.getDayOfWeek()
            int r0 = r0.ordinal()
            int r1 = r5.mo24960p()
            r2 = 1
            int r1 = r1 - r2
            int r0 = 3 - r0
            int r0 = r0 + r1
            int r3 = r0 / 7
            int r3 = r3 * 7
            int r0 = r0 - r3
            r3 = -3
            int r0 = r0 + r3
            if (r0 >= r3) goto L_0x001c
            int r0 = r0 + 7
        L_0x001c:
            if (r1 >= r0) goto L_0x003f
            r0 = 180(0xb4, float:2.52E-43)
            j$.time.LocalDate r5 = r5.mo24971y(r0)
            r0 = -1
            j$.time.LocalDate r5 = r5.mo24967v(r0)
            int r5 = m34490q(r5)
            int r5 = m34491r(r5)
            long r0 = (long) r5
            r2 = 1
            j$.time.temporal.o r5 = p342j$.time.temporal.C9347o.m34511i(r2, r0)
            long r0 = r5.mo25136d()
            int r5 = (int) r0
            goto L_0x005b
        L_0x003f:
            int r1 = r1 - r0
            int r1 = r1 / 7
            int r1 = r1 + r2
            r4 = 53
            if (r1 != r4) goto L_0x0059
            if (r0 == r3) goto L_0x0055
            r3 = -2
            if (r0 != r3) goto L_0x0053
            boolean r5 = r5.mo24964r()
            if (r5 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r5 = 0
            goto L_0x0056
        L_0x0055:
            r5 = r2
        L_0x0056:
            if (r5 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r2 = r1
        L_0x005a:
            r5 = r2
        L_0x005b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.time.temporal.C9339g.m34487n(j$.time.LocalDate):int");
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static int m34490q(LocalDate localDate) {
        int year = localDate.getYear();
        int p = localDate.mo24960p();
        if (p <= 3) {
            return p - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (p < 363) {
            return year;
        }
        return ((p - 363) - (localDate.mo24964r() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static int m34491r(int i) {
        LocalDate of = LocalDate.m34218of(i, 1, 1);
        if (of.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (of.getDayOfWeek() != DayOfWeek.WEDNESDAY || !of.mo24964r()) ? 52 : 53;
        }
        return 53;
    }

    /* renamed from: a */
    public final boolean mo25110a() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo25111c() {
        return true;
    }

    /* renamed from: j */
    public C9347o mo25116j(TemporalAccessor temporalAccessor) {
        return mo25112e();
    }
}

package p342j$.time;

import java.io.Serializable;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p342j$.lang.C9284a;
import p342j$.time.temporal.C9333a;
import p342j$.time.temporal.C9343k;
import p342j$.time.temporal.C9344l;
import p342j$.time.temporal.C9345m;
import p342j$.time.temporal.C9346n;
import p342j$.time.temporal.C9347o;
import p342j$.time.temporal.ChronoUnit;
import p342j$.time.temporal.Temporal;
import p342j$.time.temporal.TemporalAccessor;
import p342j$.time.temporal.TemporalField;

/* renamed from: j$.time.h */
public final class C9327h implements Temporal, Comparable, Serializable {

    /* renamed from: e */
    public static final C9327h f25845e;

    /* renamed from: f */
    public static final C9327h f25846f = new C9327h(23, 59, 59, 999999999);

    /* renamed from: g */
    private static final C9327h[] f25847g = new C9327h[24];

    /* renamed from: a */
    private final byte f25848a;

    /* renamed from: b */
    private final byte f25849b;

    /* renamed from: c */
    private final byte f25850c;

    /* renamed from: d */
    private final int f25851d;

    static {
        int i = 0;
        while (true) {
            C9327h[] hVarArr = f25847g;
            if (i < hVarArr.length) {
                hVarArr[i] = new C9327h(i, 0, 0, 0);
                i++;
            } else {
                C9327h hVar = hVarArr[0];
                C9327h hVar2 = hVarArr[12];
                f25845e = hVar;
                return;
            }
        }
    }

    private C9327h(int i, int i2, int i3, int i4) {
        this.f25848a = (byte) i;
        this.f25849b = (byte) i2;
        this.f25850c = (byte) i3;
        this.f25851d = i4;
    }

    /* renamed from: l */
    private static C9327h m34398l(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? f25847g[i] : new C9327h(i, i2, i3, i4);
    }

    /* renamed from: m */
    public static C9327h m34399m(TemporalAccessor temporalAccessor) {
        if (temporalAccessor != null) {
            C9327h hVar = (C9327h) temporalAccessor.mo24922i(C9343k.m34501c());
            if (hVar != null) {
                return hVar;
            }
            throw new C9288c("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
        }
        throw new NullPointerException("temporal");
    }

    /* renamed from: n */
    private int m34400n(TemporalField temporalField) {
        switch (C9326g.f25843a[((C9333a) temporalField).ordinal()]) {
            case 1:
                return this.f25851d;
            case 2:
                throw new C9346n("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f25851d / 1000;
            case 4:
                throw new C9346n("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f25851d / 1000000;
            case 6:
                return (int) (mo25099w() / 1000000);
            case 7:
                return this.f25850c;
            case 8:
                return mo25100x();
            case 9:
                return this.f25849b;
            case 10:
                return (this.f25848a * 60) + this.f25849b;
            case 11:
                return this.f25848a % 12;
            case 12:
                int i = this.f25848a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.f25848a;
            case 14:
                byte b = this.f25848a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.f25848a / 12;
            default:
                throw new C9346n("Unsupported field: " + temporalField);
        }
    }

    /* renamed from: q */
    public static C9327h m34401q() {
        C9333a.HOUR_OF_DAY.mo25127l((long) 0);
        return f25847g[0];
    }

    /* renamed from: r */
    public static C9327h m34402r(long j) {
        C9333a.NANO_OF_DAY.mo25127l(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return m34398l(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    /* renamed from: b */
    public final boolean mo24916b(TemporalField temporalField) {
        return temporalField instanceof C9333a ? temporalField.mo25110a() : temporalField != null && temporalField.mo25114h(this);
    }

    /* renamed from: c */
    public final Temporal mo24933c(LocalDate localDate) {
        boolean z = localDate instanceof C9327h;
        TemporalAccessor temporalAccessor = localDate;
        if (!z) {
            temporalAccessor = localDate.mo24956k(this);
        }
        return (C9327h) temporalAccessor;
    }

    /* renamed from: e */
    public final C9347o mo24917e(TemporalField temporalField) {
        return C9284a.m34177d(this, temporalField);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9327h)) {
            return false;
        }
        C9327h hVar = (C9327h) obj;
        return this.f25848a == hVar.f25848a && this.f25849b == hVar.f25849b && this.f25850c == hVar.f25850c && this.f25851d == hVar.f25851d;
    }

    /* renamed from: f */
    public final long mo24918f(TemporalField temporalField) {
        return temporalField instanceof C9333a ? temporalField == C9333a.NANO_OF_DAY ? mo25099w() : temporalField == C9333a.MICRO_OF_DAY ? mo25099w() / 1000 : (long) m34400n(temporalField) : temporalField.mo25113f(this);
    }

    public final int get(TemporalField temporalField) {
        return temporalField instanceof C9333a ? m34400n(temporalField) : C9284a.m34175b(this, temporalField);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        r3 = r3 * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return mo25094s(r3);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p342j$.time.temporal.Temporal mo24936h(long r3, p342j$.time.temporal.C9345m r5) {
        /*
            r2 = this;
            boolean r0 = r5 instanceof p342j$.time.temporal.ChronoUnit
            if (r0 == 0) goto L_0x0051
            int[] r0 = p342j$.time.C9326g.f25844b
            r1 = r5
            j$.time.temporal.ChronoUnit r1 = (p342j$.time.temporal.ChronoUnit) r1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x004c;
                case 2: goto L_0x0043;
                case 3: goto L_0x003b;
                case 4: goto L_0x0036;
                case 5: goto L_0x0031;
                case 6: goto L_0x002c;
                case 7: goto L_0x0026;
                default: goto L_0x0012;
            }
        L_0x0012:
            j$.time.temporal.n r3 = new j$.time.temporal.n
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Unsupported unit: "
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0026:
            r0 = 2
            long r3 = r3 % r0
            r0 = 12
            long r3 = r3 * r0
        L_0x002c:
            j$.time.h r3 = r2.mo25094s(r3)
            goto L_0x0057
        L_0x0031:
            j$.time.h r3 = r2.mo25095t(r3)
            goto L_0x0057
        L_0x0036:
            j$.time.h r3 = r2.mo25098v(r3)
            goto L_0x0057
        L_0x003b:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 % r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            goto L_0x004b
        L_0x0043:
            r0 = 86400000000(0x141dd76000, double:4.26872718007E-313)
            long r3 = r3 % r0
            r0 = 1000(0x3e8, double:4.94E-321)
        L_0x004b:
            long r3 = r3 * r0
        L_0x004c:
            j$.time.h r3 = r2.mo25097u(r3)
            goto L_0x0057
        L_0x0051:
            j$.time.temporal.Temporal r3 = r5.mo25108e(r2, r3)
            j$.time.h r3 = (p342j$.time.C9327h) r3
        L_0x0057:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.time.C9327h.mo24936h(long, j$.time.temporal.m):j$.time.temporal.Temporal");
    }

    public final int hashCode() {
        long w = mo25099w();
        return (int) (w ^ (w >>> 32));
    }

    /* renamed from: i */
    public final Object mo24922i(C9344l lVar) {
        if (lVar == C9343k.m34499a() || lVar == C9343k.m34505g() || lVar == C9343k.m34504f() || lVar == C9343k.m34502d()) {
            return null;
        }
        if (lVar == C9343k.m34501c()) {
            return this;
        }
        if (lVar == C9343k.m34500b()) {
            return null;
        }
        return lVar == C9343k.m34503e() ? ChronoUnit.NANOS : lVar.mo25036a(this);
    }

    /* renamed from: j */
    public final long mo24938j(Temporal temporal, C9345m mVar) {
        long j;
        C9327h m = m34399m(temporal);
        if (!(mVar instanceof ChronoUnit)) {
            return mVar.between(this, m);
        }
        long w = m.mo25099w() - mo25099w();
        switch (C9326g.f25844b[((ChronoUnit) mVar).ordinal()]) {
            case 1:
                return w;
            case 2:
                j = 1000;
                break;
            case 3:
                j = 1000000;
                break;
            case 4:
                j = 1000000000;
                break;
            case 5:
                j = 60000000000L;
                break;
            case 6:
                j = 3600000000000L;
                break;
            case 7:
                j = 43200000000000L;
                break;
            default:
                throw new C9346n("Unsupported unit: " + mVar);
        }
        return w / j;
    }

    /* renamed from: k */
    public final int compareTo(C9327h hVar) {
        int compare = Integer.compare(this.f25848a, hVar.f25848a);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.f25849b, hVar.f25849b);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Integer.compare(this.f25850c, hVar.f25850c);
        return compare3 == 0 ? Integer.compare(this.f25851d, hVar.f25851d) : compare3;
    }

    /* renamed from: o */
    public final int mo25092o() {
        return this.f25851d;
    }

    /* renamed from: p */
    public final int mo25093p() {
        return this.f25850c;
    }

    /* renamed from: s */
    public final C9327h mo25094s(long j) {
        return j == 0 ? this : m34398l(((((int) (j % 24)) + this.f25848a) + 24) % 24, this.f25849b, this.f25850c, this.f25851d);
    }

    /* renamed from: t */
    public final C9327h mo25095t(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f25848a * 60) + this.f25849b;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i == i2 ? this : m34398l(i2 / 60, i2 % 60, this.f25850c, this.f25851d);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.f25848a;
        byte b2 = this.f25849b;
        byte b3 = this.f25850c;
        int i2 = this.f25851d;
        sb.append(b < 10 ? BankApiResponse.SUCCESSFUL_RESPONSE_CODE : "");
        sb.append(b);
        String str = ":0";
        sb.append(b2 < 10 ? str : ":");
        sb.append(b2);
        if (b3 > 0 || i2 > 0) {
            if (b3 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append(b3);
            if (i2 > 0) {
                sb.append('.');
                int i3 = 1000000;
                if (i2 % 1000000 == 0) {
                    i = (i2 / 1000000) + 1000;
                } else {
                    if (i2 % 1000 == 0) {
                        i2 /= 1000;
                    } else {
                        i3 = 1000000000;
                    }
                    i = i2 + i3;
                }
                sb.append(Integer.toString(i).substring(1));
            }
        }
        return sb.toString();
    }

    /* renamed from: u */
    public final C9327h mo25097u(long j) {
        if (j == 0) {
            return this;
        }
        long w = mo25099w();
        long j2 = (((j % 86400000000000L) + w) + 86400000000000L) % 86400000000000L;
        return w == j2 ? this : m34398l((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    /* renamed from: v */
    public final C9327h mo25098v(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f25849b * 60) + (this.f25848a * 3600) + this.f25850c;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i == i2 ? this : m34398l(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.f25851d);
    }

    /* renamed from: w */
    public final long mo25099w() {
        return (((long) this.f25850c) * 1000000000) + (((long) this.f25849b) * 60000000000L) + (((long) this.f25848a) * 3600000000000L) + ((long) this.f25851d);
    }

    /* renamed from: x */
    public final int mo25100x() {
        return (this.f25849b * 60) + (this.f25848a * 3600) + this.f25850c;
    }

    /* renamed from: y */
    public final C9327h mo24930a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof C9333a)) {
            return (C9327h) temporalField.mo25115i(this, j);
        }
        C9333a aVar = (C9333a) temporalField;
        aVar.mo25127l(j);
        switch (C9326g.f25843a[aVar.ordinal()]) {
            case 1:
                return mo25102z((int) j);
            case 2:
                return m34402r(j);
            case 3:
                return mo25102z(((int) j) * 1000);
            case 4:
                return m34402r(j * 1000);
            case 5:
                return mo25102z(((int) j) * 1000000);
            case 6:
                return m34402r(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.f25850c == i) {
                    return this;
                }
                C9333a.SECOND_OF_MINUTE.mo25127l((long) i);
                return m34398l(this.f25848a, this.f25849b, i, this.f25851d);
            case 8:
                return mo25098v(j - ((long) mo25100x()));
            case 9:
                int i2 = (int) j;
                if (this.f25849b == i2) {
                    return this;
                }
                C9333a.MINUTE_OF_HOUR.mo25127l((long) i2);
                return m34398l(this.f25848a, i2, this.f25850c, this.f25851d);
            case 10:
                return mo25095t(j - ((long) ((this.f25848a * 60) + this.f25849b)));
            case 11:
                return mo25094s(j - ((long) (this.f25848a % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return mo25094s(j - ((long) (this.f25848a % 12)));
            case 13:
                int i3 = (int) j;
                if (this.f25848a == i3) {
                    return this;
                }
                C9333a.HOUR_OF_DAY.mo25127l((long) i3);
                return m34398l(i3, this.f25849b, this.f25850c, this.f25851d);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.f25848a == i4) {
                    return this;
                }
                C9333a.HOUR_OF_DAY.mo25127l((long) i4);
                return m34398l(i4, this.f25849b, this.f25850c, this.f25851d);
            case 15:
                return mo25094s((j - ((long) (this.f25848a / 12))) * 12);
            default:
                throw new C9346n("Unsupported field: " + temporalField);
        }
    }

    /* renamed from: z */
    public final C9327h mo25102z(int i) {
        if (this.f25851d == i) {
            return this;
        }
        C9333a.NANO_OF_SECOND.mo25127l((long) i);
        return m34398l(this.f25848a, this.f25849b, this.f25850c, i);
    }
}

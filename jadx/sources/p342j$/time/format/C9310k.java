package p342j$.time.format;

import p342j$.time.C9288c;
import p342j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.k */
class C9310k implements C9306g {

    /* renamed from: f */
    static final long[] f25793f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a */
    final TemporalField f25794a;

    /* renamed from: b */
    final int f25795b;

    /* renamed from: c */
    final int f25796c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9299A f25797d;

    /* renamed from: e */
    final int f25798e;

    C9310k(TemporalField temporalField, int i, int i2, C9299A a) {
        this.f25794a = temporalField;
        this.f25795b = i;
        this.f25796c = i2;
        this.f25797d = a;
        this.f25798e = 0;
    }

    protected C9310k(TemporalField temporalField, int i, int i2, C9299A a, int i3) {
        this.f25794a = temporalField;
        this.f25795b = i;
        this.f25796c = i2;
        this.f25797d = a;
        this.f25798e = i3;
    }

    /* renamed from: a */
    public final boolean mo25039a(C9321v vVar, StringBuilder sb) {
        TemporalField temporalField = this.f25794a;
        Long e = vVar.mo25080e(temporalField);
        if (e == null) {
            return false;
        }
        long c = mo25046c(vVar, e.longValue());
        C9324y b = vVar.mo25077b();
        String l = c == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(c));
        int length = l.length();
        int i = this.f25796c;
        if (length <= i) {
            b.getClass();
            int i2 = (c > 0 ? 1 : (c == 0 ? 0 : -1));
            int i3 = this.f25795b;
            C9299A a = this.f25797d;
            if (i2 >= 0) {
                if ((r12 = C9303d.f25783a[a.ordinal()]) != 1) {
                }
                sb.append('+');
            } else {
                int i4 = C9303d.f25783a[a.ordinal()];
                if (i4 == 1 || i4 == 2 || i4 == 3) {
                    sb.append('-');
                } else if (i4 == 4) {
                    throw new C9288c("Field " + temporalField + " cannot be printed as the value " + c + " cannot be negative according to the SignStyle");
                }
            }
            for (int i5 = 0; i5 < i3 - l.length(); i5++) {
                sb.append('0');
            }
            sb.append(l);
            return true;
        }
        throw new C9288c("Field " + temporalField + " cannot be printed as the value " + c + " exceeds the maximum print width of " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo25046c(C9321v vVar, long j) {
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C9310k mo25047d() {
        return this.f25798e == -1 ? this : new C9310k(this.f25794a, this.f25795b, this.f25796c, this.f25797d, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C9310k mo25048e(int i) {
        return new C9310k(this.f25794a, this.f25795b, this.f25796c, this.f25797d, this.f25798e + i);
    }

    public String toString() {
        C9299A a = this.f25797d;
        TemporalField temporalField = this.f25794a;
        int i = this.f25796c;
        int i2 = this.f25795b;
        if (i2 == 1 && i == 19 && a == C9299A.NORMAL) {
            return "Value(" + temporalField + ")";
        } else if (i2 == i && a == C9299A.NOT_NEGATIVE) {
            return "Value(" + temporalField + "," + i2 + ")";
        } else {
            return "Value(" + temporalField + "," + i2 + "," + i + "," + a + ")";
        }
    }
}

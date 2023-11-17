package p342j$.time.format;

import p342j$.time.LocalDate;
import p342j$.time.chrono.C9291c;
import p342j$.time.chrono.C9295g;
import p342j$.time.chrono.ChronoLocalDate;
import p342j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.n */
final class C9313n extends C9310k {

    /* renamed from: i */
    static final LocalDate f25806i = LocalDate.m34218of(2000, 1, 1);

    /* renamed from: g */
    private final int f25807g;

    /* renamed from: h */
    private final ChronoLocalDate f25808h;

    private C9313n(TemporalField temporalField, int i, int i2, int i3, ChronoLocalDate chronoLocalDate, int i4) {
        super(temporalField, i, i2, C9299A.NOT_NEGATIVE, i4);
        this.f25807g = i3;
        this.f25808h = chronoLocalDate;
    }

    C9313n(TemporalField temporalField, LocalDate localDate) {
        this(temporalField, 2, 2, 0, localDate, 0);
    }

    /* synthetic */ C9313n(TemporalField temporalField, LocalDate localDate, int i) {
        this(temporalField, 2, 2, 0, localDate, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo25046c(C9321v vVar, long j) {
        int i;
        long abs = Math.abs(j);
        ChronoLocalDate chronoLocalDate = this.f25808h;
        if (chronoLocalDate != null) {
            ((C9295g) C9291c.m34327b(vVar.mo25079d())).getClass();
            i = LocalDate.m34216n(chronoLocalDate).get(this.f25794a);
        } else {
            i = this.f25807g;
        }
        long j2 = (long) i;
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        long[] jArr = C9310k.f25793f;
        if (i2 >= 0) {
            long j3 = jArr[this.f25795b];
            if (j < j2 + j3) {
                return abs % j3;
            }
        }
        return abs % jArr[this.f25796c];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C9310k mo25047d() {
        return this.f25798e == -1 ? this : new C9313n(this.f25794a, this.f25795b, this.f25796c, this.f25807g, this.f25808h, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C9310k mo25048e(int i) {
        return new C9313n(this.f25794a, this.f25795b, this.f25796c, this.f25807g, this.f25808h, this.f25798e + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReducedValue(");
        sb.append(this.f25794a);
        sb.append(",");
        sb.append(this.f25795b);
        sb.append(",");
        sb.append(this.f25796c);
        sb.append(",");
        Object obj = this.f25808h;
        if (obj == null) {
            obj = Integer.valueOf(this.f25807g);
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}

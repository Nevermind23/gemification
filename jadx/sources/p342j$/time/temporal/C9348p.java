package p342j$.time.temporal;

import p342j$.time.LocalDate;
import p342j$.time.chrono.C9291c;
import p342j$.time.chrono.C9295g;

/* renamed from: j$.time.temporal.p */
final class C9348p implements TemporalField {

    /* renamed from: f */
    private static final C9347o f25893f = C9347o.m34511i(1, 7);

    /* renamed from: g */
    private static final C9347o f25894g = C9347o.m34512j(0, 4, 6);

    /* renamed from: h */
    private static final C9347o f25895h = C9347o.m34512j(0, 52, 54);

    /* renamed from: i */
    private static final C9347o f25896i = C9347o.m34513k(52, 53);

    /* renamed from: a */
    private final String f25897a;

    /* renamed from: b */
    private final WeekFields f25898b;

    /* renamed from: c */
    private final C9345m f25899c;

    /* renamed from: d */
    private final C9345m f25900d;

    /* renamed from: e */
    private final C9347o f25901e;

    private C9348p(String str, WeekFields weekFields, C9345m mVar, C9345m mVar2, C9347o oVar) {
        this.f25897a = str;
        this.f25898b = weekFields;
        this.f25899c = mVar;
        this.f25900d = mVar2;
        this.f25901e = oVar;
    }

    /* renamed from: b */
    private static int m34521b(int i, int i2) {
        return ((i2 - 1) + (i + 7)) / 7;
    }

    /* renamed from: d */
    private int m34522d(TemporalAccessor temporalAccessor) {
        int i;
        int value = temporalAccessor.get(C9333a.DAY_OF_WEEK) - this.f25898b.getFirstDayOfWeek().getValue();
        int i2 = value % 7;
        if (i2 == 0) {
            i = 0;
        } else {
            if ((((value ^ 7) >> 31) | 1) <= 0) {
                i2 += 7;
            }
            i = i2;
        }
        return i + 1;
    }

    /* renamed from: g */
    private int m34523g(TemporalAccessor temporalAccessor) {
        long j;
        int d = m34522d(temporalAccessor);
        C9333a aVar = C9333a.DAY_OF_YEAR;
        int i = temporalAccessor.get(aVar);
        int q = m34530q(i, d);
        int b = m34521b(q, i);
        if (b == 0) {
            ((C9295g) C9291c.m34327b(temporalAccessor)).getClass();
            LocalDate n = LocalDate.m34216n(temporalAccessor);
            long j2 = (long) i;
            ChronoUnit chronoUnit = ChronoUnit.DAYS;
            if (j2 == Long.MIN_VALUE) {
                n = n.mo24936h(Long.MAX_VALUE, chronoUnit);
                j = 1;
            } else {
                j = -j2;
            }
            return m34523g(n.mo24936h(j, chronoUnit));
        } else if (b <= 50) {
            return b;
        } else {
            int b2 = m34521b(q, this.f25898b.mo25117c() + ((int) temporalAccessor.mo24917e(aVar).mo25136d()));
            return b >= b2 ? (b - b2) + 1 : b;
        }
    }

    /* renamed from: k */
    static C9348p m34524k(WeekFields weekFields) {
        return new C9348p("DayOfWeek", weekFields, ChronoUnit.DAYS, ChronoUnit.WEEKS, f25893f);
    }

    /* renamed from: l */
    static C9348p m34525l(WeekFields weekFields) {
        return new C9348p("WeekBasedYear", weekFields, C9341i.f25880d, ChronoUnit.FOREVER, C9333a.YEAR.mo25112e());
    }

    /* renamed from: m */
    static C9348p m34526m(WeekFields weekFields) {
        return new C9348p("WeekOfMonth", weekFields, ChronoUnit.WEEKS, ChronoUnit.MONTHS, f25894g);
    }

    /* renamed from: n */
    static C9348p m34527n(WeekFields weekFields) {
        return new C9348p("WeekOfWeekBasedYear", weekFields, ChronoUnit.WEEKS, C9341i.f25880d, f25896i);
    }

    /* renamed from: o */
    private C9347o m34528o(TemporalAccessor temporalAccessor, C9333a aVar) {
        int q = m34530q(temporalAccessor.get(aVar), m34522d(temporalAccessor));
        C9347o e = temporalAccessor.mo24917e(aVar);
        return C9347o.m34511i((long) m34521b(q, (int) e.mo25137e()), (long) m34521b(q, (int) e.mo25136d()));
    }

    /* renamed from: p */
    private C9347o m34529p(TemporalAccessor temporalAccessor) {
        C9333a aVar = C9333a.DAY_OF_YEAR;
        if (!temporalAccessor.mo24916b(aVar)) {
            return f25895h;
        }
        int d = m34522d(temporalAccessor);
        int i = temporalAccessor.get(aVar);
        int q = m34530q(i, d);
        int b = m34521b(q, i);
        if (b == 0) {
            ((C9295g) C9291c.m34327b(temporalAccessor)).getClass();
            LocalDate n = LocalDate.m34216n(temporalAccessor);
            long j = (long) (i + 7);
            ChronoUnit chronoUnit = ChronoUnit.DAYS;
            return m34529p(j == Long.MIN_VALUE ? n.mo24936h(Long.MAX_VALUE, chronoUnit).mo24936h(1, chronoUnit) : n.mo24936h(-j, chronoUnit));
        }
        int d2 = (int) temporalAccessor.mo24917e(aVar).mo25136d();
        int b2 = m34521b(q, this.f25898b.mo25117c() + d2);
        if (b < b2) {
            return C9347o.m34511i(1, (long) (b2 - 1));
        }
        ((C9295g) C9291c.m34327b(temporalAccessor)).getClass();
        return m34529p(LocalDate.m34216n(temporalAccessor).mo24936h((long) ((d2 - i) + 1 + 7), ChronoUnit.DAYS));
    }

    /* renamed from: q */
    private int m34530q(int i, int i2) {
        int i3;
        int i4 = i - i2;
        int i5 = i4 % 7;
        if (i5 == 0) {
            i3 = 0;
        } else {
            if ((((i4 ^ 7) >> 31) | 1) <= 0) {
                i5 += 7;
            }
            i3 = i5;
        }
        return i3 + 1 > this.f25898b.mo25117c() ? 7 - i3 : -i3;
    }

    /* renamed from: a */
    public final boolean mo25110a() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo25111c() {
        return true;
    }

    /* renamed from: e */
    public final C9347o mo25112e() {
        return this.f25901e;
    }

    /* renamed from: f */
    public final long mo25113f(TemporalAccessor temporalAccessor) {
        int i;
        int b;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        C9345m mVar = this.f25900d;
        if (mVar == chronoUnit) {
            i = m34522d(temporalAccessor);
        } else {
            if (mVar == ChronoUnit.MONTHS) {
                int d = m34522d(temporalAccessor);
                int i2 = temporalAccessor.get(C9333a.DAY_OF_MONTH);
                b = m34521b(m34530q(i2, d), i2);
            } else if (mVar == ChronoUnit.YEARS) {
                int d2 = m34522d(temporalAccessor);
                int i3 = temporalAccessor.get(C9333a.DAY_OF_YEAR);
                b = m34521b(m34530q(i3, d2), i3);
            } else if (mVar == WeekFields.f25862h) {
                i = m34523g(temporalAccessor);
            } else if (mVar == ChronoUnit.FOREVER) {
                int d3 = m34522d(temporalAccessor);
                int i4 = temporalAccessor.get(C9333a.YEAR);
                C9333a aVar = C9333a.DAY_OF_YEAR;
                int i5 = temporalAccessor.get(aVar);
                int q = m34530q(i5, d3);
                int b2 = m34521b(q, i5);
                if (b2 == 0) {
                    i4--;
                } else {
                    if (b2 >= m34521b(q, this.f25898b.mo25117c() + ((int) temporalAccessor.mo24917e(aVar).mo25136d()))) {
                        i4++;
                    }
                }
                return (long) i4;
            } else {
                throw new IllegalStateException("unreachable, rangeUnit: " + mVar + ", this: " + this);
            }
            return (long) b;
        }
        return (long) i;
    }

    /* renamed from: h */
    public final boolean mo25114h(TemporalAccessor temporalAccessor) {
        C9333a aVar;
        if (!temporalAccessor.mo24916b(C9333a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        C9345m mVar = this.f25900d;
        if (mVar == chronoUnit) {
            return true;
        }
        if (mVar == ChronoUnit.MONTHS) {
            aVar = C9333a.DAY_OF_MONTH;
        } else if (mVar == ChronoUnit.YEARS || mVar == WeekFields.f25862h) {
            aVar = C9333a.DAY_OF_YEAR;
        } else if (mVar != ChronoUnit.FOREVER) {
            return false;
        } else {
            aVar = C9333a.YEAR;
        }
        return temporalAccessor.mo24916b(aVar);
    }

    /* renamed from: i */
    public final Temporal mo25115i(Temporal temporal, long j) {
        int a = this.f25901e.mo25134a(this, j);
        int i = temporal.get(this);
        if (a == i) {
            return temporal;
        }
        if (this.f25900d != ChronoUnit.FOREVER) {
            return temporal.mo24936h((long) (a - i), this.f25899c);
        }
        WeekFields weekFields = this.f25898b;
        int i2 = temporal.get(weekFields.f25865c);
        int i3 = temporal.get(weekFields.f25867e);
        ((C9295g) C9291c.m34327b(temporal)).getClass();
        LocalDate of = LocalDate.m34218of((int) j, 1, 1);
        int q = m34530q(1, m34522d(of));
        return of.mo24936h((long) (((Math.min(i3, m34521b(q, weekFields.mo25117c() + (of.mo24964r() ? 366 : 365)) - 1) - 1) * 7) + (i2 - 1) + (-q)), ChronoUnit.DAYS);
    }

    /* renamed from: j */
    public final C9347o mo25116j(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        C9345m mVar = this.f25900d;
        if (mVar == chronoUnit) {
            return this.f25901e;
        }
        if (mVar == ChronoUnit.MONTHS) {
            return m34528o(temporalAccessor, C9333a.DAY_OF_MONTH);
        }
        if (mVar == ChronoUnit.YEARS) {
            return m34528o(temporalAccessor, C9333a.DAY_OF_YEAR);
        }
        if (mVar == WeekFields.f25862h) {
            return m34529p(temporalAccessor);
        }
        if (mVar == ChronoUnit.FOREVER) {
            return C9333a.YEAR.mo25112e();
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + mVar + ", this: " + this);
    }

    public final String toString() {
        return this.f25897a + "[" + this.f25898b.toString() + "]";
    }
}

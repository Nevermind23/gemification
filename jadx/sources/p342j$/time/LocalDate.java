package p342j$.time;

import java.io.Serializable;
import java.util.Map;
import java.util.TimeZone;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p342j$.lang.C9284a;
import p342j$.time.chrono.C9295g;
import p342j$.time.chrono.ChronoLocalDate;
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

/* renamed from: j$.time.LocalDate */
public final class LocalDate implements Temporal, ChronoLocalDate, Serializable {

    /* renamed from: d */
    public static final LocalDate f25740d = m34218of(-999999999, 1, 1);

    /* renamed from: e */
    public static final LocalDate f25741e = m34218of(999999999, 12, 31);

    /* renamed from: a */
    private final int f25742a;

    /* renamed from: b */
    private final short f25743b;

    /* renamed from: c */
    private final short f25744c;

    private LocalDate(int i, int i2, int i3) {
        this.f25742a = i;
        this.f25743b = (short) i2;
        this.f25744c = (short) i3;
    }

    /* renamed from: n */
    public static LocalDate m34216n(TemporalAccessor temporalAccessor) {
        if (temporalAccessor != null) {
            LocalDate localDate = (LocalDate) temporalAccessor.mo24922i(C9343k.m34500b());
            if (localDate != null) {
                return localDate;
            }
            throw new C9288c("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
        }
        throw new NullPointerException("temporal");
    }

    public static LocalDate now() {
        Map map = ZoneId.f25755a;
        String id = TimeZone.getDefault().getID();
        Map map2 = ZoneId.f25755a;
        if (id == null) {
            throw new NullPointerException("zoneId");
        } else if (map2 != null) {
            String str = (String) map2.get(id);
            if (str != null) {
                id = str;
            }
            C9286a aVar = new C9286a(ZoneId.m34286of(id));
            Instant a = aVar.mo25018a();
            return m34221t(C9284a.m34183j(a.mo24940n() + ((long) aVar.mo25020d().mo25005m().mo25157d(a).mo25008p()), 86400));
        } else {
            throw new NullPointerException("aliasMap");
        }
    }

    /* renamed from: o */
    private int m34217o(TemporalField temporalField) {
        switch (C9297e.f25770a[((C9333a) temporalField).ordinal()]) {
            case 1:
                return this.f25744c;
            case 2:
                return mo24960p();
            case 3:
                return ((this.f25744c - 1) / 7) + 1;
            case 4:
                int i = this.f25742a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.f25744c - 1) % 7) + 1;
            case 7:
                return ((mo24960p() - 1) % 7) + 1;
            case 8:
                throw new C9346n("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((mo24960p() - 1) / 7) + 1;
            case 10:
                return this.f25743b;
            case 11:
                throw new C9346n("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f25742a;
            case 13:
                return this.f25742a >= 1 ? 1 : 0;
            default:
                throw new C9346n("Unsupported field: " + temporalField);
        }
    }

    /* renamed from: of */
    public static LocalDate m34218of(int i, int i2, int i3) {
        long j = (long) i;
        C9333a.YEAR.mo25127l(j);
        C9333a.MONTH_OF_YEAR.mo25127l((long) i2);
        C9333a.DAY_OF_MONTH.mo25127l((long) i3);
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                C9295g.f25767a.getClass();
                if (C9295g.m34328a(j)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new C9288c("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new C9288c("Invalid date '" + C9329j.m34422l(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    /* renamed from: q */
    private long m34219q() {
        return ((((long) this.f25742a) * 12) + ((long) this.f25743b)) - 1;
    }

    /* renamed from: s */
    private long m34220s(LocalDate localDate) {
        return (((localDate.m34219q() * 32) + ((long) localDate.getDayOfMonth())) - ((m34219q() * 32) + ((long) getDayOfMonth()))) / 32;
    }

    /* renamed from: t */
    public static LocalDate m34221t(long j) {
        long j2;
        long j3 = (j + 719528) - 60;
        if (j3 < 0) {
            long j4 = ((j3 + 1) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new LocalDate(C9333a.YEAR.mo25126k(j5 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * BogInputLayout.INPUT_TYPE_NUMBER_SIGNED) + 5) / 10)) + 1);
    }

    /* renamed from: w */
    private static LocalDate m34222w(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i4 = 30;
            }
            return new LocalDate(i, i2, i3);
        }
        C9295g.f25767a.getClass();
        i4 = C9295g.m34328a((long) i) ? 29 : 28;
        i3 = Math.min(i3, i4);
        return new LocalDate(i, i2, i3);
    }

    /* renamed from: b */
    public final boolean mo24916b(TemporalField temporalField) {
        return temporalField instanceof C9333a ? temporalField.mo25111c() : temporalField != null && temporalField.mo25114h(this);
    }

    /* renamed from: c */
    public final Temporal mo24933c(LocalDate localDate) {
        boolean z = localDate instanceof LocalDate;
        TemporalAccessor temporalAccessor = localDate;
        if (!z) {
            temporalAccessor = localDate.mo24956k(this);
        }
        return (LocalDate) temporalAccessor;
    }

    /* renamed from: d */
    public final C9295g mo24946d() {
        return C9295g.f25767a;
    }

    /* renamed from: e */
    public final C9347o mo24917e(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof C9333a)) {
            return temporalField.mo25116j(this);
        }
        C9333a aVar = (C9333a) temporalField;
        if (aVar.mo25111c()) {
            int i2 = C9297e.f25770a[aVar.ordinal()];
            if (i2 == 1) {
                i = lengthOfMonth();
            } else if (i2 == 2) {
                i = mo24964r() ? 366 : 365;
            } else if (i2 == 3) {
                return C9347o.m34511i(1, (C9329j.m34422l(this.f25743b) != C9329j.FEBRUARY || mo24964r()) ? 5 : 4);
            } else if (i2 != 4) {
                return temporalField.mo25112e();
            } else {
                return C9347o.m34511i(1, getYear() <= 0 ? 1000000000 : 999999999);
            }
            return C9347o.m34511i(1, (long) i);
        }
        throw new C9346n("Unsupported field: " + temporalField);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDate) {
            return mo24959m((LocalDate) obj) == 0;
        }
        return false;
    }

    /* renamed from: f */
    public final long mo24918f(TemporalField temporalField) {
        return temporalField instanceof C9333a ? temporalField == C9333a.EPOCH_DAY ? mo24948g() : temporalField == C9333a.PROLEPTIC_MONTH ? m34219q() : (long) m34217o(temporalField) : temporalField.mo25113f(this);
    }

    /* renamed from: g */
    public final long mo24948g() {
        long j;
        long j2 = (long) this.f25742a;
        long j3 = (long) this.f25743b;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / -400) + ((j2 / -4) - (j2 / -100)));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.f25744c - 1));
        if (j3 > 2) {
            j5--;
            if (!mo24964r()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    public int get(TemporalField temporalField) {
        return temporalField instanceof C9333a ? m34217o(temporalField) : C9284a.m34175b(this, temporalField);
    }

    public int getDayOfMonth() {
        return this.f25744c;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.m34186of(((int) C9284a.m34181h(mo24948g() + 3, 7)) + 1);
    }

    public int getMonthValue() {
        return this.f25743b;
    }

    public int getYear() {
        return this.f25742a;
    }

    public final int hashCode() {
        int i = this.f25742a;
        return (((i << 11) + (this.f25743b << 6)) + this.f25744c) ^ (i & -2048);
    }

    /* renamed from: i */
    public final Object mo24922i(C9344l lVar) {
        if (lVar == C9343k.m34500b()) {
            return this;
        }
        if (lVar == C9343k.m34505g() || lVar == C9343k.m34504f() || lVar == C9343k.m34502d() || lVar == C9343k.m34501c()) {
            return null;
        }
        return lVar == C9343k.m34499a() ? C9295g.f25767a : lVar == C9343k.m34503e() ? ChronoUnit.DAYS : lVar.mo25036a(this);
    }

    public boolean isAfter(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? mo24959m((LocalDate) chronoLocalDate) > 0 : mo24948g() > chronoLocalDate.mo24948g();
    }

    public boolean isBefore(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? mo24959m((LocalDate) chronoLocalDate) < 0 : mo24948g() < chronoLocalDate.mo24948g();
    }

    /* renamed from: j */
    public final long mo24938j(Temporal temporal, C9345m mVar) {
        long g;
        long j;
        LocalDate n = m34216n(temporal);
        if (!(mVar instanceof ChronoUnit)) {
            return mVar.between(this, n);
        }
        switch (C9297e.f25771b[((ChronoUnit) mVar).ordinal()]) {
            case 1:
                return n.mo24948g() - mo24948g();
            case 2:
                g = n.mo24948g() - mo24948g();
                j = 7;
                break;
            case 3:
                return m34220s(n);
            case 4:
                g = m34220s(n);
                j = 12;
                break;
            case 5:
                g = m34220s(n);
                j = 120;
                break;
            case 6:
                g = m34220s(n);
                j = 1200;
                break;
            case 7:
                g = m34220s(n);
                j = 12000;
                break;
            case 8:
                C9333a aVar = C9333a.ERA;
                return n.mo24918f(aVar) - mo24918f(aVar);
            default:
                throw new C9346n("Unsupported unit: " + mVar);
        }
        return g / j;
    }

    /* renamed from: k */
    public final Temporal mo24956k(Temporal temporal) {
        return temporal.mo24930a(C9333a.EPOCH_DAY, mo24948g());
    }

    /* renamed from: l */
    public final int compareTo(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return mo24959m((LocalDate) chronoLocalDate);
        }
        int compare = Long.compare(mo24948g(), chronoLocalDate.mo24948g());
        if (compare != 0) {
            return compare;
        }
        C9295g gVar = C9295g.f25767a;
        C9295g d = chronoLocalDate.mo24946d();
        gVar.getClass();
        d.getClass();
        return 0;
    }

    public int lengthOfMonth() {
        short s = this.f25743b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : mo24964r() ? 29 : 28;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final int mo24959m(LocalDate localDate) {
        int i = this.f25742a - localDate.f25742a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f25743b - localDate.f25743b;
        return i2 == 0 ? this.f25744c - localDate.f25744c : i2;
    }

    /* renamed from: p */
    public final int mo24960p() {
        return (C9329j.m34422l(this.f25743b).mo25103k(mo24964r()) + this.f25744c) - 1;
    }

    public LocalDate plusDays(long j) {
        return j == 0 ? this : m34221t(C9284a.m34179f(mo24948g(), j));
    }

    public LocalDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f25742a) * 12) + ((long) (this.f25743b - 1)) + j;
        return m34222w(C9333a.YEAR.mo25126k(C9284a.m34183j(j2, 12)), ((int) C9284a.m34181h(j2, 12)) + 1, this.f25744c);
    }

    public LocalDate plusWeeks(long j) {
        return plusDays(C9284a.m34182i(j, 7));
    }

    /* renamed from: r */
    public final boolean mo24964r() {
        C9295g.f25767a.getClass();
        return C9295g.m34328a((long) this.f25742a);
    }

    public final String toString() {
        int i;
        int i2 = this.f25742a;
        short s = this.f25743b;
        short s2 = this.f25744c;
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + 10000);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        }
        String str = "-0";
        sb.append(s < 10 ? str : "-");
        sb.append(s);
        if (s2 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append(s2);
        return sb.toString();
    }

    /* renamed from: u */
    public final LocalDate mo24936h(long j, C9345m mVar) {
        if (!(mVar instanceof ChronoUnit)) {
            return (LocalDate) mVar.mo25108e(this, j);
        }
        switch (C9297e.f25771b[((ChronoUnit) mVar).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return plusWeeks(j);
            case 3:
                return plusMonths(j);
            case 4:
                return mo24967v(j);
            case 5:
                return mo24967v(C9284a.m34182i(j, 10));
            case 6:
                return mo24967v(C9284a.m34182i(j, 100));
            case 7:
                return mo24967v(C9284a.m34182i(j, 1000));
            case 8:
                C9333a aVar = C9333a.ERA;
                return mo24930a(aVar, C9284a.m34179f(mo24918f(aVar), j));
            default:
                throw new C9346n("Unsupported unit: " + mVar);
        }
    }

    /* renamed from: v */
    public final LocalDate mo24967v(long j) {
        return j == 0 ? this : m34222w(C9333a.YEAR.mo25126k(((long) this.f25742a) + j), this.f25743b, this.f25744c);
    }

    /* renamed from: with */
    public LocalDate mo24930a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof C9333a)) {
            return (LocalDate) temporalField.mo25115i(this, j);
        }
        C9333a aVar = (C9333a) temporalField;
        aVar.mo25127l(j);
        switch (C9297e.f25770a[aVar.ordinal()]) {
            case 1:
                return withDayOfMonth((int) j);
            case 2:
                return mo24971y((int) j);
            case 3:
                return plusWeeks(j - mo24918f(C9333a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f25742a < 1) {
                    j = 1 - j;
                }
                return mo24972z((int) j);
            case 5:
                return plusDays(j - ((long) getDayOfWeek().getValue()));
            case 6:
                return plusDays(j - mo24918f(C9333a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - mo24918f(C9333a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return m34221t(j);
            case 9:
                return plusWeeks(j - mo24918f(C9333a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i = (int) j;
                if (this.f25743b == i) {
                    return this;
                }
                C9333a.MONTH_OF_YEAR.mo25127l((long) i);
                return m34222w(this.f25742a, i, this.f25744c);
            case 11:
                return plusMonths(j - m34219q());
            case 12:
                return mo24972z((int) j);
            case 13:
                return mo24918f(C9333a.ERA) == j ? this : mo24972z(1 - this.f25742a);
            default:
                throw new C9346n("Unsupported field: " + temporalField);
        }
    }

    public LocalDate withDayOfMonth(int i) {
        return this.f25744c == i ? this : m34218of(this.f25742a, this.f25743b, i);
    }

    /* renamed from: x */
    public final Period mo24970x(ChronoLocalDate chronoLocalDate) {
        LocalDate n = m34216n(chronoLocalDate);
        long q = n.m34219q() - m34219q();
        int i = n.f25744c - this.f25744c;
        int i2 = (q > 0 ? 1 : (q == 0 ? 0 : -1));
        if (i2 > 0 && i < 0) {
            q--;
            i = (int) (n.mo24948g() - plusMonths(q).mo24948g());
        } else if (i2 < 0 && i > 0) {
            q++;
            i -= n.lengthOfMonth();
        }
        long j = q / 12;
        int i3 = (int) (q % 12);
        int i4 = (int) j;
        if (j == ((long) i4)) {
            return Period.m34283a(i4, i3, i);
        }
        throw new ArithmeticException();
    }

    /* renamed from: y */
    public final LocalDate mo24971y(int i) {
        if (mo24960p() == i) {
            return this;
        }
        int i2 = this.f25742a;
        long j = (long) i2;
        C9333a.YEAR.mo25127l(j);
        C9333a.DAY_OF_YEAR.mo25127l((long) i);
        C9295g.f25767a.getClass();
        boolean a = C9295g.m34328a(j);
        if (i != 366 || a) {
            int i3 = 31;
            C9329j l = C9329j.m34422l(((i - 1) / 31) + 1);
            int k = l.mo25103k(a);
            int i4 = C9328i.f25852a[l.ordinal()];
            if (i4 == 1) {
                i3 = a ? 29 : 28;
            } else if (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) {
                i3 = 30;
            }
            if (i > (k + i3) - 1) {
                l = l.mo25104m();
            }
            return new LocalDate(i2, l.ordinal() + 1, (i - l.mo25103k(a)) + 1);
        }
        throw new C9288c("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
    }

    /* renamed from: z */
    public final LocalDate mo24972z(int i) {
        if (this.f25742a == i) {
            return this;
        }
        C9333a.YEAR.mo25127l((long) i);
        return m34222w(i, this.f25743b, this.f25744c);
    }
}

package p342j$.time;

import p342j$.lang.C9284a;
import p342j$.time.chrono.C9295g;
import p342j$.time.temporal.C9333a;
import p342j$.time.temporal.C9343k;
import p342j$.time.temporal.C9344l;
import p342j$.time.temporal.C9346n;
import p342j$.time.temporal.C9347o;
import p342j$.time.temporal.ChronoUnit;
import p342j$.time.temporal.TemporalAccessor;
import p342j$.time.temporal.TemporalField;

/* renamed from: j$.time.j */
public enum C9329j implements TemporalAccessor {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: a */
    private static final C9329j[] f25853a = null;

    static {
        f25853a = values();
    }

    /* renamed from: l */
    public static C9329j m34422l(int i) {
        if (i >= 1 && i <= 12) {
            return f25853a[i - 1];
        }
        throw new C9288c("Invalid value for MonthOfYear: " + i);
    }

    /* renamed from: b */
    public final boolean mo24916b(TemporalField temporalField) {
        return temporalField instanceof C9333a ? temporalField == C9333a.MONTH_OF_YEAR : temporalField != null && temporalField.mo25114h(this);
    }

    /* renamed from: e */
    public final C9347o mo24917e(TemporalField temporalField) {
        return temporalField == C9333a.MONTH_OF_YEAR ? temporalField.mo25112e() : C9284a.m34177d(this, temporalField);
    }

    /* renamed from: f */
    public final long mo24918f(TemporalField temporalField) {
        if (temporalField == C9333a.MONTH_OF_YEAR) {
            return (long) (ordinal() + 1);
        }
        if (!(temporalField instanceof C9333a)) {
            return temporalField.mo25113f(this);
        }
        throw new C9346n("Unsupported field: " + temporalField);
    }

    public final int get(TemporalField temporalField) {
        return temporalField == C9333a.MONTH_OF_YEAR ? ordinal() + 1 : C9284a.m34175b(this, temporalField);
    }

    /* renamed from: i */
    public final Object mo24922i(C9344l lVar) {
        return lVar == C9343k.m34499a() ? C9295g.f25767a : lVar == C9343k.m34503e() ? ChronoUnit.MONTHS : C9284a.m34176c(this, lVar);
    }

    /* renamed from: k */
    public final int mo25103k(boolean z) {
        switch (C9328i.f25852a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + true;
            case 3:
                return z + true;
            case 4:
                return z + true;
            case 5:
                return z + true;
            case 6:
                return 1;
            case 7:
                return z + true;
            case 8:
                return z + true;
            case 9:
                return z + true;
            case 10:
                return z + true;
            case 11:
                return z + true;
            default:
                return z + true;
        }
    }

    /* renamed from: m */
    public final C9329j mo25104m() {
        int i = ((int) 1) + 12;
        return f25853a[(i + ordinal()) % 12];
    }
}

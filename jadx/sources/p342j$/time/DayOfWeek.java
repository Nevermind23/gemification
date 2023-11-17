package p342j$.time;

import java.util.Locale;
import p342j$.lang.C9284a;
import p342j$.time.format.C9319t;
import p342j$.time.format.TextStyle;
import p342j$.time.temporal.C9333a;
import p342j$.time.temporal.C9343k;
import p342j$.time.temporal.C9344l;
import p342j$.time.temporal.C9346n;
import p342j$.time.temporal.C9347o;
import p342j$.time.temporal.ChronoUnit;
import p342j$.time.temporal.TemporalAccessor;
import p342j$.time.temporal.TemporalField;

/* renamed from: j$.time.DayOfWeek */
public enum DayOfWeek implements TemporalAccessor {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: a */
    private static final DayOfWeek[] f25732a = null;

    static {
        f25732a = values();
    }

    /* renamed from: of */
    public static DayOfWeek m34186of(int i) {
        if (i >= 1 && i <= 7) {
            return f25732a[i - 1];
        }
        throw new C9288c("Invalid value for DayOfWeek: " + i);
    }

    /* renamed from: b */
    public final boolean mo24916b(TemporalField temporalField) {
        return temporalField instanceof C9333a ? temporalField == C9333a.DAY_OF_WEEK : temporalField != null && temporalField.mo25114h(this);
    }

    /* renamed from: e */
    public final C9347o mo24917e(TemporalField temporalField) {
        return temporalField == C9333a.DAY_OF_WEEK ? temporalField.mo25112e() : C9284a.m34177d(this, temporalField);
    }

    /* renamed from: f */
    public final long mo24918f(TemporalField temporalField) {
        if (temporalField == C9333a.DAY_OF_WEEK) {
            return (long) getValue();
        }
        if (!(temporalField instanceof C9333a)) {
            return temporalField.mo25113f(this);
        }
        throw new C9346n("Unsupported field: " + temporalField);
    }

    public final int get(TemporalField temporalField) {
        return temporalField == C9333a.DAY_OF_WEEK ? getValue() : C9284a.m34175b(this, temporalField);
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        C9319t tVar = new C9319t();
        tVar.mo25065k(C9333a.DAY_OF_WEEK, textStyle);
        return tVar.mo25075v(locale).format(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    /* renamed from: i */
    public final Object mo24922i(C9344l lVar) {
        return lVar == C9343k.m34503e() ? ChronoUnit.DAYS : C9284a.m34176c(this, lVar);
    }

    /* renamed from: k */
    public final DayOfWeek mo24923k(long j) {
        int i = ((int) (j % 7)) + 7;
        return f25732a[(i + ordinal()) % 7];
    }
}

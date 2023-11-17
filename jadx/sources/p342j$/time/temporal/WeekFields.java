package p342j$.time.temporal;

import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import p342j$.time.DayOfWeek;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.temporal.WeekFields */
public final class WeekFields implements Serializable {

    /* renamed from: g */
    private static final ConcurrentHashMap f25861g = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: h */
    public static final C9345m f25862h = C9341i.f25880d;

    /* renamed from: a */
    private final DayOfWeek f25863a;

    /* renamed from: b */
    private final int f25864b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final transient TemporalField f25865c = C9348p.m34524k(this);

    /* renamed from: d */
    private final transient TemporalField f25866d = C9348p.m34526m(this);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final transient TemporalField f25867e;

    /* renamed from: f */
    private final transient TemporalField f25868f;

    static {
        new WeekFields(DayOfWeek.MONDAY, 4);
        m34452of(DayOfWeek.SUNDAY, 1);
    }

    private WeekFields(DayOfWeek dayOfWeek, int i) {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        this.f25867e = C9348p.m34527n(this);
        this.f25868f = C9348p.m34525l(this);
        if (dayOfWeek == null) {
            throw new NullPointerException("firstDayOfWeek");
        } else if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        } else {
            this.f25863a = dayOfWeek;
            this.f25864b = i;
        }
    }

    /* renamed from: of */
    public static WeekFields m34452of(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentHashMap concurrentHashMap = f25861g;
        WeekFields weekFields = (WeekFields) concurrentHashMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentHashMap.putIfAbsent(str, new WeekFields(dayOfWeek, i));
        return (WeekFields) concurrentHashMap.get(str);
    }

    /* renamed from: of */
    public static WeekFields m34453of(Locale locale) {
        if (locale != null) {
            Calendar instance = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
            return m34452of(DayOfWeek.SUNDAY.mo24923k((long) (instance.getFirstDayOfWeek() - 1)), instance.getMinimalDaysInFirstWeek());
        }
        throw new NullPointerException(C11772k.C11773a.f34182n);
    }

    /* renamed from: c */
    public final int mo25117c() {
        return this.f25864b;
    }

    /* renamed from: d */
    public final TemporalField mo25118d() {
        return this.f25868f;
    }

    public TemporalField dayOfWeek() {
        return this.f25865c;
    }

    /* renamed from: e */
    public final TemporalField mo25120e() {
        return this.f25867e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WeekFields) {
            return hashCode() == obj.hashCode();
        }
        return false;
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.f25863a;
    }

    public final int hashCode() {
        return (this.f25863a.ordinal() * 7) + this.f25864b;
    }

    public final String toString() {
        return "WeekFields[" + this.f25863a + ',' + this.f25864b + ']';
    }

    public TemporalField weekOfMonth() {
        return this.f25866d;
    }
}

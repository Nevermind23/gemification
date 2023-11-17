package p342j$.time;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;
import p342j$.time.temporal.C9345m;
import p342j$.time.temporal.ChronoUnit;

/* renamed from: j$.time.Period */
public final class Period implements Serializable {

    /* renamed from: d */
    public static final Period f25751d = new Period(0, 0, 0);

    /* renamed from: a */
    private final int f25752a;

    /* renamed from: b */
    private final int f25753b;

    /* renamed from: c */
    private final int f25754c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        Collections.unmodifiableList(Arrays.asList(new C9345m[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS}));
    }

    private Period(int i, int i2, int i3) {
        this.f25752a = i;
        this.f25753b = i2;
        this.f25754c = i3;
    }

    /* renamed from: a */
    public static Period m34283a(int i, int i2, int i3) {
        return ((i | i2) | i3) == 0 ? f25751d : new Period(i, i2, i3);
    }

    public static Period between(LocalDate localDate, LocalDate localDate2) {
        return localDate.mo24970x(localDate2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        return this.f25752a == period.f25752a && this.f25753b == period.f25753b && this.f25754c == period.f25754c;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f25754c, 16) + Integer.rotateLeft(this.f25753b, 8) + this.f25752a;
    }

    public final String toString() {
        if (this == f25751d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.f25752a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.f25753b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.f25754c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    public long toTotalMonths() {
        return (((long) this.f25752a) * 12) + ((long) this.f25753b);
    }
}

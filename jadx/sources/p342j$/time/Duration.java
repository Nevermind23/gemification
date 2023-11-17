package p342j$.time;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;
import p342j$.lang.C9284a;

/* renamed from: j$.time.Duration */
public final class Duration implements Comparable<Duration>, Serializable {

    /* renamed from: c */
    public static final Duration f25734c = new Duration(0, 0);

    /* renamed from: a */
    private final long f25735a;

    /* renamed from: b */
    private final int f25736b;

    static {
        BigInteger.valueOf(1000000000);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private Duration(long j, int i) {
        this.f25735a = j;
        this.f25736b = i;
    }

    /* renamed from: a */
    private static Duration m34192a(long j, int i) {
        return (((long) i) | j) == 0 ? f25734c : new Duration(j, i);
    }

    /* renamed from: e */
    public static Duration m34193e(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return m34192a(j2, i);
    }

    /* renamed from: f */
    public static Duration m34194f() {
        return m34192a(C9284a.m34179f(Long.MAX_VALUE, C9284a.m34183j(999999999, 1000000000)), (int) C9284a.m34181h(999999999, 1000000000));
    }

    /* renamed from: h */
    public static Duration m34195h(long j) {
        return m34192a(j, 0);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return m34192a(j2, i * 1000000);
    }

    /* renamed from: c */
    public final long mo24924c() {
        return this.f25735a;
    }

    public final int compareTo(Object obj) {
        Duration duration = (Duration) obj;
        int compare = Long.compare(this.f25735a, duration.f25735a);
        return compare != 0 ? compare : this.f25736b - duration.f25736b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.f25735a == duration.f25735a && this.f25736b == duration.f25736b;
    }

    public final int hashCode() {
        long j = this.f25735a;
        return (this.f25736b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public long toMillis() {
        return C9284a.m34179f(C9284a.m34182i(this.f25735a, 1000), (long) (this.f25736b / 1000000));
    }

    public final String toString() {
        if (this == f25734c) {
            return "PT0S";
        }
        long j = this.f25735a;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.f25736b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || this.f25736b <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (this.f25736b > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - ((long) this.f25736b));
            } else {
                sb.append(((long) this.f25736b) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}

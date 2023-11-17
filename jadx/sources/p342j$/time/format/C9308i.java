package p342j$.time.format;

import p342j$.lang.C9284a;
import p342j$.time.LocalDateTime;
import p342j$.time.ZoneOffset;
import p342j$.time.temporal.C9333a;
import p342j$.time.temporal.TemporalAccessor;

/* renamed from: j$.time.format.i */
final class C9308i implements C9306g {
    C9308i() {
    }

    /* renamed from: a */
    public final boolean mo25039a(C9321v vVar, StringBuilder sb) {
        StringBuilder sb2 = sb;
        Long e = vVar.mo25080e(C9333a.INSTANT_SECONDS);
        TemporalAccessor d = vVar.mo25079d();
        C9333a aVar = C9333a.NANO_OF_SECOND;
        Long valueOf = d.mo24916b(aVar) ? Long.valueOf(vVar.mo25079d().mo24918f(aVar)) : null;
        int i = 0;
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        int k = aVar.mo25126k(valueOf != null ? valueOf.longValue() : 0);
        if (longValue >= -62167219200L) {
            long j = (longValue - 315569520000L) + 62167219200L;
            long j2 = C9284a.m34183j(j, 315569520000L) + 1;
            LocalDateTime t = LocalDateTime.m34247t(C9284a.m34181h(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (j2 > 0) {
                sb2.append('+');
                sb2.append(j2);
            }
            sb2.append(t);
            if (t.mo24982n() == 0) {
                sb2.append(":00");
            }
        } else {
            long j3 = longValue + 62167219200L;
            long j4 = j3 / 315569520000L;
            long j5 = j3 % 315569520000L;
            LocalDateTime t2 = LocalDateTime.m34247t(j5 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb2.append(t2);
            if (t2.mo24982n() == 0) {
                sb2.append(":00");
            }
            if (j4 < 0) {
                if (t2.mo24983o() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j4 - 1));
                } else if (j5 == 0) {
                    sb2.insert(length, j4);
                } else {
                    sb2.insert(length + 1, Math.abs(j4));
                }
            }
        }
        if (k > 0) {
            sb2.append('.');
            int i2 = 100000000;
            while (true) {
                if (k <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = k / i2;
                sb2.append((char) (i3 + 48));
                k -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb2.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}

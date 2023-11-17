package p118i7;

import com.medallia.digital.mobilesdk.C10749b8;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: i7.p */
public abstract class C6605p {

    /* renamed from: a */
    private static final SimpleDateFormat f20100a;

    /* renamed from: b */
    private static final SimpleDateFormat f20101b;

    /* renamed from: c */
    private static final StringBuilder f20102c = new StringBuilder(33);

    static {
        Locale locale = Locale.ROOT;
        f20100a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        f20101b = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
    }

    /* renamed from: a */
    public static void m25967a(long j, StringBuilder sb) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            sb.append("0s");
            return;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z = false;
        if (i < 0) {
            sb.append("-");
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                j = Long.MAX_VALUE;
                z = true;
            }
        }
        if (j >= 86400000) {
            sb.append(j / 86400000);
            sb.append("d");
            j %= 86400000;
        }
        if (true == z) {
            j = 25975808;
        }
        if (j >= C10749b8.C10751b.f30744c) {
            sb.append(j / C10749b8.C10751b.f30744c);
            sb.append("h");
            j %= C10749b8.C10751b.f30744c;
        }
        if (j >= C10749b8.C10751b.f30743b) {
            sb.append(j / C10749b8.C10751b.f30743b);
            sb.append("m");
            j %= C10749b8.C10751b.f30743b;
        }
        if (j >= 1000) {
            sb.append(j / 1000);
            sb.append("s");
            j %= 1000;
        }
        if (j > 0) {
            sb.append(j);
            sb.append("ms");
        }
    }
}

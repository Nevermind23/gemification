package sf1;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;

/* renamed from: sf1.b */
public abstract class C42559b {
    /* renamed from: b */
    public static final String m123209b(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500) {
            str = ((j + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500000) {
            str = ((j + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        C41536l.m120488h(format, "format(format, *args)");
        return format;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m123210c(C42558a aVar, C42561d dVar, String str) {
        Logger a = C42562e.f100168h.mo98019a();
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.mo98000f());
        sb.append(' ');
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C41536l.m120488h(format, "format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.mo97989b());
        a.fine(sb.toString());
    }
}

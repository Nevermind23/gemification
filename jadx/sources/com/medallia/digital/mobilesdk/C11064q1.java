package com.medallia.digital.mobilesdk;

import android.os.Environment;
import com.github.mikephil.charting.utils.Utils;
import java.text.DecimalFormat;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.q1 */
final class C11064q1 {
    C11064q1() {
    }

    /* renamed from: a */
    protected static double m40586a(long j) {
        return ((double) j) / 1048576.0d;
    }

    /* renamed from: b */
    protected static String m40589b(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        if (d > Utils.DOUBLE_EPSILON) {
            return String.format(Locale.US, "%s MB", new Object[]{decimalFormat.format(m40587a(d))});
        }
        return String.format(Locale.US, "%d MB", new Object[]{0});
    }

    /* renamed from: a */
    protected static long m40587a(double d) {
        if (d == Utils.DOUBLE_EPSILON) {
            return 0;
        }
        return (long) (d / 1048576.0d);
    }

    /* renamed from: a */
    protected static boolean m40588a() {
        return Environment.isExternalStorageRemovable() && Environment.getExternalStorageState().equals("mounted");
    }
}

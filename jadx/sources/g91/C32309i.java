package g91;

import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import p341ge.bog.mobilebank.model.CcyHistoryWrapper;

/* renamed from: g91.i */
public abstract class C32309i {

    /* renamed from: a */
    public static SimpleDateFormat f79726a = new SimpleDateFormat("dd.MM.yyyy");

    /* renamed from: g91.i$a */
    public enum C32310a {
        LAST_THREE_MONTHS,
        LAST_SIX_MONTHS,
        LAST_MONTH
    }

    /* renamed from: a */
    public static float m95240a(int i, CcyHistoryWrapper.SimpleRate[] simpleRateArr) {
        float f;
        float f2;
        if (simpleRateArr != null) {
            int length = simpleRateArr.length - i;
            f2 = -1.0f;
            f = -1.0f;
            for (int i2 = 0; i2 < i; i2++) {
                BigDecimal rate = simpleRateArr[i2 + length].getRate();
                if (rate != null) {
                    if (f2 == -1.0f || rate.floatValue() < f2) {
                        f2 = rate.floatValue();
                    } else if (f == -1.0f || rate.floatValue() > f) {
                        f = rate.floatValue();
                    }
                }
            }
        } else {
            f2 = -1.0f;
            f = -1.0f;
        }
        if (f2 == -1.0f && f == -1.0f) {
            return Utils.FLOAT_EPSILON;
        }
        float f3 = f2 - ((f - f2) / 2.0f);
        if (f3 < Utils.FLOAT_EPSILON) {
            return Utils.FLOAT_EPSILON;
        }
        return f3;
    }

    /* renamed from: b */
    public static int m95241b(C32310a aVar, CcyHistoryWrapper.SimpleRate[] simpleRateArr) {
        int i;
        if (aVar == C32310a.LAST_THREE_MONTHS) {
            i = -3;
        } else if (aVar == C32310a.LAST_SIX_MONTHS) {
            i = -6;
        } else if (aVar == C32310a.LAST_MONTH) {
            i = -1;
        } else {
            i = 0;
        }
        if (i == 0 || simpleRateArr == null) {
            return 0;
        }
        Calendar instance = Calendar.getInstance();
        instance.add(2, i);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        int i2 = 0;
        while (i2 < simpleRateArr.length) {
            try {
                if (f79726a.parse(simpleRateArr[i2].getDate()).compareTo(instance.getTime()) >= 0) {
                    return simpleRateArr.length - i2;
                }
                i2++;
            } catch (ParseException unused) {
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static String m95242c(String str, String str2) {
        try {
            return new SimpleDateFormat(str2, Locale.getDefault()).format(f79726a.parse(str));
        } catch (ParseException unused) {
            return "";
        }
    }
}

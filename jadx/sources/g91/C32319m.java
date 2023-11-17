package g91;

import android.content.Context;
import iu0.C36546y;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p342j$.time.ZoneId;
import p342j$.time.temporal.ChronoUnit;
import p342j$.util.DateRetargetClass;
import p342j$.util.DesugarTimeZone;
import p366bk.C10315d;
import p366bk.C10328q;

/* renamed from: g91.m */
public abstract class C32319m {
    /* renamed from: A */
    public static String m95281A(long j) {
        return m95282B(j, false);
    }

    /* renamed from: B */
    public static String m95282B(long j, boolean z) {
        String str;
        boolean z2;
        boolean z3;
        if (j == 0) {
            return "";
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        if (z) {
            StringBuilder sb = new StringBuilder(" hh:mm");
            boolean z4 = true;
            if (gregorianCalendar.get(1) == Calendar.getInstance().get(1)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (gregorianCalendar.get(6) == Calendar.getInstance().get(6)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2) {
                if (!z3) {
                    sb.insert(0, "MMM. dd");
                    z4 = false;
                }
                if (z4) {
                    sb.insert(0, "'" + C32359z0.m95557a0(C10328q.date_utils_today) + "' ");
                }
            } else {
                sb.insert(0, "yyyy-MMM-dd");
            }
            str = sb.toString();
        } else {
            str = "dd MMM. yyyy";
        }
        return new SimpleDateFormat(str).format(gregorianCalendar.getTime());
    }

    /* renamed from: C */
    public static Long m95283C(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return Long.valueOf(simpleDateFormat.parse(str + " 23:59:59").getTime());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static Long m95284D(String str) {
        try {
            return Long.valueOf(new SimpleDateFormat("yyyy-MM-dd").parse(str).getTime());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static Long m95285E(String str) {
        try {
            return Long.valueOf(new SimpleDateFormat("yyyy-MM").parse(str).getTime());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: F */
    public static Long m95286F(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            return Long.valueOf(simpleDateFormat.parse(str + " 23:59:59").getTime());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: G */
    public static boolean m95287G() {
        if (Calendar.getInstance().get(2) == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m95288H(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw new IllegalArgumentException("The dates must not be null");
        } else if (calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: I */
    public static Date m95289I(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM").parse(str);
        } catch (ParseException unused) {
            return new Date();
        }
    }

    /* renamed from: J */
    public static Date m95290J(Date date, int i) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(5, i);
        return instance.getTime();
    }

    /* renamed from: K */
    public static Date m95291K(Date date, int i) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(2, i);
        return instance.getTime();
    }

    /* renamed from: L */
    public static Date m95292L(Date date, int i) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(1, i);
        return instance.getTime();
    }

    /* renamed from: M */
    public static int m95293M(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(new Date(j2));
        int i = instance2.get(1) - instance.get(1);
        if (instance.get(2) > instance2.get(2) || (instance.get(2) == instance2.get(2) && instance.get(5) > instance2.get(5))) {
            return i - 1;
        }
        return i;
    }

    /* renamed from: a */
    public static String m95294a(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return (instance.get(1) + "") + "-" + String.format("%02d", new Object[]{Integer.valueOf(instance.get(2) + 1)}) + "-01";
    }

    /* renamed from: b */
    public static String m95295b(long j) {
        return m95296c(j, C36546y.m108285N());
    }

    /* renamed from: c */
    public static String m95296c(long j, Context context) {
        return m95298e(j, false, context);
    }

    /* renamed from: d */
    public static String m95297d(long j, String str) {
        return new SimpleDateFormat(str).format(new Date(j));
    }

    /* renamed from: e */
    public static String m95298e(long j, boolean z, Context context) {
        if (j == -1) {
            return "";
        }
        Calendar instance = Calendar.getInstance();
        instance.get(1);
        Calendar instance2 = Calendar.getInstance();
        instance2.add(6, -1);
        Calendar instance3 = Calendar.getInstance();
        instance3.setTimeInMillis(j);
        if (m95288H(instance3, instance)) {
            return context.getString(C10328q.date_utils_today);
        }
        if (m95288H(instance3, instance2)) {
            return context.getString(C10328q.date_utils_yesterday);
        }
        if (z) {
            return m95314u(j);
        }
        return m95301h(instance3, context);
    }

    /* renamed from: f */
    public static String m95299f(Date date, String str) {
        return new SimpleDateFormat(str).format(date);
    }

    /* renamed from: g */
    public static String m95300g(long j, Context context) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(1);
        int i2 = instance.get(2);
        int i3 = instance.get(5);
        String[] stringArray = context.getResources().getStringArray(C10315d.f28604a);
        return i3 + " " + stringArray[i2] + (", " + i);
    }

    /* renamed from: h */
    private static String m95301h(Calendar calendar, Context context) {
        String str;
        int i = Calendar.getInstance().get(1);
        int i2 = calendar.get(1);
        int i3 = calendar.get(2);
        int i4 = calendar.get(5);
        String[] stringArray = context.getResources().getStringArray(C10315d.f28604a);
        if (i == i2) {
            str = "";
        } else {
            str = ", " + i2;
        }
        return i4 + " " + stringArray[i3] + str;
    }

    /* renamed from: i */
    public static String m95302i(long j, Context context) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(1);
        int i2 = instance.get(2);
        String[] stringArray = context.getResources().getStringArray(C10315d.f28604a);
        return stringArray[i2] + (", " + i);
    }

    /* renamed from: j */
    public static String m95303j(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(2);
        int i2 = instance.get(1);
        return new DateFormatSymbols().getMonths()[i] + ", " + i2;
    }

    /* renamed from: k */
    public static int m95304k(long j) {
        return m95293M(j, new Date().getTime());
    }

    /* renamed from: l */
    public static long m95305l() {
        Calendar instance = Calendar.getInstance();
        instance.set(instance.get(1), instance.get(2), instance.get(5));
        return instance.getTimeInMillis();
    }

    /* renamed from: m */
    public static long m95306m(int i) {
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(2);
        int i3 = instance.get(1);
        int i4 = instance.get(5);
        int i5 = i2 - i;
        if (i5 < 0) {
            i5 += 12;
            i3--;
        }
        instance.set(i3, i5, i4);
        return instance.getTimeInMillis();
    }

    /* renamed from: n */
    public static long m95307n(int i) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.add(2, i * -1);
        return instance.getTimeInMillis();
    }

    /* renamed from: o */
    public static String m95308o(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT+4"));
        gregorianCalendar.setTimeInMillis(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT+4"));
        return simpleDateFormat.format(gregorianCalendar.getTime());
    }

    /* renamed from: p */
    public static Date m95309p(String str, String str2) {
        try {
            return new SimpleDateFormat(str2, Locale.ROOT).parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static String m95310q(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        return new SimpleDateFormat("dd.MM").format(gregorianCalendar.getTime());
    }

    /* renamed from: r */
    public static int m95311r() {
        Calendar instance = Calendar.getInstance();
        int i = instance.get(12) + (instance.get(11) * 60);
        if (i >= 360 && i < 720) {
            return 0;
        }
        if (i >= 720 && i < 1200) {
            return 1;
        }
        if (i < 1200 || i >= 1320) {
            return 3;
        }
        return 2;
    }

    /* renamed from: s */
    public static String m95312s(Context context, long j, long j2) {
        if (context == null) {
            context = C36546y.m108285N();
        }
        long days = TimeUnit.MILLISECONDS.toDays(j2 - j);
        if (days == 0) {
            return context.getResources().getString(C10328q.date_utils_today);
        }
        if (days == 1) {
            return String.format("%d %s", new Object[]{Long.valueOf(days), context.getString(C10328q.date_utils_in_one_day)});
        }
        return String.format("%d %s", new Object[]{Long.valueOf(days), context.getString(C10328q.date_utils_in_several_days)});
    }

    /* renamed from: t */
    public static long m95313t(long j, long j2) {
        return Math.abs(TimeUnit.DAYS.convert(j2 - j, TimeUnit.MILLISECONDS));
    }

    /* renamed from: u */
    public static String m95314u(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT+4"));
        gregorianCalendar.setTimeInMillis(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT+4"));
        return simpleDateFormat.format(gregorianCalendar.getTime());
    }

    /* renamed from: v */
    public static Long m95315v(Long l) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(l.longValue());
        instance.add(5, instance.getActualMaximum(5) - 1);
        return Long.valueOf(instance.getTimeInMillis());
    }

    /* renamed from: w */
    public static String m95316w() {
        Calendar instance = Calendar.getInstance();
        int i = instance.get(2);
        int i2 = instance.get(1);
        return i2 + "-" + (i + 1);
    }

    /* renamed from: x */
    public static int m95317x(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance.setTimeInMillis(j2);
        return Math.abs(((instance.get(1) * 12) + instance.get(2)) - ((instance.get(1) * 12) + instance.get(2)));
    }

    /* renamed from: y */
    public static long m95318y(Date date, Date date2) {
        return ChronoUnit.MONTHS.between(DateRetargetClass.toInstant(date).atZone(ZoneId.m34286of("UTC")).toLocalDateTime(), DateRetargetClass.toInstant(date2).atZone(ZoneId.m34286of("UTC")).toLocalDateTime());
    }

    /* renamed from: z */
    public static long m95319z() {
        Calendar instance = Calendar.getInstance(DesugarTimeZone.getTimeZone("GMT+4"));
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTime().getTime();
    }
}

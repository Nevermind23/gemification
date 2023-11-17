package p587rg;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: rg.a */
public abstract class C17612a {

    /* renamed from: rg.a$a */
    public interface C17613a {
        /* renamed from: a */
        String mo34345a(Date date);
    }

    /* renamed from: rg.a$b */
    public enum C17614b {
        STRING_DAY_MONTH_YEAR("d MMMM yyyy"),
        STRING_DAY_MONTH("d MMMM"),
        TIME("HH:mm");
        

        /* renamed from: d */
        private String f49324d;

        private C17614b(String str) {
            this.f49324d = str;
        }

        /* renamed from: a */
        public String mo45191a() {
            return this.f49324d;
        }
    }

    /* renamed from: a */
    public static String m61244a(Date date, String str) {
        if (date == null) {
            return "";
        }
        return new SimpleDateFormat(str, Locale.getDefault()).format(date);
    }

    /* renamed from: b */
    public static String m61245b(Date date, C17614b bVar) {
        return m61244a(date, bVar.mo45191a());
    }

    /* renamed from: c */
    public static boolean m61246c(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw new IllegalArgumentException("Dates must not be null");
        } else if (calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m61247d(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("Dates must not be null");
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(date2);
        return m61246c(instance, instance2);
    }
}

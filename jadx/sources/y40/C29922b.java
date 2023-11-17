package y40;

import java.util.Calendar;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay;

/* renamed from: y40.b */
public abstract class C29922b {
    /* renamed from: a */
    public static final Calendar m90783a(CalendarDay calendarDay) {
        C41536l.m120489i(calendarDay, "<this>");
        Calendar instance = Calendar.getInstance();
        instance.set(1, calendarDay.mo58865g());
        instance.set(2, calendarDay.mo58864f() - 1);
        instance.set(5, calendarDay.mo58862e());
        instance.set(11, instance.getActualMinimum(11));
        instance.set(12, instance.getActualMinimum(12));
        instance.set(13, instance.getActualMinimum(13));
        instance.set(14, instance.getActualMinimum(14));
        C41536l.m120488h(instance, "calendar");
        return instance;
    }
}

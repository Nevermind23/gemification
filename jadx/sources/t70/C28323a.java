package t70;

import java.util.Calendar;
import p341ge.bog.mobilebank.cleanarch.utm.data.entity.UtmParamsEntity;

/* renamed from: t70.a */
public abstract class C28323a {
    /* renamed from: a */
    public static final boolean m86959a(UtmParamsEntity utmParamsEntity, Long l) {
        if (utmParamsEntity == null) {
            return false;
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (l == null) {
            return false;
        }
        long j = (long) 60;
        if (timeInMillis - utmParamsEntity.getClickDate() < l.longValue() * ((long) 24) * j * j * ((long) 1000)) {
            return true;
        }
        return false;
    }
}

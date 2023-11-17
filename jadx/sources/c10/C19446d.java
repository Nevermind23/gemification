package c10;

import he1.C41232r;
import java.util.Calendar;
import kotlin.jvm.internal.C41536l;

/* renamed from: c10.d */
public abstract class C19446d {
    /* renamed from: a */
    public static final Calendar m64949a() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, instance.getActualMinimum(11));
        instance.set(12, instance.getActualMinimum(12));
        instance.set(13, instance.getActualMinimum(13));
        instance.set(14, instance.getActualMinimum(14));
        C41536l.m120488h(instance, "cal");
        return instance;
    }

    /* renamed from: b */
    public static final C41232r m64950b(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(2);
        return new C41232r(Integer.valueOf(instance.get(1)), Integer.valueOf(i), Integer.valueOf(instance.get(5)));
    }
}

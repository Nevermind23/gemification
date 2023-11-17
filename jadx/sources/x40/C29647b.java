package x40;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay;
import p730cw.C19805a;

/* renamed from: x40.b */
public abstract class C29647b {
    /* renamed from: a */
    private static final CalendarDay m89976a(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        CalendarDay a = CalendarDay.m75253a(instance.get(1), instance.get(2) + 1, instance.get(5));
        C41536l.m120488h(a, "from(calendar.get(Calend…t(Calendar.DAY_OF_MONTH))");
        return a;
    }

    /* renamed from: b */
    public static final List m89977b(List list) {
        int i;
        C41536l.m120489i(list, "<this>");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C19805a aVar = (C19805a) it.next();
            if (aVar.mo48095c() != null) {
                i = Color.parseColor(aVar.mo48095c());
            } else {
                i = -1;
            }
            arrayList.add(new C29646a(m89976a(aVar.mo48094b()), aVar.mo48097e(), aVar.mo48099f(), Color.parseColor(aVar.mo48093a()), Color.parseColor(aVar.mo48096d()), i));
        }
        return arrayList;
    }
}

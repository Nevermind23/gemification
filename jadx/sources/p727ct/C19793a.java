package p727ct;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.pfm.financialcalendar.entity.FinancialCalendarDayEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.financialcalendar.entity.FinancialCalendarEntity;
import p718bt.C19408d;
import p718bt.C19410e;
import p730cw.C19805a;

/* renamed from: ct.a */
public final class C19793a {

    /* renamed from: b */
    public static final C19794a f54167b = new C19794a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private static final SimpleDateFormat f54168c = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

    /* renamed from: a */
    private final C19410e f54169a;

    /* renamed from: ct.a$a */
    public static final class C19794a {
        private C19794a() {
        }

        public /* synthetic */ C19794a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C19793a(C19410e eVar) {
        C41536l.m120489i(eVar, "calendarHeatMapSettings");
        this.f54169a = eVar;
    }

    /* renamed from: a */
    public final C19805a mo48081a(Date date, FinancialCalendarDayEntity financialCalendarDayEntity) {
        String str;
        String str2;
        C41536l.m120489i(date, "date");
        C41536l.m120489i(financialCalendarDayEntity, "day");
        C19408d a = this.f54169a.mo47640a(financialCalendarDayEntity.getBogHeatLevel());
        BigDecimal totalIn = financialCalendarDayEntity.getTotalIn();
        BigDecimal totalOut = financialCalendarDayEntity.getTotalOut();
        String str3 = null;
        if (a != null) {
            str = a.mo47633b();
        } else {
            str = null;
        }
        if (a != null) {
            str2 = a.mo47635d();
        } else {
            str2 = null;
        }
        if (a != null) {
            str3 = a.mo47634c();
        }
        return new C19805a(date, totalIn, totalOut, str, str2, str3);
    }

    /* renamed from: b */
    public final List mo48082b(FinancialCalendarEntity financialCalendarEntity) {
        C41536l.m120489i(financialCalendarEntity, "financialCalendarEntity");
        return mo48083c(financialCalendarEntity.getDays());
    }

    /* renamed from: c */
    public final List mo48083c(Map map) {
        C41536l.m120489i(map, "days");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Date parse = f54168c.parse((String) entry.getKey());
            C41536l.m120488h(parse, "DATE_FORMAT.parse(it.key)");
            arrayList.add(mo48081a(parse, (FinancialCalendarDayEntity) entry.getValue()));
        }
        return arrayList;
    }
}

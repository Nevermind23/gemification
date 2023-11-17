package p342j$.time.format;

import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import p342j$.time.C9288c;
import p342j$.time.ZoneId;
import p342j$.time.chrono.C9294f;
import p342j$.time.chrono.C9295g;
import p342j$.time.temporal.C9333a;
import p342j$.time.temporal.C9341i;
import p342j$.time.temporal.TemporalAccessor;

/* renamed from: j$.time.format.DateTimeFormatter */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter RFC_1123_DATE_TIME;

    /* renamed from: f */
    public static final DateTimeFormatter f25774f;

    /* renamed from: a */
    private final C9305f f25775a;

    /* renamed from: b */
    private final Locale f25776b;

    /* renamed from: c */
    private final C9324y f25777c;

    /* renamed from: d */
    private final C9294f f25778d;

    /* renamed from: e */
    private final ZoneId f25779e;

    static {
        C9319t tVar = new C9319t();
        C9333a aVar = C9333a.YEAR;
        C9299A a = C9299A.EXCEEDS_PAD;
        tVar.mo25066l(aVar, 4, 10, a);
        tVar.mo25059e('-');
        C9333a aVar2 = C9333a.MONTH_OF_YEAR;
        tVar.mo25067n(aVar2, 2);
        tVar.mo25059e('-');
        C9333a aVar3 = C9333a.DAY_OF_MONTH;
        tVar.mo25067n(aVar3, 2);
        C9325z zVar = C9325z.STRICT;
        C9295g gVar = C9295g.f25767a;
        DateTimeFormatter u = tVar.mo25074u(zVar, gVar);
        ISO_LOCAL_DATE = u;
        C9319t tVar2 = new C9319t();
        tVar2.mo25071r();
        tVar2.mo25056a(u);
        tVar2.mo25062h();
        tVar2.mo25074u(zVar, gVar);
        C9319t tVar3 = new C9319t();
        tVar3.mo25071r();
        tVar3.mo25056a(u);
        tVar3.mo25070q();
        tVar3.mo25062h();
        tVar3.mo25074u(zVar, gVar);
        C9319t tVar4 = new C9319t();
        C9333a aVar4 = C9333a.HOUR_OF_DAY;
        tVar4.mo25067n(aVar4, 2);
        tVar4.mo25059e(':');
        C9333a aVar5 = C9333a.MINUTE_OF_HOUR;
        tVar4.mo25067n(aVar5, 2);
        tVar4.mo25070q();
        tVar4.mo25059e(':');
        C9333a aVar6 = C9333a.SECOND_OF_MINUTE;
        tVar4.mo25067n(aVar6, 2);
        tVar4.mo25070q();
        tVar4.mo25057b(C9333a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter u2 = tVar4.mo25074u(zVar, (C9295g) null);
        C9319t tVar5 = new C9319t();
        tVar5.mo25071r();
        tVar5.mo25056a(u2);
        tVar5.mo25062h();
        tVar5.mo25074u(zVar, (C9295g) null);
        C9319t tVar6 = new C9319t();
        tVar6.mo25071r();
        tVar6.mo25056a(u2);
        tVar6.mo25070q();
        tVar6.mo25062h();
        tVar6.mo25074u(zVar, (C9295g) null);
        C9319t tVar7 = new C9319t();
        tVar7.mo25071r();
        tVar7.mo25056a(u);
        tVar7.mo25059e('T');
        tVar7.mo25056a(u2);
        DateTimeFormatter u3 = tVar7.mo25074u(zVar, gVar);
        C9319t tVar8 = new C9319t();
        tVar8.mo25071r();
        tVar8.mo25056a(u3);
        tVar8.mo25062h();
        DateTimeFormatter u4 = tVar8.mo25074u(zVar, gVar);
        C9319t tVar9 = new C9319t();
        tVar9.mo25056a(u4);
        tVar9.mo25070q();
        tVar9.mo25059e('[');
        tVar9.mo25072s();
        tVar9.mo25068o();
        tVar9.mo25059e(']');
        tVar9.mo25074u(zVar, gVar);
        C9319t tVar10 = new C9319t();
        tVar10.mo25056a(u3);
        tVar10.mo25070q();
        tVar10.mo25062h();
        tVar10.mo25070q();
        tVar10.mo25059e('[');
        tVar10.mo25072s();
        tVar10.mo25068o();
        tVar10.mo25059e(']');
        tVar10.mo25074u(zVar, gVar);
        C9319t tVar11 = new C9319t();
        tVar11.mo25071r();
        tVar11.mo25066l(aVar, 4, 10, a);
        tVar11.mo25059e('-');
        tVar11.mo25067n(C9333a.DAY_OF_YEAR, 3);
        tVar11.mo25070q();
        tVar11.mo25062h();
        tVar11.mo25074u(zVar, gVar);
        C9319t tVar12 = new C9319t();
        tVar12.mo25071r();
        tVar12.mo25066l(C9341i.f25879c, 4, 10, a);
        tVar12.mo25060f("-W");
        tVar12.mo25067n(C9341i.f25878b, 2);
        tVar12.mo25059e('-');
        C9333a aVar7 = C9333a.DAY_OF_WEEK;
        tVar12.mo25067n(aVar7, 1);
        tVar12.mo25070q();
        tVar12.mo25062h();
        tVar12.mo25074u(zVar, gVar);
        C9319t tVar13 = new C9319t();
        tVar13.mo25071r();
        tVar13.mo25058c();
        f25774f = tVar13.mo25074u(zVar, (C9295g) null);
        C9319t tVar14 = new C9319t();
        tVar14.mo25071r();
        tVar14.mo25067n(aVar, 4);
        tVar14.mo25067n(aVar2, 2);
        tVar14.mo25067n(aVar3, 2);
        tVar14.mo25070q();
        tVar14.mo25061g("+HHMMss", "Z");
        tVar14.mo25074u(zVar, gVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        C9295g gVar2 = gVar;
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        C9319t tVar15 = new C9319t();
        tVar15.mo25071r();
        tVar15.mo25073t();
        tVar15.mo25070q();
        tVar15.mo25064j(aVar7, hashMap);
        tVar15.mo25060f(", ");
        tVar15.mo25069p();
        tVar15.mo25066l(aVar3, 1, 2, C9299A.NOT_NEGATIVE);
        tVar15.mo25059e(' ');
        tVar15.mo25064j(aVar2, hashMap2);
        tVar15.mo25059e(' ');
        tVar15.mo25067n(aVar, 4);
        tVar15.mo25059e(' ');
        tVar15.mo25067n(aVar4, 2);
        tVar15.mo25059e(':');
        tVar15.mo25067n(aVar5, 2);
        tVar15.mo25070q();
        tVar15.mo25059e(':');
        tVar15.mo25067n(aVar6, 2);
        tVar15.mo25069p();
        tVar15.mo25059e(' ');
        tVar15.mo25061g("+HHMM", "GMT");
        RFC_1123_DATE_TIME = tVar15.mo25074u(C9325z.SMART, gVar2);
    }

    DateTimeFormatter(C9305f fVar, Locale locale, C9325z zVar, C9295g gVar) {
        C9324y yVar = C9324y.f25841a;
        this.f25775a = fVar;
        if (locale != null) {
            this.f25776b = locale;
            this.f25777c = yVar;
            if (zVar != null) {
                this.f25778d = gVar;
                this.f25779e = null;
                return;
            }
            throw new NullPointerException("resolverStyle");
        }
        throw new NullPointerException(C11772k.C11773a.f34182n);
    }

    public static DateTimeFormatter ofPattern(String str) {
        C9319t tVar = new C9319t();
        tVar.mo25063i(str);
        return tVar.mo25075v(Locale.getDefault());
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        C9319t tVar = new C9319t();
        tVar.mo25063i(str);
        return tVar.mo25075v(locale);
    }

    /* renamed from: a */
    public final C9294f mo25028a() {
        return this.f25778d;
    }

    /* renamed from: b */
    public final C9324y mo25029b() {
        return this.f25777c;
    }

    /* renamed from: c */
    public final Locale mo25030c() {
        return this.f25776b;
    }

    /* renamed from: d */
    public final ZoneId mo25031d() {
        return this.f25779e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C9305f mo25032e() {
        return this.f25775a.mo25041b();
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        if (temporalAccessor != null) {
            try {
                this.f25775a.mo25039a(new C9321v(temporalAccessor, this), sb);
                return sb.toString();
            } catch (IOException e) {
                throw new C9288c(e.getMessage(), e);
            }
        } else {
            throw new NullPointerException("temporal");
        }
    }

    public final String toString() {
        String fVar = this.f25775a.toString();
        return fVar.startsWith("[") ? fVar : fVar.substring(1, fVar.length() - 1);
    }
}

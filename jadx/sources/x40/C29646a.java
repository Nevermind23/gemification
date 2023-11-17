package x40;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay;

/* renamed from: x40.a */
public final class C29646a {

    /* renamed from: a */
    private final CalendarDay f74812a;

    /* renamed from: b */
    private final BigDecimal f74813b;

    /* renamed from: c */
    private final BigDecimal f74814c;

    /* renamed from: d */
    private final int f74815d;

    /* renamed from: e */
    private final int f74816e;

    /* renamed from: f */
    private final int f74817f;

    public C29646a(CalendarDay calendarDay, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, int i2, int i3) {
        C41536l.m120489i(calendarDay, "date");
        C41536l.m120489i(bigDecimal, "totalIn");
        C41536l.m120489i(bigDecimal2, "totalOut");
        this.f74812a = calendarDay;
        this.f74813b = bigDecimal;
        this.f74814c = bigDecimal2;
        this.f74815d = i;
        this.f74816e = i2;
        this.f74817f = i3;
    }

    /* renamed from: a */
    public final int mo69564a() {
        return this.f74815d;
    }

    /* renamed from: b */
    public final CalendarDay mo69565b() {
        return this.f74812a;
    }

    /* renamed from: c */
    public final int mo69566c() {
        return this.f74816e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29646a)) {
            return false;
        }
        C29646a aVar = (C29646a) obj;
        return C41536l.m120484d(this.f74812a, aVar.f74812a) && C41536l.m120484d(this.f74813b, aVar.f74813b) && C41536l.m120484d(this.f74814c, aVar.f74814c) && this.f74815d == aVar.f74815d && this.f74816e == aVar.f74816e && this.f74817f == aVar.f74817f;
    }

    public int hashCode() {
        return (((((((((this.f74812a.hashCode() * 31) + this.f74813b.hashCode()) * 31) + this.f74814c.hashCode()) * 31) + this.f74815d) * 31) + this.f74816e) * 31) + this.f74817f;
    }

    public String toString() {
        CalendarDay calendarDay = this.f74812a;
        BigDecimal bigDecimal = this.f74813b;
        BigDecimal bigDecimal2 = this.f74814c;
        int i = this.f74815d;
        int i2 = this.f74816e;
        int i3 = this.f74817f;
        return "CalendarDayModel(date=" + calendarDay + ", totalIn=" + bigDecimal + ", totalOut=" + bigDecimal2 + ", backgroundColor=" + i + ", textColor=" + i2 + ", strokeColor=" + i3 + ")";
    }
}

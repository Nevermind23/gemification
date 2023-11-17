package o21;

import com.google.android.material.datepicker.CalendarConstraints;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: o21.a */
public final class C37586a {

    /* renamed from: a */
    private final CalendarConstraints f90323a;

    /* renamed from: b */
    private final Long f90324b;

    public C37586a(CalendarConstraints calendarConstraints, Long l) {
        C41536l.m120489i(calendarConstraints, "constraints");
        this.f90323a = calendarConstraints;
        this.f90324b = l;
    }

    /* renamed from: a */
    public final CalendarConstraints mo90772a() {
        return this.f90323a;
    }

    /* renamed from: b */
    public final Long mo90773b() {
        return this.f90324b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37586a)) {
            return false;
        }
        C37586a aVar = (C37586a) obj;
        return C41536l.m120484d(this.f90323a, aVar.f90323a) && C41536l.m120484d(this.f90324b, aVar.f90324b);
    }

    public int hashCode() {
        int hashCode = this.f90323a.hashCode() * 31;
        Long l = this.f90324b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        CalendarConstraints calendarConstraints = this.f90323a;
        Long l = this.f90324b;
        return "DatePickerData(constraints=" + calendarConstraints + ", selectedDate=" + l + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37586a(CalendarConstraints calendarConstraints, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(calendarConstraints, (i & 2) != 0 ? null : l);
    }
}

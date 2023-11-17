package cm0;

import com.google.android.material.datepicker.CalendarConstraints;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: cm0.a */
public final class C19781a {

    /* renamed from: a */
    private final CalendarConstraints f54153a;

    /* renamed from: b */
    private final long f54154b;

    public C19781a(CalendarConstraints calendarConstraints, long j) {
        C41536l.m120489i(calendarConstraints, "constraints");
        this.f54153a = calendarConstraints;
        this.f54154b = j;
    }

    /* renamed from: a */
    public final CalendarConstraints mo48065a() {
        return this.f54153a;
    }

    /* renamed from: b */
    public final long mo48066b() {
        return this.f54154b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19781a)) {
            return false;
        }
        C19781a aVar = (C19781a) obj;
        return C41536l.m120484d(this.f54153a, aVar.f54153a) && this.f54154b == aVar.f54154b;
    }

    public int hashCode() {
        return (this.f54153a.hashCode() * 31) + C7397t.m28148a(this.f54154b);
    }

    public String toString() {
        CalendarConstraints calendarConstraints = this.f54153a;
        long j = this.f54154b;
        return "BirthDatePickerData(constraints=" + calendarConstraints + ", selection=" + j + ")";
    }
}

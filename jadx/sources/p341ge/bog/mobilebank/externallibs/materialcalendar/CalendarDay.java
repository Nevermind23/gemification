package p341ge.bog.mobilebank.externallibs.materialcalendar;

import android.os.Parcel;
import android.os.Parcelable;
import p342j$.time.LocalDate;

/* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay */
public final class CalendarDay implements Parcelable {
    public static final Parcelable.Creator<CalendarDay> CREATOR = new C23305a();

    /* renamed from: d */
    private final LocalDate f60936d;

    /* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay$a */
    class C23305a implements Parcelable.Creator {
        C23305a() {
        }

        /* renamed from: a */
        public CalendarDay createFromParcel(Parcel parcel) {
            return new CalendarDay(parcel);
        }

        /* renamed from: b */
        public CalendarDay[] newArray(int i) {
            return new CalendarDay[i];
        }
    }

    private CalendarDay(int i, int i2, int i3) {
        this.f60936d = LocalDate.m34218of(i, i2, i3);
    }

    /* renamed from: a */
    public static CalendarDay m75253a(int i, int i2, int i3) {
        return new CalendarDay(i, i2, i3);
    }

    /* renamed from: b */
    public static CalendarDay m75254b(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        return new CalendarDay(localDate);
    }

    /* renamed from: h */
    private static int m75255h(int i, int i2, int i3) {
        return (i * 10000) + (i2 * 100) + i3;
    }

    /* renamed from: l */
    public static CalendarDay m75256l() {
        return m75254b(LocalDate.now());
    }

    /* renamed from: d */
    public LocalDate mo58860d() {
        return this.f60936d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo58862e() {
        return this.f60936d.getDayOfMonth();
    }

    public boolean equals(Object obj) {
        return (obj instanceof CalendarDay) && this.f60936d.equals(((CalendarDay) obj).mo58860d());
    }

    /* renamed from: f */
    public int mo58864f() {
        return this.f60936d.getMonthValue();
    }

    /* renamed from: g */
    public int mo58865g() {
        return this.f60936d.getYear();
    }

    public int hashCode() {
        return m75255h(this.f60936d.getYear(), this.f60936d.getMonthValue(), this.f60936d.getDayOfMonth());
    }

    /* renamed from: i */
    public boolean mo58867i(CalendarDay calendarDay) {
        return this.f60936d.isAfter(calendarDay.mo58860d());
    }

    /* renamed from: j */
    public boolean mo58868j(CalendarDay calendarDay) {
        return this.f60936d.isBefore(calendarDay.mo58860d());
    }

    /* renamed from: k */
    public boolean mo58869k(CalendarDay calendarDay, CalendarDay calendarDay2) {
        if ((calendarDay == null || !calendarDay.mo58867i(this)) && (calendarDay2 == null || !calendarDay2.mo58868j(this))) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "CalendarDay{" + this.f60936d.getYear() + "-" + this.f60936d.getMonthValue() + "-" + this.f60936d.getDayOfMonth() + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f60936d.getYear());
        parcel.writeInt(this.f60936d.getMonthValue());
        parcel.writeInt(this.f60936d.getDayOfMonth());
    }

    private CalendarDay(LocalDate localDate) {
        this.f60936d = localDate;
    }

    public CalendarDay(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}

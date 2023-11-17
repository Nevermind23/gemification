package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.C1002c;
import java.util.Arrays;

public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C4985a();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Month f15902d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Month f15903e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final DateValidator f15904f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Month f15905g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f15906h;

    /* renamed from: i */
    private final int f15907i;

    /* renamed from: j */
    private final int f15908j;

    public interface DateValidator extends Parcelable {
        /* renamed from: c */
        boolean mo16149c(long j);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    class C4985a implements Parcelable.Creator {
        C4985a() {
        }

        /* renamed from: a */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            Class<Month> cls = Month.class;
            return new CalendarConstraints((Month) parcel.readParcelable(cls.getClassLoader()), (Month) parcel.readParcelable(cls.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(cls.getClassLoader()), parcel.readInt(), (C4985a) null);
        }

        /* renamed from: b */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i, C4985a aVar) {
        this(month, month2, dateValidator, month3, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (!this.f15902d.equals(calendarConstraints.f15902d) || !this.f15903e.equals(calendarConstraints.f15903e) || !C1002c.m3509a(this.f15905g, calendarConstraints.f15905g) || this.f15906h != calendarConstraints.f15906h || !this.f15904f.equals(calendarConstraints.f15904f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Month mo16137g(Month month) {
        if (month.compareTo(this.f15902d) < 0) {
            return this.f15902d;
        }
        if (month.compareTo(this.f15903e) > 0) {
            return this.f15903e;
        }
        return month;
    }

    /* renamed from: h */
    public DateValidator mo16138h() {
        return this.f15904f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15902d, this.f15903e, this.f15905g, Integer.valueOf(this.f15906h), this.f15904f});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Month mo16140i() {
        return this.f15903e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo16141j() {
        return this.f15906h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo16142k() {
        return this.f15908j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Month mo16143l() {
        return this.f15905g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Month mo16144m() {
        return this.f15902d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo16145p() {
        return this.f15907i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo16146q(long j) {
        if (this.f15902d.mo16210h(1) <= j) {
            Month month = this.f15903e;
            if (j <= month.mo16210h(month.f15929h)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo16147r(Month month) {
        this.f15905g = month;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f15902d, 0);
        parcel.writeParcelable(this.f15903e, 0);
        parcel.writeParcelable(this.f15905g, 0);
        parcel.writeParcelable(this.f15904f, 0);
        parcel.writeInt(this.f15906h);
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        this.f15902d = month;
        this.f15903e = month2;
        this.f15905g = month3;
        this.f15906h = i;
        this.f15904f = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i < 0 || i > C5045x.m19625q().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else {
            this.f15908j = month.mo16216s(month2) + 1;
            this.f15907i = (month2.f15927f - month.f15927f) + 1;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$b */
    public static final class C4986b {

        /* renamed from: f */
        static final long f15909f = C5045x.m19609a(Month.m19419b(1900, 0).f15930i);

        /* renamed from: g */
        static final long f15910g = C5045x.m19609a(Month.m19419b(2100, 11).f15930i);

        /* renamed from: a */
        private long f15911a = f15909f;

        /* renamed from: b */
        private long f15912b = f15910g;

        /* renamed from: c */
        private Long f15913c;

        /* renamed from: d */
        private int f15914d;

        /* renamed from: e */
        private DateValidator f15915e = DateValidatorPointForward.m19410a(Long.MIN_VALUE);

        public C4986b() {
        }

        /* renamed from: a */
        public CalendarConstraints mo16154a() {
            Month month;
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f15915e);
            Month e = Month.m19420e(this.f15911a);
            Month e2 = Month.m19420e(this.f15912b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.f15913c;
            if (l == null) {
                month = null;
            } else {
                month = Month.m19420e(l.longValue());
            }
            return new CalendarConstraints(e, e2, dateValidator, month, this.f15914d, (C4985a) null);
        }

        /* renamed from: b */
        public C4986b mo16155b(long j) {
            this.f15912b = j;
            return this;
        }

        /* renamed from: c */
        public C4986b mo16156c(long j) {
            this.f15913c = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C4986b mo16157d(long j) {
            this.f15911a = j;
            return this;
        }

        /* renamed from: e */
        public C4986b mo16158e(DateValidator dateValidator) {
            this.f15915e = dateValidator;
            return this;
        }

        C4986b(CalendarConstraints calendarConstraints) {
            this.f15911a = calendarConstraints.f15902d.f15930i;
            this.f15912b = calendarConstraints.f15903e.f15930i;
            this.f15913c = Long.valueOf(calendarConstraints.f15905g.f15930i);
            this.f15914d = calendarConstraints.f15906h;
            this.f15915e = calendarConstraints.f15904f;
        }
    }
}

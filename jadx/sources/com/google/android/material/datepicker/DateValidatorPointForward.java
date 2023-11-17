package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new C4992a();

    /* renamed from: d */
    private final long f15921d;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointForward$a */
    class C4992a implements Parcelable.Creator {
        C4992a() {
        }

        /* renamed from: a */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), (C4992a) null);
        }

        /* renamed from: b */
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    }

    /* synthetic */ DateValidatorPointForward(long j, C4992a aVar) {
        this(j);
    }

    /* renamed from: a */
    public static DateValidatorPointForward m19410a(long j) {
        return new DateValidatorPointForward(j);
    }

    /* renamed from: c */
    public boolean mo16149c(long j) {
        return j >= this.f15921d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateValidatorPointForward)) {
            return false;
        }
        if (this.f15921d == ((DateValidatorPointForward) obj).f15921d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f15921d)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f15921d);
    }

    private DateValidatorPointForward(long j) {
        this.f15921d = j;
    }
}

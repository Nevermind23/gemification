package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new C4991a();

    /* renamed from: d */
    private final long f15920d;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointBackward$a */
    class C4991a implements Parcelable.Creator {
        C4991a() {
        }

        /* renamed from: a */
        public DateValidatorPointBackward createFromParcel(Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong(), (C4991a) null);
        }

        /* renamed from: b */
        public DateValidatorPointBackward[] newArray(int i) {
            return new DateValidatorPointBackward[i];
        }
    }

    /* synthetic */ DateValidatorPointBackward(long j, C4991a aVar) {
        this(j);
    }

    /* renamed from: a */
    public static DateValidatorPointBackward m19406a(long j) {
        return new DateValidatorPointBackward(j);
    }

    /* renamed from: c */
    public boolean mo16149c(long j) {
        return j <= this.f15920d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateValidatorPointBackward)) {
            return false;
        }
        if (this.f15920d == ((DateValidatorPointBackward) obj).f15920d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f15920d)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f15920d);
    }

    private DateValidatorPointBackward(long j) {
        this.f15920d = j;
    }
}

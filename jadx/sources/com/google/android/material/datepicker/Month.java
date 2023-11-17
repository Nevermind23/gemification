package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C4994a();

    /* renamed from: d */
    private final Calendar f15925d;

    /* renamed from: e */
    final int f15926e;

    /* renamed from: f */
    final int f15927f;

    /* renamed from: g */
    final int f15928g;

    /* renamed from: h */
    final int f15929h;

    /* renamed from: i */
    final long f15930i;

    /* renamed from: j */
    private String f15931j;

    /* renamed from: com.google.android.material.datepicker.Month$a */
    class C4994a implements Parcelable.Creator {
        C4994a() {
        }

        /* renamed from: a */
        public Month createFromParcel(Parcel parcel) {
            return Month.m19419b(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar f = C5045x.m19614f(calendar);
        this.f15925d = f;
        this.f15926e = f.get(2);
        this.f15927f = f.get(1);
        this.f15928g = f.getMaximum(7);
        this.f15929h = f.getActualMaximum(5);
        this.f15930i = f.getTimeInMillis();
    }

    /* renamed from: b */
    static Month m19419b(int i, int i2) {
        Calendar q = C5045x.m19625q();
        q.set(1, i);
        q.set(2, i2);
        return new Month(q);
    }

    /* renamed from: e */
    static Month m19420e(long j) {
        Calendar q = C5045x.m19625q();
        q.setTimeInMillis(j);
        return new Month(q);
    }

    /* renamed from: f */
    static Month m19421f() {
        return new Month(C5045x.m19623o());
    }

    /* renamed from: a */
    public int compareTo(Month month) {
        return this.f15925d.compareTo(month.f15925d);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.f15926e == month.f15926e && this.f15927f == month.f15927f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo16209g(int i) {
        int i2 = this.f15925d.get(7);
        if (i <= 0) {
            i = this.f15925d.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + this.f15928g;
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public long mo16210h(int i) {
        Calendar f = C5045x.m19614f(this.f15925d);
        f.set(5, i);
        return f.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15926e), Integer.valueOf(this.f15927f)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo16212j(long j) {
        Calendar f = C5045x.m19614f(this.f15925d);
        f.setTimeInMillis(j);
        return f.get(5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public String mo16213l() {
        if (this.f15931j == null) {
            this.f15931j = C5008i.m19502i(this.f15925d.getTimeInMillis());
        }
        return this.f15931j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public long mo16214q() {
        return this.f15925d.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Month mo16215r(int i) {
        Calendar f = C5045x.m19614f(this.f15925d);
        f.add(2, i);
        return new Month(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo16216s(Month month) {
        if (this.f15925d instanceof GregorianCalendar) {
            return ((month.f15927f - this.f15927f) * 12) + (month.f15926e - this.f15926e);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f15927f);
        parcel.writeInt(this.f15926e);
    }
}

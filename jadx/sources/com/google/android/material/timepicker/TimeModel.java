package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C5222a();

    /* renamed from: d */
    private final C5229b f16751d;

    /* renamed from: e */
    private final C5229b f16752e;

    /* renamed from: f */
    final int f16753f;

    /* renamed from: g */
    int f16754g;

    /* renamed from: h */
    int f16755h;

    /* renamed from: i */
    int f16756i;

    /* renamed from: j */
    int f16757j;

    /* renamed from: com.google.android.material.timepicker.TimeModel$a */
    class C5222a implements Parcelable.Creator {
        C5222a() {
        }

        /* renamed from: a */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        /* renamed from: b */
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0);
    }

    /* renamed from: a */
    public static String m20637a(Resources resources, CharSequence charSequence) {
        return m20638b(resources, charSequence, "%02d");
    }

    /* renamed from: b */
    public static String m20638b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    /* renamed from: d */
    private static int m20639d(int i) {
        return i >= 12 ? 1 : 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.f16754g == timeModel.f16754g && this.f16755h == timeModel.f16755h && this.f16753f == timeModel.f16753f && this.f16756i == timeModel.f16756i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16753f), Integer.valueOf(this.f16754g), Integer.valueOf(this.f16755h), Integer.valueOf(this.f16756i)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f16754g);
        parcel.writeInt(this.f16755h);
        parcel.writeInt(this.f16756i);
        parcel.writeInt(this.f16753f);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f16754g = i;
        this.f16755h = i2;
        this.f16756i = i3;
        this.f16753f = i4;
        this.f16757j = m20639d(i);
        this.f16751d = new C5229b(59);
        this.f16752e = new C5229b(i4 == 1 ? 24 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}

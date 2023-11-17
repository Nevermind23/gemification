package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

public enum zzay implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");
    
    public static final Parcelable.Creator<zzay> CREATOR = null;

    /* renamed from: d */
    private final String f12996d;

    static {
        CREATOR = new C4041j();
    }

    private zzay(String str) {
        this.f12996d = str;
    }

    /* renamed from: a */
    public static zzay m15381a(String str) {
        for (zzay zzay : values()) {
            if (str.equals(zzay.f12996d)) {
                return zzay;
            }
        }
        throw new zzax(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f12996d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12996d);
    }
}

package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public enum ErrorCode implements Parcelable {
    OK(0),
    OTHER_ERROR(1),
    BAD_REQUEST(2),
    CONFIGURATION_UNSUPPORTED(3),
    DEVICE_INELIGIBLE(4),
    TIMEOUT(5);
    
    public static final Parcelable.Creator<ErrorCode> CREATOR = null;

    /* renamed from: k */
    private static final String f13025k = null;

    /* renamed from: d */
    private final int f13027d;

    static {
        f13025k = ErrorCode.class.getSimpleName();
        CREATOR = new C4059c();
    }

    private ErrorCode(int i) {
        this.f13027d = i;
    }

    /* renamed from: b */
    public static ErrorCode m15387b(int i) {
        for (ErrorCode errorCode : values()) {
            if (i == errorCode.f13027d) {
                return errorCode;
            }
        }
        return OTHER_ERROR;
    }

    /* renamed from: a */
    public int mo12677a() {
        return this.f13027d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13027d);
    }
}

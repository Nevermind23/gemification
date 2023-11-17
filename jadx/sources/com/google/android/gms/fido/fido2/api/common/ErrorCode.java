package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

public enum ErrorCode implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);
    
    public static final Parcelable.Creator<ErrorCode> CREATOR = null;

    /* renamed from: d */
    private final int f12916d;

    public static class UnsupportedErrorCodeException extends Exception {
        public UnsupportedErrorCodeException(int i) {
            super(String.format(Locale.US, "Error code %d is not supported", new Object[]{Integer.valueOf(i)}));
        }
    }

    static {
        CREATOR = new C4055x();
    }

    private ErrorCode(int i) {
        this.f12916d = i;
    }

    /* renamed from: b */
    public static ErrorCode m15325b(int i) {
        for (ErrorCode errorCode : values()) {
            if (i == errorCode.f12916d) {
                return errorCode;
            }
        }
        throw new UnsupportedErrorCodeException(i);
    }

    /* renamed from: a */
    public int mo12483a() {
        return this.f12916d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12916d);
    }
}

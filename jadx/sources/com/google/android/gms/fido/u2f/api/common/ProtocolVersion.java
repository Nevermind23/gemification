package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public enum ProtocolVersion implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");
    
    public static final Parcelable.Creator<ProtocolVersion> CREATOR = null;

    /* renamed from: d */
    private final String f13038d;

    public static class UnsupportedProtocolException extends Exception {
        public UnsupportedProtocolException(String str) {
            super(String.format("Protocol version %s not supported", new Object[]{str}));
        }
    }

    static {
        CREATOR = new C4062f();
    }

    private ProtocolVersion(String str) {
        this.f13038d = str;
    }

    /* renamed from: a */
    public static ProtocolVersion m15395a(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (ProtocolVersion protocolVersion : values()) {
            if (str.equals(protocolVersion.f13038d)) {
                return protocolVersion;
            }
        }
        throw new UnsupportedProtocolException(str);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f13038d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13038d);
    }
}

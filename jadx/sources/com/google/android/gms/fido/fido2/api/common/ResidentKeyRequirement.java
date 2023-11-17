package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

public enum ResidentKeyRequirement implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");
    
    public static final Parcelable.Creator<ResidentKeyRequirement> CREATOR = null;

    /* renamed from: d */
    private final String f12973d;

    public static class UnsupportedResidentKeyRequirementException extends Exception {
        public UnsupportedResidentKeyRequirementException(String str) {
            super(String.format("Resident key requirement %s not supported", new Object[]{str}));
        }
    }

    static {
        CREATOR = new C4038g();
    }

    private ResidentKeyRequirement(String str) {
        this.f12973d = str;
    }

    /* renamed from: a */
    public static ResidentKeyRequirement m15371a(String str) {
        for (ResidentKeyRequirement residentKeyRequirement : values()) {
            if (str.equals(residentKeyRequirement.f12973d)) {
                return residentKeyRequirement;
            }
        }
        throw new UnsupportedResidentKeyRequirementException(str);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f12973d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12973d);
    }
}

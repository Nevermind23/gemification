package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

public enum AttestationConveyancePreference implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");
    
    public static final Parcelable.Creator<AttestationConveyancePreference> CREATOR = null;

    /* renamed from: d */
    private final String f12864d;

    public static class UnsupportedAttestationConveyancePreferenceException extends Exception {
        public UnsupportedAttestationConveyancePreferenceException(String str) {
            super(String.format("Attestation conveyance preference %s not supported", new Object[]{str}));
        }
    }

    static {
        CREATOR = new C4043l();
    }

    private AttestationConveyancePreference(String str) {
        this.f12864d = str;
    }

    /* renamed from: a */
    public static AttestationConveyancePreference m15293a(String str) {
        for (AttestationConveyancePreference attestationConveyancePreference : values()) {
            if (str.equals(attestationConveyancePreference.f12864d)) {
                return attestationConveyancePreference;
            }
        }
        throw new UnsupportedAttestationConveyancePreferenceException(str);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f12864d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12864d);
    }
}

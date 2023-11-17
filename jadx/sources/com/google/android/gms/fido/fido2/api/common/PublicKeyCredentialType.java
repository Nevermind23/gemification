package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

public enum PublicKeyCredentialType implements Parcelable {
    PUBLIC_KEY("public-key");
    
    public static final Parcelable.Creator<PublicKeyCredentialType> CREATOR = null;

    /* renamed from: d */
    private final String f12964d;

    public static class UnsupportedPublicKeyCredTypeException extends Exception {
        public UnsupportedPublicKeyCredTypeException(String str) {
            super(str);
        }
    }

    static {
        CREATOR = new C4037f();
    }

    private PublicKeyCredentialType(String str) {
        this.f12964d = "public-key";
    }

    /* renamed from: a */
    public static PublicKeyCredentialType m15366a(String str) {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            if (str.equals(publicKeyCredentialType.f12964d)) {
                return publicKeyCredentialType;
            }
        }
        throw new UnsupportedPublicKeyCredTypeException(String.format("PublicKeyCredentialType %s not supported", new Object[]{str}));
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f12964d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12964d);
    }
}

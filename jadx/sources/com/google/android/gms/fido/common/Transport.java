package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable");
    
    public static final Parcelable.Creator<Transport> CREATOR = null;

    /* renamed from: d */
    private final String f12855d;

    public static class UnsupportedTransportException extends Exception {
        public UnsupportedTransportException(String str) {
            super(str);
        }
    }

    static {
        CREATOR = new C4031a();
    }

    private Transport(String str) {
        this.f12855d = str;
    }

    /* renamed from: a */
    public static Transport m15291a(String str) {
        for (Transport transport : values()) {
            if (str.equals(transport.f12855d)) {
                return transport;
            }
        }
        if (str.equals("hybrid")) {
            return HYBRID;
        }
        throw new UnsupportedTransportException(String.format("Transport %s not supported", new Object[]{str}));
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f12855d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12855d);
    }
}

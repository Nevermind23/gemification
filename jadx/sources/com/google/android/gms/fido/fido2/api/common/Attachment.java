package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11772k;

public enum Attachment implements Parcelable {
    PLATFORM(C11772k.C11773a.f34170b),
    CROSS_PLATFORM("cross-platform");
    
    public static final Parcelable.Creator<Attachment> CREATOR = null;

    /* renamed from: d */
    private final String f12859d;

    public static class UnsupportedAttachmentException extends Exception {
        public UnsupportedAttachmentException(String str) {
            super(String.format("Attachment %s not supported", new Object[]{str}));
        }
    }

    static {
        CREATOR = new C4033b();
    }

    private Attachment(String str) {
        this.f12859d = str;
    }

    /* renamed from: a */
    public static Attachment m15292a(String str) {
        for (Attachment attachment : values()) {
            if (str.equals(attachment.f12859d)) {
                return attachment;
            }
        }
        throw new UnsupportedAttachmentException(str);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f12859d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12859d);
    }
}

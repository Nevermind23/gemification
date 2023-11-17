package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;

/* renamed from: com.google.android.gms.fido.fido2.api.common.b */
final class C4033b implements Parcelable.Creator {
    C4033b() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return Attachment.m15292a(parcel.readString());
        } catch (Attachment.UnsupportedAttachmentException e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Attachment[i];
    }
}

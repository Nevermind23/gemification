package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;

/* renamed from: com.google.android.gms.fido.fido2.api.common.g */
final class C4038g implements Parcelable.Creator {
    C4038g() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        try {
            return ResidentKeyRequirement.m15371a(readString);
        } catch (ResidentKeyRequirement.UnsupportedResidentKeyRequirementException e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ResidentKeyRequirement[i];
    }
}

package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public class CreatePushProvisionSessionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreatePushProvisionSessionRequest> CREATOR = new C4888a();

    /* renamed from: d */
    private final String f15309d;

    CreatePushProvisionSessionRequest(String str) {
        this.f15309d = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, this.f15309d, false);
        C7461a.m28370b(parcel, a);
    }
}

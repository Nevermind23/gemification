package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p117i6.C6574c;
import p195o6.C7461a;

public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new C6574c();

    /* renamed from: d */
    Intent f12203d;

    public CloudMessage(Intent intent) {
        this.f12203d = intent;
    }

    /* renamed from: v */
    public Intent mo11820v() {
        return this.f12203d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 1, this.f12203d, i, false);
        C7461a.m28370b(parcel, a);
    }
}

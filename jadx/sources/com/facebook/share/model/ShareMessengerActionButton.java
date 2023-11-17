package com.facebook.share.model;

import android.os.Parcel;

@Deprecated
public abstract class ShareMessengerActionButton implements ShareModel {

    /* renamed from: d */
    private final String f8504d;

    ShareMessengerActionButton(Parcel parcel) {
        this.f8504d = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8504d);
    }
}

package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import p103h5.C6439a;

@Deprecated
public final class AppInviteContent implements ShareModel {
    @Deprecated
    public static final Parcelable.Creator<AppInviteContent> CREATOR = new C2702a();

    /* renamed from: d */
    private final String f8462d;

    /* renamed from: e */
    private final String f8463e;

    /* renamed from: f */
    private final String f8464f;

    /* renamed from: g */
    private final String f8465g;

    /* renamed from: h */
    private final C6439a f8466h;

    /* renamed from: com.facebook.share.model.AppInviteContent$a */
    static class C2702a implements Parcelable.Creator {
        C2702a() {
        }

        /* renamed from: a */
        public AppInviteContent createFromParcel(Parcel parcel) {
            return new AppInviteContent(parcel);
        }

        /* renamed from: b */
        public AppInviteContent[] newArray(int i) {
            return new AppInviteContent[i];
        }
    }

    AppInviteContent(Parcel parcel) {
        this.f8462d = parcel.readString();
        this.f8463e = parcel.readString();
        this.f8465g = parcel.readString();
        this.f8464f = parcel.readString();
        String readString = parcel.readString();
        if (readString.length() > 0) {
            this.f8466h = C6439a.valueOf(readString);
        } else {
            this.f8466h = C6439a.FACEBOOK;
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8462d);
        parcel.writeString(this.f8463e);
        parcel.writeString(this.f8465g);
        parcel.writeString(this.f8464f);
        parcel.writeString(this.f8466h.toString());
    }
}

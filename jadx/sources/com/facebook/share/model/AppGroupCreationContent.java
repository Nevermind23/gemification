package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class AppGroupCreationContent implements ShareModel {
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new C2700a();

    /* renamed from: d */
    private final String f8456d;

    /* renamed from: e */
    private final String f8457e;

    /* renamed from: f */
    private C2701b f8458f;

    /* renamed from: com.facebook.share.model.AppGroupCreationContent$a */
    static class C2700a implements Parcelable.Creator {
        C2700a() {
        }

        /* renamed from: a */
        public AppGroupCreationContent createFromParcel(Parcel parcel) {
            return new AppGroupCreationContent(parcel);
        }

        /* renamed from: b */
        public AppGroupCreationContent[] newArray(int i) {
            return new AppGroupCreationContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.AppGroupCreationContent$b */
    public enum C2701b {
        Open,
        Closed
    }

    AppGroupCreationContent(Parcel parcel) {
        this.f8456d = parcel.readString();
        this.f8457e = parcel.readString();
        this.f8458f = (C2701b) parcel.readSerializable();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8456d);
        parcel.writeString(this.f8457e);
        parcel.writeSerializable(this.f8458f);
    }
}

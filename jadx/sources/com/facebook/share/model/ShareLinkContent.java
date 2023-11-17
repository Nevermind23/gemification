package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class ShareLinkContent extends ShareContent<ShareLinkContent, Object> {
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new C2713a();

    /* renamed from: j */
    private final String f8497j;

    /* renamed from: k */
    private final String f8498k;

    /* renamed from: l */
    private final Uri f8499l;

    /* renamed from: m */
    private final String f8500m;

    /* renamed from: com.facebook.share.model.ShareLinkContent$a */
    static class C2713a implements Parcelable.Creator {
        C2713a() {
        }

        /* renamed from: a */
        public ShareLinkContent createFromParcel(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }

        /* renamed from: b */
        public ShareLinkContent[] newArray(int i) {
            return new ShareLinkContent[i];
        }
    }

    ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.f8497j = parcel.readString();
        this.f8498k = parcel.readString();
        this.f8499l = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f8500m = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo8550e() {
        return this.f8500m;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8497j);
        parcel.writeString(this.f8498k);
        parcel.writeParcelable(this.f8499l, 0);
        parcel.writeString(this.f8500m);
    }
}

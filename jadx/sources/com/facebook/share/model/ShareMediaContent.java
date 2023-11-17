package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class ShareMediaContent extends ShareContent<ShareMediaContent, Object> {
    public static final Parcelable.Creator<ShareMediaContent> CREATOR = new C2715a();

    /* renamed from: j */
    private final List f8503j;

    /* renamed from: com.facebook.share.model.ShareMediaContent$a */
    static class C2715a implements Parcelable.Creator {
        C2715a() {
        }

        /* renamed from: a */
        public ShareMediaContent createFromParcel(Parcel parcel) {
            return new ShareMediaContent(parcel);
        }

        /* renamed from: b */
        public ShareMediaContent[] newArray(int i) {
            return new ShareMediaContent[i];
        }
    }

    ShareMediaContent(Parcel parcel) {
        super(parcel);
        this.f8503j = Arrays.asList((ShareMedia[]) parcel.readParcelableArray(ShareMedia.class.getClassLoader()));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((ShareMedia[]) this.f8503j.toArray(), i);
    }
}

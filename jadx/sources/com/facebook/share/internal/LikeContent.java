package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareModel;

@Deprecated
public class LikeContent implements ShareModel {
    @Deprecated
    public static final Parcelable.Creator<LikeContent> CREATOR = new C2693a();

    /* renamed from: d */
    private final String f8447d;

    /* renamed from: e */
    private final String f8448e;

    /* renamed from: com.facebook.share.internal.LikeContent$a */
    static class C2693a implements Parcelable.Creator {
        C2693a() {
        }

        /* renamed from: a */
        public LikeContent createFromParcel(Parcel parcel) {
            return new LikeContent(parcel);
        }

        /* renamed from: b */
        public LikeContent[] newArray(int i) {
            return new LikeContent[i];
        }
    }

    LikeContent(Parcel parcel) {
        this.f8447d = parcel.readString();
        this.f8448e = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8447d);
        parcel.writeString(this.f8448e);
    }
}

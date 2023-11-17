package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.SharePhoto;
import java.util.Collections;
import java.util.List;

public final class SharePhotoContent extends ShareContent<SharePhotoContent, Object> {
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new C2731a();

    /* renamed from: j */
    private final List f8546j;

    /* renamed from: com.facebook.share.model.SharePhotoContent$a */
    static class C2731a implements Parcelable.Creator {
        C2731a() {
        }

        /* renamed from: a */
        public SharePhotoContent createFromParcel(Parcel parcel) {
            return new SharePhotoContent(parcel);
        }

        /* renamed from: b */
        public SharePhotoContent[] newArray(int i) {
            return new SharePhotoContent[i];
        }
    }

    SharePhotoContent(Parcel parcel) {
        super(parcel);
        this.f8546j = Collections.unmodifiableList(SharePhoto.C2730b.m10574n(parcel));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SharePhoto.C2730b.m10575s(parcel, i, this.f8546j);
    }
}

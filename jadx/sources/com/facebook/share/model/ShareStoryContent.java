package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ShareStoryContent extends ShareContent<ShareStoryContent, Object> {
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new C2732a();

    /* renamed from: j */
    private final ShareMedia f8547j;

    /* renamed from: k */
    private final SharePhoto f8548k;

    /* renamed from: l */
    private final List f8549l;

    /* renamed from: m */
    private final String f8550m;

    /* renamed from: com.facebook.share.model.ShareStoryContent$a */
    static class C2732a implements Parcelable.Creator {
        C2732a() {
        }

        /* renamed from: a */
        public ShareStoryContent createFromParcel(Parcel parcel) {
            return new ShareStoryContent(parcel);
        }

        /* renamed from: b */
        public ShareStoryContent[] newArray(int i) {
            return new ShareStoryContent[i];
        }
    }

    ShareStoryContent(Parcel parcel) {
        super(parcel);
        this.f8547j = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.f8548k = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        this.f8549l = m10587d(parcel);
        this.f8550m = parcel.readString();
    }

    /* renamed from: d */
    private List m10587d(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f8547j, 0);
        parcel.writeParcelable(this.f8548k, 0);
        parcel.writeStringList(this.f8549l);
        parcel.writeString(this.f8550m);
    }
}

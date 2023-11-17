package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphAction;

public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, Object> {
    public static final Parcelable.Creator<ShareOpenGraphContent> CREATOR = new C2726a();

    /* renamed from: j */
    private final ShareOpenGraphAction f8534j;

    /* renamed from: k */
    private final String f8535k;

    /* renamed from: com.facebook.share.model.ShareOpenGraphContent$a */
    static class C2726a implements Parcelable.Creator {
        C2726a() {
        }

        /* renamed from: a */
        public ShareOpenGraphContent createFromParcel(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }

        /* renamed from: b */
        public ShareOpenGraphContent[] newArray(int i) {
            return new ShareOpenGraphContent[i];
        }
    }

    ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        this.f8534j = new ShareOpenGraphAction.C2725b().mo8594e(parcel).mo8593d();
        this.f8535k = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public ShareOpenGraphAction mo8597e() {
        return this.f8534j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f8534j, 0);
        parcel.writeString(this.f8535k);
    }
}

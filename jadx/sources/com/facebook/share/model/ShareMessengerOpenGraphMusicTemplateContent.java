package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class ShareMessengerOpenGraphMusicTemplateContent extends ShareContent<ShareMessengerOpenGraphMusicTemplateContent, Object> {
    public static final Parcelable.Creator<ShareMessengerOpenGraphMusicTemplateContent> CREATOR = new C2721a();

    /* renamed from: j */
    private final Uri f8523j;

    /* renamed from: k */
    private final ShareMessengerActionButton f8524k;

    /* renamed from: com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent$a */
    static class C2721a implements Parcelable.Creator {
        C2721a() {
        }

        /* renamed from: a */
        public ShareMessengerOpenGraphMusicTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerOpenGraphMusicTemplateContent(parcel);
        }

        /* renamed from: b */
        public ShareMessengerOpenGraphMusicTemplateContent[] newArray(int i) {
            return new ShareMessengerOpenGraphMusicTemplateContent[i];
        }
    }

    ShareMessengerOpenGraphMusicTemplateContent(Parcel parcel) {
        super(parcel);
        this.f8523j = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f8524k = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8523j, i);
        parcel.writeParcelable(this.f8524k, i);
    }
}

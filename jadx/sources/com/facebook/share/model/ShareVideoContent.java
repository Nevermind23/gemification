package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideo;

public final class ShareVideoContent extends ShareContent<ShareVideoContent, Object> {
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new C2735a();

    /* renamed from: j */
    private final String f8553j;

    /* renamed from: k */
    private final String f8554k;

    /* renamed from: l */
    private final SharePhoto f8555l;

    /* renamed from: m */
    private final ShareVideo f8556m;

    /* renamed from: com.facebook.share.model.ShareVideoContent$a */
    static class C2735a implements Parcelable.Creator {
        C2735a() {
        }

        /* renamed from: a */
        public ShareVideoContent createFromParcel(Parcel parcel) {
            return new ShareVideoContent(parcel);
        }

        /* renamed from: b */
        public ShareVideoContent[] newArray(int i) {
            return new ShareVideoContent[i];
        }
    }

    ShareVideoContent(Parcel parcel) {
        super(parcel);
        this.f8553j = parcel.readString();
        this.f8554k = parcel.readString();
        SharePhoto.C2730b l = new SharePhoto.C2730b().mo8625l(parcel);
        if (l.mo8624k() == null && l.mo8623j() == null) {
            this.f8555l = null;
        } else {
            this.f8555l = l.mo8622i();
        }
        this.f8556m = new ShareVideo.C2734b().mo8645g(parcel).mo8644f();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8553j);
        parcel.writeString(this.f8554k);
        parcel.writeParcelable(this.f8555l, 0);
        parcel.writeParcelable(this.f8556m, 0);
    }
}

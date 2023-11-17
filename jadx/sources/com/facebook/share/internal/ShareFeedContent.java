package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;

public class ShareFeedContent extends ShareContent<ShareFeedContent, Object> {
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new C2694a();

    /* renamed from: j */
    private final String f8449j;

    /* renamed from: k */
    private final String f8450k;

    /* renamed from: l */
    private final String f8451l;

    /* renamed from: m */
    private final String f8452m;

    /* renamed from: n */
    private final String f8453n;

    /* renamed from: o */
    private final String f8454o;

    /* renamed from: p */
    private final String f8455p;

    /* renamed from: com.facebook.share.internal.ShareFeedContent$a */
    static class C2694a implements Parcelable.Creator {
        C2694a() {
        }

        /* renamed from: a */
        public ShareFeedContent createFromParcel(Parcel parcel) {
            return new ShareFeedContent(parcel);
        }

        /* renamed from: b */
        public ShareFeedContent[] newArray(int i) {
            return new ShareFeedContent[i];
        }
    }

    ShareFeedContent(Parcel parcel) {
        super(parcel);
        this.f8449j = parcel.readString();
        this.f8450k = parcel.readString();
        this.f8451l = parcel.readString();
        this.f8452m = parcel.readString();
        this.f8453n = parcel.readString();
        this.f8454o = parcel.readString();
        this.f8455p = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8449j);
        parcel.writeString(this.f8450k);
        parcel.writeString(this.f8451l);
        parcel.writeString(this.f8452m);
        parcel.writeString(this.f8453n);
        parcel.writeString(this.f8454o);
        parcel.writeString(this.f8455p);
    }
}

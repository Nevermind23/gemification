package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ShareHashtag implements ShareModel {
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new C2711a();

    /* renamed from: d */
    private final String f8495d;

    /* renamed from: com.facebook.share.model.ShareHashtag$a */
    static class C2711a implements Parcelable.Creator {
        C2711a() {
        }

        /* renamed from: a */
        public ShareHashtag createFromParcel(Parcel parcel) {
            return new ShareHashtag(parcel);
        }

        /* renamed from: b */
        public ShareHashtag[] newArray(int i) {
            return new ShareHashtag[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareHashtag$b */
    public static class C2712b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f8496a;

        /* renamed from: b */
        public ShareHashtag mo8546b() {
            return new ShareHashtag(this, (C2711a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C2712b mo8547c(Parcel parcel) {
            return mo8548d((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        /* renamed from: d */
        public C2712b mo8548d(ShareHashtag shareHashtag) {
            return shareHashtag == null ? this : mo8549e(shareHashtag.mo8539a());
        }

        /* renamed from: e */
        public C2712b mo8549e(String str) {
            this.f8496a = str;
            return this;
        }
    }

    /* synthetic */ ShareHashtag(C2712b bVar, C2711a aVar) {
        this(bVar);
    }

    /* renamed from: a */
    public String mo8539a() {
        return this.f8495d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8495d);
    }

    private ShareHashtag(C2712b bVar) {
        this.f8495d = bVar.f8496a;
    }

    ShareHashtag(Parcel parcel) {
        this.f8495d = parcel.readString();
    }
}

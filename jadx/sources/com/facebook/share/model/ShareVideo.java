package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;

public final class ShareVideo extends ShareMedia {
    public static final Parcelable.Creator<ShareVideo> CREATOR = new C2733a();

    /* renamed from: e */
    private final Uri f8551e;

    /* renamed from: com.facebook.share.model.ShareVideo$a */
    static class C2733a implements Parcelable.Creator {
        C2733a() {
        }

        /* renamed from: a */
        public ShareVideo createFromParcel(Parcel parcel) {
            return new ShareVideo(parcel);
        }

        /* renamed from: b */
        public ShareVideo[] newArray(int i) {
            return new ShareVideo[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareVideo$b */
    public static final class C2734b extends ShareMedia.C2714a {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Uri f8552b;

        /* renamed from: f */
        public ShareVideo mo8644f() {
            return new ShareVideo(this, (C2733a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C2734b mo8645g(Parcel parcel) {
            return mo8646h((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }

        /* renamed from: h */
        public C2734b mo8646h(ShareVideo shareVideo) {
            return shareVideo == null ? this : ((C2734b) super.mo8558b(shareVideo)).mo8647i(shareVideo.mo8639b());
        }

        /* renamed from: i */
        public C2734b mo8647i(Uri uri) {
            this.f8552b = uri;
            return this;
        }
    }

    /* synthetic */ ShareVideo(C2734b bVar, C2733a aVar) {
        this(bVar);
    }

    /* renamed from: b */
    public Uri mo8639b() {
        return this.f8551e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f8551e, 0);
    }

    private ShareVideo(C2734b bVar) {
        super((ShareMedia.C2714a) bVar);
        this.f8551e = bVar.f8552b;
    }

    ShareVideo(Parcel parcel) {
        super(parcel);
        this.f8551e = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}

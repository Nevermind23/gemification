package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import java.util.ArrayList;
import java.util.List;

public final class SharePhoto extends ShareMedia {
    public static final Parcelable.Creator<SharePhoto> CREATOR = new C2729a();

    /* renamed from: e */
    private final Bitmap f8538e;

    /* renamed from: f */
    private final Uri f8539f;

    /* renamed from: g */
    private final boolean f8540g;

    /* renamed from: h */
    private final String f8541h;

    /* renamed from: com.facebook.share.model.SharePhoto$a */
    static class C2729a implements Parcelable.Creator {
        C2729a() {
        }

        /* renamed from: a */
        public SharePhoto createFromParcel(Parcel parcel) {
            return new SharePhoto(parcel);
        }

        /* renamed from: b */
        public SharePhoto[] newArray(int i) {
            return new SharePhoto[i];
        }
    }

    /* renamed from: com.facebook.share.model.SharePhoto$b */
    public static final class C2730b extends ShareMedia.C2714a {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Bitmap f8542b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Uri f8543c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f8544d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f8545e;

        /* renamed from: n */
        static List m10574n(Parcel parcel) {
            List<ShareMedia> c = ShareMedia.C2714a.m10530c(parcel);
            ArrayList arrayList = new ArrayList();
            for (ShareMedia shareMedia : c) {
                if (shareMedia instanceof SharePhoto) {
                    arrayList.add((SharePhoto) shareMedia);
                }
            }
            return arrayList;
        }

        /* renamed from: s */
        static void m10575s(Parcel parcel, int i, List list) {
            ShareMedia[] shareMediaArr = new ShareMedia[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                shareMediaArr[i2] = (ShareMedia) list.get(i2);
            }
            parcel.writeParcelableArray(shareMediaArr, i);
        }

        /* renamed from: i */
        public SharePhoto mo8622i() {
            return new SharePhoto(this, (C2729a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public Bitmap mo8623j() {
            return this.f8542b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public Uri mo8624k() {
            return this.f8543c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C2730b mo8625l(Parcel parcel) {
            return mo8626m((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        /* renamed from: m */
        public C2730b mo8626m(SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                return this;
            }
            return ((C2730b) super.mo8558b(sharePhoto)).mo8627o(sharePhoto.mo8614b()).mo8629q(sharePhoto.mo8616e()).mo8630r(sharePhoto.mo8617f()).mo8628p(sharePhoto.mo8615d());
        }

        /* renamed from: o */
        public C2730b mo8627o(Bitmap bitmap) {
            this.f8542b = bitmap;
            return this;
        }

        /* renamed from: p */
        public C2730b mo8628p(String str) {
            this.f8545e = str;
            return this;
        }

        /* renamed from: q */
        public C2730b mo8629q(Uri uri) {
            this.f8543c = uri;
            return this;
        }

        /* renamed from: r */
        public C2730b mo8630r(boolean z) {
            this.f8544d = z;
            return this;
        }
    }

    /* synthetic */ SharePhoto(C2730b bVar, C2729a aVar) {
        this(bVar);
    }

    /* renamed from: b */
    public Bitmap mo8614b() {
        return this.f8538e;
    }

    /* renamed from: d */
    public String mo8615d() {
        return this.f8541h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Uri mo8616e() {
        return this.f8539f;
    }

    /* renamed from: f */
    public boolean mo8617f() {
        return this.f8540g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f8538e, 0);
        parcel.writeParcelable(this.f8539f, 0);
        parcel.writeByte(this.f8540g ? (byte) 1 : 0);
        parcel.writeString(this.f8541h);
    }

    private SharePhoto(C2730b bVar) {
        super((ShareMedia.C2714a) bVar);
        this.f8538e = bVar.f8542b;
        this.f8539f = bVar.f8543c;
        this.f8540g = bVar.f8544d;
        this.f8541h = bVar.f8545e;
    }

    SharePhoto(Parcel parcel) {
        super(parcel);
        this.f8538e = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f8539f = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f8540g = parcel.readByte() != 0;
        this.f8541h = parcel.readString();
    }
}

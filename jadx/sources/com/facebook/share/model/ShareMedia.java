package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public abstract class ShareMedia implements ShareModel {

    /* renamed from: d */
    private final Bundle f8501d;

    /* renamed from: com.facebook.share.model.ShareMedia$a */
    public static abstract class C2714a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f8502a = new Bundle();

        /* renamed from: c */
        static List m10530c(Parcel parcel) {
            Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
            ArrayList arrayList = new ArrayList(readParcelableArray.length);
            for (Parcelable parcelable : readParcelableArray) {
                arrayList.add((ShareMedia) parcelable);
            }
            return arrayList;
        }

        /* renamed from: b */
        public C2714a mo8558b(ShareMedia shareMedia) {
            return shareMedia == null ? this : mo8559d(shareMedia.mo8555a());
        }

        /* renamed from: d */
        public C2714a mo8559d(Bundle bundle) {
            this.f8502a.putAll(bundle);
            return this;
        }
    }

    protected ShareMedia(C2714a aVar) {
        this.f8501d = new Bundle(aVar.f8502a);
    }

    /* renamed from: a */
    public Bundle mo8555a() {
        return new Bundle(this.f8501d);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f8501d);
    }

    ShareMedia(Parcel parcel) {
        this.f8501d = parcel.readBundle();
    }
}

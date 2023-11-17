package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class ShareMessengerGenericTemplateElement implements ShareModel {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateElement> CREATOR = new C2718a();

    /* renamed from: d */
    private final String f8511d;

    /* renamed from: e */
    private final String f8512e;

    /* renamed from: f */
    private final Uri f8513f;

    /* renamed from: g */
    private final ShareMessengerActionButton f8514g;

    /* renamed from: h */
    private final ShareMessengerActionButton f8515h;

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateElement$a */
    static class C2718a implements Parcelable.Creator {
        C2718a() {
        }

        /* renamed from: a */
        public ShareMessengerGenericTemplateElement createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateElement(parcel);
        }

        /* renamed from: b */
        public ShareMessengerGenericTemplateElement[] newArray(int i) {
            return new ShareMessengerGenericTemplateElement[i];
        }
    }

    ShareMessengerGenericTemplateElement(Parcel parcel) {
        this.f8511d = parcel.readString();
        this.f8512e = parcel.readString();
        this.f8513f = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        Class<ShareMessengerActionButton> cls = ShareMessengerActionButton.class;
        this.f8514g = (ShareMessengerActionButton) parcel.readParcelable(cls.getClassLoader());
        this.f8515h = (ShareMessengerActionButton) parcel.readParcelable(cls.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8511d);
        parcel.writeString(this.f8512e);
        parcel.writeParcelable(this.f8513f, i);
        parcel.writeParcelable(this.f8514g, i);
        parcel.writeParcelable(this.f8515h, i);
    }
}

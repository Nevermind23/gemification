package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class ShareMessengerGenericTemplateContent extends ShareContent<ShareMessengerGenericTemplateContent, Object> {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateContent> CREATOR = new C2716a();

    /* renamed from: j */
    private final boolean f8505j;

    /* renamed from: k */
    private final C2717b f8506k;

    /* renamed from: l */
    private final ShareMessengerGenericTemplateElement f8507l;

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateContent$a */
    static class C2716a implements Parcelable.Creator {
        C2716a() {
        }

        /* renamed from: a */
        public ShareMessengerGenericTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateContent(parcel);
        }

        /* renamed from: b */
        public ShareMessengerGenericTemplateContent[] newArray(int i) {
            return new ShareMessengerGenericTemplateContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateContent$b */
    public enum C2717b {
        HORIZONTAL,
        SQUARE
    }

    ShareMessengerGenericTemplateContent(Parcel parcel) {
        super(parcel);
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f8505j = z;
        this.f8506k = (C2717b) parcel.readSerializable();
        this.f8507l = (ShareMessengerGenericTemplateElement) parcel.readParcelable(ShareMessengerGenericTemplateElement.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f8505j ? (byte) 1 : 0);
        parcel.writeSerializable(this.f8506k);
        parcel.writeParcelable(this.f8507l, i);
    }
}

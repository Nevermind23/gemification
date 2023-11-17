package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class ShareMessengerMediaTemplateContent extends ShareContent<ShareMessengerMediaTemplateContent, Object> {
    public static final Parcelable.Creator<ShareMessengerMediaTemplateContent> CREATOR = new C2719a();

    /* renamed from: j */
    private final C2720b f8516j;

    /* renamed from: k */
    private final String f8517k;

    /* renamed from: l */
    private final Uri f8518l;

    /* renamed from: m */
    private final ShareMessengerActionButton f8519m;

    /* renamed from: com.facebook.share.model.ShareMessengerMediaTemplateContent$a */
    static class C2719a implements Parcelable.Creator {
        C2719a() {
        }

        /* renamed from: a */
        public ShareMessengerMediaTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerMediaTemplateContent(parcel);
        }

        /* renamed from: b */
        public ShareMessengerMediaTemplateContent[] newArray(int i) {
            return new ShareMessengerMediaTemplateContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerMediaTemplateContent$b */
    public enum C2720b {
        IMAGE,
        VIDEO
    }

    ShareMessengerMediaTemplateContent(Parcel parcel) {
        super(parcel);
        this.f8516j = (C2720b) parcel.readSerializable();
        this.f8517k = parcel.readString();
        this.f8518l = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f8519m = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f8516j);
        parcel.writeString(this.f8517k);
        parcel.writeParcelable(this.f8518l, i);
        parcel.writeParcelable(this.f8519m, i);
    }
}

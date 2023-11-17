package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;

public class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Object> {
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new C2710a();

    /* renamed from: j */
    private String f8486j;

    /* renamed from: k */
    private CameraEffectArguments f8487k;

    /* renamed from: l */
    private CameraEffectTextures f8488l;

    /* renamed from: com.facebook.share.model.ShareCameraEffectContent$a */
    static class C2710a implements Parcelable.Creator {
        C2710a() {
        }

        /* renamed from: a */
        public ShareCameraEffectContent createFromParcel(Parcel parcel) {
            return new ShareCameraEffectContent(parcel);
        }

        /* renamed from: b */
        public ShareCameraEffectContent[] newArray(int i) {
            return new ShareCameraEffectContent[i];
        }
    }

    ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        this.f8486j = parcel.readString();
        this.f8487k = new CameraEffectArguments.C2704b().mo8516c(parcel).mo8515b();
        this.f8488l = new CameraEffectTextures.C2706b().mo8525c(parcel).mo8524b();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8486j);
        parcel.writeParcelable(this.f8487k, 0);
        parcel.writeParcelable(this.f8488l, 0);
    }
}

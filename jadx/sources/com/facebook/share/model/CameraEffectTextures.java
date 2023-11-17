package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class CameraEffectTextures implements ShareModel {
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new C2705a();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Bundle f8469d;

    /* renamed from: com.facebook.share.model.CameraEffectTextures$a */
    static class C2705a implements Parcelable.Creator {
        C2705a() {
        }

        /* renamed from: a */
        public CameraEffectTextures createFromParcel(Parcel parcel) {
            return new CameraEffectTextures(parcel);
        }

        /* renamed from: b */
        public CameraEffectTextures[] newArray(int i) {
            return new CameraEffectTextures[i];
        }
    }

    /* renamed from: com.facebook.share.model.CameraEffectTextures$b */
    public static class C2706b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f8470a = new Bundle();

        /* renamed from: b */
        public CameraEffectTextures mo8524b() {
            return new CameraEffectTextures(this, (C2705a) null);
        }

        /* renamed from: c */
        public C2706b mo8525c(Parcel parcel) {
            return mo8526d((CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader()));
        }

        /* renamed from: d */
        public C2706b mo8526d(CameraEffectTextures cameraEffectTextures) {
            if (cameraEffectTextures != null) {
                this.f8470a.putAll(cameraEffectTextures.f8469d);
            }
            return this;
        }
    }

    /* synthetic */ CameraEffectTextures(C2706b bVar, C2705a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f8469d);
    }

    private CameraEffectTextures(C2706b bVar) {
        this.f8469d = bVar.f8470a;
    }

    CameraEffectTextures(Parcel parcel) {
        this.f8469d = parcel.readBundle(getClass().getClassLoader());
    }
}

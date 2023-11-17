package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class CameraEffectArguments implements ShareModel {
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new C2703a();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Bundle f8467d;

    /* renamed from: com.facebook.share.model.CameraEffectArguments$a */
    static class C2703a implements Parcelable.Creator {
        C2703a() {
        }

        /* renamed from: a */
        public CameraEffectArguments createFromParcel(Parcel parcel) {
            return new CameraEffectArguments(parcel);
        }

        /* renamed from: b */
        public CameraEffectArguments[] newArray(int i) {
            return new CameraEffectArguments[i];
        }
    }

    /* renamed from: com.facebook.share.model.CameraEffectArguments$b */
    public static class C2704b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f8468a = new Bundle();

        /* renamed from: b */
        public CameraEffectArguments mo8515b() {
            return new CameraEffectArguments(this, (C2703a) null);
        }

        /* renamed from: c */
        public C2704b mo8516c(Parcel parcel) {
            return mo8517d((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }

        /* renamed from: d */
        public C2704b mo8517d(CameraEffectArguments cameraEffectArguments) {
            if (cameraEffectArguments != null) {
                this.f8468a.putAll(cameraEffectArguments.f8467d);
            }
            return this;
        }
    }

    /* synthetic */ CameraEffectArguments(C2704b bVar, C2703a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f8467d);
    }

    private CameraEffectArguments(C2704b bVar) {
        this.f8467d = bVar.f8468a;
    }

    CameraEffectArguments(Parcel parcel) {
        this.f8467d = parcel.readBundle(getClass().getClassLoader());
    }
}

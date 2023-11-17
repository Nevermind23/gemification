package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.ShareOpenGraphValueContainer.C2728a;
import java.util.Set;

public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends C2728a> implements ShareModel {

    /* renamed from: d */
    private final Bundle f8536d;

    /* renamed from: com.facebook.share.model.ShareOpenGraphValueContainer$a */
    public static abstract class C2728a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f8537a = new Bundle();

        /* renamed from: b */
        public C2728a mo8612b(String str, String str2) {
            this.f8537a.putString(str, str2);
            return this;
        }

        /* renamed from: c */
        public C2728a mo8613c(ShareOpenGraphValueContainer shareOpenGraphValueContainer) {
            if (shareOpenGraphValueContainer != null) {
                this.f8537a.putAll(shareOpenGraphValueContainer.mo8607b());
            }
            return this;
        }
    }

    protected ShareOpenGraphValueContainer(C2728a aVar) {
        this.f8536d = (Bundle) aVar.f8537a.clone();
    }

    /* renamed from: a */
    public Object mo8606a(String str) {
        return this.f8536d.get(str);
    }

    /* renamed from: b */
    public Bundle mo8607b() {
        return (Bundle) this.f8536d.clone();
    }

    /* renamed from: d */
    public String mo8608d(String str) {
        return this.f8536d.getString(str);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Set mo8610e() {
        return this.f8536d.keySet();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f8536d);
    }

    ShareOpenGraphValueContainer(Parcel parcel) {
        this.f8536d = parcel.readBundle(C2728a.class.getClassLoader());
    }
}

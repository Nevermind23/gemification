package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphValueContainer;

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, C2725b> {
    public static final Parcelable.Creator<ShareOpenGraphAction> CREATOR = new C2724a();

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$a */
    static class C2724a implements Parcelable.Creator {
        C2724a() {
        }

        /* renamed from: a */
        public ShareOpenGraphAction createFromParcel(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }

        /* renamed from: b */
        public ShareOpenGraphAction[] newArray(int i) {
            return new ShareOpenGraphAction[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$b */
    public static final class C2725b extends ShareOpenGraphValueContainer.C2728a {
        /* renamed from: d */
        public ShareOpenGraphAction mo8593d() {
            return new ShareOpenGraphAction(this, (C2724a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C2725b mo8594e(Parcel parcel) {
            return mo8595f((ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
        }

        /* renamed from: f */
        public C2725b mo8595f(ShareOpenGraphAction shareOpenGraphAction) {
            return shareOpenGraphAction == null ? this : ((C2725b) super.mo8613c(shareOpenGraphAction)).mo8596g(shareOpenGraphAction.mo8588f());
        }

        /* renamed from: g */
        public C2725b mo8596g(String str) {
            mo8612b("og:type", str);
            return this;
        }
    }

    /* synthetic */ ShareOpenGraphAction(C2725b bVar, C2724a aVar) {
        this(bVar);
    }

    /* renamed from: f */
    public String mo8588f() {
        return mo8608d("og:type");
    }

    private ShareOpenGraphAction(C2725b bVar) {
        super((ShareOpenGraphValueContainer.C2728a) bVar);
    }

    ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }
}

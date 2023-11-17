package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public class ServerPushProvisionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ServerPushProvisionRequest> CREATOR = new C4893f();

    /* renamed from: d */
    private final PushProvisionSessionContext f15331d;

    /* renamed from: e */
    private final String f15332e;

    /* renamed from: f */
    private final UserAddress f15333f;

    /* renamed from: g */
    private final ExtraOptions f15334g;

    public static class ExtraOptions extends AbstractSafeParcelable implements ReflectedParcelable {
        public static final Parcelable.Creator<ExtraOptions> CREATOR = new C4889b();

        /* renamed from: d */
        private boolean f15335d;

        public ExtraOptions(boolean z) {
            this.f15335d = z;
        }

        /* renamed from: v */
        public static ExtraOptions m18511v() {
            return new ExtraOptions(false);
        }

        /* renamed from: w */
        public boolean mo15176w() {
            return this.f15335d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C7461a.m28369a(parcel);
            C7461a.m28372d(parcel, 1, mo15176w());
            C7461a.m28370b(parcel, a);
        }
    }

    ServerPushProvisionRequest(PushProvisionSessionContext pushProvisionSessionContext, String str, UserAddress userAddress, ExtraOptions extraOptions) {
        this.f15331d = pushProvisionSessionContext;
        this.f15332e = str;
        this.f15333f = userAddress;
        this.f15334g = extraOptions;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 1, this.f15331d, i, false);
        C7461a.m28392x(parcel, 2, this.f15332e, false);
        C7461a.m28390v(parcel, 3, this.f15333f, i, false);
        C7461a.m28390v(parcel, 4, this.f15334g, i, false);
        C7461a.m28370b(parcel, a);
    }
}

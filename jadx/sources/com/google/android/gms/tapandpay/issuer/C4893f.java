package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest;

/* renamed from: com.google.android.gms.tapandpay.issuer.f */
public final class C4893f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        ServerPushProvisionRequest.ExtraOptions v = ServerPushProvisionRequest.ExtraOptions.m18511v();
        PushProvisionSessionContext pushProvisionSessionContext = null;
        String str = null;
        UserAddress userAddress = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                pushProvisionSessionContext = (PushProvisionSessionContext) SafeParcelReader.m15143o(parcel, E, PushProvisionSessionContext.CREATOR);
            } else if (w == 2) {
                str = SafeParcelReader.m15144p(parcel, E);
            } else if (w == 3) {
                userAddress = (UserAddress) SafeParcelReader.m15143o(parcel, E, UserAddress.CREATOR);
            } else if (w != 4) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                v = (ServerPushProvisionRequest.ExtraOptions) SafeParcelReader.m15143o(parcel, E, ServerPushProvisionRequest.ExtraOptions.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new ServerPushProvisionRequest(pushProvisionSessionContext, str, userAddress, v);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ServerPushProvisionRequest[i];
    }
}

package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.globalactions.b */
public final class C4882b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        GlobalActionCard[] globalActionCardArr = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                globalActionCardArr = (GlobalActionCard[]) SafeParcelReader.m15148t(parcel, E, GlobalActionCard.CREATOR);
            } else if (w != 2) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                i = SafeParcelReader.m15118G(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new GetGlobalActionCardsResponse(globalActionCardArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetGlobalActionCardsResponse[i];
    }
}

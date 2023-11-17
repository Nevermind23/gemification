package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fido.fido2.api.common.k */
public final class C4042k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            if (SafeParcelReader.m15151w(E) != 1) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                arrayList = SafeParcelReader.m15149u(parcel, E, UvmEntry.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new UvmEntries(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UvmEntries[i];
    }
}

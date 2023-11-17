package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.location.j */
public final class C4082j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        ArrayList arrayList = zzbf.f13098o;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        long j = Long.MAX_VALUE;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w != 1) {
                switch (w) {
                    case 5:
                        arrayList = SafeParcelReader.m15149u(parcel2, E, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        str = SafeParcelReader.m15144p(parcel2, E);
                        break;
                    case 7:
                        z = SafeParcelReader.m15152x(parcel2, E);
                        break;
                    case 8:
                        z2 = SafeParcelReader.m15152x(parcel2, E);
                        break;
                    case 9:
                        z3 = SafeParcelReader.m15152x(parcel2, E);
                        break;
                    case 10:
                        str2 = SafeParcelReader.m15144p(parcel2, E);
                        break;
                    case 11:
                        z4 = SafeParcelReader.m15152x(parcel2, E);
                        break;
                    case 12:
                        z5 = SafeParcelReader.m15152x(parcel2, E);
                        break;
                    case 13:
                        str3 = SafeParcelReader.m15144p(parcel2, E);
                        break;
                    case 14:
                        j = SafeParcelReader.m15121J(parcel2, E);
                        break;
                    default:
                        SafeParcelReader.m15125N(parcel2, E);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.m15143o(parcel2, E, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new zzbf(locationRequest, arrayList, str, z, z2, z3, str2, z4, z5, str3, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbf[i];
    }
}

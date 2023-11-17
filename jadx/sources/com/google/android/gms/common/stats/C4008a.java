package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.stats.a */
public final class C4008a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    i = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 2:
                    j = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 4:
                    str = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 5:
                    i3 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m15146r(parcel2, E);
                    break;
                case 8:
                    j2 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 10:
                    str3 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 11:
                    i2 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 12:
                    str2 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 13:
                    str4 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 14:
                    i4 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 15:
                    f = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 16:
                    j3 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 17:
                    str5 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 18:
                    z = SafeParcelReader.m15152x(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}

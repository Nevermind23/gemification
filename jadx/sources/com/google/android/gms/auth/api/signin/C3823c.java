package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.c */
public final class C3823c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    i = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 2:
                    str = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 3:
                    str2 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 4:
                    str3 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 5:
                    str4 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.m15143o(parcel2, E, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 8:
                    j = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 9:
                    str6 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 10:
                    arrayList = SafeParcelReader.m15149u(parcel2, E, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 12:
                    str8 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}

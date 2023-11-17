package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.e */
public final class C3825e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    i = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m15149u(parcel, E, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m15143o(parcel, E, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 5:
                    z2 = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 6:
                    z3 = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 7:
                    str = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 8:
                    str2 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m15149u(parcel, E, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = SafeParcelReader.m15144p(parcel, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}

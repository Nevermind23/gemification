package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.tapandpay.firstparty.j */
public final class C4877j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        TokenStatus tokenStatus = null;
        String str4 = null;
        Uri uri = null;
        zzaj zzaj = null;
        String str5 = null;
        zzaz zzaz = null;
        String str6 = null;
        byte[] bArr2 = null;
        zzah zzah = null;
        zzaf zzaf = null;
        String str7 = null;
        zzan[] zzanArr = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        zze zze = null;
        String str10 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        int i8 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 2:
                    str = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 3:
                    bArr = SafeParcelReader.m15135g(parcel2, E);
                    break;
                case 4:
                    str2 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 5:
                    str3 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 6:
                    i = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 7:
                    tokenStatus = (TokenStatus) SafeParcelReader.m15143o(parcel2, E, TokenStatus.CREATOR);
                    break;
                case 8:
                    str4 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 9:
                    uri = (Uri) SafeParcelReader.m15143o(parcel2, E, Uri.CREATOR);
                    break;
                case 10:
                    i2 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 11:
                    i3 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 12:
                    zzaj = (zzaj) SafeParcelReader.m15143o(parcel2, E, zzaj.CREATOR);
                    break;
                case 13:
                    str5 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 15:
                    zzaz = (zzaz) SafeParcelReader.m15143o(parcel2, E, zzaz.CREATOR);
                    break;
                case 16:
                    str6 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 17:
                    bArr2 = SafeParcelReader.m15135g(parcel2, E);
                    break;
                case 18:
                    i4 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 20:
                    i5 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 21:
                    i6 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 22:
                    zzah = (zzah) SafeParcelReader.m15143o(parcel2, E, zzah.CREATOR);
                    break;
                case 23:
                    zzaf = (zzaf) SafeParcelReader.m15143o(parcel2, E, zzaf.CREATOR);
                    break;
                case 24:
                    str7 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 25:
                    zzanArr = (zzan[]) SafeParcelReader.m15148t(parcel2, E, zzan.CREATOR);
                    break;
                case 26:
                    z = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 27:
                    arrayList = SafeParcelReader.m15149u(parcel2, E, zzb.CREATOR);
                    break;
                case 28:
                    z2 = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 29:
                    z3 = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 30:
                    j = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 31:
                    j2 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 32:
                    z4 = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 33:
                    j3 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 34:
                    str8 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 35:
                    str9 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 36:
                    zze = (zze) SafeParcelReader.m15143o(parcel2, E, zze.CREATOR);
                    break;
                case 37:
                    i7 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 38:
                    z5 = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 39:
                    str10 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 40:
                    i8 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new CardInfo(str, bArr, str2, str3, i, tokenStatus, str4, uri, i2, i3, zzaj, str5, zzaz, str6, bArr2, i4, i5, i6, zzah, zzaf, str7, zzanArr, z, arrayList, z2, z3, j, j2, z4, j3, str8, str9, zze, i7, z5, str10, i8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CardInfo[i];
    }
}

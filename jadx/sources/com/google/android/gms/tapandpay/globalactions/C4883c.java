package com.google.android.gms.tapandpay.globalactions;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.globalactions.c */
public final class C4883c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        String str = null;
        Bitmap bitmap = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bitmap bitmap2 = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    i = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 2:
                    str = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 3:
                    bitmap = (Bitmap) SafeParcelReader.m15143o(parcel, E, Bitmap.CREATOR);
                    break;
                case 4:
                    str2 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 5:
                    str3 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 6:
                    bitmap2 = (Bitmap) SafeParcelReader.m15143o(parcel, E, Bitmap.CREATOR);
                    break;
                case 7:
                    pendingIntent = (PendingIntent) SafeParcelReader.m15143o(parcel, E, PendingIntent.CREATOR);
                    break;
                case 8:
                    str4 = SafeParcelReader.m15144p(parcel, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new GlobalActionCard(i, str, bitmap, str2, str3, str4, bitmap2, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GlobalActionCard[i];
    }
}

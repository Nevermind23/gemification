package p117i6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: i6.c */
public final class C6574c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            if (SafeParcelReader.m15151w(E) != 1) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                intent = (Intent) SafeParcelReader.m15143o(parcel, E, Intent.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new CloudMessage(intent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CloudMessage[i];
    }
}

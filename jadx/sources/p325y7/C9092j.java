package p325y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.zzj;

/* renamed from: y7.j */
public final class C9092j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        AccountInfo accountInfo = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            if (SafeParcelReader.m15151w(E) != 2) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                accountInfo = (AccountInfo) SafeParcelReader.m15143o(parcel, E, AccountInfo.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzj(accountInfo);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}

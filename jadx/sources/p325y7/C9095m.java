package p325y7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.zzp;

/* renamed from: y7.m */
public final class C9095m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        CardInfo[] cardInfoArr = null;
        AccountInfo accountInfo = null;
        String str = null;
        String str2 = null;
        SparseArray sparseArray = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 2:
                    cardInfoArr = (CardInfo[]) SafeParcelReader.m15148t(parcel, E, CardInfo.CREATOR);
                    break;
                case 3:
                    accountInfo = (AccountInfo) SafeParcelReader.m15143o(parcel, E, AccountInfo.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 5:
                    str2 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 6:
                    sparseArray = SafeParcelReader.m15147s(parcel, E);
                    break;
                case 7:
                    bArr = SafeParcelReader.m15135g(parcel, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzp(cardInfoArr, accountInfo, str, str2, sparseArray, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzp[i];
    }
}

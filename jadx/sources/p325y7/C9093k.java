package p325y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.zzl;

/* renamed from: y7.k */
public final class C9093k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        CardInfo[] cardInfoArr = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            if (SafeParcelReader.m15151w(E) != 2) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                cardInfoArr = (CardInfo[]) SafeParcelReader.m15148t(parcel, E, CardInfo.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzl(cardInfoArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}

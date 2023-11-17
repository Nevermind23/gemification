package p325y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;

/* renamed from: y7.g */
public final class C9089g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 2:
                    str = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 3:
                    bArr = SafeParcelReader.m15135g(parcel, E);
                    break;
                case 4:
                    i = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 5:
                    i2 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 6:
                    str2 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 7:
                    str3 = SafeParcelReader.m15144p(parcel, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new RetrieveInAppPaymentCredentialResponse(str, bArr, i, i2, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RetrieveInAppPaymentCredentialResponse[i];
    }
}

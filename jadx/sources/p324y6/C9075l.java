package p324y6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;

/* renamed from: y6.l */
public final class C9075l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        byte[] bArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 2) {
                bArr = SafeParcelReader.m15135g(parcel, E);
            } else if (w == 3) {
                str = SafeParcelReader.m15144p(parcel, E);
            } else if (w == 4) {
                str2 = SafeParcelReader.m15144p(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                str3 = SafeParcelReader.m15144p(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new PublicKeyCredentialUserEntity(bArr, str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialUserEntity[i];
    }
}

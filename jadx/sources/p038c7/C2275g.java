package p038c7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p043authapi.zbp;

/* renamed from: c7.g */
public final class C2275g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            if (SafeParcelReader.m15151w(E) != 1) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                credential = (Credential) SafeParcelReader.m15143o(parcel, E, Credential.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zbp(credential);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zbp[i];
    }
}

package p183n7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationSettingsStates;

/* renamed from: n7.f0 */
public final class C7307f0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    z = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 2:
                    z2 = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 3:
                    z3 = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 4:
                    z4 = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 5:
                    z5 = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 6:
                    z6 = SafeParcelReader.m15152x(parcel, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new LocationSettingsStates(z, z2, z3, z4, z5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}

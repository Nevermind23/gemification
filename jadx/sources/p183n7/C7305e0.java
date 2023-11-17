package p183n7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;

/* renamed from: n7.e0 */
public final class C7305e0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                status = (Status) SafeParcelReader.m15143o(parcel, E, Status.CREATOR);
            } else if (w != 2) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                locationSettingsStates = (LocationSettingsStates) SafeParcelReader.m15143o(parcel, E, LocationSettingsStates.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}

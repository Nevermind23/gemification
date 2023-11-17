package p183n7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.ArrayList;

/* renamed from: n7.o0 */
public final class C7325o0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        ArrayList arrayList = null;
        String str = null;
        ArrayList arrayList2 = null;
        String str2 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                arrayList = SafeParcelReader.m15149u(parcel, E, ActivityTransition.CREATOR);
            } else if (w == 2) {
                str = SafeParcelReader.m15144p(parcel, E);
            } else if (w == 3) {
                arrayList2 = SafeParcelReader.m15149u(parcel, E, ClientIdentity.CREATOR);
            } else if (w != 4) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                str2 = SafeParcelReader.m15144p(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new ActivityTransitionRequest(arrayList, str, arrayList2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionRequest[i];
    }
}

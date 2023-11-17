package p183n7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

/* renamed from: n7.m0 */
public final class C7321m0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                arrayList = SafeParcelReader.m15149u(parcel, E, DetectedActivity.CREATOR);
            } else if (w == 2) {
                j = SafeParcelReader.m15121J(parcel, E);
            } else if (w == 3) {
                j2 = SafeParcelReader.m15121J(parcel, E);
            } else if (w == 4) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                bundle = SafeParcelReader.m15134f(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new ActivityRecognitionResult(arrayList, j, j2, i, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}

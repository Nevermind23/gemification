package p183n7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.SleepClassifyEvent;

/* renamed from: n7.i0 */
public final class C7313i0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        int i8 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    i = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 2:
                    i2 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 3:
                    i3 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 4:
                    i4 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 5:
                    i5 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 6:
                    i6 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 7:
                    i7 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 8:
                    z = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 9:
                    i8 = SafeParcelReader.m15118G(parcel, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new SleepClassifyEvent(i, i2, i3, i4, i5, i6, i7, z, i8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SleepClassifyEvent[i];
    }
}

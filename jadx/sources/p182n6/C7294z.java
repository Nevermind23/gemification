package p182n6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: n6.z */
public final class C7294z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        int i5 = -1;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    i = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 2:
                    i2 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 3:
                    i3 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 4:
                    j = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 5:
                    j2 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 6:
                    str = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 7:
                    str2 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 8:
                    i4 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 9:
                    i5 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new MethodInvocation(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}

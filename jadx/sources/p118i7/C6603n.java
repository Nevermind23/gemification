package p118i7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzbj;

/* renamed from: i7.n */
public final class C6603n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        int i = 0;
        short s = 0;
        int i2 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        float f = 0.0f;
        long j = 0;
        int i3 = -1;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    str = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 2:
                    j = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 3:
                    s = SafeParcelReader.m15123L(parcel2, E);
                    break;
                case 4:
                    d = SafeParcelReader.m15112A(parcel2, E);
                    break;
                case 5:
                    d2 = SafeParcelReader.m15112A(parcel2, E);
                    break;
                case 6:
                    f = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 7:
                    i = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 8:
                    i2 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 9:
                    i3 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new zzbj(str, i, s, d, d2, f, j, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbj[i];
    }
}

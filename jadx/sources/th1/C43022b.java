package th1;

import android.os.Parcel;
import org.parceler.C42041g;

/* renamed from: th1.b */
public class C43022b implements C42041g {
    /* renamed from: c */
    public boolean[] mo88107a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        boolean[] zArr = new boolean[readInt];
        parcel.readBooleanArray(zArr);
        return zArr;
    }

    /* renamed from: d */
    public void mo88108b(boolean[] zArr, Parcel parcel) {
        if (zArr == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(zArr.length);
        parcel.writeBooleanArray(zArr);
    }
}

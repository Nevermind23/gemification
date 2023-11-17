package th1;

import android.os.Parcel;
import org.parceler.C42041g;

/* renamed from: th1.c */
public class C43023c implements C42041g {
    /* renamed from: c */
    public char[] mo88107a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        char[] cArr = new char[readInt];
        parcel.readCharArray(cArr);
        return cArr;
    }

    /* renamed from: d */
    public void mo88108b(char[] cArr, Parcel parcel) {
        if (cArr == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(cArr.length);
        parcel.writeCharArray(cArr);
    }
}

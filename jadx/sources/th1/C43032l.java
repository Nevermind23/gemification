package th1;

import android.os.Parcel;
import android.util.SparseArray;
import org.parceler.C42041g;

/* renamed from: th1.l */
public abstract class C43032l implements C42041g {
    /* renamed from: c */
    public SparseArray mo88107a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        SparseArray sparseArray = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            sparseArray.append(parcel.readInt(), mo97443d(parcel));
        }
        return sparseArray;
    }

    /* renamed from: d */
    public abstract Object mo97443d(Parcel parcel);

    /* renamed from: e */
    public abstract void mo97444e(Object obj, Parcel parcel);

    /* renamed from: f */
    public void mo88108b(SparseArray sparseArray, Parcel parcel) {
        if (sparseArray == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            parcel.writeInt(sparseArray.keyAt(i));
            mo97444e(sparseArray.valueAt(i), parcel);
        }
    }
}

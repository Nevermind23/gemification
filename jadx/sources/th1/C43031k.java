package th1;

import android.os.Parcel;
import org.parceler.C42041g;

/* renamed from: th1.k */
public abstract class C43031k implements C42041g {
    /* renamed from: a */
    public Object mo88107a(Parcel parcel) {
        if (parcel.readInt() == -1) {
            return null;
        }
        return mo97342c(parcel);
    }

    /* renamed from: b */
    public void mo88108b(Object obj, Parcel parcel) {
        if (obj == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(1);
        mo97343d(obj, parcel);
    }

    /* renamed from: c */
    public abstract Object mo97342c(Parcel parcel);

    /* renamed from: d */
    public abstract void mo97343d(Object obj, Parcel parcel);
}

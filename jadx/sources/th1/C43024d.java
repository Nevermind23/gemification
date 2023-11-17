package th1;

import android.os.Parcel;
import java.util.Collection;
import org.parceler.C42041g;

/* renamed from: th1.d */
public abstract class C43024d implements C42041g {
    /* renamed from: c */
    public abstract Collection mo101607c();

    /* renamed from: d */
    public Collection mo88107a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        Collection c = mo101607c();
        for (int i = 0; i < readInt; i++) {
            c.add(mo97372e(parcel));
        }
        return c;
    }

    /* renamed from: e */
    public abstract Object mo97372e(Parcel parcel);

    /* renamed from: f */
    public abstract void mo97373f(Object obj, Parcel parcel);

    /* renamed from: g */
    public void mo88108b(Collection collection, Parcel parcel) {
        if (collection == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(collection.size());
        for (Object f : collection) {
            mo97373f(f, parcel);
        }
    }
}
